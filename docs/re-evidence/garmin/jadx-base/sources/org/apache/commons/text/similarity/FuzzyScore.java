package org.apache.commons.text.similarity;

import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FuzzyScore {
    private final Locale locale;

    public FuzzyScore(Locale locale) {
        if (locale != null) {
            this.locale = locale;
        } else {
            h.s("Locale must not be null");
            throw null;
        }
    }

    public Integer fuzzyScore(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase(this.locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(this.locale);
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < lowerCase2.length(); i17++) {
            char cCharAt = lowerCase2.charAt(i17);
            boolean z14 = false;
            while (i16 < lowerCase.length() && !z14) {
                if (cCharAt == lowerCase.charAt(i16)) {
                    int i18 = i15 + 1;
                    if (i14 + 1 == i16) {
                        i18 = i15 + 3;
                    }
                    i15 = i18;
                    z14 = true;
                    i14 = i16;
                }
                i16++;
            }
        }
        return Integer.valueOf(i15);
    }

    public Locale getLocale() {
        return this.locale;
    }
}
