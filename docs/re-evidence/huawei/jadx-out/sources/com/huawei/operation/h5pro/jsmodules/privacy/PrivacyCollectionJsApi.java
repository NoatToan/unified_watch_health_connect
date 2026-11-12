package com.huawei.operation.h5pro.jsmodules.privacy;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PrivacyCollectionJsApi extends JsBaseModule {
    private static final String TAG = "PrivacyCollectionJsApi";

    @JavascriptInterface
    public void queryPrivacyCollection(long j, String str) {
        try {
            String strB = SharedPreferenceManager.b("privacy_center", new JSONObject(str).getString("itemKey"), "");
            LogUtil.a(TAG, "queryPrivacyCollection ", Long.valueOf(j), " params ", str, " time ", strB);
            onSuccessCallback(j, TextUtils.isEmpty(strB) ? "0" : strB);
        } catch (JSONException unused) {
            onFailureCallback(j, "0");
        }
    }
}
