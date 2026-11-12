package com.huawei.openalliance.ad.utils;

/* JADX INFO: loaded from: classes41.dex */
public final class Size {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20329b;

    public String toString() {
        return this.f20328a + "x" + this.f20329b;
    }

    public int hashCode() {
        int i = this.f20329b;
        int i2 = this.f20328a;
        return i ^ ((i2 << 16) | (i2 >>> 16));
    }

    public int getWidth() {
        return this.f20328a;
    }

    public int getHeight() {
        return this.f20329b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f20328a == size.f20328a && this.f20329b == size.f20329b) {
                return true;
            }
        }
        return false;
    }

    public Size(int i, int i2) {
        this.f20328a = i;
        this.f20329b = i2;
    }
}
