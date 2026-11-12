package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a87 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eo9 f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g87 f755b;
    public g87 c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;
    public f87 g = null;
    public w87 h = null;

    public static abstract class a extends a87 {
        public BigInteger[] i;

        public a(int i, int i2, int i3, int i4) {
            super(E(i, i2, i3, i4));
            this.i = null;
        }

        public static eo9 E(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    return go9.a(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i4 > i3) {
                return go9.a(new int[]{0, i2, i3, i4, i});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        public synchronized BigInteger[] F() {
            try {
                if (this.i == null) {
                    this.i = lgp.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.i;
        }

        public boolean G() {
            return this.d != null && this.e != null && this.c.h() && (this.f755b.i() || this.f755b.h());
        }

        public final g87 H(g87 g87Var) {
            g87 g87VarA;
            if (g87Var.i()) {
                return g87Var;
            }
            g87 g87VarM = m(z77.f40975a);
            int iS = s();
            Random random = new Random();
            do {
                g87 g87VarM2 = m(new BigInteger(iS, random));
                g87 g87VarA2 = g87Var;
                g87VarA = g87VarM;
                for (int i = 1; i < iS; i++) {
                    g87 g87VarO = g87VarA2.o();
                    g87VarA = g87VarA.o().a(g87VarO.j(g87VarM2));
                    g87VarA2 = g87VarO.a(g87Var);
                }
                if (!g87VarA2.i()) {
                    return null;
                }
            } while (g87VarA.o().a(g87VarA).i());
            return g87VarA;
        }

        @Override // defpackage.a87
        public h97 g(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            g87 g87VarM = m(bigInteger);
            g87 g87VarM2 = m(bigInteger2);
            int iQ = q();
            if (iQ == 5 || iQ == 6) {
                if (!g87VarM.i()) {
                    g87VarM2 = g87VarM2.d(g87VarM).a(g87VarM);
                } else if (!g87VarM2.o().equals(o())) {
                    throw new IllegalArgumentException();
                }
            }
            return h(g87VarM, g87VarM2, z);
        }

        @Override // defpackage.a87
        public h97 k(int i, BigInteger bigInteger) {
            g87 g87VarA;
            g87 g87VarM = m(bigInteger);
            if (g87VarM.i()) {
                g87VarA = o().n();
            } else {
                g87 g87VarH = H(g87VarM.o().g().j(o()).a(n()).a(g87VarM));
                if (g87VarH != null) {
                    if (g87VarH.s() != (i == 1)) {
                        g87VarH = g87VarH.b();
                    }
                    int iQ = q();
                    g87VarA = (iQ == 5 || iQ == 6) ? g87VarH.a(g87VarM) : g87VarH.j(g87VarM);
                } else {
                    g87VarA = null;
                }
            }
            if (g87VarA != null) {
                return h(g87VarM, g87VarA, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public static abstract class b extends a87 {
        public b(BigInteger bigInteger) {
            super(go9.b(bigInteger));
        }

        @Override // defpackage.a87
        public h97 k(int i, BigInteger bigInteger) {
            g87 g87VarM = m(bigInteger);
            g87 g87VarN = g87VarM.o().a(this.f755b).j(g87VarM).a(this.c).n();
            if (g87VarN == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (g87VarN.s() != (i == 1)) {
                g87VarN = g87VarN.m();
            }
            return h(g87VarM, g87VarN, true);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f87 f757b;
        public w87 c;

        public c(int i, f87 f87Var, w87 w87Var) {
            this.f756a = i;
            this.f757b = f87Var;
            this.c = w87Var;
        }

        public a87 a() {
            if (!a87.this.B(this.f756a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            a87 a87VarC = a87.this.c();
            if (a87VarC == a87.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (a87VarC) {
                a87VarC.f = this.f756a;
                a87VarC.g = this.f757b;
                a87VarC.h = this.c;
            }
            return a87VarC;
        }

        public c b(f87 f87Var) {
            this.f757b = f87Var;
            return this;
        }
    }

    public static class d extends a {
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f758k;
        public int l;
        public int m;
        public h97.c n;

        public d(int i, int i2, int i3, int i4, g87 g87Var, g87 g87Var2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.j = i;
            this.f758k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger;
            this.e = bigInteger2;
            this.n = new h97.c(this, null, null);
            this.f755b = g87Var;
            this.c = g87Var2;
            this.f = 6;
        }

        @Override // defpackage.a87
        public boolean B(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        @Override // defpackage.a87
        public a87 c() {
            return new d(this.j, this.f758k, this.l, this.m, this.f755b, this.c, this.d, this.e);
        }

        @Override // defpackage.a87
        public w87 e() {
            return G() ? new i3r() : super.e();
        }

        @Override // defpackage.a87
        public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
            return new h97.c(this, g87Var, g87Var2, z);
        }

        @Override // defpackage.a87
        public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
            return new h97.c(this, g87Var, g87Var2, g87VarArr, z);
        }

        @Override // defpackage.a87
        public g87 m(BigInteger bigInteger) {
            return new g87.a(this.j, this.f758k, this.l, this.m, bigInteger);
        }

        @Override // defpackage.a87
        public int s() {
            return this.j;
        }

        @Override // defpackage.a87
        public h97 t() {
            return this.n;
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.j = i;
            this.f758k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.n = new h97.c(this, null, null);
            this.f755b = m(bigInteger);
            this.c = m(bigInteger2);
            this.f = 6;
        }

        public d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class e extends b {
        public BigInteger i;
        public BigInteger j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h97.d f759k;

        public e(BigInteger bigInteger, BigInteger bigInteger2, g87 g87Var, g87 g87Var2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = bigInteger2;
            this.f759k = new h97.d(this, null, null);
            this.f755b = g87Var;
            this.c = g87Var2;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.f = 4;
        }

        @Override // defpackage.a87
        public boolean B(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // defpackage.a87
        public a87 c() {
            return new e(this.i, this.j, this.f755b, this.c, this.d, this.e);
        }

        @Override // defpackage.a87
        public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
            return new h97.d(this, g87Var, g87Var2, z);
        }

        @Override // defpackage.a87
        public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
            return new h97.d(this, g87Var, g87Var2, g87VarArr, z);
        }

        @Override // defpackage.a87
        public g87 m(BigInteger bigInteger) {
            return new g87.b(this.i, this.j, bigInteger);
        }

        @Override // defpackage.a87
        public int s() {
            return this.i.bitLength();
        }

        @Override // defpackage.a87
        public h97 t() {
            return this.f759k;
        }

        @Override // defpackage.a87
        public h97 x(h97 h97Var) {
            int iQ;
            return (this == h97Var.i() || q() != 2 || h97Var.t() || !((iQ = h97Var.i().q()) == 2 || iQ == 3 || iQ == 4)) ? super.x(h97Var) : new h97.d(this, m(h97Var.f19826b.t()), m(h97Var.c.t()), new g87[]{m(h97Var.d[0].t())}, h97Var.e);
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = g87.b.u(bigInteger);
            this.f759k = new h97.d(this, null, null);
            this.f755b = m(bigInteger2);
            this.c = m(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }
    }

    public a87(eo9 eo9Var) {
        this.f754a = eo9Var;
    }

    public void A(h97 h97Var, String str, i5i i5iVar) {
        a(h97Var);
        synchronized (h97Var) {
            try {
                Hashtable hashtable = h97Var.f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    h97Var.f = hashtable;
                }
                hashtable.put(str, i5iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean B(int i) {
        return i == 0;
    }

    public h97 C(BigInteger bigInteger, BigInteger bigInteger2) {
        h97 h97VarF = f(bigInteger, bigInteger2);
        if (h97VarF.v()) {
            return h97VarF;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public h97 D(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        h97 h97VarG = g(bigInteger, bigInteger2, z);
        if (h97VarG.v()) {
            return h97VarG;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public void a(h97 h97Var) {
        if (h97Var == null || this != h97Var.i()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void b(h97[] h97VarArr, int i, int i2) {
        if (h97VarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > h97VarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h97 h97Var = h97VarArr[i + i3];
            if (h97Var != null && this != h97Var.i()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public abstract a87 c();

    public synchronized c d() {
        return new c(this.f, this.g, this.h);
    }

    public w87 e() {
        f87 f87Var = this.g;
        return f87Var instanceof pva ? new qva(this, (pva) f87Var) : new c3r();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof a87) && l((a87) obj));
    }

    public h97 f(BigInteger bigInteger, BigInteger bigInteger2) {
        return g(bigInteger, bigInteger2, false);
    }

    public h97 g(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return h(m(bigInteger), m(bigInteger2), z);
    }

    public abstract h97 h(g87 g87Var, g87 g87Var2, boolean z);

    public int hashCode() {
        return (r().hashCode() ^ rcd.a(n().t().hashCode(), 8)) ^ rcd.a(o().t().hashCode(), 16);
    }

    public abstract h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z);

    public h97 j(byte[] bArr) {
        h97 h97VarT;
        int iS = (s() + 7) / 8;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length != iS + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                h97VarT = k(b2 & 1, yi2.c(bArr, 1, iS));
                if (!h97VarT.A()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b2, 16));
                }
                if (bArr.length != (iS * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerC = yi2.c(bArr, 1, iS);
                BigInteger bigIntegerC2 = yi2.c(bArr, iS + 1, iS);
                if (bigIntegerC2.testBit(0) != (b2 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                h97VarT = C(bigIntegerC, bigIntegerC2);
            } else {
                if (bArr.length != (iS * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                h97VarT = C(yi2.c(bArr, 1, iS), yi2.c(bArr, iS + 1, iS));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            h97VarT = t();
        }
        if (b2 == 0 || !h97VarT.t()) {
            return h97VarT;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract h97 k(int i, BigInteger bigInteger);

    public boolean l(a87 a87Var) {
        return this == a87Var || (a87Var != null && r().equals(a87Var.r()) && n().t().equals(a87Var.n().t()) && o().t().equals(a87Var.o().t()));
    }

    public abstract g87 m(BigInteger bigInteger);

    public g87 n() {
        return this.f755b;
    }

    public g87 o() {
        return this.c;
    }

    public BigInteger p() {
        return this.e;
    }

    public int q() {
        return this.f;
    }

    public eo9 r() {
        return this.f754a;
    }

    public abstract int s();

    public abstract h97 t();

    public synchronized w87 u() {
        try {
            if (this.h == null) {
                this.h = e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public BigInteger v() {
        return this.d;
    }

    public i5i w(h97 h97Var, String str) {
        i5i i5iVar;
        a(h97Var);
        synchronized (h97Var) {
            Hashtable hashtable = h97Var.f;
            i5iVar = hashtable == null ? null : (i5i) hashtable.get(str);
        }
        return i5iVar;
    }

    public h97 x(h97 h97Var) {
        if (this == h97Var.i()) {
            return h97Var;
        }
        if (h97Var.t()) {
            return t();
        }
        h97 h97VarY = h97Var.y();
        return D(h97VarY.q().t(), h97VarY.r().t(), h97VarY.e);
    }

    public void y(h97[] h97VarArr) {
        z(h97VarArr, 0, h97VarArr.length, null);
    }

    public void z(h97[] h97VarArr, int i, int i2, g87 g87Var) {
        b(h97VarArr, i, i2);
        int iQ = q();
        if (iQ == 0 || iQ == 5) {
            if (g87Var != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        g87[] g87VarArr = new g87[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            h97 h97Var = h97VarArr[i5];
            if (h97Var != null && (g87Var != null || !h97Var.u())) {
                g87VarArr[i3] = h97Var.s(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 == 0) {
            return;
        }
        v77.h(g87VarArr, 0, i3, g87Var);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            h97VarArr[i7] = h97VarArr[i7].z(g87VarArr[i6]);
        }
    }
}
