package lw;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\bJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\nH'¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\nH'¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\nH'¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Llw/a;", "", "Lpw/a;", "bloodPressure", "Lo53/i0;", "Lc83/a0;", "", JWKParameterNames.RSA_EXPONENT, "(Lpw/a;)Lo53/i0;", "c", "Lfz0/c;", "calendarDate", "", "selectedVersion", "d", "(Lfz0/c;J)Lo53/i0;", "Lkw/o;", "f", "(Lfz0/c;)Lo53/i0;", "startDate", "endDate", "", "h", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "Lkw/h;", "g", "b", "Lc83/d;", "", "a", "()Lc83/d;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("bloodpressure-service/bloodpressure/category/level")
    c83.d<String> a();

    @i83.f("bloodpressure-service/bloodpressure/weeklyRange/{startDate}\u200b/{endDate}")
    i0<kw.h> b(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @p("bloodpressure-service/bloodpressure")
    i0<a0<Unit>> c(@i83.a pw.a bloodPressure);

    @i83.b("bloodpressure-service/bloodpressure/{calendarDate}/{selectedVersion}")
    i0<a0<Unit>> d(@s("calendarDate") fz0.c calendarDate, @s("selectedVersion") long selectedVersion);

    @o("bloodpressure-service/bloodpressure")
    i0<a0<Unit>> e(@i83.a pw.a bloodPressure);

    @i83.f("bloodpressure-service/bloodpressure/dayview/{calendarDate}")
    i0<kw.o> f(@s("calendarDate") fz0.c calendarDate);

    @i83.f("bloodpressure-service/bloodpressure/range/{startDate}/{endDate}")
    i0<kw.h> g(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.f("bloodpressure-service/bloodpressure/daily/last/{startDate}/{endDate}")
    i0<a0<List<pw.a>>> h(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);
}
