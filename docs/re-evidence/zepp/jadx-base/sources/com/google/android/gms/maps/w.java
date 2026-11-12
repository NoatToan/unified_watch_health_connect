package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.zzah;

/* JADX INFO: loaded from: classes3.dex */
final class w extends ILocationSourceDelegate.zza {
    private final /* synthetic */ LocationSource b;

    public w(GoogleMap googleMap, LocationSource locationSource) {
        this.b = locationSource;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(zzah zzahVar) {
        this.b.activate(new x(this, zzahVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.b.deactivate();
    }
}
