package com.huami.midong.webview.nativejsapi.apis;

import com.huami.midong.webview.event.JsShowDeviceXCodeEvent;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsShowDeviceXCodeFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        Log.d(JsBridgeFunc.TAG, "JsShowDeviceXCodeFunc:" + str, new Object[0]);
        try {
            if ("esim".equalsIgnoreCase(new JSONObject(str).optString("key", ""))) {
                RxBus.get().post(new JsShowDeviceXCodeEvent());
                jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SHOW_DEVICE_X_CODE;
    }
}
