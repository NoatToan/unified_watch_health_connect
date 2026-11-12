package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class zaau implements Runnable {
    private final /* synthetic */ zaak zagi;

    private zaau(zaak zaakVar) {
        this.zagi = zaakVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.zagi.zaen.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            zaan();
            return;
        } catch (RuntimeException e) {
            this.zagi.zafs.zab(e);
            return;
        } finally {
            this.zagi.zaen.unlock();
        }
        this.zagi.zaen.unlock();
    }

    public abstract void zaan();

    public /* synthetic */ zaau(zaak zaakVar, zaal zaalVar) {
        this(zaakVar);
    }
}
