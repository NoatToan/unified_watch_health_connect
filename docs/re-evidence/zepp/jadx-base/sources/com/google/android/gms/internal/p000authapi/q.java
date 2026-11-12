package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes3.dex */
final class q extends zzh {
    private BaseImplementation.ResultHolder<Status> b;

    public q(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzd(Status status) {
        this.b.setResult(status);
    }
}
