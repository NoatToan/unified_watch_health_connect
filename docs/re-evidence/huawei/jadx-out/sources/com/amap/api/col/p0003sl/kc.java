package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class kc extends is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f2949a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2950b = null;

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            JSONObject jSONObject = this.f2949a;
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    stringBuffer.append(next + "=" + URLEncoder.encode(this.f2949a.get(next).toString(), "utf-8") + "&");
                }
            }
            stringBuffer.append("output=json");
            String strF = il.f(this.f2950b);
            stringBuffer.append("&key=".concat(String.valueOf(strF)));
            String strA = io.a();
            stringBuffer.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer.append("&scode=" + io.a(this.f2950b, strA, "key=".concat(String.valueOf(strF))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put(j2.v, Constants.GZIP);
        map.put("User-Agent", "AMAP SDK Android core 4.3.15");
        map.put("X-INFO", io.b(this.f2950b));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.15", "core"));
        map.put("logversion", "2.1");
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        if (ir.a().b()) {
            return "https://restsdk.amap.com/sdk/compliance/params";
        }
        return "http://restsdk.amap.com/sdk/compliance/params";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "core";
    }
}
