package defpackage;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bue {
    public static void c(Context context) {
        HashMap map = new HashMap();
        map.put("pageId", "Sport_258");
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "card_click");
        map.put(ParamConstants.Param.VIEW_TYPE, "enabled_status");
        map.put("planType", "running_training");
        map.put("moduleName", "plan_progress");
        map.put(BleConstants.SPORT_TYPE, BleConstants.SPORT_TYPE_RUN);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, "Sport_258");
        map.put("pullOrder", "2");
        lmf.d().c(context, AnalyticsValue.CLICK_INTELLIGENT_TRAINING_PLAN_H8000002.value(), map, 0);
    }

    public static void e(Context context, int i, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("pageId", "Sport_258");
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        if (str3 != null && !str3.isEmpty()) {
            map.put("value", str2);
        }
        map.put(ParamConstants.Param.VIEW_TYPE, str3);
        map.put("moduleName", "main_page");
        map.put(BleConstants.SPORT_TYPE, BleConstants.SPORT_TYPE_RUN);
        lmf.d().c(context, AnalyticsValue.CLICK_MY_COMPETITION_H4000001.value(), map, 0);
    }
}
