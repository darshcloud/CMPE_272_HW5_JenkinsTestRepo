
public class StringPalindrome {

	public static void main(String[] args) {
		// String Palindrome
		isPalindrome("nitin");

	}

	private static boolean isPalindrome(String str) {
		if (str != null) {
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			String reverseString = sb.toString();
			if (str.equals(reverseString)) {
				System.out.println("Entered String is a Palindrome");
				return true;
			} else {
				System.out.println("Entered String is not a Palindrome");
				return false;
			}
		}
		System.out.println("String value not entered");
		return false;
	}

}
