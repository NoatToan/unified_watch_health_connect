package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaz;

/* JADX INFO: loaded from: classes14.dex */
final class zzah implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzaz zzb;

    public zzah(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i14, int i15, int i16) {
        try {
            return this.zzb.zzb(i14, i15, i16);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
