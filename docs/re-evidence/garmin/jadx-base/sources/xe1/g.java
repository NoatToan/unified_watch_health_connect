package xe1;

import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(af1.e eVar, o82.g gVar, m mVar, int i14) {
        o0 o0Var;
        eVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(1620982728);
        int i15 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.k(gVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA = l.A(aVar, eVar2.f97918c, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            b(eVar, gVar, o0VarE, i15 & 126);
            String strQ = y.Q(o0VarE, eVar.f3082a);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            bVar.getClass();
            mh.c(strQ, l.C(aVar, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(eVar, gVar, i14, 0);
        }
    }

    public static final void b(af1.e eVar, o82.g gVar, m mVar, int i14) {
        eVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(41594142);
        int i15 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.k(gVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (gVar == o82.g.f130856i) {
                o0VarE.C(-2114287551);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g6.f.a aVar2 = g6.f.f75994b;
                r rVarR = x2.r(aVar, j92.b.f97899b.f97920e, 2);
                m1.a aVar3 = m1.f128891a;
                q.a(u1.n.e(l4.k.b(rVarR, aVar3), af1.f.a(eVar, o0VarE), aVar3), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2114045937);
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                i7.a(n5.c.a(R.drawable.ic_legend_classification, o0VarE, 0), null, x2.q(aVar4, j92.b.f97899b.f97920e), af1.f.a(eVar, o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(eVar, gVar, i14, 1);
        }
    }

    public static final void c(List<? extends af1.e> list, o82.g gVar, m mVar, int i14) {
        int i15;
        gVar.getClass();
        o0 o0VarE = mVar.E(-1086483353);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (list != null) {
                o0VarE.C(-551844254);
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                float f15 = eVar.f97920e;
                c2.j.i iVarI = c2.j.i(f14);
                r rVarF = x2.f(r.S, 1.0f);
                o82.g gVar2 = o82.g.f130856i;
                bVar.getClass();
                r rVarA = l.A(rVarF, 0.0f, gVar == gVar2 ? f15 : eVar.f97918c, 1);
                bVar.getClass();
                t0.a(l.A(rVarA, f15, 0.0f, 2), cVar, iVarI, null, 0, 0, z3.f.c(-1473944857, new vv0.e(22, list, gVar), o0VarE), o0VarE, 1572912, 56);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-551322245);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(list, gVar, i14, 13);
        }
    }
}
