package Lista06;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[4];
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        scanner.close();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetor[i]);
        }

        System.out.println("Média: " + (soma / vetor.length));
    }
}