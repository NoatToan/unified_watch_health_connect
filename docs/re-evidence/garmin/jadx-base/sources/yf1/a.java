package yf1;

import c83.a0;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentsSummaryListDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH'¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00060\u0005H'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00060\u00052\b\b\u0001\u0010 \u001a\u00020\u0001H'¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lyf1/a;", "", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", JWKParameterNames.RSA_EXPONENT, "(II)Lo53/i0;", "", "segmentId", "displayName", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "f", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "elevation", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "d", "(Ljava/lang/String;Ljava/lang/Boolean;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "segmentLeaderboardFilterDTO", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "g", "(Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;)Lo53/i0;", "c", "(Ljava/lang/String;)Lo53/i0;", "b", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "a", "()Lo53/i0;", "searchFilter", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "h", "(Ljava/lang/Object;)Lo53/i0;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/partner-service/strava/user")
    i0<a0<StravaStatusDTO>> a();

    @i83.b("/segment-service/segment/user/{segmentId}")
    i0<a0<String>> b(@s("segmentId") String segmentId);

    @p("/segment-service/segment/user/{segmentId}")
    i0<a0<String>> c(@s("segmentId") String segmentId);

    @i83.f("/segment-service/segment/{segmentId}?elevation=true")
    i0<a0<SegmentDetailsDTO>> d(@s("segmentId") String segmentId, @t("elevation") Boolean elevation);

    @i83.f("/segment-service/segment/filter/summarylist/all")
    i0<a0<SegmentsSummaryListDTO>> e(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/segment-service/leaderboard/segment/{segmentId}/rank/{displayName}")
    i0<a0<UserRankDTO>> f(@s("segmentId") String segmentId, @s("displayName") String displayName);

    @o("/segment-service/leaderboard/search")
    i0<a0<SegmentLeaderboardDTO>> g(@i83.a SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO);

    @o("/segment-service/segment/filterSegments")
    i0<a0<SegmentDetailsListDTO>> h(@i83.a Object searchFilter);
}
