package ch.qos.logback.core.pattern;

import am.j;
import hb.a;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class FormatInfo {
    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo() {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
    }

    public static FormatInfo valueOf(String str) {
        String strSubstring;
        if (str == null) {
            x.l("Argument cannot be null");
            return null;
        }
        FormatInfo formatInfo = new FormatInfo();
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            int i14 = iIndexOf + 1;
            if (i14 == str.length()) {
                h.s(j.m("Formatting string [", str, "] should not end with '.'"));
                return null;
            }
            strSubstring = str.substring(i14);
            str = strSubstring2;
        } else {
            strSubstring = null;
        }
        if (str.length() > 0) {
            int i15 = Integer.parseInt(str);
            if (i15 >= 0) {
                formatInfo.min = i15;
            } else {
                formatInfo.min = -i15;
                formatInfo.leftPad = false;
            }
        }
        if (strSubstring != null && strSubstring.length() > 0) {
            int i16 = Integer.parseInt(strSubstring);
            if (i16 >= 0) {
                formatInfo.max = i16;
                return formatInfo;
            }
            formatInfo.max = -i16;
            formatInfo.leftTruncate = false;
        }
        return formatInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatInfo)) {
            return false;
        }
        FormatInfo formatInfo = (FormatInfo) obj;
        return this.min == formatInfo.min && this.max == formatInfo.max && this.leftPad == formatInfo.leftPad && this.leftTruncate == formatInfo.leftTruncate;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((((this.min * 31) + this.max) * 31) + (this.leftPad ? 1 : 0)) * 31) + (this.leftTruncate ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.leftPad;
    }

    public boolean isLeftTruncate() {
        return this.leftTruncate;
    }

    public void setLeftPad(boolean z14) {
        this.leftPad = z14;
    }

    public void setLeftTruncate(boolean z14) {
        this.leftTruncate = z14;
    }

    public void setMax(int i14) {
        this.max = i14;
    }

    public void setMin(int i14) {
        this.min = i14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("FormatInfo(");
        sb3.append(this.min);
        sb3.append(", ");
        sb3.append(this.max);
        sb3.append(", ");
        sb3.append(this.leftPad);
        sb3.append(", ");
        return a.k(sb3, this.leftTruncate, ")");
    }

    public FormatInfo(int i14, int i15) {
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i14;
        this.max = i15;
    }

    public FormatInfo(int i14, int i15, boolean z14, boolean z15) {
        this.min = i14;
        this.max = i15;
        this.leftPad = z14;
        this.leftTruncate = z15;
    }
}
