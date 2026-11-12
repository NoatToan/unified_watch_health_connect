package com.tencent.open.utils;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31125a;

    public n(long j) {
        this.f31125a = j;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof n) && this.f31125a == ((n) obj).b();
    }

    public byte[] a() {
        long j = this.f31125a;
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & 4278190080L) >> 24)};
    }

    public long b() {
        return this.f31125a;
    }

    public int hashCode() {
        return (int) this.f31125a;
    }
}
