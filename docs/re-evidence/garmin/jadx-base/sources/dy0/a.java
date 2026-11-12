package dy0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JN\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\rJF\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ldy0/a;", "", "", "uuid", "displayName", "sortOrder", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "resource", "", "activityIds", "Lcy0/c;", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/activitylist-service/activities/multi-day-activity/{uuid}/{displayName}")
    Object a(@s("uuid") String str, @s("displayName") String str2, @t("sortOrder") String str3, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, t13.d<? super a0<List<ActivityListItemDTO>>> dVar);

    @o("/activity-service/activity/resources/{displayName}")
    Object b(@s("displayName") String str, @t("resource") List<String> list, @i83.a List<Long> list2, t13.d<? super a0<List<cy0.c>>> dVar);
}
