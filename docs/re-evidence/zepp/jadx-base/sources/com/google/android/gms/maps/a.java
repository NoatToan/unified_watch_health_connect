package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.maps.model.IndoorBuilding;

/* JADX INFO: loaded from: classes3.dex */
final class a extends com.google.android.gms.maps.internal.zzaa {
    private final /* synthetic */ GoogleMap.OnIndoorStateChangeListener b;

    public a(GoogleMap googleMap, GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.b = onIndoorStateChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void onIndoorBuildingFocused() {
        this.b.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zza(zzn zznVar) {
        this.b.onIndoorLevelActivated(new IndoorBuilding(zznVar));
    }
}
