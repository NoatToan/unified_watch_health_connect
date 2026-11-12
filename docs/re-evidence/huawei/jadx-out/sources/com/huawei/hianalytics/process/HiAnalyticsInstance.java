package com.huawei.hianalytics.process;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.a0;
import com.huawei.hianalytics.b;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.f0;
import com.huawei.hianalytics.f1;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.listener.HAEventManager;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.j0;
import com.huawei.hianalytics.j2;
import com.huawei.hianalytics.t;
import com.huawei.hianalytics.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface HiAnalyticsInstance {

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private static final String TAG = "HABuilder";
        private Context mContext;
        private HiAnalyticsConfig maintConf = null;
        private HiAnalyticsConfig operConf = null;

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context.getApplicationContext();
            }
        }

        private void setConf(a0 a0Var) {
            HiAnalyticsConfig hiAnalyticsConfig = this.operConf;
            if (hiAnalyticsConfig == null) {
                a0Var.b((HiAnalyticsConfig) null);
            } else {
                a0Var.b(new HiAnalyticsConfig(hiAnalyticsConfig));
            }
            HiAnalyticsConfig hiAnalyticsConfig2 = this.maintConf;
            if (hiAnalyticsConfig2 == null) {
                a0Var.a((HiAnalyticsConfig) null);
            } else {
                a0Var.a(new HiAnalyticsConfig(hiAnalyticsConfig2));
            }
        }

        public HiAnalyticsInstance create(String str) {
            return create(str, false);
        }

        public HiAnalyticsInstance refresh(String str) {
            a0 a0VarA = j0.a().a(str);
            if (a0VarA != null) {
                a0VarA.refresh(1, this.maintConf);
                a0VarA.refresh(0, this.operConf);
                return a0VarA;
            }
            HiLog.w(TAG, "refresh config failed, instance is null. tag: " + str);
            return create(str);
        }

        @Deprecated
        public Builder setDiffConf(HiAnalyticsConfig hiAnalyticsConfig) {
            return this;
        }

        public Builder setMaintConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.maintConf = hiAnalyticsConfig;
            return this;
        }

        public Builder setOperConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.operConf = hiAnalyticsConfig;
            return this;
        }

        @Deprecated
        public Builder setPreConfig(HiAnalyticsConfig hiAnalyticsConfig) {
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0271  */
        public HiAnalyticsInstance create(String str, boolean z) {
            a0 a0VarA;
            LinkedHashMap linkedHashMap;
            a0 a0VarA2;
            HiLog.si(TAG, "ha sdk init. tag: " + str + ". version: 3.2.14.504");
            HiAnalyticsConfig hiAnalyticsConfigBuild = null;
            if (this.mContext == null) {
                HiLog.e(TAG, "create failed, context is null. tag: " + str);
                return null;
            }
            if (!TextUtils.isEmpty(str) && str.length() <= 255) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '_' || ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')))) {
                    }
                }
                if (HiAnalyticsManager.getInitFlag(str)) {
                    HiLog.e(TAG, "this tag already exists. tag: ".concat(str));
                    return null;
                }
                j0.a().getClass();
                String[] strArr = j0.f11555c;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (str.equals(strArr[i2])) {
                        HiLog.e(TAG, "this tag is not allowed to create. tag: ".concat(str));
                        return null;
                    }
                }
                int size = j0.a().f11556a.size();
                j0 j0VarA = j0.a();
                j0VarA.getClass();
                String[] strArr2 = j0.f11555c;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    if (j0VarA.f11556a.containsKey(strArr2[i4])) {
                        i3++;
                    }
                }
                if (size - i3 > 50) {
                    HiLog.e(TAG, "tag quantity exceeds the upper limit: 50. tag: ".concat(str));
                    return null;
                }
                j0.a().a(this.mContext);
                if (!j2.f11561b.a()) {
                    HiLog.sw(TAG, "user locked. tag: ".concat(str));
                    return null;
                }
                a0 a0Var = new a0(str);
                if (a0Var.f11450c == null) {
                    HiLog.e(TAG, "create failed, instance is null. tag: ".concat(str));
                    return null;
                }
                setConf(a0Var);
                a0 a0VarA3 = j0.a().a(str, a0Var);
                Context context = this.mContext;
                HiAnalyticsConfig hiAnalyticsConfig = this.operConf;
                HiAnalyticsConfig hiAnalyticsConfig2 = this.maintConf;
                HiAnalyticsConfig hiAnalyticsConfigBuild2 = (hiAnalyticsConfig2 == null || hiAnalyticsConfig2.config == null) ? (hiAnalyticsConfig == null || hiAnalyticsConfig.config == null) ? null : new HiAnalyticsConfig.Builder().setCollectURL(hiAnalyticsConfig.config.e).setHttpHeader(hiAnalyticsConfig.config.m).build() : new HiAnalyticsConfig.Builder().setCollectURL(hiAnalyticsConfig2.config.e).setHttpHeader(hiAnalyticsConfig2.config.m).build();
                if (hiAnalyticsConfig != null && hiAnalyticsConfig.config != null) {
                    hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(hiAnalyticsConfig.config.e).setHttpHeader(hiAnalyticsConfig.config.m).setAutoReportThresholdSize(100).build();
                } else if (hiAnalyticsConfig2 != null && hiAnalyticsConfig2.config != null) {
                    hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(hiAnalyticsConfig2.config.e).setHttpHeader(hiAnalyticsConfig2.config.m).setAutoReportThresholdSize(100).build();
                }
                if (TextUtils.equals(str, "ha_visual_view_tree")) {
                    HiAnalyticsConfig.Builder builder = new HiAnalyticsConfig.Builder();
                    String property = System.getProperty("debug.huawei.hianalytics.app.url");
                    if (TextUtils.isEmpty(property)) {
                        HiLog.i("DeviceUtil", "hianalytics debugMode url is empty");
                        property = "";
                    }
                    hiAnalyticsConfigBuild2 = builder.setCollectURL(property).setAutoReportThresholdSize(10).build();
                }
                if (hiAnalyticsConfigBuild2 == null) {
                    HiLog.e("HACU", "default config error, create failed");
                } else {
                    a0 a0VarA4 = j0.a().a("ha_default_collection");
                    if (a0VarA4 == null) {
                        a0VarA = new a0("ha_default_collection");
                        if (a0VarA.f11450c == null) {
                            HiLog.e("HACU", "default instance is null, create failed");
                        } else {
                            a0VarA.a(hiAnalyticsConfigBuild2);
                            a0VarA.b(hiAnalyticsConfigBuild);
                            a0 a0VarA5 = j0.a().a("ha_default_collection", a0VarA);
                            if (a0VarA5 != null) {
                                a0VarA = a0VarA5;
                            }
                        }
                        HAEventManager.getInstance().setEventListener(new z());
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("$tag_name", str);
                        linkedHashMap.put("$app_version", t.a(context));
                        linkedHashMap.put("$package_name", context.getPackageName());
                        linkedHashMap.put("$lib_version", "3.2.14.504");
                        a0VarA2 = j0.a().a("ha_default_collection");
                        if (a0VarA2 != null) {
                            a0VarA2.onEvent(1, "$ha_collection", a0.b(linkedHashMap));
                        }
                    } else {
                        a0VarA4.refresh(1, hiAnalyticsConfigBuild2);
                        a0VarA4.refresh(0, hiAnalyticsConfigBuild);
                        a0VarA = j0.a().a("ha_default_collection", a0VarA4);
                    }
                    if (a0VarA == null) {
                        HiLog.e("HACU", "collectionInstance is null, tag: ".concat(str));
                    } else {
                        a0VarA.setAppid("com.huawei.hianalytics");
                    }
                    HAEventManager.getInstance().setEventListener(new z());
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("$tag_name", str);
                    linkedHashMap.put("$app_version", t.a(context));
                    linkedHashMap.put("$package_name", context.getPackageName());
                    linkedHashMap.put("$lib_version", "3.2.14.504");
                    a0VarA2 = j0.a().a("ha_default_collection");
                    if (a0VarA2 != null) {
                        a0VarA2.onEvent(1, "$ha_collection", a0.b(linkedHashMap));
                    }
                }
                f0.d(str);
                f0.f(str);
                if (z) {
                    Application application = (Application) this.mContext;
                    if (b.d == null) {
                        b.d = new b();
                    }
                    application.registerActivityLifecycleCallbacks(b.d);
                    if (b.d == null) {
                        b.d = new b();
                    }
                    b.d.getClass();
                    if (!b.e.containsKey(str)) {
                        b.e.put(str, a0Var);
                    }
                }
                TaskThread.getUpdateThread().addToQueue(new f1(this.mContext, str));
                return a0VarA3 == null ? a0Var : a0VarA3;
            }
            HiLog.e(TAG, "check tag failed! TAG: " + str);
            return null;
        }
    }

    void clearData();

    void disableAutoReport();

    String getCollectUrl();

    String getOAID(int i);

    String getUDID(int i);

    String getUUID(int i);

    void newInstanceUUID();

    @Deprecated
    void onBackground(long j);

    void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap, LinkedHashMap<String, String> linkedHashMap2, LinkedHashMap<String, String> linkedHashMap3);

    void onEvent(int i, String str, JSONObject jSONObject);

    void onEvent(int i, List<HaEvent> list);

    @Deprecated
    void onEvent(Context context, String str, String str2);

    void onEvent(String str, LinkedHashMap<String, String> linkedHashMap);

    void onEventSync(int i, String str, JSONObject jSONObject);

    @Deprecated
    void onForeground(long j);

    @Deprecated
    void onPause(Context context);

    @Deprecated
    void onPause(Context context, LinkedHashMap<String, String> linkedHashMap);

    @Deprecated
    void onPause(String str, LinkedHashMap<String, String> linkedHashMap);

    void onReport(int i);

    @Deprecated
    void onReport(Context context, int i);

    @Deprecated
    void onResume(Context context);

    @Deprecated
    void onResume(Context context, LinkedHashMap<String, String> linkedHashMap);

    @Deprecated
    void onResume(String str, LinkedHashMap<String, String> linkedHashMap);

    void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap, LinkedHashMap<String, String> linkedHashMap2, LinkedHashMap<String, String> linkedHashMap3);

    void onStreamEvent(int i, String str, JSONObject jSONObject);

    void refresh(int i, HiAnalyticsConfig hiAnalyticsConfig);

    void setAccountBrandId(String str);

    void setAppBrandId(String str);

    void setAppid(String str);

    void setCallback(ICallback iCallback);

    void setCommonProp(int i, Map<String, String> map);

    void setHandsetManufacturer(String str);

    void setHansetBrandId(String str);

    void setOAID(int i, String str);

    void setOAIDTrackingFlag(int i, boolean z);

    void setUpid(int i, String str);
}
