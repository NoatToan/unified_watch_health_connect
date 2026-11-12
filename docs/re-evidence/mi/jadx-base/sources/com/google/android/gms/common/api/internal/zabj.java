package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zabj implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zaix;

    public zabj(GoogleApiManager.zaa zaaVar) {
        this.zaix = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaix.zabg();
    }
}
