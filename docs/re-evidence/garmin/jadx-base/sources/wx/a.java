package wx;

import c83.a0;
import com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO;
import dy.b;
import i83.f;
import i83.o;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lwx/a;", "", "", "startDate", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "b", "(Ljava/lang/String;)Lo53/i0;", "", "deviceId", "Ldy/b;", "sendCalendarWorkoutRequestBody", "a", "(JLdy/b;)Lo53/i0;", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/mobile-gateway/calendar/schedule-workout/device/{deviceId}")
    i0<a0<String>> a(@s("deviceId") long deviceId, @i83.a b sendCalendarWorkoutRequestBody);

    @f("/calendar-service/workout/schedule/summary/")
    i0<a0<WorkoutScheduleSummaryDTO>> b(@t("startDate") String startDate);
}
