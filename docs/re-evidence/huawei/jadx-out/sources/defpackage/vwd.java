package defpackage;

import android.text.TextUtils;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.utils.WebViewHelp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vwd {
    public static void d(int i, String str, String str2, String[] strArr, String[] strArr2) {
        lmn lmnVar = new lmn();
        b(lmnVar, "Personalized_recommendation_0001", "PrivacyCenterActivity");
        e(lmnVar, i, str, str2);
        for (int i2 = 0; i2 < strArr.length && i2 < strArr2.length; i2++) {
            a(lmnVar, strArr[i2], strArr2[i2]);
        }
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.PERSONALIZED_RECOMMENDATION_H20400010001.value(), lmnVar, 0);
    }

    public static void c(int i, String str, String str2, String[] strArr, String[] strArr2) {
        lmn lmnVar = new lmn();
        b(lmnVar, "Personalized_recommendation_0004", "ContentRecommendActivity");
        e(lmnVar, i, str, str2);
        for (int i2 = 0; i2 < strArr.length && i2 < strArr2.length; i2++) {
            a(lmnVar, strArr[i2], strArr2[i2]);
        }
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.MY_LIKE_H20400010004.value(), lmnVar, 0);
    }

    private static void b(lmn lmnVar, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("pageId", str);
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put(WebViewHelp.BI_KEY_PULL_FROM, str2);
        lmnVar.d(map);
    }

    private static void e(lmn lmnVar, int i, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("value", str2);
        }
        map.put("moduleName", "main_page");
        lmnVar.e(map);
    }

    private static void a(lmn lmnVar, String str, String str2) {
        List<Map<String, Object>> listE = lmnVar.e();
        if (listE == null) {
            listE = new ArrayList<>();
        }
        HashMap map = new HashMap(4);
        map.put("action", 0);
        map.put("moduleName", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, str2);
        }
        listE.add(map);
        lmnVar.d(listE);
    }
}
