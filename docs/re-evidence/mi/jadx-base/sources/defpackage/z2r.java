package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z2r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40822b;
    public int c;
    public int d;

    public z2r(byte[] bArr) {
        this.f40821a = bArr;
        this.f40822b = bArr.length;
    }

    public final void a() {
        int i;
        int i2 = this.c;
        rk1.g(i2 >= 0 && (i2 < (i = this.f40822b) || (i2 == i && this.d == 0)));
    }

    public int b() {
        return (this.c * 8) + this.d;
    }

    public boolean c() {
        boolean z = (((this.f40821a[this.c] & 255) >> this.d) & 1) == 1;
        e(1);
        return z;
    }

    public int d(int i) {
        int i2 = this.c;
        int iMin = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.f40821a[i2] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f40821a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        e(i);
        return i5;
    }

    public void e(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = this.d + (i - (i2 * 8));
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        a();
    }
}
