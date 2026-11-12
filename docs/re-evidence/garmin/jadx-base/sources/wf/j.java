package wf;

import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwf/j;", "Lwf/n;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/b0;", "lifecycle", "Lo53/l1;", "job", "<init>", "(Landroidx/lifecycle/b0;Lo53/l1;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements n, androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f184992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f184993b;

    public j(b0 b0Var, l1 l1Var) {
        this.f184992a = b0Var;
        this.f184993b = l1Var;
    }

    @Override // wf.n
    public final Object a(hf.p pVar) throws Throwable {
        Object objA = dg.k.a(this.f184992a, pVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // wf.n
    public final void complete() {
        this.f184992a.d(this);
    }

    @Override // androidx.lifecycle.n
    public final void onDestroy(n0 n0Var) {
        this.f184993b.c(null);
    }

    @Override // wf.n
    public final void start() {
        this.f184992a.a(this);
    }
}
