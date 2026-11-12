package com.sogou.map.loc;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
abstract class h0 {
    private l0 a;

    public h0(l0 l0Var) {
        this.a = l0Var;
    }

    public final void a(Runnable runnable) {
        Executor executorA = this.a.a();
        if (executorA != null) {
            executorA.execute(runnable);
        } else {
            r0.a(3, "locate", "executor is null, failed to execute task");
        }
    }

    public final void b(Runnable runnable, long j) {
        Handler handlerB = this.a.b();
        if (handlerB == null) {
            r0.a(3, "locate", "touch handler is null, failed to touch task");
        } else {
            handlerB.removeCallbacks(runnable);
            handlerB.postDelayed(runnable, j);
        }
    }

    public final void c(Runnable runnable) {
        Handler handlerB = this.a.b();
        if (handlerB != null) {
            handlerB.removeCallbacks(runnable);
        }
    }

    public final Context d() {
        return this.a.d();
    }

    public final Handler e() {
        return this.a.b();
    }
}
