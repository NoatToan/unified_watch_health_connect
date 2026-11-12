package r82;

import java.util.ArrayList;
import java.util.Iterator;
import o72.h3;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public static final void a(int i14, h4.r rVar, i53.c cVar, p3.m mVar) {
        h4.r rVar2;
        z3.e eVarC;
        cVar.getClass();
        o0 o0VarE = mVar.E(286290584);
        int i15 = i14 | 6 | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            rVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(247350334);
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                int i16 = qVar.f151315a;
                i53.c<Integer> cVar2 = qVar.f151316b;
                String str = qVar.f151317c;
                if (str == null) {
                    o0VarE.C(-1176286883);
                    o0VarE.g0(false);
                    eVarC = null;
                } else {
                    o0VarE.C(-1176286882);
                    eVarC = z3.f.c(-1383823413, new h3(str, 12), o0VarE);
                    o0VarE.g0(false);
                }
                arrayList.add(new p(cVar2, i16, null, null, eVarC, 0.0f, false, false, null, null, qVar.f151318d, 1004, null));
            }
            o0VarE.g0(false);
            k.c(rVar2, i53.a.j(arrayList), o0VarE, 6, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e51.f(rVar2, cVar, i14, 4);
        }
    }
}
