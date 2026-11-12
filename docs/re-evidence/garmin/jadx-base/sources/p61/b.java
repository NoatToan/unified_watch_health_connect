package p61;

import c83.a0;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import o61.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JS\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lp61/b;", "", "", "startDate", "endDate", "", "groupByParentActivityType", "", "metrics", "Lo53/i0;", "Lc83/a0;", "Lo61/k;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lo53/i0;", "activityId", "a", "(Ljava/lang/String;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @f("/activity-service/activity/{activityId}")
    i0<a0<String>> a(@s("activityId") String activityId);

    @f("/fitnessstats-service/activity/all")
    i0<a0<List<k>>> b(@t("startDate") String startDate, @t("endDate") String endDate, @t("groupByParentActivityType") boolean groupByParentActivityType, @t("metric") List<String> metrics);
}
