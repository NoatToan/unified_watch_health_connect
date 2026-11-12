package com.alipay.sdk.packet.impl;

import android.content.Context;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public com.alipay.sdk.packet.b b(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        com.alipay.sdk.util.c.f("mspl", "mdap post");
        byte[] bArrA = com.alipay.sdk.encrypt.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", com.alipay.sdk.sys.b.a().f());
        map.put("logHeader", "RAW");
        map.put("bizCode", "alipaysdk");
        map.put("productId", "alipaysdk_android");
        map.put(HTTP.CONTENT_ENCODING, "Gzip");
        map.put("productVersion", "15.7.5");
        com.alipay.sdk.net.a.b bVarA = com.alipay.sdk.net.a.a(context, new com.alipay.sdk.net.a.C0119a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", map, bArrA));
        com.alipay.sdk.util.c.f("mspl", "mdap got " + bVarA);
        if (bVarA == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zK = com.alipay.sdk.packet.e.k(bVarA);
        try {
            byte[] bArrB = bVarA.c;
            if (zK) {
                bArrB = com.alipay.sdk.encrypt.b.b(bArrB);
            }
            return new com.alipay.sdk.packet.b("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e) {
            com.alipay.sdk.util.c.d(e);
            return null;
        }
    }

    @Override // com.alipay.sdk.packet.e
    public String f(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.packet.e
    public Map<String, String> h(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.packet.e
    public JSONObject i() {
        return null;
    }
}
