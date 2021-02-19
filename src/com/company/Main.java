package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("¿Hay sol? (true/false)");
        Scanner sc = new Scanner(System.in);
        Boolean isSol = sc.nextBoolean();

        System.out.println("¿Qué temperatura tenemos?(int)");

        int temperatura = sc.nextInt();

        System.out.println("¿Tenemos ropa de playa?(true/false)");
        Boolean isRopaDePlaya = sc.nextBoolean();


        if (isSol) {
            if (temperatura < 23) {
                System.out.println(" Dar un paseito  ");
            } else if (temperatura <= 25 && temperatura >= 23) {
                System.out.println(" Vamos a la playa ");

            } else {
                System.out.println(" Vamos a la playa y no olvidar la sombrilla que quemamos ");
            }
        }


    }
}
