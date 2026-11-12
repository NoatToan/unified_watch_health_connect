package ch.qos.logback.core.pattern;

import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FormattingConverter<E> extends Converter<E> {
    static final int INITIAL_BUF_SIZE = 256;
    static final int MAX_CAPACITY = 1024;
    FormatInfo formattingInfo;

    public final FormatInfo getFormattingInfo() {
        return this.formattingInfo;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.formattingInfo == null) {
            this.formattingInfo = formatInfo;
        } else {
            h.z("FormattingInfo has been already set");
        }
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public final void write(StringBuilder sb3, E e4) {
        String strConvert = convert(e4);
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo == null) {
            sb3.append(strConvert);
            return;
        }
        int min = formatInfo.getMin();
        int max = this.formattingInfo.getMax();
        if (strConvert == null) {
            if (min > 0) {
                SpacePadder.spacePad(sb3, min);
                return;
            }
            return;
        }
        int length = strConvert.length();
        if (length > max) {
            sb3.append(this.formattingInfo.isLeftTruncate() ? strConvert.substring(length - max) : strConvert.substring(0, max));
            return;
        }
        if (length >= min) {
            sb3.append(strConvert);
        } else if (this.formattingInfo.isLeftPad()) {
            SpacePadder.leftPad(sb3, strConvert, min);
        } else {
            SpacePadder.rightPad(sb3, strConvert, min);
        }
    }
}
