package g22;

import android.icu.text.BreakIterator;
import d53.w;
import j20.x;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public static final String a(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb3 = new StringBuilder();
        String strValueOf = String.valueOf(lowerCase.charAt(0));
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        sb3.append((Object) upperCase);
        sb3.append(lowerCase.substring(1));
        return sb3.toString();
    }

    public static String b(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return h0.k0(w.W(lowerCase, new String[]{StringUtils.SPACE}), StringUtils.SPACE, null, null, new g11.e(6), 30);
    }

    public static final int c(String str) {
        str.getClass();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i14 = 0;
        while (characterInstance.next() != -1) {
            i14++;
        }
        return i14;
    }

    public static final boolean d(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final String e(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        return x.f(locale, str, locale);
    }

    public static final String f(String str) {
        str.getClass();
        return "\u200b\u200c\u200b".concat(str);
    }

    public static final String g(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        return upperCase;
    }

    public static String h(String str) {
        str.getClass();
        return h0.k0(w.W(str, new String[]{StringUtils.SPACE}), StringUtils.SPACE, null, null, new g11.e(5), 30);
    }
}
