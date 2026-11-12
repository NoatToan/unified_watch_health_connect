package ds;

import c2.x2;
import kotlin.t1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class z {
    public static final void a(qr.t tVar, p3.m mVar, int i14) {
        tVar.getClass();
        o0 o0VarE = mVar.E(-182012467);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(1399638743, new d81.h(12, tVar, s9.c.c(tVar.f146503a2, o0VarE)), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(tVar, i14, 0);
        }
    }

    public static final h4.r b(h4.r rVar, p3.m mVar) {
        rVar.getClass();
        x1 x1Var = p3.n.f135158a;
        float f69051c = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f69051c <= 1.0f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return x2.q(rVar, j92.b.f97901d.f97905d);
        }
        if (f69051c <= 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97901d.f97905d * f69051c;
            g6.f.a aVar = g6.f.f75994b;
            return x2.q(rVar, f14);
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        float f15 = j92.b.f97901d.f97905d * 1.5f;
        g6.f.a aVar2 = g6.f.f75994b;
        return x2.q(rVar, f15);
    }
}
