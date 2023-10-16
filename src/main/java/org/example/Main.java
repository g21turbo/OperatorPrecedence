package org.example;

public class Main {
    public static void main(String[] args) {

        double var1 = 20.00;
        double var2 = 80.00;

        // Adding parenthesis for precedence VS var1 + var2 * 100
        double var3 = (var1 + var2) * 100;
        System.out.println("Var3 = " + var3);

        double var4 = var3%40.00;
        System.out.println("Remainder = " + var4);

        boolean zeroRemainder = var4 == 0 ? true : false;

        System.out.println("zeroRemainder = " + zeroRemainder);

        if (!zeroRemainder) {
            System.out.println("Got some remainder");
        }

    }
}