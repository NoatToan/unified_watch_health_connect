package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.weight.WeightApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsw;
import defpackage.xkb;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WeightManagementJsApi extends JsBaseModule {
    private static final int DIET_SYNC = 13;
    private static final int WEIGHT_SYNC = 12;

    private static WeightApi getWeightApi() {
        return (WeightApi) Services.d("Main", WeightApi.class);
    }

    @JavascriptInterface
    public void syncData(long j, String str) {
        ReleaseLogUtil.c(this.TAG, "syncData syncType ", str);
        if (str == null) {
            onFailureCallback(j, "syncData fail");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("type")) {
                onFailureCallback(j, "JSONException");
                return;
            }
            int i = jSONObject.getInt("type");
            if (i == 12) {
                HandlerCenter.a().d(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.WeightManagementJsApi$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        xkb.a(System.currentTimeMillis());
                    }
                }, getDelayTimeMillis());
            } else if (i == 13) {
                WeightApi weightApi = getWeightApi();
                if (weightApi == null) {
                    ReleaseLogUtil.d(this.TAG, "syncData weightApi is null");
                    onFailureCallback(j, "syncData fail");
                    return;
                }
                weightApi.syncData();
            } else {
                onFailureCallback(j, "syncData fail");
                return;
            }
            onSuccessCallback(j);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "getMessage JSONException");
            onFailureCallback(j, "JSONException");
        }
    }

    private static int getDelayTimeMillis() {
        return lsw.e(60000, 600000);
    }
}
