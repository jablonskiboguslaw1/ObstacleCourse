package com.company.simpletypes;

public class VolumeOfCylinder {

    // Write a program that computes volume of a cylinder of 5 cm radius and 10cm height
    //V = PIr^2*h
    public static void main(String[] args) {

        double radius = 5.0;
        double height = 10.0;

        double volume = (Math.PI * Math.pow(radius, 2) * height);

        System.out.println(volume);
    }
}
