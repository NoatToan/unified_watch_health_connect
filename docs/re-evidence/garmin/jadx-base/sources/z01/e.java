package z01;

import c2.x2;
import g02.f1;
import g02.t0;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import o4.d0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(int i14, r rVar, i53.c cVar, m mVar) {
        d0 d0VarA;
        cVar.getClass();
        o0 o0VarE = mVar.E(-985485197);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVar) {
                t0 t0Var = (t0) obj;
                if (!Double.isNaN(t0Var.f74552a) && t0Var.f74552a > 0.0d) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            double d14 = 0.0d;
            while (it.hasNext()) {
                d14 += ((t0) it.next()).f74552a;
            }
            r rVarF = x2.f(rVar, 1.0f);
            if (d14 > 0.0d) {
                o0VarE.C(1807322602);
                o0VarE.g0(false);
                d0VarA = null;
            } else {
                o0VarE.C(2136511545);
                d92.b.f58623a.getClass();
                long jG = d92.b.a(o0VarE).e().g();
                o0VarE.g0(false);
                d0VarA = d0.a(jG);
            }
            f1.i(rVarF, d0VarA, i53.a.j(arrayList), d14, 0.0f, 0.0f, 0.0f, o0VarE, 0, 112);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e51.f(rVar, cVar, i14, 5);
        }
    }
}
