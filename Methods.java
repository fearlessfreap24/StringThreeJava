
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

}
