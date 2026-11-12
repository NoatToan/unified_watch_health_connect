package bm;

import am.x0;
import am.z0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.c2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivitiesTrimActivity f18759b;

    public /* synthetic */ a(ActivitiesTrimActivity activitiesTrimActivity, int i14) {
        this.f18758a = i14;
        this.f18759b = activitiesTrimActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x0 x0VarC;
        int i14 = this.f18758a;
        ActivitiesTrimActivity activitiesTrimActivity = this.f18759b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                c2 c2Var = activitiesTrimActivity.f28812c;
                str.getClass();
                c2Var.setValue(str);
                break;
            case 1:
                String str2 = (String) obj;
                c2 c2Var2 = activitiesTrimActivity.f28813d;
                str2.getClass();
                c2Var2.setValue(str2);
                break;
            case 2:
                fw.m mVar = (fw.m) obj;
                activitiesTrimActivity.f28824o = false;
                fw.p pVar = mVar.f73769b;
                if (pVar == fw.p.SUCCESS) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TrimActivitySaveSuccess");
                    T t7 = mVar.f73770c;
                    activitiesTrimActivity.f28823n = true;
                    activitiesTrimActivity.updateActionBarNavigation(2);
                    activitiesTrimActivity.ga().f28872j.f(activitiesTrimActivity, new ActivitiesTrimActivity.c(new a(activitiesTrimActivity, 3)));
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa = activitiesTrimActivity.ga();
                    dVarGa.getClass();
                    ge1.b.T(v1.a(dVarGa), null, null, new b0(dVarGa, null), 3);
                    activitiesTrimActivity.ca();
                    if (t7 != 0 && (t7 instanceof List)) {
                        List<? extends Object> list = (List) t7;
                        a2 a2Var = a2.ACTIVITIES;
                        String str3 = list.get(0) + "   -----   " + list.get(1);
                        i2.f36769a.getClass();
                        i2.a.k(a2Var, "ActivitiesTrimActivity", str3);
                        o53.f0.w(activitiesTrimActivity).b(new h(activitiesTrimActivity, null));
                        activitiesTrimActivity.ga().B4(list);
                    }
                } else if (pVar == fw.p.ERROR) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TrimActivitySaveFailed");
                    ActivitiesTrimActivity.da(activitiesTrimActivity, R.string.activities_trim_failed, R.string.activities_trim_error_message, 4);
                }
                break;
            case 3:
                activitiesTrimActivity.f28823n = false;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = activitiesTrimActivity.ga().f28869g;
                if (z0.H((hVar == null || (x0VarC = hVar.C()) == null) ? null : x0VarC.f4358a)) {
                    activitiesTrimActivity.setResult(0);
                    activitiesTrimActivity.finish();
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa2 = activitiesTrimActivity.ga();
                    dVarGa2.getClass();
                    jd0.j jVarM = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M();
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarGa2.f28869g;
                    x0 x0VarC2 = hVar2 != null ? hVar2.C() : null;
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = dVarGa2.f28869g;
                    jVarM.a(activitiesTrimActivity, x0VarC2, hVar3 != null ? hVar3.f29448a : -1L);
                } else {
                    ActivitiesTrimActivity.da(activitiesTrimActivity, R.string.activities_trim_in_progress, R.string.activities_trim_in_progress_message, 8);
                }
                break;
            case 4:
                activitiesTrimActivity.f28815f.setValue(((com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.a) obj).f28857a);
                activitiesTrimActivity.ea();
                break;
            default:
                String str4 = (String) obj;
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                if (activitiesTrimActivity.getIntent().getBooleanExtra("GCM_extra_has_trim_distance_fragment", false)) {
                    str4.getClass();
                    activitiesTrimActivity.f28817h.setValue(str4);
                    activitiesTrimActivity.ea();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
