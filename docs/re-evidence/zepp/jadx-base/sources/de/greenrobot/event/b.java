package de.greenrobot.event;

import android.util.Log;

/* JADX INFO: loaded from: classes22.dex */
final class b implements Runnable {
    private final e a = new e();
    private final EventBus b;
    private volatile boolean c;

    public b(EventBus eventBus) {
        this.b = eventBus;
    }

    public void a(h hVar, Object obj) {
        d dVarA = d.a(hVar, obj);
        synchronized (this) {
            this.a.a(dVarA);
            if (!this.c) {
                this.c = true;
                this.b.b().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    d dVarC = this.a.c(1000);
                    if (dVarC == null) {
                        synchronized (this) {
                            dVarC = this.a.b();
                            if (dVarC == null) {
                                this.c = false;
                                this.c = false;
                                return;
                            }
                        }
                    }
                    this.b.d(dVarC);
                } catch (InterruptedException e) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    this.c = false;
                    return;
                }
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }
}
