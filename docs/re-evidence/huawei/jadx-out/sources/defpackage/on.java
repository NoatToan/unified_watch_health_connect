package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class on {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f44354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44355c;
    public final long d;
    public String e;
    public String g;
    public final int h;
    public String i;
    public final String j;
    public final ActivityInfo k;
    public final mw n;
    public boolean f = false;
    public boolean o = false;
    public boolean m = false;

    public on(Context context, String str, String str2) {
        String str3;
        this.f44355c = "";
        this.e = "";
        this.f44354b = null;
        this.i = null;
        this.g = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.n = new mw(context, zIsEmpty);
        String strE = e(str, this.e);
        this.f44353a = strE;
        this.d = SystemClock.elapsedRealtime();
        this.h = ox.j();
        ActivityInfo activityInfoB = ox.b(context);
        this.k = activityInfoB;
        this.j = str2;
        if (!zIsEmpty) {
            mu.d(this, "biz", "eptyp", str2 + "|" + strE);
            if (activityInfoB != null) {
                str3 = activityInfoB.name + "|" + activityInfoB.launchMode;
            } else {
                str3 = Constants.NULL;
            }
            mu.d(this, "biz", "actInfo", str3);
            mu.d(this, "biz", NotificationCompat.CATEGORY_SYSTEM, ox.e(this));
            mu.d(this, "biz", "sdkv", "917689b-clean");
            mu.d(this, "biz", "registerApp", jz.f39239a + "");
        }
        try {
            this.f44354b = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f44355c = packageInfo.versionName;
            this.e = packageInfo.packageName;
        } catch (Exception e) {
            oq.c(e);
        }
        if (!zIsEmpty) {
            mu.b(this, "biz", "u" + ox.j());
            mu.d(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            mu.d(context, this, str, this.f44353a);
        }
        if (!zIsEmpty && mx.c().x()) {
            mx.c().a(this, this.f44354b, true, 2);
        }
        if (mx.c().a(null)) {
            return;
        }
        this.i = or.d(this, c(), "sp_preheatUserToken", "");
        this.g = c(str, this.e);
    }

    public static on d() {
        return null;
    }

    public String a() {
        return this.f44355c;
    }

    public final String a(String str) {
        try {
            String strD = d(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(strD)) {
                return str + "&" + b("bizcontext=\"", "\"");
            }
            if (!strD.endsWith("\"")) {
                strD = strD + "\"";
            }
            int iIndexOf = str.indexOf(strD);
            return str.substring(0, iIndexOf) + c(strD, "bizcontext=\"", "\"") + str.substring(iIndexOf + strD.length());
        } catch (Throwable th) {
            mu.e(this, "biz", "fmt2", th, str);
            return str;
        }
    }

    public String b() {
        return this.e;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            return c(str);
        }
        return g(str) ? e(str) : a(str);
    }

    public Context c() {
        return this.f44354b;
    }

    public boolean f() {
        return this.o;
    }

    public String g() {
        return this.g;
    }

    public final boolean g(String str) {
        return !str.contains("\"&");
    }

    public boolean h() {
        return this.f;
    }

    public boolean j() {
        return this.m;
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", d(jSONObject.optString("bizcontext")));
            return "new_external_info==" + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public final String c(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            jSONObject = new JSONObject(strSubstring2.substring(1, strSubstring2.length() - 1));
            z = true;
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strD = d(jSONObject);
        if (z) {
            strD = "\"" + strD + "\"";
        }
        return str2 + strD + str3;
    }

    public final String e(String str) {
        try {
            String strD = d(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(strD)) {
                return str + "&" + b("bizcontext=", "");
            }
            int iIndexOf = str.indexOf(strD);
            return str.substring(0, iIndexOf) + c(strD, "bizcontext=", "") + str.substring(iIndexOf + strD.length());
        } catch (Throwable th) {
            mu.e(this, "biz", "fmt1", th, str);
            return str;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final HashMap<UUID, on> f44356c = new HashMap<>();
        public static final HashMap<String, on> d = new HashMap<>();

        public static void d(on onVar, Intent intent) {
            if (onVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f44356c.put(uuidRandomUUID, onVar);
            intent.putExtra("i_uuid_b_c", uuidRandomUUID);
        }

        public static on d(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f44356c.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void c(on onVar, String str) {
            if (onVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            d.put(str, onVar);
        }

        public static on b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return d.remove(str);
        }
    }

    public static String c(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return ox.h(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        } catch (Throwable th) {
            oq.d("mspl", "generatePreheatTokenError");
            oq.c(th);
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

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.f44353a);
            if (e() && mx.c().c(null)) {
                jSONObject.put("preheatUserToken", this.i);
                jSONObject.put("preheatToken", this.g);
                jSONObject.put("preheatTime", System.currentTimeMillis() + "");
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String b(String str, String str2) {
        return str + d(new JSONObject()) + str2;
    }

    public final String d(String str) throws JSONException {
        return d(new JSONObject(str));
    }

    public String d(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", "2014052600006128");
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.35");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.e);
            }
            if (!jSONObject.has(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO)) {
                jSONObject.put(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, this.f44355c);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                jSONObject.put("extInfo", i());
            }
            if (!jSONObject.has("act_info")) {
                if (this.k != null) {
                    str = this.k.name + "|" + this.k.launchMode;
                } else {
                    str = Constants.NULL;
                }
                jSONObject.put("act_info", str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            mu.e(this, "biz", "fmt3", th, String.valueOf(jSONObject));
            oq.c(th);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public static String e(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return String.format("EP%s%s_%s", "1", ox.h(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return com.huawei.openalliance.ad.constant.Constants.LINK;
        }
    }

    public void b(boolean z) {
        this.m = z;
    }

    public static HashMap<String, String> d(on onVar) {
        HashMap<String, String> map = new HashMap<>();
        if (onVar != null) {
            map.put("sdk_ver", "15.8.35");
            map.put("app_name", onVar.e);
            map.put("token", onVar.f44353a);
            map.put("call_type", onVar.j);
            map.put("ts_api_invoke", String.valueOf(onVar.d));
            om.e(onVar, map);
        }
        return map;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public void e(boolean z) {
        this.o = z;
    }

    public boolean e() {
        return !TextUtils.isEmpty(this.i);
    }
}
