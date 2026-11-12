package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzas;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class l extends zzas {
    private final /* synthetic */ GoogleMap.OnMarkerClickListener b;

    public l(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.b = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final boolean zza(zzt zztVar) {
        return this.b.onMarkerClick(new Marker(zztVar));
    }
}
