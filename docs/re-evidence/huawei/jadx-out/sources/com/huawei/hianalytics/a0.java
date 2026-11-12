package com.huawei.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.framework.HAFrameworkInstance;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.utils.JsonUtils;
import com.huawei.hianalytics.process.HaEvent;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements HiAnalyticsInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f11448a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HAFrameworkInstance f11450c;
    public long d;
    public ICallback e;

    public a0(String str) {
        this.f11449b = str;
        try {
            this.f11450c = new HAFrameworkInstance.Builder().setStorageHandler(j.a(EnvUtils.getAppContext())).setStoragePolicy(new u0(str)).setCollectorConfig(new d0(str)).setMandatoryParameters(new r0()).build(str);
        } catch (Exception unused) {
            HiLog.e("HAImpl", "init HAImpl create frameworkInstance failed");
        }
    }

    public final void a(HiAnalyticsConfig hiAnalyticsConfig) {
        if (hiAnalyticsConfig != null) {
            this.f11448a.f11600a = hiAnalyticsConfig.config;
        } else {
            HiLog.w("HAImpl", "config for maint is null, tag: " + this.f11449b);
            this.f11448a.f11600a = null;
        }
    }

    public final void b(HiAnalyticsConfig hiAnalyticsConfig) {
        if (hiAnalyticsConfig != null) {
            this.f11448a.f11601b = hiAnalyticsConfig.config;
        } else {
            this.f11448a.f11601b = null;
            HiLog.w("HAImpl", "config for oper is null, tag: " + this.f11449b);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void clearData() {
        this.f11450c.clearCacheDataByTag();
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void disableAutoReport() {
        if (b.d == null) {
            b.d = new b();
        }
        b bVar = b.d;
        String str = this.f11449b;
        bVar.getClass();
        b.e.remove(str);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final String getOAID(int i) {
        x xVarA = g1.a(this.f11449b, a(i));
        return xVarA != null ? xVarA.f : "";
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final String getUDID(int i) {
        x xVarB = b(i);
        if (xVarB == null) {
            HiLog.sw("DeviceUtil", "config is null");
            return "";
        }
        y yVar = xVarB.l;
        if (yVar == null) {
            yVar = new y();
        }
        String str = yVar.f;
        String str2 = str != null ? str : "";
        return (TextUtils.isEmpty(str2) && yVar.f11728c) ? s.a() : str2;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final String getUUID(int i) {
        q qVarA = q.a();
        String str = this.f11449b;
        String strA = a(i);
        qVarA.getClass();
        return p0.a(str, strA);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void newInstanceUUID() {
        String strA = c2.a("global_v2", this.f11449b);
        if (TextUtils.isEmpty(strA)) {
            strA = UUID.randomUUID().toString().replace(Constants.LINK, "");
            c2.a("global_v2", this.f11449b, strA);
        } else if (strA.length() > 32) {
            String strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Uuid_Sp_Key", strA);
            if (!TextUtils.isEmpty(strDecrypt)) {
                c2.a("global_v2", this.f11449b, strDecrypt);
                strA = strDecrypt;
            }
        }
        q0 q0Var = this.f11448a;
        x xVar = q0Var.f11601b;
        if (xVar != null) {
            xVar.f11723a = strA;
        }
        x xVar2 = q0Var.f11600a;
        if (xVar2 != null) {
            xVar2.f11723a = strA;
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onBackground(long j) {
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(Context context, String str, String str2) {
        if (!v1.a(65536, "value", str2)) {
            HiLog.sw("HAImpl", "value error. tag: " + this.f11449b);
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.put(jSONObject, "_constants", str2);
        onEvent(0, str, jSONObject);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEventSync(int i, String str, JSONObject jSONObject) {
        HiLog.si("HAImpl", "onEventSync. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
        if (a(i, str)) {
            return;
        }
        this.f11450c.onEventSync(a(i), str, jSONObject);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onForeground(long j) {
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onPause(Context context) {
        onPause(context, (LinkedHashMap) null);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onReport(int i) {
        HiLog.si("HAImpl", "onReport. tag:" + this.f11449b + ", type:" + i);
        if (j2.f11561b.a()) {
            this.f11450c.onReport(a(i));
            return;
        }
        HiLog.sw("HAImpl", "user locked. tag: " + this.f11449b + ", type: " + i);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onResume(Context context) {
        onResume(context, (LinkedHashMap) null);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onStreamEvent(int i, String str, JSONObject jSONObject) {
        HiLog.si("HAImpl", "onStreamEvent. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
        if (a(i, str)) {
            return;
        }
        this.f11450c.onStreamEvent(a(i), str, jSONObject, this.e);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void refresh(int i, HiAnalyticsConfig hiAnalyticsConfig) {
        HiAnalyticsConfig hiAnalyticsConfig2;
        a0 a0VarA;
        if (hiAnalyticsConfig == null) {
            HiLog.si("HAImpl", "config is null. tag: " + this.f11449b + ", type: " + i);
            hiAnalyticsConfig2 = null;
        } else {
            hiAnalyticsConfig2 = new HiAnalyticsConfig(hiAnalyticsConfig);
        }
        if (i == 0) {
            b(hiAnalyticsConfig2);
        } else if (i != 1) {
            HiLog.sw("HAImpl", "wrong type. tag: " + this.f11449b);
        } else {
            a(hiAnalyticsConfig2);
        }
        if (hiAnalyticsConfig2 != null && hiAnalyticsConfig2.config != null && (a0VarA = j0.a().a("ha_default_collection")) != null) {
            HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(hiAnalyticsConfig2.config.e).setHttpHeader(hiAnalyticsConfig2.config.m).setAutoReportThresholdSize(100).build();
            if (i == 0) {
                a0VarA.b(hiAnalyticsConfigBuild);
            } else if (i != 1) {
                HiLog.i("HACU", "wrong type");
            } else {
                a0VarA.a(hiAnalyticsConfigBuild);
            }
        }
        e0.a(i, hiAnalyticsConfig2);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setAccountBrandId(String str) {
        if (!v1.a(256, "accountBrandId", str)) {
            str = "";
        }
        String str2 = this.f11449b;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str2);
        if (q0Var == null) {
            return;
        }
        q0Var.f = str;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setAppBrandId(String str) {
        if (!v1.a(256, "appBrandId", str)) {
            str = "";
        }
        String str2 = this.f11449b;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str2);
        if (q0Var == null) {
            return;
        }
        q0Var.d = str;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setCallback(ICallback iCallback) {
        if (iCallback == null) {
            return;
        }
        this.e = iCallback;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setCommonProp(int i, Map map) {
        if (!v1.a(map)) {
            HiLog.sw("HAImpl", "common prop error. tag: " + this.f11449b + ", type: " + i);
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        x xVarB = b(i);
        if (xVarB != null) {
            xVarB.o = String.valueOf(jSONObject);
            return;
        }
        HiLog.sw("HAImpl", "no related config found. tag: " + this.f11449b + ", type: " + i);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setHandsetManufacturer(String str) {
        if (!v1.a(256, "handsetManufacturer", str)) {
            str = "";
        }
        String str2 = this.f11449b;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str2);
        if (q0Var == null) {
            return;
        }
        q0Var.g = str;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setHansetBrandId(String str) {
        if (!v1.a(256, "hansetBrandId", str)) {
            str = "";
        }
        String str2 = this.f11449b;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str2);
        if (q0Var == null) {
            return;
        }
        q0Var.e = str;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setOAID(int i, String str) {
        x xVarB = b(i);
        if (xVarB == null) {
            HiLog.sw("HAImpl", "no related config found. tag: " + this.f11449b + ", type: " + i);
            return;
        }
        if (!v1.a(4096, "oaid", str)) {
            str = "";
        }
        xVarB.f = str;
        if (TextUtils.isEmpty(str)) {
            c2.a("global_v2", this.f11449b + "_" + i + "_oaid", "");
            return;
        }
        c2.a("global_v2", this.f11449b + "_" + i + "_oaid", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", str));
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setOAIDTrackingFlag(int i, boolean z) {
        x xVarB = b(i);
        if (xVarB != null) {
            xVarB.g = z ? "true" : "false";
            return;
        }
        HiLog.sw("HAImpl", "no related config found. tag: " + this.f11449b + ", type: " + i);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setUpid(int i, String str) {
        x xVarB = b(i);
        if (xVarB != null) {
            if (!v1.a(4096, "upid", str)) {
                str = "";
            }
            xVarB.h = str;
        } else {
            HiLog.sw("HAImpl", "no related config found. tag: " + this.f11449b + ", type: " + i);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final String getCollectUrl() {
        q0 q0Var = this.f11448a;
        x xVar = q0Var.f11601b;
        String str = xVar != null ? xVar.e : "";
        x xVar2 = q0Var.f11600a;
        String str2 = xVar2 != null ? xVar2.e : "";
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return "";
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
            return TextUtils.isEmpty(str) ? str2 : str;
        }
        return "";
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onPause(Context context, LinkedHashMap linkedHashMap) {
        if (context != null) {
            onPause(context.getClass().getCanonicalName(), linkedHashMap);
            return;
        }
        HiLog.sw("HAImpl", "context is null. tag: " + this.f11449b);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onResume(Context context, LinkedHashMap linkedHashMap) {
        if (context != null) {
            a(context.getClass().getCanonicalName(), linkedHashMap, "$AppOnResume", "OnResume");
            return;
        }
        HiLog.sw("HAImpl", "context is null. tag: " + this.f11449b);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void setAppid(String str) {
        if (!v1.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}")) {
            str = "";
        }
        String str2 = this.f11449b;
        k.b().getClass();
        q0 q0Var = (q0) k.f11563b.get(str2);
        if (q0Var == null) {
            return;
        }
        q0Var.f11602c = str;
    }

    public static JSONObject a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMapA = v1.a(linkedHashMap, 10, 128L, 512L, "x_");
        if (linkedHashMapA == null) {
            return new JSONObject();
        }
        return w0.a(linkedHashMapA);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onPause(String str, LinkedHashMap linkedHashMap) {
        a(str, linkedHashMap, "$AppOnPause", "OnPause");
        this.d = 0L;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onStreamEvent(int i, String str, LinkedHashMap linkedHashMap) {
        onStreamEvent(i, str, b(linkedHashMap));
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onReport(Context context, int i) {
        onReport(i);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onResume(String str, LinkedHashMap linkedHashMap) {
        a(str, linkedHashMap, "$AppOnResume", "OnResume");
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onStreamEvent(int i, String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        HiLog.si("HAImpl", "onStreamEvent Ex. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
        if (a(i, str)) {
            return;
        }
        this.f11450c.onStreamEvent(a(i), str, b(linkedHashMap), a(linkedHashMap2), a(linkedHashMap3), this.e);
    }

    public final x b(int i) {
        if (i == 0) {
            return this.f11448a.f11601b;
        }
        if (i != 1) {
            return null;
        }
        return this.f11448a.f11600a;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(int i, String str, LinkedHashMap linkedHashMap) {
        onEvent(i, str, b(linkedHashMap));
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(String str, LinkedHashMap linkedHashMap) {
        onEvent(0, str, b(linkedHashMap));
    }

    public final boolean a(int i, String str) {
        if (!j2.f11561b.a()) {
            HiLog.sw("HAImpl", "user locked. tag: " + this.f11449b + ", type: " + i);
            return true;
        }
        if (!v1.a(256, EventMonitorRecord.EVENT_ID, str)) {
            HiLog.sw("HAImpl", "eventId error. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
            return true;
        }
        if (this.f11450c != null) {
            return false;
        }
        HiLog.sw("HAImpl", "framework instance is null. tag:" + this.f11449b + ", type:" + i);
        return true;
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(int i, String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        HiLog.si("HAImpl", "onEventEx. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
        if (a(i, str)) {
            return;
        }
        this.f11450c.onEvent(a(i), str, b(linkedHashMap), a(linkedHashMap2), a(linkedHashMap3), this.e);
    }

    public static JSONObject b(LinkedHashMap linkedHashMap) {
        if (v1.a(linkedHashMap)) {
            return w0.a(linkedHashMap);
        }
        return new JSONObject();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c A[Catch: JSONException -> 0x0057, TryCatch #0 {JSONException -> 0x0057, blocks: (B:20:0x0046, B:22:0x004c, B:23:0x0051), top: B:30:0x0046 }] */
    public final void a(String str, LinkedHashMap linkedHashMap, String str2, String str3) {
        long jCurrentTimeMillis;
        JSONObject jSONObjectA;
        if (!TextUtils.isEmpty(str) && v1.a("viewName", str, "[a-zA-Z_][a-zA-Z0-9. _-]{0,255}")) {
            try {
                if ("OnResume".equals(str3)) {
                    this.d = System.currentTimeMillis();
                } else {
                    jCurrentTimeMillis = "OnPause".equals(str3) ? System.currentTimeMillis() - this.d : 0L;
                    if (!v1.a(linkedHashMap)) {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap == null) {
                        jSONObjectA = new JSONObject();
                    } else {
                        jSONObjectA = w0.a(linkedHashMap);
                    }
                    if ("OnPause".equals(str3)) {
                        jSONObjectA.put("_event_duration", jCurrentTimeMillis);
                    }
                    jSONObjectA.put("_activity_name", str);
                    onEvent(0, str2, jSONObjectA);
                    return;
                }
                if ("OnPause".equals(str3)) {
                    jSONObjectA.put("_event_duration", jCurrentTimeMillis);
                }
                jSONObjectA.put("_activity_name", str);
            } catch (JSONException unused) {
                HiLog.e("BasicEvents", "json exception");
            }
            if (!v1.a(linkedHashMap)) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                jSONObjectA = new JSONObject();
            } else {
                jSONObjectA = w0.a(linkedHashMap);
            }
            onEvent(0, str2, jSONObjectA);
            return;
        }
        HiLog.sw("HAImpl", "viewName error. tag: " + this.f11449b + ", type: " + str3);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(int i, String str, JSONObject jSONObject) {
        HiLog.si("HAImpl", "onEvent. tag:" + this.f11449b + ", type:" + i + ", eventId:" + str);
        if (a(i, str)) {
            return;
        }
        this.f11450c.onEvent(a(i), str, jSONObject, this.e);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public final void onEvent(int i, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() > 100) {
            HiLog.w("HAImpl", "events size more than 100. tag: " + this.f11449b + ", type: " + i);
            return;
        }
        ArrayList<HaEvent> arrayList = new ArrayList(list);
        JSONArray jSONArray = new JSONArray();
        for (HaEvent haEvent : arrayList) {
            if (haEvent != null && v1.a(256, EventMonitorRecord.EVENT_ID, haEvent.f11595a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("event", haEvent.f11595a);
                    jSONObject.put(Event.EventConstants.PROPERTIES, haEvent.f11596b);
                    jSONObject.put(Event.EventConstants.RECORD_TIME, haEvent.f11597c);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() == 0) {
            return;
        }
        if (jSONArray.length() == 1) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
            onEvent(i, jSONObjectOptJSONObject.optString("event"), jSONObjectOptJSONObject.optJSONObject(Event.EventConstants.PROPERTIES));
        } else {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.put(jSONObject2, Event.EventConstants.EVENTS, jSONArray);
            JsonUtils.put(jSONObject2, Event.EventConstants.SUB_COUNT, Integer.valueOf(jSONArray.length()));
            onEvent(i, Event.EventConstants.EVENT_ID_AGGREGATE, jSONObject2);
        }
    }

    public static String a(int i) {
        if (i == 0) {
            return "oper";
        }
        if (i != 1) {
            return "allType";
        }
        return "maint";
    }
}
