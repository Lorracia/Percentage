/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percentage;

/**
 *
 * @author ShineThekgo.1
 */
import java.util.Scanner;
public class Percentage  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = input.nextDouble();
         System.out.println("Enter y:");
        double y =input.nextDouble();
        double percentage =computePercentage(x,y);
        System.out.println(x + "is" + percentage + "%" + "of" + y);
        
    }
   public static double computePercentage(double a, double b)  {
       return (a/b)*100;
   }
}