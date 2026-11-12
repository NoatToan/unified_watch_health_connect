package d53;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class b extends a {
    public static boolean d(char c14, char c15, boolean z14) {
        if (c14 == c15) {
            return true;
        }
        if (!z14) {
            return false;
        }
        char upperCase = Character.toUpperCase(c14);
        char upperCase2 = Character.toUpperCase(c15);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String e(char c14) {
        String strValueOf = String.valueOf(c14);
        strValueOf.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c14));
        }
        if (c14 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String lowerCase = upperCase.substring(1).toLowerCase(locale);
        lowerCase.getClass();
        return cCharAt + lowerCase;
    }
}
