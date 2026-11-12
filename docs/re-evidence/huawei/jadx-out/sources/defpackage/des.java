package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class des {
    public static void a(Context context, int i, boolean z, boolean z2, int i2) {
        if (context == null) {
            LogUtil.j("Track_SportAutoTrackCommonUtils", "setAutoTrackConfigInfoBi context is null");
            return;
        }
        if (i == 0) {
            LogUtil.j("Track_SportAutoTrackCommonUtils", "setAutoTrackConfigInfoBi launchSourceType is error");
            return;
        }
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        if (z) {
            map.put("event", Integer.valueOf(z2 ? 1 : 2));
        } else {
            map.put("event", 3);
        }
        if (z2) {
            map.put("distance", Integer.valueOf(i2));
        }
        map.put("units", UnitUtil.f() ? "mile" : "kilometer");
        lmf.d().c(context, AnalyticsValue.HEALTH_AUTO_TRACK_TOGGLE_1040073.value(), map, 0);
    }
}
