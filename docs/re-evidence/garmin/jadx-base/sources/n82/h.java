package n82;

import java.util.Map;
import n63.w;
import o13.p;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final g a(p[] pVarArr, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new a(1);
            mVar.K(objQ);
        }
        e23.p pVar = (e23.p) objQ;
        Object objQ2 = mVar.q();
        if (objQ2 == c2565a) {
            objQ2 = new w(5);
            mVar.K(objQ2);
        }
        d4.l lVarB = d4.a.b(new a3.d(pVar, 9), new ci0.f((e23.l) objQ2, 5));
        boolean zR = mVar.r(pVarArr);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == c2565a) {
            objQ3 = new mh1.i(pVarArr, 28);
            mVar.K(objQ3);
        }
        return new g((Map) d4.a.c(objArr, lVarB, (e23.a) objQ3, mVar, 0));
    }
}
