package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String x = input;
		String z = "";
		for (int i = 0; i <x.length(); i++) {
			String y = x.substring(i, i + 1);
			z = z + y + y + y;
		}
		System.out.println(z);
		return z;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String output = "";
		String x = input.toLowerCase();
		String y = "";
		String z = "";
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		int counter = 0;
		for(int i = 0; i < x.length() - 3; i++) {
			y = x.substring(i, i + 4);
			if (y.equals("bert")) {
				counter += 1;
			}
		}
		System.out.println(counter);
		if (counter != 2) {
			output = "";
			return output;
		}
		for(int i = 0; i < x.length() - 3; i++) {
			y = x.substring(i, i + 4);
			if (y.equals("bert")) {
				z = x.substring(i + 4, x.length());
//				output = z;
				break;
			}
		}
		for(int i = 0; i < z.length() - 3; i++) {
			a = z.substring(i, i + 4);
			if (a.equals("bert")) {
				b = z.substring(0, i);
//				output = b;
				break;
			}
			
		}
		for(int i = b.length(); i > 0; i--) {
			c = b.substring(i - 1, i);
			d = d + c;
			
		}
		output = d;
		
		return output;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int d = a - b;
		int e = a - c;
		int f = b - c;
		if (d < 0) {
			d = -d;
		}
		if (e < 0) {
			e = -e;
		}
		if (f < 0) {
			f = -f;
		}
		boolean g = false;
		if (d == f || d == e || e == f) {
				g = true;
			}
		else {
			g = false;
		}
		
		return g;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int x = input.length() - a;
		int y = x/2;
		String string1 = input.substring(0, y);
		String string2 = input.substring(input.length() - y, input.length());
		String finalstr = string1 + string2;
		return finalstr;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("jh") → false
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		String x = input.toLowerCase();
		boolean z = false;
		if (x.length() < 3) {
			z = false;
			return z;
		}
		String y = x.substring(x.length() - 3, x.length());
		
		if (y.equals("dev")) {
			z = true;
		}
		else {
			z = false;
		}
		return z;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		String x = input;
		String y = " ";
		String z = "";
		int counta = 1;
		int countb = 0;
		for(int i = 1; i < x.length(); i++) {
			z = y;
			y = x.substring(i - 1, i);
			if (z.equals(y)) {
				counta += 1;
			}
			else {
				if (counta > countb) {
					countb = counta;
				}
				counta = 1;
			}
		}
		return countb;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		String x = arg1.toLowerCase();
		String y = "";
		String z = "";
		String a = "";
		int counter = 0;
		for (int i = 1; i < x.length() - 3; i++) {
			y = x.substring(i, i + 2);
			z = x.substring(i + 2, i + 3);
			a = x.substring(i - 1, i);
			if (y.equals("am") && a.equals(" ") && z.equals(" ") ) {
				counter += 1;
			}
		}
		if (x.length() > 2) {
			y = x.substring(0, 3);
			z = x.substring(x.length() - 3, x.length());
			if (y.equals("am ")) {
				counter += 1;
			}
			if (z.equals(" am")) {
				counter += 1;
			}
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String x = null;
		if( arg1%3 == 0 && arg1%5 == 0) {
			x = "fizzbuzz";
			return x;
		}
		else if ( arg1%3 == 0 && arg1%5 != 0) {
			x = "fizz";
			return x;
		}
		else if ( arg1%3 != 0 && arg1%5 == 0) {
			x = "buzz";
			return x;
		}
		else {
			x = null;
			return x;
		}
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {

		return 0;
		
	}
	
	
}
