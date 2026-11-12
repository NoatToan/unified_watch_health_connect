package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;

/* JADX INFO: loaded from: classes6.dex */
public class z73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40971b;

    public z73() {
        this.f40970a = new byte[64];
    }

    public final z73 a(String str, int i, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                i4 = cCharAt <= 2047 ? i4 + 2 : i4 + 3;
            } else {
                i4++;
            }
            i3++;
        }
        if (i4 > i2) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i5 = this.f40971b;
        int i6 = i5 - i;
        int i7 = i6 - 2;
        if (i7 >= 0) {
            byte[] bArr = this.f40970a;
            bArr[i7] = (byte) (i4 >>> 8);
            bArr[i6 - 1] = (byte) i4;
        }
        if ((i5 + i4) - i > this.f40970a.length) {
            b(i4 - i);
        }
        int i8 = this.f40971b;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                this.f40970a[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 <= 2047) {
                byte[] bArr2 = this.f40970a;
                int i9 = i8 + 1;
                bArr2[i8] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i8 += 2;
                bArr2[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                byte[] bArr3 = this.f40970a;
                bArr3[i8] = (byte) (((cCharAt2 >> '\f') & 15) | SportReportBaseParser.ReportType.avgFreq);
                int i10 = i8 + 2;
                bArr3[i8 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i8 += 3;
                bArr3[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i++;
        }
        this.f40971b = i8;
        return this;
    }

    public final void b(int i) {
        byte[] bArr = this.f40970a;
        int length = bArr.length * 2;
        int i2 = this.f40971b;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f40970a = bArr2;
    }

    public final z73 c(int i, int i2) {
        int i3 = this.f40971b;
        if (i3 + 2 > this.f40970a.length) {
            b(2);
        }
        byte[] bArr = this.f40970a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f40971b = i3 + 2;
        return this;
    }

    public final z73 d(int i, int i2, int i3) {
        int i4 = this.f40971b;
        if (i4 + 4 > this.f40970a.length) {
            b(4);
        }
        byte[] bArr = this.f40970a;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) i2;
        bArr[i4 + 2] = (byte) (i3 >>> 8);
        bArr[i4 + 3] = (byte) i3;
        this.f40971b = i4 + 4;
        return this;
    }

    public final z73 e(int i, int i2) {
        int i3 = this.f40971b;
        if (i3 + 3 > this.f40970a.length) {
            b(3);
        }
        byte[] bArr = this.f40970a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f40971b = i3 + 3;
        return this;
    }

    public final z73 f(int i, int i2, int i3) {
        int i4 = this.f40971b;
        if (i4 + 5 > this.f40970a.length) {
            b(5);
        }
        byte[] bArr = this.f40970a;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f40971b = i4 + 5;
        return this;
    }

    public z73 g(int i) {
        int i2 = this.f40971b;
        int i3 = i2 + 1;
        if (i3 > this.f40970a.length) {
            b(1);
        }
        this.f40970a[i2] = (byte) i;
        this.f40971b = i3;
        return this;
    }

    public z73 h(byte[] bArr, int i, int i2) {
        if (this.f40971b + i2 > this.f40970a.length) {
            b(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f40970a, this.f40971b, i2);
        }
        this.f40971b += i2;
        return this;
    }

    public z73 i(int i) {
        int i2 = this.f40971b;
        if (i2 + 4 > this.f40970a.length) {
            b(4);
        }
        byte[] bArr = this.f40970a;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f40971b = i2 + 4;
        return this;
    }

    public z73 j(long j) {
        int i = this.f40971b;
        if (i + 8 > this.f40970a.length) {
            b(8);
        }
        byte[] bArr = this.f40970a;
        int i2 = (int) (j >>> 32);
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
        int i3 = (int) j;
        bArr[i + 4] = (byte) (i3 >>> 24);
        bArr[i + 5] = (byte) (i3 >>> 16);
        bArr[i + 6] = (byte) (i3 >>> 8);
        bArr[i + 7] = (byte) i3;
        this.f40971b = i + 8;
        return this;
    }

    public z73 k(int i) {
        int i2 = this.f40971b;
        if (i2 + 2 > this.f40970a.length) {
            b(2);
        }
        byte[] bArr = this.f40970a;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f40971b = i2 + 2;
        return this;
    }

    public z73 l(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i = this.f40971b;
        if (i + 2 + length > this.f40970a.length) {
            b(length + 2);
        }
        byte[] bArr = this.f40970a;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i + 2;
        bArr[i2] = (byte) length;
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                this.f40971b = i3;
                return a(str, i4, 65535);
            }
            bArr[i3] = (byte) cCharAt;
            i4++;
            i3++;
        }
        this.f40971b = i3;
        return this;
    }

    public z73(int i) {
        this.f40970a = new byte[i];
    }

    public z73(byte[] bArr) {
        this.f40970a = bArr;
        this.f40971b = bArr.length;
    }
}
