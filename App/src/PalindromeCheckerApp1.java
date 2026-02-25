import java.util.Stack;
public class PalindromeCheckerApp1 {
    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
// File: UseCase4PalindromeCheckerApp.java
import java.util.Scanner;

public class PalindromeCheckerApp1 {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC4: Character Array Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }
        scanner.close();
    }
}