package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzam;

/* JADX INFO: loaded from: classes3.dex */
final class v extends zzam {
    private final /* synthetic */ GoogleMap.OnMapLoadedCallback b;

    public v(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.b = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void onMapLoaded() throws RemoteException {
        this.b.onMapLoaded();
    }
}
