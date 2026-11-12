package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
final class j0 extends zzak {
    private final /* synthetic */ GoogleMap.OnMapClickListener b;

    public j0(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.b = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaj
    public final void onMapClick(LatLng latLng) {
        this.b.onMapClick(latLng);
    }
}
