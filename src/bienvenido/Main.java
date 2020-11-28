package bienvenido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bienvenida b1 = new Bienvenida();
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu edad: ");
		resultado = sc.nextInt();
		b1.setEdad(resultado);
		
		b1.comprobarEdad();
	}

}
