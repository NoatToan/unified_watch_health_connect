package ei0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J5\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lei0/w0;", "", "", "displayName", "Lo53/i0;", "Lc83/a0;", "a", "(Ljava/lang/String;)Lo53/i0;", "", "b", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/d;", "c", "(II)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface w0 {
    @i83.o("userblock-service/blockuser/{displayName}")
    o53.i0<c83.a0<Object>> a(@i83.s("displayName") String displayName);

    @i83.b("userblock-service/blockuser/{displayName}")
    o53.i0<c83.a0<Unit>> b(@i83.s("displayName") String displayName);

    @i83.f("userblock-service/blockuser")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.userprofile.model.d>>> c(@i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);
}
