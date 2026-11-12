package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class c9g implements il8 {
    public static final nl8 u = new nl8() { // from class: a9g
        @Override // defpackage.nl8
        public final il8[] c() {
            return c9g.o();
        }
    };
    public static final z1d.a v = new z1d.a() { // from class: b9g
        @Override // z1d.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return c9g.p(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5084b;
    public final okh c;
    public final j9g.a d;
    public final hxa e;
    public final a2d f;
    public final snp g;
    public kl8 h;
    public snp i;
    public snp j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5085k;
    public Metadata l;
    public long m;
    public long n;
    public long o;
    public int p;
    public drl q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5086r;
    public boolean s;
    public long t;

    public c9g() {
        this(0);
    }

    private void e() {
        rk1.i(this.i);
        wlq.j(this.h);
    }

    public static long l(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int iE = metadata.e();
        for (int i = 0; i < iE; i++) {
            Metadata.Entry entryD = metadata.d(i);
            if (entryD instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryD;
                if (textInformationFrame.f8005a.equals("TLEN")) {
                    return g83.c(Long.parseLong(textInformationFrame.c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int m(okh okhVar, int i) {
        if (okhVar.f() >= i + 4) {
            okhVar.P(i);
            int iN = okhVar.n();
            if (iN == 1483304551 || iN == 1231971951) {
                return iN;
            }
        }
        if (okhVar.f() < 40) {
            return 0;
        }
        okhVar.P(36);
        return okhVar.n() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] o() {
        return new il8[]{new c9g()};
    }

    public static /* synthetic */ boolean p(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public static u6g q(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iE = metadata.e();
        for (int i = 0; i < iE; i++) {
            Metadata.Entry entryD = metadata.d(i);
            if (entryD instanceof MlltFrame) {
                return u6g.a(j, (MlltFrame) entryD, l(metadata));
            }
        }
        return null;
    }

    private int u(jl8 jl8Var) throws IOException {
        if (this.p == 0) {
            jl8Var.l();
            if (s(jl8Var)) {
                return -1;
            }
            this.c.P(0);
            int iN = this.c.n();
            if (!n(iN, this.f5085k) || j9g.j(iN) == -1) {
                jl8Var.p(1);
                this.f5085k = 0;
                return 0;
            }
            this.d.a(iN);
            if (this.m == -9223372036854775807L) {
                this.m = this.q.c(jl8Var.getPosition());
                if (this.f5084b != -9223372036854775807L) {
                    this.m += this.f5084b - this.q.c(0L);
                }
            }
            j9g.a aVar = this.d;
            this.p = aVar.c;
            drl drlVar = this.q;
            if (drlVar instanceof q7d) {
                q7d q7dVar = (q7d) drlVar;
                q7dVar.b(i(this.n + ((long) aVar.g)), jl8Var.getPosition() + ((long) this.d.c));
                if (this.s && q7dVar.a(this.t)) {
                    this.s = false;
                    this.j = this.i;
                }
            }
        }
        int iC = this.j.c(jl8Var, this.p, true);
        if (iC == -1) {
            return -1;
        }
        int i = this.p - iC;
        this.p = i;
        if (i > 0) {
            return 0;
        }
        this.j.e(i(this.n), 1, this.d.c, 0, null);
        this.n += (long) this.d.g;
        this.p = 0;
        return 0;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.f5085k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        drl drlVar = this.q;
        if (!(drlVar instanceof q7d) || ((q7d) drlVar).a(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.h = kl8Var;
        snp snpVarD = kl8Var.d(0, 1);
        this.i = snpVarD;
        this.j = snpVarD;
        this.h.m();
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        e();
        int iT = t(jl8Var);
        if (iT == -1 && (this.q instanceof q7d)) {
            long jI = i(this.n);
            if (this.q.i() != jI) {
                ((q7d) this.q).f(jI);
                this.h.k(this.q);
            }
        }
        return iT;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        return v(jl8Var, true);
    }

    public final drl h(jl8 jl8Var) throws IOException {
        long jL;
        long jH;
        drl drlVarR = r(jl8Var);
        u6g u6gVarQ = q(this.l, jl8Var.getPosition());
        if (this.f5086r) {
            return new drl.a();
        }
        if ((this.f5083a & 2) != 0) {
            if (u6gVarQ != null) {
                jL = u6gVarQ.i();
                jH = u6gVarQ.h();
            } else if (drlVarR != null) {
                jL = drlVarR.i();
                jH = drlVarR.h();
            } else {
                jL = l(this.l);
                jH = -1;
            }
            drlVarR = new q7d(jL, jl8Var.getPosition(), jH);
        } else if (u6gVarQ != null) {
            drlVarR = u6gVarQ;
        } else if (drlVarR == null) {
            drlVarR = null;
        }
        return (drlVarR == null || !(drlVarR.e() || (this.f5083a & 1) == 0)) ? k(jl8Var) : drlVarR;
    }

    public final long i(long j) {
        return this.m + ((j * FolmeCore.NANOS_TO_MS) / ((long) this.d.d));
    }

    public void j() {
        this.f5086r = true;
    }

    public final drl k(jl8 jl8Var) throws IOException {
        jl8Var.i(this.c.d(), 0, 4);
        this.c.P(0);
        this.d.a(this.c.n());
        return new lf4(jl8Var.getLength(), jl8Var.getPosition(), this.d);
    }

    public final drl r(jl8 jl8Var) throws IOException {
        okh okhVar = new okh(this.d.c);
        jl8Var.i(okhVar.d(), 0, this.d.c);
        j9g.a aVar = this.d;
        int i = 21;
        if ((aVar.f22563a & 1) != 0) {
            if (aVar.e != 1) {
                i = 36;
            }
        } else if (aVar.e == 1) {
            i = 13;
        }
        int i2 = i;
        int iM = m(okhVar, i2);
        if (iM != 1483304551 && iM != 1231971951) {
            if (iM != 1447187017) {
                jl8Var.l();
                return null;
            }
            xnq xnqVarA = xnq.a(jl8Var.getLength(), jl8Var.getPosition(), this.d, okhVar);
            jl8Var.p(this.d.c);
            return xnqVarA;
        }
        isr isrVarA = isr.a(jl8Var.getLength(), jl8Var.getPosition(), this.d, okhVar);
        if (isrVarA != null && !this.e.a()) {
            jl8Var.l();
            jl8Var.o(i2 + 141);
            jl8Var.i(this.c.d(), 0, 3);
            this.c.P(0);
            this.e.d(this.c.G());
        }
        jl8Var.p(this.d.c);
        return (isrVarA == null || isrVarA.e() || iM != 1231971951) ? isrVarA : k(jl8Var);
    }

    @Override // defpackage.il8
    public void release() {
    }

    public final boolean s(jl8 jl8Var) throws IOException {
        drl drlVar = this.q;
        if (drlVar != null) {
            long jH = drlVar.h();
            if (jH != -1 && jl8Var.n() > jH - 4) {
                return true;
            }
        }
        try {
            return !jl8Var.k(this.c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int t(jl8 jl8Var) throws IOException {
        if (this.f5085k == 0) {
            try {
                v(jl8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            drl drlVarH = h(jl8Var);
            this.q = drlVarH;
            this.h.k(drlVarH);
            this.j.b(new Format.b().e0(this.d.f22564b).W(4096).H(this.d.e).f0(this.d.d).M(this.e.f20561a).N(this.e.f20562b).X((this.f5083a & 4) != 0 ? null : this.l).E());
            this.o = jl8Var.getPosition();
        } else if (this.o != 0) {
            long position = jl8Var.getPosition();
            long j = this.o;
            if (position < j) {
                jl8Var.p((int) (j - position));
            }
        }
        return u(jl8Var);
    }

    public final boolean v(jl8 jl8Var, boolean z) throws IOException {
        int iN;
        int i;
        int iJ;
        int i2 = z ? 32768 : 131072;
        jl8Var.l();
        if (jl8Var.getPosition() == 0) {
            Metadata metadataA = this.f.a(jl8Var, (this.f5083a & 4) == 0 ? null : v);
            this.l = metadataA;
            if (metadataA != null) {
                this.e.c(metadataA);
            }
            iN = (int) jl8Var.n();
            if (!z) {
                jl8Var.p(iN);
            }
            i = 0;
        } else {
            iN = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (s(jl8Var)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.c.P(0);
            int iN2 = this.c.n();
            if ((i == 0 || n(iN2, i)) && (iJ = j9g.j(iN2)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iN2);
                    i = iN2;
                }
                jl8Var.o(iJ - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z) {
                    jl8Var.l();
                    jl8Var.o(iN + i5);
                } else {
                    jl8Var.p(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            jl8Var.p(iN + i4);
        } else {
            jl8Var.l();
        }
        this.f5085k = i;
        return true;
    }

    public c9g(int i) {
        this(i, -9223372036854775807L);
    }

    public c9g(int i, long j) {
        this.f5083a = i;
        this.f5084b = j;
        this.c = new okh(10);
        this.d = new j9g.a();
        this.e = new hxa();
        this.m = -9223372036854775807L;
        this.f = new a2d();
        p67 p67Var = new p67();
        this.g = p67Var;
        this.j = p67Var;
    }
}
