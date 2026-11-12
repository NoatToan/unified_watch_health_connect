package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
public final class zzd extends zzz {
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int i14) {
        this.zza = baseGmsClient;
        this.zzb = i14;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i14, IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i14, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i14, Bundle bundle) {
        new Exception();
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i14, IBinder iBinder, zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.zzc(zzjVar);
        onPostInitComplete(i14, iBinder, zzjVar.zza);
    }
}
