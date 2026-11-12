package ke0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lke0/b;", "", "", "dogProfileId", "", "hasDog", "", "activityType", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "b", "(JZLjava/lang/String;IILt13/d;)Ljava/lang/Object;", "c", "(ZIILt13/d;)Ljava/lang/Object;", "a", "(JLt13/d;)Ljava/lang/Object;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("/activitylist-service/activity-animal/dog/{dogProfileId}/activity-types")
    Object a(@s("dogProfileId") long j8, d<? super a0<List<String>>> dVar);

    @f("/activitylist-service/activities/search/activities")
    Object b(@t("dogProfileId") long j8, @t("hasDog") boolean z14, @t("activityType") String str, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, d<? super a0<List<ActivityListItemDTO>>> dVar);

    @f("/activitylist-service/activities/search/activities")
    Object c(@t("hasDog") boolean z14, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, d<? super a0<List<ActivityListItemDTO>>> dVar);
}
