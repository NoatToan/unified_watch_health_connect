package lt0;

import c83.a0;
import com.garmin.android.apps.connectmobile.leaderboard.model.ConnectionLeaderBoardDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.d0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bJM\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u000bJR\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015Jh\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Llt0/e;", "", "", "startDate", "endDate", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/ConnectionLeaderBoardDTO;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "actTypeId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "a", "relationship", "", "metricId", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "d", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "displayName", "c", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @i83.f("/userstats-service/leaderboard/wellness/ranked/connection?metricId=87")
    i0<a0<ConnectionLeaderBoardDTO>> a(@t("startDate") String startDate, @t("endDate") String endDate, @t(TtmlNode.START) String start, @t(MapboxMap.QFE_LIMIT) String limit);

    @i83.f("/userstats-service/leaderboard/activity/ranked/connection?metricId=17")
    i0<a0<ConnectionLeaderBoardDTO>> b(@t("actTypeId") String actTypeId, @t("startDate") String startDate, @t("endDate") String endDate, @t(TtmlNode.START) String start, @t(MapboxMap.QFE_LIMIT) String limit);

    @i83.f("/fitnessstats-service/activity/leaderboard/{relationship}")
    Object c(@s("relationship") String str, @t("displayName") String str2, @t("metricId") int i14, @t("actTypeId") int i15, @t("startDate") String str3, @t("endDate") String str4, @t(TtmlNode.START) int i16, @t(MapboxMap.QFE_LIMIT) int i17, t13.d<? super a0<d0>> dVar);

    @i83.f("/usersummary-service/stats/wellness/leaderboard/{relationship}")
    Object d(@s("relationship") String str, @t("metricId") int i14, @t("startDate") String str2, @t("endDate") String str3, @t(TtmlNode.START) int i15, @t(MapboxMap.QFE_LIMIT) int i16, t13.d<? super a0<d0>> dVar);

    @i83.f("/userstats-service/leaderboard/wellness/ranked/connection?metricId=29")
    i0<a0<ConnectionLeaderBoardDTO>> e(@t("startDate") String startDate, @t("endDate") String endDate, @t(TtmlNode.START) String start, @t(MapboxMap.QFE_LIMIT) String limit);
}
