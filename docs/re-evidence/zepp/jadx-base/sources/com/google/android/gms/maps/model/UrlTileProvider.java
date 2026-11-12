package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int a;
    private final int b;

    public UrlTileProvider(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            int i4 = this.a;
            int i5 = this.b;
            InputStream inputStreamOpenStream = tileUrl.openStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i6 = inputStreamOpenStream.read(bArr);
                if (i6 == -1) {
                    return new Tile(i4, i5, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public abstract URL getTileUrl(int i, int i2, int i3);
}
