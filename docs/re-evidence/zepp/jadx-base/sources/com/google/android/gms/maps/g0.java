package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzs;

/* JADX INFO: loaded from: classes3.dex */
final class g0 extends zzs {
    private final /* synthetic */ GoogleMap.OnCameraMoveListener b;

    public g0(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.b = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void onCameraMove() {
        this.b.onCameraMove();
    }
}
