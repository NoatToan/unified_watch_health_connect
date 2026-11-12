package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16565a = "q";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f16566b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f16567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f16569c;
        private String d;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context, String str) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 3300000;
            a unused = q.f16566b = new a(str, jCurrentTimeMillis);
            String strEncodeToString = Base64.encodeToString(o.a(12), 2);
            byte[] bArrB = m.b("riskTokenSdkCache", strEncodeToString, str.getBytes(StandardCharsets.UTF_8));
            if (bArrB.length == 0) {
                Log.e(q.f16565a, "Save risk token error. Android key store aes encrypt error.");
                return;
            }
            String strEncodeToString2 = Base64.encodeToString(bArrB, 2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", strEncodeToString2);
                jSONObject.put("extime", jCurrentTimeMillis);
                jSONObject.put("iv", strEncodeToString);
                z.a(context).a("riskToken", jSONObject.toString());
            } catch (JSONException e) {
                Log.e(q.f16565a, "Save risk token error. " + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String b(Context context) {
            if (q.f16566b != null) {
                if (System.currentTimeMillis() > q.f16566b.f16569c) {
                    return "";
                }
                Log.i(q.f16565a, "Get token from cache success.");
                return q.f16566b.f16568b;
            }
            String strA = z.a(context).a("riskToken");
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            a aVar = new a(strA);
            if (System.currentTimeMillis() > aVar.f16569c) {
                return "";
            }
            byte[] bArrA = m.a("riskTokenSdkCache", aVar.d, d.a(aVar.f16567a));
            if (bArrA.length == 0) {
                return "";
            }
            String str = new String(bArrA, StandardCharsets.UTF_8);
            Log.i(q.f16565a, "Get token from sp cache success.");
            aVar.a(str);
            a unused = q.f16566b = aVar;
            return str;
        }

        private void a(String str) {
            this.f16568b = str;
        }

        private a(String str, long j) {
            this.f16568b = str;
            this.f16569c = j;
        }

        private a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f16567a = jSONObject.optString("token");
                this.f16569c = jSONObject.optLong("extime");
                this.d = jSONObject.optString("iv");
            } catch (JSONException e) {
                Log.e(q.f16565a, "Build risk token cache error. " + e.getMessage());
            }
        }
    }

    public static void a(Context context, String str) {
        a.b(context, str);
    }

    public static String a(Context context) {
        return a.b(context);
    }
}
