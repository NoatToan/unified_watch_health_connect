package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/g;", "Landroidx/lifecycle/k0;", "", "Landroidx/lifecycle/x;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/x;)V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x[] f7895a;

    public g(x[] xVarArr) {
        xVarArr.getClass();
        this.f7895a = xVarArr;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        new x0();
        x[] xVarArr = this.f7895a;
        for (x xVar : xVarArr) {
            xVar.a();
        }
        for (x xVar2 : xVarArr) {
            xVar2.a();
        }
    }
}
