//Faça um programa que entre com três números e coloque em ordem crescente.//

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int a, b, c, maior, menor, meio; // Declaração de variáveis

        // Entrada de dados
        System.out.print("Digite o 1º número: ");
        a = entrada.nextInt();
        System.out.print("Digite o 2º número: ");
        b = entrada.nextInt();
        System.out.print("Digite o 3º número: ");
        c = entrada.nextInt();

        // Coloca os números em ordem crescente
        if (a < b) {
            maior = a;
            meio = b;
        } else {
            maior = b;
            meio = a;
        }
        if (c < maior) {
            menor = meio;
            meio = maior;
            maior = c;
        } else if (c < meio) {
            menor = meio;
            meio = c;
        } else
            menor = c;

        // imprime os números em ordem crescente
        System.out.println("\n" + maior + " " + meio + " " + menor);
        entrada.close();
    }
}