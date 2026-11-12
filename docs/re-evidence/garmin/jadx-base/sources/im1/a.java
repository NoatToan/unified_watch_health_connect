package im1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.k;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import km1.c;
import km1.v;
import mm1.b;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\nJ%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%JC\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u00182\b\b\u0001\u0010(\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u0018H'¢\u0006\u0004\b+\u0010,¨\u0006-À\u0006\u0003"}, d2 = {"Lim1/a;", "", "Lfz0/c;", "date", "", "nonSleepBufferMinutes", "Lo53/i0;", "Lc83/a0;", "Lkm1/c;", "c", "(Lfz0/c;I)Lo53/i0;", "startDate", "endDate", "Lmm1/b;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;Lfz0/c;)Lo53/i0;", "weekCount", "Lmm1/f;", "m", "Lkm1/v;", "sleepData", "", IntegerTokenConverter.CONVERTER_KEY, "(Lkm1/v;)Lo53/i0;", "", "sleepId", "g", "(JLkm1/v;)Lo53/i0;", "Ljm1/a;", "sleepNote", "j", "(Lfz0/c;Ljm1/a;)Lo53/i0;", "f", "(Lfz0/c;)Lo53/i0;", "Lkm1/b;", "dailyNap", "h", "(Lkm1/b;)Lo53/i0;", "calendarDate", "napStartTimeInMilliseconds", "napEndTimeInMilliseconds", JWKParameterNames.OCT_KEY_VALUE, "(Lfz0/c;JJLkm1/b;)Lo53/i0;", "l", "(Lfz0/c;J)Lo53/i0;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/sleep-service/sleep/dailySleepData")
    i0<a0<c>> c(@t("date") fz0.c date, @t("nonSleepBufferMinutes") int nonSleepBufferMinutes);

    @f("/sleep-service/stats/sleep/daily/{startDate}/{endDate}")
    i0<a0<b>> e(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.b("/sleep-service/sleep/dailySleep/{date}/note")
    i0<a0<Unit>> f(@s("date") fz0.c date);

    @k({"Content-Type: application/json"})
    @p("/sleep-service/sleep/dailySleep/{sleepId}")
    i0<a0<Unit>> g(@s("sleepId") long sleepId, @i83.a v sleepData);

    @o("/sleep-service/sleep/nap")
    i0<a0<Unit>> h(@i83.a km1.b dailyNap);

    @k({"Content-Type: application/json"})
    @o("/sleep-service/sleep/dailySleep")
    i0<a0<Unit>> i(@i83.a v sleepData);

    @p("/sleep-service/sleep/dailySleep/{date}/note")
    i0<a0<Unit>> j(@s("date") fz0.c date, @i83.a jm1.a sleepNote);

    @p("/sleep-service/sleep/nap/{calendarDate}/{napStartTimeInMilliseconds}/{napEndTimeInMilliseconds}")
    i0<a0<Unit>> k(@s("calendarDate") fz0.c calendarDate, @s("napStartTimeInMilliseconds") long napStartTimeInMilliseconds, @s("napEndTimeInMilliseconds") long napEndTimeInMilliseconds, @i83.a km1.b dailyNap);

    @i83.b("/sleep-service/sleep/nap/{calendarDate}/{napStartTimeInMilliseconds}")
    i0<a0<Unit>> l(@s("calendarDate") fz0.c calendarDate, @s("napStartTimeInMilliseconds") long napStartTimeInMilliseconds);

    @f("/sleep-service/stats/sleep/weekly/{endDate}/{weekCount}")
    i0<a0<mm1.f>> m(@s("endDate") fz0.c endDate, @s("weekCount") int weekCount);
}
