package lo;

/* JADX INFO: loaded from: classes7.dex */
public class u2 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(f0 f0Var) {
        super(f0Var, 0);
        this.f113974b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113974b;
        String buttonTopLabel = f0Var.J0.getButtonTopLabel();
        double dC0 = f0Var.c0("routes");
        j23.l lVar = uq.j.f172259a;
        ((t) dVar).A6("routes", buttonTopLabel, dC0, lVar.f96796a, lVar.f96797b);
    }
}
