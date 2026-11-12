package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class CharUtils {
    public static final char CR = '\r';
    public static final char LF = '\n';
    public static final char NUL = 0;
    private static final String[] CHAR_STRING_ARRAY = new String[128];
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        char c14 = 0;
        while (true) {
            String[] strArr = CHAR_STRING_ARRAY;
            if (c14 >= strArr.length) {
                return;
            }
            strArr[c14] = String.valueOf(c14);
            c14 = (char) (c14 + 1);
        }
    }

    public static int compare(char c14, char c15) {
        return c14 - c15;
    }

    public static boolean isAscii(char c14) {
        return c14 < 128;
    }

    public static boolean isAsciiAlpha(char c14) {
        return isAsciiAlphaUpper(c14) || isAsciiAlphaLower(c14);
    }

    public static boolean isAsciiAlphaLower(char c14) {
        return c14 >= 'a' && c14 <= 'z';
    }

    public static boolean isAsciiAlphaUpper(char c14) {
        return c14 >= 'A' && c14 <= 'Z';
    }

    public static boolean isAsciiAlphanumeric(char c14) {
        return isAsciiAlpha(c14) || isAsciiNumeric(c14);
    }

    public static boolean isAsciiControl(char c14) {
        return c14 < ' ' || c14 == 127;
    }

    public static boolean isAsciiNumeric(char c14) {
        return c14 >= '0' && c14 <= '9';
    }

    public static boolean isAsciiPrintable(char c14) {
        return c14 >= ' ' && c14 < 127;
    }

    public static char toChar(Character ch3) {
        Validate.notNull(ch3, "ch", new Object[0]);
        return ch3.charValue();
    }

    public static Character toCharacterObject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int toIntValue(char c14) {
        if (isAsciiNumeric(c14)) {
            return c14 - '0';
        }
        com.nimbusds.jose.shaded.gson.internal.a.n(c14, "The character ", " is not in the range '0' - '9'");
        return 0;
    }

    public static String toString(char c14) {
        return c14 < 128 ? CHAR_STRING_ARRAY[c14] : new String(new char[]{c14});
    }

    public static String unicodeEscaped(char c14) {
        StringBuilder sb3 = new StringBuilder("\\u");
        char[] cArr = HEX_DIGITS;
        sb3.append(cArr[(c14 >> '\f') & 15]);
        sb3.append(cArr[(c14 >> '\b') & 15]);
        sb3.append(cArr[(c14 >> 4) & 15]);
        sb3.append(cArr[c14 & 15]);
        return sb3.toString();
    }

    public static char toChar(Character ch3, char c14) {
        return ch3 == null ? c14 : ch3.charValue();
    }

    public static char toChar(String str) {
        Validate.notEmpty(str, "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static char toChar(String str, char c14) {
        return StringUtils.isEmpty(str) ? c14 : str.charAt(0);
    }

    @Deprecated
    public static Character toCharacterObject(char c14) {
        return Character.valueOf(c14);
    }

    public static int toIntValue(char c14, int i14) {
        return !isAsciiNumeric(c14) ? i14 : c14 - '0';
    }

    public static int toIntValue(Character ch3) {
        Validate.notNull(ch3, "ch", new Object[0]);
        return toIntValue(ch3.charValue());
    }

    public static int toIntValue(Character ch3, int i14) {
        return ch3 == null ? i14 : toIntValue(ch3.charValue(), i14);
    }

    public static String toString(Character ch3) {
        if (ch3 == null) {
            return null;
        }
        return toString(ch3.charValue());
    }

    public static String unicodeEscaped(Character ch3) {
        if (ch3 == null) {
            return null;
        }
        return unicodeEscaped(ch3.charValue());
    }
}
