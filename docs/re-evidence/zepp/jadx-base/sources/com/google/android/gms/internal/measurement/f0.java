package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends r0 {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ zzbz f;
    public final /* synthetic */ zzee g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(zzee zzeeVar, Bundle bundle, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.g = zzeeVar;
        this.e = bundle;
        this.f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.g.g)).performAction(this.e, this.f, this.a);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.f.zzd(null);
    }
}
