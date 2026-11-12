package b50;

import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r22.m0 f15969b;

    public /* synthetic */ e(r22.m0 m0Var, int i14) {
        this.f15968a = i14;
        this.f15969b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f15968a;
        r22.m0 m0Var = this.f15969b;
        switch (i14) {
            case 0:
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                m0Var.dismissAllowingStateLoss();
                break;
            case 1:
                int i15 = ActivityDetailsFragment.I;
                m0Var.dismissAllowingStateLoss();
                break;
            default:
                int i16 = PowerGuideListActivity.f40349k;
                m0Var.dismissAllowingStateLoss();
                break;
        }
    }
}
