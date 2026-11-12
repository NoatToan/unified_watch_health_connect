package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzau;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class m extends zzau {
    private final /* synthetic */ GoogleMap.OnMarkerDragListener b;

    public m(GoogleMap googleMap, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.b = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(zzt zztVar) {
        this.b.onMarkerDragStart(new Marker(zztVar));
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzc(zzt zztVar) {
        this.b.onMarkerDragEnd(new Marker(zztVar));
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzd(zzt zztVar) {
        this.b.onMarkerDrag(new Marker(zztVar));
    }
}
