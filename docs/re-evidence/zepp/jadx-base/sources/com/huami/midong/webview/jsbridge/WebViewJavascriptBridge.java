package com.huami.midong.webview.jsbridge;

/* JADX INFO: loaded from: classes11.dex */
public interface WebViewJavascriptBridge {
    void send(String str);

    void send(String str, JsCallBackFunction jsCallBackFunction);
}
