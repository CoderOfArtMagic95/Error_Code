
public class errorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*illegal field names- use to show how
		 * using the wrong form of naming can
		 * ruin a program*/
		
		//uninitialized bad variables  --Comment out one by one to see which error belongs to which lines of code
		
		boolean isworking; //Compilation error! no declarations for these 4 instances
		
		int 8check; // Syntax error and Compilation error
		
		double check_Decimal; //Compilation Error and issue from not initializing/setting the variable
		
		String .error; //Compilation error, Syntax error seen as token not seen as a variable?
		
		System.out.println(isworking); //Compilation error; throws a unresolved compilation error
		
		System.out.println(8check); // Syntax error and Compilation error sees this as separate tokens
		
		System.out.println(check_Decimal); //Compilation Error and issue from not initializing/setting the variable
		
		System.out.println(.error);//Compilation error, Syntax error seen as token not seen as a variable?
		
		/* correct naming using camel or snake case below
		 * uncomment the code below to see the difference*/
		
		/* boolean isWorking = true;
		   int eightCheck = 88888888;
		   double checkDecimal = 2.0;
		   String DotWork = "No Errors here!"; 
		  
		  System.out.println(isWorking);
		  System.out.println(eightCheck);
		  System.out.println(checkDecimal); 
		  System.out.println(DotWork);
		  */
		
	}

}
