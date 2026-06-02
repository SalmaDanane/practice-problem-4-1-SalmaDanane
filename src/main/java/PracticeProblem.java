public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String seriesInclusive(int num) {
		//Write question 1 code here
		int i = 1;
		String series = "";
		while (i <= num) {
			series = series + i + " ";
			i=i+1;
		}
		return series.trim();
	}

	public static String seriesExclusive(int num) {
		//Write question 2 code here
		int i = 0;
		String series = "";
		while (i < num) {
			series = series + i + " ";
			i=i+1;
		}
		return series.trim();
	}
}
