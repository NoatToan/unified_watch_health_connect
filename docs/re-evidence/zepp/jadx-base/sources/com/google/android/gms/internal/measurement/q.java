package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class q extends r0 {
    public final /* synthetic */ Boolean e;
    public final /* synthetic */ zzee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.f = zzeeVar;
        this.e = bool;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        if (this.e != null) {
            ((zzcc) Preconditions.checkNotNull(this.f.g)).setMeasurementEnabled(this.e.booleanValue(), this.a);
        } else {
            ((zzcc) Preconditions.checkNotNull(this.f.g)).clearMeasurementEnabled(this.a);
        }
    }
}
