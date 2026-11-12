package a61;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.performance.dto.StrengthStatsDto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJR\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\fH§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"La61/b;", "", "Lfz0/c;", "startDate", "endDate", "Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/StrengthStatsDto;", "a", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "", "displayName", "", "activityTypeId", "Lfz0/e;", "startTimestampLocal", "endTimestampLocal", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "b", "(Ljava/lang/String;ILfz0/e;Lfz0/e;IILt13/d;)Ljava/lang/Object;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.f("/fitnessstats-service/fitnessstats/activity/exercises/monthly/strength_training")
    Object a(@i83.t("startDate") fz0.c cVar, @i83.t("endDate") fz0.c cVar2, t13.d<? super c83.a0<List<StrengthStatsDto>>> dVar);

    @i83.f("/activitylist-service/activities/list/{displayName}")
    Object b(@i83.s("displayName") String str, @i83.t("activityTypeId") int i14, @i83.t("startTimestampLocal") fz0.e eVar, @i83.t("endTimestampLocal") fz0.e eVar2, @i83.t(TtmlNode.START) int i15, @i83.t(MapboxMap.QFE_LIMIT) int i16, t13.d<? super c83.a0<ActivityListDTO>> dVar);
}
