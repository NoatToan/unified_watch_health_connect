package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzag;

/* JADX INFO: loaded from: classes3.dex */
final class b extends zzag {
    private final /* synthetic */ TileProvider b;

    public b(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.b = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaf
    public final Tile getTile(int i, int i2, int i3) {
        return this.b.getTile(i, i2, i3);
    }
}
