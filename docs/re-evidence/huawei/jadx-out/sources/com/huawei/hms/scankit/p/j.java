package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l[] f16142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16144c;
    private final int d;

    j(int i, int i2) {
        this.f16142a = new l[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f16142a[i3] = new l(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.f16144c = i;
        this.f16143b = -1;
    }

    void b() {
        this.f16143b++;
    }

    l a() {
        int i = this.f16143b;
        if (i >= 0) {
            l[] lVarArr = this.f16142a;
            if (i < lVarArr.length) {
                return lVarArr[i];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public byte[][] a(int i, int i2) {
        int i3 = this.f16144c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.d * i);
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f16142a[i4 / i2].a(i);
        }
        return bArr;
    }
}
