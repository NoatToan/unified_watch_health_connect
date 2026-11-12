package cr;

import a03.h0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:48:0x01fa  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        int i16;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1904890759);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar3, 0.0f, f14, 1);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            t4.d dVarA = n5.c.a(R.drawable.fivehz, o0VarE, 0);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).k().d();
            h4.r rVarC2 = c2.l.C(aVar3, f14, 0.0f, f14, 0.0f, 10);
            d92.b.f58625c.getClass();
            i7.a(dVarA, null, x2.q(rVarC2, j92.b.f97901d.f97905d), jD, o0VarE, 48, 0);
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_descends_footer);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            i16 = 2;
            mh.c(strQ, c2.l.C(aVar3, 0.0f, 0.0f, f14, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 48, 0, 131068);
            s5.c cVar2 = new s5.c(gl1.y.Q(o0VarE, R.string.common_learn_more), null, 2, null);
            fVar2.getClass();
            x0 x0VarA = x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            h4.r rVarA2 = c2.l.A(aVar3, 0.0f, 8, 1);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                aVar2 = aVar;
                objQ = new h0(aVar2, 16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    objQ = new h0(aVar2, 16);
                    o0VarE.K(objQ);
                } else {
                    aVar2 = aVar;
                }
            }
            p006l2.c0.a(cVar2, rVarA2, x0VarA, false, 0, 0, null, (e23.l) objQ, o0VarE, 48, 120);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            i16 = 2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar2, i14, i16);
        }
    }
}
