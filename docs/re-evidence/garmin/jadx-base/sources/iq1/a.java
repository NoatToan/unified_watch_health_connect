package iq1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import jq1.j;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ9\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0012H'¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019À\u0006\u0003"}, d2 = {"Liq1/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "Ljq1/c;", "d", "(Lfz0/c;)Lo53/i0;", "", "Ljq1/f;", "a", "startDate", "endDate", "currentDate", "Ljq1/a;", "b", "(Lfz0/c;Lfz0/c;Lfz0/c;)Lo53/i0;", "", "numOfWeeks", "Ljq1/j;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;I)Lo53/i0;", "numOfMonths", "c", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("wellness-service/wellness/dailySummaryChart")
    i0<a0<List<jq1.f>>> a(@t("date") c date);

    @f("/usersummary-service/stats/daily/{startDate}/{endDate}?statsType=STEPS")
    i0<a0<jq1.a>> b(@s("startDate") c startDate, @s("endDate") c endDate, @t("currentDate") c currentDate);

    @f("/usersummary-service/stats/steps/monthly/{startDate}/{numOfMonths}")
    i0<a0<List<j>>> c(@s("startDate") c startDate, @s("numOfMonths") int numOfMonths);

    @f("mobile-gateway/usersummary/daily/{date}")
    i0<a0<jq1.c>> d(@s("date") c date);

    @f("/usersummary-service/stats/steps/weekly/{endDate}/{numOfWeeks}")
    i0<a0<List<j>>> e(@s("endDate") c endDate, @s("numOfWeeks") int numOfWeeks);
}
