package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		int y;
		double a;
		char b;
		b = sc.next().charAt(3);
		a = sc.nextDouble();
		y = sc.nextInt();
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(b);
		System.out.println(a);
		System.out.println(y);
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
