package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import defpackage.bop;
import defpackage.cop;
import defpackage.m0i;
import defpackage.mjf;
import defpackage.o91;
import defpackage.ojf;
import defpackage.r61;
import defpackage.rk1;
import defpackage.rkk;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.b f8039a = new v.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.c f8040b = new v.c();
    public final o91 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public mjf h;
    public mjf i;
    public mjf j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8041k;
    public Object l;
    public long m;

    public o(o91 o91Var, Handler handler) {
        this.c = o91Var;
        this.d = handler;
    }

    public static com.google.android.exoplayer2.source.k.a A(v vVar, Object obj, long j, long j2, v.b bVar) {
        vVar.h(obj, bVar);
        int iE = bVar.e(j);
        return iE == -1 ? new com.google.android.exoplayer2.source.k.a(obj, j2, bVar.d(j)) : new com.google.android.exoplayer2.source.k.a(obj, iE, bVar.i(iE), j2);
    }

    public final long B(v vVar, Object obj) {
        int iB;
        int i = vVar.h(obj, this.f8039a).c;
        Object obj2 = this.l;
        if (obj2 != null && (iB = vVar.b(obj2)) != -1 && vVar.f(iB, this.f8039a).c == i) {
            return this.m;
        }
        for (mjf mjfVarJ = this.h; mjfVarJ != null; mjfVarJ = mjfVarJ.j()) {
            if (mjfVarJ.f26927b.equals(obj)) {
                return mjfVarJ.f.f29217a.d;
            }
        }
        for (mjf mjfVarJ2 = this.h; mjfVarJ2 != null; mjfVarJ2 = mjfVarJ2.j()) {
            int iB2 = vVar.b(mjfVarJ2.f26927b);
            if (iB2 != -1 && vVar.f(iB2, this.f8039a).c == i) {
                return mjfVarJ2.f.f29217a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    public boolean C() {
        mjf mjfVar = this.j;
        return mjfVar == null || (!mjfVar.f.h && mjfVar.q() && this.j.f.e != -9223372036854775807L && this.f8041k < 100);
    }

    public final boolean D(v vVar) {
        mjf mjfVarJ = this.h;
        if (mjfVarJ == null) {
            return true;
        }
        int iB = vVar.b(mjfVarJ.f26927b);
        while (true) {
            iB = vVar.d(iB, this.f8039a, this.f8040b, this.f, this.g);
            while (mjfVarJ.j() != null && !mjfVarJ.f.f) {
                mjfVarJ = mjfVarJ.j();
            }
            mjf mjfVarJ2 = mjfVarJ.j();
            if (iB == -1 || mjfVarJ2 == null || vVar.b(mjfVarJ2.f26927b) != iB) {
                break;
            }
            mjfVarJ = mjfVarJ2;
        }
        boolean zY = y(mjfVarJ);
        mjfVarJ.f = q(vVar, mjfVarJ.f);
        return !zY;
    }

    public boolean E(v vVar, long j, long j2) {
        ojf ojfVarQ;
        mjf mjfVarJ = this.h;
        mjf mjfVar = null;
        while (mjfVarJ != null) {
            ojf ojfVar = mjfVarJ.f;
            if (mjfVar != null) {
                ojf ojfVarI = i(vVar, mjfVar, j);
                if (ojfVarI != null && e(ojfVar, ojfVarI)) {
                    ojfVarQ = ojfVarI;
                }
                return !y(mjfVar);
            }
            ojfVarQ = q(vVar, ojfVar);
            mjfVarJ.f = ojfVarQ.a(ojfVar.c);
            if (!d(ojfVar.e, ojfVarQ.e)) {
                long j3 = ojfVarQ.e;
                return (y(mjfVarJ) || (mjfVarJ == this.i && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mjfVarJ.z(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mjfVarJ.z(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mjfVar = mjfVarJ;
            mjfVarJ = mjfVarJ.j();
        }
        return true;
    }

    public boolean F(v vVar, int i) {
        this.f = i;
        return D(vVar);
    }

    public boolean G(v vVar, boolean z) {
        this.g = z;
        return D(vVar);
    }

    public mjf b() {
        mjf mjfVar = this.h;
        if (mjfVar == null) {
            return null;
        }
        if (mjfVar == this.i) {
            this.i = mjfVar.j();
        }
        this.h.t();
        int i = this.f8041k - 1;
        this.f8041k = i;
        if (i == 0) {
            this.j = null;
            mjf mjfVar2 = this.h;
            this.l = mjfVar2.f26927b;
            this.m = mjfVar2.f.f29217a.d;
        }
        this.h = this.h.j();
        w();
        return this.h;
    }

    public mjf c() {
        mjf mjfVar = this.i;
        rk1.g((mjfVar == null || mjfVar.j() == null) ? false : true);
        this.i = this.i.j();
        w();
        return this.i;
    }

    public final boolean d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public final boolean e(ojf ojfVar, ojf ojfVar2) {
        return ojfVar.f29218b == ojfVar2.f29218b && ojfVar.f29217a.equals(ojfVar2.f29217a);
    }

    public void f() {
        if (this.f8041k == 0) {
            return;
        }
        mjf mjfVarJ = (mjf) rk1.i(this.h);
        this.l = mjfVarJ.f26927b;
        this.m = mjfVarJ.f.f29217a.d;
        while (mjfVarJ != null) {
            mjfVarJ.t();
            mjfVarJ = mjfVarJ.j();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.f8041k = 0;
        w();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public mjf g(rkk[] rkkVarArr, bop bopVar, r61 r61Var, p pVar, ojf ojfVar, cop copVar) {
        long jL;
        mjf mjfVar = this.j;
        if (mjfVar != null) {
            jL = (mjfVar.l() + this.j.f.e) - ojfVar.f29218b;
        } else if (ojfVar.f29217a.b()) {
            jL = ojfVar.c;
            if (jL == -9223372036854775807L) {
                jL = 0;
            }
        } else {
            jL = 0;
        }
        mjf mjfVar2 = new mjf(rkkVarArr, jL, bopVar, r61Var, pVar, ojfVar, copVar);
        mjf mjfVar3 = this.j;
        if (mjfVar3 != null) {
            mjfVar3.w(mjfVar2);
        } else {
            this.h = mjfVar2;
            this.i = mjfVar2;
        }
        this.l = null;
        this.j = mjfVar2;
        this.f8041k++;
        w();
        return mjfVar2;
    }

    public final ojf h(m0i m0iVar) {
        return k(m0iVar.f25618a, m0iVar.f25619b, m0iVar.c, m0iVar.s);
    }

    public final ojf i(v vVar, mjf mjfVar, long j) {
        long j2;
        ojf ojfVar = mjfVar.f;
        long jL = (mjfVar.l() + ojfVar.e) - j;
        if (ojfVar.f) {
            long j3 = 0;
            int iD = vVar.d(vVar.b(ojfVar.f29217a.f27977a), this.f8039a, this.f8040b, this.f, this.g);
            if (iD == -1) {
                return null;
            }
            int i = vVar.g(iD, this.f8039a, true).c;
            Object obj = this.f8039a.f8447b;
            long j4 = ojfVar.f29217a.d;
            if (vVar.n(i, this.f8040b).o == iD) {
                Pair<Object, Long> pairK = vVar.k(this.f8040b, this.f8039a, i, -9223372036854775807L, Math.max(0L, jL));
                if (pairK == null) {
                    return null;
                }
                obj = pairK.first;
                long jLongValue = ((Long) pairK.second).longValue();
                mjf mjfVarJ = mjfVar.j();
                if (mjfVarJ == null || !mjfVarJ.f26927b.equals(obj)) {
                    j4 = this.e;
                    this.e = 1 + j4;
                } else {
                    j4 = mjfVarJ.f.f29217a.d;
                }
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return k(vVar, A(vVar, obj, j2, j4, this.f8039a), j3, j2);
        }
        com.google.android.exoplayer2.source.k.a aVar = ojfVar.f29217a;
        vVar.h(aVar.f27977a, this.f8039a);
        if (!aVar.b()) {
            int i2 = this.f8039a.i(aVar.e);
            if (i2 != this.f8039a.a(aVar.e)) {
                return l(vVar, aVar.f27977a, aVar.e, i2, ojfVar.e, aVar.d);
            }
            Object obj2 = aVar.f27977a;
            long j5 = ojfVar.e;
            return m(vVar, obj2, j5, j5, aVar.d);
        }
        int i3 = aVar.f27978b;
        int iA = this.f8039a.a(i3);
        if (iA == -1) {
            return null;
        }
        int iJ = this.f8039a.j(i3, aVar.c);
        if (iJ < iA) {
            return l(vVar, aVar.f27977a, i3, iJ, ojfVar.c, aVar.d);
        }
        long jLongValue2 = ojfVar.c;
        if (jLongValue2 == -9223372036854775807L) {
            v.c cVar = this.f8040b;
            v.b bVar = this.f8039a;
            Pair<Object, Long> pairK2 = vVar.k(cVar, bVar, bVar.c, -9223372036854775807L, Math.max(0L, jL));
            if (pairK2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairK2.second).longValue();
        }
        return m(vVar, aVar.f27977a, jLongValue2, ojfVar.c, aVar.d);
    }

    public mjf j() {
        return this.j;
    }

    public final ojf k(v vVar, com.google.android.exoplayer2.source.k.a aVar, long j, long j2) {
        vVar.h(aVar.f27977a, this.f8039a);
        return aVar.b() ? l(vVar, aVar.f27977a, aVar.f27978b, aVar.c, j, aVar.d) : m(vVar, aVar.f27977a, j2, j, aVar.d);
    }

    public final ojf l(v vVar, Object obj, int i, int i2, long j, long j2) {
        com.google.android.exoplayer2.source.k.a aVar = new com.google.android.exoplayer2.source.k.a(obj, i, i2, j2);
        long jB = vVar.h(aVar.f27977a, this.f8039a).b(aVar.f27978b, aVar.c);
        long jG = i2 == this.f8039a.i(i) ? this.f8039a.g() : 0L;
        return new ojf(aVar, (jB == -9223372036854775807L || jG < jB) ? jG : Math.max(0L, jB - 1), j, -9223372036854775807L, jB, false, false, false);
    }

    public final ojf m(v vVar, Object obj, long j, long j2, long j3) {
        long jMax = j;
        vVar.h(obj, this.f8039a);
        int iD = this.f8039a.d(jMax);
        com.google.android.exoplayer2.source.k.a aVar = new com.google.android.exoplayer2.source.k.a(obj, j3, iD);
        boolean zR = r(aVar);
        boolean zT = t(vVar, aVar);
        boolean zS = s(vVar, aVar, zR);
        long jF = iD != -1 ? this.f8039a.f(iD) : -9223372036854775807L;
        long j4 = (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f8039a.d : jF;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        return new ojf(aVar, jMax, j2, jF, j4, zR, zT, zS);
    }

    public ojf n(long j, m0i m0iVar) {
        mjf mjfVar = this.j;
        return mjfVar == null ? h(m0iVar) : i(m0iVar.f25618a, mjfVar, j);
    }

    public mjf o() {
        return this.h;
    }

    public mjf p() {
        return this.i;
    }

    public ojf q(v vVar, ojf ojfVar) {
        long jH;
        com.google.android.exoplayer2.source.k.a aVar = ojfVar.f29217a;
        boolean zR = r(aVar);
        boolean zT = t(vVar, aVar);
        boolean zS = s(vVar, aVar, zR);
        vVar.h(ojfVar.f29217a.f27977a, this.f8039a);
        if (aVar.b()) {
            jH = this.f8039a.b(aVar.f27978b, aVar.c);
        } else {
            jH = ojfVar.d;
            if (jH == -9223372036854775807L || jH == Long.MIN_VALUE) {
                jH = this.f8039a.h();
            }
        }
        return new ojf(aVar, ojfVar.f29218b, ojfVar.c, ojfVar.d, jH, zR, zT, zS);
    }

    public final boolean r(com.google.android.exoplayer2.source.k.a aVar) {
        return !aVar.b() && aVar.e == -1;
    }

    public final boolean s(v vVar, com.google.android.exoplayer2.source.k.a aVar, boolean z) {
        int iB = vVar.b(aVar.f27977a);
        return !vVar.n(vVar.f(iB, this.f8039a).c, this.f8040b).i && vVar.r(iB, this.f8039a, this.f8040b, this.f, this.g) && z;
    }

    public final boolean t(v vVar, com.google.android.exoplayer2.source.k.a aVar) {
        if (r(aVar)) {
            return vVar.n(vVar.h(aVar.f27977a, this.f8039a).c, this.f8040b).p == vVar.b(aVar.f27977a);
        }
        return false;
    }

    public boolean u(com.google.android.exoplayer2.source.j jVar) {
        mjf mjfVar = this.j;
        return mjfVar != null && mjfVar.f26926a == jVar;
    }

    public final /* synthetic */ void v(ImmutableList.a aVar, com.google.android.exoplayer2.source.k.a aVar2) {
        this.c.d2(aVar.k(), aVar2);
    }

    public final void w() {
        if (this.c != null) {
            final ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (mjf mjfVarJ = this.h; mjfVarJ != null; mjfVarJ = mjfVarJ.j()) {
                aVarBuilder.a(mjfVarJ.f.f29217a);
            }
            mjf mjfVar = this.i;
            final com.google.android.exoplayer2.source.k.a aVar = mjfVar == null ? null : mjfVar.f.f29217a;
            this.d.post(new Runnable() { // from class: pjf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30462a.v(aVarBuilder, aVar);
                }
            });
        }
    }

    public void x(long j) {
        mjf mjfVar = this.j;
        if (mjfVar != null) {
            mjfVar.s(j);
        }
    }

    public boolean y(mjf mjfVar) {
        boolean z = false;
        rk1.g(mjfVar != null);
        if (mjfVar.equals(this.j)) {
            return false;
        }
        this.j = mjfVar;
        while (mjfVar.j() != null) {
            mjfVar = mjfVar.j();
            if (mjfVar == this.i) {
                this.i = this.h;
                z = true;
            }
            mjfVar.t();
            this.f8041k--;
        }
        this.j.w(null);
        w();
        return z;
    }

    public com.google.android.exoplayer2.source.k.a z(v vVar, Object obj, long j) {
        return A(vVar, obj, j, B(vVar, obj), this.f8039a);
    }
}
