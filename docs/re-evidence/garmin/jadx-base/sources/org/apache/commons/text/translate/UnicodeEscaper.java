package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class UnicodeEscaper extends CodePointTranslator {
    private final int above;
    private final int below;
    private final boolean between;

    public UnicodeEscaper(int i14, int i15, boolean z14) {
        this.below = i14;
        this.above = i15;
        this.between = z14;
    }

    public static UnicodeEscaper above(int i14) {
        return outsideOf(0, i14);
    }

    public static UnicodeEscaper below(int i14) {
        return outsideOf(i14, Integer.MAX_VALUE);
    }

    public static UnicodeEscaper between(int i14, int i15) {
        return new UnicodeEscaper(i14, i15, true);
    }

    public static UnicodeEscaper outsideOf(int i14, int i15) {
        return new UnicodeEscaper(i14, i15, false);
    }

    public String toUtf16Escape(int i14) {
        return "\\u" + CharSequenceTranslator.hex(i14);
    }

    @Override // org.apache.commons.text.translate.CodePointTranslator
    public boolean translate(int i14, Writer writer) throws IOException {
        boolean z14 = this.between;
        int i15 = this.below;
        if (z14) {
            if (i14 < i15 || i14 > this.above) {
                return false;
            }
        } else if (i14 >= i15 && i14 <= this.above) {
            return false;
        }
        if (i14 > 65535) {
            writer.write(toUtf16Escape(i14));
            return true;
        }
        writer.write("\\u");
        char[] cArr = CharSequenceTranslator.HEX_DIGITS;
        writer.write(cArr[(i14 >> 12) & 15]);
        writer.write(cArr[(i14 >> 8) & 15]);
        writer.write(cArr[(i14 >> 4) & 15]);
        writer.write(cArr[i14 & 15]);
        return true;
    }

    public UnicodeEscaper() {
        this(0, Integer.MAX_VALUE, true);
    }
}
