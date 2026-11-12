package ca0;

import androidx.lifecycle.viewmodel.CreationExtras;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26220a;

        static {
            int[] iArr = new int[z90.b.values().length];
            try {
                iArr[z90.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26220a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final qb0.b a(lc.v vVar, e23.a aVar, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            m0Var.c(t0Var.b(z1.p.class));
            vVar = m0Var.c(t0Var.b(z1.p.class));
            mVar.K(vVar);
            objQ = vVar;
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                try {
                    p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var.c(t0Var2.b(z1.p.class));
                    vVar = m0Var.c(t0Var2.b(z1.p.class));
                } catch (IllegalArgumentException unused) {
                }
                mVar.K(vVar);
                objQ = vVar;
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        q90.c cVar = (q90.c) aVar.invoke();
        boolean zR = mVar.r(cVar);
        Object objQ2 = mVar.q();
        if (zR) {
            objQ2 = new a90.d(cVar, 4);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a90.d(cVar, 4);
                mVar.K(objQ2);
            }
        }
        mVar.L(-1614864554);
        CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
        Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(mVar, 0);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(qb0.b.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, (e23.a) objQ2);
        mVar.R();
        qb0.b bVar = (qb0.b) u1VarResolveViewModel;
        p3.x1 x1Var2 = p3.n.f135158a;
        return bVar;
    }
}
