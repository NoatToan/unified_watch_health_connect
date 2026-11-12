package gt1;

import p004k6.e0;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    public static final void a(String str, p1<Boolean> p1Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1451152407);
        int i15 = i14 | (o0VarP.B(str) ? 4 : 2) | (o0VarP.r(aVar2) ? 2048 : 1024);
        int i16 = 0;
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (p1Var.getF182175a().booleanValue()) {
                o0VarP.C(1859735846);
                p004k6.u uVar = new p004k6.u(false, false, (e0) null, false, false, (String) null, 44, (p005kotlin.jvm.internal.j) null);
                Object objQ = o0VarP.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s(aVar, 0);
                    o0VarP.K(objQ);
                }
                p004k6.c.a((e23.a) objQ, uVar, z3.f.c(644510967, new t(aVar, str, aVar2, i16), o0VarP), o0VarP, 432, 0);
                o0VarP.g0(false);
            } else {
                o0VarP.C(1862712249);
                o0VarP.g0(false);
            }
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(str, p1Var, aVar, aVar2, i14, 7);
        }
    }
}
