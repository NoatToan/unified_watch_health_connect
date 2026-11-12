package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h2q implements il8 {
    public static final nl8 t = new nl8() { // from class: g2q
        @Override // defpackage.nl8
        public final il8[] c() {
            return h2q.w();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19625b;
    public final List<rfp> c;
    public final okh d;
    public final SparseIntArray e;
    public final i2q.c f;
    public final SparseArray<i2q> g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final f2q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e2q f19626k;
    public kl8 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public i2q q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19627r;
    public int s;

    public class a implements cql {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nkh f19628a = new nkh(new byte[4]);

        public a() {
        }

        @Override // defpackage.cql
        public void a(okh okhVar) {
            if (okhVar.D() == 0 && (okhVar.D() & 128) != 0) {
                okhVar.Q(6);
                int iA = okhVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    okhVar.i(this.f19628a, 4);
                    int iH = this.f19628a.h(16);
                    this.f19628a.r(3);
                    if (iH == 0) {
                        this.f19628a.r(13);
                    } else {
                        int iH2 = this.f19628a.h(13);
                        if (h2q.this.g.get(iH2) == null) {
                            h2q.this.g.put(iH2, new dql(h2q.this.new b(iH2)));
                            h2q.k(h2q.this);
                        }
                    }
                }
                if (h2q.this.f19624a != 2) {
                    h2q.this.g.remove(0);
                }
            }
        }

        @Override // defpackage.cql
        public void b(rfp rfpVar, kl8 kl8Var, i2q.d dVar) {
        }
    }

    public class b implements cql {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nkh f19630a = new nkh(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<i2q> f19631b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // defpackage.cql
        public void a(okh okhVar) {
            rfp rfpVar;
            if (okhVar.D() != 2) {
                return;
            }
            if (h2q.this.f19624a == 1 || h2q.this.f19624a == 2 || h2q.this.m == 1) {
                rfpVar = (rfp) h2q.this.c.get(0);
            } else {
                rfpVar = new rfp(((rfp) h2q.this.c.get(0)).c());
                h2q.this.c.add(rfpVar);
            }
            if ((okhVar.D() & 128) == 0) {
                return;
            }
            okhVar.Q(1);
            int iJ = okhVar.J();
            int i = 3;
            okhVar.Q(3);
            okhVar.i(this.f19630a, 2);
            this.f19630a.r(3);
            int i2 = 13;
            h2q.this.s = this.f19630a.h(13);
            okhVar.i(this.f19630a, 2);
            int i3 = 4;
            this.f19630a.r(4);
            okhVar.Q(this.f19630a.h(12));
            if (h2q.this.f19624a == 2 && h2q.this.q == null) {
                i2q.b bVar = new i2q.b(21, null, null, wlq.f);
                h2q h2qVar = h2q.this;
                h2qVar.q = h2qVar.f.a(21, bVar);
                h2q.this.q.b(rfpVar, h2q.this.l, new i2q.d(iJ, 21, 8192));
            }
            this.f19631b.clear();
            this.c.clear();
            int iA = okhVar.a();
            while (iA > 0) {
                okhVar.i(this.f19630a, 5);
                int iH = this.f19630a.h(8);
                this.f19630a.r(i);
                int iH2 = this.f19630a.h(i2);
                this.f19630a.r(i3);
                int iH3 = this.f19630a.h(12);
                i2q.b bVarC = c(okhVar, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f20715a;
                }
                iA -= iH3 + 5;
                int i4 = h2q.this.f19624a == 2 ? iH : iH2;
                if (!h2q.this.h.get(i4)) {
                    i2q i2qVarA = (h2q.this.f19624a == 2 && iH == 21) ? h2q.this.q : h2q.this.f.a(iH, bVarC);
                    if (h2q.this.f19624a != 2 || iH2 < this.c.get(i4, 8192)) {
                        this.c.put(i4, iH2);
                        this.f19631b.put(i4, i2qVarA);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.c.keyAt(i5);
                int iValueAt = this.c.valueAt(i5);
                h2q.this.h.put(iKeyAt, true);
                h2q.this.i.put(iValueAt, true);
                i2q i2qVarValueAt = this.f19631b.valueAt(i5);
                if (i2qVarValueAt != null) {
                    if (i2qVarValueAt != h2q.this.q) {
                        i2qVarValueAt.b(rfpVar, h2q.this.l, new i2q.d(iJ, iKeyAt, 8192));
                    }
                    h2q.this.g.put(iValueAt, i2qVarValueAt);
                }
            }
            if (h2q.this.f19624a == 2) {
                if (h2q.this.n) {
                    return;
                }
                h2q.this.l.m();
                h2q.this.m = 0;
                h2q.this.n = true;
                return;
            }
            h2q.this.g.remove(this.d);
            h2q h2qVar2 = h2q.this;
            h2qVar2.m = h2qVar2.f19624a == 1 ? 0 : h2q.this.m - 1;
            if (h2q.this.m == 0) {
                h2q.this.l.m();
                h2q.this.n = true;
            }
        }

        @Override // defpackage.cql
        public void b(rfp rfpVar, kl8 kl8Var, i2q.d dVar) {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        public final i2q.b c(okh okhVar, int i) {
            int iE = okhVar.e();
            int i2 = i + iE;
            int i3 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (okhVar.e() < i2) {
                int iD = okhVar.D();
                int iE2 = okhVar.e() + okhVar.D();
                if (iE2 > i2) {
                    break;
                }
                if (iD == 5) {
                    long jF = okhVar.F();
                    if (jF == 1094921523) {
                        i3 = 129;
                    } else if (jF == 1161904947) {
                        i3 = 135;
                    } else if (jF == 1094921524) {
                        i3 = 172;
                    } else if (jF == 1212503619) {
                        i3 = 36;
                    }
                } else if (iD == 106) {
                    i3 = 129;
                } else if (iD == 122) {
                    i3 = 135;
                } else if (iD == 127) {
                    if (okhVar.D() == 21) {
                        i3 = 172;
                    }
                } else if (iD == 123) {
                    i3 = 138;
                } else if (iD == 10) {
                    strTrim = okhVar.A(3).trim();
                } else if (iD == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (okhVar.e() < iE2) {
                        String strTrim2 = okhVar.A(3).trim();
                        int iD2 = okhVar.D();
                        byte[] bArr = new byte[4];
                        okhVar.j(bArr, 0, 4);
                        arrayList2.add(new i2q.a(strTrim2, iD2, bArr));
                    }
                    arrayList = arrayList2;
                    i3 = 89;
                } else if (iD == 111) {
                    i3 = 257;
                }
                okhVar.Q(iE2 - okhVar.e());
            }
            okhVar.P(i2);
            return new i2q.b(i3, strTrim, arrayList, Arrays.copyOfRange(okhVar.d(), iE, i2));
        }
    }

    public h2q() {
        this(0);
    }

    public static /* synthetic */ int k(h2q h2qVar) {
        int i = h2qVar.m;
        h2qVar.m = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] w() {
        return new il8[]{new h2q()};
    }

    private void x(long j) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (this.j.b() == -9223372036854775807L) {
            this.l.k(new arl.b(this.j.b()));
            return;
        }
        e2q e2qVar = new e2q(this.j.c(), this.j.b(), j, this.s, this.f19625b);
        this.f19626k = e2qVar;
        this.l.k(e2qVar.b());
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        e2q e2qVar;
        rk1.g(this.f19624a != 2);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            rfp rfpVar = this.c.get(i);
            if (rfpVar.e() == -9223372036854775807L || (rfpVar.e() != 0 && rfpVar.c() != j2)) {
                rfpVar.g(j2);
            }
        }
        if (j2 != 0 && (e2qVar = this.f19626k) != null) {
            e2qVar.h(j2);
        }
        this.d.L(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.g.valueAt(i2).c();
        }
        this.f19627r = 0;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.l = kl8Var;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        long length = jl8Var.getLength();
        if (this.n) {
            if (length != -1 && this.f19624a != 2 && !this.j.d()) {
                return this.j.e(jl8Var, r4iVar, this.s);
            }
            x(length);
            if (this.p) {
                this.p = false;
                a(0L, 0L);
                if (jl8Var.getPosition() != 0) {
                    r4iVar.f32179a = 0L;
                    return 1;
                }
            }
            e2q e2qVar = this.f19626k;
            if (e2qVar != null && e2qVar.d()) {
                return this.f19626k.c(jl8Var, r4iVar);
            }
        }
        if (!u(jl8Var)) {
            return -1;
        }
        int iV = v();
        int iF = this.d.f();
        if (iV > iF) {
            return 0;
        }
        int iN = this.d.n();
        if ((8388608 & iN) != 0) {
            this.d.P(iV);
            return 0;
        }
        int i = (4194304 & iN) != 0 ? 1 : 0;
        int i2 = (2096896 & iN) >> 8;
        boolean z = (iN & 32) != 0;
        i2q i2qVar = (iN & 16) != 0 ? this.g.get(i2) : null;
        if (i2qVar == null) {
            this.d.P(iV);
            return 0;
        }
        if (this.f19624a != 2) {
            int i3 = iN & 15;
            int i4 = this.e.get(i2, i3 - 1);
            this.e.put(i2, i3);
            if (i4 == i3) {
                this.d.P(iV);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                i2qVar.c();
            }
        }
        if (z) {
            int iD = this.d.D();
            i |= (this.d.D() & 64) != 0 ? 2 : 0;
            this.d.Q(iD - 1);
        }
        boolean z2 = this.n;
        if (z(i2)) {
            this.d.O(iV);
            i2qVar.a(this.d, i);
            this.d.O(iF);
        }
        if (this.f19624a != 2 && !z2 && this.n && length != -1) {
            this.p = true;
        }
        this.d.P(iV);
        return 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        byte[] bArrD = this.d.d();
        jl8Var.i(bArrD, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    jl8Var.p(i);
                    return true;
                }
                if (bArrD[(i2 * SportReportBaseParser.ReportType.avgDescentRate) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.il8
    public void release() {
    }

    public final boolean u(jl8 jl8Var) throws IOException {
        byte[] bArrD = this.d.d();
        if (9400 - this.d.e() < 188) {
            int iA = this.d.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.d.e(), bArrD, 0, iA);
            }
            this.d.N(bArrD, iA);
        }
        while (this.d.a() < 188) {
            int iF = this.d.f();
            int i = jl8Var.read(bArrD, iF, 9400 - iF);
            if (i == -1) {
                return false;
            }
            this.d.O(iF + i);
        }
        return true;
    }

    public final int v() throws ParserException {
        int iE = this.d.e();
        int iF = this.d.f();
        int iA = j2q.a(this.d.d(), iE, iF);
        this.d.P(iA);
        int i = iA + SportReportBaseParser.ReportType.avgDescentRate;
        if (i > iF) {
            int i2 = this.f19627r + (iA - iE);
            this.f19627r = i2;
            if (this.f19624a == 2 && i2 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f19627r = 0;
        }
        return i;
    }

    public final void y() {
        this.h.clear();
        this.g.clear();
        SparseArray<i2q> sparseArrayB = this.f.b();
        int size = sparseArrayB.size();
        for (int i = 0; i < size; i++) {
            this.g.put(sparseArrayB.keyAt(i), sparseArrayB.valueAt(i));
        }
        this.g.put(0, new dql(new a()));
        this.q = null;
    }

    public final boolean z(int i) {
        return this.f19624a == 2 || this.n || !this.i.get(i, false);
    }

    public h2q(int i) {
        this(1, i, 112800);
    }

    public h2q(int i, rfp rfpVar, i2q.c cVar) {
        this(i, rfpVar, cVar, 112800);
    }

    public h2q(int i, int i2, int i3) {
        this(i, new rfp(0L), new tx5(i2), i3);
    }

    public h2q(int i, rfp rfpVar, i2q.c cVar, int i2) {
        this.f = (i2q.c) rk1.e(cVar);
        this.f19625b = i2;
        this.f19624a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(rfpVar);
        } else {
            this.c = Collections.singletonList(rfpVar);
        }
        this.d = new okh(new byte[9400], 0);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray<>();
        this.e = new SparseIntArray();
        this.j = new f2q(i2);
        this.s = -1;
        y();
    }
}
