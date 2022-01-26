/*Assignment: 1. Implement Ternary Operators if possible in above scenario
Whenever a wrong promo code is applied, tell the user whats the right promo code */

import java.util.*;

public class assignment1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double amt, discount = 0;
		String couponCode;
		System.out.print("Enter an Amount: ");
		amt = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("JUMBO : Flat 50% Off for orders value worth equal or more than 200");
		System.out.println("ZOMHELLO : Flat 40% Off upto Rs80 order value worth equal or more than 159\n");
		System.out.print("Enter a Coupon Code: ");
		couponCode = sc.next();
		
		System.out.println();
		
		System.out.println("Your Entered amount: "+amt+" | Your Entered Coupon Code :"+couponCode);
		
		sc.close(); // release the stream and make the memory clear :)
		System.out.println();
		
		switch(couponCode) 
		{
		
			case "JUMBO":
				
				if(amt >= 200) 
				{
					discount = 0.5 * amt;
					System.out.println("JUMBO Applied Successfully");
					System.out.println("Discount is: \u20b9"+discount);
				}
				else 
				{
					System.out.println("Amount is Lesser. Please add items worth "+(200-amt)+" more\n");
					System.out.println("Otherwise");
				}
				
				break;
				
			case "ZOMHELLO":
				
				if(amt >= 159) 
				{
					discount = 0.4 * amt;
					discount = discount > 80 ? 80:discount ; 
					System.out.println("ZOMHELLO Applied Successfully");
					System.out.println("Discount is: \u20b9"+discount);
				}
				else 
				{
					System.out.println("Amount is Lesser. Please add items worth "+(159-amt)+" more\n");
					System.out.println("Otherwise");
				}
				
				break;
				
			default:
				
				System.out.println("Invalid Promo Code. Try any of them :");
				System.out.println("JUMBO : Flat 50% Off for orders value worth equal or more than 200");
				System.out.println("ZOMHELLO : Flat 40% Off upto Rs80 order value worth equal or more than 159\n");
				System.out.println("Otherwise");
		}
		
		amt -= discount;
		System.out.println();
		System.out.println("Please pay final amount: \u20b9"+amt);
		
	}

}