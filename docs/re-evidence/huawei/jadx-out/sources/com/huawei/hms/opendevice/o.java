package com.huawei.hms.opendevice;

import android.util.Log;

/* JADX INFO: loaded from: classes34.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f15824a;

    public o(Runnable runnable) {
        this.f15824a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f15824a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
                Log.e("HmsPushThreads", "exception in task run");
            }
        }
    }
}
