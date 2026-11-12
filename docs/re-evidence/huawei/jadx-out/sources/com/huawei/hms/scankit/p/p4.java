package com.huawei.hms.scankit.p;

import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes34.dex */
public abstract class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16264b;

    public abstract p4 a(int i, int i2, int i3, int i4);

    public abstract byte[] a(int i, byte[] bArr);

    public abstract byte[] b();

    protected p4(int i, int i2) {
        this.f16263a = i;
        this.f16264b = i2;
    }

    public final int c() {
        return this.f16263a;
    }

    public final int a() {
        return this.f16264b;
    }

    public final String toString() {
        char c2;
        int i = this.f16263a;
        byte[] bArrA = new byte[i];
        StringBuilder sb = new StringBuilder(this.f16264b * (i + 1));
        for (int i2 = 0; i2 < this.f16264b; i2++) {
            bArrA = a(i2, bArrA);
            for (int i3 = 0; i3 < this.f16263a; i3++) {
                int i4 = bArrA[i3] & 255;
                if (i4 < 64) {
                    c2 = '#';
                } else if (i4 < 128) {
                    c2 = '+';
                } else {
                    c2 = i4 < 192 ? FilenameUtils.EXTENSION_SEPARATOR : ' ';
                }
                sb.append(c2);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
