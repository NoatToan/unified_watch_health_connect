package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes14.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i14, int i15) {
        this.zza = i14;
        this.zzb = i15;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i14, int i15, int i16) {
        URL tileUrl = getTileUrl(i14, i15, i16);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzh.zzb(4352);
            int i17 = this.zza;
            int i18 = this.zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i19 = inputStream.read(bArr);
                if (i19 == -1) {
                    return new Tile(i17, i18, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i19);
            }
        } catch (IOException unused) {
            return null;
        } finally {
            com.google.android.gms.internal.maps.zzh.zza();
        }
    }

    public abstract URL getTileUrl(int i14, int i15, int i16);
}
