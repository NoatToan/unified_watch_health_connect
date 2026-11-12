package org.apache.commons.lang3.text;

import java.util.Formattable;
import java.util.Formatter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FormattableUtils {
    private static final String SIMPLEST_FORMAT = "%s";

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i14, int i15, int i16, char c14, CharSequence charSequence2) {
        Validate.isTrue(charSequence2 == null || i16 < 0 || charSequence2.length() <= i16, "Specified ellipsis '%1$s' exceeds precision of %2$s", charSequence2, Integer.valueOf(i16));
        StringBuilder sb3 = new StringBuilder(charSequence);
        if (i16 >= 0 && i16 < charSequence.length()) {
            CharSequence charSequence3 = (CharSequence) ObjectUtils.defaultIfNull(charSequence2, "");
            sb3.replace(i16 - charSequence3.length(), charSequence.length(), charSequence3.toString());
        }
        boolean z14 = (i14 & 1) == 1;
        for (int length = sb3.length(); length < i15; length++) {
            sb3.insert(z14 ? length : 0, c14);
        }
        formatter.format(sb3.toString(), new Object[0]);
        return formatter;
    }

    public static String toString(Formattable formattable) {
        return String.format(SIMPLEST_FORMAT, formattable);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i14, int i15, int i16, char c14) {
        return append(charSequence, formatter, i14, i15, i16, c14, null);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i14, int i15, int i16, CharSequence charSequence2) {
        return append(charSequence, formatter, i14, i15, i16, ' ', charSequence2);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i14, int i15, int i16) {
        return append(charSequence, formatter, i14, i15, i16, ' ', null);
    }
}
