package lt0;

import c83.a0;
import com.garmin.android.apps.connectmobile.leaderboard.model.c0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.t;
import java.util.List;
import o53.i0;
import ot0.g;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001Jg\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u0011JY\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\b\b\u0003\u0010\b\u001a\u00020\u00052\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\b\b\u0003\u0010\b\u001a\u00020\u00052\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'¢\u0006\u0004\b\u0018\u0010\u0017JI\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0003\u0010\b\u001a\u00020\u00052\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Llt0/d;", "", "", "startDate", "endDate", "", "showAvailableBadgeChallenge", "showAvailableVirtualChallenge", "showExclusiveChallenge", "", "metricId", "", "imageVersions", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "d", "(Ljava/lang/String;Ljava/lang/String;ZZZILjava/util/List;)Lo53/i0;", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lot0/g;", "filterTypes", "c", "(IILjava/util/List;ZLjava/util/List;)Lo53/i0;", "b", "a", "(IIZLjava/util/List;)Lo53/i0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @i83.f("mobile-gateway/challenge/v8/completed")
    i0<a0<c0>> a(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("showExclusiveChallenge") boolean showExclusiveChallenge, @t("image-version") List<String> imageVersions);

    @i83.f("mobile-gateway/challenge/v8/completed")
    i0<a0<c0>> b(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("challengeFilterType") List<g> filterTypes, @t("showExclusiveChallenge") boolean showExclusiveChallenge, @t("image-version") List<String> imageVersions);

    @i83.f("mobile-gateway/challenge/v8/noncompleted")
    i0<a0<c0>> c(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("challengeFilterType") List<g> filterTypes, @t("showExclusiveChallenge") boolean showExclusiveChallenge, @t("image-version") List<String> imageVersions);

    @i83.f("mobile-gateway/challenge/v9")
    i0<a0<c0>> d(@t("startDate") String startDate, @t("endDate") String endDate, @t("showAvailableBadgeChallenge") boolean showAvailableBadgeChallenge, @t("showAvailableVirtualChallenge") boolean showAvailableVirtualChallenge, @t("showExclusiveChallenge") boolean showExclusiveChallenge, @t("metricId") int metricId, @t("image-version") List<String> imageVersions);
}
