package hg0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.mapbox.maps.MapboxMap;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import ps.b2;
import ps.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Jy\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\r2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r2\b\b\u0001\u0010\u0014\u001a\u00020\u00132\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000e0\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lhg0/a;", "", "", "activityType", "activitySubType", "startDate", "endDate", "", MapboxMap.QFE_LIMIT, "", "excludeChildren", "sortOrder", "sortBy", "Lo53/i0;", "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "activityId", "Lps/d;", "eventActivityAssociationDTO", "d", "(JLps/d;)Lo53/i0;", "Lps/b2;", "a", "(J)Lo53/i0;", "Lps/r;", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("activity-service/activity/{activityId}/weather")
    i0<a0<b2>> a(@s("activityId") long activityId);

    @i83.f("activitylist-service/activities/search/activities")
    i0<a0<List<ActivityListItemDTO>>> b(@t("activityType") String activityType, @t("activitySubType") String activitySubType, @t("startDate") String startDate, @t("endDate") String endDate, @t(MapboxMap.QFE_LIMIT) int limit, @t("excludeChildren") boolean excludeChildren, @t("sortOrder") String sortOrder, @t("sortBy") String sortBy);

    @i83.f("activity-service/activity/{activityId}")
    i0<a0<r>> c(@s("activityId") long activityId);

    @p("/activity-service/activity/{activityId}")
    i0<a0<String>> d(@s("activityId") long activityId, @i83.a ps.d eventActivityAssociationDTO);
}
