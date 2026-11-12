package com.huawei.hms.network.embedded;

import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public final class ca {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14683c = 65535;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14685b = new int[10];

    public boolean e(int i2) {
        return ((1 << i2) & this.f14684a) != 0;
    }

    public int d(int i2) {
        return (this.f14684a & 64) != 0 ? this.f14685b[6] : i2;
    }

    public int d() {
        return Integer.bitCount(this.f14684a);
    }

    public int c(int i2) {
        return (this.f14684a & 32) != 0 ? this.f14685b[5] : i2;
    }

    public int c() {
        if ((this.f14684a & 128) != 0) {
            return this.f14685b[7];
        }
        return 65535;
    }

    public int b(int i2) {
        return (this.f14684a & 16) != 0 ? this.f14685b[4] : i2;
    }

    public int b() {
        if ((this.f14684a & 2) != 0) {
            return this.f14685b[1];
        }
        return -1;
    }

    public boolean a(boolean z) {
        if ((this.f14684a & 4) != 0) {
            if (this.f14685b[2] != 1) {
                return false;
            }
        } else if (!z) {
            return false;
        }
        return true;
    }

    public void a(ca caVar) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (caVar.e(i2)) {
                a(i2, caVar.a(i2));
            }
        }
    }

    public void a() {
        this.f14684a = 0;
        Arrays.fill(this.f14685b, 0);
    }

    public ca a(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f14685b;
            if (i2 < iArr.length) {
                this.f14684a = (1 << i2) | this.f14684a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public int a(int i2) {
        return this.f14685b[i2];
    }
}
