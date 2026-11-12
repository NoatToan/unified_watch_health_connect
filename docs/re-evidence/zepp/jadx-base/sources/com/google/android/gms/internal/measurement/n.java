package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class n extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ zzbz g;
    public final /* synthetic */ zzee h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zzee zzeeVar, String str, String str2, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.h = zzeeVar;
        this.e = str;
        this.f = str2;
        this.g = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.h.g)).getConditionalUserProperties(this.e, this.f, this.g);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.g.zzd(null);
    }
}
