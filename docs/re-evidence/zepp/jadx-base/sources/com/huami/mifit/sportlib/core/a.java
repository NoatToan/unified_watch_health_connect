package com.huami.mifit.sportlib.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
class a {
    private static final int f = 40;
    private static final int g = 1024;
    private long e;
    private int d = 0;
    private short[] a = new short[40];
    private short[] b = new short[40];
    private short[] c = new short[40];

    public a() {
        this.e = -1L;
        this.e = System.currentTimeMillis();
    }

    public synchronized void a(float f2, float f3, float f4) {
        int i = this.d;
        if (i >= 40) {
            return;
        }
        this.a[i] = (short) (f2 * 1024.0f);
        this.b[i] = (short) (f3 * 1024.0f);
        this.c[i] = (short) (f4 * 1024.0f);
        this.d = i + 1;
    }

    public long b() {
        return this.e;
    }

    public short[] c() {
        return this.a;
    }

    public short[] d() {
        return this.b;
    }

    public short[] e() {
        return this.c;
    }

    public synchronized boolean f() {
        return this.d == 40;
    }

    public String toString() {
        return "AccDataCollection{xlist=" + Arrays.toString(this.a) + ", ylist=" + Arrays.toString(this.b) + ", zlist=" + Arrays.toString(this.c) + ", recvSize=" + this.d + ", startTimestamp=" + this.e + '}';
    }
}
