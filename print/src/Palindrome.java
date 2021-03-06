import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String text) {
        String help = "";
        for (int i = text.length()-1; i >= 0; i--){
            help += text.charAt(i);
        }
        if (help.equals(text)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        }
        else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
