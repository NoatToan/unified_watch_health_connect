package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 {
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    public static final ya0.c a(lc.v vVar, s1 s1Var, lc.m0 m0Var, p3.m mVar) {
        mVar.C(-1284033893);
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(n1.c.class));
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(n1.c.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        q90.d dVar = (q90.d) s1Var.invoke();
        if (dVar == null) {
            mVar.f();
            return null;
        }
        q90.d.a aVar2 = (q90.d.a) dVar;
        boolean zR = mVar.r(aVar2);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new c32.k(aVar2, 10);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new c32.k(aVar2, 10);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(ya0.c.class), vVar2.getViewModelStore(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        ya0.c cVar = (ya0.c) u1VarResolveViewModel;
        mVar.f();
        return cVar;
    }

    public static final void b(s1 s1Var, lc.m0 m0Var, o0 o0Var) {
        q90.d dVar = (q90.d) s1Var.invoke();
        if (dVar instanceof q90.d.a) {
            m0Var.h(new k(22), n1.c.INSTANCE);
        } else if (!(dVar instanceof q90.d.b)) {
            o0Var.invoke();
        } else {
            m0Var.h(new k(22), n1.f.INSTANCE);
        }
    }
}
