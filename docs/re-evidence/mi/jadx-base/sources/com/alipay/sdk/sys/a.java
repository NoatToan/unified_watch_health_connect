package com.alipay.sdk.sys;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.util.c;
import com.alipay.sdk.util.k;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.onetrack.b.m;
import defpackage.gv5;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5866b;
    public Context c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public final ActivityInfo h;
    public final com.alipay.sdk.app.statistic.b i;

    /* JADX INFO: renamed from: com.alipay.sdk.sys.a$a, reason: collision with other inner class name */
    public static final class C0120a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f5867a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f5868b = new HashMap<>();

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f5867a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f5868b.remove(str);
        }

        public static void c(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f5867a.put(uuidRandomUUID, aVar);
            intent.putExtra("i_uuid_b_c", uuidRandomUUID);
        }

        public static void d(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            f5868b.put(str, aVar);
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        this.f5865a = "";
        this.f5866b = "";
        this.c = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.i = new com.alipay.sdk.app.statistic.b(context, zIsEmpty);
        String strL = l(str, this.f5866b);
        this.d = strL;
        this.e = SystemClock.elapsedRealtime();
        this.f = k.z();
        ActivityInfo activityInfoJ = k.J(context);
        this.h = activityInfoJ;
        this.g = str2;
        if (!zIsEmpty) {
            com.alipay.sdk.app.statistic.a.h(this, "biz", "eptyp", str2 + "|" + strL);
            if (activityInfoJ != null) {
                str3 = activityInfoJ.name + "|" + activityInfoJ.launchMode;
            } else {
                str3 = AbstractJsonLexerKt.NULL;
            }
            com.alipay.sdk.app.statistic.a.h(this, "biz", "actInfo", str3);
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f5865a = packageInfo.versionName;
            this.f5866b = packageInfo.packageName;
        } catch (Exception e) {
            c.d(e);
        }
        if (!zIsEmpty) {
            com.alipay.sdk.app.statistic.a.b(this, "biz", "u" + k.z());
            com.alipay.sdk.app.statistic.a.h(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.app.statistic.a.a(context, this, str, this.d);
        }
        if (zIsEmpty || !com.alipay.sdk.data.a.w().u()) {
            return;
        }
        com.alipay.sdk.data.a.w().e(this, this.c);
    }

    public static a a() {
        return null;
    }

    public static HashMap<String, String> f(a aVar) {
        HashMap<String, String> map = new HashMap<>();
        if (aVar != null) {
            map.put("sdk_ver", "15.7.5");
            map.put(FeedbackConstants.KEY_APP_NAME, aVar.f5866b);
            map.put("token", aVar.d);
            map.put("call_type", aVar.g);
            map.put("ts_api_invoke", String.valueOf(aVar.e));
        }
        return map;
    }

    public static String l(String str, String str2) {
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
            return String.format("EP%s%s_%s", "1", k.H(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        return i(str) ? k(str) : n(str);
    }

    public String c(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put(m.e, "h.a.3.7.5");
            if (!this.f5866b.contains("setting") || !k.u(this.c)) {
                jSONObject.put("an", this.f5866b);
            }
            jSONObject.put(m.f, this.f5865a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            jSONObject.put("extInfo", o());
            if (this.h != null) {
                str3 = this.h.name + "|" + this.h.launchMode;
            } else {
                str3 = AbstractJsonLexerKt.NULL;
            }
            jSONObject.put("act_info", str3);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            c.d(th);
            return "";
        }
    }

    public final String d(String str, String str2, String str3) {
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

    public final String e(String str, String str2, String str3, boolean z) throws JSONException, UnsupportedEncodingException {
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
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "and_lite");
        }
        if (!jSONObject.has(m.e)) {
            jSONObject.put(m.e, "h.a.3.7.5");
        }
        if (!jSONObject.has("an") && (!this.f5866b.contains("setting") || !k.u(this.c))) {
            jSONObject.put("an", this.f5866b);
        }
        if (!jSONObject.has(m.f)) {
            jSONObject.put(m.f, this.f5865a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        if (!jSONObject.has("extInfo")) {
            jSONObject.put("extInfo", o());
        }
        String string = jSONObject.toString();
        if (z2) {
            string = "\"" + string + "\"";
        }
        return str2 + string + str3;
    }

    public String g() {
        return this.f5866b;
    }

    public final String h(String str, String str2) throws JSONException, UnsupportedEncodingException {
        return str + c("", "") + str2;
    }

    public final boolean i(String str) {
        return !str.contains("\"&");
    }

    public String j() {
        return this.f5865a;
    }

    public final String k(String str) {
        try {
            String strD = d(str, gv5.CONNECT_STR, "bizcontext=");
            if (TextUtils.isEmpty(strD)) {
                str = str + gv5.CONNECT_STR + h("bizcontext=", "");
            } else {
                int iIndexOf = str.indexOf(strD);
                str = str.substring(0, iIndexOf) + e(strD, "bizcontext=", "", true) + str.substring(iIndexOf + strD.length());
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public Context m() {
        return this.c;
    }

    public final String n(String str) {
        try {
            String strD = d(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(strD)) {
                return str + gv5.CONNECT_STR + h("bizcontext=\"", "\"");
            }
            if (!strD.endsWith("\"")) {
                strD = strD + "\"";
            }
            int iIndexOf = str.indexOf(strD);
            return str.substring(0, iIndexOf) + e(strD, "bizcontext=\"", "\"", false) + str.substring(iIndexOf + strD.length());
        } catch (Throwable unused) {
            return str;
        }
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
