/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package org.example;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalculator {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);

        float subtotal, total;
        float taxRate = (float) 0.055;

        System.out.printf("What is the order amount? ");
        subtotal = input.nextFloat();
        System.out.printf("What is the state? ");
        String state = input.next();

        if (state.equals ("WI")){
            System.out.printf("The subtotal is $%.2f\n", subtotal);
            System.out.printf("The tax is $%.2f\n", subtotal*taxRate);
            System.out.printf("The total is $%.2f", subtotal+subtotal*taxRate);
        }
        else
            System.out.printf("The total is $%.2f", subtotal);
    }

}
