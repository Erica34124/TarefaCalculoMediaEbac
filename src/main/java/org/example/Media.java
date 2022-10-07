package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    private ArrayList<Float> numeros = new ArrayList<>();

    public float calcularMedia() {
        int count;
        int i = 0;
        float soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores deseja verificar a média? ");
        count = scanner.nextInt();
        while (i < count) {
            i++;
            System.out.println("Entre com valor " + i);
            this.numeros.add(scanner.nextFloat());

        }
        for (Float n : this.numeros) {
            soma += n.intValue();
        }
        float media = soma / count;
        System.out.println("O valor da média dos valores é: " + media);
        return media;
    }
}
