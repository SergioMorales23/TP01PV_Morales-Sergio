package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar numero del 1 al 9");
		int numero = scanner.nextInt();
				if (numero<1 || numero>9) {
					System.out.println("Variable fuera de rango");
				}else {
					for (int i = 0; i <= 10; i++) {
						System.out.println(numero + " x " + i + " = "+ (numero*i));
					}
				}
				scanner.close();
	}

}
