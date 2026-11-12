package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

/* JADX INFO: loaded from: classes21.dex */
final class zzs implements TileProvider {
    private final zzaf zzek;
    private final /* synthetic */ TileOverlayOptions zzel;

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzek.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }

    zzs(TileOverlayOptions tileOverlayOptions) {
        this.zzel = tileOverlayOptions;
        this.zzek = tileOverlayOptions.zzeh;
    }
}
