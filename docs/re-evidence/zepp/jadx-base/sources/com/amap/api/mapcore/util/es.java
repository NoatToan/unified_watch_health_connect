package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class es extends et {
    private TileProvider e;

    public es(Context context, int i, int i2) {
        NetworkInfo activeNetworkInfo;
        super(context, i, i2);
        this.e = null;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return;
        }
        activeNetworkInfo.isConnectedOrConnecting();
    }

    private Bitmap c(dd.a aVar) {
        try {
            Tile tile = this.e.getTile(aVar.a, aVar.b, aVar.c);
            if (tile == null || tile == TileProvider.NO_TILE) {
                return null;
            }
            byte[] bArr = tile.data;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(TileProvider tileProvider) {
        this.e = tileProvider;
    }

    @Override // com.amap.api.mapcore.util.et, com.amap.api.mapcore.util.eu
    public final Bitmap a(Object obj) {
        return c((dd.a) obj);
    }
}
