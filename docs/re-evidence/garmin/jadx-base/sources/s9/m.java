package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import e23.p;
import p3.l0;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public static final a a(b0.b bVar, p3.m mVar) {
        Object obj = (n0) mVar.A(j.f158018a);
        x1 x1Var = n.f135158a;
        boolean zB = mVar.B(obj);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = new a();
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a();
                mVar.K(objQ);
            }
        }
        a aVar2 = (a) objQ;
        boolean zR = mVar.r(aVar2) | mVar.r(obj);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new rk0.g(25, obj, aVar2);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new rk0.g(25, obj, aVar2);
                mVar.K(objQ2);
            }
        }
        l0.b(aVar2, obj, (e23.l) objQ2, mVar);
        boolean zR2 = mVar.r(aVar2) | mVar.k(bVar.ordinal());
        Object objQ3 = mVar.q();
        if (zR2) {
            objQ3 = new k(aVar2, bVar, null);
            mVar.K(objQ3);
        } else {
            aVar.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new k(aVar2, bVar, null);
                mVar.K(objQ3);
            }
        }
        l0.f(aVar2, bVar, (p) objQ3, mVar);
        return aVar2;
    }
}
