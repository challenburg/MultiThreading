package bond.price;

public class ThirtySecondsFormatter {
	public String convert(double num) {
		long integer = (long) num;
		double decimal = num - integer;
		String decimalString = "";
		
		double thirtySecondsNumber = decimal * 32;
		if (integer > 0 && thirtySecondsNumber >= 0 && thirtySecondsNumber <= 31 && thirtySecondsNumber == (int)thirtySecondsNumber)
			decimalString = Integer.toString((int)thirtySecondsNumber);
		else
			return "invalid input, please try again";
		
		return digitsCheck(Long.toString(integer)) + '-' + digitsCheck(decimalString);
	}
	
	public String digitsCheck(String s) {
		if(s != null && s.length() < 2)
			return '0' + s;
		else
			return s;
	}
}
