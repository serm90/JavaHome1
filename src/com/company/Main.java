package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        try {
            System.out.println("Введите первое число в диапазоне [1;100]:");
            int num1 = a.nextInt();
            System.out.println("Введите второе число в диапазоне [50;85]:");
            int num2 = b.nextInt();

            if (num1 < num2) {
                System.out.println(num1 + " < " + num2);
            } else if (num1 > num2) {
                System.out.println(num1 + " > " + num2);
            } else {
                System.out.println(num1 + " = " + num2 + " - сравниваемые значение одинаковые;");
            }

            if (num1 >= 1 && num1 <= 100) {
                System.out.println(num1 + " - в заданном диапазоне [1;100];");
            } else {
                System.out.println(num1 + " - не в заданном диапазоне [1;100];");
            }

            if (num2 >= 50 && num2 <= 85) {
                System.out.println(num2 + " - в заданном диапазоне [50;85].");
            } else {
                System.out.println(num2 + " - не в заданном диапазоне [50;85].");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

