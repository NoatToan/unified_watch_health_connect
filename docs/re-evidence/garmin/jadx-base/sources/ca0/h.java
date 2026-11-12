package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    public static final fa0.h a(lc.v vVar, o1 o1Var, e23.a aVar, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.c.class));
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.c.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        boolean z14 = ((z1.c) lc.w.a(vVar2, t0Var.b(z1.c.class))).f26554a;
        boolean zH = mVar.h(z14) | mVar.k(o1Var.ordinal()) | mVar.B(aVar);
        Object objQ2 = mVar.q();
        if (zH) {
            objQ2 = new c.e(z14, o1Var, aVar, 2);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new c.e(z14, o1Var, aVar, 2);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(fa0.h.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        return (fa0.h) u1VarResolveViewModel;
    }
}
