package com.company.simpletypes.elementary;

public class Operators {

    /* 1. Create a double variable with the value 20
       2. Create a second variable of type double with the value 80
       3. Add both numbers up and multiply by 25
       4. Use the remainder (modulo) operator to figure out the remainder from the sum of #3 divided by 40
       5. Write a statement that displays a message "Total stays in the limit"
       if the remaining total (#4) is equal to 20 or less.
       Use ternary operator if the above criteria doesn't match display message "Total was over the limit"
     */

    public static void main(String[] args) {

        double var1 = 20;
        double var2 = 80;
        double calcResult = (var1 + var2) * 25;
        double moduloResult = calcResult % 40;
        String message = (moduloResult <= 20) ? "Total stays in the limit" : "Total was over the limit";
        System.out.println(message);
    }
}
