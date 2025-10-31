package Lista06;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[vetor.length - 1 - i]);
        }
    }
}