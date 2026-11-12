package com.sensetime.senseid.sdk.liveness.silent.common.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
public final class MainThreadExecutor implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    public static class a {
        private static final MainThreadExecutor a = new MainThreadExecutor();
    }

    public static MainThreadExecutor getInstance() {
        return a.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.a.post(runnable);
    }
}
