package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.hianalytics.visual.autocollect.exposure.ViewMark;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class HiAnalyticsAPI extends HiAnalyticsManager {
    private static final String HA_VISUAL_SDK_VERSION = "3.2.14.503";
    private static final String TAG = "HiAnalyticsAPI";
    private static boolean hasInit = false;
    private static volatile HiAnalyticsAPI hiAnalyticsAPI;

    private HiAnalyticsAPI() {
    }

    public static HiAnalyticsAPI getInstance() {
        if (hiAnalyticsAPI == null) {
            synchronized (HiAnalyticsAPI.class) {
                if (hiAnalyticsAPI == null) {
                    hiAnalyticsAPI = new HiAnalyticsAPI();
                }
            }
        }
        return hiAnalyticsAPI;
    }

    public String acquireSessionID() {
        return w.a().d();
    }

    public void addAutoCollectVisualActivities(List<Class<?>> list) {
        w.a().b(list);
    }

    public void addAutoCollectVisualActivity(Class<?> cls) {
        w.a().f(cls);
    }

    public void addMaskRules(String str, String str2) {
        w.a().a(str, str2);
    }

    public void addSuperProperties(JSONObject jSONObject) {
        w.a().a(jSONObject);
    }

    public void addViewActivity(View view, Activity activity) {
        w.a().a(view, activity);
    }

    public void addViewCustomProperties(View view, JSONObject jSONObject) {
        w.a().a(view, jSONObject);
    }

    public void addViewFragment(View view, String str) {
        w.a().b(view, str);
    }

    public void addViewId(View view, String str) {
        w.a().a(view, str);
    }

    @Deprecated
    public void collectAppFirstOpen() {
    }

    @Deprecated
    public void collectAppFirstOpen(String str, JSONObject jSONObject) {
    }

    @Deprecated
    public void collectAppFirstOpen(JSONObject jSONObject) {
    }

    public void deleteSuperProperties() {
        w.a().e();
    }

    public void disableAutoCollectActivities(List<Class<?>> list) {
        w.a().h(list);
    }

    public void disableAutoCollectActivity(Class<?> cls) {
        w.a().a(cls);
    }

    public void disableAutoCollectEvent(List<EventType> list) {
        w.a().a(list);
    }

    public void disableAutoCollectFragment(Class<?> cls) {
        w.a().e(cls);
    }

    public void disableAutoCollectFragments(List<Class<?>> list) {
        w.a().e(list);
    }

    public void disableCollectView(View view) {
        w.a().a(view);
    }

    public void disableViewType(Class<?> cls) {
        w.a().c(cls);
    }

    public void enableAutoCollect(boolean z) {
        w.a().a(z);
    }

    public void enableAutoCollectActivities(List<Class<?>> list) {
        w.a().f(list);
    }

    public void enableAutoCollectActivity(Class<?> cls) {
        w.a().d(cls);
    }

    public void enableAutoCollectEvent(List<EventType> list) {
        w.a().g(list);
    }

    public void enableAutoCollectFragment(Class<?> cls) {
        w.a().g(cls);
    }

    public void enableAutoCollectFragments(List<Class<?>> list) {
        w.a().d(list);
    }

    public void enableAutoCollectPackages(List<String> list) {
        w.a().c(list);
    }

    public HiAnalyticsInstance getAutoHiAnalyticsInstance() {
        if (hasInit) {
            return HiAnalyticsManager.getInstanceByTag("hianalytics_default_autocollect");
        }
        HiLog.sw(TAG, "auto hiAnalytics instance has not initialized, please init");
        return null;
    }

    public void markViewExposure(ViewMark viewMark) {
        w.a().a(viewMark);
    }

    public void onReport() {
        w.a().c();
    }

    @Deprecated
    public void preInitAutoCollect(Context context) {
        HiLog.d(TAG, "HiAnalytics Visual auto collect pre init start");
        if (context == null) {
            HiLog.w(TAG, "HiAnalytics Visual auto collect pre init failed, context is null");
            return;
        }
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            HiLog.w(TAG, "HiAnalytics Visual auto collect pre init failed, application context is null");
        } else {
            u.f11699c.a(application);
            HiLog.d(TAG, "HiAnalytics Visual auto collect pre init end");
        }
    }

    public void removePresetProperty(String str) {
        w.a().b(str);
    }

    public void removeSuperProperties(String str) {
        w.a().a(str);
    }

    public void startAutoCollect(Context context, HiAnalyticsConfig hiAnalyticsConfig, HAAutoConfigOptions hAAutoConfigOptions) {
        startAutoCollect(context, hiAnalyticsConfig, null, hAAutoConfigOptions);
    }

    public void stopViewExposure(View view) {
        w.a().b(view);
    }

    public void syncVisualConfig() {
        w.a().g();
    }

    public void addViewId(Dialog dialog, String str) {
        w.a().a(dialog, str);
    }

    public void removePresetProperty(String str, List<String> list) {
        w.a().a(str, list);
    }

    public void startAutoCollect(Context context, HiAnalyticsConfig hiAnalyticsConfig, HiAnalyticsConfig hiAnalyticsConfig2, HAAutoConfigOptions hAAutoConfigOptions) {
        HiLog.i(TAG, "HiAnalytics Visual auto collect instance init start");
        if (hasInit) {
            HiLog.sw(TAG, "startAutoCollect(): auto instance has already been initialized");
            return;
        }
        if (hAAutoConfigOptions == null) {
            hAAutoConfigOptions = new HAAutoConfigOptions.Builder().build();
        }
        try {
            f0.a(context, hiAnalyticsConfig, hiAnalyticsConfig2, hAAutoConfigOptions);
            hasInit = true;
        } catch (Throwable th) {
            HiLog.sw(TAG, "error occurred while initialize HiAnalytics Agent: " + th.getMessage());
        }
    }

    public void addViewId(Object obj, String str) {
        w.a().a(obj, str);
    }
}
