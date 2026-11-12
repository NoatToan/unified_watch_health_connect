package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class o2 {
    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final wa0.c a(lc.v vVar, v0 v0Var, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.j.class));
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.j.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        long j8 = ((q90.c) v0Var.invoke()).f143493a;
        boolean zL = mVar.l(j8);
        Object objQ2 = mVar.q();
        if (zL) {
            objQ2 = new a90.b(j8, 1);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a90.b(j8, 1);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(wa0.c.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        return (wa0.c) u1VarResolveViewModel;
    }
}
