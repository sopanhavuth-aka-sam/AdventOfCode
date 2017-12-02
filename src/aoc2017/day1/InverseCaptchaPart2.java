package aoc2017.day1;

public class InverseCaptchaPart2 {
	public InverseCaptchaPart2(String digits) {
		//Initialize a couple of var
		int sum = 0;
		int halfwayRound = digits.length()/2;
		//Iterate through half of the digits;
		//sum if the digit match its halfway counterpart
		for(int i=0; i<halfwayRound; i++) {
			char currentDigit = digits.charAt(i);
			if(currentDigit == digits.charAt(i+halfwayRound)) {
				sum += Character.getNumericValue(currentDigit);
			}
		}
		//Multiple by 2; if a digit match the counterpart,
		//the reverse is also true
		sum *= 2;
		//Output result
		System.out.println(sum);
	}
}
