package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzao;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
final class k0 extends zzao {
    private final /* synthetic */ GoogleMap.OnMapLongClickListener b;

    public k0(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.b = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void onMapLongClick(LatLng latLng) {
        this.b.onMapLongClick(latLng);
    }
}
