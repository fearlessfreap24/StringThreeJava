
public class Methods {

	public int countYZ(String str) {

//		Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in 
//		"heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
//		We'll say that a y or z is at the end of a word if there is not an alphabetic letter 
//		immediately following it. (Note: Character.isLetter(char) tests if a char is an 
//		alphabetic letter.)
//
//		countYZ("fez day") → 2
//		countYZ("day fez") → 2
//		countYZ("day fyyyz") → 2
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int countyz = 0;
		str = str.toLowerCase();
		
		if ( str.equals("") ) return countyz;
		if ( str.length() < 2 && ( str.toLowerCase().equals("y") || str.toLowerCase().equals("z") ) )
			return 1;
		for ( int i = 1; i < str.length(); i++ ) {
			if ( i == str.length() - 1 && ( str.charAt(i) == 'y' || str.charAt(i) == 'z') ) countyz++;
			else if ( alpha.indexOf(str.charAt(i)) < 0 ) {
				if ( str.charAt(i-1) == 'y' || str.charAt(i-1) == 'z' ) countyz++;
			}
		}
		
		return countyz;
	}

	public String withoutString(String base, String remove) {

//		Given two strings, base and remove, return a version of the base string where all 
//		instances of the remove string have been removed (not case sensitive). You may assume 
//		that the remove string is length 1 or more. Remove only non-overlapping instances, so 
//		with "xxx" removing "xx" leaves "x".
//
//		withoutString("Hello there", "llo") → "He there"
//		withoutString("Hello there", "e") → "Hllo thr"
//		withoutString("Hello there", "x") → "Hello there"
		
		String woutstring = "";
		String baseLower = base.toLowerCase();
		String remLower = remove.toLowerCase();
		int remLen = remove.length();
		
		if ( base.equals("") ) return base;
		if ( baseLower.equals(remLower) ) return woutstring;
		if ( baseLower.indexOf(remLower) < 0 ) return base;
				
		for ( int i = 0; i < base.length(); i++ ) {
			String subBaseLower = baseLower.substring(i);
			if ( subBaseLower.indexOf(remLower) == 0 ) i += remLen - 1;
			else woutstring += base.charAt(i);
		}
		
		return woutstring;
	}

	public boolean equalIsNot(String str) {

//		Given a string, return true if the number of appearances of "is" anywhere in the string
//		is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
//		equalIsNot("This is not") → false
//		equalIsNot("This is notnot") → true
//		equalIsNot("noisxxnotyynotxisi") → true

		int countIs = 0;
		int countNot = 0;

		for ( int i = 0; i < str.length(); i++ ){
			String strSub = str.substring(i);
			if ( strSub.indexOf("is") == 0 ) countIs++;
			if ( strSub.indexOf("not") == 0 ) countNot++;
		}

		return countIs == countNot;
	}

	public boolean gHappy(String str) {

//		We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
//		to its left or right. Return true if all the g's in the given string are happy.
//
//		gHappy("xxggxx") → true
//		gHappy("xxgxx") → false
//		gHappy("xxggyygxx") → false

		boolean ghappy = false;
		if ( str.length() < 2 ) return str.indexOf("g") < 0;
		if ( str.length() == 2 ) return str.indexOf("gg") == 0;
		for ( int i = 0; i < str.length() ; i++ ){
			if ( i == 0 && str.charAt(i) == 'g' ) ghappy =  str.charAt(i+1) == 'g';
			else if ( i > 0 && i < str.length() - 2 && str.charAt(i) == 'g' ){
				ghappy = ( str.charAt(i-1) == 'g'
					|| str.charAt(i+1) == 'g' );
			}
			else if ( i == str.length() - 1 && str.charAt(i) == 'g' ) ghappy =  str.charAt(i-1) == 'g';
		}

		return ghappy;

	}

	public int countTriple(String str) {

//		We'll say that a "triple" in a string is a char appearing three times in a row. Return the
//		number of triples in the given string. The triples may overlap.
//
//		countTriple("abcXXXabc") → 1
//		countTriple("xxxabyyyycd") → 3
//		countTriple("a") → 0

		int counttriple = 0;
		if ( str.length() < 3 ) return counttriple;
		for ( int i = 1; i < str.length() - 1; i++ ){
			char one = str.charAt(i-1);
			char two = str.charAt(i);
			char tre = str.charAt(i+1);
			if ( one == two && two == tre ) counttriple++;
		}

		return counttriple;
	}

	public int sumDigits(String str) {

//		Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all
//		other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char)
//		tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a
//		string to an int.)
//
//		sumDigits("aa1bc2d3") → 6
//		sumDigits("aa11b33") → 8
//		sumDigits("Chocolate") → 0

		String digits = "0123456789";
		int sumdigits = 0;
		for ( int i = 0; i < str.length(); i++ ){
			if ( digits.indexOf(str.charAt(i)) >= 0 )
				sumdigits += Integer.parseInt(str.substring(i, i+1));
		}

		return sumdigits;
	}
}
