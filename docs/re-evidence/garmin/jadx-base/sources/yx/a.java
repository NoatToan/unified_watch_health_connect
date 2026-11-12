package yx;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\b¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lyx/a;", "", "", "eventUuid", "Lo53/i0;", "Lc83/a0;", "", "c", "(Ljava/lang/String;)Lo53/i0;", "d", "Ldy/a;", "b", "", "eventId", "a", "(J)Lo53/i0;", "calendarUserPref", "Lxx/f;", "calendarUserPrefDTO", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Lxx/f;)Lo53/i0;", "f", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("calendar-service/event/{eventId}")
    i0<a0<dy.a>> a(@s("eventId") long eventId);

    @f("/calendar-service/event/{eventUuid}/shareable")
    i0<a0<dy.a>> b(@s("eventUuid") String eventUuid);

    @o("/calendar-service/event/{eventUuid}/subscription")
    i0<a0<Unit>> c(@s("eventUuid") String eventUuid);

    @i83.b("/calendar-service/event/{eventUuid}/subscription")
    i0<a0<Unit>> d(@s("eventUuid") String eventUuid);

    @p("/userpreference-service/{calendarUserPref}")
    i0<a0<xx.f>> e(@s("calendarUserPref") String calendarUserPref, @i83.a xx.f calendarUserPrefDTO);

    @f("/userpreference-service/{calendarUserPref}")
    i0<a0<xx.f>> f(@s("calendarUserPref") String calendarUserPref);
}
