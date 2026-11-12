package pz0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.mapbox.maps.MapboxMap;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J]\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n2\b\b\u0001\u0010\u000f\u001a\u00020\u00042\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H'¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\n2\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lpz0/c;", "Lmj1/a;", "", MapboxMap.QFE_LIMIT, "", "cursor", "ownerType", "", "activityTypeIds", "imageVersions", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "b", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lo53/i0;", "activityId", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "c", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "lastViewedTimeGMT", "Loz0/b;", "a", "(Ljava/util/List;Ljava/lang/String;)Lo53/i0;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c extends mj1.a {
    @f("/activitylist-service/activities/v2/newsfeed/status")
    i0<a0<oz0.b>> a(@t("parentActivityTypeId") List<Integer> activityTypeIds, @t("lastViewedTimeGMT") String lastViewedTimeGMT);

    @f("/mobile-gateway/newsfeed/v3?heatMap=true")
    i0<a0<ActivityListDTO>> b(@t(MapboxMap.QFE_LIMIT) int limit, @t("cursor") String cursor, @t("ownerType") String ownerType, @t("parentActivityTypeId") List<Integer> activityTypeIds, @t("image-version") List<String> imageVersions);

    @f("/mobile-gateway/newsfeed/v2/{activityId}?heatMap=true")
    i0<a0<ActivityListItemDTO>> c(@s("activityId") String activityId, @t("image-version") List<String> imageVersions);
}
