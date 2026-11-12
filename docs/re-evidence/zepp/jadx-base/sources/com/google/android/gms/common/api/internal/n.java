package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class n implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult a;

    public n(zaar zaarVar, StatusPendingResult statusPendingResult) {
        this.a = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.a.setResult(new Status(8));
    }
}
