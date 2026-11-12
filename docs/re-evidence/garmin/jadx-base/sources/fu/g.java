package fu;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.trainingload.model.ExerciseLoadRecordDto;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013JS\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\n0\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lfu/g;", "", "", "metric", "activityType", "", "groupByParentActivityType", "aggregation", "excludedActivitySubType", "Lo53/i0;", "Lc83/a0;", "", "Lo61/c;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lo53/i0;", "startDate", "endDate", "standardizedUnits", "Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lo53/i0;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73490a = a.f73491a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu/g$a;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f73491a = new a();

        private a() {
        }
    }

    @i83.f("/fitnessstats-service/activity/all")
    i0<a0<List<ExerciseLoadRecordDto>>> a(@t("startDate") String startDate, @t("endDate") String endDate, @t("metric") List<String> metric, @t("standardizedUnits") boolean standardizedUnits);

    @i83.f("/fitnessstats-service/activity/all")
    i0<a0<List<o61.c>>> b(@t("metric") String metric, @t("activityType") String activityType, @t("groupByParentActivityType") boolean groupByParentActivityType, @t("aggregation") String aggregation, @t("excludedActivitySubType") String excludedActivitySubType);
}
