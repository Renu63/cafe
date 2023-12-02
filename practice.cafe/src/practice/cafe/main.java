package practice.cafe;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		display d = new display();

		while (true) {
			System.out.println("\nWelcome to xyz cafe");
			
			int a = sc.nextInt();
			
			switch (a) {
			
			case 1: 
				d.detail();
				break;
				
				default:
				System.out.println("Enter correct option...");
			}
		}

	}

}
