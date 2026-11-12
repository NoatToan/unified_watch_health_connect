package ir;

import am.w0;
import c83.a0;
import i83.s;
import i83.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JJ\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lir/b;", "", "", "uuid", "displayName", "", "groupByParentActivityType", "", "metrics", "Lc83/a0;", "Lam/w0;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lt13/d;)Ljava/lang/Object;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.f("/fitnessstats-service/activity/multi-day-activity/{uuid}/lifetime-stats/{displayName}")
    Object a(@s("uuid") String str, @s("displayName") String str2, @t("groupByParentActivityType") boolean z14, @t("metric") List<String> list, t13.d<? super a0<List<w0>>> dVar);
}
