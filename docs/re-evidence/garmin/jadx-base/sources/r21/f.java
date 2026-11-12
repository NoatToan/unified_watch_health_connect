package r21;

import f5.i2;
import i3.rb;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    public static final void a(h4.r rVar, float f14, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-612342726);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.i(f14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d70.f(f14, eVar, 5);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d70.f(f14, eVar, 5);
                    o0VarE.K(objQ);
                }
            }
            i2.b(rVar, (e23.p) objQ, o0VarE, i15 & 14, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rb(rVar, f14, eVar, i14, 2);
        }
    }
}
