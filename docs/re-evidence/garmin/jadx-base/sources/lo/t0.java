package lo;

/* JADX INFO: loaded from: classes7.dex */
public class t0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(f0 f0Var) {
        super(f0Var, 0);
        this.f113957b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113957b;
        String buttonTopLabel = f0Var.C.getButtonTopLabel();
        double dC0 = f0Var.c0("avgAscent");
        if (!am.r1.r()) {
            c22.m3 m3Var = c22.m3.FOOT;
            c22.l3.f23124b.getClass();
            dC0 = c22.l3.a.j(dC0, m3Var);
        }
        ((t) dVar).A6("avgAscent", buttonTopLabel, dC0, 0, am.r1.r() ? 27432 : 90000);
    }
}
