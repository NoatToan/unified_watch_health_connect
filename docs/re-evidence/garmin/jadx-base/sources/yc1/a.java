package yc1;

import c83.a0;
import fz0.c;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lyc1/a;", "", "", "displayName", "Lc83/a0;", "Lr61/a;", "c", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lfz0/c;", "fromCalendarDate", "toCalendarDate", "", "a", "(Ljava/lang/String;Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "b", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/metrics-service/metrics/racepredictions/daily/{displayName}")
    Object a(@s("displayName") String str, @t("fromCalendarDate") c cVar, @t("toCalendarDate") c cVar2, d<? super a0<List<r61.a>>> dVar);

    @f("/metrics-service/metrics/racepredictions/monthly/{displayName}")
    Object b(@s("displayName") String str, @t("fromCalendarDate") c cVar, @t("toCalendarDate") c cVar2, d<? super a0<List<r61.a>>> dVar);

    @f("/metrics-service/metrics/racepredictions/latest/{displayName}")
    Object c(@s("displayName") String str, d<? super a0<r61.a>> dVar);
}
