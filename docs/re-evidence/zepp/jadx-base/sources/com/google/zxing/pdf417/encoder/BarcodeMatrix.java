package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class BarcodeMatrix {
    private final a[] a;
    private int b;
    private final int c;
    private final int d;

    public BarcodeMatrix(int i, int i2) {
        a[] aVarArr = new a[i];
        this.a = aVarArr;
        int length = aVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new a(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public a a() {
        return this.a[this.b];
    }

    public void b(int i, int i2, byte b) {
        this.a[i2].c(i, b);
    }

    public void c() {
        this.b++;
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].b(i);
        }
        return bArr;
    }
}
