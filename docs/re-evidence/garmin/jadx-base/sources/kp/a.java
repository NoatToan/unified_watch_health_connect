package kp;

import c83.a0;
import i83.b;
import i83.f;
import i83.s;
import i83.t;
import java.util.List;
import mp.c;
import mp.n;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJx\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\f2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0082\u0001\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lkp/a;", "", "", "displayName", "activityTypeId", "startDate", "endDate", "Lc83/a0;", "Lmp/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "aggregation", "", "groupByParentActivityType", "groupByActivityType", "", "activityTypes", "standardizedUnits", "metrics", "Lmp/n;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZLjava/util/List;Lt13/d;)Ljava/lang/Object;", "userFirstDay", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZLjava/lang/String;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "", "activityId", "", "b", "(JLt13/d;)Ljava/lang/Object;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/activitylist-service/activities/list/{displayName}")
    Object a(@s("displayName") String str, @t("activityTypeId") String str2, @t("startTimestampLocal") String str3, @t("endTimestampLocal") String str4, d<? super a0<c>> dVar);

    @b("/activity-service/activity/{activityId}")
    Object b(@s("activityId") long j8, d<? super a0<Unit>> dVar);

    @f("/fitnessstats-service/activity")
    Object c(@t("startDate") String str, @t("endDate") String str2, @t("aggregation") String str3, @t("groupByParentActivityType") boolean z14, @t("groupByActivityType") boolean z15, @t("activityType") List<String> list, @t("standardizedUnits") boolean z16, @t("userFirstDay") String str4, @t("metric") List<String> list2, d<? super a0<List<n>>> dVar);

    @f("/fitnessstats-service/activity")
    Object d(@t("startDate") String str, @t("endDate") String str2, @t("aggregation") String str3, @t("groupByParentActivityType") boolean z14, @t("groupByActivityType") boolean z15, @t("activityType") List<String> list, @t("standardizedUnits") boolean z16, @t("metric") List<String> list2, d<? super a0<List<n>>> dVar);
}
