package com.huami.midong.webview.nativejsapi.apis;

import com.google.gson.Gson;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;

/* JADX INFO: loaded from: classes11.dex */
public class JsShareFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        JSShareCreator.Content shareContent = JSShareCreator.parseShareContent(str);
        if (shareContent.error != null) {
            jsCallBackFunction.onCallBack(new Gson().toJson(shareContent.error));
        } else {
            JsBridgeDelegate.getJsBridgeCallback().doShare(shareContent);
            jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SHARE;
    }
}
