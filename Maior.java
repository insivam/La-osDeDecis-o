
//Faça um programa que receba três inteiros e diga qual deles é o maior.
import java.util.Scanner;

public class Maior {
    public static

            void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner
        int i, soma = 0; // Declaração de variáveis

        for (int c = 0; c < 3; c++) {
            System.out.printf("Digite %sº número: ", c + 1);
            i = entrada.nextInt();
            if (i > soma)
                soma = i;
        }

        System.out.print("\nO maior número é: " + soma);
        entrada.close();
    }
}
