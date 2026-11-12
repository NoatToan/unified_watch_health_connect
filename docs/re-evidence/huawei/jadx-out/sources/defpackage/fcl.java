package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class fcl {
    public static void b() {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "Personalized_recommendation_0001");
        map.put("event", 0);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map.put("entrance", "e1");
        map.put("moduleName", "main_page");
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_DATA_AUTHORITY_H1000010.value(), map, 0);
    }

    public static void d(String str, String str2) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", str);
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, str2);
        map.put("entrance", "e1");
        map.put("moduleName", "main_page");
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_DATA_AUTHORITY_H1000010.value(), map, 0);
    }
}
