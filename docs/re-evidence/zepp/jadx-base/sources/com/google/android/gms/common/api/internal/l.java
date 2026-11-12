package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
abstract class l implements Runnable {
    private final /* synthetic */ zaaf a;

    private l(zaaf zaafVar) {
        this.a = zaafVar;
    }

    @WorkerThread
    public abstract void a();

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        this.a.b.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            a();
            return;
        } catch (RuntimeException e) {
            this.a.a.d(e);
            return;
        } finally {
            this.a.b.unlock();
        }
        this.a.b.unlock();
    }

    public /* synthetic */ l(zaaf zaafVar, c cVar) {
        this(zaafVar);
    }
}
