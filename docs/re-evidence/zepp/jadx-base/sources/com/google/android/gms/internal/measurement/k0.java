package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class k0 extends r0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zzee zzeeVar, boolean z) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = z;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.g)).setDataCollectionEnabled(this.e);
    }
}
