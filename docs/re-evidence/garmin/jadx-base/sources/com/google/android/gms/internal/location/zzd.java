package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
final class zzd extends zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, GoogleApiClient googleApiClient, long j8, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j8;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzbe zzbeVar = (zzbe) anyClient;
        long j8 = this.zza;
        PendingIntent pendingIntent = this.zzb;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkArgument(j8 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) zzbeVar.getService()).zzr(j8, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}
