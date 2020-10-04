package com.company.aplication;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("faça uma comparacao entre os numeros inteiros");


        System.out.print("digite um numero: ");
        int num  = scan.nextInt();


        Comparavel comparavel = new Comparavel(num);


      //  System.out.println("numero digitado:" +  num);
        comparavel.ehMaiorOuIgual(30);
        comparavel.ehMenorOuIgual(20);
        comparavel.ehDiferenteDe(30);
        comparavel.ehIgual(40);

        comparavel.toString();
    }
}
