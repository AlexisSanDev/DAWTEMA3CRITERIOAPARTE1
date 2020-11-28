package bienvenido;

public class Bienvenida {
	private int edad;

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comprobarEdad() {
		if(edad == 18) {
			System.out.println("Bienvenido al sistema, como usted es un usuario novato aquí tiene unos trucos para entender mejor nuestro sistema.");
		}else if(edad > 18){
			System.out.println("Bienvenido al sistema");
		}else {
			System.out.println("Usted es menor de edad, no puede entrar al sistema.");
		}
	}
}
