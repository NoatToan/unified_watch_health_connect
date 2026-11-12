package com.alipay.sdk.packet.impl;

import android.content.Context;
import com.mipay.sdk.account.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public com.alipay.sdk.packet.b b(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        return d(aVar, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }

    @Override // com.alipay.sdk.packet.e
    public String f(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.packet.e
    public Map<String, String> h(boolean z, String str) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z));
        map.put("content-type", "application/octet-stream");
        map.put("des-mode", "CBC");
        return map;
    }

    @Override // com.alipay.sdk.packet.e
    public JSONObject i() throws JSONException {
        return null;
    }

    @Override // com.alipay.sdk.packet.e
    public String n() throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put("api_version", BuildConfig.VERSION_NAME);
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("log_v", "1.0");
        return g(map, map2);
    }
}
