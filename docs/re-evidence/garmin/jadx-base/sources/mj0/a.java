package mj0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.newmodel.l0;
import i83.f;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lmj0/a;", "", "", "connectActivityId", "maxChartSize", "", "tankIndex", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "a", "(JLjava/lang/Long;Ljava/lang/String;)Lo53/i0;", "Lps/i0;", "b", "(JLjava/lang/Long;)Lo53/i0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("diving/v1/dive/detail/tanksensor")
    i0<a0<l0>> a(@t("connectActivityId") long connectActivityId, @t("maxChartSize") Long maxChartSize, @t("tankIndex") String tankIndex);

    @f("diving/v1/dive/detail/by/connectid/{connectActivityId}")
    i0<a0<ps.i0>> b(@s("connectActivityId") long connectActivityId, @t("maxChartSize") Long maxChartSize);
}
