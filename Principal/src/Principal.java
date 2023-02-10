import java.util.Scanner;

//nombre de la clase 
public class Principal {

	// metodo principal

	// metodos principal
	public static void main(String[] args) {

		System.out.println("Ingrese la palabra");
		Scanner sc = new Scanner(System.in);

		String prueba = sc.next();
		System.out.println("la cantidad de letras que tiene la palabra es:  " + prueba.length());

	}
}
