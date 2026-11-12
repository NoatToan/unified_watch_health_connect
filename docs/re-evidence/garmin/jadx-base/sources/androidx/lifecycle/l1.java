package androidx.lifecycle;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/l1;", "Landroidx/lifecycle/k0;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/j1;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/j1;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 implements k0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f7957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7958c;

    public l1(String str, j1 j1Var) {
        str.getClass();
        j1Var.getClass();
        this.f7956a = str;
        this.f7957b = j1Var;
    }

    public final void a(b0 b0Var, nd.c cVar) {
        cVar.getClass();
        b0Var.getClass();
        if (this.f7958c) {
            vb.h.z("Already attached to lifecycleOwner");
            return;
        }
        this.f7958c = true;
        b0Var.a(this);
        cVar.c(this.f7956a, this.f7957b.f7945b.f163197e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        if (aVar == b0.a.ON_DESTROY) {
            this.f7958c = false;
            n0Var.getF158016a().d(this);
        }
    }
}
