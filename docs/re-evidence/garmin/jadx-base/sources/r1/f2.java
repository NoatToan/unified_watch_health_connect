package r1;

import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    static {
        s1.l.c(7, 0.0f, 0.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public static final x3 a(long j8, s1.k kVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(o4.d0.g(j8));
        Object objQ = mVar.q();
        if (zB) {
            objQ = (s1.c2) k0.f149133a.invoke(o4.d0.g(j8));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = (s1.c2) k0.f149133a.invoke(o4.d0.g(j8));
                mVar.K(objQ);
            }
        }
        return s1.f.c(o4.d0.a(j8), (s1.c2) objQ, kVar, null, "ColorAnimation", mVar, 0, 8);
    }
}
