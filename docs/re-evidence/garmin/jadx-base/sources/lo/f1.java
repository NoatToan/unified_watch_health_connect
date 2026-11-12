package lo;

/* JADX INFO: loaded from: classes7.dex */
public class f1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(f0 f0Var) {
        super(f0Var, 0);
        this.f113860b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113860b;
        ((t) dVar).A6("racingMaxSpeed", f0Var.S.getButtonTopLabel(), f0Var.c0("racingMaxSpeed"), 0, 300);
    }
}
