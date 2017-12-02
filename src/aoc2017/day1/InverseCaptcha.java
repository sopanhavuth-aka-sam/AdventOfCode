package aoc2017.day1;


public class InverseCaptcha {
	public InverseCaptcha(String digits) {
		//Initialize a few var
		int sum = 0;
		char firstDigit = digits.charAt(0);
		char currentDigit = firstDigit;
		//Iterate through the list of number and sum any repeating numbers
		for(int i=1; i<digits.length(); i++) {
			if(currentDigit == digits.charAt(i)) {
				sum += Character.getNumericValue(digits.charAt(i));
			}
			currentDigit = digits.charAt(i);
		}
		//Is first and last digit repeating?
		char lastDigit = digits.charAt(digits.length()-1);
		if(firstDigit == lastDigit) {
			sum += Character.getNumericValue(firstDigit);
		}
		//Output result
		System.out.println(sum);
	}
}
