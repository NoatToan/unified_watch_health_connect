package c2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f22939a;

    static {
        j.f22691a.getClass();
        j.k kVar = j.f22694d;
        h4.d.f81522a.getClass();
        f22939a = new z(kVar, h4.d.a.f81536n);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    public static final z a(j.l lVar, h4.d.b bVar, p3.m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        j.f22691a.getClass();
        if (p005kotlin.jvm.internal.s.g(lVar, j.f22694d)) {
            h4.d.f81522a.getClass();
            if (p005kotlin.jvm.internal.s.g(bVar, h4.d.a.f81536n)) {
                mVar.C(-1446604504);
                mVar.f();
                return f22939a;
            }
        }
        mVar.C(-1446550657);
        boolean z14 = ((((i14 & 14) ^ 6) > 4 && mVar.B(lVar)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.B(bVar)) || (i14 & 48) == 32);
        Object objQ = mVar.q();
        if (z14) {
            objQ = new z(lVar, bVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new z(lVar, bVar);
                mVar.K(objQ);
            }
        }
        z zVar = (z) objQ;
        mVar.f();
        return zVar;
    }
}
