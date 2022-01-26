 //Assignment: implement a use case i.e. Book a Cab by taking OLA/Uber as a case study

import java.util.*;

public class assignment2 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		double distance, amount;
		
		System.out.println("-------Welcome to Uber-------");
		
		System.out.println();
		
		System.out.print("Please enter the distance(in km) from your pickup location to the destination : ");
		distance=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("1 - Bike : Base fare = \u20b9 15 | Rate per km = \u20b9 3");
		System.out.println("2 - Auto : Base fare = \u20b9 23 | Rate per km = \u20b9 12");
		System.out.println("3 - Mini : Base fare = \u20b9 58 | Rate per km = \u20b9 19");
		System.out.println("4 - Prime sedan : Base fare = \u20b9 65 | Rate per km = \u20b9 21");
		System.out.print("Enter you choice : ");
		String choice=sc.next();
		
		switch(choice) 
		{
			case "1": 
				amount=distance*15+3;
				System.out.println("Amount to pay : \u20b9"+amount);
				break;
			case "2": 
				amount=distance*12+23;
				System.out.println("Amount to pay : \u20b9"+amount);
				break;
			case "3":
				amount=distance*19+28;
				System.out.println("Amount to pay : \u20b9"+amount);
				break;
			case "4":
				amount=distance*65+21;
				break;
			default: 
				System.out.println("Wrong choice. Please choose the correct option: ");
				System.out.println("1 - Bike");
				System.out.println("2- Auto");
				System.out.println("3- Mini");
				System.out.println("4- Prime sedan");
			
		}
		sc.close();
	}
	
}

