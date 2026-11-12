package nq;

import c83.a0;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lnq/g;", "", "", "activityId", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "rounds", "Lo53/i0;", "Lc83/a0;", "", "a", "(JLcom/garmin/android/apps/connectmobile/activities/newmodel/f;)Lo53/i0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {
    @p("/activity-service/activity/{activityId}/rounds")
    i0<a0<Unit>> a(@s("activityId") long activityId, @i83.a com.garmin.android.apps.connectmobile.activities.newmodel.f rounds);
}
