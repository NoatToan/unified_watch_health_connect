package x60;

import c83.a0;
import fz0.c;
import i83.f;
import i83.t;
import j61.i;
import j61.j;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lx60/a;", "", "Lc83/a0;", "Lj61/i;", "b", "(Lt13/d;)Ljava/lang/Object;", "Lfz0/c;", "startDate", "endDate", "", "aggregation", "Lj61/j;", "a", "(Lfz0/c;Lfz0/c;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gcm-cycling-ability_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/metrics-service/metrics/cycling-ability")
    Object a(@t("startDate") c cVar, @t("endDate") c cVar2, @t("aggregation") String str, d<? super a0<j>> dVar);

    @f("/metrics-service/metrics/cycling-ability/latest")
    Object b(d<? super a0<i>> dVar);
}
