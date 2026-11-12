package dy0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import cy0.h;
import cy0.j;
import cy0.k;
import cy0.l;
import cy0.n;
import cy0.q;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00060\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0014JC\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u0012H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0012H'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0014J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010\u0014J+\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u0014J5\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\u000e\b\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\rH'¢\u0006\u0004\b&\u0010'J/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020(H'¢\u0006\u0004\b+\u0010,J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010\tJ5\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\u000e\b\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b0\u0010'J+\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\r0\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u0014¨\u00063À\u0006\u0003"}, d2 = {"Ldy0/f;", "", "", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "Lcy0/h;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "", "Lcy0/q;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "uuid", "Lcy0/k;", "g", "(Ljava/lang/String;)Lo53/i0;", "Lcy0/n;", "j", "Lps/m;", "b", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lo53/i0;", "multiDayActivityDTO", "c", "(Lcy0/k;)Lo53/i0;", "a", "(Ljava/lang/String;Lcy0/k;)Lo53/i0;", "", "f", "Lcy0/m;", "d", "Lcy0/l;", "o", "notes", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Ljava/util/List;)Lo53/i0;", "Lokhttp3/MultipartBody$Part;", "file", "Lcy0/o;", "l", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lo53/i0;", "mediaUuid", "h", "mediaUUIDs", "m", "Lcy0/j;", JWKParameterNames.RSA_MODULUS, "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface f {
    @p("/multidayactivity-service/multi-day-activity/{uuid}")
    i0<a0<h>> a(@s("uuid") String uuid, @i83.a k multiDayActivityDTO);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}/activities/mapdetails")
    i0<a0<List<m>>> b(@s("uuid") String uuid, @t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit);

    @o("/multidayactivity-service/multi-day-activity")
    i0<a0<k>> c(@i83.a k multiDayActivityDTO);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}/activities/elevation")
    i0<a0<cy0.m>> d(@s("uuid") String uuid);

    @i83.f("/multidayactivity-service/multi-day-activity/list")
    i0<a0<List<q>>> e(@t(TtmlNode.START) Integer start, @t(MapboxMap.QFE_LIMIT) Integer limit);

    @i83.b("/multidayactivity-service/multi-day-activity/{uuid}")
    i0<a0<Unit>> f(@s("uuid") String uuid);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}")
    i0<a0<k>> g(@s("uuid") String uuid);

    @i83.b("/multidayactivity-service/multi-day-activity/{uuid}/image/{mediaUUID}")
    i0<a0<Unit>> h(@s("uuid") String uuid, @s("mediaUUID") String mediaUuid);

    @i83.f("/multidayactivity-service/multi-day-activity/validate/daterange")
    i0<a0<h>> i(@t("startDate") String startDate, @t("endDate") String endDate);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}/activities")
    i0<a0<List<n>>> j(@s("uuid") String uuid);

    @i83.k({"Content-Type: application/json"})
    @i83.n("/multidayactivity-service/multi-day-activity/{uuid}/daily-notes")
    i0<a0<Unit>> k(@s("uuid") String uuid, @i83.a List<l> notes);

    @o("/multidayactivity-service/multi-day-activity/{uuid}/image")
    @i83.l
    i0<a0<cy0.o>> l(@s("uuid") String uuid, @i83.q MultipartBody.Part file);

    @i83.k({"Content-Type: application/json"})
    @p("/multidayactivity-service/multi-day-activity/{uuid}/images/reorder")
    i0<a0<Unit>> m(@s("uuid") String uuid, @i83.a List<String> mediaUUIDs);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}/liveTrackSessions")
    i0<a0<List<j>>> n(@s("uuid") String uuid);

    @i83.f("/multidayactivity-service/multi-day-activity/{uuid}/daily-notes")
    i0<a0<List<l>>> o(@s("uuid") String uuid);
}
