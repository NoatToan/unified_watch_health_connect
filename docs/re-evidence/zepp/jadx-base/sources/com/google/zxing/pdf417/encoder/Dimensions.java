package com.google.zxing.pdf417.encoder;

/* JADX INFO: loaded from: classes4.dex */
public final class Dimensions {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public Dimensions(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int getMaxCols() {
        return this.b;
    }

    public int getMaxRows() {
        return this.d;
    }

    public int getMinCols() {
        return this.a;
    }

    public int getMinRows() {
        return this.c;
    }
}
