package nz1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import mp.c;
import o53.i0;
import oz1.b;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJD\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\t¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lnz1/a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Lc83/a0;", "", "Loz1/b;", "d", "(Lfz0/c;)Lo53/i0;", "", "displayName", "activityTypeId", "startDate", "endDate", "Lmp/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lmm1/b;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;Lfz0/c;)Lo53/i0;", "Lkr1/a;", "b", "", "nonSleepBufferMinutes", "Lkm1/c;", "c", "(Lfz0/c;I)Lo53/i0;", "Li41/b;", "f", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/activitylist-service/activities/list/{displayName}")
    Object a(@s("displayName") String str, @t("activityTypeId") String str2, @t("startTimestampLocal") String str3, @t("endTimestampLocal") String str4, d<? super a0<c>> dVar);

    @f("/usersummary-service/stats/stress/daily/{startDate}/{endDate}")
    i0<a0<List<kr1.a>>> b(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @f("/sleep-service/sleep/dailySleepData")
    i0<a0<km1.c>> c(@t("date") fz0.c date, @t("nonSleepBufferMinutes") int nonSleepBufferMinutes);

    @f("metrics-service/metrics/trainingreadiness/{calendarDate}")
    i0<a0<List<b>>> d(@s("calendarDate") fz0.c date);

    @f("/sleep-service/stats/sleep/daily/{startDate}/{endDate}")
    i0<a0<mm1.b>> e(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @f("hrv-service/hrv/{calendarDate}")
    i0<a0<i41.b>> f(@s("calendarDate") fz0.c date);
}
