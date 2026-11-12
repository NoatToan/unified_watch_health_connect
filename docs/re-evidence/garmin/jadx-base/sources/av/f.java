package av;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJm\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00070\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00070\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0004H'¢\u0006\u0004\b#\u0010\u000bJ?\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\b0\u00070\u00062\b\b\u0001\u0010\"\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b%\u0010&JS\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00042\b\b\u0001\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010*J%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00070\u00062\b\b\u0001\u0010,\u001a\u00020+H'¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00070\u00062\b\b\u0001\u0010,\u001a\u000200H'¢\u0006\u0004\b1\u00102J+\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00070\u00062\u000e\b\u0001\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\bH'¢\u0006\u0004\b4\u00105J!\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\b0\u00070\u0006H'¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00070\u0006H'¢\u0006\u0004\b:\u00108¨\u0006;À\u0006\u0003"}, d2 = {"Lav/f;", "", "", "displayName", "", MapboxMap.QFE_LIMIT, "Lo53/i0;", "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;I)Lo53/i0;", "categoryIds", "difficultyIds", TtmlNode.START, "", "isFullChallengeSupported", "showExclusiveBadge", "c", "(Ljava/util/List;Ljava/util/List;IIZZ)Lo53/i0;", "a", "(Ljava/util/List;Ljava/util/List;II)Lo53/i0;", "activityId", "Lcom/garmin/android/apps/connectmobile/badges/service/model/SimpleBadgeDTO;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", Action.SCOPE_ATTRIBUTE, "Lcom/garmin/android/apps/connectmobile/badges/service/model/q;", "b", "(Ljava/lang/String;II)Lo53/i0;", "connectionDisplayName", "Lcom/garmin/android/apps/connectmobile/badges/service/model/l;", "j", "(Ljava/lang/String;)Lo53/i0;", "badgeId", "l", "Lcom/garmin/android/apps/connectmobile/badges/service/model/p;", "f", "(III)Lo53/i0;", "includeAssocDataName", "Lcom/garmin/android/apps/connectmobile/badges/service/model/s;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;IZII)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/t;", "earnedBadge", "", "d", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/t;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/n;", "h", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/n;)Lo53/i0;", "badgeIds", "m", "(Ljava/util/List;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/u;", "g", "()Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/f;", JWKParameterNames.RSA_MODULUS, "gcm-domain-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @i83.k({"Content-Type: application/json"})
    @i83.f("/badge-service/badge/earned")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> a(@i83.t("categoryId") List<Integer> categoryIds, @i83.t("difficultyId") List<Integer> difficultyIds, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/badge-service/badge/leaderboard/{scope}")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.q>>> b(@i83.s(Action.SCOPE_ATTRIBUTE) String scope, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/badge-service/badge/available")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> c(@i83.t("categoryId") List<Integer> categoryIds, @i83.t("difficultyId") List<Integer> difficultyIds, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit, @i83.t("isFullChallengeSupported") boolean isFullChallengeSupported, @i83.t("showExclusiveBadge") boolean showExclusiveBadge);

    @i83.o("/badge-service/badge/earn")
    i0<c83.a0<Unit>> d(@i83.a com.garmin.android.apps.connectmobile.badges.service.model.t earnedBadge);

    @i83.f("/badge-service/badge/earned/latest/{displayName}")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.m>>> e(@i83.s("displayName") String displayName, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/badge-service/badge/earned/detail/{badgeId}/followings")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.p>>> f(@i83.s("badgeId") int badgeId, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/badgechallenge-service/partnerReward/unredeemedCode/popups")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.u>>> g();

    @i83.o("/badge-service/badge/earn")
    i0<c83.a0<Unit>> h(@i83.a com.garmin.android.apps.connectmobile.badges.service.model.n earnedBadge);

    @i83.f("/badge-service/badge/{displayName}/earned/detail/repeatable/v2/{badgeId}")
    i0<c83.a0<List<com.garmin.android.apps.connectmobile.badges.service.model.s>>> i(@i83.s("displayName") String displayName, @i83.s("badgeId") int badgeId, @i83.t("includeAssocDataName") boolean includeAssocDataName, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/badge-service/badge/compare/{connectionDisplayName}")
    i0<c83.a0<com.garmin.android.apps.connectmobile.badges.service.model.l>> j(@i83.s("connectionDisplayName") String connectionDisplayName);

    @i83.f("/badge-service/badge/{displayName}/earned/activity/{activityId}")
    i0<c83.a0<List<SimpleBadgeDTO>>> k(@i83.s("displayName") String displayName, @i83.s("activityId") String activityId);

    @i83.f("/mobile-gateway/badge/{connectionDisplayName}/earned/detail/{badgeId}")
    i0<c83.a0<com.garmin.android.apps.connectmobile.badges.service.model.m>> l(@i83.s("connectionDisplayName") String connectionDisplayName, @i83.s("badgeId") int badgeId);

    @i83.p("/badge-service/badge/badgesviewed")
    i0<c83.a0<Unit>> m(@i83.a List<Integer> badgeIds);

    @i83.f("/badge-service/badge/attributes")
    i0<c83.a0<com.garmin.android.apps.connectmobile.badges.service.model.f>> n();
}
