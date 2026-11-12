package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzaw implements RemoteCall {
    private boolean zza = true;

    public final void zza(boolean z14) {
        this.zza = false;
    }

    public final boolean zzb() {
        return this.zza;
    }
}
