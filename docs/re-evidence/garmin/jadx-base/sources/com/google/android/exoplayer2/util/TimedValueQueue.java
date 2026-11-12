package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class TimedValueQueue<V> {
    private static final int INITIAL_BUFFER_SIZE = 10;
    private int first;
    private int size;
    private long[] timestamps;
    private V[] values;

    public TimedValueQueue(int i14) {
        this.timestamps = new long[i14];
        this.values = (V[]) newArray(i14);
    }

    private void addUnchecked(long j8, V v14) {
        int i14 = this.first;
        int i15 = this.size;
        V[] vArr = this.values;
        int length = (i14 + i15) % vArr.length;
        this.timestamps[length] = j8;
        vArr[length] = v14;
        this.size = i15 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j8) {
        int i14 = this.size;
        if (i14 > 0) {
            if (j8 <= this.timestamps[((this.first + i14) - 1) % this.values.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.values.length;
        if (this.size < length) {
            return;
        }
        int i14 = length * 2;
        long[] jArr = new long[i14];
        V[] vArr = (V[]) newArray(i14);
        int i15 = this.first;
        int i16 = length - i15;
        System.arraycopy(this.timestamps, i15, jArr, 0, i16);
        System.arraycopy(this.values, this.first, vArr, 0, i16);
        int i17 = this.first;
        if (i17 > 0) {
            System.arraycopy(this.timestamps, 0, jArr, i16, i17);
            System.arraycopy(this.values, 0, vArr, i16, this.first);
        }
        this.timestamps = jArr;
        this.values = vArr;
        this.first = 0;
    }

    private static <V> V[] newArray(int i14) {
        return (V[]) new Object[i14];
    }

    private V poll(long j8, boolean z14) {
        V vPopFirst = null;
        long j14 = Long.MAX_VALUE;
        while (this.size > 0) {
            long j15 = j8 - this.timestamps[this.first];
            if (j15 < 0 && (z14 || (-j15) >= j14)) {
                break;
            }
            vPopFirst = popFirst();
            j14 = j15;
        }
        return vPopFirst;
    }

    private V popFirst() {
        Assertions.checkState(this.size > 0);
        V[] vArr = this.values;
        int i14 = this.first;
        V v14 = vArr[i14];
        vArr[i14] = null;
        this.first = (i14 + 1) % vArr.length;
        this.size--;
        return v14;
    }

    public synchronized void add(long j8, V v14) {
        clearBufferOnTimeDiscontinuity(j8);
        doubleCapacityIfFull();
        addUnchecked(j8, v14);
    }

    public synchronized void clear() {
        this.first = 0;
        this.size = 0;
        Arrays.fill(this.values, (Object) null);
    }

    public synchronized V pollFirst() {
        return this.size == 0 ? null : popFirst();
    }

    public synchronized V pollFloor(long j8) {
        return poll(j8, true);
    }

    public synchronized int size() {
        return this.size;
    }

    public TimedValueQueue() {
        this(10);
    }

    public synchronized V poll(long j8) {
        return poll(j8, false);
    }
}
