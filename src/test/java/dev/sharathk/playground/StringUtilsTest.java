package dev.sharathk.playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void detectsSimplePalindrome() {
        assertTrue(StringUtils.isPalindrome("level"));
    }

    @Test
    void ignoresCaseAndSpaces() {
        assertTrue(StringUtils.isPalindrome("Never odd or even"));
    }
}
