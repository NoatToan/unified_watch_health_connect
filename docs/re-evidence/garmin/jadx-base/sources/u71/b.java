package u71;

import c83.a0;
import fz0.c;
import i83.f;
import i83.t;
import java.util.List;
import n61.i;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lu71/b;", "", "Lfz0/c;", "calendarDate", "Lc83/a0;", "", "Ln61/i;", "a", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "startDate", "endDate", "b", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("metrics-service/metrics/stamina-curve/latest")
    Object a(@t("calendarDate") c cVar, d<? super a0<List<i>>> dVar);

    @f("metrics-service/metrics/stamina-curve/earliest-and-latest")
    Object b(@t("startDate") c cVar, @t("endDate") c cVar2, d<? super a0<List<i>>> dVar);
}
