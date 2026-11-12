package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.Log;
import com.loopj.android.http.AsyncHttpClient;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class gl {
    public static int a = -1;
    public static String b = "";
    private static gt c = null;
    private static String d = "http://apiinit.amap.com/v3/log/init";
    private static String e;

    @Deprecated
    public static synchronized boolean a(Context context, gt gtVar) {
        return b(context, gtVar);
    }

    private static boolean b(Context context, gt gtVar) {
        c = gtVar;
        try {
            String str = d;
            HashMap map = new HashMap();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
            map.put("Connection", "Keep-Alive");
            map.put("User-Agent", c.d());
            map.put("X-INFO", gm.b(context));
            map.put("logversion", "2.1");
            map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", c.b(), c.a()));
            ik ikVarA = ik.a();
            gv gvVar = new gv();
            gvVar.setProxy(gs.a(context));
            gvVar.a(map);
            gvVar.b(a(context));
            gvVar.a(str);
            return a(ikVarA.a(gvVar));
        } catch (Throwable th) {
            hk.a(th, "Auth", "getAuth");
            return true;
        }
    }

    private static boolean a(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(gu.a(bArr));
            if (jSONObject.has("status")) {
                int i = jSONObject.getInt("status");
                if (i == 1) {
                    a = 1;
                } else if (i == 0) {
                    a = 0;
                }
            }
            if (jSONObject.has("info")) {
                b = jSONObject.getString("info");
            }
            if (a == 0) {
                Log.i("AuthFailure", b);
            }
            return a == 1;
        } catch (JSONException e2) {
            hk.a(e2, "Auth", "lData");
            return false;
        } catch (Throwable th) {
            hk.a(th, "Auth", "lData");
            return false;
        }
    }

    private static Map<String, String> a(Context context) {
        HashMap map = new HashMap();
        try {
            map.put("resType", "json");
            map.put("encode", "UTF-8");
            String strA = gm.a();
            map.put(AuthHandler.d, strA);
            map.put("key", gj.f(context));
            map.put("scode", gm.a(context, strA, gu.d("resType=json&encode=UTF-8&key=" + gj.f(context))));
        } catch (Throwable th) {
            hk.a(th, "Auth", "gParams");
        }
        return map;
    }
}
