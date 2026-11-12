package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends zzm {
    private final /* synthetic */ GoogleMap.OnCameraChangeListener b;

    public e0(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.b = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzl
    public final void onCameraChange(CameraPosition cameraPosition) {
        this.b.onCameraChange(cameraPosition);
    }
}
