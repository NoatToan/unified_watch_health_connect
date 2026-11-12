package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.maps.internal.zzbe;
import com.google.android.gms.maps.model.Polygon;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends zzbe {
    private final /* synthetic */ GoogleMap.OnPolygonClickListener b;

    public a0(GoogleMap googleMap, GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.b = onPolygonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zza(zzw zzwVar) {
        this.b.onPolygonClick(new Polygon(zzwVar));
    }
}
