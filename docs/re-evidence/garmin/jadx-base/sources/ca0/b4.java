package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class b4 {
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final ab0.a a(lc.v vVar, o1 o1Var, e23.a aVar, e23.a aVar2, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar3 = p3.m.f135153a;
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.q.class));
            mVar.K(objQ);
        } else {
            aVar3.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.q.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        boolean zK = mVar.k(o1Var.ordinal()) | mVar.B(aVar) | mVar.B(aVar2);
        Object objQ2 = mVar.q();
        if (zK) {
            objQ2 = new ak0.m(o1Var, 22, aVar, aVar2);
            mVar.K(objQ2);
        } else {
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new ak0.m(o1Var, 22, aVar, aVar2);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(ab0.a.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        return (ab0.a) u1VarResolveViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final kb0.r b(lc.v vVar, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.q.class));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.q.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        mVar.L(-1614864554);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(kb0.r.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        return (kb0.r) u1VarResolveViewModel;
    }
}
