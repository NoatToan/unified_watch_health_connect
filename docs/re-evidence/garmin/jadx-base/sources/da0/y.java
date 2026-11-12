package da0;

import c2.x2;
import i3.i7;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class y {
    public static final void a(h4.r rVar, float f14, p3.m mVar, int i14, int i15) {
        int i16;
        o0 o0VarE = mVar.E(243564682);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i16 | 16;
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i17 != 0) {
                    rVar = h4.r.S;
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97901d.f97904c;
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            h4.r rVarQ = x2.q(rVar, f14);
            d92.b.f58623a.getClass();
            i7.b(dVarA, null, rVarQ, d92.b.a(o0VarE).f().a(), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        float f15 = f14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(rVar2, f15, i14, i15, 0);
        }
    }
}
