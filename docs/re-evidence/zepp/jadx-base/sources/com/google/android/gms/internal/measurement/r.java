package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class r extends r0 {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.g)).setConsent(this.e, this.a);
    }
}
