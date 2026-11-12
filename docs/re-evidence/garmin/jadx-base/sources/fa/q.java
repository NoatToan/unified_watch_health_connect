package fa;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f70047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70050d;

    public q() {
        this.f70047a = z.f70076f;
    }

    public final void a() {
        int i14;
        int i15 = this.f70048b;
        a.d(i15 >= 0 && (i15 < (i14 = this.f70050d) || (i15 == i14 && this.f70049c == 0)));
    }

    public final int b() {
        return ((this.f70050d - this.f70048b) * 8) - this.f70049c;
    }

    public final void c() {
        if (this.f70049c == 0) {
            return;
        }
        this.f70049c = 0;
        this.f70048b++;
        a();
    }

    public final int d() {
        a.d(this.f70049c == 0);
        return this.f70048b;
    }

    public final int e() {
        return (this.f70048b * 8) + this.f70049c;
    }

    public final boolean f() {
        boolean z14 = (this.f70047a[this.f70048b] & (128 >> this.f70049c)) != 0;
        n();
        return z14;
    }

    public final int g(int i14) {
        int i15;
        if (i14 == 0) {
            return 0;
        }
        this.f70049c += i14;
        int i16 = 0;
        while (true) {
            i15 = this.f70049c;
            if (i15 <= 8) {
                break;
            }
            int i17 = i15 - 8;
            this.f70049c = i17;
            byte[] bArr = this.f70047a;
            int i18 = this.f70048b;
            this.f70048b = i18 + 1;
            i16 |= (bArr[i18] & UnsignedBytes.MAX_VALUE) << i17;
        }
        byte[] bArr2 = this.f70047a;
        int i19 = this.f70048b;
        int i24 = ((-1) >>> (32 - i14)) & (i16 | ((bArr2[i19] & UnsignedBytes.MAX_VALUE) >> (8 - i15)));
        if (i15 == 8) {
            this.f70049c = 0;
            this.f70048b = i19 + 1;
        }
        a();
        return i24;
    }

    public final void h(int i14, byte[] bArr) {
        int i15 = i14 >> 3;
        for (int i16 = 0; i16 < i15; i16++) {
            byte[] bArr2 = this.f70047a;
            int i17 = this.f70048b;
            int i18 = i17 + 1;
            this.f70048b = i18;
            byte b14 = bArr2[i17];
            int i19 = this.f70049c;
            byte b15 = (byte) (b14 << i19);
            bArr[i16] = b15;
            bArr[i16] = (byte) (((255 & bArr2[i18]) >> (8 - i19)) | b15);
        }
        int i24 = i14 & 7;
        if (i24 == 0) {
            return;
        }
        byte b16 = (byte) (bArr[i15] & (255 >> i24));
        bArr[i15] = b16;
        int i25 = this.f70049c;
        if (i25 + i24 > 8) {
            byte[] bArr3 = this.f70047a;
            int i26 = this.f70048b;
            this.f70048b = i26 + 1;
            bArr[i15] = (byte) (b16 | ((bArr3[i26] & UnsignedBytes.MAX_VALUE) << i25));
            this.f70049c = i25 - 8;
        }
        int i27 = this.f70049c + i24;
        this.f70049c = i27;
        byte[] bArr4 = this.f70047a;
        int i28 = this.f70048b;
        bArr[i15] = (byte) (((byte) (((255 & bArr4[i28]) >> (8 - i27)) << (8 - i24))) | bArr[i15]);
        if (i27 == 8) {
            this.f70049c = 0;
            this.f70048b = i28 + 1;
        }
        a();
    }

    public final long i(int i14) {
        if (i14 <= 32) {
            int iG = g(i14);
            int i15 = z.f70071a;
            return 4294967295L & ((long) iG);
        }
        int iG2 = g(i14 - 32);
        int iG3 = g(32);
        int i16 = z.f70071a;
        return (4294967295L & ((long) iG3)) | ((((long) iG2) & 4294967295L) << 32);
    }

    public final void j(int i14, byte[] bArr) {
        a.d(this.f70049c == 0);
        System.arraycopy(this.f70047a, this.f70048b, bArr, 0, i14);
        this.f70048b += i14;
        a();
    }

    public final void k(r rVar) {
        l(rVar.f70054a, rVar.f70056c);
        m(rVar.f70055b * 8);
    }

    public final void l(byte[] bArr, int i14) {
        this.f70047a = bArr;
        this.f70048b = 0;
        this.f70049c = 0;
        this.f70050d = i14;
    }

    public final void m(int i14) {
        int i15 = i14 / 8;
        this.f70048b = i15;
        this.f70049c = i14 - (i15 * 8);
        a();
    }

    public final void n() {
        int i14 = this.f70049c + 1;
        this.f70049c = i14;
        if (i14 == 8) {
            this.f70049c = 0;
            this.f70048b++;
        }
        a();
    }

    public final void o(int i14) {
        int i15 = i14 / 8;
        int i16 = this.f70048b + i15;
        this.f70048b = i16;
        int i17 = (i14 - (i15 * 8)) + this.f70049c;
        this.f70049c = i17;
        if (i17 > 7) {
            this.f70048b = i16 + 1;
            this.f70049c = i17 - 8;
        }
        a();
    }

    public final void p(int i14) {
        a.d(this.f70049c == 0);
        this.f70048b += i14;
        a();
    }

    public q(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public q(byte[] bArr, int i14) {
        this.f70047a = bArr;
        this.f70050d = i14;
    }
}
