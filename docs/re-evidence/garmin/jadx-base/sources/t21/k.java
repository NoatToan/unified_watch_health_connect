package t21;

import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static final void a(u21.e0 e0Var, v21.e eVar, e23.l<? super String, Unit> lVar, e23.l<? super Integer, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        e0Var.getClass();
        eVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-64909698);
        int i15 = i14 | (o0VarE.B(e0Var) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                Object obj = e0Var.f167938a;
                if (obj == null) {
                    obj = "";
                }
                objQ = p3.p0.n(new x5.l0(String.valueOf(obj), 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            z02.d.a(false, z3.f.c(971008409, new rx1.u(aVar, lVar2, p1Var), o0VarE), null, null, null, z3.f.c(1971413525, new sk0.k1(lVar, eVar, e0Var, p1Var), o0VarE), o0VarE, 196662, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g((Object) e0Var, (Object) eVar, (e23.l) lVar, (o13.h) lVar2, (e23.a) aVar, i14, 6);
        }
    }
}
