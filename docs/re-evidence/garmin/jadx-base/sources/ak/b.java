package ak;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3500d;

    public b(int i14, int i15, int i16, boolean z14) {
        if (!k.c(i14, 65535)) {
            vb.h.s("Device Number out of range");
            throw null;
        }
        if (!k.c(i15, 127)) {
            vb.h.s("Device Type out of range");
            throw null;
        }
        if (!k.c(i16, 255)) {
            vb.h.s("Transmission type out of range");
            throw null;
        }
        this.f3497a = i14;
        this.f3499c = i15;
        this.f3498b = z14;
        this.f3500d = i16;
    }

    public final byte[] a() {
        byte[] bArr = new byte[4];
        int i14 = this.f3499c + (this.f3498b ? 128 : 0);
        k.f(2, 0, this.f3497a, bArr);
        k.f(1, 2, i14, bArr);
        k.f(1, 3, this.f3500d, bArr);
        return bArr;
    }

    public final String toString() {
        return "Channel ID: Device number=" + this.f3497a + ", Pair=" + this.f3498b + ", Device Type=" + this.f3499c + ", Transmission Type=" + this.f3500d;
    }

    public b(int i14, int i15, int i16) {
        this(i14, i15, i16, false);
    }

    public b(byte[] bArr, int i14) {
        this.f3497a = (int) k.e(i14, 2, bArr);
        int i15 = i14 + 2;
        this.f3499c = bArr[i15] & Ascii.DEL;
        this.f3498b = k.d(128, (int) k.e(i15, 1, bArr));
        this.f3500d = (int) k.e(i14 + 3, 1, bArr);
    }
}
