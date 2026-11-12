package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TimedValueQueue<V> {
    private static final int e = 10;
    private long[] a;
    private V[] b;
    private int c;
    private int d;

    public TimedValueQueue() {
        this(10);
    }

    private void a(long timestamp, V value) {
        int i = this.c;
        int i2 = this.d;
        V[] vArr = this.b;
        int length = (i + i2) % vArr.length;
        this.a[length] = timestamp;
        vArr[length] = value;
        this.d = i2 + 1;
    }

    private void b(long timestamp) {
        int i = this.d;
        if (i > 0) {
            if (timestamp <= this.a[((this.c + i) - 1) % this.b.length]) {
                clear();
            }
        }
    }

    private void c() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) d(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    private static <V> V[] d(int i) {
        return (V[]) new Object[i];
    }

    @Nullable
    private V e(long timestamp, boolean onlyOlder) {
        V vF = null;
        long j = Long.MAX_VALUE;
        while (this.d > 0) {
            long j2 = timestamp - this.a[this.c];
            if (j2 < 0 && (onlyOlder || (-j2) >= j)) {
                break;
            }
            vF = f();
            j = j2;
        }
        return vF;
    }

    @Nullable
    private V f() {
        Assertions.checkState(this.d > 0);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public synchronized void add(long timestamp, V value) {
        b(timestamp);
        c();
        a(timestamp, value);
    }

    public synchronized void clear() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    @Nullable
    public synchronized V poll(long timestamp) {
        return e(timestamp, false);
    }

    @Nullable
    public synchronized V pollFirst() {
        return this.d == 0 ? null : f();
    }

    @Nullable
    public synchronized V pollFloor(long timestamp) {
        return e(timestamp, true);
    }

    public synchronized int size() {
        return this.d;
    }

    public TimedValueQueue(int i) {
        this.a = new long[i];
        this.b = (V[]) d(i);
    }
}
