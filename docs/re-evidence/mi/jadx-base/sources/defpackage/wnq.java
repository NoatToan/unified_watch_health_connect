package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class wnq {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38182a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38183b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public int b() {
        return this.c;
    }

    public long d(jl8 jl8Var, boolean z, boolean z2, int i) throws IOException {
        if (this.f38183b == 0) {
            if (!jl8Var.e(this.f38182a, 0, 1, z)) {
                return -1L;
            }
            int iC = c(this.f38182a[0] & 255);
            this.c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f38183b = 1;
        }
        int i2 = this.c;
        if (i2 > i) {
            this.f38183b = 0;
            return -2L;
        }
        if (i2 != 1) {
            jl8Var.readFully(this.f38182a, 1, i2 - 1);
        }
        this.f38183b = 0;
        return a(this.f38182a, this.c, z2);
    }

    public void e() {
        this.f38183b = 0;
        this.c = 0;
    }
}
