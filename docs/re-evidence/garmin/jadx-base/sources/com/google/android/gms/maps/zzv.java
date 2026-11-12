package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes14.dex */
final class zzv extends com.google.android.gms.maps.internal.zzu {
    final /* synthetic */ GoogleMap.OnCameraMoveStartedListener zza;

    public zzv(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i14) {
        this.zza.onCameraMoveStarted(i14);
    }
}
