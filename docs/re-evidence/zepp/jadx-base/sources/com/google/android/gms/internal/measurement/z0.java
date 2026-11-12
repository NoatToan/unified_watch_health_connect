package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class z0 extends r0 {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ zzbz f;
    public final /* synthetic */ b1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, Activity activity, zzbz zzbzVar) {
        super(b1Var.a, true);
        this.g = b1Var;
        this.e = activity;
        this.f = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.g.a.g)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.e), this.f, this.b);
    }
}
