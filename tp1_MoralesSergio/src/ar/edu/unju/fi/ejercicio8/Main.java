package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.Model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingresar valor de n:");
        int n = scanner.nextInt();       
        Calculadora calculadora = new Calculadora();
        calculadora.setN(n);    
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());      
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        scanner.close();

	}

}
