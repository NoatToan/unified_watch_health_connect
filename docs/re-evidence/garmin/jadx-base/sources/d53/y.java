package d53;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class y extends x {
    public static String n0(int i14, String str) {
        str.getClass();
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i14 > length) {
            i14 = length;
        }
        return str.substring(i14);
    }

    public static String o0(int i14, String str) {
        str.getClass();
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i14;
        if (length < 0) {
            length = 0;
        }
        return s0(length, str);
    }

    public static char p0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        n23.j.s("Char sequence is empty.");
        return (char) 0;
    }

    public static Character q0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char r0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        n23.j.s("Char sequence is empty.");
        return (char) 0;
    }

    public static String s0(int i14, String str) {
        str.getClass();
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i14 > length) {
            i14 = length;
        }
        return str.substring(0, i14);
    }

    public static String t0(int i14, String str) {
        str.getClass();
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i14 > length) {
            i14 = length;
        }
        return str.substring(length - i14);
    }
}
