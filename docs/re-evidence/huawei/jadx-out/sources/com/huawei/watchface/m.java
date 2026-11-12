package com.huawei.watchface;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hianalytics.v2.HiAnalyticsConf;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import com.tencent.connect.common.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes20.dex */
public class m {
    public static Map e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30289a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HiAnalyticsInstance f30290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f30291c;
    public static Executor d = Executors.newSingleThreadExecutor();
    public static final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f30294c;

        public a(int i, String str, LinkedHashMap linkedHashMap) {
            this.f30292a = i;
            this.f30293b = str;
            this.f30294c = linkedHashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.c()) {
                m.this.a(this.f30292a, this.f30293b, this.f30294c, false);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30295a;

        public b(int i) {
            this.f30295a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.c()) {
                m.this.b(this.f30295a);
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static m f30297a = new m();
    }

    public static Map b() {
        synchronized (m.class) {
            if (e == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                e = concurrentHashMap;
                concurrentHashMap.put("is_root", String.valueOf(CommonUtils.E()));
                e.put("appVersion", CommonUtils.c());
                e.put("androidVersion", Build.VERSION.RELEASE);
                e.put("phoneType", MobileInfoHelper.getDeviceName());
                e.put("is_HarmonyOs", String.valueOf(MobileInfoHelper.isHarmonyOs()));
            }
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
            if (hwWatchFaceApi == null) {
                return e;
            }
            e.put("is_login", hwWatchFaceApi.isLogin() ? "1" : "0");
            if (TextUtils.equals(hwWatchFaceApi.getCommonCountryCode(), "CN")) {
                e.put("user_id", hwWatchFaceApi.getUserId());
            } else {
                e.put("user_id", p3.c(hwWatchFaceApi.getUserId()));
            }
            e.put("softVersion", hwWatchFaceApi.getSoftVersion());
            e.put("deviceModel", hwWatchFaceApi.getDeviceModel());
            e.put("osType", MobileInfoHelper.isHarmonyOs() ? "0" : "1");
            e.put("osVersion", Build.VERSION.RELEASE);
            e.put("siteName", hwWatchFaceApi.getWatchfaceSiteForAll());
            e.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, String.valueOf(x2.c()));
            e.put("hmsVer", CommonUtils.h());
            e.put("ageGroup", String.valueOf(c2.a(Environment.getApplicationContext()).f()));
            e.put("userType", e5.c().d());
            e.put("run_in_background", CommonUtils.x() ? "1" : "0");
            e.put("connectStatus", String.valueOf(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectStateForAnalytics()));
            e.put("sessionId", b4.a().b());
            e.put("sdkVersion", q0.a());
            e.put("watchType", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchfaceModel());
            return e;
        }
    }

    public static m d() {
        return c.f30297a;
    }

    public static void g() {
        if (f.isEmpty()) {
            String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_UPLOAD_TLV_LIST, "[\"5.39.1\",\"5.39.2\",\"5.39.3\",\"5.39.5\",\"5.39.6\",\"5.39.8\",\"5.39.9\",\"5.39.15\",\"5.39.16\",\"5.39.17\",\"5.39.18\",\"5.39.19\",\"5.39.20\"]");
            HwLog.i("AnalyticsUtils", "loadUploadOmTlvWhiteList tlvListStr:" + systemParam);
            if (TextUtils.isEmpty(systemParam)) {
                a();
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(systemParam);
                for (int i = 0; i < jSONArray.length(); i++) {
                    f.add(jSONArray.getString(i));
                }
            } catch (Exception e2) {
                HwLog.e("AnalyticsUtils", "loadUploadOmTlvWhiteList Exception:" + HwLog.printException(e2));
            }
        }
    }

    public void a(Context context) {
        a(MobileInfoHelper.getVersion(), Environment.getApplicationContext());
        this.f30291c = context;
        d.execute(new Runnable() { // from class: com.huawei.watchface.m$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    public final boolean c() {
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        return (hwWatchFaceApi.isRelease() || hwWatchFaceApi.isBetaVersion()) && !ActivityManager.isUserAMonkey();
    }

    public final void e() {
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(this.f30291c);
        String commonCountryCode = hwWatchFaceApi.getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode)) {
            HwLog.i("AnalyticsUtils", "initConfig isHomeCountryEmpty is null");
            return;
        }
        HwLog.i("AnalyticsUtils", "homeCountry: " + commonCountryCode + " targetCountry: " + commonCountryCode);
        String strA = !TextUtils.isEmpty(commonCountryCode) ? v0.a().a(commonCountryCode, "hianalyticsV3", w0.a("hianalyticsV3")) : "";
        if (HiAnalyticsManager.getInitFlag("theme_ha_normal_tag")) {
            a(0);
            a(1);
        }
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(strA).setEnableUUID(true).setEnableUDID(true).setUdid(hwWatchFaceApi.getDeviceId()).build();
        try {
            if (HiAnalyticsManager.getInitFlag("theme_ha_normal_tag")) {
                this.f30290b = new HiAnalyticsInstance.Builder(Environment.getApplicationContext()).setMaintConf(hiAnalyticsConfigBuild).refresh("theme_ha_normal_tag");
                new HiAnalyticsConf.Builder(Environment.getApplicationContext()).setCollectURL(1, strA).refresh(true);
            } else {
                this.f30290b = new HiAnalyticsInstance.Builder(Environment.getApplicationContext()).setMaintConf(hiAnalyticsConfigBuild).create("theme_ha_normal_tag");
                new HiAnalyticsConf.Builder(Environment.getApplicationContext()).setCollectURL(1, strA).create();
                a(0);
            }
        } catch (Exception e2) {
            HwLog.e("AnalyticsUtils", "initConfig Exception: " + HwLog.printException(e2));
        }
        f();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("projectid", commonCountryCode);
        linkedHashMap.put("is_login", String.valueOf(this.f30289a));
        linkedHashMap.put("phoneType", MobileInfoHelper.getDeviceName());
        if (this.f30290b != null) {
            String userId = hwWatchFaceApi.getUserId();
            if (hwWatchFaceApi.isOversea() || !TextUtils.equals(commonCountryCode, "CN")) {
                this.f30290b.setUpid(1, p3.c(userId));
            } else {
                this.f30290b.setUpid(0, userId);
                this.f30290b.setUpid(1, userId);
            }
            this.f30290b.setAppid(FlavorConfig.SERVICE_WATCH_FACE);
            try {
                this.f30290b.setCommonProp(0, linkedHashMap);
                this.f30290b.setCommonProp(1, b());
            } catch (Exception e3) {
                HwLog.e("AnalyticsUtils", "setCommonProp Exception: " + HwLog.printException(e3));
            }
        }
        HiAnalyticTools.enableLog(this.f30291c);
    }

    public final void f() {
        if (HwWatchFaceApi.getInstance(this.f30291c).isLogin()) {
            this.f30289a = 1;
        } else {
            this.f30289a = 0;
        }
    }

    public void h() {
        b(1);
    }

    public static void a(String str, Context context) {
        HwLog.i("AnalyticsUtils", "setAppVer: " + str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("hianalytics_global_v2_" + context.getPackageName(), 0).edit();
        editorEdit.putString(Constants.PARAM_APP_VER, str);
        editorEdit.apply();
    }

    public final void a(int i, String str, LinkedHashMap linkedHashMap, boolean z) {
        long jA = e4.a("theme_last_report_time", System.currentTimeMillis());
        if (this.f30290b != null) {
            FlavorConfig.printAnalyticsLog(i, str, GsonHelper.toJson(linkedHashMap));
            this.f30290b.onEvent(i, str, (LinkedHashMap<String, String>) linkedHashMap);
            if (z) {
                b(i);
            } else if (System.currentTimeMillis() - jA >= 86400000) {
                b(i);
            }
        }
    }

    public void a(int i, String str, LinkedHashMap linkedHashMap) {
        HwLog.i("AnalyticsUtils", "onEventReport() type: " + i + ", key: " + str);
        d.execute(new a(i, str, linkedHashMap));
    }

    public void a(int i) {
        d.execute(new b(i));
    }

    public static void a(BaseEvent baseEvent, String str) {
        if (baseEvent == null) {
            HwLog.e("AnalyticsUtils", "uploadBiEvent() event is null.");
            return;
        }
        baseEvent.a(System.currentTimeMillis());
        baseEvent.c(baseEvent.c() - baseEvent.f());
        baseEvent.a(str);
        baseEvent.j();
    }

    public static void a(String str, String str2, int i) {
        StringBuilder sb;
        String str3;
        try {
            if (a(str)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(BaseEvent.KEY_DESCINFO, TextUtils.equals(str, "5.39.2") ? CommonUtils.e(str2) : CommonUtils.d(str2));
                if (i == 1) {
                    sb = new StringBuilder();
                    str3 = "Send";
                } else {
                    sb = new StringBuilder();
                    str3 = "Receive";
                }
                sb.append(str3);
                sb.append(str);
                linkedHashMap.put("title", sb.toString());
                new l(linkedHashMap).j();
            }
        } catch (Exception e2) {
            HwLog.e("AnalyticsUtils", "Report failed: " + HwLog.printException(e2));
        }
    }

    public final void b(int i) {
        HwLog.i("AnalyticsUtils", "onReportAnalytics() type: " + i);
        e4.b("theme_last_report_time", System.currentTimeMillis());
        if (this.f30290b != null) {
            HwLog.i("AnalyticsUtils", "onReportAnalytics() onReport.");
            this.f30290b.onReport(i);
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        g();
        CopyOnWriteArrayList copyOnWriteArrayList = f;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void a() {
        f.clear();
    }
}
