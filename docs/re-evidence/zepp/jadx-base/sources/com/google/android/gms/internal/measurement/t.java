package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class t extends r0 {
    public final /* synthetic */ zzee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zzee zzeeVar) {
        super(zzeeVar, true);
        this.e = zzeeVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.e.g)).resetAnalyticsData(this.a);
    }
}
