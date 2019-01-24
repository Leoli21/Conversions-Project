
public class ConversionsProject {

	public static void main(String[] args) {
		System.out.println("The feet to inches conversion: " + feetToInches(20.0,0.0));
		System.out.println("The miles to feet conversion: " + milesToFeet(5.4,0.0));
		System.out.println("The yards to meter conversion: " + yardsToMeters(100.0,0.0));
		System.out.println("The pounds to kilograms conversion: " + poundsToKilograms(6.9,0.0));
		

	}
	public static double feetToInches(double feet1, double inch1)
	{
		inch1 = 12 * feet1;
		return feet1;
	}
	public static double milesToFeet(double miles, double feet2)
	{
		miles = 5280 * feet2;
		return miles;
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
