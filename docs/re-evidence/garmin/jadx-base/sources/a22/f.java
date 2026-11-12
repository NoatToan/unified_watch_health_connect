package a22;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"La22/f;", "", "", "displayName", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "a", "(Ljava/lang/String;II)Lo53/i0;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @i83.f("/activitylist-service/activities/comments/{displayName}")
    i0<a0<ActivityListDTO>> a(@s("displayName") String displayName, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);
}
