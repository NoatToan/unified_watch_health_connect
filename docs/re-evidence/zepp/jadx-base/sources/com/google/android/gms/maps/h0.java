package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends zzq {
    private final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener b;

    public h0(GoogleMap googleMap, GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.b = onCameraMoveCanceledListener;
    }

    @Override // com.google.android.gms.maps.internal.zzp
    public final void onCameraMoveCanceled() {
        this.b.onCameraMoveCanceled();
    }
}
