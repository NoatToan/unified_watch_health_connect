package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class k73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f23540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23541b;
    public final int c;

    public k73(int i, int i2) {
        this.f23540a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f23541b = i;
        this.c = i2;
    }

    public void a(byte b2) {
        for (byte[] bArr : this.f23540a) {
            Arrays.fill(bArr, b2);
        }
    }

    public byte b(int i, int i2) {
        return this.f23540a[i2][i];
    }

    public byte[][] c() {
        return this.f23540a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.f23541b;
    }

    public void f(int i, int i2, int i3) {
        this.f23540a[i2][i] = (byte) i3;
    }

    public void g(int i, int i2, boolean z) {
        this.f23540a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f23541b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            byte[] bArr = this.f23540a[i];
            for (int i2 = 0; i2 < this.f23541b; i2++) {
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
}
