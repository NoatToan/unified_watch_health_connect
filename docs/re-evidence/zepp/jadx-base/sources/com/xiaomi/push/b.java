package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private final InputStream e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private b(InputStream inputStream) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.k = 67108864;
        this.a = new byte[4096];
        this.b = 0;
        this.d = 0;
        this.e = inputStream;
    }

    private b(byte[] bArr, int i, int i2) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.k = 67108864;
        this.a = bArr;
        this.b = i2 + i;
        this.d = i;
        this.e = null;
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    private boolean b(boolean z) throws d {
        int i = this.d;
        int i2 = this.b;
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
        int i4 = inputStream == null ? -1 : inputStream.read(this.a);
        this.b = i4;
        if (i4 == 0 || i4 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.b + "\nThe InputStream implementation is buggy.");
        }
        if (i4 == -1) {
            this.b = 0;
            if (z) {
                throw d.a();
            }
            return false;
        }
        f();
        int i5 = this.g + this.b + this.c;
        if (i5 > this.k || i5 < 0) {
            throw d.i();
        }
        return true;
    }

    private void f() {
        int i = this.b + this.c;
        this.b = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 <= i3) {
            this.c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.c = i4;
        this.b = i - i4;
    }

    public byte a() throws d {
        if (this.d == this.b) {
            b(true);
        }
        byte[] bArr = this.a;
        int i = this.d;
        this.d = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m3577a() throws d {
        if (m3587b()) {
            this.f = 0;
            return 0;
        }
        int iD = d();
        this.f = iD;
        if (iD != 0) {
            return iD;
        }
        throw d.e();
    }

    public int a(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = i + this.g + this.d;
        int i3 = this.h;
        if (i2 > i3) {
            throw d.a();
        }
        this.h = i2;
        f();
        return i3;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m3578a() {
        return m3586b();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public a m3579a() throws d {
        int iD = d();
        int i = this.b;
        int i2 = this.d;
        if (iD > i - i2 || iD <= 0) {
            return a.a(m3585a(iD));
        }
        a aVarA = a.a(this.a, i2, iD);
        this.d += iD;
        return aVarA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3580a() throws d {
        int iD = d();
        int i = this.b;
        int i2 = this.d;
        if (iD > i - i2 || iD <= 0) {
            return new String(m3585a(iD), "UTF-8");
        }
        String str = new String(this.a, i2, iD, "UTF-8");
        this.d += iD;
        return str;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3581a() throws d {
        int iM3577a;
        do {
            iM3577a = m3577a();
            if (iM3577a == 0) {
                return;
            }
        } while (m3584a(iM3577a));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3582a(int i) throws d {
        if (this.f != i) {
            throw d.f();
        }
    }

    public void a(e eVar) throws d {
        int iD = d();
        if (this.i >= this.j) {
            throw d.h();
        }
        int iA = a(iD);
        this.i++;
        eVar.a(this);
        m3582a(0);
        this.i--;
        b(iA);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3583a() {
        return d() != 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3584a(int i) throws d {
        int iA = f.a(i);
        if (iA == 0) {
            b();
            return true;
        }
        if (iA == 1) {
            m3588c();
            return true;
        }
        if (iA == 2) {
            c(d());
            return true;
        }
        if (iA == 3) {
            m3581a();
            m3582a(f.b(f.b(i), 4));
            return true;
        }
        if (iA == 4) {
            return false;
        }
        if (iA != 5) {
            throw d.g();
        }
        e();
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m3585a(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            c((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.b;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.a, i3, bArr, 0, i);
            this.d += i;
            return bArr;
        }
        if (i >= 4096) {
            this.g = i2 + i6;
            this.d = 0;
            this.b = 0;
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
            System.arraycopy(this.a, i3, bArr3, 0, length);
            for (int i10 = 0; i10 < vector.size(); i10++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i10);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i];
        int i11 = i6 - i3;
        System.arraycopy(this.a, i3, bArr5, 0, i11);
        this.d = this.b;
        while (true) {
            b(true);
            int i12 = i - i11;
            int i13 = this.b;
            if (i12 <= i13) {
                System.arraycopy(this.a, 0, bArr5, i11, i12);
                this.d = i12;
                return bArr5;
            }
            System.arraycopy(this.a, 0, bArr5, i11, i13);
            int i14 = this.b;
            i11 += i14;
            this.d = i14;
        }
    }

    public int b() {
        return d();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public long m3586b() throws d {
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

    public void b(int i) {
        this.h = i;
        f();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3587b() {
        return this.d == this.b && !b(false);
    }

    public int c() {
        return d();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public long m3588c() throws d {
        byte bA = a();
        return ((((long) a()) & 255) << 8) | (((long) bA) & 255) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
    }

    public void c(int i) throws d {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            c((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.b;
        if (i <= i6 - i3) {
            this.d = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.g = i2 + i6;
        this.d = 0;
        this.b = 0;
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

    public int d() throws d {
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
                i = bA3 << 14;
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

    public int e() throws d {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }
}
