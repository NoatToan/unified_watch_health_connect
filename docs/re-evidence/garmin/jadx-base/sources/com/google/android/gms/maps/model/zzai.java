package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzay;

/* JADX INFO: loaded from: classes14.dex */
final class zzai extends zzay {
    final /* synthetic */ TileProvider zza;

    public zzai(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    public final Tile zzb(int i14, int i15, int i16) {
        return this.zza.getTile(i14, i15, i16);
    }
}
