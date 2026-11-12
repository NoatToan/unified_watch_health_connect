package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/g0;", "Lp3/y2;", "Lkotlin/Function1;", "Lp3/i0;", "Lp3/h0;", "effect", "<init>", "(Le23/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<i0, h0> f135086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f135087b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(e23.l<? super i0, ? extends h0> lVar) {
        this.f135086a = lVar;
    }

    @Override // p3.y2
    public final void onAbandoned() {
    }

    @Override // p3.y2
    public final void onForgotten() {
        h0 h0Var = this.f135087b;
        if (h0Var != null) {
            h0Var.dispose();
        }
        this.f135087b = null;
    }

    @Override // p3.y2
    public final void onRemembered() {
        this.f135087b = this.f135086a.invoke(l0.f135148a);
    }
}
