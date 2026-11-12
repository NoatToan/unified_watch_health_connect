package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class j implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ zaaf a;

    private j(zaaf zaafVar) {
        this.a = zaafVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        ((com.google.android.gms.signin.zae) Preconditions.checkNotNull(this.a.k)).zaa(new h(this.a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.g(connectionResult)) {
                this.a.w();
                this.a.r();
            } else {
                this.a.j(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    public /* synthetic */ j(zaaf zaafVar, c cVar) {
        this(zaafVar);
    }
}
