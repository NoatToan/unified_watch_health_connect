package by1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f22195b;

    public /* synthetic */ l(ey1.a aVar, Activity activity) {
        this.f22194a = 0;
        this.f22195b = activity;
    }

    @Override // e23.a
    public final Object invoke() {
        Intent intent;
        Intent intent2;
        int i14 = this.f22194a;
        Bundle bundleA = null;
        Activity activity = this.f22195b;
        switch (i14) {
            case 0:
                m mVar = m.f22196a;
                ey1.a.B4(activity, "STPReviewTrainingPlan");
                return Unit.INSTANCE;
            case 1:
                m mVar2 = m.f22196a;
                Intent intentB = ActiveTrainingPlansActivity.a.b(ActiveTrainingPlansActivity.f45098w, activity, true);
                intentB.putExtra("GCM_extra_top_navigation", true);
                intentB.removeFlags(335544320);
                activity.startActivity(intentB);
                activity.setResult(-1);
                activity.finish();
                return Unit.INSTANCE;
            case 2:
                if (activity != null) {
                    ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).getF104144a().a(activity);
                }
                return Unit.INSTANCE;
            case 3:
                if (activity != null && (intent = activity.getIntent()) != null) {
                    l2.f37135b.getClass();
                    bundleA = l2.a.a(intent);
                }
                return ParametersHolderKt.parametersOf(bundleA);
            case 4:
                ((s41.a) KoinJavaComponent.get$default(s41.a.class, null, null, 6, null)).g(activity);
                return Unit.INSTANCE;
            case 5:
                if (activity != null && (intent2 = activity.getIntent()) != null) {
                    bundleA = intent2.getExtras();
                }
                return ParametersHolderKt.parametersOf(bundleA);
            case 6:
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachReportFindNewPlanTapped");
                activity.setResult(11);
                activity.finish();
                return Unit.INSTANCE;
            default:
                x9.d dVar = x9.d.f189592a;
                boolean z14 = false;
                if (activity != null && activity.isChangingConfigurations()) {
                    z14 = true;
                }
                return Boolean.valueOf(!z14);
        }
    }

    public /* synthetic */ l(Activity activity, int i14) {
        this.f22194a = i14;
        this.f22195b = activity;
    }
}
