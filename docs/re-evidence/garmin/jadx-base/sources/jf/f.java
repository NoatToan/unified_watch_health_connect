package jf;

import android.os.Trace;
import o53.b0;
import p3.l0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static final d a(Object obj, hf.j jVar, e23.l lVar, f5.k kVar, int i14, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        kf.b bVar = new kf.b(obj, (c) mVar.A(o.f98676a), jVar);
        mVar.C(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            wf.f fVarC = kf.j.c(bVar.f104561a, mVar);
            kf.j.g(fVarC);
            d.b bVar2 = new d.b(bVar.f104563c, fVarC, bVar.f104562b);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d(bVar2);
                mVar.K(objQ);
            }
            d dVar = (d) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, mVar);
                mVar.K(objQ2);
            }
            dVar.f98623h = (b0) objQ2;
            dVar.f98624i = lVar;
            dVar.f98625j = null;
            dVar.f98626k = kVar;
            dVar.f98627l = i14;
            dVar.f98628m = kf.j.a(mVar);
            dVar.d(bVar2);
            mVar.f();
            return dVar;
        } finally {
            Trace.endSection();
        }
    }
}
