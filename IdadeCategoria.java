/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto */

import java.util.Scanner;

public class IdadeCategoria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int idade; // Declaração de variáveis

        // Entrada de dados
        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        // Calcula e imprime a categoria
        if (idade > 25 || idade < 10)
            System.out.println("Idade inválida");
        else if (idade <= 14)
            System.out.println("Infantil");
        else if (idade <= 17)
            System.out.println("Juvenil");
        else if (idade <= 25)
            System.out.println("Adulto");

        entrada.close();
    }
}