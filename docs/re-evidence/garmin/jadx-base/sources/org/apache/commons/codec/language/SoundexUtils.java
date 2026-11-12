package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
final class SoundexUtils {
    public static String clean(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (Character.isLetter(str.charAt(i15))) {
                cArr[i14] = str.charAt(i15);
                i14++;
            }
        }
        return i14 == length ? str.toUpperCase(Locale.ENGLISH) : new String(cArr, 0, i14).toUpperCase(Locale.ENGLISH);
    }

    public static int difference(StringEncoder stringEncoder, String str, String str2) {
        return differenceEncoded(stringEncoder.encode(str), stringEncoder.encode(str2));
    }

    public static int differenceEncoded(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i14 = 0;
        for (int i15 = 0; i15 < iMin; i15++) {
            if (str.charAt(i15) == str2.charAt(i15)) {
                i14++;
            }
        }
        return i14;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
