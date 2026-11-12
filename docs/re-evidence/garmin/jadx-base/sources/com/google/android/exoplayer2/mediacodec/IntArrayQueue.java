package com.google.android.exoplayer2.mediacodec;

import c22.t;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
final class IntArrayQueue {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int[] data;
    private int wrapAroundMask;
    private int headIndex = 0;
    private int tailIndex = -1;
    private int size = 0;

    public IntArrayQueue() {
        int[] iArr = new int[16];
        this.data = iArr;
        this.wrapAroundMask = iArr.length - 1;
    }

    private void doubleArraySize() {
        int[] iArr = this.data;
        int length = iArr.length << 1;
        if (length < 0) {
            x.h();
            return;
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i14 = this.headIndex;
        int i15 = length2 - i14;
        System.arraycopy(iArr, i14, iArr2, 0, i15);
        System.arraycopy(this.data, 0, iArr2, i15, i14);
        this.headIndex = 0;
        this.tailIndex = this.size - 1;
        this.data = iArr2;
        this.wrapAroundMask = iArr2.length - 1;
    }

    public void add(int i14) {
        if (this.size == this.data.length) {
            doubleArraySize();
        }
        int i15 = (this.tailIndex + 1) & this.wrapAroundMask;
        this.tailIndex = i15;
        this.data[i15] = i14;
        this.size++;
    }

    public int capacity() {
        return this.data.length;
    }

    public void clear() {
        this.headIndex = 0;
        this.tailIndex = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int remove() {
        int i14 = this.size;
        if (i14 == 0) {
            t.g();
            return 0;
        }
        int[] iArr = this.data;
        int i15 = this.headIndex;
        int i16 = iArr[i15];
        this.headIndex = (i15 + 1) & this.wrapAroundMask;
        this.size = i14 - 1;
        return i16;
    }

    public int size() {
        return this.size;
    }
}
