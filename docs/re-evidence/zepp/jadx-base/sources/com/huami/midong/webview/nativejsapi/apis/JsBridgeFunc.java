package com.huami.midong.webview.nativejsapi.apis;

import android.content.Intent;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPI;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JsBridgeFunc {
    public static final String INVOKE_SUCCESS = "{\"status\":\"success\"}";
    public static final String TAG = "JSBridge";
    public JsBridgeNativeAPI mNativeApi;

    public abstract void execute(String str, JsCallBackFunction jsCallBackFunction);

    public abstract JsBridgeNativeAPIEnum func();

    public void handler(String str, JsCallBackFunction jsCallBackFunction) {
        Log.d(TAG, "jsbridge call native api:" + func().getFunc() + "->data->" + str, new Object[0]);
        execute(str, jsCallBackFunction);
    }

    public void setNativeApi(JsBridgeNativeAPI jsBridgeNativeAPI) {
        this.mNativeApi = jsBridgeNativeAPI;
    }

    public void startActivity(Intent intent) {
        intent.setFlags(268435456);
        this.mNativeApi.getContext().startActivity(intent);
    }
}
