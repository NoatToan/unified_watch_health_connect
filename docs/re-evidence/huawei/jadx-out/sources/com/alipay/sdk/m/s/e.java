package com.alipay.sdk.m.s;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.network.base.common.trans.FileBinary;
import defpackage.mn;
import defpackage.mu;
import defpackage.my;
import defpackage.nu;
import defpackage.nv;
import defpackage.nw;
import defpackage.nx;
import defpackage.nz;
import defpackage.ok;
import defpackage.ol;
import defpackage.on;
import defpackage.op;
import defpackage.oq;
import defpackage.ox;
import defpackage.oy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2125c = "msp-gzip";
    public static final String d = "Msp-Param";
    public static final String e = "Operation-Type";
    public static final String f = "content-type";
    public static final String g = "Version";
    public static final String h = "AppId";
    public static final String i = "des-mode";
    public static final String j = "namespace";
    public static final String k = "api_name";
    public static final String l = "api_version";
    public static final String m = "data";
    public static final String n = "params";
    public static final String o = "public_key";
    public static final String p = "device";
    public static final String q = "action";
    public static final String r = "type";
    public static final String s = "method";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2126a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2127b = true;

    public Map<String, String> a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(f2125c, String.valueOf(z));
        map.put(e, "alipay.msp.cashier.dispatch.bytes");
        map.put(f, FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM);
        map.put(g, "2.0");
        map.put(h, "TAOBAO");
        map.put(d, nx.a(str));
        map.put(i, "CBC");
        return map;
    }

    public abstract JSONObject a() throws JSONException;

    public String b() {
        return "4.9.0";
    }

    public abstract boolean c();

    public String a(on onVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put(j, "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put(l, b());
        return a(onVar, map, new HashMap<>());
    }

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String a(on onVar, String str, JSONObject jSONObject) {
        ol olVarE = ol.e();
        ok okVarA = ok.a(olVarE.c());
        JSONObject jSONObjectC = op.c(new JSONObject(), jSONObject);
        try {
            jSONObjectC.put("external_info", str);
            jSONObjectC.put("tid", okVarA.e());
            jSONObjectC.put("user_agent", olVarE.d().a(onVar, okVarA, c()));
            jSONObjectC.put("has_alipay", ox.d(onVar, olVarE.c(), mn.e, false));
            jSONObjectC.put("has_msp_app", ox.h(olVarE.c()));
            jSONObjectC.put("app_key", "2014052600006128");
            jSONObjectC.put("utdid", olVarE.b());
            jSONObjectC.put("new_client_key", okVarA.c());
            jSONObjectC.put("pa", my.d(olVarE.c()));
        } catch (Throwable th) {
            mu.c(onVar, "biz", "BodyErr", th);
            oq.c(th);
        }
        return jSONObjectC.toString();
    }

    public static boolean a(nu.b bVar) {
        return Boolean.valueOf(a(bVar, f2125c)).booleanValue();
    }

    public static String a(nu.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.f43725c) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public String a(on onVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
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
            jSONObject2.put(n, jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has(n)) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject(n).optString(o, null);
            if (!TextUtils.isEmpty(strOptString)) {
                my.b(strOptString);
                return true;
            }
        } catch (JSONException e2) {
            oq.c(e2);
        }
        return false;
    }

    public nw a(on onVar, Context context) throws Throwable {
        return a(onVar, context, "");
    }

    public nw a(on onVar, Context context, String str) throws Throwable {
        return a(onVar, context, str, oy.e(context));
    }

    public nw a(on onVar, Context context, String str, String str2) throws Throwable {
        return a(onVar, context, str, str2, true);
    }

    public nw a(on onVar, Context context, String str, String str2, boolean z) throws Throwable {
        oq.b("mspl", "Packet: " + str2);
        nz nzVar = new nz(this.f2127b);
        nw nwVar = new nw(a(onVar), a(onVar, str, a()));
        Map<String, String> mapA = a(false, str);
        nv nvVarB = nzVar.b(nwVar, this.f2126a, mapA.get("iSr"));
        nu.b bVarD = nu.d(context, new nu.c(str2, a(nvVarB.e(), str), nvVarB.d()));
        if (bVarD != null) {
            nw nwVarD = nzVar.d(new nv(a(bVarD), bVarD.f43724b), mapA.get("iSr"));
            return (nwVarD != null && a(nwVarD.b()) && z) ? a(onVar, context, str, str2, false) : nwVarD;
        }
        throw new RuntimeException("Response is null.");
    }
}
