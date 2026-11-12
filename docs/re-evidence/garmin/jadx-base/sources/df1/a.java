package df1;

import c83.a0;
import ef1.b;
import ef1.c;
import ef1.d;
import i83.f;
import i83.o;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u000fH'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ldf1/a;", "", "Lfz0/f;", "startDate", "endDate", "", "aggregation", "Lo53/i0;", "Lc83/a0;", "", "Lef1/b;", "b", "(Lfz0/f;Lfz0/f;Ljava/lang/String;)Lo53/i0;", "Lef1/d;", "d", "Lef1/c;", "c", "()Lo53/i0;", "runningTolerancePreferences", "", "a", "(Lef1/c;)Lo53/i0;", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/userpreference-service/")
    i0<a0<Unit>> a(@i83.a c runningTolerancePreferences);

    @f("/metrics-service/metrics/runningtolerance/stats")
    i0<a0<List<b>>> b(@t("startDate") fz0.f startDate, @t("endDate") fz0.f endDate, @t("aggregation") String aggregation);

    @f("/userpreference-service/runningtolerance.gc5.banner.dismissed/")
    i0<a0<c>> c();

    @f("/metrics-service/metrics/runningtolerance/stats")
    i0<a0<List<d>>> d(@t("startDate") fz0.f startDate, @t("endDate") fz0.f endDate, @t("aggregation") String aggregation);
}
