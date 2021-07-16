package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float Celsius = input.nextFloat();
        convert(Celsius);
    }
    public static void convert(float temp) {
        double Fahrenheit = (temp * 1.8) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit);
    }
}
