package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2044a;

    @Override // java.lang.Runnable
    public void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f2044a.f2043c.isEmpty()) {
                Runnable runnable = (Runnable) this.f2044a.f2043c.get(0);
                this.f2044a.f2043c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f2044a.f2042b = null;
            throw th;
        }
        this.f2044a.f2042b = null;
    }

    public c(b bVar) {
        this.f2044a = bVar;
    }
}
