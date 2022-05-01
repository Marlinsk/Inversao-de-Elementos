package ecli.code;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int vetor[] = {12, 11, 9, 45, 67, 6, 120, 51, 21, 88, 645, 32, 56, 72, 91, 220};
		System.out.println("original=" + Arrays.toString(vetor));
		inverter(vetor, 0 , vetor.length - 1);
		System.out.println("invertida=" + Arrays.toString(vetor));
	}

	private static void inverter(int[] vetor, int i, int j) {
		if (i < j) {
			trocar(vetor, i, j);
			inverter(vetor, i + 1, j - 1);
		}
	}

	private static void trocar(int[] vetor,int i, int j) {
		int aux = vetor[i]; 
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
