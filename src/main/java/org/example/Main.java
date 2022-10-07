package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o primeiro valor: ");
//        float n1 = scanner.nextFloat();
//        System.out.println("Digite o segundo valor");
//        float n2 = scanner.nextFloat();
//        System.out.println("Hello world!");
//        System.out.println("Digite o terceiro valor: ");
//        float n3 = scanner.nextFloat();
//        System.out.println("Digite o quarto valor");
//        float n4 = scanner.nextFloat();
//        float media = (n1 +n2 + n3 + n4)/4;
//        System.out.println("A média dos valores citados acima é: "+ media);

        Media media = new Media();
        media.calcularMedia();
    }
}