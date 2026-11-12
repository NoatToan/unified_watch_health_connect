package com.huawei.hms.iapfull;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class c1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f13645a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13645a.post(runnable);
    }
}
