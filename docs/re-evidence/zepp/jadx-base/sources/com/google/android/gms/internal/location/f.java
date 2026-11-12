package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
final class f extends com.google.android.gms.location.zzaz {
    private final ListenerHolder<LocationCallback> a;

    public f(ListenerHolder<LocationCallback> listenerHolder) {
        this.a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.a.clear();
    }

    @Override // com.google.android.gms.location.zzba
    public final void zzd(LocationResult locationResult) {
        this.a.notifyListener(new d(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzba
    public final void zze(LocationAvailability locationAvailability) {
        this.a.notifyListener(new e(this, locationAvailability));
    }
}
