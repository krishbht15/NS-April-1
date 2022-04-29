package com.company.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.print("I'm the first line.");
//        System.out.print("I'm the second one.");
//        System.out.println("I'm the third one.");
//        System.out.println(5 + 8);
//        System.out.println(4 * 9);
//        System.out.println(10 - 5);
//        System.out.println(10 / 2);
//        System.out.println(10%3);
//        int a = 10;
//        int b = 5;
//        int c = a + b;
//        long max = 21474836475l;
//        float random = 10 / 3;
//        double dd = 4.5;
//        boolean bool = false;
//        char as = '=';
//        int equalsToUnicodeValue = '=';
//        char unicodeEqualsTo = 61;
//        char smallOo = 'उ';
//        int uniCodeValueSmallOo = 'उ';
//        char unicodeSmallOo = 2313;
//        String s = "Hello Newton School";
//        System.out.println(s);
//
//        Scanner ss = new Scanner(System.in);
//        int i = ss.nextInt();
//        System.out.println(i);
//        float f = ss.nextFloat();
//        System.out.println(f);
//        String si = ss.nextLine();
//        System.out.println(si);

//        int y = 15;
//        int z = 45;
//        System.out.println(y);
//        System.out.println(z);
//        int x = y;
//        y = z;
//        z = x;
//        System.out.println("After swapping");
//        System.out.println(y);
//        System.out.println(z);
//        int aa = 10;
//        aa++;
//        System.out.println(aa);
//        aa--;
//        System.out.println(aa);
//        System.out.println(aa--);
//        System.out.println(aa);
//        System.out.println(15>10);
//        System.out.println(9>17);
//        System.out.println(14<=(28/2));
//        System.out.println(14<(28/2));
//        System.out.println(15 == (30 / 2));
//        System.out.println(15 != (30 / 2));
//        boolean bb = true;
//        System.out.println(!bb);
//        System.out.println(15 > 10 && 15 > 23);
//        System.out.println(15 > 10 || 15 > 23);

//        int temp = 56;
//        if(temp<15){
//            System.out.println("Less than 15");
//        }else if(temp<25) {
//            System.out.println("Less than 25");
//        }else{
//            System.out.println("More than 25");
//        }
//
//        int f = 613;
//        if (f % 3 == 0) {
//            System.out.println("Divisible by 3");
//        } else if (f % 5 == 0) {
//            System.out.println("Divisible by 5");
//        } else if (f % 7 == 0) {
//            System.out.println("Divisible by 7");
//        } else {
//            System.out.println("Maybe a prime number?");
//        }
//
//        int yy = 11;
//        int ans = yy % 5 == 0 ? 1 : 0;
//        System.out.println(ans);

//        int a = 50;
//        switch (a) {
//            case 4: {
//                System.out.println("Case 4 executed");
//                break;
//            }
//            case 5: {
//                System.out.println("Case 5 executed");
//                break;
//            }
//            default: {
//                System.out.println("i'm default");
//                break;
//            }
//            case 6: {
//                System.out.println("Case 6 executed");
//                break;
//            }
//            case 1: {
//                System.out.println("Case 1 executed");
//                break;
//            }
//            case 2: {
//                System.out.println("Case 2 executed");
//                break;
//            }
//            case 3: {
//                System.out.println("Case 3 executed");
//                break;
//            }
//        }
//

//        for (int i = 0; i < 10; i++) {
//            System.out.println("The current i = " + i);
//        }


//        doWhileUsage();
        int n = 10;
        System.out.println("current value of n is " + n);
        randomStuffOfMethods(n);
        System.out.println("New value of n is " + n);
        double roundOff = Math.round(2.333333333 * 100.0) / 100.0;
        System.out.println(roundOff);
        int m=15;
        int sumRes = sum(n,m);
        System.out.println("The sum is " + sumRes);
    }

    public static void randomStuffOfMethods(int a) {
        a++;
        System.out.println("value of n inside method "+a);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void doWhileUsage() {
        int i = 10;
        do {
            System.out.println("Do i = " + i);
        } while (++i < 10);
    }

}
