//Application: Program 2
//Name: Divine Igihozo
//GitHub User: Ndigihozo
//Date: Sep 24, 2022
//Version: 1.0
//Description: Menu choice from the user input

import java.util.Scanner;

public class program2 {

	public static void main(String [] args) {
		
		//activate keyboard
		
		
		Scanner input = new Scanner (System.in);
		
		// collecting 3 input from user 
		
		System.out.print("What is your first number? ");
		int num1= input.nextInt();
		System.out.print("What is your second number? ");
		int num2=input.nextInt();
		System.out.print("What is your third number? " );
		int num3=input.nextInt();
		
		System.out.print("\n");
		
		// Displaying the menu actions
		
		System.out.println("Menu of Actions:");
		System.out.println("        1.) Add");
		System.out.println("        2.) Subtract");
		System.out.println("        3.) Multiply");
		System.out.println("        4.) Divide");
		System.out.println("        5.) Exit");
		
		System.out.print("\n");
		
		//collecting user choice from the above menu
		
		System.out.println(" Menu choice? ");
		int C=input.nextInt();
		
		int A = 0;
		
		//testing the user choice in switch statement and output statement
		
		switch (C){
			
			case 1:
				
				A=num1+num2;
				System.out.println("You numbers added together equal: "+ A);
				
				break;
				
			case 2:
				
				A=num1-num2;
				System.out.println("You numbers subtracted together equal: "+ A);
				
				break;
				
			case 3:
			
				A=num1*num2;
				System.out.println("You numbers multiplied together equal: "+ A);
				
				break;
					
				
			case 4:
				
				A=num1/num2;
				System.out.println("You numbers divided together equal: "+ A);
				
				break;
					
				
			default:
				
				break;
				
				
				
					}
	// testing the user choice to see if the result is greater or not greater than the 3rd entered number
		System.out.print("\n");
		
		if (A > num3)
			System.out.println( A + " Is greater than " + num3);
		

		if (!(A==0) && A < num3)
		    System.out.println( A + " Is not greater than " + num3);
		
		
		

	}
}



