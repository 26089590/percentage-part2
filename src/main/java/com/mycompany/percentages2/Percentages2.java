/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentages2;

/**
 *
 * @author MAEBANE MOKGADI
 */
import java.util.Scanner;
public class Percentages2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        computePercent(num1,num2);
        computePercent(num2,num1);
        
    }
    public static void computePercent(double first, double second){
    double percent = (first / second) * 100;
    System.out.println(first + " is " + percent + " percent of " + second);
}
}
