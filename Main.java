package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the array element at index "+i);
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the sum needed to be finded");
        int k = in.nextInt() ;
        System.out.println("The array has 2 elements with sum equal to "+k+"is "+TwoSum(arr,k));
    }

    public static String TwoSum(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(Math.abs(arr[i]-k))){
                return "true";
            }
            else{
                map.put(arr[i],1);
            }
        }

        return "false";
    }
}
