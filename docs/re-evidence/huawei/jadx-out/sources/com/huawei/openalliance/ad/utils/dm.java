package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class dm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.huawei.openalliance.ad.cv f20646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f20647b;

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f20647b;
        if (runnable != null) {
            try {
                runnable.run();
                this.f20647b = null;
            } catch (Throwable th) {
                try {
                    hw.d("TaskWrapper", "exception in task run");
                    hw.a(5, th);
                    com.huawei.openalliance.ad.cv cvVar = f20646a;
                    if (cvVar != null) {
                        cvVar.a(th);
                    }
                } catch (Throwable th2) {
                    try {
                        hw.c("TaskWrapper", "run ex:" + th2.getClass().getSimpleName());
                    } finally {
                        this.f20647b = null;
                    }
                }
            }
        }
    }

    public static void a(com.huawei.openalliance.ad.cv cvVar) {
        f20646a = cvVar;
    }

    public dm(Runnable runnable) {
        this.f20647b = runnable;
    }
}
