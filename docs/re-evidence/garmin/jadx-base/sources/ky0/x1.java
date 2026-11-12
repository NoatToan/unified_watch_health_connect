package ky0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final class x1 {
    /* JADX WARN: Code duplicated, block: B:33:0x013a  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        p3.o0 o0Var;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1073793630);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.device_text_navigation);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strQ, c2.l.A(aVar3, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            bVar2.getClass();
            c2.l.f(x2.h(aVar3, eVar.f97918c), o0VarE);
            p2 p2Var = p2.f111205a;
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23527mb);
            d.f107246a.getClass();
            z3.e eVar2 = d.f107247b;
            z3.e eVar3 = d.f107248c;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                aVar2 = aVar;
                objQ = new ku1.a(aVar2, 16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    objQ = new ku1.a(aVar2, 16);
                    o0VarE.K(objQ);
                } else {
                    aVar2 = aVar;
                }
            }
            p2Var.g(strW, null, null, eVar2, eVar3, false, false, (e23.a) objQ, o0VarE, 27648, 230);
            o0Var = o0VarE;
        } else {
            aVar2 = aVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar2, i14, 26);
        }
    }
}
