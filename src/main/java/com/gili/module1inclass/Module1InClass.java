/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gili.module1inclass;

/**
 *
 * @author Gili
 */

import java.util.Scanner;

public class Module1InClass {

public static void main(String[] args) {
    Scanner numIn = new Scanner(System.in);
    System.out.println("Please enter a 5 digit number");
    int num = numIn.nextInt();
    int reversedDigits = 0;

    while (num > 0) {//Get the last digit and put it in the front
        int lastDigit = num % 10;
        reversedDigits = (reversedDigits * 10) + lastDigit;
        num = num / 10;
    }

    String outputDigits = "";
    for (int i = 0; i < 5; i++) {
        outputDigits = outputDigits + (reversedDigits % 10) + " ";
        reversedDigits = reversedDigits / 10;
    }
    System.out.println(outputDigits);
}


}
