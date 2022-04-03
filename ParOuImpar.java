/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int numero; // Declaração de variáveis

        // Entrada de dados
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        // Calcula e imprime a categoria
        if (numero % 2 == 0) {
            System.out.println("O número é par");
            System.out.println("A raiz quadrada é: " + Math.sqrt(numero));
        } else {
            System.out.println("O número é ímpar");
            System.out.println("O número elevado ao quadrado é: " + Math.pow(numero, 2));
        }
        entrada.close();
    }
}