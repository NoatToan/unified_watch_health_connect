package wf;

import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwf/r;", "Lwf/n;", "Landroidx/lifecycle/n;", "Lhf/j;", "imageLoader", "Lwf/f;", "initialRequest", "Lag/b;", "target", "Landroidx/lifecycle/b0;", "lifecycle", "Lo53/l1;", "job", "<init>", "(Lhf/j;Lwf/f;Lag/b;Landroidx/lifecycle/b0;Lo53/l1;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements n, androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.j f185015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f185016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f185017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f185018d;

    public r(hf.j jVar, f fVar, ag.b<?> bVar, b0 b0Var, l1 l1Var) {
        this.f185015a = jVar;
        this.f185016b = fVar;
        this.f185017c = b0Var;
        this.f185018d = l1Var;
    }

    @Override // wf.n
    public final Object a(hf.p pVar) {
        Object objA;
        b0 b0Var = this.f185017c;
        return (b0Var == null || (objA = dg.k.a(b0Var, pVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objA;
    }

    @Override // wf.n
    public final void b() {
        throw null;
    }

    public final void c() {
        this.f185018d.c(null);
        b0 b0Var = this.f185017c;
        if (b0Var != null) {
            b0Var.d(this);
        }
    }

    @Override // androidx.lifecycle.n
    public final void onDestroy(n0 n0Var) {
        throw null;
    }

    @Override // wf.n
    public final void start() {
        b0 b0Var = this.f185017c;
        if (b0Var != null) {
            b0Var.a(this);
        }
        throw null;
    }
}
