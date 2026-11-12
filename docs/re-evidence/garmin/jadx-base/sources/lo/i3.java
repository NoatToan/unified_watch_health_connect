package lo;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class i3 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(f0 f0Var) {
        super(f0Var, 0);
        this.f113881b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113881b;
        if (f0Var.f113782g2) {
            return;
        }
        f0Var.Q0.getButtonTopLabel();
        double dC0 = f0Var.c0("splitsMaxDistance");
        boolean z14 = f0Var.f113770d2;
        int i14 = z14 ? 27432 : 90000;
        t tVar = (t) dVar;
        tVar.getClass();
        r22.e eVarY6 = r22.e.y6(false);
        eVarY6.f149839m = 0;
        eVarY6.f149836j = true;
        eVarY6.f149840n = i14;
        eVarY6.v6((int) dC0);
        ArrayList<l3> arrayListA = p3.a(tVar.requireContext(), Arrays.asList(tVar.getString(l3.METER.f113908b), tVar.getString(l3.FOOT.f113908b)));
        l3 l3Var = z14 ? arrayListA.get(0) : arrayListA.get(1);
        if (l3Var != null) {
            eVarY6.E = l3Var;
        }
        eVarY6.w6(arrayListA);
        eVarY6.X = new m(tVar, 1);
        eVarY6.show(tVar.getChildFragmentManager(), "ActivityDistanceSegmentedPickerDialogFragment");
    }
}
