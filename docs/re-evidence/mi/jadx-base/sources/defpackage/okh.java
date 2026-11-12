package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class okh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f29253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29254b;
    public int c;

    public okh() {
        this.f29253a = wlq.f;
    }

    public String A(int i) {
        return B(i, bu3.c);
    }

    public String B(int i, Charset charset) {
        String str = new String(this.f29253a, this.f29254b, i, charset);
        this.f29254b += i;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        this.f29254b = i + 1;
        return bArr[i] & 255;
    }

    public int E() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
        this.f29254b = i + 4;
        return i2;
    }

    public long F() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 3;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 16) | ((((long) bArr[i + 2]) & 255) << 8);
        this.f29254b = i + 4;
        return (((long) bArr[i2]) & 255) | j;
    }

    public int G() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.f29254b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public int H() {
        int iN = n();
        if (iN >= 0) {
            return iN;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iN);
        throw new IllegalStateException(sb.toString());
    }

    public long I() {
        long jW = w();
        if (jW >= 0) {
            return jW;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jW);
        throw new IllegalStateException(sb.toString());
    }

    public int J() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f29254b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long K() {
        int i;
        int i2;
        long j = this.f29253a[this.f29254b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i = 1; i < i2; i++) {
            byte b2 = this.f29253a[this.f29254b + i];
            if ((b2 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | ((long) (b2 & 63));
        }
        this.f29254b += i2;
        return j;
    }

    public void L(int i) {
        N(b() < i ? new byte[i] : this.f29253a, i);
    }

    public void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public void N(byte[] bArr, int i) {
        this.f29253a = bArr;
        this.c = i;
        this.f29254b = 0;
    }

    public void O(int i) {
        rk1.a(i >= 0 && i <= this.f29253a.length);
        this.c = i;
    }

    public void P(int i) {
        rk1.a(i >= 0 && i <= this.c);
        this.f29254b = i;
    }

    public void Q(int i) {
        P(this.f29254b + i);
    }

    public int a() {
        return this.c - this.f29254b;
    }

    public int b() {
        return this.f29253a.length;
    }

    public void c(int i) {
        if (i > b()) {
            this.f29253a = Arrays.copyOf(this.f29253a, i);
        }
    }

    public byte[] d() {
        return this.f29253a;
    }

    public int e() {
        return this.f29254b;
    }

    public int f() {
        return this.c;
    }

    public char g() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int h() {
        return this.f29253a[this.f29254b] & 255;
    }

    public void i(nkh nkhVar, int i) {
        j(nkhVar.f28014a, 0, i);
        nkhVar.p(0);
    }

    public void j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f29253a, this.f29254b, bArr, i, i2);
        this.f29254b += i2;
    }

    public String k(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.f29254b;
        while (i < this.c && this.f29253a[i] != c) {
            i++;
        }
        byte[] bArr = this.f29253a;
        int i2 = this.f29254b;
        String strF = wlq.F(bArr, i2, i - i2);
        this.f29254b = i;
        if (i < this.c) {
            this.f29254b = i + 1;
        }
        return strF;
    }

    public double l() {
        return Double.longBitsToDouble(w());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.f29254b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    public int o() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        this.f29254b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.f29254b;
        while (i < this.c && !wlq.p0(this.f29253a[i])) {
            i++;
        }
        int i2 = this.f29254b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f29253a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f29254b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f29253a;
        int i3 = this.f29254b;
        String strF = wlq.F(bArr2, i3, i - i3);
        this.f29254b = i;
        int i4 = this.c;
        if (i == i4) {
            return strF;
        }
        byte[] bArr3 = this.f29253a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f29254b = i5;
            if (i5 == i4) {
                return strF;
            }
        }
        int i6 = this.f29254b;
        if (bArr3[i6] == 10) {
            this.f29254b = i6 + 1;
        }
        return strF;
    }

    public int q() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.f29254b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public long r() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 7;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        this.f29254b = i + 8;
        return ((((long) bArr[i2]) & 255) << 56) | j;
    }

    public short s() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f29254b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long t() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 3;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16);
        this.f29254b = i + 4;
        return ((((long) bArr[i2]) & 255) << 24) | j;
    }

    public int u() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iQ);
        throw new IllegalStateException(sb.toString());
    }

    public int v() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f29254b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long w() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        this.f29254b = i + 8;
        return (((long) bArr[i2]) & 255) | j;
    }

    public String x() {
        return k((char) 0);
    }

    public String y(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f29254b;
        int i3 = (i2 + i) - 1;
        String strF = wlq.F(this.f29253a, i2, (i3 >= this.c || this.f29253a[i3] != 0) ? i : i - 1);
        this.f29254b += i;
        return strF;
    }

    public short z() {
        byte[] bArr = this.f29253a;
        int i = this.f29254b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.f29254b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public okh(int i) {
        this.f29253a = new byte[i];
        this.c = i;
    }

    public okh(byte[] bArr) {
        this.f29253a = bArr;
        this.c = bArr.length;
    }

    public okh(byte[] bArr, int i) {
        this.f29253a = bArr;
        this.c = i;
    }
}
