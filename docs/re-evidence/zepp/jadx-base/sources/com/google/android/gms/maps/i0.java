package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzo;

/* JADX INFO: loaded from: classes3.dex */
final class i0 extends zzo {
    private final /* synthetic */ GoogleMap.OnCameraIdleListener b;

    public i0(GoogleMap googleMap, GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        this.b = onCameraIdleListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void onCameraIdle() {
        this.b.onCameraIdle();
    }
}
