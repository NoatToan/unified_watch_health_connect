package com.huawei.hms.ads.dynamicloader;

import com.huawei.hms.ads.uiengineloader.af;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12797a = "SafeRunnable";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f12798b;

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f12798b;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                af.d(f12797a, "exception in task run: " + th.getClass().getSimpleName());
            }
        }
    }

    public k(Runnable runnable) {
        this.f12798b = runnable;
    }
}
