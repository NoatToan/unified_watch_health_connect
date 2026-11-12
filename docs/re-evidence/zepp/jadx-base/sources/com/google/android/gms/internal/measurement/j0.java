package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class j0 extends r0 {
    public final /* synthetic */ zzbz e;
    public final /* synthetic */ int f;
    public final /* synthetic */ zzee g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zzee zzeeVar, zzbz zzbzVar, int i) {
        super(zzeeVar, true);
        this.g = zzeeVar;
        this.e = zzbzVar;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.g.g)).getTestFlag(this.e, this.f);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.e.zzd(null);
    }
}
