public class TemperatureConversion {
/**
 * Demonstrates the use of primitive data types,arithmetic
 * expressions, and promotion
 *
 * @author Java Foundations, CS121 Instructors
 */
public class TempConverter
{
	/**
	 * Computes the Fahrenheit equivalent of a specific Celsius
	 * value using the formula C = 5/9(F - 32).
	 */
	public static void main(String[] args)
	{
		// Declare and instantiate constants
		final int BASE = 32;
		final int CONVERSION_FACTOR = 9 / 5;

		//Declare variables (celsiusTemp is also instantiated)
		
        int fahrenheitTemp = 30;
		int celsiusTemp = 24;  // value to convert

		// Notice the types of each variable: BASE is an int. CONVERSION_FACTOR
		// is a double. celsiusTemp is an int. fahrenheitTemp is a double. BASE is promoted 
		// to a double during the evaluation of the expression. 
		celsiusTemp = CONVERSION_FACTOR * fahrenheitTemp - 32;

		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println("Celsius Equivalent: " + celsiusTemp);
	}
}    
}
