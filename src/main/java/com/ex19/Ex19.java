/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex19;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex19 {

    private static DecimalFormat df2 = new DecimalFormat("#.##"); //Formats BMI output to 2 decimal places

    public static void main(String[] args) {

        double heightInches, weight;

        System.out.print("---BMI Calculator---");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height in inches: ");
        heightInches = scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = scan2.nextDouble();

        double bmiCalc = (weight / (heightInches * heightInches)) * 703; //Calculates users BMI

        //Prints if users BMI is within 18.5 and 25
        if(bmiCalc >= 18.5 && bmiCalc <= 25) {

            System.out.print("Your BMI is: " + df2.format(bmiCalc));
            System.out.println("");
            System.out.print("You are within the ideal weight range.");

        }

        //Prints if users BMI is less than 18.5 or greater than 25
        if(bmiCalc <= 18.5 || bmiCalc >= 25) {

            System.out.print("Your BMI is: " + df2.format(bmiCalc));
            System.out.println("");
            System.out.print("You are overweight. You should see your doctor.");

        }

    }

}
