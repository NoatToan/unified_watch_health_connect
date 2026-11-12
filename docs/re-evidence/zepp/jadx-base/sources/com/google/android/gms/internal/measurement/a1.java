package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends r0 {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ b1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, Activity activity) {
        super(b1Var.a, true);
        this.f = b1Var;
        this.e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f.a.g)).onActivityDestroyed(ObjectWrapper.wrap(this.e), this.b);
    }
}
