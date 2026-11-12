package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.push.d;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public final class cas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5140b;
    public int c;
    public int d;
    public final InputStream e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5141k;

    public cas(byte[] bArr, int i, int i2) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.f5141k = 67108864;
        this.f5139a = bArr;
        this.f5140b = i2 + i;
        this.d = i;
        this.e = null;
    }

    public static cas f(InputStream inputStream) {
        return new cas(inputStream);
    }

    public static cas g(byte[] bArr, int i, int i2) {
        return new cas(bArr, i, i2);
    }

    public byte a() throws d {
        if (this.d == this.f5140b) {
            n(true);
        }
        byte[] bArr = this.f5139a;
        int i = this.d;
        this.d = i + 1;
        return bArr[i];
    }

    public int b() throws d {
        if (t()) {
            this.f = 0;
            return 0;
        }
        int iX = x();
        this.f = iX;
        if (iX != 0) {
            return iX;
        }
        throw d.d();
    }

    public int c(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = i + this.g + this.d;
        int i3 = this.h;
        if (i2 > i3) {
            throw d.a();
        }
        this.h = i2;
        r();
        return i3;
    }

    public long d() {
        return v();
    }

    public l3s e() throws d {
        int iX = x();
        int i = this.f5140b;
        int i2 = this.d;
        if (iX > i - i2 || iX <= 0) {
            return l3s.b(o(iX));
        }
        l3s l3sVarC = l3s.c(this.f5139a, i2, iX);
        this.d += iX;
        return l3sVarC;
    }

    public String h() throws d {
        int iX = x();
        int i = this.f5140b;
        int i2 = this.d;
        if (iX > i - i2 || iX <= 0) {
            return new String(o(iX), "UTF-8");
        }
        String str = new String(this.f5139a, i2, iX, "UTF-8");
        this.d += iX;
        return str;
    }

    public void i() throws d {
        int iB;
        do {
            iB = b();
            if (iB == 0) {
                return;
            }
        } while (m(iB));
    }

    public void j(int i) throws d {
        if (this.f != i) {
            throw d.e();
        }
    }

    public void k(qns qnsVar) throws d {
        int iX = x();
        if (this.i >= this.j) {
            throw d.g();
        }
        int iC = c(iX);
        this.i++;
        qnsVar.b(this);
        j(0);
        this.i--;
        s(iC);
    }

    public boolean l() {
        return x() != 0;
    }

    public boolean m(int i) throws d {
        int iA = bss.a(i);
        if (iA == 0) {
            p();
            return true;
        }
        if (iA == 1) {
            y();
            return true;
        }
        if (iA == 2) {
            w(x());
            return true;
        }
        if (iA == 3) {
            i();
            j(bss.b(bss.c(i), 4));
            return true;
        }
        if (iA == 4) {
            return false;
        }
        if (iA != 5) {
            throw d.f();
        }
        z();
        return true;
    }

    public final boolean n(boolean z) throws d {
        int i = this.d;
        int i2 = this.f5140b;
        if (i < i2) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i3 = this.g;
        if (i3 + i2 == this.h) {
            if (z) {
                throw d.a();
            }
            return false;
        }
        this.g = i3 + i2;
        this.d = 0;
        InputStream inputStream = this.e;
        int i4 = inputStream == null ? -1 : inputStream.read(this.f5139a);
        this.f5140b = i4;
        if (i4 == 0 || i4 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f5140b + "\nThe InputStream implementation is buggy.");
        }
        if (i4 == -1) {
            this.f5140b = 0;
            if (z) {
                throw d.a();
            }
            return false;
        }
        r();
        int i5 = this.g + this.f5140b + this.c;
        if (i5 > this.f5141k || i5 < 0) {
            throw d.h();
        }
        return true;
    }

    public byte[] o(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            w((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.f5140b;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f5139a, i3, bArr, 0, i);
            this.d += i;
            return bArr;
        }
        if (i >= 4096) {
            this.g = i2 + i6;
            this.d = 0;
            this.f5140b = 0;
            int length = i6 - i3;
            int i7 = i - length;
            Vector vector = new Vector();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr2 = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    InputStream inputStream = this.e;
                    int i9 = inputStream == null ? -1 : inputStream.read(bArr2, i8, iMin - i8);
                    if (i9 == -1) {
                        throw d.a();
                    }
                    this.g += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f5139a, i3, bArr3, 0, length);
            for (int i10 = 0; i10 < vector.size(); i10++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i10);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i];
        int i11 = i6 - i3;
        System.arraycopy(this.f5139a, i3, bArr5, 0, i11);
        this.d = this.f5140b;
        n(true);
        while (true) {
            int i12 = i - i11;
            int i13 = this.f5140b;
            if (i12 <= i13) {
                System.arraycopy(this.f5139a, 0, bArr5, i11, i12);
                this.d = i12;
                return bArr5;
            }
            System.arraycopy(this.f5139a, 0, bArr5, i11, i13);
            int i14 = this.f5140b;
            i11 += i14;
            this.d = i14;
            n(true);
        }
    }

    public int p() {
        return x();
    }

    public long q() {
        return v();
    }

    public final void r() {
        int i = this.f5140b + this.c;
        this.f5140b = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 <= i3) {
            this.c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.c = i4;
        this.f5140b = i - i4;
    }

    public void s(int i) {
        this.h = i;
        r();
    }

    public boolean t() {
        return this.d == this.f5140b && !n(false);
    }

    public int u() {
        return x();
    }

    public long v() throws d {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw d.c();
    }

    public void w(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            w((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.f5140b;
        if (i <= i6 - i3) {
            this.d = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.g = i2 + i6;
        this.d = 0;
        this.f5140b = 0;
        while (i7 < i) {
            InputStream inputStream = this.e;
            int iSkip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
            if (iSkip <= 0) {
                throw d.a();
            }
            i7 += iSkip;
            this.g += iSkip;
        }
    }

    public int x() throws d {
        int i;
        byte bA = a();
        if (bA >= 0) {
            return bA;
        }
        int i2 = bA & 127;
        byte bA2 = a();
        if (bA2 >= 0) {
            i = bA2 << 7;
        } else {
            i2 |= (bA2 & 127) << 7;
            byte bA3 = a();
            if (bA3 >= 0) {
                i = bA3 << HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
            } else {
                i2 |= (bA3 & 127) << 14;
                byte bA4 = a();
                if (bA4 < 0) {
                    int i3 = i2 | ((bA4 & 127) << 21);
                    byte bA5 = a();
                    int i4 = i3 | (bA5 << 28);
                    if (bA5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (a() >= 0) {
                            return i4;
                        }
                    }
                    throw d.c();
                }
                i = bA4 << 21;
            }
        }
        return i2 | i;
    }

    public long y() throws d {
        byte bA = a();
        return ((((long) a()) & 255) << 8) | (((long) bA) & 255) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
    }

    public int z() throws d {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    public cas(InputStream inputStream) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.f5141k = 67108864;
        this.f5139a = new byte[4096];
        this.f5140b = 0;
        this.d = 0;
        this.e = inputStream;
    }
}
