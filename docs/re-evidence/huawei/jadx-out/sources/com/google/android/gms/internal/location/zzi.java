package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes21.dex */
final class zzi extends zzj {
    private final /* synthetic */ PendingIntent zzbz;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza(this.zzbz, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(zze zzeVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zzbz = pendingIntent;
    }
}
