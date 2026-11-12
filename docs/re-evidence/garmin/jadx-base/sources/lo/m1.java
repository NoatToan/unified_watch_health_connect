package lo;

/* JADX INFO: loaded from: classes7.dex */
public class m1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(f0 f0Var) {
        super(f0Var, 0);
        this.f113912b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113912b;
        String buttonTopLabel = f0Var.f113787i.getButtonTopLabel();
        String str = f0Var.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (!am.z0.b(am.x0.f4297k1, str)) {
            if (!am.z0.b(am.x0.f4301l1, f0Var.J1.f4358a)) {
                ((t) dVar).A6("duration", buttonTopLabel, f0Var.G1, -1, -1);
                return;
            }
        }
        ((t) dVar).A6("duration_millis", buttonTopLabel, f0Var.G1, -1, -1);
    }
}
