package org.apache.commons.io.input;

import am.j;
import ds.e0;
import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.lang3.e;
import tn.k;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;
    private final Integer end;
    private int idx;
    private int mark;
    private final int start;

    public CharSequenceReader(String str, int i14, int i15) {
        if (i14 < 0) {
            h.s(j.h(i14, "Start index is less than zero: "));
            throw null;
        }
        if (i15 < i14) {
            h.s(k.e(i14, i15, "End index is less than start ", ": "));
            throw null;
        }
        this.charSequence = str == null ? "" : str;
        this.start = i14;
        this.end = Integer.valueOf(i15);
        this.idx = i14;
        this.mark = i14;
    }

    private int end() {
        int length = this.charSequence.length();
        Integer num = this.end;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    private int start() {
        return Math.min(this.charSequence.length(), this.start);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i14 = this.start;
        this.idx = i14;
        this.mark = i14;
    }

    @Override // java.io.Reader
    public void mark(int i14) {
        this.mark = this.idx;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) {
        if (this.idx >= end()) {
            return -1;
        }
        Objects.requireNonNull(cArr, "array");
        if (i15 < 0 || i14 < 0 || i14 + i15 > cArr.length) {
            StringBuilder sb3 = new StringBuilder("Array Size=");
            e0.m(cArr.length, i14, ", offset=", ", length=", sb3);
            l2.j(i15, sb3);
            return 0;
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof String) {
            int iMin = Math.min(i15, end() - this.idx);
            String str = (String) this.charSequence;
            int i16 = this.idx;
            str.getChars(i16, i16 + iMin, cArr, i14);
            this.idx += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i15, end() - this.idx);
            StringBuilder sb4 = (StringBuilder) this.charSequence;
            int i17 = this.idx;
            sb4.getChars(i17, i17 + iMin2, cArr, i14);
            this.idx += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i15, end() - this.idx);
            StringBuffer stringBuffer = (StringBuffer) this.charSequence;
            int i18 = this.idx;
            stringBuffer.getChars(i18, i18 + iMin3, cArr, i14);
            this.idx += iMin3;
            return iMin3;
        }
        int i19 = 0;
        for (int i24 = 0; i24 < i15; i24++) {
            int i25 = read();
            if (i25 == -1) {
                break;
            }
            cArr[i14 + i24] = (char) i25;
            i19++;
        }
        return i19;
    }

    @Override // java.io.Reader
    public boolean ready() {
        return this.idx < end();
    }

    @Override // java.io.Reader
    public void reset() {
        this.idx = this.mark;
    }

    @Override // java.io.Reader
    public long skip(long j8) {
        if (j8 < 0) {
            h.s(e.e(j8, "Number of characters to skip is less than zero: "));
            return 0L;
        }
        if (this.idx >= end()) {
            return 0L;
        }
        int iMin = (int) Math.min(end(), ((long) this.idx) + j8);
        int i14 = iMin - this.idx;
        this.idx = iMin;
        return i14;
    }

    public String toString() {
        return this.charSequence.subSequence(start(), end()).toString();
    }

    public CharSequenceReader(CharSequence charSequence, int i14) {
        this(charSequence, i14, Integer.MAX_VALUE);
    }

    public CharSequenceReader(CharSequence charSequence) {
        this(charSequence, 0);
    }

    @Override // java.io.Reader
    public int read() {
        if (this.idx >= end()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i14 = this.idx;
        this.idx = i14 + 1;
        return charSequence.charAt(i14);
    }
}
