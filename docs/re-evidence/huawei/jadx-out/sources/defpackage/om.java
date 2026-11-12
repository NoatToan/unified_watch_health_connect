package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class om {
    public static me d() {
        try {
            try {
                return mi.a("NP", System.currentTimeMillis(), new mk(ol.e().b()), (short) mu.c.b(ol.e().c()), new mj());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return mi.c();
        }
    }

    public static HashMap<String, String> c(on onVar) {
        String str;
        HashMap<String, String> map = new HashMap<>();
        try {
            me meVarD = d();
            JSONObject jSONObject = new JSONObject();
            Context contextC = onVar != null ? onVar.c() : null;
            if (contextC == null) {
                contextC = ol.e().c().getApplicationContext();
            }
            String strA = ox.a(onVar, contextC);
            String strE = pd.e(onVar, contextC);
            jSONObject.put("ap_q", meVarD != null ? meVarD.e() : "");
            if (onVar == null) {
                str = "";
            } else {
                str = onVar.f44353a;
            }
            jSONObject.put("ap_link_token", str);
            jSONObject.put("u_pd", String.valueOf(ox.j()));
            jSONObject.put("u_lk", String.valueOf(ox.c(ox.c())));
            jSONObject.put("u_pi", String.valueOf(onVar != null ? onVar.j : "_"));
            jSONObject.put("u_fu", strA);
            jSONObject.put("u_oi", strE);
            map.put("ap_req", jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(meVarD != null ? meVarD.e() : "");
            sb.append("|");
            sb.append(strA);
            mu.d(onVar, "biz", "ap_q", sb.toString());
            return map;
        } catch (Exception e) {
            mu.c(onVar, "biz", "APMEx1", e);
            return map;
        }
    }

    public static JSONObject c(on onVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("ap_resp");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            return new JSONObject(strOptString);
        } catch (JSONException e) {
            mu.c(onVar, "biz", "APMEx2", e);
            return null;
        }
    }

    public static void c(on onVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt("ap_args", jSONObject2);
        } catch (JSONException e) {
            mu.c(onVar, "biz", "APMEx2", e);
        }
    }

    public static void e(on onVar, HashMap<String, String> map) {
        JSONObject jSONObjectD = mx.c().d();
        if (map == null || jSONObjectD == null) {
            return;
        }
        mu.d(onVar, "biz", "ap_r", jSONObjectD.optString("ap_r"));
        map.putAll(ox.e(jSONObjectD));
    }
}
