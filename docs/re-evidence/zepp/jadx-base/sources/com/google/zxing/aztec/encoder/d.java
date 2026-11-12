package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes4.dex */
abstract class d {
    public static final d b = new b(null, 0, 0);
    private final d a;

    public d(d dVar) {
        this.a = dVar;
    }

    public final d a(int i, int i2) {
        return new b(this, i, i2);
    }

    public final d b(int i, int i2) {
        return new a(this, i, i2);
    }

    public abstract void c(BitArray bitArray, byte[] bArr);

    public final d d() {
        return this.a;
    }
}
