package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends r0 {
    public final /* synthetic */ zzbz e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zzee zzeeVar, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.g)).generateEventId(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.e.zzd(null);
    }
}
