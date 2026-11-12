package sv1;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import i83.f;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;
import vv1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lsv1/a;", "", "", "displayName", "fromCalendarDate", "toCalendarDate", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Lvv1/d;", "a", "(Ljava/lang/String;)Lo53/i0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/metrics-service/metrics/racepredictions/latest/{displayName}")
    i0<a0<d>> a(@s("displayName") String displayName);

    @f("/metrics-service/metrics/trainingstatus/weekly/{displayName}")
    i0<a0<TrainingStatusReportDTO>> b(@s("displayName") String displayName, @t("fromCalendarDate") String fromCalendarDate, @t("toCalendarDate") String toCalendarDate);
}
