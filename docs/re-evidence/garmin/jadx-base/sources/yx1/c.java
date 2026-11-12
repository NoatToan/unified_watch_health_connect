package yx1;

import cr.t;
import e23.l;
import e23.p;
import ey1.j;
import gl1.y;
import h4.r;
import i3.fe;
import lc.k0;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w3.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(final long j8, r rVar, m0 m0Var, final boolean z14, m mVar, int i14) {
        m0 m0Var2;
        m0 m0VarI;
        int i15;
        final m0 m0Var3;
        final fe feVar;
        o0 o0VarE = mVar.E(1976472187);
        int i16 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | 128 | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                m0VarI = y.I(new v0[0], o0VarE);
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                m0VarI = m0Var;
            }
            int i17 = i15;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar2 = (fe) objQ;
            int i18 = i17 & 14;
            j jVarP = zf.b.P(j8, o0VarE, i18);
            String strC = new ay1.c(j8, z14).c();
            boolean zR = o0VarE.r(m0VarI) | (i18 == 4) | ((i17 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                m0Var3 = m0VarI;
                feVar = feVar2;
                l lVar = new l() { // from class: yx1.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        k0Var.getClass();
                        long j14 = j8;
                        ay1.c cVar = new ay1.c(j14, z14);
                        m0 m0Var4 = m0Var3;
                        fe feVar3 = feVar;
                        x.t(k0Var, m0Var4, cVar, feVar3, 4);
                        x.t(k0Var, m0Var4, new ay1.b(j14), feVar3, 4);
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar);
                objQ2 = lVar;
            } else {
                m0Var3 = m0VarI;
                feVar = feVar2;
            }
            fe feVar3 = feVar;
            nc.y.b(m0Var3, strC, rVar, null, null, null, null, null, (l) objQ2, o0VarE, (i17 << 3) & 896, 1016);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(jVarP);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new b(jVarP, feVar3, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, unit, o0VarE);
            m0Var2 = m0Var3;
        } else {
            o0VarE.e();
            m0Var2 = m0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(j8, rVar, m0Var2, z14, i14);
        }
    }
}
