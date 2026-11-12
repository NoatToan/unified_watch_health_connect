package lo;

/* JADX INFO: loaded from: classes7.dex */
public class u0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(f0 f0Var) {
        super(f0Var, 0);
        this.f113972b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113972b;
        String buttonTopLabel = f0Var.D.getButtonTopLabel();
        double dC0 = f0Var.c0("maxAscent");
        if (!am.r1.r()) {
            c22.m3 m3Var = c22.m3.FOOT;
            c22.l3.f23124b.getClass();
            dC0 = c22.l3.a.j(dC0, m3Var);
        }
        ((t) dVar).A6("maxAscent", buttonTopLabel, dC0, 0, am.r1.r() ? 27432 : 90000);
    }
}
