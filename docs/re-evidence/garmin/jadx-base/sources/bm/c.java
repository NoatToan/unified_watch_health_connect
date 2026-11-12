package bm;

import am.z0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.q1;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivitiesTrimActivity f18770b;

    public /* synthetic */ c(ActivitiesTrimActivity activitiesTrimActivity, int i14) {
        this.f18769a = i14;
        this.f18770b = activitiesTrimActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        int i14 = this.f18769a;
        ActivitiesTrimActivity activitiesTrimActivity = this.f18770b;
        switch (i14) {
            case 0:
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                if (!z14) {
                    activitiesTrimActivity.ga().I4(activitiesTrimActivity);
                } else {
                    activitiesTrimActivity.ia();
                }
                break;
            case 1:
                ActivitiesTrimActivity.a aVar2 = ActivitiesTrimActivity.f28809p;
                if (!z14) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TrimActivitySaveCancel");
                } else if (activitiesTrimActivity.ga().H4()) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TrimActivitySave");
                    activitiesTrimActivity.showProgressOverlay();
                    activitiesTrimActivity.f28824o = true;
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa = activitiesTrimActivity.ga();
                    Logger logger = dVarGa.f28865c;
                    ActivityDetailChartDTO activityDetailChartDTO = dVarGa.f28867e;
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO != null ? activityDetailChartDTO.C() : null;
                    ActivityDetailChartDTO activityDetailChartDTO2 = dVarGa.f28867e;
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = dVarGa.f28869g;
                    int i15 = 2;
                    if (listC != null && activityDetailChartDTO2 != null && hVar != null) {
                        int iH = activityDetailChartDTO2.H("directTimestamp");
                        Integer numD = dVarGa.F4().d();
                        int iIntValue = numD != null ? numD.intValue() : 0;
                        Integer numD2 = dVarGa.E4().d();
                        int iIntValue2 = numD2 != null ? numD2.intValue() : listC.size() - 1;
                        if (iH != -1 && listC.size() > iIntValue && listC.size() > iIntValue2) {
                            logger.info("printIndexes", iIntValue + " ---- " + iIntValue2);
                            logger.info("printValueOfIndexes", listC.get(iIntValue).C().get(iH) + " ------ " + listC.get(iIntValue2).C().get(iH));
                            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START;
                            n nVar = n.SUM_DURATION_TO_TIME_STAMP;
                            Double dA4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa, "SUMDURATION", bVar, null, nVar, null, 16);
                            Double dA5 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVarGa, "SUMDURATION", com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END, null, nVar, null, 16);
                            if (dA4 != null && dA5 != null) {
                                to.n nVar2 = new to.n((long) dA4.doubleValue(), (long) dA5.doubleValue());
                                ArrayList arrayListM = p13.x.m(nVar2);
                                if (z0.H(hVar.C().f4358a)) {
                                    dVarGa.f28868f = new y0();
                                    y0 y0Var = new y0();
                                    dVarGa.f28868f = y0Var;
                                    y0Var.j(new fw.m(null, fw.p.LOADING, null, null, 9, null));
                                    w9.a aVarA = v1.a(dVarGa);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new d0(dVarGa, nVar2, hVar, null), 2);
                                } else {
                                    to.a aVar3 = new to.a(arrayListM);
                                    cw.a aVarM = cw.a.M();
                                    long j8 = hVar.f29448a;
                                    aVarM.getClass();
                                    dVarGa.f28868f = new k(j8, aVar3).k();
                                }
                            }
                        }
                    }
                    y0 y0Var2 = dVarGa.f28868f;
                    if (y0Var2 == null) {
                        ActivitiesTrimActivity.da(activitiesTrimActivity, R.string.activities_trim_failed, R.string.activities_trim_error_message, 4);
                    } else {
                        y0Var2.f(activitiesTrimActivity, new ActivitiesTrimActivity.c(new a(activitiesTrimActivity, i15)));
                    }
                }
                break;
            default:
                ActivitiesTrimActivity.a aVar4 = ActivitiesTrimActivity.f28809p;
                if (z14) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "TrimActivityCancel");
                    activitiesTrimActivity.fa();
                }
                break;
        }
    }
}
