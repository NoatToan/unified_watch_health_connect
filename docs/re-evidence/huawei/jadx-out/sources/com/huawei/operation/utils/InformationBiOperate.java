package com.huawei.operation.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import defpackage.lmf;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class InformationBiOperate {
    private static final String BI_KEY_INFORMATION = "2020034";
    private static final String BI_PARAM_CLICK = "click";
    private static final String BI_PARAM_CURRENT_CATEGORY_ID = "currentCategoryId";
    private static final String BI_PARAM_CURRENT_CATEGORY_NAME = "currentCategoryName";
    private static final String BI_PARAM_INFORMATION_ITEM_ID = "informationItemId";
    private static final String BI_PARAM_LABEL = "label";
    private static final String BI_PARAM_PULLFROM = "pullfrom";
    private static final String BI_PARAM_TITLE = "title";
    private static final String BI_PARAM_URL = "url";
    private static final String TAG = "InformationBiOperate";
    private static final String TYPE_BROWSE_BI = "1";
    private final ArrayMap<String, String> mBiKey;

    public InformationBiOperate(Context context) {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        this.mBiKey = arrayMap;
        if (context == null) {
            return;
        }
        arrayMap.put(context.getResources().getString(R.string.url_knowledge_encyclopedia), BI_KEY_INFORMATION);
        arrayMap.put(context.getResources().getString(R.string.url_knowledge_encyclopedia_new), BI_KEY_INFORMATION);
        arrayMap.put(context.getResources().getString(R.string.url_tencent_medical_code), BI_KEY_INFORMATION);
    }

    private String urlVerification(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : this.mBiKey.keySet()) {
                if (str.contains(str2)) {
                    return this.mBiKey.get(str2);
                }
            }
            return "";
        }
        return "";
    }

    public void setBrowseBiAnalytics(Context context, String str, String str2) {
        synchronized (this) {
            String strUrlVerification = urlVerification(str);
            if (TextUtils.isEmpty(strUrlVerification)) {
                return;
            }
            LogUtil.a(TAG, "setBrowseBiAnalytics");
            LogUtil.a(TAG, "setBrowseBiAnalytics result: " + lmf.d().c(context, strUrlVerification, initBiParamsMap(str, str2), 0));
        }
    }

    private Map<String, Object> initBiParamsMap(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", "1");
        linkedHashMap.put("click", "1");
        linkedHashMap.put("title", str2);
        linkedHashMap.put(BI_PARAM_INFORMATION_ITEM_ID, Utils.parseUri(str, BI_PARAM_INFORMATION_ITEM_ID));
        linkedHashMap.put("label", Utils.parseUri(str, "label"));
        linkedHashMap.put(BI_PARAM_CURRENT_CATEGORY_ID, Utils.parseUri(str, BI_PARAM_CURRENT_CATEGORY_ID));
        linkedHashMap.put(BI_PARAM_CURRENT_CATEGORY_NAME, Utils.parseUri(str, BI_PARAM_CURRENT_CATEGORY_NAME));
        linkedHashMap.put("pullfrom", Utils.parseUri(str, "pullfrom"));
        linkedHashMap.put("url", str);
        return linkedHashMap;
    }
}
