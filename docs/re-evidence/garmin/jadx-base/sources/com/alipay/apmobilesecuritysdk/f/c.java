package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f28384a;

    public c(b bVar) {
        this.f28384a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (true) {
                boolean zIsEmpty = this.f28384a.f28383c.isEmpty();
                b bVar = this.f28384a;
                if (zIsEmpty) {
                    b.b(bVar);
                    return;
                }
                Runnable runnable = (Runnable) bVar.f28383c.get(0);
                this.f28384a.f28383c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
            b.b(this.f28384a);
        } catch (Throwable th3) {
            b.b(this.f28384a);
            throw th3;
        }
    }
}
