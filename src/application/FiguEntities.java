package application;

public class FiguEntities {
	
	private double a,b,c;
	private final double pi = 3.14159;
	
	public FiguEntities(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double triangulo() {
		return a*c/2;
	}
	
	public double circulo() {
		return pi*Math.pow(c, 2);
	}
	
	public double trapezio() {
		return (b+a)/2*c;
	}
	
	public double quadrado() {
		return Math.pow(b, 2);
	}
	
	public double retangulo() {
		return a*b;
	}

	public String toString () {
		return "TRIANGULO: " + String.format("%.3f%n", triangulo())
		+ "CIRCULO: " + String.format("%.3f%n", circulo())
		+ "TRAPEZIO: " + String.format("%.3f%n", trapezio())
		+ "QUADRADO: " + String.format("%.3f%n", quadrado())
		+ "RETANGULO: " + String.format("%.3f%n", retangulo());
	}
}
