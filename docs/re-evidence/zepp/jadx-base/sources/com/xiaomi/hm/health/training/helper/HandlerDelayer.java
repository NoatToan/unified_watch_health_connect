package com.xiaomi.hm.health.training.helper;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes21.dex */
public class HandlerDelayer implements Delayer {
    private final Handler a = new Handler(Looper.getMainLooper());

    @Override // com.xiaomi.hm.health.training.helper.Delayer
    public void postDelay(@NonNull Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }
}
