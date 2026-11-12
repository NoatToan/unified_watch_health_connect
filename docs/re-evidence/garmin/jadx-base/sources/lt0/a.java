package lt0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeInviteDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengePlayerDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.h;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\u0012J%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bH'¢\u0006\u0004\b\u001f\u0010\u0012J%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bH'¢\u0006\u0004\b \u0010\u0012J/\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\bH'¢\u0006\u0004\b\"\u0010#J5\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H'¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\bH'¢\u0006\u0004\b(\u0010#JI\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00170\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b*\u0010\u001aJ?\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00170\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b+\u0010\u001cJ%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bH'¢\u0006\u0004\b,\u0010\u0012J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\bH'¢\u0006\u0004\b-\u0010\u0012J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010!\u001a\u00020\bH'¢\u0006\u0004\b.\u0010#J?\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00170\u00050\u00042\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b1\u0010\u001c¨\u00062À\u0006\u0003"}, d2 = {"Llt0/a;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;", "adHocChallengeDTO", "Lo53/i0;", "Lc83/a0;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;)Lo53/i0;", "", "challengeId", "", "o", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeDTO;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;", "adHocChallengeInviteDTO", "f", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengeInviteDTO;)Lo53/i0;", "m", "(Ljava/lang/String;)Lo53/i0;", "todayDate", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/AdHocChallengePlayerDTO;", "a", "(Ljava/lang/String;Ljava/lang/String;II)Lo53/i0;", "c", "(Ljava/lang/String;II)Lo53/i0;", "j", "challengeInvitationId", IntegerTokenConverter.CONVERTER_KEY, "b", "playerId", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "playerIds", "l", "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengeDTO;", "h", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/VivoKidAdHocChallengePlayerDTO;", "p", JWKParameterNames.RSA_EXPONENT, "d", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_MODULUS, "adHocChallengeUuid", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d;", "g", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/adhocchallenge-service/adHocChallenge/{challengeId}/players/leaderboard")
    i0<a0<List<AdHocChallengePlayerDTO>>> a(@s("challengeId") String challengeId, @t("todayDate") String todayDate, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @p("/adhocchallenge-service/adHocChallenge/invite/{challengeInvitationId}/decline")
    i0<a0<Unit>> b(@s("challengeInvitationId") String challengeInvitationId);

    @i83.f("/adhocchallenge-service/adHocChallenge/{challengeId}/invites")
    i0<a0<List<AdHocChallengePlayerDTO>>> c(@s("challengeId") String challengeId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @p("/vivokidchallenge-service/adHocChallenge/invite/{challengeInvitationId}/accept")
    i0<a0<Unit>> d(@s("challengeInvitationId") String challengeInvitationId);

    @i83.f("/vivokidchallenge-service/adHocChallenge/{challengeId}/invites")
    i0<a0<List<VivoKidAdHocChallengePlayerDTO>>> e(@s("challengeId") String challengeId, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @o("/adhocchallenge-service/adHocChallenge/invite")
    i0<a0<Unit>> f(@i83.a AdHocChallengeInviteDTO adHocChallengeInviteDTO);

    @i83.f("/adhocchallenge-service/adHocChallenge/{adHocChallengeUuid}/inviteIncludePlayers")
    i0<a0<List<com.garmin.android.apps.connectmobile.leaderboard.model.d>>> g(@s("adHocChallengeUuid") String adHocChallengeUuid, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/vivokidchallenge-service/adHocChallenge/detail/{challengeId}")
    i0<a0<VivoKidAdHocChallengeDTO>> h(@s("challengeId") String challengeId, @t("todayDate") String todayDate);

    @p("/adhocchallenge-service/adHocChallenge/invite/{challengeInvitationId}/accept")
    i0<a0<Unit>> i(@s("challengeInvitationId") String challengeInvitationId);

    @i83.b("/adhocchallenge-service/adHocChallenge/{challengeId}")
    i0<a0<Unit>> j(@s("challengeId") String challengeId);

    @i83.b("/adhocchallenge-service/adHocChallenge/{challengeId}/player/{playerId}")
    i0<a0<Unit>> k(@s("challengeId") String challengeId, @s("playerId") String playerId);

    @h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/adhocchallenge-service/adHocChallenge/{challengeId}/players")
    i0<a0<Unit>> l(@s("challengeId") String challengeId, @i83.a List<String> playerIds);

    @i83.f("/adhocchallenge-service/adHocChallenge/detail/{challengeId}")
    i0<a0<AdHocChallengeDTO>> m(@s("challengeId") String challengeId);

    @i83.b("/vivokidchallenge-service/adHocChallenge/{challengeId}/player/{playerId}")
    i0<a0<Unit>> n(@s("challengeId") String challengeId, @s("playerId") String playerId);

    @p("/adhocchallenge-service/adHocChallenge/{challengeId}")
    i0<a0<Unit>> o(@s("challengeId") String challengeId, @i83.a AdHocChallengeDTO adHocChallengeDTO);

    @i83.f("/vivokidchallenge-service/adHocChallenge/{challengeId}/players/leaderboard")
    i0<a0<List<VivoKidAdHocChallengePlayerDTO>>> p(@s("challengeId") String challengeId, @t("todayDate") String todayDate, @t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @p("/vivokidchallenge-service/adHocChallenge/invite/{challengeInvitationId}/decline")
    i0<a0<Unit>> q(@s("challengeInvitationId") String challengeInvitationId);

    @o("/adhocchallenge-service/adHocChallenge/")
    i0<a0<AdHocChallengeDTO>> r(@i83.a AdHocChallengeDTO adHocChallengeDTO);
}
