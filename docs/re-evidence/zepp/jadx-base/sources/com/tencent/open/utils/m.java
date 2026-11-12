package com.tencent.open.utils;

/* JADX INFO: loaded from: classes18.dex */
public final class m implements Cloneable {
    private int a;

    public m(byte[] bArr) {
        this(bArr, 0);
    }

    public byte[] a() {
        int i = this.a;
        return new byte[]{(byte) (i & 255), (byte) ((i & 65280) >> 8)};
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof m) && this.a == ((m) obj).b();
    }

    public int hashCode() {
        return this.a;
    }

    public m(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] << 8) & 65280;
        this.a = i2;
        this.a = i2 + (bArr[i] & 255);
    }

    public m(int i) {
        this.a = i;
    }
}
