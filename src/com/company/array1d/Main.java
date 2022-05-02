package com.company.array1d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("All good.");
        //   0  1  2  3  4
        int[] arr = {12, 14, 2, 56, 73};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = s.nextInt();
//        }
//        printArray(arr);
//        int x=s.nextInt();
//        System.out.println(findIndex(arr,x));
//        System.out.println(arr[0]);
//        System.out.println(x);
        System.out.println(findLargest(arr));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int findIndex(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        arr[0]=-1;
        x++;
        return -1;
    }

    public static int findLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
}
