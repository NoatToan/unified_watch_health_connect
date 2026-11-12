package a61;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements androidx.fragment.app.v.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.v f1599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.c f1600c;

    public /* synthetic */ h(androidx.fragment.app.v vVar, com.garmin.android.apps.connectmobile.c cVar, int i14) {
        this.f1598a = i14;
        this.f1599b = vVar;
        this.f1600c = cVar;
    }

    @Override // androidx.fragment.app.v.p
    public final void onBackStackChanged() {
        int i14 = this.f1598a;
        com.garmin.android.apps.connectmobile.c cVar = this.f1600c;
        androidx.fragment.app.v vVar = this.f1599b;
        switch (i14) {
            case 0:
                StrengthStatsActivity strengthStatsActivity = (StrengthStatsActivity) cVar;
                StrengthStatsActivity.a aVar = StrengthStatsActivity.f39815r;
                int iM = vVar.M();
                Integer numValueOf = Integer.valueOf(iM);
                if (iM <= 0) {
                    numValueOf = null;
                }
                androidx.fragment.app.v.k kVarL = numValueOf != null ? vVar.L(numValueOf.intValue() - 1) : null;
                if (!p005kotlin.jvm.internal.s.g(kVarL != null ? kVarL.getName() : null, "month_view")) {
                    strengthStatsActivity.pa().setVisibility(0);
                } else {
                    strengthStatsActivity.pa().setVisibility(8);
                }
                break;
            case 1:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) cVar;
                NotificationSettingsActivity.a aVar2 = NotificationSettingsActivity.f43568b;
                androidx.lifecycle.n0 n0VarF = vVar.F(R.id.content_frame_layout);
                if (n0VarF instanceof aj1.d) {
                    String strV1 = ((aj1.d) n0VarF).v1();
                    if (strV1.length() > 0) {
                        notificationSettingsActivity.setTitle(strV1);
                    }
                }
                break;
            case 2:
                TrainingPlanDashboardActivity trainingPlanDashboardActivity = (TrainingPlanDashboardActivity) cVar;
                TrainingPlanDashboardActivity.a aVar3 = TrainingPlanDashboardActivity.f45383n;
                androidx.lifecycle.n0 n0VarF2 = vVar.F(R.id.content);
                if (n0VarF2 != null && (n0VarF2 instanceof yt1.e)) {
                    trainingPlanDashboardActivity.setTitle(((yt1.e) n0VarF2).V5());
                    break;
                }
                break;
            default:
                ATPEditActivity aTPEditActivity = (ATPEditActivity) cVar;
                ATPEditActivity.a aVar4 = ATPEditActivity.f45202g;
                androidx.lifecycle.n0 n0VarF3 = vVar.F(R.id.content);
                if (n0VarF3 != null && (n0VarF3 instanceof yt1.e)) {
                    aTPEditActivity.setTitle(((yt1.e) n0VarF3).V5());
                    break;
                }
                break;
        }
    }
}
