package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b87 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public do9 f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h87 f3911b;
    public h87 c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;
    public e87 g = null;

    public static abstract class a extends b87 {
        public BigInteger[] h;

        public a(int i, int i2, int i3, int i4) {
            super(y(i, i2, i3, i4));
            this.h = null;
        }

        public static do9 y(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    return fo9.a(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i4 > i3) {
                return fo9.a(new int[]{0, i2, i3, i4, i});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        @Override // defpackage.b87
        public i97 e(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            h87 h87VarJ = j(bigInteger);
            h87 h87VarJ2 = j(bigInteger2);
            int iN = n();
            if (iN == 5 || iN == 6) {
                if (!h87VarJ.i()) {
                    h87VarJ2 = h87VarJ2.d(h87VarJ).a(h87VarJ);
                } else if (!h87VarJ2.o().equals(l())) {
                    throw new IllegalArgumentException();
                }
            }
            return f(h87VarJ, h87VarJ2, z);
        }

        @Override // defpackage.b87
        public i97 h(int i, BigInteger bigInteger) {
            h87 h87VarA;
            h87 h87VarJ = j(bigInteger);
            if (h87VarJ.i()) {
                h87VarA = l().n();
            } else {
                h87 h87VarZ = z(h87VarJ.o().g().j(l()).a(k()).a(h87VarJ));
                if (h87VarZ != null) {
                    if (h87VarZ.r() != (i == 1)) {
                        h87VarZ = h87VarZ.b();
                    }
                    int iN = n();
                    h87VarA = (iN == 5 || iN == 6) ? h87VarZ.a(h87VarJ) : h87VarZ.j(h87VarJ);
                } else {
                    h87VarA = null;
                }
            }
            if (h87VarA != null) {
                return f(h87VarJ, h87VarA, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public final h87 z(h87 h87Var) {
            h87 h87VarA;
            if (h87Var.i()) {
                return h87Var;
            }
            h87 h87VarJ = j(y77.f39883a);
            int iP = p();
            Random random = new Random();
            do {
                h87 h87VarJ2 = j(new BigInteger(iP, random));
                h87 h87VarA2 = h87Var;
                h87VarA = h87VarJ;
                for (int i = 1; i < iP; i++) {
                    h87 h87VarO = h87VarA2.o();
                    h87VarA = h87VarA.o().a(h87VarO.j(h87VarJ2));
                    h87VarA2 = h87VarO.a(h87Var);
                }
                if (!h87VarA2.i()) {
                    return null;
                }
            } while (h87VarA.o().a(h87VarA).i());
            return h87VarA;
        }
    }

    public static abstract class b extends b87 {
        public b(BigInteger bigInteger) {
            super(fo9.b(bigInteger));
        }

        @Override // defpackage.b87
        public i97 h(int i, BigInteger bigInteger) {
            h87 h87VarJ = j(bigInteger);
            h87 h87VarN = h87VarJ.o().a(this.f3911b).j(h87VarJ).a(this.c).n();
            if (h87VarN == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (h87VarN.r() != (i == 1)) {
                h87VarN = h87VarN.m();
            }
            return f(h87VarJ, h87VarN, true);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e87 f3913b;

        public c(int i, e87 e87Var, v87 v87Var) {
            this.f3912a = i;
            this.f3913b = e87Var;
        }

        public b87 a() {
            if (!b87.this.v(this.f3912a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            b87 b87VarB = b87.this.b();
            if (b87VarB == b87.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (b87VarB) {
                b87VarB.f = this.f3912a;
                b87VarB.g = this.f3913b;
            }
            return b87VarB;
        }

        public c b(e87 e87Var) {
            this.f3913b = e87Var;
            return this;
        }
    }

    public b87(do9 do9Var) {
        this.f3910a = do9Var;
    }

    public void a(i97[] i97VarArr, int i, int i2) {
        if (i97VarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > i97VarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            i97 i97Var = i97VarArr[i + i3];
            if (i97Var != null && this != i97Var.i()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public abstract b87 b();

    public synchronized c c() {
        return new c(this.f, this.g, null);
    }

    public i97 d(BigInteger bigInteger, BigInteger bigInteger2) {
        return e(bigInteger, bigInteger2, false);
    }

    public i97 e(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return f(j(bigInteger), j(bigInteger2), z);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof b87) && i((b87) obj));
    }

    public abstract i97 f(h87 h87Var, h87 h87Var2, boolean z);

    public i97 g(byte[] bArr) {
        i97 i97VarQ;
        int iP = (p() + 7) / 8;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length != iP + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                i97VarQ = h(b2 & 1, xi2.c(bArr, 1, iP));
                if (!i97VarQ.y()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b2, 16));
                }
                if (bArr.length != (iP * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerC = xi2.c(bArr, 1, iP);
                BigInteger bigIntegerC2 = xi2.c(bArr, iP + 1, iP);
                if (bigIntegerC2.testBit(0) != (b2 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                i97VarQ = w(bigIntegerC, bigIntegerC2);
            } else {
                if (bArr.length != (iP * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                i97VarQ = w(xi2.c(bArr, 1, iP), xi2.c(bArr, iP + 1, iP));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            i97VarQ = q();
        }
        if (b2 == 0 || !i97VarQ.s()) {
            return i97VarQ;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract i97 h(int i, BigInteger bigInteger);

    public int hashCode() {
        return (o().hashCode() ^ scd.a(k().s().hashCode(), 8)) ^ scd.a(l().s().hashCode(), 16);
    }

    public boolean i(b87 b87Var) {
        return this == b87Var || (b87Var != null && o().equals(b87Var.o()) && k().s().equals(b87Var.k().s()) && l().s().equals(b87Var.l().s()));
    }

    public abstract h87 j(BigInteger bigInteger);

    public h87 k() {
        return this.f3911b;
    }

    public h87 l() {
        return this.c;
    }

    public BigInteger m() {
        return this.e;
    }

    public int n() {
        return this.f;
    }

    public do9 o() {
        return this.f3910a;
    }

    public abstract int p();

    public abstract i97 q();

    public BigInteger r() {
        return this.d;
    }

    public i97 s(i97 i97Var) {
        if (this == i97Var.i()) {
            return i97Var;
        }
        if (i97Var.s()) {
            return q();
        }
        i97 i97VarW = i97Var.w();
        return x(i97VarW.p().s(), i97VarW.q().s(), i97VarW.e);
    }

    public void t(i97[] i97VarArr) {
        u(i97VarArr, 0, i97VarArr.length, null);
    }

    public void u(i97[] i97VarArr, int i, int i2, h87 h87Var) {
        a(i97VarArr, i, i2);
        int iN = n();
        if (iN == 0 || iN == 5) {
            if (h87Var != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        h87[] h87VarArr = new h87[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            i97 i97Var = i97VarArr[i5];
            if (i97Var != null && (h87Var != null || !i97Var.t())) {
                h87VarArr[i3] = i97Var.r(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 == 0) {
            return;
        }
        u77.e(h87VarArr, 0, i3, h87Var);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            i97VarArr[i7] = i97VarArr[i7].x(h87VarArr[i6]);
        }
    }

    public boolean v(int i) {
        return i == 0;
    }

    public i97 w(BigInteger bigInteger, BigInteger bigInteger2) {
        i97 i97VarD = d(bigInteger, bigInteger2);
        if (i97VarD.u()) {
            return i97VarD;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public i97 x(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        i97 i97VarE = e(bigInteger, bigInteger2, z);
        if (i97VarE.u()) {
            return i97VarE;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public static class d extends a {
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3914k;
        public int l;
        public i97.c m;

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // defpackage.b87
        public b87 b() {
            return new d(this.i, this.j, this.f3914k, this.l, this.f3911b, this.c, this.d, this.e);
        }

        @Override // defpackage.b87
        public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
            return new i97.c(this, h87Var, h87Var2, z);
        }

        @Override // defpackage.b87
        public h87 j(BigInteger bigInteger) {
            return new h87.a(this.i, this.j, this.f3914k, this.l, bigInteger);
        }

        @Override // defpackage.b87
        public int p() {
            return this.i;
        }

        @Override // defpackage.b87
        public i97 q() {
            return this.m;
        }

        @Override // defpackage.b87
        public boolean v(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        public d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.i = i;
            this.j = i2;
            this.f3914k = i3;
            this.l = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.m = new i97.c(this, null, null);
            this.f3911b = j(bigInteger);
            this.c = j(bigInteger2);
            this.f = 6;
        }

        public d(int i, int i2, int i3, int i4, h87 h87Var, h87 h87Var2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.i = i;
            this.j = i2;
            this.f3914k = i3;
            this.l = i4;
            this.d = bigInteger;
            this.e = bigInteger2;
            this.m = new i97.c(this, null, null);
            this.f3911b = h87Var;
            this.c = h87Var2;
            this.f = 6;
        }
    }

    public static class e extends b {
        public BigInteger h;
        public BigInteger i;
        public i97.d j;

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // defpackage.b87
        public b87 b() {
            return new e(this.h, this.i, this.f3911b, this.c, this.d, this.e);
        }

        @Override // defpackage.b87
        public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
            return new i97.d(this, h87Var, h87Var2, z);
        }

        @Override // defpackage.b87
        public h87 j(BigInteger bigInteger) {
            return new h87.b(this.h, this.i, bigInteger);
        }

        @Override // defpackage.b87
        public int p() {
            return this.h.bitLength();
        }

        @Override // defpackage.b87
        public i97 q() {
            return this.j;
        }

        @Override // defpackage.b87
        public i97 s(i97 i97Var) {
            int iN;
            return (this == i97Var.i() || n() != 2 || i97Var.s() || !((iN = i97Var.i().n()) == 2 || iN == 3 || iN == 4)) ? super.s(i97Var) : new i97.d(this, j(i97Var.f20903b.s()), j(i97Var.c.s()), new h87[]{j(i97Var.d[0].s())}, i97Var.e);
        }

        @Override // defpackage.b87
        public boolean v(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.h = bigInteger;
            this.i = h87.b.t(bigInteger);
            this.j = new i97.d(this, null, null);
            this.f3911b = j(bigInteger2);
            this.c = j(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, h87 h87Var, h87 h87Var2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.h = bigInteger;
            this.i = bigInteger2;
            this.j = new i97.d(this, null, null);
            this.f3911b = h87Var;
            this.c = h87Var2;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.f = 4;
        }
    }
}
