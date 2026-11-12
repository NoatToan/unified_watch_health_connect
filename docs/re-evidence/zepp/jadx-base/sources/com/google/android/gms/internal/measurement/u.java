package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class u extends r0 {
    public final /* synthetic */ long e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zzee zzeeVar, long j) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = j;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.g)).setSessionTimeoutDuration(this.e);
    }
}
