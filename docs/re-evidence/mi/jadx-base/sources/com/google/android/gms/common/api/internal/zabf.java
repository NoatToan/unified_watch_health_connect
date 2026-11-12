package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class zabf {
    private final zabd zaht;

    public zabf(zabd zabdVar) {
        this.zaht = zabdVar;
    }

    public abstract void zaan();

    public final void zac(zabe zabeVar) {
        zabeVar.zaen.lock();
        try {
            if (zabeVar.zahp != this.zaht) {
                return;
            }
            zaan();
        } finally {
            zabeVar.zaen.unlock();
        }
    }
}
