package lo;

/* JADX INFO: loaded from: classes7.dex */
public class z2 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(f0 f0Var) {
        super(f0Var, 0);
        this.f113994b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113994b;
        if (f0Var.f113782g2) {
            return;
        }
        String buttonTopLabel = f0Var.N0.getButtonTopLabel();
        double dC0 = f0Var.c0("splitsCount");
        j23.l lVar = uq.j.f172259a;
        ((t) dVar).A6("splitsCount", buttonTopLabel, dC0, lVar.f96796a, lVar.f96797b);
    }
}
