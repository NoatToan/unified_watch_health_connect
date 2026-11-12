package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes14.dex */
abstract class zaav implements Runnable {
    final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e4) {
                this.zab.zaa.zam(e4);
            }
        } finally {
            this.zab.zab.unlock();
        }
    }

    public abstract void zaa();
}
