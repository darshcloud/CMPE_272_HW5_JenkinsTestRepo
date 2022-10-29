
public class NumberPalindrome {

	public static void main(String[] args) {
		// NumberPalindrome
		isPalindrome(121);

	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int originalNum = number;

		while (number != 0) {
			int lastDigit = number % 10; // logic for palindrome
			reverse = (reverse * 10);
			reverse += lastDigit;
			number /= 10;
		}

		System.out.println("printing reverse:: " + reverse);
		if (originalNum == reverse) {
			System.out.println("Entered Number is a palindrome");
			return true;
		} else {
			System.out.println("Entered number is not a palindrome");
			return false;
		}
	}

}
