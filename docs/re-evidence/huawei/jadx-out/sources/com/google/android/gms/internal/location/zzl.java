package com.google.android.gms.internal.location;

import android.os.DeadObjectException;
import android.os.IInterface;

/* JADX INFO: loaded from: classes21.dex */
final class zzl implements zzbj<zzao> {
    private final /* synthetic */ zzk zzcc;

    @Override // com.google.android.gms.internal.location.zzbj
    public final /* synthetic */ IInterface getService() throws DeadObjectException {
        return (zzao) this.zzcc.getService();
    }

    @Override // com.google.android.gms.internal.location.zzbj
    public final void checkConnected() {
        this.zzcc.checkConnected();
    }

    zzl(zzk zzkVar) {
        this.zzcc = zzkVar;
    }
}
