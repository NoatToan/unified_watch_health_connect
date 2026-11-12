package com.huawei.operation.h5pro.jsmodules;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WeChatJsApi extends JsBaseModule {
    private static final String TAG = "WeChatJsApi";

    @JavascriptInterface
    public void launchWxMiniProgram(long j, String str) {
        JSONException e;
        String string;
        int i;
        String string2 = "";
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG, "launchWxMiniProgram param invalid");
            onFailureCallback(j, "invalid param");
            return;
        }
        ReleaseLogUtil.d(TAG, "launchWxMiniProgram param is: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString(HwPayConstant.KEY_USER_NAME);
            try {
                string2 = jSONObject.getString(BleConstants.KEY_PATH);
                i = jSONObject.getInt("miniProgramType");
            } catch (JSONException e2) {
                e = e2;
                ReleaseLogUtil.a(TAG, "launchWxMiniProgram exception ", ExceptionUtils.c(e));
                i = 0;
            }
        } catch (JSONException e3) {
            e = e3;
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            ReleaseLogUtil.e(TAG, "launchWxMiniProgram userName invalid");
            onFailureCallback(j, "invalid userName");
        } else {
            ((WeChatApi) Services.b("Main", WeChatApi.class)).launchWxMiniProgram(string, string2, i);
            onSuccessCallback(j);
        }
    }
}
