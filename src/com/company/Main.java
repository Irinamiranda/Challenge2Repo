package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = number.nextInt();
        System.out.print(n + " ");
        int a = 0;



        while (n != 1) {
            //System.out.println(n);

            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
                a += 1;
            }
            else {
                n = (3 * n);
                        if (n %2 ==1) {
                    n = n + 1;
                            System.out.print(n + " ");
                        } else {
                    n = n / 2;
                            System.out.print(n + " ");
                        }
                a += 1;
            }
        }


    }
}