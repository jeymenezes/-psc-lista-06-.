package Lista06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            double soma = 0;

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                soma += scanner.nextDouble();
            }

            vetor[i] = soma / 4;
        }

        scanner.close();

        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 7.0) {
                contador++;
            }
        }

        System.out.println(contador + " alunos tiveram a média maior ou igual a 7.0");
    }
}
