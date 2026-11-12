package u71;

import c83.a0;
import fz0.c;
import i83.f;
import i83.t;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lu71/a;", "", "Lfz0/c;", "date", "Lc83/a0;", "Ln61/c;", "a", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "startDate", "endDate", "", "aggregation", "Ln61/f;", "b", "(Lfz0/c;Lfz0/c;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("metrics-service/metrics/endurancescore")
    Object a(@t("calendarDate") c cVar, d<? super a0<n61.c>> dVar);

    @f("metrics-service/metrics/endurancescore/stats")
    Object b(@t("startDate") c cVar, @t("endDate") c cVar2, @t("aggregation") String str, d<? super a0<n61.f>> dVar);
}
