package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class o34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f28687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28688b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int g = Integer.MAX_VALUE;
    public int i = 64;
    public int j = 67108864;

    public o34(byte[] bArr, int i, int i2) {
        this.f28687a = bArr;
        this.f28688b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static o34 h(byte[] bArr, int i, int i2) {
        return new o34(bArr, i, i2);
    }

    public int A() throws IOException {
        if (g()) {
            this.f = 0;
            return 0;
        }
        int iV = v();
        this.f = iV;
        if (iV != 0) {
            return iV;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int B() throws IOException {
        return v();
    }

    public long C() throws IOException {
        return w();
    }

    public final void D() {
        int i = this.c + this.d;
        this.c = i;
        int i2 = this.g;
        if (i <= i2) {
            this.d = 0;
            return;
        }
        int i3 = i - i2;
        this.d = i3;
        this.c = i - i3;
    }

    public void E(int i) {
        int i2 = this.e;
        int i3 = this.f28688b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.f28688b));
        }
        if (i >= 0) {
            this.e = i3 + i;
            return;
        }
        throw new IllegalArgumentException("Bad position " + i);
    }

    public boolean F(int i) throws IOException {
        int iC = bmr.c(i);
        if (iC == 0) {
            p();
            return true;
        }
        if (iC == 1) {
            u();
            return true;
        }
        if (iC == 2) {
            H(v());
            return true;
        }
        if (iC == 3) {
            G();
            a(bmr.d(bmr.b(i), 4));
            return true;
        }
        if (iC == 4) {
            return false;
        }
        if (iC != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        t();
        return true;
    }

    public void G() throws IOException {
        int iA;
        do {
            iA = A();
            if (iA == 0) {
                return;
            }
        } while (F(iA));
    }

    public void H(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            H(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.e = i2 + i;
    }

    public void a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int d() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.e;
    }

    public byte[] e(int i, int i2) {
        if (i2 == 0) {
            return bmr.h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f28687a, this.f28688b + i, bArr, 0, i2);
        return bArr;
    }

    public int f() {
        return this.e - this.f28688b;
    }

    public boolean g() {
        return this.e == this.c;
    }

    public void i(int i) {
        this.g = i;
        D();
    }

    public int j(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = i + this.e;
        int i3 = this.g;
        if (i2 > i3) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.g = i2;
        D();
        return i3;
    }

    public boolean k() throws IOException {
        return v() != 0;
    }

    public byte[] l() throws IOException {
        int iV = v();
        int i = this.c;
        int i2 = this.e;
        if (iV > i - i2 || iV <= 0) {
            return iV == 0 ? bmr.h : s(iV);
        }
        byte[] bArr = new byte[iV];
        System.arraycopy(this.f28687a, i2, bArr, 0, iV);
        this.e += iV;
        return bArr;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(u());
    }

    public int n() throws IOException {
        return v();
    }

    public float o() throws IOException {
        return Float.intBitsToFloat(t());
    }

    public int p() throws IOException {
        return v();
    }

    public void q(dsf dsfVar) throws IOException {
        int iV = v();
        if (this.h >= this.i) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iJ = j(iV);
        this.h++;
        dsfVar.e(this);
        a(0);
        this.h--;
        i(iJ);
    }

    public byte r() throws IOException {
        int i = this.e;
        if (i == this.c) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.f28687a;
        this.e = i + 1;
        return bArr[i];
    }

    public byte[] s(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            H(i4 - i2);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.c - i2) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f28687a, i2, bArr, 0, i);
        this.e += i;
        return bArr;
    }

    public int t() throws IOException {
        return (r() & 255) | ((r() & 255) << 8) | ((r() & 255) << 16) | ((r() & 255) << 24);
    }

    public long u() throws IOException {
        byte bR = r();
        return ((((long) r()) & 255) << 8) | (((long) bR) & 255) | ((((long) r()) & 255) << 16) | ((((long) r()) & 255) << 24) | ((((long) r()) & 255) << 32) | ((((long) r()) & 255) << 40) | ((((long) r()) & 255) << 48) | ((((long) r()) & 255) << 56);
    }

    public int v() throws IOException {
        int i;
        byte bR = r();
        if (bR >= 0) {
            return bR;
        }
        int i2 = bR & 127;
        byte bR2 = r();
        if (bR2 >= 0) {
            i = bR2 << 7;
        } else {
            i2 |= (bR2 & 127) << 7;
            byte bR3 = r();
            if (bR3 >= 0) {
                i = bR3 << HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
            } else {
                i2 |= (bR3 & 127) << 14;
                byte bR4 = r();
                if (bR4 < 0) {
                    int i3 = i2 | ((bR4 & 127) << 21);
                    byte bR5 = r();
                    int i4 = i3 | (bR5 << 28);
                    if (bR5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (r() >= 0) {
                            return i4;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
                i = bR4 << 21;
            }
        }
        return i2 | i;
    }

    public long w() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bR = r();
            j |= ((long) (bR & 127)) << i;
            if ((bR & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int x() throws IOException {
        return b(v());
    }

    public long y() throws IOException {
        return c(w());
    }

    public String z() throws IOException {
        int iV = v();
        int i = this.c;
        int i2 = this.e;
        if (iV > i - i2 || iV <= 0) {
            return new String(s(iV), afd.f947a);
        }
        String str = new String(this.f28687a, i2, iV, afd.f947a);
        this.e += iV;
        return str;
    }
}
