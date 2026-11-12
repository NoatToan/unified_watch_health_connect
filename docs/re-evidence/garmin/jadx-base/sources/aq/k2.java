package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class k2 {
    public static final void a(double d14, boolean z14, e23.l<? super Double, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, 52198382);
        int i15 = i14 | (o0VarP.m(d14) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new p3.y1(d14);
                o0VarP.K(objQ);
            }
            z02.b.a(false, null, null, null, false, z3.f.c(-1062808924, new ad0.g(lVar, aVar, z14, (p3.l1) objQ, 1), o0VarP), o0VarP, 196608, 31);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i2(d14, z14, lVar, aVar, i14);
        }
    }
}
