package b21;

import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final u21.t a(lc.v vVar, lc.m0 m0Var, p3.m mVar) {
        Object bVar;
        mVar.C(1129491501);
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            int i14 = o13.q.f128596b;
            bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.x.class));
            if (o13.q.b(bVar) != null) {
                bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.p0.class));
            }
            if (bVar instanceof o13.q.b) {
                bVar = null;
            }
            objQ = (lc.v) bVar;
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                try {
                    int i15 = o13.q.f128596b;
                    bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.x.class));
                } catch (Throwable th3) {
                    int i16 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                if (o13.q.b(bVar) != null) {
                    try {
                        bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.p0.class));
                    } catch (Throwable th4) {
                        int i17 = o13.q.f128596b;
                        bVar = new o13.q.b(th4);
                    }
                }
                if (bVar instanceof o13.q.b) {
                    bVar = null;
                }
                objQ = (lc.v) bVar;
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        if (vVar2 == null) {
            p3.x1 x1Var2 = p3.n.f135158a;
            mVar.f();
            return null;
        }
        mVar.L(-1614864554);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.t.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        u21.t tVar = (u21.t) u1VarResolveViewModel;
        p3.x1 x1Var3 = p3.n.f135158a;
        mVar.f();
        return tVar;
    }
}
