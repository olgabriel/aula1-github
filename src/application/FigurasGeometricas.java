package application;

import java.util.Locale;
import java.util.Scanner;

public class FigurasGeometricas {

	public static void main(String[] args) {
		int x =1;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (x != 0) {
			System.out.println();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			FiguEntities figu = new FiguEntities(a, b, c);

			System.out.println();
			System.out.println(figu);

			System.out.println();
			System.out.println("Pra repetir a operação digite 1");
			System.out.println("Para sair digite 0");
			x = sc.nextInt();

		}
		 
		System.out.println();    
		System.out.println("Obrigado!");
		    
		sc.close();

	}

}
