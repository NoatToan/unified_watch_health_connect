package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzu;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends zzu {
    private final /* synthetic */ GoogleMap.OnCameraMoveStartedListener b;

    public f0(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.b = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void onCameraMoveStarted(int i) {
        this.b.onCameraMoveStarted(i);
    }
}
