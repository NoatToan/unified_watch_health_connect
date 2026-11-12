package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ zzbz h;
    public final /* synthetic */ zzee i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(zzee zzeeVar, String str, String str2, boolean z, zzbz zzbzVar) {
        super(zzeeVar, true);
        this.i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.i.g)).getUserProperties(this.e, this.f, this.g, this.h);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void b() {
        this.h.zzd(null);
    }
}
