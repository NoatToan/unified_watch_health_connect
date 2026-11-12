package sr1;

import i53.c;
import java.util.ArrayList;
import m92.h0;
import p13.c0;
import p13.j0;
import p13.y;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final c a(c cVar, c cVar2, m mVar) {
        Iterable<h0.e.a> iterableG;
        Iterable<h0.e.a> iterableG2;
        x1 x1Var = n.f135158a;
        long jI = fb1.c.i(gl.c.f77766a, mVar);
        long jH = gl.c.a(mVar).h();
        if (cVar == null || (iterableG = c02.a.g(cVar)) == null) {
            iterableG = j0.f134944a;
        }
        if (cVar2 == null || (iterableG2 = c02.a.g(cVar2)) == null) {
            iterableG2 = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(iterableG, 10));
        for (h0.e.a aVar : iterableG) {
            aVar.getClass();
            arrayList.add(new h0.e.c(aVar, jI, null, 4, null));
        }
        ArrayList arrayList2 = new ArrayList(y.r(iterableG2, 10));
        for (h0.e.a aVar2 : iterableG2) {
            aVar2.getClass();
            long j8 = jH;
            arrayList2.add(new h0.e.c(aVar2, j8, null, 4, null));
            jH = j8;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        if (arrayList3.size() > 1) {
            c0.u(arrayList3, new a());
        }
        c cVarE = i53.a.e(arrayList3);
        x1 x1Var2 = n.f135158a;
        return cVarE;
    }
}
