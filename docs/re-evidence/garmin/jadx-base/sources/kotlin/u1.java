package kotlin;

import x5.m0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/u1;", "Li5/m3;", "Lx5/m0;", "textInputService", "<init>", "(Lx5/m0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f91583a;

    public u1(m0 m0Var) {
        this.f91583a = m0Var;
    }

    @Override // kotlin.m3
    public final void hide() {
        this.f91583a.f188886a.f();
    }

    @Override // kotlin.m3
    public final void show() {
        m0 m0Var = this.f91583a;
        if (m0Var.f188887b.get() != null) {
            m0Var.f188886a.h();
        }
    }
}
