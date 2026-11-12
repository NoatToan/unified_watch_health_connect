package com.tencent.open.utils;

/* JADX INFO: loaded from: classes18.dex */
public final class l implements Cloneable {
    private long a;

    public l(long j) {
        this.a = j;
    }

    public byte[] a() {
        long j = this.a;
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & 4278190080L) >> 24)};
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof l) && this.a == ((l) obj).b();
    }

    public int hashCode() {
        return (int) this.a;
    }
}
