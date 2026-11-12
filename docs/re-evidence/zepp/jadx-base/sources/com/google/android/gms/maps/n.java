package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class n extends zzac {
    private final /* synthetic */ GoogleMap.OnInfoWindowClickListener b;

    public n(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.b = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zze(zzt zztVar) {
        this.b.onInfoWindowClick(new Marker(zztVar));
    }
}
