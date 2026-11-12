package on;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lon/k;", "", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lfz0/c;", "until", "Lo53/i0;", "Lc83/a0;", "", "Lsn/h;", "f", "(IILfz0/c;)Lo53/i0;", "", "activityId", "calendarDate", "c", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", "d", "Lsn/b;", "b", "(Ljava/lang/String;)Lo53/i0;", "Lrn/a;", "name", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ljava/lang/String;Lrn/a;)Lo53/i0;", "Lrn/b;", "notes", "a", "(Ljava/lang/String;Ljava/lang/String;Lrn/b;)Lo53/i0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k {
    @i83.n(" /wellnessactivity-service/activity/{calendarDate}/{uuid}/notes")
    i0<a0<rn.b>> a(@s("uuid") String activityId, @s("calendarDate") String calendarDate, @i83.a rn.b notes);

    @i83.f("/wellnessactivity-service/activity/epoch/{uuid}")
    i0<a0<sn.b>> b(@s("uuid") String activityId);

    @i83.f("/wellnessactivity-service/activity/summary/{calendarDate}/{uuid}")
    i0<a0<sn.h>> c(@s("uuid") String activityId, @s("calendarDate") String calendarDate);

    @i83.b(" /wellnessactivity-service/activity/{calendarDate}/{uuid}")
    i0<a0<Unit>> d(@s("uuid") String activityId, @s("calendarDate") String calendarDate);

    @i83.n(" /wellnessactivity-service/activity/{calendarDate}/{uuid}/name")
    i0<a0<rn.a>> e(@s("uuid") String activityId, @s("calendarDate") String calendarDate, @i83.a rn.a name);

    @i83.f("/wellnessactivity-service/activity/summary/list?")
    i0<a0<List<sn.h>>> f(@t(TtmlNode.START) int start, @t(MapboxMap.QFE_LIMIT) int limit, @t("until") fz0.c until);
}
