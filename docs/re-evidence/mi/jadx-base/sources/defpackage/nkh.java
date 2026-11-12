package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class nkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f28014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28015b;
    public int c;
    public int d;

    public nkh() {
        this.f28014a = wlq.f;
    }

    public final void a() {
        int i;
        int i2 = this.f28015b;
        rk1.g(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }

    public int b() {
        return ((this.d - this.f28015b) * 8) - this.c;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.f28015b++;
        a();
    }

    public int d() {
        rk1.g(this.c == 0);
        return this.f28015b;
    }

    public int e() {
        return (this.f28015b * 8) + this.c;
    }

    public void f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.c, i2);
        int i3 = this.c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f28014a;
        int i5 = this.f28015b;
        byte b2 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b2;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b2 | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f28014a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f28014a;
        byte b3 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b3;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b3);
        r(i2);
        a();
    }

    public boolean g() {
        boolean z = (this.f28014a[this.f28015b] & (128 >> this.c)) != 0;
        q();
        return z;
    }

    public int h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.f28014a;
            int i5 = this.f28015b;
            this.f28015b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f28014a;
        int i6 = this.f28015b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.f28015b = i6 + 1;
        }
        a();
        return i7;
    }

    public void i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f28014a;
            int i4 = this.f28015b;
            int i5 = i4 + 1;
            this.f28015b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.c;
            byte b3 = (byte) (b2 << i6);
            bArr[i] = b3;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b3);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b4;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f28014a;
            int i9 = this.f28015b;
            this.f28015b = i9 + 1;
            bArr[i3] = (byte) (b4 | ((bArr3[i9] & 255) << i8));
            this.c = i8 - 8;
        }
        int i10 = this.c + i7;
        this.c = i10;
        byte[] bArr4 = this.f28014a;
        int i11 = this.f28015b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.c = 0;
            this.f28015b = i11 + 1;
        }
        a();
    }

    public long j(int i) {
        return i <= 32 ? wlq.U0(h(i)) : wlq.T0(h(i - 32), h(32));
    }

    public void k(byte[] bArr, int i, int i2) {
        rk1.g(this.c == 0);
        System.arraycopy(this.f28014a, this.f28015b, bArr, i, i2);
        this.f28015b += i2;
        a();
    }

    public String l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        k(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void m(okh okhVar) {
        o(okhVar.d(), okhVar.f());
        p(okhVar.e() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i) {
        this.f28014a = bArr;
        this.f28015b = 0;
        this.c = 0;
        this.d = i;
    }

    public void p(int i) {
        int i2 = i / 8;
        this.f28015b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void q() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.f28015b++;
        }
        a();
    }

    public void r(int i) {
        int i2 = i / 8;
        int i3 = this.f28015b + i2;
        this.f28015b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.f28015b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public void s(int i) {
        rk1.g(this.c == 0);
        this.f28015b += i;
        a();
    }

    public nkh(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public nkh(byte[] bArr, int i) {
        this.f28014a = bArr;
        this.d = i;
    }
}
