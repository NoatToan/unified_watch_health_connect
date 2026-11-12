package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes14.dex */
public final class zzax extends zza implements zzaz {
    public zzax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    public final Tile zzb(int i14, int i15, int i16) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        parcelZza.writeInt(i15);
        parcelZza.writeInt(i16);
        Parcel parcelZzJ = zzJ(1, parcelZza);
        Tile tile = (Tile) zzc.zza(parcelZzJ, Tile.CREATOR);
        parcelZzJ.recycle();
        return tile;
    }
}
