package com.company.simpletypes.elementary;

public class AboutYou {

    /*
    1. Use  String type variables to save  name and surname .

    2. Declare your age as byte, short, int and long.

    3. Use concatenation to print name, surname , and age in one line.
     */
    public static void main(String[] args) {


        String name = "Jan";
        String surname = "Kowalski";

        // 1 B = 8 bits
        byte ageByte = 100;
        // 2 B
        short ageShort = 100;

        // 4 B = 32bits      2^32 = -2,147,483,648 to 2,147,483,647
        int ageInt = 100;

        // 8 B = 64 bit     2^64 = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long ageLong = 100L;

        System.out.println(name + " " + surname + " " + ageInt);
         // String concatenation

    }
}
