package lh;

import am.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import nh.d;
import nh.n;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.json.JSONObject;
import wg.c;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f112378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f112380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f112381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f112382g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f112383h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f112384i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActivityInfo f112385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f112386k;

    /* JADX INFO: renamed from: lh.a$a, reason: collision with other inner class name */
    public static final class C2158a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f112387a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f112388b = new HashMap<>();

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f112387a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void b(a aVar, Intent intent) {
            if (aVar != null) {
                UUID uuidRandomUUID = UUID.randomUUID();
                f112387a.put(uuidRandomUUID, aVar);
                intent.putExtra("i_uuid_b_c", uuidRandomUUID);
            }
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        ActivityInfo activityInfo;
        int iMyUid;
        String str4;
        this.f112376a = "";
        this.f112377b = "";
        String str5 = null;
        this.f112378c = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.f112386k = new c(context, zIsEmpty);
        try {
            str3 = "EP1" + n.r(String.format(Locale.getDefault(), "%s%s%d%s", str == null ? "" : str, "", Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())) + "_" + System.currentTimeMillis();
        } catch (Throwable unused) {
            str3 = "-";
        }
        this.f112379d = str3;
        this.f112380e = SystemClock.elapsedRealtime();
        try {
            Process.myUid();
        } catch (Throwable th3) {
            d.a(th3);
        }
        try {
            if (!(context instanceof Activity)) {
                activityInfo = null;
                break;
            }
            Activity activity = (Activity) context;
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            int length = activityInfoArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    activityInfo = null;
                    break;
                }
                activityInfo = activityInfoArr[i14];
                if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                    break;
                } else {
                    i14++;
                }
            }
        } catch (Throwable th4) {
            d.a(th4);
        }
        this.f112385j = activityInfo;
        this.f112381f = str2;
        if (!zIsEmpty) {
            StringBuilder sbI = sn.a.i(str2, "|");
            sbI.append(this.f112379d);
            wg.a.c(this, "biz", "eptyp", sbI.toString());
            if (activityInfo != null) {
                str4 = activityInfo.name + "|" + activityInfo.launchMode;
            } else {
                str4 = BuildConfig.TRAVIS;
            }
            wg.a.c(this, "biz", "actInfo", str4);
            try {
                str5 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.build.fingerprint");
            } catch (Exception e4) {
                wg.a.g(this, "biz", "rflex", e4.getClass().getSimpleName());
            }
            wg.a.c(this, "biz", StringLookupFactory.KEY_SYS, str5);
            wg.a.c(this, "biz", "sdkv", "35f627f-clean");
        }
        try {
            this.f112378c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f112376a = packageInfo.versionName;
            this.f112377b = packageInfo.packageName;
        } catch (Exception e14) {
            d.a(e14);
        }
        if (!zIsEmpty) {
            StringBuilder sb3 = new StringBuilder("u");
            try {
                iMyUid = Process.myUid();
            } catch (Throwable th5) {
                d.a(th5);
                iMyUid = -200;
            }
            sb3.append(iMyUid);
            wg.a.b(sb3.toString(), this);
            wg.a.c(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            wg.a.a(str, this.f112379d, context, this);
        }
        if (zIsEmpty || !ah.a.g().f3258n) {
            return;
        }
        ah.a.g().c(this, this.f112378c, true, 2);
    }

    public static String b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            if (!TextUtils.isEmpty(strArrSplit[i14]) && strArrSplit[i14].startsWith(str3)) {
                return strArrSplit[i14];
            }
        }
        return null;
    }

    public static HashMap<String, String> d(a aVar) {
        HashMap<String, String> map = new HashMap<>();
        if (aVar != null) {
            map.put("sdk_ver", "15.8.30");
            map.put("app_name", aVar.f112377b);
            map.put("token", aVar.f112379d);
            map.put("call_type", aVar.f112381f);
            map.put("ts_api_invoke", String.valueOf(aVar.f112380e));
            JSONObject jSONObject = ah.a.g().f3266v;
            if (jSONObject != null) {
                wg.a.c(aVar, "biz", "ap_r", jSONObject.optString("ap_r"));
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map2.put(next, jSONObject.optString(next));
                    } catch (Throwable th3) {
                        d.a(th3);
                    }
                }
                map.putAll(map2);
            }
        }
        return map;
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            try {
                JSONObject jSONObject = new JSONObject(str.substring(19));
                jSONObject.put("bizcontext", c(new JSONObject(jSONObject.optString("bizcontext"))));
                return "new_external_info==" + jSONObject.toString();
            } catch (Throwable unused) {
                return str;
            }
        }
        if (!str.contains("\"&")) {
            try {
                String strB = b(str, "&", "bizcontext=");
                if (TextUtils.isEmpty(strB)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("&");
                    sb3.append("bizcontext=" + c(new JSONObject()) + "");
                    return sb3.toString();
                }
                int iIndexOf = str.indexOf(strB);
                return str.substring(0, iIndexOf) + e(strB, "bizcontext=", "") + str.substring(iIndexOf + strB.length());
            } catch (Throwable th3) {
                wg.a.e(this, "fmt1", th3, str);
                return str;
            }
        }
        try {
            String strB2 = b(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(strB2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("&");
                sb4.append("bizcontext=\"" + c(new JSONObject()) + "\"");
                return sb4.toString();
            }
            if (!strB2.endsWith("\"")) {
                strB2 = strB2.concat("\"");
            }
            int iIndexOf2 = str.indexOf(strB2);
            return str.substring(0, iIndexOf2) + e(strB2, "bizcontext=\"", "\"") + str.substring(iIndexOf2 + strB2.length());
        } catch (Throwable th4) {
            wg.a.e(this, "fmt2", th4, str);
            return str;
        }
    }

    public final String c(JSONObject jSONObject) {
        Object obj;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", "2014052600006128");
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.30");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.f112377b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f112376a);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ap_link_token", this.f112379d);
                } catch (Throwable unused) {
                }
                jSONObject.put("extInfo", jSONObject2);
            }
            if (!jSONObject.has("act_info")) {
                ActivityInfo activityInfo = this.f112385j;
                if (activityInfo != null) {
                    obj = activityInfo.name + "|" + activityInfo.launchMode;
                } else {
                    obj = BuildConfig.TRAVIS;
                }
                jSONObject.put("act_info", obj);
            }
            return jSONObject.toString();
        } catch (Throwable th3) {
            wg.a.e(this, "fmt3", th3, String.valueOf(jSONObject));
            d.a(th3);
            return jSONObject.toString();
        }
    }

    public final String e(String str, String str2, String str3) {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z14 = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            z14 = true;
            jSONObject = new JSONObject(fb1.c.m(1, 1, strSubstring2));
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strC = c(jSONObject);
        if (z14) {
            strC = j.m("\"", strC, "\"");
        }
        return e5.g(str2, strC, str3);
    }
}
