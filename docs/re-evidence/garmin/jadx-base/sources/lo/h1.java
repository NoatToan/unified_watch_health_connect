package lo;

import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class h1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f0 f0Var) {
        super(f0Var, 0);
        this.f113870b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113870b;
        qs.g gVar = f0Var.L1;
        am.x0 x0Var = f0Var.J1;
        Calendar calendar = f0Var.I1;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var.f113778f2;
        ((t) dVar).y6(gVar, x0Var, calendar, hVar != null ? hVar.f29448a : -1L, hVar != null ? hVar.H() : false);
    }
}
