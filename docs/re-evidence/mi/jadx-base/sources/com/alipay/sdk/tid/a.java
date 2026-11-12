package com.alipay.sdk.tid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.encrypt.e;
import com.alipay.sdk.util.c;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static Context g;
    public static a h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5872b;
    public long c;
    public String d;
    public String e;
    public boolean f = false;

    /* JADX INFO: renamed from: com.alipay.sdk.tid.a$a, reason: collision with other inner class name */
    public static class C0121a {
        public static String a() {
            String packageName;
            try {
                packageName = a.g.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                c.d(th);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z) {
            if (a.g == null) {
                return null;
            }
            String string = a.g.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = e.c(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    c.b("mspl", "tid_str: pref failed");
                }
            }
            c.b("mspl", "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3, boolean z) {
            if (a.g == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.g.getSharedPreferences(str, 0);
            if (z) {
                String strA = a();
                String strA2 = e.a(strA, str3, str3);
                if (TextUtils.isEmpty(strA2)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, strA);
                }
                str3 = strA2;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static void d(String str, String str2) {
            if (a.g == null) {
                return;
            }
            a.g.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }
    }

    public static synchronized a a(Context context) {
        try {
            if (h == null) {
                h = new a();
            }
            if (g == null) {
                h.f(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public String b() {
        return this.f5871a;
    }

    public void c(String str, String str2) {
        c.b("mspl", "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f5871a = str;
        this.f5872b = str2;
        this.c = System.currentTimeMillis();
        m();
        l();
    }

    public final boolean d(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public String e() {
        return this.f5872b;
    }

    public final void f(Context context) {
        if (context != null) {
            g = context.getApplicationContext();
        }
        if (this.f) {
            return;
        }
        this.f = true;
        i();
    }

    public String g() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    public final void i() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strB = C0121a.b("alipay_tid_storage", "tidinfo", true);
            if (TextUtils.isEmpty(strB)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strB);
                strOptString = jSONObject.optString("tid", "");
                try {
                    strOptString2 = jSONObject.optString("client_key", "");
                    try {
                        lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                        strOptString3 = jSONObject.optString("vimei", "");
                        try {
                            strOptString4 = jSONObject.optString("vimsi", "");
                        } catch (Exception e) {
                            e = e;
                            c.d(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strOptString3 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    strOptString2 = null;
                    strOptString3 = strOptString2;
                    c.d(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    c.b("mspl", "tid_str: load");
                    if (d(strOptString4, strOptString2, strOptString3, str)) {
                        j();
                        return;
                    }
                    this.f5871a = strOptString4;
                    this.f5872b = strOptString2;
                    this.c = lValueOf.longValue();
                    this.d = strOptString3;
                    this.e = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e4) {
            e = e4;
            strOptString = null;
            strOptString2 = null;
        }
        c.b("mspl", "tid_str: load");
        if (d(strOptString4, strOptString2, strOptString3, str)) {
            j();
            return;
        }
        this.f5871a = strOptString4;
        this.f5872b = strOptString2;
        this.c = lValueOf.longValue();
        this.d = strOptString3;
        this.e = str;
    }

    public final void j() {
        this.f5871a = "";
        this.f5872b = g();
        this.c = System.currentTimeMillis();
        this.d = k();
        this.e = k();
        C0121a.d("alipay_tid_storage", "tidinfo");
    }

    public final String k() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public final void l() {
    }

    public final void m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f5871a);
            jSONObject.put("client_key", this.f5872b);
            jSONObject.put("timestamp", this.c);
            jSONObject.put("vimei", this.d);
            jSONObject.put("vimsi", this.e);
            C0121a.c("alipay_tid_storage", "tidinfo", jSONObject.toString(), true);
        } catch (Exception e) {
            c.d(e);
        }
    }
}
