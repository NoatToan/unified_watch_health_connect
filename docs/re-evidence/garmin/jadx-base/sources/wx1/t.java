package wx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class t {
    public static final void a(mx1.f fVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1533981770);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            wf.f.a aVar4 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar4.f184930c = fVar.b();
            aVar4.c(xf.g.f190618c);
            wf.f fVarA = aVar4.a();
            f5.k.f68985a.getClass();
            jf.d dVarA = jf.s.a(fVarA, f5.k.a.f68993h, o0VarE, 3072, 22);
            int i16 = i15 >> 3;
            og2.k.g(y.Q(o0VarE, fVar.f121397c), aVar2, aVar3, false, null, z3.f.c(-1872082599, new w21.d((Object) aVar, (Object) fVar, (Object) dVarA, (Object) s9.c.c(dVarA.f98632q, o0VarE), 15), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 196608, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(fVar, aVar, aVar2, aVar3, i14, 16);
        }
    }
}
