import java.util.Scanner;

public class E14_BinaryCalc {

		static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		//User input 
		System.out.println("Please enter an integer: ");
		 int fnum = sc.nextInt(); 
		
		 System.out.println("Please enter a second integer: ");
		 int snum = sc.nextInt(); 
		
		 System.out.println("Do you wish to add, subtract, multiply or divide. Please enter a sign ( + , - , * , /): ");
		 char sign = sc.next().charAt(0);
		 sc.close();
		 
		 // The calculation engine
		
		 double result;
		  
		 switch (sign) {
		  
		  case '+':
			  result = fnum + snum;
			  break;

		  case '-':
			  result = fnum - snum;
			  break;	  
		  
		  case '*':
			  result = fnum * snum;
			  break;
		 
		  case '/':
			  result = fnum / snum;
			  break;	  
			  
		 default:
			 System.out.println(" This is not a viable sign please use only one of the following: (+ , - , * , /).");
			 return; // should have used a try/catch with a do while loop to repeat the process
			
		  }
		 
		 // Result print out combined with a conversion method to take an integer and turn it to a binary equivalent.
		 
		 System.out.println("The binary equivelent of the first number inputed: "+fnum+". is: "+(Integer.toBinaryString(fnum))+".");
		 System.out.println("The binary equivelent of the second number inputed: "+snum+". is: "+(Integer.toBinaryString(snum))+".");
		 System.out.println("Now the first number " +fnum+" "+sign+" the second number "+snum+" equals: " +result+".");
		 System.out.println("The binary equivalent of the product of the first and second number inputed: "+result+". is: "+(Integer.toBinaryString((int)result)+"."));	
		
		
	}
	}		

