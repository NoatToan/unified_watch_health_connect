package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp3/z;", "Lp3/y2;", "Lo53/b0;", "coroutineScope", "<init>", "(Lo53/b0;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f135391a;

    public z(o53.b0 b0Var) {
        this.f135391a = b0Var;
    }

    @Override // p3.y2
    public final void onAbandoned() {
        o53.b0 b0Var = this.f135391a;
        if (b0Var instanceof a3) {
            ((a3) b0Var).a();
        } else {
            o53.c0.c(b0Var, new d1());
        }
    }

    @Override // p3.y2
    public final void onForgotten() {
        o53.b0 b0Var = this.f135391a;
        if (b0Var instanceof a3) {
            ((a3) b0Var).a();
        } else {
            o53.c0.c(b0Var, new d1());
        }
    }

    @Override // p3.y2
    public final void onRemembered() {
    }
}
