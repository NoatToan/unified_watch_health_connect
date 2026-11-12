package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1 {
    public static void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            jSONObject.put(RemoteMessageConst.MessageBody.PARAM, str);
            jSONObject.put("size", str2.length());
            jSONObject.put("id_u", j1.a().o);
        } catch (JSONException unused) {
            HiLog.d("MRUtils", "event_pm exception");
        }
        b("mc_102", jSONObject);
    }

    public static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", str);
            jSONObject.put("id_u", j1.a().o);
        } catch (JSONException unused) {
            HiLog.d("MRUtils", "event_r exception");
        }
        b("mc_100", jSONObject);
    }

    public static void b(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", str);
            jSONObject.put("code", i);
            jSONObject.put("id_u", j1.a().o);
        } catch (JSONException unused) {
            HiLog.d("MRUtils", "event_r exception");
        }
        b("mc_103", jSONObject);
    }

    public static void a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id_u", j1.a().o);
        } catch (JSONException unused) {
            HiLog.d("MRUtils", "event_c exception");
        }
        b(str, jSONObject);
    }

    public static void b(String str, JSONObject jSONObject) {
        j1 j1VarA = j1.a();
        if (j1VarA.t.isEmpty() || j1VarA.t.contains(str)) {
            return;
        }
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_metric_mc");
        if (instanceByTag == null) {
            HiLog.w("MRUtils", "metric instance is null");
        } else {
            instanceByTag.onEventSync(0, str, jSONObject);
        }
    }

    public static void a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", i);
            jSONObject.put("id_u", j1.a().o);
        } catch (JSONException unused) {
            HiLog.d("MRUtils", "event_r exception");
        }
        b(str, jSONObject);
    }

    public static boolean a() {
        return System.currentTimeMillis() - c2.a("global_v2", "lastMetricReportTime", 0L) < j1.a().f11560c;
    }

    public static void b() {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_metric_mc");
        if (instanceByTag == null) {
            HiLog.w("MRUtils", "metric instance is null");
            e0.a();
            instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_metric_mc");
        }
        String strA = c2.a("global_v2", "sdkReportUrl");
        if (!TextUtils.isEmpty(strA)) {
            k.b().getClass();
            ((q0) k.f11563b.get("ha_metric_mc")).f11601b.e = strA;
        }
        instanceByTag.onReport(0);
        c2.b("global_v2", "lastMetricReportTime", System.currentTimeMillis());
    }

    public static boolean a(long j) {
        return System.currentTimeMillis() - j >= TimeUnit.DAYS.toMillis(7L);
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            j.a(EnvUtils.getAppContext()).deleteMcInfo(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        j.a(EnvUtils.getAppContext()).deleteMcTag(arrayList2);
    }

    public static void a(String str, JSONObject jSONObject) {
        int i = j1.a().f11559b;
        if (i == 1) {
            String strA = c2.a("global_v2", str);
            if (TextUtils.isEmpty(strA)) {
                strA = UUID.randomUUID().toString().replace(Constants.LINK, "");
                c2.a("global_v2", str, strA);
            }
            jSONObject.put("uuid", strA);
            return;
        }
        if (i == 2) {
            if (TextUtils.equals("uuid_metric_info", str)) {
                jSONObject.put("udid", s.a());
                return;
            }
            String strA2 = c2.a("global_v2", str);
            if (TextUtils.isEmpty(strA2)) {
                strA2 = UUID.randomUUID().toString().replace(Constants.LINK, "");
                c2.a("global_v2", str, strA2);
            }
            jSONObject.put("uuid", strA2);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                HiLog.w("MRUtils", "error idFlag");
                return;
            } else {
                jSONObject.put("udid", s.a());
                return;
            }
        }
        if (!TextUtils.equals("uuid_metric_info", str)) {
            jSONObject.put("udid", s.a());
            return;
        }
        String strA3 = c2.a("global_v2", str);
        if (TextUtils.isEmpty(strA3)) {
            strA3 = UUID.randomUUID().toString().replace(Constants.LINK, "");
            c2.a("global_v2", str, strA3);
        }
        jSONObject.put("uuid", strA3);
    }

    public static void a(JSONObject jSONObject, l1 l1Var) {
        jSONObject.put("mc_duration", l1Var.e);
        jSONObject.put("play_start_time", l1Var.g);
        jSONObject.put("play_duration", l1Var.h);
        jSONObject.put("favorite_state", l1Var.i);
        jSONObject.put("package_name", l1Var.j);
    }
}
