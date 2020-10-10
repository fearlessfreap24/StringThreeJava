
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
		
		String[][] strs2 = { {"Hello there", "llo"}, {"Hello there", "e"}, {"Hello there", "x"}, {"This is a FISH", "IS"}, {"THIS is a FISH", "iS"} };
		for ( String[] strs : strs2 ) {
			System.out.printf("base = %s, remove = %s : %s\n", strs[0], strs[1],
					m.withoutString(strs[0], strs[1]));
		}
		
	}

}
