package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class x extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zzee zzeeVar, String str) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = str;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.g)).endAdUnitExposure(this.e, this.b);
    }
}
