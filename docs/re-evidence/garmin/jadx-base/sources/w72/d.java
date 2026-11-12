package w72;

import c2.x2;
import e23.l;
import h4.r;
import i3.w9;
import java.util.Iterator;
import java.util.List;
import lc.h0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(h0 h0Var, l<? super e, Unit> lVar, m mVar, int i14) {
        boolean zC;
        lVar.getClass();
        o0 o0VarE = mVar.E(187911497);
        int i15 = (o0VarE.r(h0Var) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            List<e> list = b.f183515a;
            if (list != null && list.isEmpty()) {
                o0VarE.C(1730625497);
                o0VarE.g0(false);
                break;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    o0VarE.C(1730625497);
                    o0VarE.g0(false);
                    break;
                }
                e eVar = (e) it.next();
                eVar.getClass();
                if (h0Var != null) {
                    h0.a aVar = h0.f111771f;
                    k23.d dVarB = s0.f105811a.b(eVar.f183519a.getClass());
                    aVar.getClass();
                    zC = h0.a.c(h0Var, dVarB);
                } else {
                    zC = false;
                }
                if (zC) {
                    o0VarE.C(1729336796);
                    w9.a(x2.f(r.S, 1.0f), k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, null, z3.f.c(-179653177, new vv0.e(10, h0Var, lVar), o0VarE), o0VarE, 196614);
                    o0VarE.g0(false);
                    break;
                }
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a((Object) h0Var, (l) lVar, i14, 28);
        }
    }
}
