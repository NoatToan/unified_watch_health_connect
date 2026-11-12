package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends zzbg {
    private final /* synthetic */ GoogleMap.OnPolylineClickListener b;

    public b0(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.b = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zza(zzz zzzVar) {
        this.b.onPolylineClick(new Polyline(zzzVar));
    }
}
