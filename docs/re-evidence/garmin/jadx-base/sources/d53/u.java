package d53;

import ds.e0;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class u extends t {
    @o13.e
    public static String k(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb3.append(titleCase);
        } else {
            String upperCase = str.substring(0, 1).toUpperCase(locale);
            upperCase.getClass();
            sb3.append(upperCase);
        }
        sb3.append(str.substring(1));
        return sb3.toString();
    }

    public static int l(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.compareToIgnoreCase(str2);
    }

    public static boolean m(CharSequence charSequence, CharSequence charSequence2) {
        boolean z14 = charSequence instanceof String;
        if (z14 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z14 && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (charSequence.charAt(i14) == charSequence2.charAt(i14)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String n(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, c.f57666b);
    }

    public static byte[] o(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(c.f57666b);
        bytes.getClass();
        return bytes;
    }

    public static boolean p(String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        return !z14 ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean q(String str, String str2, boolean z14) {
        if (str == null) {
            return str2 == null;
        }
        return !z14 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static void s(x0 x0Var) {
        x0Var.getClass();
        String.CASE_INSENSITIVE_ORDER.getClass();
    }

    public static boolean t(String str, int i14, String str2, int i15, int i16, boolean z14) {
        str.getClass();
        str2.getClass();
        return !z14 ? str.regionMatches(i14, str2, i15, i16) : str.regionMatches(z14, i14, str2, i15, i16);
    }

    public static String u(String str, int i14) {
        str.getClass();
        if (i14 < 0) {
            vb.h.x(e0.i("Count 'n' must be non-negative, but was ", i14, '.'));
            return null;
        }
        if (i14 == 0) {
            return "";
        }
        int i15 = 1;
        if (i14 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb3 = new StringBuilder(str.length() * i14);
            if (1 <= i14) {
                while (true) {
                    sb3.append((CharSequence) str);
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
            return sb3.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            cArr[i16] = cCharAt;
        }
        return new String(cArr);
    }

    public static String v(String str, String str2, String str3, boolean z14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        int i14 = 0;
        int iE = w.E(str, str2, 0, z14);
        if (iE < 0) {
            return str;
        }
        int length = str2.length();
        int i15 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            com.google.protobuf.a.b();
            return null;
        }
        StringBuilder sb3 = new StringBuilder(length2);
        do {
            sb3.append((CharSequence) str, i14, iE);
            sb3.append(str3);
            i14 = iE + length;
            if (iE >= str.length()) {
                break;
            }
            iE = w.E(str, str2, iE + i15, z14);
        } while (iE > 0);
        sb3.append((CharSequence) str, i14, str.length());
        return sb3.toString();
    }

    public static String w(String str, char c14, char c15) {
        str.getClass();
        String strReplace = str.replace(c14, c15);
        strReplace.getClass();
        return strReplace;
    }

    public static boolean x(int i14, String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        return !z14 ? str.startsWith(str2, i14) : t(str, i14, str2, 0, str2.length(), z14);
    }

    public static boolean y(String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        return !z14 ? str.startsWith(str2) : t(str, 0, str2, 0, str2.length(), z14);
    }
}
