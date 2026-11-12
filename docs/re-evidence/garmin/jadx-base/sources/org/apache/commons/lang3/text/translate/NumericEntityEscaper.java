package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class NumericEntityEscaper extends CodePointTranslator {
    private final int above;
    private final int below;
    private final boolean between;

    private NumericEntityEscaper(int i14, int i15, boolean z14) {
        this.below = i14;
        this.above = i15;
        this.between = z14;
    }

    public static NumericEntityEscaper above(int i14) {
        return outsideOf(0, i14);
    }

    public static NumericEntityEscaper below(int i14) {
        return outsideOf(i14, Integer.MAX_VALUE);
    }

    public static NumericEntityEscaper between(int i14, int i15) {
        return new NumericEntityEscaper(i14, i15, true);
    }

    public static NumericEntityEscaper outsideOf(int i14, int i15) {
        return new NumericEntityEscaper(i14, i15, false);
    }

    @Override // org.apache.commons.lang3.text.translate.CodePointTranslator
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
        writer.write("&#");
        writer.write(Integer.toString(i14, 10));
        writer.write(59);
        return true;
    }

    public NumericEntityEscaper() {
        this(0, Integer.MAX_VALUE, true);
    }
}
