package view;

import controller.ConverteController;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ConverteController contConvert = new ConverteController();
		Scanner sc = new Scanner(System.in);
		int numero = 1001;
		System.out.println("Digite um número de 1 a 1000:");
		while(numero < 0 || numero > 1000) {
			numero = sc.nextInt();
		}
		
		String binario = contConvert.decToBin(numero);
		System.out.println("O número " + numero + " em binário é: " + binario);
		
		sc.close();
	}

}
