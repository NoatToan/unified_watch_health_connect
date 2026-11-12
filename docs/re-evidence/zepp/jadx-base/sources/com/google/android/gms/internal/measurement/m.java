package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class m extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ zzee h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zzee zzeeVar, String str, String str2, Bundle bundle) {
        super(zzeeVar, true);
        this.h = zzeeVar;
        this.e = str;
        this.f = str2;
        this.g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.h.g)).clearConditionalUserProperty(this.e, this.f, this.g);
    }
}
