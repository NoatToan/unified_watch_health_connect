package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f5785a;

    public c(b bVar) {
        this.f5785a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f5785a.c.isEmpty()) {
                Runnable runnable = (Runnable) this.f5785a.c.get(0);
                this.f5785a.c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            b.b(this.f5785a);
            throw th;
        }
        b.b(this.f5785a);
    }
}
