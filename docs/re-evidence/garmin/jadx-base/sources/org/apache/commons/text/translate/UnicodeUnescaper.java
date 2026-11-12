package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public class UnicodeUnescaper extends CharSequenceTranslator {
    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i14, Writer writer) throws IOException {
        int i15;
        int i16;
        if (charSequence.charAt(i14) != '\\' || (i15 = i14 + 1) >= charSequence.length() || charSequence.charAt(i15) != 'u') {
            return 0;
        }
        int i17 = 2;
        while (true) {
            i16 = i14 + i17;
            if (i16 >= charSequence.length() || charSequence.charAt(i16) != 'u') {
                break;
            }
            i17++;
        }
        if (i16 < charSequence.length() && charSequence.charAt(i16) == '+') {
            i17++;
        }
        int i18 = i14 + i17;
        int i19 = i18 + 4;
        if (i19 > charSequence.length()) {
            e.r("Less than 4 hex digits in unicode value: '", charSequence.subSequence(i14, charSequence.length()), "' due to end of CharSequence");
            return 0;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i18, i19);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i17 + 4;
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e4);
        }
    }
}
