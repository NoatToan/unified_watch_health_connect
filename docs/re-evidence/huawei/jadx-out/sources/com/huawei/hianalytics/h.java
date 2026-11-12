package com.huawei.hianalytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.hihonor.android.os.SystemPropertiesEx;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.kit.HiAnalyticsClientImpl;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final h d = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11543c;

    public h() {
        this.f11543c = 86400000L;
        synchronized (this) {
            try {
                String strA = c2.a("global_v2", "ha_config");
                if (TextUtils.isEmpty(strA)) {
                    HiLog.i("ConfigHandler", "ha config is empty");
                    this.f11543c = 86400000L;
                    this.f11541a = false;
                    this.f11542b = false;
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(strA);
                    this.f11543c = jSONObject.optLong("requestInterval", 86400000L);
                    this.f11541a = jSONObject.optBoolean("enableCheckTime", false);
                    this.f11542b = jSONObject.optBoolean("enableCheckOaid", false);
                } catch (JSONException unused) {
                    this.f11543c = 86400000L;
                    this.f11541a = false;
                    this.f11542b = false;
                    HiLog.w("ConfigHandler", "ha config failed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: all -> 0x0143, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[Catch: all -> 0x0143, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[Catch: all -> 0x0143, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:42:0x008b, B:44:0x009d), top: B:74:0x008b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[Catch: all -> 0x0143, PHI: r0
      0x00ab: PHI (r0v6 boolean) = (r0v2 boolean), (r0v2 boolean), (r0v2 boolean), (r0v5 boolean) binds: [B:40:0x0088, B:46:0x00a4, B:43:0x009b, B:44:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:16:0x0035, B:24:0x0059, B:26:0x005f, B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:39:0x0084, B:47:0x00ab, B:50:0x00c6, B:52:0x00cc, B:63:0x012f, B:62:0x011b, B:67:0x013e, B:46:0x00a4, B:19:0x0044, B:21:0x004f, B:15:0x002e, B:42:0x008b, B:44:0x009d, B:55:0x00d3, B:59:0x00ff, B:5:0x000a, B:7:0x0010, B:8:0x0017, B:10:0x001d), top: B:73:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ab, please report this as an issue */
    public final void a() {
        long jA;
        Context appContext;
        Bundle bundle;
        boolean z;
        synchronized (this) {
            HiLog.i("ConfigHandler", "start requestConfig");
            boolean zContainsKey = false;
            try {
                if (!t.c()) {
                    if (t.b()) {
                        z = SystemPropertiesEx.getBoolean("hw_sc.anco.enable", false);
                    } else {
                        jA = c2.a("global_v2", "ha_config_last_request_time", 0L);
                        if (jA > 0 && System.currentTimeMillis() - jA <= this.f11543c) {
                            HiLog.i("ConfigHandler", "within request interval");
                            return;
                        }
                        if (!t.c()) {
                            a(401);
                            return;
                        }
                        if (!t.d()) {
                            HiLog.d("ConfigHandler", "not phone or pad");
                            return;
                        }
                        if (!t.a()) {
                            HiLog.d("ConfigHandler", "not China Rom");
                            return;
                        }
                        appContext = EnvUtils.getAppContext();
                        if (appContext == null) {
                            HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
                            if (y0.a() || !zContainsKey) {
                                a(402);
                                return;
                            }
                            if (EnvUtils.getAppContext() == null) {
                                a(403);
                                return;
                            }
                            try {
                                HiAnalyticsClientImpl hiAnalyticsClientImpl = new HiAnalyticsClientImpl(EnvUtils.getAppContext(), new s0());
                                hiAnalyticsClientImpl.setApiLevel(1);
                                hiAnalyticsClientImpl.setKitSdkVersion(1);
                                Task<t0> haConfig = hiAnalyticsClientImpl.getHaConfig(new i0(k.b().a().f));
                                if (haConfig == null) {
                                    return;
                                }
                                haConfig.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hianalytics.h$$ExternalSyntheticLambda0
                                    @Override // com.huawei.hmf.tasks.OnFailureListener
                                    public final void onFailure(Exception exc) {
                                        HiLog.w("ConfigHandler", "request ha config failed");
                                    }
                                }).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hianalytics.h$$ExternalSyntheticLambda1
                                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        this.f$0.a((t0) obj);
                                    }
                                }).addOnCompleteListener(new OnCompleteListener() { // from class: com.huawei.hianalytics.h$$ExternalSyntheticLambda2
                                    @Override // com.huawei.hmf.tasks.OnCompleteListener
                                    public final void onComplete(Task task) {
                                        this.f$0.a(task);
                                    }
                                });
                                c2.b("global_v2", "ha_config_last_request_time", System.currentTimeMillis());
                                return;
                            } catch (Throwable th) {
                                HiLog.e("ConfigHandler", "request ha config error: ".concat(th.getClass().getSimpleName()));
                            }
                        } else {
                            try {
                                bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
                                if (bundle != null) {
                                    HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
                                    if (y0.a()) {
                                    }
                                    a(402);
                                    return;
                                }
                                zContainsKey = bundle.containsKey("com.huawei.hms.client.appid");
                                HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
                                if (y0.a()) {
                                }
                                a(402);
                                return;
                            } catch (Throwable unused) {
                                HiLog.w("HmsBaseExist", "applicationInfo not found");
                            }
                        }
                    }
                    throw th;
                }
                z = com.huawei.android.os.SystemPropertiesEx.getBoolean("hw_sc.anco.enable", false);
                if (z) {
                    HiLog.i("ConfigHandler", "is DH");
                    return;
                }
            } catch (Throwable unused2) {
                HiLog.e("DeviceUtil", "get hw_sc property error");
            }
            jA = c2.a("global_v2", "ha_config_last_request_time", 0L);
            if (jA > 0) {
                HiLog.i("ConfigHandler", "within request interval");
                return;
            }
            if (!t.c()) {
                a(401);
                return;
            }
            if (!t.d()) {
                HiLog.d("ConfigHandler", "not phone or pad");
                return;
            }
            if (!t.a()) {
                HiLog.d("ConfigHandler", "not China Rom");
                return;
            }
            appContext = EnvUtils.getAppContext();
            if (appContext == null) {
                HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
                if (y0.a()) {
                }
                a(402);
                return;
            }
            bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
            if (bundle != null) {
                HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
                if (y0.a()) {
                }
                a(402);
                return;
            }
            zContainsKey = bundle.containsKey("com.huawei.hms.client.appid");
            HiLog.i("HmsBaseExist", "contains appId: " + zContainsKey);
            if (y0.a()) {
            }
            a(402);
            return;
            throw th;
        }
    }

    public final void a(t0 t0Var) {
        String str = t0Var.f11605a;
        if (TextUtils.isEmpty(str)) {
            HiLog.i("ConfigHandler", "request ha config failed, rsp is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("status") != 200) {
                HiLog.i("ConfigHandler", "request ha config status code 500");
                return;
            }
            this.f11543c = jSONObject.optLong("requestInterval", 86400000L);
            this.f11541a = jSONObject.optBoolean("enableCheckTime", false);
            this.f11542b = jSONObject.optBoolean("enableCheckOaid", false);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("requestInterval", this.f11543c);
            jSONObject2.put("enableCheckTime", this.f11541a);
            jSONObject2.put("enableCheckOaid", this.f11542b);
            c2.a("global_v2", "ha_config", jSONObject2.toString());
            HiLog.i("ConfigHandler", "request ha config success");
        } catch (Throwable unused) {
            HiLog.w("ConfigHandler", "request ha config failed, exception occur");
        }
    }

    public final void a(Task task) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!task.isSuccessful()) {
                jSONObject.put("status", task.getException().getMessage());
            } else {
                t0 t0Var = (t0) task.getResult();
                if (t0Var == null || (str = t0Var.f11605a) == null) {
                    str = "";
                }
                jSONObject = new JSONObject(str);
            }
        } catch (Throwable unused) {
            HiLog.e("ConfigHandler", "report request ha config");
        }
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
        if (instanceByTag == null) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (!TextUtils.isEmpty(jSONObject.optString("message"))) {
            linkedHashMap.put("$code", String.valueOf(jSONObject.optInt("status")));
            linkedHashMap.put("$message", jSONObject.optString("message"));
        } else {
            linkedHashMap.put("$code", jSONObject.optString("status"));
        }
        instanceByTag.onEvent(1, "$request_ha_config", linkedHashMap);
    }

    public static void a(int i) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
        if (instanceByTag == null) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("$code", String.valueOf(i));
        switch (i) {
            case 401:
                linkedHashMap.put("$message", "QoES request failed because device is not Huawei device");
                break;
            case 402:
                linkedHashMap.put("$message", "QoES request failed because hms base is not exist");
                break;
            case 403:
                linkedHashMap.put("$message", "QoES request failed because context is null");
                break;
        }
        instanceByTag.onEvent(1, "$request_ha_config", linkedHashMap);
    }
}
