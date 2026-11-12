package com.google.android.gms.maps;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
final class q extends zzi {
    private final /* synthetic */ GoogleMap.InfoWindowAdapter b;

    public q(GoogleMap googleMap, GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        this.b = infoWindowAdapter;
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final IObjectWrapper zzh(zzt zztVar) {
        return ObjectWrapper.wrap(this.b.getInfoWindow(new Marker(zztVar)));
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final IObjectWrapper zzi(zzt zztVar) {
        return ObjectWrapper.wrap(this.b.getInfoContents(new Marker(zztVar)));
    }
}
