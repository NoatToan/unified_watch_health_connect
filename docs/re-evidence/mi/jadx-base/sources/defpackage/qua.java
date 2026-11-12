package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class qua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pv2 f31850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sua f31851b;
    public rua c;
    public boolean d;
    public boolean e;
    public int f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f31852k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31853r;
    public int s;
    public long t;
    public byte[] u;
    public int v;
    public long w;
    public long x;

    public qua(pv2 pv2Var) {
        this(pv2Var, null);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public int b(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        a();
        if (this.t == 0) {
            j();
        }
        int i2 = this.s;
        if (!this.d) {
            int i3 = this.f;
            if (i2 < i3) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i < this.f + i2) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i2 > 0) {
            n(this.l, 0, i2, bArr, i);
        }
        long j = this.w;
        int i4 = this.v;
        long j2 = j + ((long) i4);
        this.w = j2;
        if (j2 > this.x) {
            if (i4 > 0) {
                f(this.o, this.u, 0, i4);
            }
            if (this.x > 0) {
                tua.l(this.o, this.p);
            }
            long j3 = ((this.t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.c == null) {
                lg2 lg2Var = new lg2();
                this.c = lg2Var;
                lg2Var.a(this.j);
            }
            this.c.b(j3, bArr2);
            tua.e(this.o, bArr2);
            tua.l(this.n, this.o);
        }
        byte[] bArr3 = new byte[16];
        zgh.j(this.w * 8, bArr3, 0);
        zgh.j(this.t * 8, bArr3, 8);
        d(this.n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f31850a.processBlock(this.f31852k, 0, bArr4, 0);
        tua.l(bArr4, this.n);
        int i5 = this.f;
        byte[] bArr5 = new byte[i5];
        this.m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr, i + this.s, this.f);
            i2 += this.f;
        } else {
            int i6 = this.f;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.l, i2, bArr6, 0, i6);
            if (!vj1.m(this.m, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        o(false);
        return i2;
    }

    public final void c(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            f(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        tua.l(bArr, bArr2);
        this.f31851b.b(bArr);
    }

    public final void e(byte[] bArr, byte[] bArr2, int i) {
        tua.m(bArr, bArr2, i);
        this.f31851b.b(bArr);
    }

    public final void f(byte[] bArr, byte[] bArr2, int i, int i2) {
        tua.n(bArr, bArr2, i, i2);
        this.f31851b.b(bArr);
    }

    public final void g(byte[] bArr) {
        int i = this.f31853r;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f31853r = i - 1;
        byte[] bArr2 = this.q;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.f31850a.processBlock(bArr2, 0, bArr, 0);
    }

    public int h(int i) {
        int i2 = i + this.s;
        if (this.d) {
            return i2 + this.f;
        }
        int i3 = this.f;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    public void i(boolean z, lw3 lw3Var) throws IllegalArgumentException {
        byte[] bArrA;
        c0e c0eVarB;
        byte[] bArr;
        this.d = z;
        this.m = null;
        this.e = true;
        if (lw3Var instanceof c0) {
            c0 c0Var = (c0) lw3Var;
            bArrA = c0Var.d();
            this.i = c0Var.a();
            int iC = c0Var.c();
            if (iC < 32 || iC > 128 || iC % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + iC);
            }
            this.f = iC / 8;
            c0eVarB = c0Var.b();
        } else {
            if (!(lw3Var instanceof akh)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            akh akhVar = (akh) lw3Var;
            bArrA = akhVar.a();
            this.i = null;
            this.f = 16;
            c0eVarB = (c0e) akhVar.b();
        }
        this.l = new byte[z ? 16 : this.f + 16];
        if (bArrA == null || bArrA.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr = this.h) != null && vj1.a(bArr, bArrA)) {
            if (c0eVarB == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.g;
            if (bArr2 != null && vj1.a(bArr2, c0eVarB.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.h = bArrA;
        if (c0eVarB != null) {
            this.g = c0eVarB.a();
        }
        if (c0eVarB != null) {
            this.f31850a.a(true, c0eVarB);
            byte[] bArr3 = new byte[16];
            this.j = bArr3;
            this.f31850a.processBlock(bArr3, 0, bArr3, 0);
            this.f31851b.a(this.j);
            this.c = null;
        } else if (this.j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f31852k = bArr4;
        byte[] bArr5 = this.h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f31852k[15] = 1;
        } else {
            c(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            zgh.j(((long) this.h.length) * 8, bArr6, 8);
            d(this.f31852k, bArr6);
        }
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = vj1.e(this.f31852k);
        this.f31853r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr7 = this.i;
        if (bArr7 != null) {
            k(bArr7, 0, bArr7.length);
        }
    }

    public final void j() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i = this.v;
        if (i > 0) {
            f(this.p, this.u, 0, i);
            this.x += (long) this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    public void k(byte[] bArr, int i, int i2) {
        a();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.u;
            int i4 = this.v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.v = i5;
            if (i5 == 16) {
                d(this.o, bArr2);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    public final void l(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.t == 0) {
            j();
        }
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.d) {
            tua.m(bArr3, bArr, i);
            d(this.n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            e(this.n, bArr, i);
            tua.k(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.t += 16;
    }

    public int m(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4;
        a();
        if (bArr.length - i < i2) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.d) {
            if (this.s == 0) {
                i4 = 0;
                break;
            }
            while (true) {
                if (i2 <= 0) {
                    i4 = 0;
                    break;
                }
                i2--;
                byte[] bArr3 = this.l;
                int i5 = this.s;
                int i6 = i + 1;
                bArr3[i5] = bArr[i];
                int i7 = i5 + 1;
                this.s = i7;
                if (i7 == 16) {
                    l(bArr3, 0, bArr2, i3);
                    this.s = 0;
                    i4 = 16;
                    i = i6;
                    break;
                }
                i = i6;
            }
            while (i2 >= 16) {
                l(bArr, i, bArr2, i3 + i4);
                i += 16;
                i2 -= 16;
                i4 += 16;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i, this.l, 0, i2);
                this.s = i2;
            }
        } else {
            i4 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte[] bArr4 = this.l;
                int i9 = this.s;
                bArr4[i9] = bArr[i + i8];
                int i10 = i9 + 1;
                this.s = i10;
                if (i10 == bArr4.length) {
                    l(bArr4, 0, bArr2, i3 + i4);
                    byte[] bArr5 = this.l;
                    System.arraycopy(bArr5, 16, bArr5, 0, this.f);
                    this.s = this.f;
                    i4 += 16;
                }
            }
        }
        return i4;
    }

    public final void n(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.d) {
            tua.j(bArr, i, bArr3, 0, i2);
            f(this.n, bArr, i, i2);
        } else {
            f(this.n, bArr, i, i2);
            tua.j(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.t += (long) i2;
    }

    public final void o(boolean z) {
        this.f31850a.reset();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = vj1.e(this.f31852k);
        this.f31853r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr = this.l;
        if (bArr != null) {
            vj1.o(bArr, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public qua(pv2 pv2Var, sua suaVar) {
        if (pv2Var.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        suaVar = suaVar == null ? new kzo() : suaVar;
        this.f31850a = pv2Var;
        this.f31851b = suaVar;
    }
}
