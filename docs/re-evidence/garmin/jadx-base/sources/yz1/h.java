package yz1;

import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.fa;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    public static final void a(int i14, int i15, e23.a aVar, h4.r rVar, p3.m mVar) {
        e23.a aVar2;
        int i16;
        rVar.getClass();
        o0 o0VarE = mVar.E(-179021594);
        int i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            e23.a aVar3 = i18 != 0 ? null : aVar2;
            x1 x1Var = p3.n.f135158a;
            int i19 = i16;
            boolean z14 = aVar3 != null;
            boolean z15 = (i19 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new yy1.d(aVar3, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yy1.d(aVar3, 1);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVar, z14, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            g6.f.a aVar6 = g6.f.f75994b;
            g02.i.a(null, fa.a(t62.b.f162798a), hb.a.d(d92.b.f58623a, o0VarE), d92.b.a(o0VarE).e().g(), 48, 12, null, o0VarE, 221184, 193);
            h4.r.a aVar7 = h4.r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar7, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.loading_error);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            d6.h.f57752b.getClass();
            int i24 = d6.h.f57755e;
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            bVar2.getClass();
            float f14 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar7, 0.0f, f14, 0.0f, eVar.f97918c, 5);
            String strQ2 = gl1.y.Q(o0VarE, R.string.problem_loading_refresh);
            fVar.getClass();
            mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            aVar2 = aVar3;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, aVar2, i14, i15);
        }
    }
}
