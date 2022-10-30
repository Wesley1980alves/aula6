package aula6;

import java.util.Scanner;
import java.util.Locale;

public class ClasseExecutavel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[7];
		int[] vetorB = new int[7];
		int maximo = 6;

		for (int cont = 0; cont < maximo; cont++) {
			System.out.println("Digite um valor para o meu vetor");
			vetorA[cont] = scan.nextInt();
			if (vetorA[cont] % 2 == 0) {
				vetorB[cont] = 1;
				System.out.println(vetorB[cont]);

			}
			if (vetorA[cont] % 2 == 1) {
				vetorB[cont] = 0;
				System.out.println(vetorB[cont]);
			}

		}
		for (int cont = 0; cont < maximo; cont++) {
			System.out.println(" Vetor A: [" + vetorA[cont] + "]" + "\tvetor B: [" + vetorB[cont] + "]");

			
		}

	}

}
