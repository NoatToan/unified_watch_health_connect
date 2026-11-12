package com.huawei.hianalytics;

import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11729a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f11730b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11731c = false;

    public static boolean a() {
        if (!f11730b) {
            synchronized (f11729a) {
                try {
                    Class.forName("com.huawei.hms.common.HuaweiApi");
                    f11731c = true;
                } catch (ClassNotFoundException unused) {
                    f11731c = false;
                }
                f11730b = true;
            }
        }
        boolean z = f11731c;
        HiLog.i("HmsBaseExist", "hms base exist: " + z);
        return z;
    }
}
