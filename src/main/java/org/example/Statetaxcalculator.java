/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;


public class Statetaxcalculator {
    public static void main(String[] args) {
        Statetaxcalculator Calculator = new Statetaxcalculator();

        Scanner input = new Scanner(System.in);
        double tax = 0;
        double countytax = 0;
        double total = 0;

        System.out.print("What is your order amount? ");
        String orderString = input.nextLine();

        double order = Double.parseDouble(orderString);

        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        if(state.equals("Wisconsin") || state.equals("wisconsin")){
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(county.equals("Eau Claire") || county.equals("eau claire") || county.equals("Eau claire")){
                countytax = order * 0.005;
            }
            else if(county.equals("Dunn") || county.equals("dunn")) {
                countytax = order * 0.004;
            }
            tax = countytax + order * .05;
            total = Calculator.roundnumber(tax + order);
            System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, total);
        }
        else if(state.equals("Illinois") || state.equals("illinois")){
            tax = order * .08;
            total = Calculator.roundnumber(tax + order);
            System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, tax + order);
        }
        else {
            System.out.printf("The total is $%.2f", tax + order);
        }
    }


    private double roundnumber(double tax) {
        double roundednumber = ((Math.ceil(tax * 100)) / 100);
        return roundednumber;
    }
}

