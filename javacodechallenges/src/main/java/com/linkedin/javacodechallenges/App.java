package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minWaterBill = 18.84;
        double gallonsInCCF = 748;
        double includedGallons = 2 * gallonsInCCF;

        if (gallonsUsage <= includedGallons) {
            return minWaterBill;
        } else {
            double extraGallonsUsed = gallonsUsage - includedGallons;
            double extraAmountOwed = Math.ceil(extraGallonsUsed / gallonsInCCF) * 3.9;
            return minWaterBill + extraAmountOwed;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
