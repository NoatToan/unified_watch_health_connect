package ca0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v1 implements lc.y.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26500b;

    public /* synthetic */ v1(Object obj, int i14) {
        this.f26499a = i14;
        this.f26500b = obj;
    }

    @Override // lc.y.c
    public final void m8(lc.y yVar, lc.h0 h0Var, Bundle bundle) {
        int i14 = this.f26499a;
        Object obj = this.f26500b;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj;
                h0Var.getClass();
                if (!p005kotlin.jvm.internal.s.g(h0Var.f111773b.f144347f, p005kotlin.jvm.internal.s0.f105811a.b(b1.c.class).getF16141b())) {
                    lVar.invoke(Float.valueOf(0.0f));
                }
                break;
            case 1:
                ActivityDetailsActivity activityDetailsActivity = (ActivityDetailsActivity) obj;
                int i15 = ActivityDetailsActivity.f29967g;
                h0Var.getClass();
                int i16 = h0Var.f111773b.f144346e;
                if (i16 == R.id.activityDetailsJumpMetricFragment) {
                    activityDetailsActivity.updateActionBarNavigation(3);
                    activityDetailsActivity.updateActionBarTitle(activityDetailsActivity.getString(R.string.mtb_jump_metrics_title));
                    activityDetailsActivity.setRequestedOrientation(0);
                    activityDetailsActivity.f29972e = true;
                } else if (i16 == R.id.activityShareFragment || i16 == R.id.selectRatioFragment || i16 == R.id.activityCustomShareFragment) {
                    activityDetailsActivity.updateActionBarNavigation(2);
                    activityDetailsActivity.updateActionBarTitle(activityDetailsActivity.getString(R.string.activity_history_share_activity_title));
                } else if (i16 == R.id.editCustomImageFragment) {
                    activityDetailsActivity.updateActionBarNavigation(3);
                    activityDetailsActivity.updateActionBarTitle(activityDetailsActivity.getString(R.string.social_photo_sharing_edit_image));
                }
                break;
            default:
                EmergencyCallingActivity emergencyCallingActivity = (EmergencyCallingActivity) obj;
                EmergencyCallingActivity.a aVar = EmergencyCallingActivity.f43789d;
                h0Var.getClass();
                lc.h0 h0VarJ = yVar.f111904b.j();
                emergencyCallingActivity.updateActionBarTitle((String) (h0VarJ != null ? h0VarJ.f111775d : null));
                if (!emergencyCallingActivity.ca().A) {
                    int i17 = h0Var.f111773b.f144346e;
                    if (i17 == R.id.emergencyCallingContactFragment || i17 == R.id.emergencyCallingServicesFragment) {
                        emergencyCallingActivity.updateActionBarNavigation(3);
                    } else {
                        emergencyCallingActivity.updateActionBarNavigation(2);
                    }
                }
                break;
        }
    }
}
