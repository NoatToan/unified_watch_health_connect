package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends r0 {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ b1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b1 b1Var, Bundle bundle, Activity activity) {
        super(b1Var.a, true);
        this.g = b1Var;
        this.e = bundle;
        this.f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        Bundle bundle;
        if (this.e != null) {
            bundle = new Bundle();
            if (this.e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) Preconditions.checkNotNull(this.g.a.g)).onActivityCreated(ObjectWrapper.wrap(this.f), bundle, this.b);
    }
}
