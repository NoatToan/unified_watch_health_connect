package zm0;

import c83.a0;
import com.garmin.android.apps.connectmobile.leaderboard.model.d0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import i83.f;
import i83.s;
import i83.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001Jf\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lzm0/b;", "", "", "groupId", "", "relationship", "", "metricId", "actTypeId", "startDate", "endDate", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "b", "(JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "a", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILt13/d;)Ljava/lang/Object;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("usersummary-service/stats/wellness/group/leaderboard/{groupId}/{relationship}")
    Object a(@s("groupId") long j8, @s("relationship") String str, @t("metricId") int i14, @t("startDate") String str2, @t("endDate") String str3, @t(TtmlNode.START) int i15, @t(MapboxMap.QFE_LIMIT) int i16, t13.d<? super a0<d0>> dVar);

    @f("/fitnessstats-service/activity/leaderboard/v2/group/{groupId}/{relationship}")
    Object b(@s("groupId") long j8, @s("relationship") String str, @t("metricId") int i14, @t("actTypeId") int i15, @t("startDate") String str2, @t("endDate") String str3, @t(TtmlNode.START) int i16, @t(MapboxMap.QFE_LIMIT) int i17, t13.d<? super a0<d0>> dVar);
}
