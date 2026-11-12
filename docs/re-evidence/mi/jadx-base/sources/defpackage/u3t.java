package defpackage;

import android.content.Context;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u3t extends l0t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public JSONObject f35349r = null;
    public Context s = null;

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            JSONObject jSONObject = this.f35349r;
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    stringBuffer.append(next + "=" + URLEncoder.encode(this.f35349r.get(next).toString(), "utf-8") + gv5.CONNECT_STR);
                }
            }
            stringBuffer.append("output=json");
            String strK = e0t.k(this.s);
            stringBuffer.append("&key=".concat(String.valueOf(strK)));
            String strA = g0t.a();
            stringBuffer.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer.append("&scode=" + g0t.c(this.s, strA, "key=".concat(String.valueOf(strK))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android core 4.3.15");
        map.put("X-INFO", g0t.i(this.s));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.15", "core"));
        map.put("logversion", "2.1");
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "core";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return k0t.a().h() ? "https://restsdk.amap.com/sdk/compliance/params" : "http://restsdk.amap.com/sdk/compliance/params";
    }
}
