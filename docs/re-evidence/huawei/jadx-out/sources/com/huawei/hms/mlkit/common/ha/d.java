package com.huawei.hms.mlkit.common.ha;

import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            HmsHiAnalyticsUtils.onReport();
        } catch (Exception unused) {
            b.a("HaLogOnReport", "Failed to report hianalytics data");
        }
    }
}
