package com.company;

import java.util.Scanner;

public class Main {
    static public String z2(int x){
        String str = "";
        if(x > 1){
            str += z2(x - 1) + " " + x;
        } else {
            str = "" + x;
        }
        return str;
    }
    static public String z3(int x, int y){
        String str = "";
        if(x > y){
            str += z3(x, y + 1) + " " + y;
        } else if (x < y){
            str += x + " " + z3(x + 1, y);
        }
        else {
            str = "" + x;
        }
        return str;
    }
    static public int z5(int n){
        int x = 0;
        x += n % 10;
        if (n / 10 > 0){
            x += z5(n / 10);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2) n = ");
        System.out.println(z2(sc.nextInt()));
        System.out.print("3) a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println(z3(a, b));
        System.out.print("5) n = ");
        System.out.println("sum = " + z5(sc.nextInt()));
    }
}
