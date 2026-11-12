package cw;

import c83.a0;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcw/r;", "", "", "activityId", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "b", "(J)Lo53/i0;", "exerciseSetsDTO", "", "a", "(JLcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;)Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface r {
    @i83.p("activity-service/activity/{activityId}/exerciseSets")
    i0<a0<Unit>> a(@i83.s("activityId") long activityId, @i83.a ExerciseSetsDTO exerciseSetsDTO);

    @i83.f("activity-service/activity/{activityId}/exerciseSets")
    i0<a0<ExerciseSetsDTO>> b(@i83.s("activityId") long activityId);
}
