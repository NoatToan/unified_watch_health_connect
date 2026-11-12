package com.huami.midong.webview.jsbridge;

import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeDefaultHandler implements JsBridgeHandler {
    private final String TAG = "JsBridgeDefaultHandler";

    @Override // com.huami.midong.webview.jsbridge.JsBridgeHandler
    public void handler(String str, JsCallBackFunction jsCallBackFunction) {
        Log.d("JsBridgeDefaultHandler", "call JsBridgeDefaultHandler with data:" + str, new Object[0]);
        if (jsCallBackFunction != null) {
            jsCallBackFunction.onCallBack("JsBridgeDefaultHandler response data:" + str);
        }
    }
}
