package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes4.dex */
final class zzo extends zzg {
    private BaseImplementation.ResultHolder<Status> zzap;

    public zzo(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzap = resultHolder;
    }

    @Override // com.google.android.gms.internal.p001authapi.zzg, com.google.android.gms.internal.p001authapi.zzu
    public final void zzc(Status status) {
        this.zzap.setResult(status);
    }
}
