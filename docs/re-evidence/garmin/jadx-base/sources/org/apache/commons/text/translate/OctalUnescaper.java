package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class OctalUnescaper extends CharSequenceTranslator {
    private boolean isOctalDigit(char c14) {
        return c14 >= '0' && c14 <= '7';
    }

    private boolean isZeroToThree(char c14) {
        return c14 >= '0' && c14 <= '3';
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i14, Writer writer) throws IOException {
        int length = (charSequence.length() - i14) - 1;
        StringBuilder sb3 = new StringBuilder();
        if (charSequence.charAt(i14) != '\\' || length <= 0) {
            return 0;
        }
        int i15 = i14 + 1;
        if (!isOctalDigit(charSequence.charAt(i15))) {
            return 0;
        }
        int i16 = i14 + 2;
        int i17 = i14 + 3;
        sb3.append(charSequence.charAt(i15));
        if (length > 1 && isOctalDigit(charSequence.charAt(i16))) {
            sb3.append(charSequence.charAt(i16));
            if (length > 2 && isZeroToThree(charSequence.charAt(i15)) && isOctalDigit(charSequence.charAt(i17))) {
                sb3.append(charSequence.charAt(i17));
            }
        }
        writer.write(Integer.parseInt(sb3.toString(), 8));
        return sb3.length() + 1;
    }
}
