package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.Range;

/* JADX INFO: loaded from: classes3.dex */
public class NumericEntityEscaper extends CodePointTranslator {
    private final boolean between;
    private final Range<Integer> range;

    private NumericEntityEscaper(int i14, int i15, boolean z14) {
        this.range = Range.between(Integer.valueOf(i14), Integer.valueOf(i15));
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

    @Override // org.apache.commons.text.translate.CodePointTranslator
    public boolean translate(int i14, Writer writer) throws IOException {
        if (this.between != this.range.contains(Integer.valueOf(i14))) {
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
