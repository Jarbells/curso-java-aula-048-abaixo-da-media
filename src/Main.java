import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n;
		double[] vect;
		double sum = 0.0, average;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		average = sum / vect.length;
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", average);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < average) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}
}
