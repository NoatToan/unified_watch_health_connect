package com.huami.discovery.bridge.jsbridge.api;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;

/* JADX INFO: loaded from: classes8.dex */
public interface ApiHandler {
    ErrorMessage getFailedResult();

    void handleData(String str, JsCallBackFunction jsCallBackFunction);

    boolean handleData(String str);
}
