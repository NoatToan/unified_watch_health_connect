package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ok {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ok f44349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f44350c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44351a;
    public String d;
    public String e;
    public String f;
    public String h;
    public boolean j = false;

    public final String a() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public String c() {
        return this.e;
    }

    public final void d(Context context) {
        if (context != null) {
            f44350c = context.getApplicationContext();
        }
        if (this.j) {
            return;
        }
        this.j = true;
        j();
    }

    public String e() {
        return this.d;
    }

    public final void g() {
    }

    public final void h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.d);
            jSONObject.put("client_key", this.e);
            jSONObject.put("timestamp", this.f44351a);
            jSONObject.put("vimei", this.h);
            jSONObject.put("vimsi", this.f);
            b.d("alipay_tid_storage", "tidinfo", jSONObject.toString(), true);
        } catch (Exception e) {
            oq.c(e);
        }
    }

    public final void i() {
        this.d = "";
        this.e = b();
        this.f44351a = System.currentTimeMillis();
        this.h = a();
        this.f = a();
        b.a("alipay_tid_storage", "tidinfo");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    public final void j() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strC = b.c("alipay_tid_storage", "tidinfo", true);
            if (TextUtils.isEmpty(strC)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strC);
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
                            oq.c(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strOptString3 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    strOptString2 = null;
                    strOptString3 = null;
                    oq.c(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    oq.b("mspl", "tid_str: load");
                    if (d(strOptString4, strOptString2, strOptString3, str)) {
                        i();
                        return;
                    }
                    this.d = strOptString4;
                    this.e = strOptString2;
                    this.f44351a = lValueOf.longValue();
                    this.h = strOptString3;
                    this.f = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e4) {
            e = e4;
            strOptString = null;
        }
        oq.b("mspl", "tid_str: load");
        if (d(strOptString4, strOptString2, strOptString3, str)) {
            i();
            return;
        }
        this.d = strOptString4;
        this.e = strOptString2;
        this.f44351a = lValueOf.longValue();
        this.h = strOptString3;
        this.f = str;
    }

    public static ok a(Context context) {
        ok okVar;
        synchronized (ok.class) {
            if (f44349b == null) {
                f44349b = new ok();
            }
            if (f44350c == null) {
                f44349b.d(context);
            }
            okVar = f44349b;
        }
        return okVar;
    }

    public static class b {
        public static void a(String str, String str2) {
            if (ok.f44350c == null) {
                return;
            }
            ok.f44350c.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static String c(String str, String str2, boolean z) {
            if (ok.f44350c == null) {
                return null;
            }
            String string = ok.f44350c.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = nm.d(b(), string, string);
                if (TextUtils.isEmpty(string)) {
                    oq.b("mspl", "tid_str: pref failed");
                }
            }
            oq.b("mspl", "tid_str: from local");
            return string;
        }

        public static void d(String str, String str2, String str3, boolean z) {
            if (ok.f44350c == null) {
                return;
            }
            SharedPreferences sharedPreferences = ok.f44350c.getSharedPreferences(str, 0);
            if (z) {
                String strB = b();
                String strA = nm.a(strB, str3, str3);
                if (TextUtils.isEmpty(strA)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, strB);
                }
                str3 = strA;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static String b() {
            String packageName;
            try {
                packageName = ok.f44350c.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                oq.c(th);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }
    }

    public final boolean d(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public void c(String str, String str2) {
        oq.b("mspl", "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.d = str;
        this.e = str2;
        this.f44351a = System.currentTimeMillis();
        h();
        g();
    }
}
