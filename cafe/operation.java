package cafe;

import java.util.Scanner;


public class operation {

	Scanner sc = new Scanner(System.in);
	Variable v= new Variable();

	public void detail() {

		System.out.println("Enter Customer Name:- ");
		v.setCustomerName(sc.next());

		System.out.println("Enter Phone number:- ");
		v.setPhoneno(sc.nextInt());
		
		System.out.println("Enter quantity number:- ");
		v.setQuantity(sc.nextInt());
		
		

	}
}
