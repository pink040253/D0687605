package com.example;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;

/**
 * 範例主程式
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入三角形邊長 :");
        int a = 0;
        int b = 0;
        int c = 0;
        try { // exception
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error! They should be number!");
            scan.close();
            return;
        }
        scan.close();
        assert (a > 0 && b > 0 && c > 0) : "length error!"; // assertion
        assert (a + b > c || b + c > a || a + c > b) : "relation error";
        Main t = new Main();
        t.Main(a, b, c);
    }

    /**
    * checkTriangle：判斷三角形種類.
    */
    public int checkTriangle(int a, int b, int c) {
        System.out.printf("三角形邊長 : %d %d %d\n", a, b, c);
        if (standard(a, b, c)) {
        System.out.printf("一般三角形\n");
        return 1;
        } else if (right(a, b, c)) {
            System.out.printf("正三角形\n");
            return 2;
        } else if (isosceles(a, b, c)) {
            System.out.printf("等腰三角形\n");
            return 3;
        } else {
            assert false : "error";
            return 0;
        }
    }
    /**
    * standard：判斷是否為正三角形.
    */
    public boolean standard(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            return false;
        }
    }
    /**
    * right：判斷是否為直角三角形.
    */
    public boolean right(int a, int b, int c) {
        if (b * b + c * c == a * a || a * a + c * c == b * b || a * a + b * b == c
        * c) {
            return true;
        } else {
            return false;
        }
    }
    /**
    * isosceles：判斷是否為等腰三角形.
    */
    public boolean isosceles(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return true;
        } else {
            return false;
    }
 }
    
}
