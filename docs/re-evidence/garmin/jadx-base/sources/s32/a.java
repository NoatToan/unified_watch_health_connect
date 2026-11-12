package s32;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import o61.p;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\t\u0010\nJ@\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ls32/a;", "", "Lfz0/c;", "startDate", "", "", "sports", "Lc83/a0;", "Lo61/p;", "b", "(Lfz0/c;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "endDate", "c", "(Lfz0/c;Lfz0/c;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "a", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/metrics-service/metrics/maxmet/weekly/{startDate}/{endDate}")
    Object a(@s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, d<? super a0<List<p>>> dVar);

    @f("/metrics-service/metrics/maxmet/latest/{startDate}")
    Object b(@s("startDate") c cVar, @t("sport") List<String> list, d<? super a0<p>> dVar);

    @f("/metrics-service/metrics/maxmet/daily/{startDate}/{endDate}")
    Object c(@s("startDate") c cVar, @s("endDate") c cVar2, @t("sport") List<String> list, d<? super a0<List<p>>> dVar);
}
