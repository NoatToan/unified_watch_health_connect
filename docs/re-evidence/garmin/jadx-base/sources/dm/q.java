package dm;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/q;", "Ljw/e$b;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements jw.e.b<ActivityDetailChartDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60404a;

    public q(o oVar) {
        this.f60404a = oVar;
    }

    @Override // jw.e.b
    public final void onSuccess(ActivityDetailChartDTO activityDetailChartDTO) {
        ActivityDetailChartDTO activityDetailChartDTO2 = activityDetailChartDTO;
        if (activityDetailChartDTO2 != null) {
            ((aq.d) this.f60404a.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11889k = activityDetailChartDTO2;
        }
    }
}
