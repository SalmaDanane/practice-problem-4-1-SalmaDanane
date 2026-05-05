public class PracticeProblem {

	public static void main (String args[]) {

	}

	public static String seriesInclusive(int num) {
		
		if (num < 1) {
			return "";
		}
		String ans;
		ans = "1";
		int i = 2;

		while (i <= num) {
			ans += " " + i;
			i++;
		}
		return ans;


	}


	public static String seriesExculsive(int num){
		String ans = "";
		int i = 0;

		while (i < num){
			ans += i;
			if (i != num - 1) {
				ans += " ";
			}
			i++;
		}
		return ans;
	}

}
