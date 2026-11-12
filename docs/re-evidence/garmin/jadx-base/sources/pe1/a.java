package pe1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qe1.g;
import qe1.h;
import qe1.i;
import qe1.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u0004H'¢\u0006\u0004\b\u0015\u0010\u0013J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0014H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lpe1/a;", "", "Lfz0/f;", "calendarDate", "Lo53/i0;", "Lc83/a0;", "Lqe1/g;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/f;)Lo53/i0;", "startDate", "endDate", "", "Lqe1/h;", "f", "(Lfz0/f;Lfz0/f;)Lo53/i0;", "Lqe1/j;", "d", "Lqe1/i;", "a", "()Lo53/i0;", "Lte1/a;", "c", "runningEconomyPreferences", "", "b", "(Lte1/a;)Lo53/i0;", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/web-data/runningEconomy/runningEconomyRanges_837f7b0f-9048-403f-b160-4d41ab3354b7.json")
    i0<a0<i>> a();

    @o("/userpreference-service/")
    i0<a0<Unit>> b(@i83.a te1.a runningEconomyPreferences);

    @f("/userpreference-service/runningeconomy.gc5.banner.dismissed/")
    i0<a0<te1.a>> c();

    @f("/metrics-service/metrics/runningeconomy/weekly")
    i0<a0<List<j>>> d(@t("startDate") fz0.f startDate, @t("endDate") fz0.f endDate);

    @f("/metrics-service/metrics/runningeconomy/latest/{calendarDate}")
    i0<a0<g>> e(@s("calendarDate") fz0.f calendarDate);

    @f("/metrics-service/metrics/runningeconomy/daily")
    i0<a0<List<h>>> f(@t("startDate") fz0.f startDate, @t("endDate") fz0.f endDate);
}
