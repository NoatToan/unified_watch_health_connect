package com.huami.midong.webview.nativejsapi.apis;

import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;

/* JADX INFO: loaded from: classes11.dex */
public class JsExitFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        if (this.mNativeApi.getJsTitleCallback() != null) {
            this.mNativeApi.getJsTitleCallback().onExit();
        }
        jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_WEBVIEW_EXIT;
    }
}
