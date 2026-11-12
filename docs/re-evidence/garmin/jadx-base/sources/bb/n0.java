package bb;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17243d;

    public n0(byte[] bArr) {
        this.f17240a = bArr;
        this.f17241b = bArr.length;
    }

    public final boolean a() {
        boolean z14 = (((this.f17240a[this.f17242c] & UnsignedBytes.MAX_VALUE) >> this.f17243d) & 1) == 1;
        c(1);
        return z14;
    }

    public final int b(int i14) {
        int i15 = this.f17242c;
        int iMin = Math.min(i14, 8 - this.f17243d);
        int i16 = i15 + 1;
        byte[] bArr = this.f17240a;
        int i17 = ((bArr[i15] & UnsignedBytes.MAX_VALUE) >> this.f17243d) & (255 >> (8 - iMin));
        while (iMin < i14) {
            i17 |= (bArr[i16] & UnsignedBytes.MAX_VALUE) << iMin;
            iMin += 8;
            i16++;
        }
        int i18 = i17 & ((-1) >>> (32 - i14));
        c(i14);
        return i18;
    }

    public final void c(int i14) {
        int i15;
        int i16 = i14 / 8;
        int i17 = this.f17242c + i16;
        this.f17242c = i17;
        int i18 = (i14 - (i16 * 8)) + this.f17243d;
        this.f17243d = i18;
        boolean z14 = true;
        if (i18 > 7) {
            this.f17242c = i17 + 1;
            this.f17243d = i18 - 8;
        }
        int i19 = this.f17242c;
        if (i19 < 0 || (i19 >= (i15 = this.f17241b) && (i19 != i15 || this.f17243d != 0))) {
            z14 = false;
        }
        fa.a.d(z14);
    }
}
