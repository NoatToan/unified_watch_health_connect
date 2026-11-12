package lo;

/* JADX INFO: loaded from: classes7.dex */
public class k3 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(f0 f0Var) {
        super(f0Var, 0);
        this.f113893b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113893b;
        if (f0Var.f113782g2) {
            return;
        }
        ((t) dVar).A6("totalSurfaceTime", f0Var.X.getButtonTopLabel(), f0Var.c0("totalSurfaceTime"), -1, -1);
    }
}
