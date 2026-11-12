package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zabk implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zaix;

    public zabk(GoogleApiManager.zaa zaaVar) {
        this.zaix = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaix.zabh();
    }
}
