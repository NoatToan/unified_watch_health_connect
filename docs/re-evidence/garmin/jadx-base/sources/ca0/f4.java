package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class f4 {
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final sa0.n a(lc.v vVar, e23.a aVar, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.r.class));
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.r.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        q90.c cVar = (q90.c) aVar.invoke();
        long j8 = cVar.f143493a;
        l90.b bVar = cVar.f143495c;
        boolean zL = mVar.l(j8) | mVar.r(bVar);
        Object objQ2 = mVar.q();
        if (zL) {
            objQ2 = new a6.g(j8, bVar, 1);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a6.g(j8, bVar, 1);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(sa0.n.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        return (sa0.n) u1VarResolveViewModel;
    }
}
