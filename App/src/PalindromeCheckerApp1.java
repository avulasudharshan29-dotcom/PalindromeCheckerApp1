public class PalindromeCheckerApp1 {

    public static boolean isPalindrome(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        String input = "madam";

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
System.out.println("Welcome to the Palindrome Checker Application!");
