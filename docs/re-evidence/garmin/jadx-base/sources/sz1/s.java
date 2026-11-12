package sz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import sk0.k1;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final void a(t tVar, b63.o oVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        tVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(423809934);
        int i15 = i14 | (o0VarE.r(tVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new n82.f.a(o82.g.f130850c, null, oVar, 2, null);
                o0VarE.K(objQ);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                o0VarE.K(objQ2);
            }
            z02.d.a(false, z3.f.c(79134697, new nw0.l(aVar, aVar2, 9), o0VarE), null, null, null, z3.f.c(-459196059, new k1(context, fVarA, (yd1.a) objQ2, tVar, 3), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) tVar, (Object) oVar, (e23.a) aVar, (Object) aVar2, i14, 4);
        }
    }
}
