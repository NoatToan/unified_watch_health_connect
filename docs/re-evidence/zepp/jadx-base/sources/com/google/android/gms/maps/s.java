package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzay;

/* JADX INFO: loaded from: classes3.dex */
final class s extends zzay {
    private final /* synthetic */ GoogleMap.OnMyLocationChangeListener b;

    public s(GoogleMap googleMap, GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.b = onMyLocationChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zza(IObjectWrapper iObjectWrapper) {
        this.b.onMyLocationChange((Location) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
