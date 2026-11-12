package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class e12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g12[] f16140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16141b;
    public final int c;
    public final int d;

    public e12(int i, int i2) {
        g12[] g12VarArr = new g12[i];
        this.f16140a = g12VarArr;
        int length = g12VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f16140a[i3] = new g12(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.f16141b = -1;
    }

    public g12 a() {
        return this.f16140a[this.f16141b];
    }

    public byte[][] b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f16140a[i4 / i2].b(i);
        }
        return bArr;
    }

    public void c() {
        this.f16141b++;
    }
}
