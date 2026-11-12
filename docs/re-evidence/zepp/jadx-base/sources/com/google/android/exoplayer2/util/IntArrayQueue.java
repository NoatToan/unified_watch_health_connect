package com.google.android.exoplayer2.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class IntArrayQueue {
    private static final int f = 16;
    private int a = 0;
    private int b = -1;
    private int c = 0;
    private int[] d;
    private int e;

    public IntArrayQueue() {
        int[] iArr = new int[16];
        this.d = iArr;
        this.e = iArr.length - 1;
    }

    private void a() {
        int[] iArr = this.d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.d, 0, iArr2, i2, i);
        this.a = 0;
        this.b = this.c - 1;
        this.d = iArr2;
        this.e = iArr2.length - 1;
    }

    public void add(int value) {
        if (this.c == this.d.length) {
            a();
        }
        int i = (this.b + 1) & this.e;
        this.b = i;
        this.d[i] = value;
        this.c++;
    }

    public int capacity() {
        return this.d.length;
    }

    public void clear() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public boolean isEmpty() {
        return this.c == 0;
    }

    public int remove() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d;
        int i2 = this.a;
        int i3 = iArr[i2];
        this.a = (i2 + 1) & this.e;
        this.c = i - 1;
        return i3;
    }

    public int size() {
        return this.c;
    }
}
