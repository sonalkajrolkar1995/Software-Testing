package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int [] arr1={1,2};
        String str= "sonal";
        System.out.println("Hello Sonal!   "+ Arrays.toString(arr1));
        System.out.print(str);
        System.out.println("  Amigo    ");
        System.out.print("Is The    ");
        System.out.print("Best      ");
        Scanner sona=new Scanner(System.in);
        System.out.print("Enter a string:");
        String strww=sona.nextLine();
        System.out.println("you have entered :"+strww);
        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}