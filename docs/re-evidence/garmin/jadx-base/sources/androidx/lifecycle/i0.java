package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/i0;", "Landroidx/lifecycle/g0;", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/b0;", "lifecycle", "Lt13/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/b0;Lt13/g;)V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends g0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f7936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f7937b;

    public i0(b0 b0Var, t13.g gVar) {
        b0Var.getClass();
        gVar.getClass();
        this.f7936a = b0Var;
        this.f7937b = gVar;
        if (b0Var.getF7973d() == b0.b.DESTROYED) {
            g8.i.p(gVar, null);
        }
    }

    @Override // androidx.lifecycle.g0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getF7936a() {
        return this.f7936a;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF183565a() {
        return this.f7937b;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        b0 b0Var = this.f7936a;
        if (b0Var.getF7973d().compareTo(b0.b.DESTROYED) <= 0) {
            b0Var.d(this);
            g8.i.p(this.f7937b, null);
        }
    }
}
