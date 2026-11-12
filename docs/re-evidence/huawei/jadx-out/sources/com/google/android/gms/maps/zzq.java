package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes21.dex */
final class zzq extends zzbg {
    private final /* synthetic */ GoogleMap.OnPolylineClickListener zzy;

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zza(com.google.android.gms.internal.maps.zzz zzzVar) {
        this.zzy.onPolylineClick(new Polyline(zzzVar));
    }

    zzq(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zzy = onPolylineClickListener;
    }
}
