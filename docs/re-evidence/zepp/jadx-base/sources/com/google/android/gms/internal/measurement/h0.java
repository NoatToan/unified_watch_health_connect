package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ zzbz f;
    public final /* synthetic */ zzee g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(zzee zzeeVar, String str, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.g = zzeeVar;
        this.e = str;
        this.f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.g.g)).getMaxUserProperties(this.e, this.f);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.f.zzd(null);
    }
}
