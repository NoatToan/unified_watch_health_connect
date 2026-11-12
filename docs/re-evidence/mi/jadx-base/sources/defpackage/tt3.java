package defpackage;

import cn.hutool.core.text.StrBuilder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class tt3 {
    public static String A(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!G(charSequence) && !qj1.D(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (n(charSequence, charSequence2)) {
                    return charSequence2.toString();
                }
            }
        }
        return null;
    }

    public static int B(CharSequence charSequence, char c) {
        return C(charSequence, c, 0);
    }

    public static int C(CharSequence charSequence, char c, int i) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(c, i) : D(charSequence, c, i, -1);
    }

    public static int D(CharSequence charSequence, char c, int i, int i2) {
        if (G(charSequence)) {
            return -1;
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            i = 0;
        }
        if (i2 > length || i2 < 0) {
            i2 = length;
        }
        while (i < i2) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int E(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        if (charSequence != null && charSequence2 != null) {
            if (i < 0) {
                i = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            if (!z) {
                return charSequence.toString().indexOf(charSequence2.toString(), i);
            }
            while (i < length) {
                if (J(charSequence, i, charSequence2, 0, charSequence2.length(), true)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static boolean F(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!yt3.c(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean G(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean H(CharSequence charSequence) {
        return !F(charSequence);
    }

    public static boolean I(CharSequence charSequence) {
        return !G(charSequence);
    }

    public static boolean J(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        return charSequence.toString().regionMatches(z, i, charSequence2.toString(), i2, i3);
    }

    public static /* synthetic */ boolean K(Character ch) {
        return !yt3.c(ch.charValue());
    }

    public static String L(CharSequence charSequence, String str) {
        return charSequence == null ? str : charSequence.toString();
    }

    public static String M(CharSequence charSequence) {
        return L(charSequence, "");
    }

    public static String N(CharSequence charSequence, int i, char c) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        if (length == i) {
            return charSequence.toString();
        }
        return length > i ? m0(charSequence, i) : T(c, i - length).concat(charSequence.toString());
    }

    public static String O(CharSequence charSequence, char... cArr) {
        if (charSequence == null || p8i.d(cArr)) {
            return j0(charSequence);
        }
        int length = charSequence.length();
        if (length == 0) {
            return j0(charSequence);
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (!p8i.a(cArr, cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String P(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        char lowerCase = Character.toLowerCase(charSequence.charAt(i));
        int i2 = i + 1;
        if (charSequence.length() <= i2) {
            return String.valueOf(lowerCase);
        }
        return lowerCase + charSequence.toString().substring(i2);
    }

    public static String Q(CharSequence charSequence, CharSequence charSequence2) {
        if (G(charSequence) || G(charSequence2)) {
            return j0(charSequence);
        }
        String string = charSequence.toString();
        return string.startsWith(charSequence2.toString()) ? n0(string, charSequence2.length()) : string;
    }

    public static String R(CharSequence charSequence, CharSequence charSequence2) {
        if (G(charSequence) || G(charSequence2)) {
            return j0(charSequence);
        }
        String string = charSequence.toString();
        return string.toLowerCase().startsWith(charSequence2.toString().toLowerCase()) ? n0(string, charSequence2.length()) : string;
    }

    public static String S(CharSequence charSequence, CharSequence charSequence2) {
        if (G(charSequence) || G(charSequence2)) {
            return j0(charSequence);
        }
        String string = charSequence.toString();
        return string.endsWith(charSequence2.toString()) ? m0(string, string.length() - charSequence2.length()) : string;
    }

    public static String T(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static String U(CharSequence charSequence, int i, CharSequence charSequence2) {
        if (i <= 0) {
            return "";
        }
        StrBuilder strBuilderCreate = StrBuilder.create();
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return strBuilderCreate.toString();
            }
            if (z) {
                z = false;
            } else if (I(charSequence2)) {
                strBuilderCreate.append(charSequence2);
            }
            strBuilderCreate.append(charSequence);
            i = i2;
        }
    }

    public static String V(CharSequence charSequence, int i, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        if (G(charSequence) || G(charSequence2)) {
            return j0(charSequence);
        }
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (i > length) {
            return j0(charSequence);
        }
        if (i < 0) {
            i = 0;
        }
        StrBuilder strBuilderCreate = StrBuilder.create(length + 16);
        if (i != 0) {
            strBuilderCreate.append(charSequence.subSequence(0, i));
        }
        while (true) {
            int iE = E(charSequence, charSequence2, i, z);
            if (iE <= -1) {
                break;
            }
            strBuilderCreate.append(charSequence.subSequence(i, iE));
            strBuilderCreate.append(charSequence3);
            i = iE + length2;
        }
        if (i < length) {
            strBuilderCreate.append(charSequence.subSequence(i, length));
        }
        return strBuilderCreate.toString();
    }

    public static String W(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return V(charSequence, 0, charSequence2, charSequence3, false);
    }

    public static List<String> X(CharSequence charSequence, char c) {
        return Y(charSequence, c, 0);
    }

    public static List<String> Y(CharSequence charSequence, char c, int i) {
        return Z(charSequence, c, i, false, false);
    }

    public static List<String> Z(CharSequence charSequence, char c, int i, boolean z, boolean z2) {
        return charSequence == null ? new ArrayList(0) : jio.b(charSequence.toString(), c, i, z, z2);
    }

    public static List<String> a0(CharSequence charSequence, char c, boolean z, boolean z2) {
        return Z(charSequence, c, 0, z, z2);
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        return d(charSequence, charSequence2, charSequence2);
    }

    public static String[] b0(CharSequence charSequence, char c) {
        return c0(charSequence, c, 0);
    }

    public static String c(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence... charSequenceArr) {
        if (charSequence == null || G(charSequence2) || s(charSequence, charSequence2, z)) {
            return j0(charSequence);
        }
        if (qj1.E(charSequenceArr)) {
            for (CharSequence charSequence3 : charSequenceArr) {
                if (s(charSequence, charSequence3, z)) {
                    return charSequence.toString();
                }
            }
        }
        return charSequence.toString().concat(charSequence2.toString());
    }

    public static String[] c0(CharSequence charSequence, char c, int i) {
        return charSequence == null ? new String[0] : jio.d(charSequence.toString(), c, i, false, false);
    }

    public static String d(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        return c(charSequence, charSequence2, false, charSequenceArr);
    }

    public static List<String> d0(CharSequence charSequence, char c) {
        return e0(charSequence, c, -1);
    }

    public static String e(CharSequence charSequence, String str) {
        return F(charSequence) ? str : charSequence.toString();
    }

    public static List<String> e0(CharSequence charSequence, char c, int i) {
        return Z(charSequence, c, i, true, true);
    }

    public static byte[] f(CharSequence charSequence, String str) {
        return g(charSequence, F(str) ? Charset.defaultCharset() : Charset.forName(str));
    }

    public static boolean f0(CharSequence charSequence, char c) {
        return !G(charSequence) && c == charSequence.charAt(0);
    }

    public static byte[] g(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        return charset == null ? charSequence.toString().getBytes() : charSequence.toString().getBytes(charset);
    }

    public static boolean g0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return h0(charSequence, charSequence2, z, false);
    }

    public static String h(CharSequence charSequence) {
        return x(charSequence, new sm9() { // from class: st3
            @Override // defpackage.sm9
            public final boolean accept(Object obj) {
                return tt3.K((Character) obj);
            }
        });
    }

    public static boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        if (charSequence == null || charSequence2 == null) {
            if (z2) {
                return charSequence == null && charSequence2 == null;
            }
            return false;
        }
        if (z ? charSequence.toString().toLowerCase().startsWith(charSequence2.toString().toLowerCase()) : charSequence.toString().startsWith(charSequence2.toString())) {
            return (z2 && v(charSequence, charSequence2, z)) ? false : true;
        }
        return false;
    }

    public static boolean i(CharSequence charSequence, char c) {
        return B(charSequence, c) > -1;
    }

    public static boolean i0(CharSequence charSequence, CharSequence charSequence2) {
        return g0(charSequence, charSequence2, true);
    }

    public static boolean j(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        return charSequence.toString().contains(charSequence2);
    }

    public static String j0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static boolean k(CharSequence charSequence, char... cArr) {
        if (!G(charSequence)) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (p8i.a(cArr, charSequence.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String k0(CharSequence charSequence, int i, int i2) {
        if (G(charSequence)) {
            return j0(charSequence);
        }
        int length = charSequence.length();
        if (i < 0) {
            i += length;
            if (i < 0) {
                i = 0;
            }
        } else if (i > length) {
            i = length;
        }
        if (i2 >= 0 ? i2 > length : (i2 = i2 + length) < 0) {
            i2 = length;
        }
        if (i2 < i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        return i == i2 ? "" : charSequence.toString().substring(i, i2);
    }

    public static boolean l(CharSequence charSequence, CharSequence... charSequenceArr) {
        return z(charSequence, charSequenceArr) != null;
    }

    public static String l0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (G(charSequence) || charSequence2 == null) {
            if (charSequence == null) {
                return null;
            }
            return charSequence.toString();
        }
        String string = charSequence.toString();
        String string2 = charSequence2.toString();
        if (string2.isEmpty()) {
            return "";
        }
        int iLastIndexOf = z ? string.lastIndexOf(string2) : string.indexOf(string2);
        if (-1 == iLastIndexOf) {
            return string;
        }
        return iLastIndexOf == 0 ? "" : string.substring(0, iLastIndexOf);
    }

    public static boolean m(CharSequence charSequence, CharSequence... charSequenceArr) {
        return A(charSequence, charSequenceArr) != null;
    }

    public static String m0(CharSequence charSequence, int i) {
        return k0(charSequence, 0, i);
    }

    public static boolean n(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            return charSequence2 == null;
        }
        return charSequence.toString().toLowerCase().contains(charSequence2.toString().toLowerCase());
    }

    public static String n0(CharSequence charSequence, int i) {
        if (G(charSequence)) {
            return null;
        }
        return k0(charSequence, i, charSequence.length());
    }

    public static int o(CharSequence charSequence, char c) {
        if (G(charSequence)) {
            return 0;
        }
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (c == charSequence.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    public static String o0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String string = charSequence.toString();
        if (!i(string, '_')) {
            return string;
        }
        int length = string.length();
        StringBuilder sb = new StringBuilder(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (cCharAt == '_') {
                z = true;
            } else if (z) {
                sb.append(Character.toUpperCase(cCharAt));
                z = false;
            } else {
                sb.append(Character.toLowerCase(cCharAt));
            }
        }
        return sb.toString();
    }

    public static String p(CharSequence charSequence, String str) {
        return G(charSequence) ? str : charSequence.toString();
    }

    public static String p0(CharSequence charSequence, char c) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        StrBuilder strBuilder = new StrBuilder();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                Character chValueOf = i > 0 ? Character.valueOf(charSequence.charAt(i - 1)) : null;
                Character chValueOf2 = i < charSequence.length() + (-1) ? Character.valueOf(charSequence.charAt(i + 1)) : null;
                if (chValueOf != null) {
                    if (c == chValueOf.charValue()) {
                        if (chValueOf2 == null || Character.isLowerCase(chValueOf2.charValue())) {
                            cCharAt = Character.toLowerCase(cCharAt);
                        }
                    } else if (Character.isLowerCase(chValueOf.charValue())) {
                        strBuilder.append(c);
                        if (chValueOf2 == null || Character.isLowerCase(chValueOf2.charValue())) {
                            cCharAt = Character.toLowerCase(cCharAt);
                        }
                    } else if (chValueOf2 == null || Character.isLowerCase(chValueOf2.charValue())) {
                        strBuilder.append(c);
                        cCharAt = Character.toLowerCase(cCharAt);
                    }
                } else if (chValueOf2 == null || Character.isLowerCase(chValueOf2.charValue())) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
            }
            strBuilder.append(cCharAt);
            i++;
        }
        return strBuilder.toString();
    }

    public static boolean q(CharSequence charSequence, char c) {
        return !G(charSequence) && c == charSequence.charAt(charSequence.length() - 1);
    }

    public static String q0(CharSequence charSequence) {
        return p0(charSequence, '_');
    }

    public static boolean r(CharSequence charSequence, CharSequence charSequence2) {
        return s(charSequence, charSequence2, false);
    }

    public static String r0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return s0(charSequence, 0);
    }

    public static boolean s(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        }
        return z ? charSequence.toString().toLowerCase().endsWith(charSequence2.toString().toLowerCase()) : charSequence.toString().endsWith(charSequence2.toString());
    }

    public static String s0(CharSequence charSequence, int i) {
        return t0(charSequence, i, new Predicate() { // from class: rt3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return yt3.c(((Character) obj).charValue());
            }
        });
    }

    public static boolean t(CharSequence charSequence, CharSequence charSequence2) {
        return s(charSequence, charSequence2, true);
    }

    public static String t0(CharSequence charSequence, int i, Predicate<Character> predicate) {
        int i2;
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i3 = 0;
        if (i <= 0) {
            while (i3 < length && predicate.test(Character.valueOf(charSequence.charAt(i3)))) {
                i3++;
            }
        }
        if (i >= 0) {
            i2 = length;
            while (i3 < i2 && predicate.test(Character.valueOf(charSequence.charAt(i2 - 1)))) {
                i2--;
            }
        } else {
            i2 = length;
        }
        return (i3 > 0 || i2 < length) ? charSequence.toString().substring(i3, i2) : charSequence.toString();
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2) {
        return v(charSequence, charSequence2, false);
    }

    public static String u0(CharSequence charSequence) {
        return s0(charSequence, -1);
    }

    public static boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null) {
            return charSequence2 == null;
        }
        if (charSequence2 == null) {
            return false;
        }
        return z ? charSequence.toString().equalsIgnoreCase(charSequence2.toString()) : charSequence.toString().contentEquals(charSequence2);
    }

    public static String v0(CharSequence charSequence, char c) {
        return w0(charSequence, c, c);
    }

    public static boolean w(CharSequence charSequence, CharSequence charSequence2) {
        return v(charSequence, charSequence2, true);
    }

    public static String w0(CharSequence charSequence, char c, char c2) {
        if (G(charSequence)) {
            return j0(charSequence);
        }
        return (charSequence.charAt(0) == c && charSequence.charAt(charSequence.length() - 1) == c2) ? k0(charSequence, 1, charSequence.length() - 1) : charSequence.toString();
    }

    public static String x(CharSequence charSequence, sm9<Character> sm9Var) {
        if (charSequence == null || sm9Var == null) {
            return j0(charSequence);
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (sm9Var.accept(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String x0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 0) {
            char cCharAt = charSequence.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                return Character.toUpperCase(cCharAt) + n0(charSequence, 1);
            }
        }
        return charSequence.toString();
    }

    public static String y(CharSequence charSequence, Object... objArr) {
        if (charSequence == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return (qj1.D(objArr) || F(charSequence)) ? charSequence.toString() : fio.a(charSequence.toString(), objArr);
    }

    public static String y0(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return null;
        }
        return str + x0(charSequence);
    }

    public static String z(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!G(charSequence) && !qj1.D(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence.toString().contains(charSequence2)) {
                    return charSequence2.toString();
                }
            }
        }
        return null;
    }

    public static byte[] z0(CharSequence charSequence) {
        return g(charSequence, au3.f3449b);
    }
}
