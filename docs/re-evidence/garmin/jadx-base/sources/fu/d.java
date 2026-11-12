package fu;

import c83.a0;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JZ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lfu/d;", "", "", "startDate", "endDate", "activityType", "", "metrics", "", "standardizedUnits", "groupByParentActivityType", "Lc83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLt13/d;)Ljava/lang/Object;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {
    @i83.f("/fitnessstats-service/activity/all")
    Object a(@t("startDate") String str, @t("endDate") String str2, @t("activityType") String str3, @t("metric") List<String> list, @t("standardizedUnits") boolean z14, @t("groupByParentActivityType") boolean z15, t13.d<? super a0<String>> dVar);
}
