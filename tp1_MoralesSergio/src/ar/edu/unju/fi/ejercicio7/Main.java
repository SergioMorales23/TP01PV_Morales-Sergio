package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.Model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingresar salario del empleado:");
        double salario = scanner.nextDouble();
        Empleado empleado = new Empleado(nombre ,legajo, salario);
        System.out.println("Datos del empleado antes del aumento:");
        empleado.mostrarDatos();      
        empleado.AumentoSalario();    
        System.out.println("\nDatos del empleado después del aumento:");
        empleado.mostrarDatos();
        scanner.close();
	}

}
