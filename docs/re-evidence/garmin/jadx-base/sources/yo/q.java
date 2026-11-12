package yo;

import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lyo/q;", "", "", "activityId", "Lo53/i0;", "Lc83/a0;", "Lyo/d;", "c", "(J)Lo53/i0;", "Lyo/a0;", "reconstruct", "b", "(JLyo/a0;)Lo53/i0;", "", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface q {
    @i83.b("/activity-service/activity/v2/{activityId}/reconstruct")
    i0<c83.a0<String>> a(@i83.s("activityId") long activityId);

    @i83.p("/activity-service/activity/v2/{activityId}/reconstruct")
    i0<c83.a0<Object>> b(@i83.s("activityId") long activityId, @i83.a a0 reconstruct);

    @i83.f("/activity-service/activity/v2/{activityId}/reconstruct")
    i0<c83.a0<d>> c(@i83.s("activityId") long activityId);
}
