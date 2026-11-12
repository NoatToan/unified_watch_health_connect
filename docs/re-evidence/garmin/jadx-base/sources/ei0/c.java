package ei0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0011\u0010\fJU\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H'¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\bJe\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H'¢\u0006\u0004\b\u001f\u0010 Je\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H'¢\u0006\u0004\b!\u0010 JO\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\r2\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015H'¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010\bJ%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\bJI\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\bJ%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010\bJ3\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b,\u0010-Jm\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H'¢\u0006\u0004\b/\u00100Jm\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H'¢\u0006\u0004\b1\u00100J\u001b\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004H'¢\u0006\u0004\b2\u00103JQ\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\u000e\b\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H'¢\u0006\u0004\b5\u00106J1\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00050\u00042\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H'¢\u0006\u0004\b7\u00108J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010:\u001a\u000209H'¢\u0006\u0004\b;\u0010<¨\u0006=À\u0006\u0003"}, d2 = {"Lei0/c;", "", "", "displayName", "Lo53/i0;", "Lc83/a0;", "Lhi0/c;", "l", "(Ljava/lang/String;)Lo53/i0;", "", "requestId", "h", "(J)Lo53/i0;", "", "undo", "w", "(JZ)Lo53/i0;", JWKParameterNames.RSA_EXPONENT, "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "imageVersions", "fields", "Lhi0/k;", "m", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lo53/i0;", "", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "j", "Lhi0/a;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lo53/i0;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "wheelchairUsers", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)Lo53/i0;", "c", "b", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "p", "v", "Lcom/garmin/android/apps/connectmobile/connections/model/d;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "keyword", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lo53/i0;", "u", "d", "()Lo53/i0;", "userIdList", "s", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lo53/i0;", JWKParameterNames.RSA_MODULUS, "(Ljava/util/List;)Lo53/i0;", "Lhi0/j;", "groupTrackFriendDTO", "f", "(Lhi0/j;)Lo53/i0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @i83.b("/follower-service/follow/{displayName}/favorite")
    o53.i0<c83.a0<Unit>> b(@i83.s("displayName") String displayName);

    @i83.p("/follower-service/follow/{displayName}/favorite")
    o53.i0<c83.a0<Unit>> c(@i83.s("displayName") String displayName);

    @i83.f("/follower-service/follow/followings/count")
    o53.i0<c83.a0<Integer>> d();

    @i83.b("/follower-service/follow/requests/{requestId}")
    o53.i0<c83.a0<hi0.c>> e(@i83.s("requestId") long requestId);

    @i83.o("/follower-service/follow/mutuals/groupTrack")
    o53.i0<c83.a0<Boolean>> f(@i83.a hi0.j groupTrackFriendDTO);

    @i83.f("/follower-service/follow/followers/{displayName}")
    o53.i0<c83.a0<List<hi0.a>>> g(@i83.s("displayName") String displayName, @i83.t("image-version") List<String> imageVersions, @i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit, @i83.t("fields") List<String> fields);

    @i83.p("/follower-service/follow/requests/{requestId}/accept")
    o53.i0<c83.a0<hi0.c>> h(@i83.s("requestId") long requestId);

    @i83.f("follower-service/muteuser")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.connections.model.d>> i(@i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit);

    @i83.b("/follower-service/follow/followings/{displayName}")
    o53.i0<c83.a0<Unit>> j(@i83.s("displayName") String displayName);

    @i83.f("/follower-service/follow/favorites")
    o53.i0<c83.a0<List<hi0.a>>> k(@i83.t("image-version") List<String> imageVersions, @i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit);

    @i83.o("/follower-service/follow/followings/{displayName}")
    o53.i0<c83.a0<hi0.c>> l(@i83.s("displayName") String displayName);

    @i83.f("/follower-service/follow/pending")
    o53.i0<c83.a0<hi0.k>> m(@i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit, @i83.t("image-version") List<String> imageVersions, @i83.t("fields") List<String> fields);

    @i83.f("/follower-service/follow/mutuals/groupTrack")
    o53.i0<c83.a0<List<hi0.a>>> n(@i83.t("image-version") List<String> imageVersions);

    @i83.f("follower-service/follow/searchFollowers/{displayName}")
    o53.i0<c83.a0<List<hi0.a>>> o(@i83.s("displayName") String displayName, @i83.t("keyword") String keyword, @i83.t("image-version") List<String> imageVersions, @i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit, @i83.t("fields") List<String> fields);

    @i83.o("follower-service/muteuser/{displayName}")
    o53.i0<c83.a0<Object>> p(@i83.s("displayName") String displayName);

    @i83.f("follower-service/follow/mutuals")
    o53.i0<c83.a0<List<hi0.a>>> q(@i83.t("image-version") List<String> imageVersions, @i83.t("wheelchairUsers") Boolean wheelchairUsers, @i83.t("fields") List<String> fields);

    @i83.b("/follower-service/follow/followers/{displayName}")
    o53.i0<c83.a0<Unit>> r(@i83.s("displayName") String displayName);

    @i83.f("follower-service/follow/users")
    o53.i0<c83.a0<List<hi0.a>>> s(@i83.t(TtmlNode.ATTR_ID) List<Integer> userIdList, @i83.t("image-version") List<String> imageVersions, @i83.t("fields") List<String> fields);

    @i83.f("/follower-service/follow/followings/{displayName}")
    o53.i0<c83.a0<List<hi0.a>>> t(@i83.s("displayName") String displayName, @i83.t("image-version") List<String> imageVersions, @i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit, @i83.t("fields") List<String> fields);

    @i83.f("follower-service/follow/searchFollowings/{displayName}")
    o53.i0<c83.a0<List<hi0.a>>> u(@i83.s("displayName") String displayName, @i83.t("keyword") String keyword, @i83.t("image-version") List<String> imageVersions, @i83.t(TtmlNode.START) Integer start, @i83.t(MapboxMap.QFE_LIMIT) Integer limit, @i83.t("fields") List<String> fields);

    @i83.b("follower-service/muteuser/{displayName}")
    o53.i0<c83.a0<Unit>> v(@i83.s("displayName") String displayName);

    @i83.p("/follower-service/follow/requests/{requestId}/decline")
    o53.i0<c83.a0<hi0.c>> w(@i83.s("requestId") long requestId, @i83.t("undo") boolean undo);
}
