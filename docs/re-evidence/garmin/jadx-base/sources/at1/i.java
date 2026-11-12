package at1;

import ak0.t;
import h4.r;
import p004k6.e0;
import p004k6.u;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -442718683);
        int i15 = 2;
        int i16 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            u uVar = new u(false, false, e0.Inherit, true, true, (String) null, 32, (p005kotlin.jvm.internal.j) null);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new t(25);
                o0VarP.K(objQ);
            }
            i3.l.d((e23.a) objQ, r.S, uVar, z3.f.c(-237271637, new f(aVar, aVar2, i15), o0VarP), o0VarP, 3510, 0);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, aVar2, i14, 3);
        }
    }
}
