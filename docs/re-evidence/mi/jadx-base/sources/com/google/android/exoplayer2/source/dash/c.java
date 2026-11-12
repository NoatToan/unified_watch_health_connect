package com.google.android.exoplayer2.source.dash;

import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import defpackage.bk5;
import defpackage.brl;
import defpackage.cw3;
import defpackage.dh4;
import defpackage.dp0;
import defpackage.dw3;
import defpackage.ew3;
import defpackage.fk5;
import defpackage.fw3;
import defpackage.fxp;
import defpackage.g83;
import defpackage.g92;
import defpackage.gad;
import defpackage.gk5;
import defpackage.hk5;
import defpackage.l63;
import defpackage.pem;
import defpackage.sie;
import defpackage.tbj;
import defpackage.tif;
import defpackage.tmk;
import defpackage.uif;
import defpackage.wlq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sie f8116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8117b;
    public final int c;
    public final com.google.android.exoplayer2.upstream.a d;
    public final long e;
    public final int f;
    public final d.c g;
    public final b[] h;
    public com.google.android.exoplayer2.trackselection.b i;
    public bk5 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8118k;
    public IOException l;
    public boolean m;

    public static final class a implements com.google.android.exoplayer2.source.dash.a.InterfaceC0190a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8120b;
        public final dw3.a c;

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this(interfaceC0205a, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0190a
        public com.google.android.exoplayer2.source.dash.a a(sie sieVar, bk5 bk5Var, int i, int[] iArr, com.google.android.exoplayer2.trackselection.b bVar, int i2, long j, boolean z, List<Format> list, d.c cVar, fxp fxpVar) {
            com.google.android.exoplayer2.upstream.a aVarA = this.f8119a.a();
            if (fxpVar != null) {
                aVarA.f(fxpVar);
            }
            return new c(this.c, sieVar, bk5Var, i, iArr, bVar, i2, aVarA, j, this.f8120b, z, list, cVar);
        }

        public a(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, int i) {
            this(l63.j, interfaceC0205a, i);
        }

        public a(dw3.a aVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, int i) {
            this.c = aVar;
            this.f8119a = interfaceC0205a;
            this.f8120b = i;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dw3 f8121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final tmk f8122b;
        public final fk5 c;
        public final long d;
        public final long e;

        public b(long j, tmk tmkVar, dw3 dw3Var, long j2, fk5 fk5Var) {
            this.d = j;
            this.f8122b = tmkVar;
            this.e = j2;
            this.f8121a = dw3Var;
            this.c = fk5Var;
        }

        @CheckResult
        public b b(long j, tmk tmkVar) throws BehindLiveWindowException {
            long jG;
            fk5 fk5VarB = this.f8122b.b();
            fk5 fk5VarB2 = tmkVar.b();
            if (fk5VarB == null) {
                return new b(j, tmkVar, this.f8121a, this.e, fk5VarB);
            }
            if (!fk5VarB.k()) {
                return new b(j, tmkVar, this.f8121a, this.e, fk5VarB2);
            }
            long jH = fk5VarB.h(j);
            if (jH == 0) {
                return new b(j, tmkVar, this.f8121a, this.e, fk5VarB2);
            }
            long jI = fk5VarB.i();
            long jC = fk5VarB.c(jI);
            long j2 = jH + jI;
            long j3 = j2 - 1;
            long jC2 = fk5VarB.c(j3) + fk5VarB.d(j3, j);
            long jI2 = fk5VarB2.i();
            long jC3 = fk5VarB2.c(jI2);
            long j4 = this.e;
            if (jC2 == jC3) {
                jG = j4 + (j2 - jI2);
            } else {
                if (jC2 < jC3) {
                    throw new BehindLiveWindowException();
                }
                jG = jC3 < jC ? j4 - (fk5VarB2.g(jC, j) - jI) : j4 + (fk5VarB.g(jC3, j) - jI2);
            }
            return new b(j, tmkVar, this.f8121a, jG, fk5VarB2);
        }

        @CheckResult
        public b c(fk5 fk5Var) {
            return new b(this.d, this.f8122b, this.f8121a, this.e, fk5Var);
        }

        public long d(long j) {
            return this.c.e(this.d, j) + this.e;
        }

        public long e() {
            return this.c.i() + this.e;
        }

        public long f(long j) {
            return (d(j) + this.c.l(this.d, j)) - 1;
        }

        public long g() {
            return this.c.h(this.d);
        }

        public long h(long j) {
            return j(j) + this.c.d(j - this.e, this.d);
        }

        public long i(long j) {
            return this.c.g(j, this.d) + this.e;
        }

        public long j(long j) {
            return this.c.c(j - this.e);
        }

        public tbj k(long j) {
            return this.c.j(j - this.e);
        }

        public boolean l(long j, long j2) {
            return this.c.k() || j2 == -9223372036854775807L || h(j) <= j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    public static final class C0191c extends g92 {
        public final b e;
        public final long f;

        public C0191c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.e = bVar;
            this.f = j3;
        }

        @Override // defpackage.uif
        public long a() {
            c();
            return this.e.h(d());
        }

        @Override // defpackage.uif
        public long b() {
            c();
            return this.e.j(d());
        }
    }

    public c(dw3.a aVar, sie sieVar, bk5 bk5Var, int i, int[] iArr, com.google.android.exoplayer2.trackselection.b bVar, int i2, com.google.android.exoplayer2.upstream.a aVar2, long j, int i3, boolean z, List<Format> list, d.c cVar) {
        this.f8116a = sieVar;
        this.j = bk5Var;
        this.f8117b = iArr;
        this.i = bVar;
        this.c = i2;
        this.d = aVar2;
        this.f8118k = i;
        this.e = j;
        this.f = i3;
        this.g = cVar;
        long jG = bk5Var.g(i);
        ArrayList<tmk> arrayListM = m();
        this.h = new b[bVar.length()];
        int i4 = 0;
        while (i4 < this.h.length) {
            tmk tmkVar = arrayListM.get(bVar.c(i4));
            int i5 = i4;
            this.h[i5] = new b(jG, tmkVar, l63.j.a(i2, tmkVar.f34858b, z, list, cVar), 0L, tmkVar.b());
            i4 = i5 + 1;
            arrayListM = arrayListM;
        }
    }

    @Override // defpackage.hw3
    public void a() throws IOException {
        IOException iOException = this.l;
        if (iOException != null) {
            throw iOException;
        }
        this.f8116a.a();
    }

    @Override // defpackage.hw3
    public long b(long j, brl brlVar) {
        for (b bVar : this.h) {
            if (bVar.c != null) {
                long jI = bVar.i(j);
                long j2 = bVar.j(jI);
                long jG = bVar.g();
                return brlVar.a(j, j2, (j2 >= j || (jG != -1 && jI >= (bVar.e() + jG) - 1)) ? j2 : bVar.j(jI + 1));
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void c(com.google.android.exoplayer2.trackselection.b bVar) {
        this.i = bVar;
    }

    @Override // defpackage.hw3
    public boolean d(long j, cw3 cw3Var, List<? extends tif> list) {
        if (this.l != null) {
            return false;
        }
        return this.i.b(j, cw3Var, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void e(bk5 bk5Var, int i) {
        try {
            this.j = bk5Var;
            this.f8118k = i;
            long jG = bk5Var.g(i);
            ArrayList<tmk> arrayListM = m();
            for (int i2 = 0; i2 < this.h.length; i2++) {
                tmk tmkVar = arrayListM.get(this.i.c(i2));
                b[] bVarArr = this.h;
                bVarArr[i2] = bVarArr[i2].b(jG, tmkVar);
            }
        } catch (BehindLiveWindowException e) {
            this.l = e;
        }
    }

    @Override // defpackage.hw3
    public void f(long j, long j2, List<? extends tif> list, ew3 ew3Var) {
        int i;
        int i2;
        uif[] uifVarArr;
        boolean z;
        long j3;
        long j4;
        if (this.l != null) {
            return;
        }
        long j5 = j2 - j;
        long jC = g83.c(this.j.f4303a) + g83.c(this.j.d(this.f8118k).f36028b) + j2;
        d.c cVar = this.g;
        if (cVar == null || !cVar.h(jC)) {
            long jC2 = g83.c(wlq.W(this.e));
            long jL = l(jC2);
            boolean z2 = true;
            tif tifVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.i.length();
            uif[] uifVarArr2 = new uif[length];
            int i3 = 0;
            while (i3 < length) {
                b bVar = this.h[i3];
                if (bVar.c == null) {
                    uifVarArr2[i3] = uif.f35791a;
                    i = i3;
                    i2 = length;
                    uifVarArr = uifVarArr2;
                    z = z2;
                    j3 = j5;
                    j4 = jC2;
                } else {
                    long jD = bVar.d(jC2);
                    long jF = bVar.f(jC2);
                    i = i3;
                    i2 = length;
                    uifVarArr = uifVarArr2;
                    z = z2;
                    j3 = j5;
                    j4 = jC2;
                    long jN = n(bVar, tifVar, j2, jD, jF);
                    if (jN < jD) {
                        uifVarArr[i] = uif.f35791a;
                    } else {
                        uifVarArr[i] = new C0191c(bVar, jN, jF, jL);
                    }
                }
                i3 = i + 1;
                jC2 = j4;
                z2 = z;
                length = i2;
                uifVarArr2 = uifVarArr;
                j5 = j3;
            }
            boolean z3 = z2;
            long j6 = j5;
            long j7 = jC2;
            this.i.o(j, j6, k(j7, j), list, uifVarArr2);
            b bVar2 = this.h[this.i.a()];
            dw3 dw3Var = bVar2.f8121a;
            if (dw3Var != null) {
                tmk tmkVar = bVar2.f8122b;
                tbj tbjVarN = dw3Var.e() == null ? tmkVar.n() : null;
                tbj tbjVarM = bVar2.c == null ? tmkVar.m() : null;
                if (tbjVarN != null || tbjVarM != null) {
                    ew3Var.f17124a = o(bVar2, this.d, this.i.i(), this.i.r(), this.i.n(), tbjVarN, tbjVarM);
                    return;
                }
            }
            long j8 = bVar2.d;
            boolean z4 = j8 != -9223372036854775807L ? z3 : false;
            if (bVar2.g() == 0) {
                ew3Var.f17125b = z4;
                return;
            }
            long jD2 = bVar2.d(j7);
            long jF2 = bVar2.f(j7);
            boolean z5 = z4;
            long jN2 = n(bVar2, tifVar, j2, jD2, jF2);
            if (jN2 < jD2) {
                this.l = new BehindLiveWindowException();
                return;
            }
            if (jN2 > jF2 || (this.m && jN2 >= jF2)) {
                ew3Var.f17125b = z5;
                return;
            }
            if (z5 && bVar2.j(jN2) >= j8) {
                ew3Var.f17125b = true;
                return;
            }
            int iMin = (int) Math.min(this.f, (jF2 - jN2) + 1);
            if (j8 != -9223372036854775807L) {
                while (iMin > 1 && bVar2.j((((long) iMin) + jN2) - 1) >= j8) {
                    iMin--;
                }
            }
            ew3Var.f17124a = p(bVar2, this.d, this.c, this.i.i(), this.i.r(), this.i.n(), jN2, iMin, list.isEmpty() ? j2 : -9223372036854775807L, jL);
        }
    }

    @Override // defpackage.hw3
    public int g(long j, List<? extends tif> list) {
        return (this.l != null || this.i.length() < 2) ? list.size() : this.i.g(j, list);
    }

    @Override // defpackage.hw3
    public void h(cw3 cw3Var) {
        fw3 fw3VarC;
        if (cw3Var instanceof gad) {
            int iQ = this.i.q(((gad) cw3Var).d);
            b bVar = this.h[iQ];
            if (bVar.c == null && (fw3VarC = bVar.f8121a.c()) != null) {
                this.h[iQ] = bVar.c(new hk5(fw3VarC, bVar.f8122b.d));
            }
        }
        d.c cVar = this.g;
        if (cVar != null) {
            cVar.i(cw3Var);
        }
    }

    @Override // defpackage.hw3
    public boolean j(cw3 cw3Var, boolean z, Exception exc, long j) {
        if (!z) {
            return false;
        }
        d.c cVar = this.g;
        if (cVar != null && cVar.j(cw3Var)) {
            return true;
        }
        if (!this.j.d && (cw3Var instanceof tif) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).responseCode == 404) {
            b bVar = this.h[this.i.q(cw3Var.d)];
            long jG = bVar.g();
            if (jG != -1 && jG != 0) {
                if (((tif) cw3Var).f() > (bVar.e() + jG) - 1) {
                    this.m = true;
                    return true;
                }
            }
        }
        if (j == -9223372036854775807L) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.b bVar2 = this.i;
        return bVar2.k(bVar2.q(cw3Var.d), j);
    }

    public final long k(long j, long j2) {
        if (!this.j.d) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(l(j), this.h[0].h(this.h[0].f(j))) - j2);
    }

    public final long l(long j) {
        bk5 bk5Var = this.j;
        long j2 = bk5Var.f4303a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - g83.c(j2 + bk5Var.d(this.f8118k).f36028b);
    }

    public final ArrayList<tmk> m() {
        List<dp0> list = this.j.d(this.f8118k).c;
        ArrayList<tmk> arrayList = new ArrayList<>();
        for (int i : this.f8117b) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final long n(b bVar, tif tifVar, long j, long j2, long j3) {
        return tifVar != null ? tifVar.f() : wlq.s(bVar.i(j), j2, j3);
    }

    public cw3 o(b bVar, com.google.android.exoplayer2.upstream.a aVar, Format format, int i, Object obj, tbj tbjVar, tbj tbjVar2) {
        tmk tmkVar = bVar.f8122b;
        if (tbjVar == null || (tbjVar2 = tbjVar.a(tbjVar2, tmkVar.c)) != null) {
            tbjVar = tbjVar2;
        }
        return new gad(aVar, gk5.a(tmkVar, tbjVar, 0), format, i, obj, bVar.f8121a);
    }

    public cw3 p(b bVar, com.google.android.exoplayer2.upstream.a aVar, int i, Format format, int i2, Object obj, long j, int i3, long j2, long j3) {
        tmk tmkVar = bVar.f8122b;
        long j4 = bVar.j(j);
        tbj tbjVarK = bVar.k(j);
        String str = tmkVar.c;
        if (bVar.f8121a == null) {
            return new pem(aVar, gk5.a(tmkVar, tbjVarK, bVar.l(j, j3) ? 0 : 8), format, i2, obj, j4, bVar.h(j), j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            tbj tbjVarA = tbjVarK.a(bVar.k(((long) i4) + j), str);
            if (tbjVarA == null) {
                break;
            }
            i5++;
            i4++;
            tbjVarK = tbjVarA;
        }
        long j5 = (((long) i5) + j) - 1;
        long jH = bVar.h(j5);
        long j6 = bVar.d;
        return new dh4(aVar, gk5.a(tmkVar, tbjVarK, bVar.l(j5, j3) ? 0 : 8), format, i2, obj, j4, jH, j2, (j6 == -9223372036854775807L || j6 > jH) ? -9223372036854775807L : j6, j, i5, -tmkVar.d, bVar.f8121a);
    }

    @Override // defpackage.hw3
    public void release() {
        for (b bVar : this.h) {
            dw3 dw3Var = bVar.f8121a;
            if (dw3Var != null) {
                dw3Var.release();
            }
        }
    }
}
