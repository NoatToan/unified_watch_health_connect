package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh5/t1;", "Lh5/p1;", "Lf5/a1;", "result", "Lh5/l0;", "placeable", "<init>", "(Lf5/a1;Lh5/l0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t1 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f5.a1 f81998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f81999b;

    public t1(f5.a1 a1Var, l0 l0Var) {
        this.f81998a = a1Var;
        this.f81999b = l0Var;
    }

    @Override // h5.p1
    public final boolean X0() {
        return this.f81999b.Y0().isAttached();
    }
}
