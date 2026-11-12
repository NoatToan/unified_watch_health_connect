package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class u implements Executor {
    private final Handler a;

    private u(Handler handler) {
        this.a = handler;
    }

    public static Executor a(Handler handler) {
        return new u(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
