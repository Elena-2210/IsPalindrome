public class PalindromeWord {


    public static void main(String[] args) {
         String someWord = "level";

        System.out.println(isPalindrome(someWord));
    }


    public static boolean isPalindrome(String ourWord) {

        if (ourWord.length() == 1 || ourWord.length() == 0) {
            return true;
        }
        if (ourWord.charAt(0) == ourWord.charAt(ourWord.length() - 1)) {
            return isPalindrome(ourWord.substring(1, ourWord.length() - 1));
        }
        return false;
    }

}
