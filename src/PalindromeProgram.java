import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string for checking as palindrome: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is Not Palindrome");
        }
    }

    static boolean isPalindrome(String word) {
        int forwardIndex = 0, backwardIndex = word.length() - 1;
        while (forwardIndex <= backwardIndex ){
            char startChar = word.charAt(forwardIndex);
            char endChar = word.charAt(backwardIndex);
            if (startChar != endChar){
                return  false;
            }
            forwardIndex++;
            backwardIndex--;
        }
        return true;
    }
}
