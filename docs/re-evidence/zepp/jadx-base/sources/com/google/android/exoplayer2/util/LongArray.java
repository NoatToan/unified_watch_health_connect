package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LongArray {
    private static final int c = 32;
    private int a;
    private long[] b;

    public LongArray() {
        this(32);
    }

    public void add(long value) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = value;
    }

    public long get(int index) {
        if (index >= 0 && index < this.a) {
            return this.b[index];
        }
        int i = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(index);
        sb.append(", size is ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int size() {
        return this.a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.b, this.a);
    }

    public LongArray(int initialCapacity) {
        this.b = new long[initialCapacity];
    }
}
