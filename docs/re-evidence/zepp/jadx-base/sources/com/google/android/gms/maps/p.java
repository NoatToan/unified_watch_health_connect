package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzae;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class p extends zzae {
    private final /* synthetic */ GoogleMap.OnInfoWindowCloseListener b;

    public p(GoogleMap googleMap, GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.b = onInfoWindowCloseListener;
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzg(zzt zztVar) {
        this.b.onInfoWindowClose(new Marker(zztVar));
    }
}
