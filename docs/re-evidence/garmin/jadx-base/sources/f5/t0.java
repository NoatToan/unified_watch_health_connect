package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf5/t0;", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 implements j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f69112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69113b;

    public t0(q0 q0Var, Object obj) {
        this.f69112a = q0Var;
        this.f69113b = obj;
    }

    @Override // f5.j2.a
    public final boolean a(com.google.android.exoplayer2.analytics.q qVar) {
        return true;
    }

    @Override // f5.j2.a
    public final j2.b apply() {
        return this.f69112a.f(this.f69113b);
    }

    @Override // f5.j2.a
    public final void cancel() {
    }

    @Override // f5.j2.a
    public final boolean isComplete() {
        return true;
    }
}
