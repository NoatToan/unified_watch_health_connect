package mw0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.t;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e2.i0;
import e2.k0;
import gl1.y;
import h5.e0;
import l72.j0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.a2;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(int i14, t tVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        int i15;
        pv0.r rVar2;
        o0 o0Var;
        CustomCombinedChart customCombinedChart;
        boolean z15;
        p1 p1Var;
        kw0.f fVar2 = fVar;
        str.getClass();
        rVar.getClass();
        o0 o0VarE = mVar.E(383118090);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(fVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(rVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(false) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            kw0.f fVarA = kw0.f.a(fVar2);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            zv0.d dVar = zv0.d.f207169a;
            l22.a aVarS = a0.s(o0VarE);
            dVar.getClass();
            String strB = zv0.d.b(rVar, aVarS);
            String strQ = y.Q(o0VarE, R.string.common_no_data);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(!z14, o0VarE);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new CustomCombinedChart(context);
                o0VarE.K(objQ2);
            }
            CustomCombinedChart customCombinedChart2 = (CustomCombinedChart) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                customCombinedChart = customCombinedChart2;
                z15 = true;
                hw0.a aVar = new hw0.a(context, customCombinedChart, tVar, z14, rVar, false);
                o0VarE.K(aVar);
                objQ3 = aVar;
            } else {
                customCombinedChart = customCombinedChart2;
                z15 = true;
            }
            hw0.a aVar2 = (hw0.a) objQ3;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(a2.b(aVar3, a2.a(o0VarE), z15), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean zR = o0VarE.r(customCombinedChart);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new hn1.j(customCombinedChart, 3);
                o0VarE.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = ((i15 & 7168) == 2048) | o0VarE.r(aVar2) | o0VarE.r(fVarA) | o0VarE.B(strQ);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                d dVar2 = new d(p1Var2, rVar, aVar2, fVarA, strQ, 0);
                p1Var = p1Var2;
                o0VarE.K(dVar2);
                objQ5 = dVar2;
            } else {
                p1Var = p1Var2;
            }
            int i16 = i15;
            rVar2 = rVar;
            fVar2 = fVar;
            a.a(str, z14, lVar, (e23.l) objQ5, z3.f.c(741182359, new e(fVar2, p1Var, strB, 0, (byte) 0), o0VarE), z3.f.c(-1462255400, new li0.y(z14, fVar, rVar2, p1Var, 2), o0VarE), o0VarE, (i16 & 14) | 221184 | ((i16 >> 12) & 112), 0);
            o0Var = o0VarE;
            String strD = zv0.d.d(rVar2, a0.s(o0Var));
            d92.b.f58625c.getClass();
            c.b(fVar2.f106950g, fVar2.f106944a, strD, c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), !z14, o0Var, 0);
            o0Var.g0(true);
        } else {
            rVar2 = rVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(str, tVar, fVar2, rVar2, z14, i14, 0);
        }
    }

    public static final void b(p1<Boolean> p1Var, String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(959701119);
        int i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarE = i53.a.e(w.c(new j0(str, null, null, false, p1Var.getF182175a().booleanValue(), 14, null)));
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f82.b bVar2 = new f82.b();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new li0.w(p1Var, 8);
                o0VarE.K(objQ);
            }
            e82.a.b(cVarE, bVar2, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.k0(i14, 4, str, p1Var);
        }
    }

    public static final void c(p1<Boolean> p1Var, String str, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1977171057);
        int i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(721595727);
                bw0.a.b.f21564a.getClass();
                gl.c.f77766a.getClass();
                i53.c cVarE = i53.a.e(w.c(new j82.f(str, new j82.g.l(gl.c.a(o0VarE).f(), null), null, 4, null)));
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j82.e.h(cVarE, c2.l.A(aVar, j92.b.f97899b.f97918c, 0.0f, 2), null, o0VarE, 0, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(721966673);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.k0(i14, 3, str, p1Var);
        }
    }
}
