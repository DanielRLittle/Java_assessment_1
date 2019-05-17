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
		String x = arg1;
		String y = "";
		int j = 0;
		String z = "";
		String a = "";
		String b = "";
		String c = "";
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		for (int i = 0; i < x.length(); i++) {
			y = x.substring(i);
			if(y.equals(" ")) {
				z = x.substring(j, i);
				if(z.length() == 2) {
					a = z.substring(0, 1);
					b = z.substring(1, 2);
					if (a == "1") {
						k = 1;
					}
					else if (a == "2") {
						k = 2;
					}
					else if (a == "3") {
						k = 3;
					}
					else if (a == "4") {
						k = 4;
					}
					else if (a == "5") {
						k = 5;
					}
					else if (a == "6") {
						k = 6;
					}
					else if (a == "7") {
						k = 7;
					}
					else if (a == "8") {
						k = 8;
					}
					else if (a == "9") {
						k = 9;
					}
					if (b == "1") {
						l = 1;
					}
					else if (b == "2") {
						l = 2;
					}
					else if (b == "3") {
						l = 3;
					}
					else if (b == "4") {
						l = 4;
					}
					else if (b == "5") {
						l = 5;
					}
					else if (b == "6") {
						l = 6;
					}
					else if (b == "7") {
						l = 7;
					}
					else if (b == "8") {
						l = 8;
					}
					else if (b == "9") {
						l = 9; 
					}
					m = k + l;
					if (m > o) {
						o = m;
					}
				}
				else if (z.length() == 3) {
					a = z.substring(0, 1);
					b = z.substring(1, 2);
					c = z.substring(2, 3);
					if (a == "1") {
						k = 1;
					}
					else if (a == "2") {
						k = 2;
					}
					else if (a == "3") {
						k = 3;
					}
					else if (a == "4") {
						k = 4;
					}
					else if (a == "5") {
						k = 5;
					}
					else if (a == "6") {
						k = 6;
					}
					else if (a == "7") {
						k = 7;
					}
					else if (a == "8") {
						k = 8;
					}
					else if (a == "9") {
						k = 9;
					}
					if (b == "1") {
						l = 1;
					}
					else if (b == "2") {
						l = 2;
					}
					else if (b == "3") {
						l = 3;
					}
					else if (b == "4") {
						l = 4;
					}
					else if (b == "5") {
						l = 5;
					}
					else if (b == "6") {
						l = 6;
					}
					else if (b == "7") {
						l = 7;
					}
					else if (b == "8") {
						l = 8;
					}
					else if (b == "9") {
						l = 9; 
					}
					if (c == "1") {
						n = 1;
					}
					else if (c == "2") {
						n = 2;
					}
					else if (c == "3") {
						n = 3;
					}
					else if (c == "4") {
						n = 4;
					}
					else if (c == "5") {
						n = 5;
					}
					else if (c == "6") {
						n = 6;
					}
					else if (c == "7") {
						n = 7;
					}
					else if (c == "8") {
						n = 8;
					}
					else if (c == "9") {
						n = 9; 
					}
					m = k + l + n;
					if (m > o) {
						o = m;
					}
				}
				j = i;
			}
		}

		return o;
		
	}
	
	
}
