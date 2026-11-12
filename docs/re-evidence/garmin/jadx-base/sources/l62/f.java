package l62;

import e23.q;
import hl1.i;
import kd0.h6;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b2;
import p3.m;
import p3.n;
import p3.o0;
import p3.o1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(g gVar, boolean z14, q<? super Long, ? super Long, ? super Long, Unit> qVar, e23.a<Unit> aVar, m mVar, int i14) {
        qVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1059302926);
        int i15 = i14 | (o0VarE.r(gVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b2(gVar != null ? gVar.f110553a.getMillis() : -1L);
                o0VarE.K(objQ);
            }
            o1 o1Var = (o1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = Integer.valueOf(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).N());
                o0VarE.K(objQ2);
            }
            z02.d.a(z14, z3.f.c(-12483657, new i(aVar, 27), o0VarE), null, null, null, z3.f.c(-16152389, new h6(gVar, ((Number) objQ2).intValue(), qVar, o1Var), o0VarE), o0VarE, ((i15 >> 3) & 14) | 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(gVar, z14, qVar, aVar, i14, 28);
        }
    }
}
