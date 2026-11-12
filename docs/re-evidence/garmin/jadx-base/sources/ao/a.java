package ao;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ:\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lao/a;", "", "", "activityId", "", "b", "(JLt13/d;)Ljava/lang/Object;", "Lbo/b;", "request", "Lbo/f;", "d", "(Lbo/b;Lt13/d;)Ljava/lang/Object;", "Lbo/d;", "f", "", "badgeId", "", "userDisplayName", TtmlNode.START, MapboxMap.QFE_LIMIT, "c", "(ILjava/lang/String;IILt13/d;)Ljava/lang/Object;", "gearUUID", "startIndex", "", "activityTypeKeys", "Lbo/l;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;IILjava/util/List;Lt13/d;)Ljava/lang/Object;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.b("/activity-service/activity/{activityId}")
    Object b(@s("activityId") long j8, t13.d<? super Unit> dVar);

    @i83.f("/activitylist-service/activities/badge/{badgeId}/{userDisplayName}")
    Object c(@s("badgeId") int i14, @s("userDisplayName") String str, @t(TtmlNode.START) int i15, @t(MapboxMap.QFE_LIMIT) int i16, t13.d<? super bo.d> dVar);

    @o("/activitylist-service/activities/search/count")
    Object d(@i83.a bo.b bVar, t13.d<? super bo.f> dVar);

    @i83.f("/activitylist-service/activities/{gearUUID}/gear/")
    Object e(@s("gearUUID") String str, @t(TtmlNode.START) int i14, @t(MapboxMap.QFE_LIMIT) int i15, @t("activityTypeKeys") List<String> list, t13.d<? super List<bo.l>> dVar);

    @o("/activitylist-service/activities/search")
    Object f(@i83.a bo.b bVar, t13.d<? super bo.d> dVar);
}
