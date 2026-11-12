package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes4.dex */
final class zaf implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks zaoi;

    public zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zaoi = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zaoi.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaoi.onConnectionSuspended(i);
    }
}
