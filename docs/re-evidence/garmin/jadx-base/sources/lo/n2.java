package lo;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveEditGasesActivity;

/* JADX INFO: loaded from: classes7.dex */
public class n2 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(f0 f0Var) {
        super(f0Var, 0);
        this.f113921b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113921b;
        if (f0Var.f113778f2 == null) {
            f0Var.f113778f2 = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var.f113778f2;
        if (hVar.f29461n == null) {
            hVar.f29461n = new com.garmin.android.apps.connectmobile.activities.newmodel.s();
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = f0Var.f113778f2.f29461n;
        t tVar = (t) dVar;
        String str = tVar.f113949a.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.X, str);
        int i14 = ActivityDiveEditGasesActivity.f29126j;
        Intent intent = new Intent(tVar.getActivity(), (Class<?>) ActivityDiveEditGasesActivity.class);
        intent.putExtra("extra.activity.dive.info", sVar);
        intent.putExtra("extra.activity.is.ccr", zB);
        tVar.startActivityForResult(intent, 15);
    }
}
