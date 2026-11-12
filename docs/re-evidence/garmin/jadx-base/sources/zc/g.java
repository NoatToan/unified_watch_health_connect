package zc;

import e23.p;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;
import r53.i;
import yc.b1;
import yc.z0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f203920a;

    static {
        z0.c cVar = new z0.c(false);
        f203920a = new b1(z0.b.f196664b, cVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0026  */
    public static final d a(i iVar, m mVar) {
        iVar.getClass();
        mVar.L(388053246);
        t13.h hVar = t13.h.f161748a;
        x1 x1Var = n.f135158a;
        mVar.L(1046463091);
        boolean zB = mVar.B(iVar);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zB) {
            objQ = new d(iVar);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new d(iVar);
                mVar.K(objQ);
            }
        }
        d dVar = (d) objQ;
        mVar.R();
        mVar.L(1046463169);
        boolean zR = mVar.r(hVar) | mVar.r(dVar);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new e(hVar, dVar, null);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new e(hVar, dVar, null);
                mVar.K(objQ2);
            }
        }
        mVar.R();
        l0.e((p) objQ2, dVar, mVar);
        mVar.L(1046463438);
        boolean zR2 = mVar.r(hVar) | mVar.r(dVar);
        Object objQ3 = mVar.q();
        if (zR2) {
            objQ3 = new f(hVar, dVar, null);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == m.a.f135155b) {
                objQ3 = new f(hVar, dVar, null);
                mVar.K(objQ3);
            }
        }
        mVar.R();
        l0.e((p) objQ3, dVar, mVar);
        mVar.R();
        return dVar;
    }
}
