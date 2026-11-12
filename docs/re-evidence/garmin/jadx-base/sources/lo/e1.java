package lo;

/* JADX INFO: loaded from: classes7.dex */
public class e1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f0 f0Var) {
        super(f0Var, 0);
        this.f113732b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        int iQ;
        int i14;
        f0 f0Var = this.f113732b;
        String buttonTopLabel = f0Var.I.getButtonTopLabel();
        double dC0 = f0Var.c0("max_speed");
        boolean zC = am.z0.c(f0Var.J1.f4358a);
        am.x0 x0Var = f0Var.J1;
        if (zC) {
            if (am.z0.b(am.x0.O1, x0Var.f4358a)) {
                c22.q3 q3VarK0 = f0Var.k0();
                if (q3VarK0 == c22.q3.AVIATION_KNOTS) {
                    i14 = 1302;
                } else {
                    i14 = q3VarK0 == c22.q3.KILOMETER_PER_HOUR ? 2413 : 1499;
                }
            } else {
                i14 = 300;
            }
            ((t) dVar).A6("max_speed", buttonTopLabel, dC0, 0, i14);
            return;
        }
        boolean z14 = f0Var.f113790i2;
        String str = x0Var.f4358a;
        if (am.z0.b(am.x0.f4324r, str)) {
            c22.l3.f23124b.getClass();
            iQ = c22.l3.a.r(dC0, z14);
        } else if (am.z0.Q(str) || am.z0.b(am.x0.f4297k1, str) || am.z0.b(am.x0.f4301l1, str)) {
            c22.l3.f23124b.getClass();
            iQ = c22.l3.a.q(dC0);
        } else {
            c22.l3.f23124b.getClass();
            iQ = c22.l3.a.p(dC0, z14);
        }
        ((t) dVar).A6("best_pace", buttonTopLabel, iQ, 0, 59);
    }
}
