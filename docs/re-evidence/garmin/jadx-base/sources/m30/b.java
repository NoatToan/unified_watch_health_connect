package m30;

import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import f5.g0;
import h5.e0;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    public static final void a(n30.b bVar, e23.l<? super n30.a, Unit> lVar, e23.l<? super g6.m, Unit> lVar2, p3.m mVar, int i14) {
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1984922593);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                objQ = new k11.n(lVar2, 20);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k11.n(lVar2, 20);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarF = g0.f(aVar, (e23.l) objQ);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarB = a2.b(c2.l.y(rVarF, j92.b.f97899b.f97920e), a2.a(o0VarE), false);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f0.a aVar4 = f0.a.f111000a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_save);
            if (bVar.f123390a && bVar.f123391b) {
                z14 = true;
            }
            z14 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new gt1.k(lVar, 18);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new gt1.k(lVar, 18);
                    o0VarE.K(objQ2);
                }
            }
            aVar4.f(strQ, null, z14, (e23.a) objQ2, o0VarE, 0, 2);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(bVar, lVar, lVar2, i14);
        }
    }
}
