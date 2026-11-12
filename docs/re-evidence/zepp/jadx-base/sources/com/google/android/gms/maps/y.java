package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.GroundOverlay;

/* JADX INFO: loaded from: classes3.dex */
final class y extends zzy {
    private final /* synthetic */ GoogleMap.OnGroundOverlayClickListener b;

    public y(GoogleMap googleMap, GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.b = onGroundOverlayClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zza(zzk zzkVar) {
        this.b.onGroundOverlayClick(new GroundOverlay(zzkVar));
    }
}
