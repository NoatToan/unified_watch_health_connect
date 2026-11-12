package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class pd {
    public static boolean a() {
        try {
            Class.forName("com.huawei.hms.pps.HwPPS");
            Class.forName("com.huawei.hmf.tasks.Task");
            return true;
        } catch (Throwable unused) {
            hw.c("HMSConnectProcessor", "check hms sdk available error");
            return false;
        }
    }
}
