//Assignment: Explore labels with break and continue in Java and write a program for the same

public class assignment3 {

	    public static void main(String args[]) {
	    	System.out.println("In First Label");
	        first:
	        	
	           for (int i = 0; i < 3; i++) {
	              for (int j = 0; j< 3; j++){
	                 if(i == 1){
	                	 System.out.println("\nContinuing in First Label");
	                    continue first;
	                 }      
	                 System.out.print(" [i = " + i + ", j = " + j + "] ");
	              }
	           }
	       
	           System.out.println();
	           System.out.println("\nIn Second Label");
	
	           second:
	        	   
	              for (int i = 0; i < 3; i++) {
	                 for (int j = 0; j< 3; j++){
	                    if(i == 1){
	                    	System.out.println("\nExiting Second Label");
	                       break second;
	                    }    
	   
	                    System.out.print(" [i = " + i + ", j = " + j + "] ");
	                 }
	              }
	      }
}
	    
	

