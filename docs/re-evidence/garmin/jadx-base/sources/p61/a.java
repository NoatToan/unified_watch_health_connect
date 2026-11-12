package p61;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import com.garmin.android.apps.connectmobile.performance.model.StressScoresSummaryDTO;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\nJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\nJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lp61/a;", "", "", "startDate", "endDate", "Lo53/i0;", "Lc83/a0;", "", "Lx61/e;", "c", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO;", "b", "Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "a", "d", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/mobile-gateway/usersummary/trainingstatus/weekly/{startDate}/{endDate}")
    i0<a0<TrainingStatusReportDTO>> a(@s("startDate") String startDate, @s("endDate") String endDate);

    @f("/metrics-service/metrics/manualstresslevel/daily/{startDate}/{endDate}")
    i0<a0<StressScoresSummaryDTO>> b(@s("startDate") String startDate, @s("endDate") String endDate);

    @f("/metrics-service/metrics/heataltitudeacclimation/daily/{startDate}/{endDate}")
    i0<a0<List<x61.e>>> c(@s("startDate") String startDate, @s("endDate") String endDate);

    @f("/mobile-gateway/usersummary/trainingstatus/monthly/{startDate}/{endDate}")
    i0<a0<TrainingStatusReportDTO>> d(@s("startDate") String startDate, @s("endDate") String endDate);

    @f("/mobile-gateway/usersummary/trainingstatus/latest/{startDate}")
    i0<a0<CurrentTrainingStatusDTO>> e(@s("startDate") String startDate);
}
