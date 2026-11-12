package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* JADX INFO: loaded from: classes3.dex */
final class i extends com.google.android.gms.location.zzbc {
    private final ListenerHolder<LocationListener> a;

    public i(ListenerHolder<LocationListener> listenerHolder) {
        this.a = listenerHolder;
    }

    public final synchronized void zzc() {
        this.a.clear();
    }

    @Override // com.google.android.gms.location.zzbd
    public final synchronized void zzd(Location location) {
        this.a.notifyListener(new h(this, location));
    }
}
