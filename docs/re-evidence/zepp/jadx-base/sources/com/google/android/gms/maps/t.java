package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzaw;

/* JADX INFO: loaded from: classes3.dex */
final class t extends zzaw {
    private final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener b;

    public t(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.b = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean onMyLocationButtonClick() throws RemoteException {
        return this.b.onMyLocationButtonClick();
    }
}
