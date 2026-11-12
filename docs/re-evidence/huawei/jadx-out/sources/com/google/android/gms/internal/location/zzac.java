package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes21.dex */
final class zzac extends zzak {
    private final BaseImplementation.ResultHolder<Status> zzcq;

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(zzad zzadVar) {
        this.zzcq.setResult(zzadVar.getStatus());
    }

    public zzac(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzcq = resultHolder;
    }
}
