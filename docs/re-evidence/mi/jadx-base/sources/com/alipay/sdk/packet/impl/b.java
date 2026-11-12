package com.alipay.sdk.packet.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public JSONObject i() throws JSONException {
        return com.alipay.sdk.packet.e.j("sdkConfig", "obtain");
    }

    @Override // com.alipay.sdk.packet.e
    public String m() {
        return "5.0.0";
    }
}
