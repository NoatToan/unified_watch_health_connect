package com.alipay.sdk.packet;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.util.j;
import com.alipay.sdk.util.k;
import com.xiaomi.passport.snscorelib.internal.utils.SNSType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5859a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5860b = true;

    public static String e(com.alipay.sdk.net.a.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f5851a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public static JSONObject j(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean k(com.alipay.sdk.net.a.b bVar) {
        return Boolean.valueOf(e(bVar, "msp-gzip")).booleanValue();
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject("params").optString("public_key", null);
            if (TextUtils.isEmpty(strOptString)) {
                return false;
            }
            com.alipay.sdk.data.b.d(strOptString);
            return true;
        } catch (JSONException e) {
            com.alipay.sdk.util.c.d(e);
            return false;
        }
    }

    public b a(com.alipay.sdk.sys.a aVar, Context context) throws Throwable {
        return b(aVar, context, "");
    }

    public b b(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        return c(aVar, context, str, j.a(context));
    }

    public b c(com.alipay.sdk.sys.a aVar, Context context, String str, String str2) throws Throwable {
        return d(aVar, context, str, str2, true);
    }

    public b d(com.alipay.sdk.sys.a aVar, Context context, String str, String str2, boolean z) throws Throwable {
        com.alipay.sdk.util.c.b("mspl", "Packet: " + str2);
        c cVar = new c(this.f5860b);
        b bVar = new b(n(), f(aVar, str, i()));
        Map<String, String> mapH = h(false, str);
        d dVarC = cVar.c(bVar, this.f5859a, mapH.get("iSr"));
        com.alipay.sdk.net.a.b bVarA = com.alipay.sdk.net.a.a(context, new com.alipay.sdk.net.a.C0119a(str2, h(dVarC.a(), str), dVarC.b()));
        if (bVarA == null) {
            throw new RuntimeException("Response is null.");
        }
        b bVarB = cVar.b(new d(k(bVarA), bVarA.c), mapH.get("iSr"));
        return (bVarB != null && l(bVarB.a()) && z) ? d(aVar, context, str, str2, false) : bVarB;
    }

    public String f(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        com.alipay.sdk.sys.b bVarA = com.alipay.sdk.sys.b.a();
        com.alipay.sdk.tid.a aVarA = com.alipay.sdk.tid.a.a(bVarA.c());
        JSONObject jSONObjectA = com.alipay.sdk.util.b.a(new JSONObject(), jSONObject);
        try {
            jSONObjectA.put("external_info", str);
            jSONObjectA.put("tid", aVarA.b());
            jSONObjectA.put("user_agent", bVarA.d().c(aVar, aVarA));
            jSONObjectA.put("has_alipay", k.v(aVar, bVarA.c(), com.alipay.sdk.app.a.d));
            jSONObjectA.put("has_msp_app", k.l(bVarA.c()));
            jSONObjectA.put("app_key", "2014052600006128");
            jSONObjectA.put("utdid", bVarA.f());
            jSONObjectA.put("new_client_key", aVarA.e());
            jSONObjectA.put("pa", com.alipay.sdk.data.b.a(bVarA.c()));
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "BodyErr", th);
            com.alipay.sdk.util.c.d(th);
        }
        return jSONObjectA.toString();
    }

    public String g(HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> h(boolean z, String str) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z));
        map.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        map.put("content-type", "application/octet-stream");
        map.put("Version", "2.0");
        map.put("AppId", SNSType.TAOBAO);
        map.put("Msp-Param", a.a(str));
        map.put("des-mode", "CBC");
        return map;
    }

    public abstract JSONObject i() throws JSONException;

    public String m() {
        return "4.9.0";
    }

    public String n() throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put("api_version", m());
        return g(map, new HashMap<>());
    }
}
