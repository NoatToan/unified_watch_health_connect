package com.huami.discovery.bridge.jsbridge;

/* JADX INFO: loaded from: classes8.dex */
public class JsBridgeDefaultHandler implements JsBridgeHandler {
    @Override // com.huami.discovery.bridge.jsbridge.JsBridgeHandler
    public void handler(String str, JsCallBackFunction jsCallBackFunction) {
        if (jsCallBackFunction != null) {
            jsCallBackFunction.onCallBack("JsBridgeDefaultHandler response data:" + str);
        }
    }
}
