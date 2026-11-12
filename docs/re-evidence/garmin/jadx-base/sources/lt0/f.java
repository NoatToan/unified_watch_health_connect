package lt0;

import c83.a0;
import com.garmin.android.apps.connectmobile.leaderboard.model.SocialChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.h0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.h;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\rJ5\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u00060\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Llt0/f;", "", "", "uuid", "todayDate", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "challengeInviteId", "", "a", "(Ljava/lang/String;)Lo53/i0;", "c", "", "playerIdList", "d", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "badgeId", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lcom/garmin/android/apps/connectmobile/leaderboard/model/SocialChallengeDTO;", "b", "(Ljava/lang/String;II)Lo53/i0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @p("/vivokidchallenge-service/teamChallenge/invite/{challengeInviteId}/accept")
    i0<a0<Unit>> a(@s("challengeInviteId") String challengeInviteId);

    @i83.f("/vivokidchallenge-service/teamChallenge/badge/{badgeId}/players")
    i0<a0<List<SocialChallengeDTO>>> b(@s("badgeId") String badgeId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @p("/vivokidchallenge-service/teamChallenge/invite/{challengeInviteId}/decline")
    i0<a0<Unit>> c(@s("challengeInviteId") String challengeInviteId);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/vivokidchallenge-service/teamChallenge/{uuid}/players")
    i0<a0<Unit>> d(@s("uuid") String uuid, @i83.a List<String> playerIdList);

    @i83.f("/vivokidchallenge-service/teamChallenge/{uuid}")
    i0<a0<h0>> e(@s("uuid") String uuid, @t("todayDate") String todayDate);
}
