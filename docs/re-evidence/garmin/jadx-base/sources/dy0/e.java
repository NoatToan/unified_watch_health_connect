package dy0;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import o61.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00050\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00060\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00060\u00050\n2\b\b\u0001\u0010\u0003\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u000eH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Ldy0/e;", "", "Lfz0/c;", "startDate", "endDate", "Lc83/a0;", "", "Lo61/p;", "f", "(Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Lo53/i0;", "Loz1/b;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;Lfz0/c;)Lo53/i0;", "", "displayName", "fromCalendarDate", "toCalendarDate", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "d", "(Ljava/lang/String;Lfz0/c;Lfz0/c;)Lo53/i0;", "aggregation", "Ln61/f;", "b", "(Lfz0/c;Lfz0/c;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lr61/a;", "a", "(Ljava/lang/String;Lfz0/c;Lfz0/c;Lt13/d;)Ljava/lang/Object;", "Lx61/e;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @i83.f("/metrics-service/metrics/racepredictions/daily/{displayName}")
    Object a(@s("displayName") String str, @t("fromCalendarDate") fz0.c cVar, @t("toCalendarDate") fz0.c cVar2, t13.d<? super a0<List<r61.a>>> dVar);

    @i83.f("/metrics-service/metrics/endurancescore/stats")
    Object b(@t("startDate") fz0.c cVar, @t("endDate") fz0.c cVar2, @t("aggregation") String str, t13.d<? super a0<n61.f>> dVar);

    @i83.f("/metrics-service/metrics/heataltitudeacclimation/daily/{startDate}/{endDate}")
    i0<a0<List<x61.e>>> c(@s("startDate") String startDate, @s("endDate") String endDate);

    @i83.f("/metrics-service/metrics/trainingstatus/weekly/{displayName}")
    i0<a0<TrainingStatusReportDTO>> d(@s("displayName") String displayName, @t("fromCalendarDate") fz0.c fromCalendarDate, @t("toCalendarDate") fz0.c toCalendarDate);

    @i83.f("/metrics-service/metrics/trainingreadiness/{startDate}/{endDate}")
    i0<a0<List<oz1.b>>> e(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.f("/metrics-service/metrics/maxmet/daily/{startDate}/{endDate}")
    Object f(@s("startDate") fz0.c cVar, @s("endDate") fz0.c cVar2, t13.d<? super a0<List<p>>> dVar);
}
