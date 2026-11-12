package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes3.dex */
public class CharSequenceUtils {
    public static boolean regionMatches(CharSequence charSequence, boolean z14, int i14, CharSequence charSequence2, int i15, int i16) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z14, i14, (String) charSequence2, i15, i16);
        }
        while (true) {
            int i17 = i16 - 1;
            if (i16 <= 0) {
                return true;
            }
            int i18 = i14 + 1;
            char cCharAt = charSequence.charAt(i14);
            int i19 = i15 + 1;
            char cCharAt2 = charSequence2.charAt(i15);
            if (cCharAt != cCharAt2) {
                if (!z14) {
                    return false;
                }
                if (Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                    return false;
                }
            }
            i14 = i18;
            i16 = i17;
            i15 = i19;
        }
    }
}
