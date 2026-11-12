package r1;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f149177a = ViewConfiguration.getScrollFriction();

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    public static final s1.y a(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        g6.c cVar = (g6.c) mVar.A(kotlin.t1.f91490h);
        boolean zI = mVar.i(cVar.getF75991a());
        Object objQ = mVar.q();
        if (zI) {
            objQ = new s1.z(new m2(cVar));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new s1.z(new m2(cVar));
                mVar.K(objQ);
            }
        }
        return (s1.y) objQ;
    }
}
