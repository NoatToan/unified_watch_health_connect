package lo;

/* JADX INFO: loaded from: classes7.dex */
public class w extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f0 f0Var) {
        super(f0Var, 0);
        this.f113979b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        ps.a1 a1Var;
        f0 f0Var = this.f113979b;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var.f113778f2;
        if (hVar == null || (a1Var = hVar.f29459l) == null || a1Var.getIsAtpActivity() == null || !hVar.f29459l.getIsAtpActivity().booleanValue()) {
            dVar.j4(f0Var.J1);
            return;
        }
        boolean zContains = am.z0.j().contains(f0Var.J1);
        am.x0 x0Var = f0Var.J1;
        if (zContains) {
            dVar.A3(x0Var, x0Var);
        } else {
            dVar.A3(f0Var.J1, am.z0.g(x0Var));
        }
    }
}
