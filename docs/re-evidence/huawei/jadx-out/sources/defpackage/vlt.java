package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vlt {
    private static void a(AnalyticsValue analyticsValue, Map<String, Object> map) {
        if (analyticsValue == null || map == null) {
            LogUtil.j("R_WeightBiUtils", "setEvent analyticsValue ", analyticsValue, " map ", map);
        } else {
            map.put("click", 1);
            lmf.d().c(BaseApplication.b(), analyticsValue.value(), map, 0);
        }
    }

    public static void b() {
        a(AnalyticsValue.HEALTH_HEALTH_WEIGHT_DETAIL_BIND_2030014, new HashMap(1));
    }

    public static void d(int i) {
        HashMap map = new HashMap(2);
        map.put("event", Integer.valueOf(i));
        a(AnalyticsValue.WEIGHT_PAGE_INPUT_DATA_2160122, map);
    }

    public static void a(int i, int i2, String[] strArr) {
        HashMap map = new HashMap(4);
        map.put("type", String.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        map.put("dataType", strArr);
        a(AnalyticsValue.HEALTH_HEALTH_WEIGHT_INPUT_2030017, map);
    }
}
