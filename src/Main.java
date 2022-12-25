public class Main {
    public static void main(String[] args) {
        System.out.println(checkIsPalindrome("ротор"));
        System.out.println(checkIsPalindrome("мотор"));
        System.out.println(checkIsPalindrome("кабак"));
        System.out.println(checkIsPalindrome("наворован"));

    }

    public static boolean checkIsPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}