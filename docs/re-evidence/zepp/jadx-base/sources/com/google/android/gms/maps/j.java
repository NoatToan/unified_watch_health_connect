package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

/* JADX INFO: loaded from: classes3.dex */
final class j extends zzaq {
    private final /* synthetic */ OnMapReadyCallback b;

    public j(SupportMapFragment.a aVar, OnMapReadyCallback onMapReadyCallback) {
        this.b = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.b.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
