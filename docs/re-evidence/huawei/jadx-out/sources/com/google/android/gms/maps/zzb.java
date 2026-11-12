package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzas;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes4.dex */
final class zzb extends zzas {
    private final /* synthetic */ GoogleMap.OnMarkerClickListener zzj;

    @Override // com.google.android.gms.maps.internal.zzar
    public final boolean zza(com.google.android.gms.internal.maps.zzt zztVar) {
        return this.zzj.onMarkerClick(new Marker(zztVar));
    }

    zzb(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zzj = onMarkerClickListener;
    }
}
