package lo;

/* JADX INFO: loaded from: classes7.dex */
public class t2 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(f0 f0Var) {
        super(f0Var, 0);
        this.f113959b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113959b;
        if (f0Var.f113782g2) {
            return;
        }
        ((t) dVar).A6("bottom_time", f0Var.f113772e0.getButtonTopLabel(), f0Var.c0("bottom_time"), -1, -1);
    }
}
