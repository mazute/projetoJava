package principal;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		
		Somar s = new Somar();
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número ");
		s.num1 = scan.nextInt();
		System.out.println("Informe o segundo número ");
		s.num2 = scan.nextInt();
		
		int soma = s.somar();
		
		System.out.println("Total: "+soma);
		
	}

}
