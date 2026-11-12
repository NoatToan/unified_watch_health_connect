package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f16014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16016c;

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f16015b * 2 * this.f16016c) + 2);
        for (int i = 0; i < this.f16016c; i++) {
            byte[] bArr = this.f16014a[i];
            for (int i2 = 0; i2 < this.f16015b; i2++) {
                byte b2 = bArr[i2];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public c0(int i, int i2) {
        this.f16014a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f16015b = i;
        this.f16016c = i2;
    }

    public int b() {
        return this.f16016c;
    }

    public int c() {
        return this.f16015b;
    }

    public void a(byte b2) {
        for (byte[] bArr : this.f16014a) {
            Arrays.fill(bArr, b2);
        }
    }

    public byte a(int i, int i2) {
        if (w7.a(this.f16014a, i2) && w7.a(this.f16014a[i2], i)) {
            return this.f16014a[i2][i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public byte[][] a() {
        return this.f16014a;
    }

    public void a(int i, int i2, int i3) {
        if (w7.a(this.f16014a, i2) && w7.a(this.f16014a[i2], i)) {
            this.f16014a[i2][i] = (byte) i3;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void a(int i, int i2, boolean z) {
        if (w7.a(this.f16014a, i2) && w7.a(this.f16014a[i2], i)) {
            this.f16014a[i2][i] = z ? (byte) 1 : (byte) 0;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
