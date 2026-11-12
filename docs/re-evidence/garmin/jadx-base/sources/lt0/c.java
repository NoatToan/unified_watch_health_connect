package lt0;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u0010H'¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\fJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Llt0/c;", "", "", "badgeChallengeUuid", "Lfz0/c;", "todayDate", "Lo53/i0;", "Lc83/a0;", "", "f", "(Ljava/lang/String;Lfz0/c;)Lo53/i0;", "c", "(Ljava/lang/String;)Lo53/i0;", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "isFullChallengeSupported", "includeExclusive", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", JWKParameterNames.RSA_EXPONENT, "(IIZZ)Lo53/i0;", "b", "(II)Lo53/i0;", "d", "", "badgePk", "a", "(J)Lo53/i0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @p("badgechallenge-service/partnerReward/badge/{badgePk}/code/redeemed")
    i0<a0<Unit>> a(@s("badgePk") long badgePk);

    @i83.f("badgechallenge-service/virtualChallenge/available")
    i0<a0<List<com.garmin.android.apps.connectmobile.leaderboard.model.p>>> b(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @o("badgechallenge-service/badgeChallenge/{badgeChallengeUuid}/optOut")
    i0<a0<Unit>> c(@s("badgeChallengeUuid") String badgeChallengeUuid);

    @i83.f("badgechallenge-service/badgeChallenge/{badgeChallengeUuid}")
    i0<a0<com.garmin.android.apps.connectmobile.leaderboard.model.p>> d(@s("badgeChallengeUuid") String badgeChallengeUuid);

    @i83.f("badgechallenge-service/badgeChallenge/available")
    i0<a0<List<com.garmin.android.apps.connectmobile.leaderboard.model.p>>> e(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("isFullChallengeSupported") boolean isFullChallengeSupported, @t("includeExclusive") boolean includeExclusive);

    @o("badgechallenge-service/badgeChallenge/{badgeChallengeUuid}/optIn/{todayDate}")
    i0<a0<Unit>> f(@s("badgeChallengeUuid") String badgeChallengeUuid, @s("todayDate") fz0.c todayDate);
}
