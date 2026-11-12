package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzag;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class o extends zzag {
    private final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener b;

    public o(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.b = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzf(zzt zztVar) {
        this.b.onInfoWindowLongClick(new Marker(zztVar));
    }
}
