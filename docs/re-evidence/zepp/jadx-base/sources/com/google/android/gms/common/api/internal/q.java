package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class q implements ResultCallback<Status> {
    private final /* synthetic */ StatusPendingResult a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ GoogleApiClient c;
    private final /* synthetic */ zaar d;

    public q(zaar zaarVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.d = zaarVar;
        this.a = statusPendingResult;
        this.b = z;
        this.c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(@NonNull Result result) {
        Status status = (Status) result;
        Storage.getInstance(this.d.f).zaa();
        if (status.isSuccess() && this.d.isConnected()) {
            this.d.reconnect();
        }
        this.a.setResult(status);
        if (this.b) {
            this.c.disconnect();
        }
    }
}
