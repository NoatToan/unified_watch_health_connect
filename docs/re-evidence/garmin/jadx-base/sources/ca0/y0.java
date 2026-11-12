package ca0;

import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26538a;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26538a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final ta0.x a(lc.v vVar, lc.m0 m0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.f.class));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(z1.f.class));
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        mVar.L(-1614864554);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(ta0.x.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        return (ta0.x) u1VarResolveViewModel;
    }
}
