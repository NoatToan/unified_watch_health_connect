package qr;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146143b;

    public /* synthetic */ d(ActivityDetailsFragment activityDetailsFragment, int i14) {
        this.f146142a = i14;
        this.f146143b = activityDetailsFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f146142a;
        ActivityDetailsFragment activityDetailsFragment = this.f146143b;
        switch (i14) {
            case 0:
                w61.f fVar = (w61.f) obj;
                int i15 = ActivityDetailsFragment.I;
                fVar.getClass();
                Object objA = fVar.a();
                if (objA instanceof Integer) {
                    int iIntValue = ((Number) objA).intValue();
                    String string = activityDetailsFragment.getString(R.string.activities_restore_activity);
                    ActivityDetailsFragment.e eVar = new ActivityDetailsFragment.e(activityDetailsFragment.z6());
                    String string2 = activityDetailsFragment.requireContext().getString(iIntValue);
                    string2.getClass();
                    activityDetailsFragment.v6(string2, string, eVar);
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue != activityDetailsFragment.F) {
                    activityDetailsFragment.F = zBooleanValue;
                    activityDetailsFragment.d7();
                }
                break;
            case 2:
                int i16 = ActivityDetailsFragment.I;
                ((View) obj).getClass();
                t tVarZ6 = activityDetailsFragment.z6();
                tVarZ6.getClass();
                PrivacyType privacyType = PrivacyType.EVERYONE;
                tVarZ6.X5(tVarZ6.f146575z, new ps.r(new ps.a(privacyType.getId(), privacyType.getCategoryAccessRule()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null), nr.v0.PRIVACY_FOR_SHARE_ACTIVITY);
                break;
            case 3:
                int i17 = ActivityDetailsFragment.I;
                ((View) obj).getClass();
                activityDetailsFragment.z6().W5();
                break;
            case 4:
                int i18 = ActivityDetailsFragment.I;
                ((View) obj).getClass();
                t tVarZ7 = activityDetailsFragment.z6();
                tVarZ7.H1 = true;
                tVarZ7.I4();
                break;
            default:
                int i19 = ActivityDetailsFragment.I;
                ((View) obj).getClass();
                t tVarZ8 = activityDetailsFragment.z6();
                tVarZ8.H1 = true;
                tVarZ8.I4();
                break;
        }
        return Unit.INSTANCE;
    }
}
