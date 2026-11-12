package com.alipay.sdk.m.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.n;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.android.zxing.CaptureActivity;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final String A = "new_external_info==";
    public static final String k = "\"&";
    public static final String l = "&";
    public static final String m = "bizcontext=\"";
    public static final String n = "bizcontext=";
    public static final String o = "\"";
    public static final String p = "appkey";
    public static final String q = "ty";
    public static final String r = "sv";
    public static final String s = "an";
    public static final String t = "setting";
    public static final String u = "av";
    public static final String v = "sdk_start_time";
    public static final String w = "extInfo";
    public static final String x = "ap_link_token";
    public static final String y = "act_info";
    public static final String z = "UTF-8";
    public String a;
    public String b;
    public Context c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public boolean h = false;
    public final ActivityInfo i;
    public final com.alipay.sdk.m.k.b j;

    public a(Context context, String str, String str2) {
        String str3;
        this.a = "";
        this.b = "";
        this.c = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.j = new com.alipay.sdk.m.k.b(context, zIsEmpty);
        String strB = b(str, this.b);
        this.d = strB;
        this.e = SystemClock.elapsedRealtime();
        this.f = n.g();
        ActivityInfo activityInfoA = n.a(context);
        this.i = activityInfoA;
        this.g = str2;
        if (!zIsEmpty) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "eptyp", str2 + AESEncryptionHelper.SEPARATOR + strB);
            if (activityInfoA != null) {
                str3 = activityInfoA.name + AESEncryptionHelper.SEPARATOR + activityInfoA.launchMode;
            } else {
                str3 = "null";
            }
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "actInfo", str3);
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, NotificationCompat.CATEGORY_SYSTEM, n.a(this));
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "sdkv", "636c7b1-clean");
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            e.a(e);
        }
        if (!zIsEmpty) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "u" + n.g());
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.P, "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.m.k.a.a(context, this, str, this.d);
        }
        if (zIsEmpty || !com.alipay.sdk.m.m.a.z().r()) {
            return;
        }
        com.alipay.sdk.m.m.a.z().a(this, this.c, true, 2);
    }

    private String e(String str) throws JSONException {
        return a(new JSONObject(str));
    }

    public static a f() {
        return null;
    }

    private String f(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z2 = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            jSONObject = new JSONObject(strSubstring2.substring(1, strSubstring2.length() - 1));
            z2 = true;
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strA = a(jSONObject);
        if (z2) {
            strA = "\"" + strA + "\"";
        }
        return str2 + strA + str3;
    }

    private String g(String str) {
        try {
            String strD = d(str, l, n);
            if (TextUtils.isEmpty(strD)) {
                str = str + l + c(n, "");
            } else {
                int iIndexOf = str.indexOf(strD);
                str = str.substring(0, iIndexOf) + f(strD, n, "") + str.substring(iIndexOf + strD.length());
            }
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "fmt1", th, str);
        }
        return str;
    }

    private String h(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", e(jSONObject.optString("bizcontext")));
            return A + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String i(String str) {
        try {
            String strD = d(str, k, m);
            if (TextUtils.isEmpty(strD)) {
                return str + l + c(m, "\"");
            }
            if (!strD.endsWith("\"")) {
                strD = strD + "\"";
            }
            int iIndexOf = str.indexOf(strD);
            return str.substring(0, iIndexOf) + f(strD, m, "\"") + str.substring(iIndexOf + strD.length());
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "fmt2", th, str);
            return str;
        }
    }

    private JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(x, this.d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private boolean k(String str) {
        return !str.contains(k);
    }

    public Context a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.h;
    }

    public static String b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", n.g(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    private String c(String str, String str2) {
        return str + a(new JSONObject()) + str2;
    }

    private String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i]) && strArrSplit[i].startsWith(str3)) {
                return strArrSplit[i];
            }
        }
        return null;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(A)) {
            return h(str);
        }
        return k(str) ? g(str) : i(str);
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.s.a$a, reason: collision with other inner class name */
    public static final class C0094a {
        public static final HashMap<UUID, a> a = new HashMap<>();
        public static final HashMap<String, a> b = new HashMap<>();
        public static final String c = "i_uuid_b_c";

        public static void a(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            a.put(uuidRandomUUID, aVar);
            intent.putExtra(c, uuidRandomUUID);
        }

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(c);
            if (serializableExtra instanceof UUID) {
                return a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void a(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            b.put(str, aVar);
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b.remove(str);
        }
    }

    public String a(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has(p)) {
                jSONObject.put(p, com.alipay.sdk.m.l.a.f);
            }
            if (!jSONObject.has(q)) {
                jSONObject.put(q, "and_lite");
            }
            if (!jSONObject.has(r)) {
                jSONObject.put(r, "h.a.3.8.09");
            }
            if (!jSONObject.has(s)) {
                jSONObject.put(s, this.b);
            }
            if (!jSONObject.has(u)) {
                jSONObject.put(u, this.a);
            }
            if (!jSONObject.has(v)) {
                jSONObject.put(v, System.currentTimeMillis());
            }
            if (!jSONObject.has(w)) {
                jSONObject.put(w, j());
            }
            if (!jSONObject.has(y)) {
                if (this.i != null) {
                    str = this.i.name + AESEncryptionHelper.SEPARATOR + this.i.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(y, str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(this, com.alipay.sdk.m.k.b.l, "fmt3", th, String.valueOf(jSONObject));
            e.a(th);
            return jSONObject != null ? jSONObject.toString() : MessageFormatter.c;
        }
    }

    public static HashMap<String, String> a(a aVar) {
        HashMap<String, String> map = new HashMap<>();
        if (aVar != null) {
            map.put(AbstractContentType.PARAM_SDK_VERSION, "15.8.09");
            map.put("app_name", aVar.b);
            map.put("token", aVar.d);
            map.put(CaptureActivity.KEY_CALL_TYPE, aVar.g);
            map.put("ts_api_invoke", String.valueOf(aVar.e));
            com.alipay.sdk.m.u.a.a(aVar, map);
        }
        return map;
    }

    public void a(boolean z2) {
        this.h = z2;
    }
}
