package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

/* JADX INFO: loaded from: classes21.dex */
final class zzab extends zzaq {
    private final /* synthetic */ OnMapReadyCallback zzbb;

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.zzbb.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }

    zzab(MapFragment.zza zzaVar, OnMapReadyCallback onMapReadyCallback) {
        this.zzbb = onMapReadyCallback;
    }
}
