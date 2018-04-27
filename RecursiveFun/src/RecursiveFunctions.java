import java.util.ArrayList;

public class RecursiveFunctions {

	public static void main(String[] args) {
		ArrayList<String> foo = RecursiveFunctions.permutations("eat");
		for (String s : foo) {
			System.out.println(s);
		}
	}

	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		}
		return RecursiveFunctions.factorial(n-1) * n;
	}

	public static void foo() {
		String s1 = new String("Bienve");
		String s2 = s1;
		String s3 = new String(s1);
	}

	public static boolean isPalindrome(String word) {
		return isPalindrome(word, 0, word.length()-1);
		//		if (word.length() <= 1) {
		//			return true;
		//		}
		//		else if (word.charAt(0) == word.charAt(word.length()-1)) {
		//			String shorterString = word.substring(1, word.length()-1);
		//			return(isPalindrome(shorterString));
		//		}
		//		else {
		//			return false;
		//		}
	}

	private static boolean isPalindrome(String word, int start, int end) {
		if ((start >= end) || (start == end - 1)) {
			return true;
		}
		else if (word.charAt(start) == word.charAt(end)) {
			return isPalindrome(word, start+1, end-1);
		}
		return false; // Dummy
	}

	public static long fibonacci(int n) {
		System.out.println("Fibonacci of " + n);
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}


	public static long fibonacci(long n, long f1, long f0) {
		if (n == 0) {
			return f0;
		}
		else if (n == 1) {
			return f1;
		}
		else {
			return fibonacci(n-1, f1+f0, f1); // Tail recursion
		}
	}

	public static long fiboIter(long n) {
		if (n == 0) return 0;
		long f0 = 0; // f0
		long f1 = 1;
		for (int i = 0; i<n-1; i++) {
			long temp = f1;
			f1 = f1 + f0;
			f0 = temp;
		}
		return f1;
	}

	public static ArrayList<String> permutations(String word) {
		ArrayList<String> result = new ArrayList<String>();
		if (word.length() <= 1) {
			result.add(word);
		}
		else {
			for (int i=0; i<word.length(); i++) {
				String shorter = word.substring(0, i) + word.substring(i+1, word.length());
				ArrayList<String> shorterList = RecursiveFunctions.permutations(shorter);
				for (String s : shorterList) {
					result.add(word.charAt(i) + s);
				}
			}
			return result;
		}
		return result;
	}
}

