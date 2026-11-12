package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {
    public static void a(int i, final HiAnalyticsConfig hiAnalyticsConfig) {
        if (hiAnalyticsConfig == null || hiAnalyticsConfig.config == null || i != 0) {
            return;
        }
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("Analytics_Kit_Tag");
        final String collectUrl = instanceByTag == null ? "" : instanceByTag.getCollectUrl();
        if (TextUtils.isEmpty(collectUrl)) {
            return;
        }
        TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.e0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e0.a(collectUrl, hiAnalyticsConfig);
            }
        });
    }

    public static void a(String str, HiAnalyticsConfig hiAnalyticsConfig) {
        a0 a0VarA = j0.a().a("ha_metric_mc");
        if (a0VarA == null) {
            return;
        }
        a0VarA.b(new HiAnalyticsConfig.Builder().setCollectURL(str).setHttpHeader(hiAnalyticsConfig.config.m).build());
    }

    public static void a() {
        a0 a0VarA;
        String collectUrl;
        a0 a0VarA2 = j0.a().a("ha_metric_mc");
        if (a0VarA2 == null) {
            a0VarA = new a0("ha_metric_mc");
            if (a0VarA.f11450c == null) {
                HiLog.e("HACU", "metric instance is null, create failed");
                return;
            }
            HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("Analytics_Kit_Tag");
            if (instanceByTag == null) {
                collectUrl = "";
            } else {
                collectUrl = instanceByTag.getCollectUrl();
            }
            if (TextUtils.isEmpty(collectUrl)) {
                return;
            }
            a0VarA.b(new HiAnalyticsConfig.Builder().setCollectURL(collectUrl).build());
            a0 a0VarA3 = j0.a().a("ha_metric_mc", a0VarA);
            if (a0VarA3 != null) {
                a0VarA = a0VarA3;
            }
        } else {
            a0VarA = j0.a().a("ha_metric_mc", a0VarA2);
        }
        if (a0VarA == null) {
            HiLog.e("HACU", "metricInstance is null");
        } else {
            a0VarA.setAppid("com.huawei.hianalytics");
        }
    }
}
