package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vbw {
    public static void a(int i) {
        Context contextB = BaseApplication.b();
        HashMap map = new HashMap(16);
        if (i == 1) {
            map.put("click", "1");
            map.put("from", "1");
            lmf.d().c(contextB, AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_DETAIL_RECORD_2030020.value(), map, 0);
            return;
        }
        if (i == 2) {
            map.put("click", "1");
            map.put("from", "1");
            lmf.d().c(contextB, AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_DETAIL_MEASURE_2030023.value(), map, 0);
            return;
        }
        if (i == 3) {
            String strValue = AnalyticsValue.BLOOD_PRESSURE_DETAIL_MEASURE_2040205.value();
            map.put("click", "1");
            map.put("from", "1");
            map.put("type", 2);
            lmf.d().c(contextB, strValue, map, 0);
            return;
        }
        if (i == 4) {
            String strValue2 = AnalyticsValue.BLOOD_PRESSURE_DETAIL_MEASURE_2040205.value();
            map.put("click", "1");
            map.put("from", "1");
            map.put("type", 1);
            lmf.d().c(contextB, strValue2, map, 0);
            return;
        }
        LogUtil.a("BloodPressureBiUtils", "no eventId match");
    }
}
