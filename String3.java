
public class String3 {

	public static void main(String[] args) {

		String3 start = new String3();
		Methods m = new Methods();
		start.run(m);

	}

	private void run(Methods m) {

//		String[] strs1 = { "fez day", "day fez", "day fyyyz" };
//		for ( String str : strs1 ) {
//			System.out.printf("str = %s : %d\n", str, m.countYZ(str));
//		}
		
//		String[][] strs2 = { {"Hello there", "llo"}, {"Hello there", "e"}, {"Hello there", "x"}, {"This is a FISH", "IS"}, {"THIS is a FISH", "iS"} };
//		for ( String[] strs : strs2 ) {
//			System.out.printf("base = %s, remove = %s : %s\n", strs[0], strs[1],
//					m.withoutString(strs[0], strs[1]));
//		}

//		String[] strs3 = { "This is not", "This is notnot", "noisxxnotyynotxisi", "isisnotno7Not" };
//		for ( String str : strs3 ){
//			System.out.printf("str = %s : %b\n", str, m.equalIsNot(str));
//		}

//		String[] strs4 = { "xxggxx", "xxgxx", "xxggyygxx", "xxgggxyg" };
//		for ( String str : strs4 ){
//			System.out.printf("str = %s : %b\n", str, m.gHappy(str));
//		}

//		String[][] strs5 = { {"abcXXXabc", "1"}, {"xxxabyyyycd", "3"}, {"a", "0"} };
//		for ( String[] strs : strs5 ){
//			System.out.printf("str = %s : %d : should be %s\n", strs[0], m.countTriple(strs[0]), strs[1] );
//		}

//		String[][] strs6 = { {"aa1bc2d3", "6"}, {"aa11b33", "8"}, {"Chocolate", "0"} };
//		for ( String[] strs : strs6 ){
//			System.out.printf("str = %s : %d : should be %s\n", strs[0], m.sumDigits(strs[0]), strs[1]);
//		}

//		String[][] strs7 = { {"abXYab", "ab"}, {"xx", "x"}, {"xxx", "x"} };
//		for ( String[] strs : strs7 ){
//			System.out.printf("str = %s : %s : should be \"%s\"\n", strs[0], m.sameEnds(strs[0]), strs[1]);
//		}

		String[][] strs8 = { {"abXYZba", "ab"}, {"abca", "a"}, {"aba", "aba"} };
		for ( String[] strs : strs8 ) {
			System.out.printf("string = %s : %s : should be \"%s\"\n", strs[0], m.mirrorEnds(strs[0]), strs[1]);
		}
		
	}

}
