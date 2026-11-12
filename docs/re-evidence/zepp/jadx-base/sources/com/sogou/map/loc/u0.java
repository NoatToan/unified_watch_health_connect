package com.sogou.map.loc;

import android.os.Process;

/* JADX INFO: loaded from: classes18.dex */
final class u0 extends Thread {
    private final /* synthetic */ Runnable a;

    public u0(t0 t0Var, Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(0);
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable unused) {
        }
    }
}
