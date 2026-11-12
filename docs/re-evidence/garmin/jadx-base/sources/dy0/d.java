package dy0;

import c83.a0;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJC\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012À\u0006\u0003"}, d2 = {"Ldy0/d;", "", "Lfz0/c;", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "Lcy0/s;", "c", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "", "statsType", "currentDate", "Lcy0/d;", "a", "(Lfz0/c;Lfz0/c;Ljava/lang/String;Lfz0/c;)Lo53/i0;", "Lmm1/b;", "b", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @i83.f("/usersummary-service/stats/daily/aggregated/{startDate}/{endDate}")
    i0<a0<cy0.d>> a(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate, @t("statsType") String statsType, @t("currentDate") fz0.c currentDate);

    @i83.f("/sleep-service/stats/sleep/overall/{startDate}/{endDate}")
    i0<a0<mm1.b>> b(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.f("/usersummary-service/stats/heartRate/overall/{startDate}/{endDate}")
    i0<a0<cy0.s>> c(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);
}
