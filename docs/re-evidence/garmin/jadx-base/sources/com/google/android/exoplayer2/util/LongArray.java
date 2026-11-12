package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray(int i14) {
        this.values = new long[i14];
    }

    public void add(long j8) {
        int i14 = this.size;
        long[] jArr = this.values;
        if (i14 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i14 * 2);
        }
        long[] jArr2 = this.values;
        int i15 = this.size;
        this.size = i15 + 1;
        jArr2[i15] = j8;
    }

    public long get(int i14) {
        if (i14 >= 0 && i14 < this.size) {
            return this.values[i14];
        }
        com.garmin.proto.generated.a.e(46, "Invalid index ", ", size is ", i14, this.size);
        return 0L;
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray() {
        this(32);
    }
}
