package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence a;
    private int b;
    private int c;

    public CharSequenceReader(String str) {
        this.a = str == null ? "" : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        this.c = this.b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.b >= this.a.length()) {
            return -1;
        }
        CharSequence charSequence = this.a;
        int i = this.b;
        this.b = i + 1;
        return charSequence.charAt(i);
    }

    @Override // java.io.Reader
    public void reset() {
        this.b = this.c;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j);
        }
        if (this.b >= this.a.length()) {
            return -1L;
        }
        int iMin = (int) Math.min(this.a.length(), ((long) this.b) + j);
        int i = iMin - this.b;
        this.b = iMin;
        return i;
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        if (this.b >= this.a.length()) {
            return -1;
        }
        Objects.requireNonNull(cArr, "Character array is missing");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = read();
            if (i5 == -1) {
                return i3;
            }
            cArr[i + i4] = (char) i5;
            i3++;
        }
        return i3;
    }
}
