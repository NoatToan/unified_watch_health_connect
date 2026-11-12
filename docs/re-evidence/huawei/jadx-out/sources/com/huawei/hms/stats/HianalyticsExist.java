package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes3.dex */
public class HianalyticsExist {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f16466a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f16467b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16468c = false;

    public static boolean isHianalyticsExist() {
        boolean z;
        synchronized (f16466a) {
            if (!f16467b) {
                boolean z2 = false;
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                    z = false;
                }
                try {
                    Class.forName("com.huawei.hms.hatool.HmsHiAnalyticsUtils");
                    z2 = true;
                } catch (ClassNotFoundException unused2) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HmsHiAnalyticsUtils.");
                }
                if (z && !z2) {
                    f16468c = true;
                }
                f16467b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f16468c);
            }
        }
        return f16468c;
    }
}
