package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class rls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f32691a = new byte[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32692b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;

    public rls() {
        d();
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] bArr, int i, int i2) {
        int iE = e(30, bArr, i, i2);
        if (iE == -1) {
            return -1;
        }
        if (this.c == -1) {
            long jB = ads.b(this.f32691a, 0);
            this.c = jB;
            if (jB == 67324752) {
                this.h = false;
                this.d = ads.b(this.f32691a, 18);
                this.g = ads.a(this.f32691a, 8);
                this.e = ads.a(this.f32691a, 26);
                int iA = this.e + 30 + ads.a(this.f32691a, 28);
                this.f = iA;
                int length = this.f32691a.length;
                if (length < iA) {
                    do {
                        length += length;
                    } while (length < iA);
                    this.f32691a = Arrays.copyOf(this.f32691a, length);
                }
            } else {
                this.h = true;
            }
        }
        int iE2 = e(this.f, bArr, i + iE, i2 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i3 = iE + iE2;
        if (!this.h && this.i == null) {
            this.i = new String(this.f32691a, 30, this.e);
        }
        return i3;
    }

    public final ups c() {
        int i = this.f32692b;
        int i2 = this.f;
        if (i < i2) {
            return new wcs(this.i, this.d, this.g, true, this.h, Arrays.copyOf(this.f32691a, i));
        }
        wcs wcsVar = new wcs(this.i, this.d, this.g, false, this.h, Arrays.copyOf(this.f32691a, i2));
        d();
        return wcsVar;
    }

    public final void d() {
        this.f32692b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
    }

    public final int e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f32692b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f32691a, this.f32692b, iMin);
        int i5 = this.f32692b + iMin;
        this.f32692b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }
}
