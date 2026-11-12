package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class PatternLayoutEncoderBase<E> extends LayoutWrappingEncoder<E> {
    protected boolean outputPatternAsHeader = false;
    String pattern;

    public String getPattern() {
        return this.pattern;
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public boolean isOutputPatternAsPresentationHeader() {
        return this.outputPatternAsHeader;
    }

    @Override // ch.qos.logback.core.encoder.LayoutWrappingEncoder
    public void setLayout(Layout<E> layout) {
        throw new UnsupportedOperationException("one cannot set the layout of ".concat(getClass().getName()));
    }

    public void setOutputPatternAsHeader(boolean z14) {
        this.outputPatternAsHeader = z14;
    }

    public void setOutputPatternAsPresentationHeader(boolean z14) {
        addWarn("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
        this.outputPatternAsHeader = z14;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }
}
