package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class x implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa a;

    public x(GoogleApiManager.zaa zaaVar) {
        this.a = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y();
    }
}
