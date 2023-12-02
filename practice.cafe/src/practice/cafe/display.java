package practice.cafe;

import java.util.Scanner;

public class display {
	
	Scanner sc= new Scanner(System.in);
	details ds= new details();
	
	public void detail() {
		
		System.out.println("Enter Customer Name:- ");
		ds.setCustomername(sc.next());
		
		System.out.println("Enter Phone number:- ");
		ds.setPhoneno(sc.nextInt());
	}
}
