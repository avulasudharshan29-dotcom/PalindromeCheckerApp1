public class PalindromeCheckerApp1 {
    public static boolean isPalindrome(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return text.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Application!");

        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
}
System.out.println("Welcome to the Palindrome Checker Application!");
