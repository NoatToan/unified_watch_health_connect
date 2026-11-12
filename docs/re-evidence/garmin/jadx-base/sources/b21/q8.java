package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* JADX INFO: loaded from: classes9.dex */
public final class q8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(lc.v vVar, lc.m0 m0Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(-1495446241);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 256 : 128;
        } else {
            eVar2 = eVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            boolean zB = o0VarE.B(vVar);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(fb.d.class));
                o0VarE.K(objQ2);
            }
            lc.v vVar2 = (lc.v) objQ2;
            o0VarE.L(-1614864554);
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(q21.r.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            q21.r rVar = (q21.r) u1VarResolveViewModel;
            p3.p1 p1VarC = s9.c.c(rVar.f142296i, o0VarE);
            Integer num = ((q21.q) p1VarC.getF182175a()).f142283f;
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(context) | o0VarE.r(rVar);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                k7 k7Var = new k7(p1VarC, feVar, context, rVar, null);
                o0VarE.K(k7Var);
                objQ3 = k7Var;
            }
            p3.l0.e((e23.p) objQ3, num, o0VarE);
            eVar2.invoke(rVar, (q21.q) p1VarC.getF182175a(), feVar, o0VarE, Integer.valueOf(((i15 << 3) & 7168) | 384));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x0(vVar, m0Var, eVar, i14, 2);
        }
    }
}
