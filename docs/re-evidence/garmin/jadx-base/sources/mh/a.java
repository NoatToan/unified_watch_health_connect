package mh;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import i3.e5;
import java.util.Random;
import nh.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f118446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f118447h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f118448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f118449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f118450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f118451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f118452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118453f = false;

    /* JADX INFO: renamed from: mh.a$a, reason: collision with other inner class name */
    public static class C2247a {
        public static String a() {
            String packageName;
            try {
                packageName = a.f118446g.getApplicationContext().getPackageName();
            } catch (Throwable th3) {
                d.a(th3);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }
    }

    public static synchronized a a(Context context) {
        try {
            if (f118447h == null) {
                f118447h = new a();
            }
            if (f118446g == null) {
                f118447h.c(context);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f118447h;
    }

    public static String d() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbK = e5.k(hexString);
        sbK.append(random.nextInt(9000) + 1000);
        return sbK.toString();
    }

    public final void b(String str, String str2) {
        String strA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f118448a = str;
        this.f118449b = str2;
        this.f118450c = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f118448a);
            jSONObject.put("client_key", this.f118449b);
            jSONObject.put("timestamp", this.f118450c);
            jSONObject.put("vimei", this.f118451d);
            jSONObject.put("vimsi", this.f118452e);
            String string = jSONObject.toString();
            Context context = f118446g;
            if (context == null) {
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("alipay_tid_storage", 0);
            try {
                strA = ch.a.a(ch.d.b(C2247a.a(), string, string.getBytes()));
            } catch (Exception unused) {
                strA = null;
            }
            TextUtils.isEmpty(strA);
            sharedPreferences.edit().putString("tidinfo", strA).apply();
        } catch (Exception e4) {
            d.a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final void c(Context context) {
        Exception e4;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        String hexString;
        Context context2;
        String string;
        if (context != null) {
            f118446g = context.getApplicationContext();
        }
        if (this.f118453f) {
            return;
        }
        this.f118453f = true;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            Context context3 = f118446g;
            if (context3 == null) {
                string = null;
            } else {
                string = context3.getSharedPreferences("alipay_tid_storage", 0).getString("tidinfo", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        string = new String(ch.d.a(C2247a.a(), string, ch.a.c(string)));
                    } catch (Exception unused) {
                        string = null;
                    }
                    TextUtils.isEmpty(string);
                }
            }
            try {
                if (TextUtils.isEmpty(string)) {
                    str = null;
                    strOptString2 = null;
                    strOptString3 = null;
                } else {
                    JSONObject jSONObject = new JSONObject(string);
                    strOptString = jSONObject.optString("tid", "");
                    try {
                        strOptString2 = jSONObject.optString("client_key", "");
                        try {
                            lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                            strOptString3 = jSONObject.optString("vimei", "");
                            try {
                                strOptString4 = jSONObject.optString("vimsi", "");
                            } catch (Exception e14) {
                                e4 = e14;
                                d.a(e4);
                            }
                        } catch (Exception e15) {
                            e4 = e15;
                            strOptString3 = null;
                        }
                    } catch (Exception e16) {
                        e4 = e16;
                        strOptString2 = null;
                        strOptString3 = strOptString2;
                        d.a(e4);
                        String str2 = strOptString;
                        str = strOptString4;
                        strOptString4 = str2;
                        if (TextUtils.isEmpty(strOptString4)) {
                        }
                        this.f118448a = "";
                        hexString = Long.toHexString(System.currentTimeMillis());
                        if (hexString.length() > 10) {
                            hexString = hexString.substring(hexString.length() - 10);
                        }
                        this.f118449b = hexString;
                        this.f118450c = System.currentTimeMillis();
                        this.f118451d = d();
                        this.f118452e = d();
                        context2 = f118446g;
                        if (context2 == null) {
                            return;
                        }
                        context2.getSharedPreferences("alipay_tid_storage", 0).edit().remove("tidinfo").apply();
                    }
                    String str3 = strOptString;
                    str = strOptString4;
                    strOptString4 = str3;
                }
            } catch (Exception e17) {
                e4 = e17;
                strOptString = null;
                strOptString2 = null;
                strOptString3 = strOptString2;
                d.a(e4);
                String str4 = strOptString;
                str = strOptString4;
                strOptString4 = str4;
                if (TextUtils.isEmpty(strOptString4)) {
                }
                this.f118448a = "";
                hexString = Long.toHexString(System.currentTimeMillis());
                if (hexString.length() > 10) {
                    hexString = hexString.substring(hexString.length() - 10);
                }
                this.f118449b = hexString;
                this.f118450c = System.currentTimeMillis();
                this.f118451d = d();
                this.f118452e = d();
                context2 = f118446g;
                if (context2 == null) {
                    return;
                }
                context2.getSharedPreferences("alipay_tid_storage", 0).edit().remove("tidinfo").apply();
            }
        } catch (Exception e18) {
            e4 = e18;
        }
        if (TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(str)) {
            this.f118448a = strOptString4;
            this.f118449b = strOptString2;
            this.f118450c = lValueOf.longValue();
            this.f118451d = strOptString3;
            this.f118452e = str;
            return;
        }
        this.f118448a = "";
        hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
            hexString = hexString.substring(hexString.length() - 10);
        }
        this.f118449b = hexString;
        this.f118450c = System.currentTimeMillis();
        this.f118451d = d();
        this.f118452e = d();
        context2 = f118446g;
        if (context2 == null) {
            return;
        }
        context2.getSharedPreferences("alipay_tid_storage", 0).edit().remove("tidinfo").apply();
    }
}
