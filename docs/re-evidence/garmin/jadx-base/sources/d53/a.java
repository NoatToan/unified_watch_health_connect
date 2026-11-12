package d53;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class a {
    public static void a(int i14) {
        if (2 > i14 || i14 >= 37) {
            com.nimbusds.jose.shaded.gson.internal.a.v(b71.i.i(i14, "radix ", " was not in valid range "), new j23.l(2, 36));
        }
    }

    public static boolean b(char c14) {
        return Character.isWhitespace(c14) || Character.isSpaceChar(c14);
    }

    public static String c(char c14, Locale locale) {
        locale.getClass();
        String strValueOf = String.valueOf(c14);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c14);
            strValueOf2.getClass();
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c14));
            }
        } else if (c14 != 329) {
            char cCharAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return cCharAt + lowerCase;
        }
        return upperCase;
    }
}
