package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ GoogleApiManager.b b;

    public b0(GoogleApiManager.b bVar, ConnectionResult connectionResult) {
        this.b = bVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiManager.zaa zaaVar = (GoogleApiManager.zaa) GoogleApiManager.this.l.get(this.b.b);
        if (zaaVar == null) {
            return;
        }
        if (!this.a.isSuccess()) {
            zaaVar.onConnectionFailed(this.a);
            return;
        }
        GoogleApiManager.b.c(this.b, true);
        if (this.b.a.requiresSignIn()) {
            this.b.b();
            return;
        }
        try {
            this.b.a.getRemoteService(null, this.b.a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.disconnect("Failed to get service from broker.");
            zaaVar.onConnectionFailed(new ConnectionResult(10));
        }
    }
}
