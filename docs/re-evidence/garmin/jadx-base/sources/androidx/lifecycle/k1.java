package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/k1;", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/n1;", "provider", "<init>", "(Landroidx/lifecycle/n1;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f7950a;

    public k1(n1 n1Var) {
        n1Var.getClass();
        this.f7950a = n1Var;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (aVar != b0.a.ON_CREATE) {
            o2.c.s(aVar, "Next event must be ON_CREATE, it was ");
        } else {
            n0Var.getF158016a().d(this);
            this.f7950a.b();
        }
    }
}
