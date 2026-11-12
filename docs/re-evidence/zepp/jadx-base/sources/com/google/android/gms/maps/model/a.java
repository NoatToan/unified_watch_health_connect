package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

/* JADX INFO: loaded from: classes3.dex */
final class a implements TileProvider {
    private final zzaf a;
    private final /* synthetic */ TileOverlayOptions b;

    public a(TileOverlayOptions tileOverlayOptions) {
        this.b = tileOverlayOptions;
        this.a = tileOverlayOptions.a;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.a.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
