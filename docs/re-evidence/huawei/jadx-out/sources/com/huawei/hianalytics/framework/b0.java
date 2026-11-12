package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f11501a;

    public b0(Runnable runnable) {
        this.f11501a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f11501a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                HiLog.w("TaskThread", "error occurred: " + th.getMessage() + ";" + th.getCause());
            }
        }
    }
}
