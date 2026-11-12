package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class a {
    public static final String A = "try_login_activity";
    public static final String B = "no_internet_permission";
    public static final String C = "not_tried";
    public static final String D = "new_permissions";
    public static final String E = "login_behavior";
    public static final String F = "request_code";
    public static final String G = "permissions";
    public static final String H = "default_audience";
    public static final String I = "isReauthorize";
    public static final String J = "facebookVersion";
    public static final String K = "failure";
    public static final String L = "target_app";
    public static final String M = "com.facebook.katana";
    private static final ScheduledExecutorService N = Executors.newSingleThreadScheduledExecutor();
    public static final String d = "fb_mobile_login_method_start";
    public static final String e = "fb_mobile_login_method_complete";
    public static final String f = "fb_mobile_login_method_not_tried";
    public static final String g = "skipped";
    public static final String h = "fb_mobile_login_start";
    public static final String i = "fb_mobile_login_complete";
    public static final String j = "fb_mobile_login_status_start";
    public static final String k = "fb_mobile_login_status_complete";
    public static final String l = "fb_mobile_login_heartbeat";
    public static final String m = "foa_mobile_login_method_start";
    public static final String n = "foa_mobile_login_method_complete";
    public static final String o = "foa_mobile_login_method_not_tried";
    public static final String p = "foa_skipped";
    public static final String q = "foa_mobile_login_start";
    public static final String r = "foa_mobile_login_complete";
    public static final String s = "0_auth_logger_id";
    public static final String t = "1_timestamp_ms";
    public static final String u = "2_result";
    public static final String v = "3_method";
    public static final String w = "4_error_code";
    public static final String x = "5_error_message";
    public static final String y = "6_extras";
    public static final String z = "7_challenge";
    private final InternalAppEventsLogger a;
    private String b;
    private String c;

    /* JADX INFO: renamed from: com.facebook.login.a$a, reason: collision with other inner class name */
    public class RunnableC0133a implements Runnable {
        public final /* synthetic */ Bundle a;

        public RunnableC0133a(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                a.a(a.this).logEventImplicitly(a.l, this.a);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public a(Context context, String str) {
        PackageInfo packageInfo;
        this.b = str;
        this.a = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ InternalAppEventsLogger a(a aVar) {
        if (CrashShieldHandler.isObjectCrashing(a.class)) {
            return null;
        }
        try {
            return aVar.a;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, a.class);
            return null;
        }
    }

    private void k(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            N.schedule(new RunnableC0133a(t(str)), 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static Bundle t(String str) {
        if (CrashShieldHandler.isObjectCrashing(a.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString(v, "");
            bundle.putString(u, "");
            bundle.putString(x, "");
            bundle.putString(w, "");
            bundle.putString(y, "");
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, a.class);
            return null;
        }
    }

    public String b() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            d(str, str2, str3, str4, str5, map, e);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void d(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            if (str3 != null) {
                bundleT.putString(u, str3);
            }
            if (str4 != null) {
                bundleT.putString(x, str4);
            }
            if (str5 != null) {
                bundleT.putString(w, str5);
            }
            if (map != null && !map.isEmpty()) {
                bundleT.putString(y, new JSONObject(map).toString());
            }
            bundleT.putString(v, str2);
            this.a.logEventImplicitly(str6, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void e(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            f(str, str2, f);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void f(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            bundleT.putString(v, str2);
            this.a.logEventImplicitly(str3, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void g(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            h(str, str2, d);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void h(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            bundleT.putString(v, str2);
            this.a.logEventImplicitly(str3, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void i(String str, Map<String, String> map, LoginClient.Result.b bVar, Map<String, String> map2, Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            j(str, map, bVar, map2, exc, i);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void j(String str, Map<String, String> map, LoginClient.Result.b bVar, Map<String, String> map2, Exception exc, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            if (bVar != null) {
                bundleT.putString(u, bVar.a());
            }
            if (exc != null && exc.getMessage() != null) {
                bundleT.putString(x, exc.getMessage());
            }
            JSONObject jSONObject = map.isEmpty() ? null : new JSONObject(map);
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleT.putString(y, jSONObject.toString());
            }
            this.a.logEventImplicitly(str2, bundleT);
            if (bVar == LoginClient.Result.b.SUCCESS) {
                k(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void l(String str, Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            bundleT.putString(u, LoginClient.Result.b.ERROR.a());
            bundleT.putString(x, exc.toString());
            this.a.logEventImplicitly(k, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void m(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            bundleT.putString(u, K);
            this.a.logEventImplicitly(k, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void n(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.a.logEventImplicitly(j, t(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void o(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(str);
            bundleT.putString(u, LoginClient.Result.b.SUCCESS.a());
            this.a.logEventImplicitly(k, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void p(LoginClient.Request request) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            q(request, h);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void q(LoginClient.Request request, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t(request.b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.g().toString());
                jSONObject.put("request_code", LoginClient.getLoginRequestCode());
                jSONObject.put("permissions", TextUtils.join(",", request.i()));
                jSONObject.put("default_audience", request.d().toString());
                jSONObject.put(I, request.m());
                String str2 = this.c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (request.h() != null) {
                    jSONObject.put(L, request.h().getTargetApp());
                }
                bundleT.putString(y, jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.a.logEventImplicitly(str, null, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void r(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            s(str, str2, "");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void s(String str, String str2, String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundleT = t("");
            bundleT.putString(u, LoginClient.Result.b.ERROR.a());
            bundleT.putString(x, str2);
            bundleT.putString(v, str3);
            this.a.logEventImplicitly(str, bundleT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
