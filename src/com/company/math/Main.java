package com.company.math;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeOptimized(19));
        System.out.println(reverseTheNumber(145963));
        int[] arr = {4, 1, 2, 3, 5, 6};
//        reverseArray(arr);
        rotateK(arr, 2);
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String isPrimeOptimized(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n == 0 || n == 1) {
            return "Not a Prime";
        }
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return "Not a prime";
            }
        }
        return "Prime";
    }

    public static int reverseTheNumber(int n) {
        int ans = 0;
        while (n != 0) {
            int last = n % 10;
            ans = (ans * 10) + last;
            n = n / 10;
        }
        return ans;
    }

    public static void reverseArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateK(int[] arr, int k) {
        int updatedK = k % arr.length;
        for (int i = 0; i < updatedK; i++) {
            rotateArray(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
