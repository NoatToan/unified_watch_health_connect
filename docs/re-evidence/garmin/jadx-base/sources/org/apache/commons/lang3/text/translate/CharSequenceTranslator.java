package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class CharSequenceTranslator {
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String hex(int i14) {
        return Integer.toHexString(i14).toUpperCase(Locale.ENGLISH);
    }

    public abstract int translate(CharSequence charSequence, int i14, Writer writer);

    public final void translate(CharSequence charSequence, Writer writer) throws IOException {
        if (writer == null) {
            h.s("The Writer must not be null");
            return;
        }
        if (charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iTranslate = translate(charSequence, iCharCount, writer);
            if (iTranslate == 0) {
                char cCharAt = charSequence.charAt(iCharCount);
                writer.write(cCharAt);
                int i14 = iCharCount + 1;
                if (Character.isHighSurrogate(cCharAt) && i14 < length) {
                    char cCharAt2 = charSequence.charAt(i14);
                    if (Character.isLowSurrogate(cCharAt2)) {
                        writer.write(cCharAt2);
                        iCharCount += 2;
                    }
                }
                iCharCount = i14;
            } else {
                for (int i15 = 0; i15 < iTranslate; i15++) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                }
            }
        }
    }

    public final CharSequenceTranslator with(CharSequenceTranslator... charSequenceTranslatorArr) {
        CharSequenceTranslator[] charSequenceTranslatorArr2 = new CharSequenceTranslator[charSequenceTranslatorArr.length + 1];
        charSequenceTranslatorArr2[0] = this;
        System.arraycopy(charSequenceTranslatorArr, 0, charSequenceTranslatorArr2, 1, charSequenceTranslatorArr.length);
        return new AggregateTranslator(charSequenceTranslatorArr2);
    }

    public final String translate(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            translate(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e4) {
            c.p(e4);
            return null;
        }
    }
}
