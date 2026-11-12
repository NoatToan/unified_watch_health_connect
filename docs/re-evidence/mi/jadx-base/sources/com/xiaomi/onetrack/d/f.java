package com.xiaomi.onetrack.d;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.p;
import com.xiaomi.onetrack.util.q;
import com.xiaomi.onetrack.util.x;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JSONObject f13870a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13871b = "SecretKeyManager";
    private static final String c = "secretKey";
    private static final String d = "sid";
    private static final String e = "key";
    private Context f;
    private JSONObject g;
    private String[] h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f13872a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f13872a;
    }

    private void d() {
        if (p.f13986a) {
            if (TextUtils.isEmpty(this.h[0]) || TextUtils.isEmpty(this.h[1])) {
                p.a(f13871b, "key or sid is invalid!");
            } else {
                p.a(f13871b, "key  and sid is valid! ");
            }
        }
    }

    private JSONObject e() {
        JSONObject jSONObjectF = this.g;
        if (jSONObjectF == null && (jSONObjectF = f()) != null) {
            this.g = jSONObjectF;
        }
        return jSONObjectF == null ? c() : jSONObjectF;
    }

    private JSONObject f() {
        try {
            String strG = aa.g();
            if (TextUtils.isEmpty(strG)) {
                return null;
            }
            return new JSONObject(b.b(this.f, strG));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public synchronized String[] b() {
        try {
            JSONObject jSONObjectE = e();
            this.h[0] = jSONObjectE != null ? jSONObjectE.optString("key") : "";
            this.h[1] = jSONObjectE != null ? jSONObjectE.optString("sid") : "";
            d();
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public JSONObject c() {
        try {
            if (q.a(f13871b)) {
                return f13870a;
            }
            byte[] bArrA = com.xiaomi.onetrack.d.a.a();
            String strA = c.a(e.a(bArrA));
            HashMap map = new HashMap();
            map.put(c, strA);
            String strB = com.xiaomi.onetrack.g.b.b(x.a().e(), map, true);
            if (!TextUtils.isEmpty(strB)) {
                JSONObject jSONObject = new JSONObject(strB);
                int iOptInt = jSONObject.optInt("code");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (iOptInt == 0 && jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("key");
                    String strOptString2 = jSONObjectOptJSONObject.optString("sid");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String strA2 = c.a(com.xiaomi.onetrack.d.a.b(c.a(strOptString), bArrA));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("key", strA2);
                        jSONObject2.put("sid", strOptString2);
                        this.g = jSONObject2;
                        aa.a(b.a(this.f, jSONObject2.toString()));
                        aa.i(System.currentTimeMillis());
                    }
                }
            }
            return this.g;
        } catch (Exception e2) {
            p.b(f13871b, "requestSecretData: " + e2.toString());
        }
    }

    private f() {
        this.g = null;
        this.h = new String[2];
        this.f = com.xiaomi.onetrack.f.a.a();
    }
}
