package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
final class z implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ GoogleApiManager.zaa b;

    public z(GoogleApiManager.zaa zaaVar, ConnectionResult connectionResult) {
        this.b = zaaVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.onConnectionFailed(this.a);
    }
}
