package dev.sharathk.playground;

public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isPalindrome(String text) {
        // TODO: ignore case and spaces
        return new StringBuilder(text).reverse().toString().equals(text);
    }
}
