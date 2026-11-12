package mg2;

import a3.l0;
import kotlin.t1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static final void a(zf2.b bVar, long j8, e23.a aVar, p3.m mVar, int i14) {
        bVar.getClass();
        o0 o0VarE = mVar.E(-1098348210);
        int i15 = i14 | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            w4.a aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(bVar);
                o0VarE.K(objQ);
            }
            g82.c cVar = g82.c.f76436a;
            z3.e eVarC = z3.f.c(1509559912, new da0.d((p1) objQ, aVar2, j8, aVar, 6), o0VarE);
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new ll0.a(aVar, 16);
                o0VarE.K(objQ2);
            }
            cVar.b(null, null, eVarC, null, null, null, null, false, (e23.a) objQ2, o0VarE, 12583296, 123);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(bVar, j8, aVar, i14);
        }
    }
}
