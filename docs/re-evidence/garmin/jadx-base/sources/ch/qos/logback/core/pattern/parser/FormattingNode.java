package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

/* JADX INFO: loaded from: classes7.dex */
public class FormattingNode extends Node {
    FormatInfo formatInfo;

    public FormattingNode(int i14) {
        super(i14);
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof FormattingNode)) {
            return false;
        }
        FormatInfo formatInfo = this.formatInfo;
        FormatInfo formatInfo2 = ((FormattingNode) obj).formatInfo;
        if (formatInfo != null) {
            return formatInfo.equals(formatInfo2);
        }
        return formatInfo2 == null;
    }

    public FormatInfo getFormatInfo() {
        return this.formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        FormatInfo formatInfo = this.formatInfo;
        return iHashCode + (formatInfo != null ? formatInfo.hashCode() : 0);
    }

    public void setFormatInfo(FormatInfo formatInfo) {
        this.formatInfo = formatInfo;
    }

    public FormattingNode(int i14, Object obj) {
        super(i14, obj);
    }
}
