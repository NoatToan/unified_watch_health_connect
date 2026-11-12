package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handler f21467a;

    public g1() {
        this(Looper.getMainLooper());
    }

    @NotNull
    public Thread a() {
        return this.f21467a.getLooper().getThread();
    }

    public void b(@NotNull Runnable runnable) {
        this.f21467a.post(runnable);
    }

    public g1(@NotNull Looper looper) {
        this.f21467a = new Handler(looper);
    }
}
