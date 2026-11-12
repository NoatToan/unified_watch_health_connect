package n82;

import o13.p;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    public static final f a(f.a aVar, g gVar, p3.m mVar, int i14) {
        if ((i14 & 1) != 0) {
            aVar = new f.a(null, null, null, 7, null);
        }
        if ((i14 & 2) != 0) {
            gVar = h.a(new p[]{new p(aVar.f124963a, aVar.f124965c)}, mVar);
        }
        x1 x1Var = p3.n.f135158a;
        int i15 = 0;
        Object[] objArr = new Object[0];
        b.f124946f.getClass();
        d4.l lVar = b.f124947g;
        boolean zR = mVar.r(aVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new mh1.i(aVar, 29);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new mh1.i(aVar, 29);
                mVar.K(objQ);
            }
        }
        b bVar = (b) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 0);
        int iA = bVar.f124952e.a(aVar.f124965c);
        boolean zB = mVar.B(bVar);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new i(bVar, i15);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new i(bVar, i15);
                mVar.K(objQ2);
            }
        }
        return new f(gl.b.M(iA, (e23.a) objQ2, mVar, 0, 0), bVar, gVar);
    }
}
