package com.huami.discovery.bridge.jsbridge.api;

import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface VerifySignApiHandler {
    void requestToVerify(Map<String, String> map, JsCallBackFunction jsCallBackFunction, VerifiedCallback verifiedCallback);
}
