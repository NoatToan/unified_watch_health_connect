package com.huawei.ui.main.stories.nps.interactors.mode;

import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SdkCommonParams {
    public static Map<String, String> getCommonParams() {
        HashMap map = new HashMap();
        map.put("siteCode", CommonUtil.z());
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCommonCountryCode());
        map.put("language", CommonUtil.z());
        map.put(WebSurveyRequestParam.NPS_ID, "3");
        map.put("channel", "7");
        map.put("brand", "Huawei");
        map.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        map.put(WebSurveyRequestParam.RELATE_BRAND, String.valueOf(Build.BRAND));
        map.put(WebSurveyRequestParam.RELATE_MODEL, String.valueOf(Build.MODEL));
        map.put(WebSurveyRequestParam.RELATE_FIRMWARE, "");
        map.put(WebSurveyRequestParam.RELATE_OS_VERSION, "");
        return map;
    }
}
