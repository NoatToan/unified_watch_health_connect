package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class o implements GoogleApiClient.ConnectionCallbacks {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ StatusPendingResult b;
    private final /* synthetic */ zaar c;

    public o(zaar zaarVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.c = zaarVar;
        this.a = atomicReference;
        this.b = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.c.c((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.a.get()), this.b, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
