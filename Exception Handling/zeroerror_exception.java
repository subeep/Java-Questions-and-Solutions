///zeroerror_exception
////handling exception of dividing a number by zero
public class MyClass {
    
	static int Dividebyzero(int x) {
		///dividing the given x value by zero
		int value =0;
		
		try
		{
		value = x / 0;  //provoking the error
		}
		catch(NumberFormatException knownerror)
		{
		System.out.println(knownerror.getMessage()); // identifying the error
		}
		
		return value;
	}
	
    public static void main(String args[]) {
      int x=1;
      
      try
		{
			int value = Dividebyzero(x); // dividing x by zero
		
		}
		catch(ArithmeticException errormessage)
		{
			System.out.println(errormessage.getMessage()); /// getting the error and printing it
		}

    }
    
    
}
