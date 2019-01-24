/***
 * 
 * @author Leo Li
 *
 */
public class ConversionsProject {

	public static void main(String[] args) {
		System.out.println("The feet to inches conversion: " + feetToInches(3.45,0.0));
		System.out.println("The miles to feet conversion: " + milesToFeet(5.42,0.0));
		System.out.println("The yards to meter conversion: " + yardsToMeters(24.5,0.0));
		System.out.println("The pounds to kilograms conversion: " + poundsToKilograms(8.76,0.0));
		
	}
	public static double feetToInches(double feet1, double inch1)
	{
		inch1 = 12 * feet1;
		return inch1;
	}
	public static double milesToFeet(double miles, double feet2)
	{
		feet2 = 5280 * miles;
		return feet2;
	}
	public static double yardsToMeters(double yards, double meters)
	{
		meters = yards/1.094;
		return meters;
	}
	public static double poundsToKilograms(double pounds, double kilograms)
	{
		kilograms = pounds/2.205;
		return kilograms;
	}


}
