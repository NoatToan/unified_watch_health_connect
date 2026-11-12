package yr;

import org.koin.java.KoinJavaComponent;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 {
    public static final void a(nr.g.t tVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-131163975);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).n0(tVar, o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(tVar, i14, 15);
        }
    }
}
