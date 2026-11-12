package com.huami.midong.webview.nativejsapi.apis;

import android.text.TextUtils;
import com.huami.midong.webview.event.JsDownloadESIMEvent;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsDownloadESIMFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        Log.d(JsBridgeFunc.TAG, "JsDownloadESIMFunc:" + str, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("category", "");
            String strOptString2 = jSONObject.optString("url", "");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            RxBus.get().post(new JsDownloadESIMEvent(strOptString2));
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_DOWNLOAD_ESIM;
    }
}
