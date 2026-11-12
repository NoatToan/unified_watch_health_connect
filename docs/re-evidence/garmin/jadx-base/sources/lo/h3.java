package lo;

/* JADX INFO: loaded from: classes7.dex */
public class h3 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(f0 f0Var) {
        super(f0Var, 0);
        this.f113872b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113872b;
        if (f0Var.f113782g2) {
            return;
        }
        ((t) dVar).A6("splitsMaxSpeed", f0Var.P0.getButtonTopLabel(), f0Var.c0("splitsMaxSpeed"), 0, 300);
    }
}
