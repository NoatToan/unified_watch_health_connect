package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;

/* JADX INFO: loaded from: classes2.dex */
public final class cu {
    private final IAMapDelegate a;
    private TileOverlay b;
    private TileOverlay c;
    private boolean d = false;
    private boolean e = false;

    public cu(IAMapDelegate iAMapDelegate) {
        this.a = iAMapDelegate;
    }

    private void c() {
        if (this.b == null) {
            TileOverlayOptions tileOverlayOptionsTileProvider = new TileOverlayOptions().tileProvider(new du(this.a.getMapConfig(), false));
            tileOverlayOptionsTileProvider.memCacheSize(10485760);
            tileOverlayOptionsTileProvider.diskCacheSize(CacheDataSink.DEFAULT_BUFFER_SIZE);
            tileOverlayOptionsTileProvider.visible(this.d);
            try {
                this.b = this.a.addTileOverlay(tileOverlayOptionsTileProvider);
                this.c = this.a.addTileOverlay(tileOverlayOptionsTileProvider);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void a() {
        IAMapDelegate iAMapDelegate = this.a;
        boolean zEquals = iAMapDelegate == null ? false : iAMapDelegate.getMapConfig().getMapLanguage().equals("en");
        if (zEquals) {
            c();
        }
        if (this.d != zEquals) {
            this.d = zEquals;
            TileOverlay tileOverlay = this.b;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zEquals);
            }
        }
    }

    public final void b() {
        boolean zIsLoadWorldGridMap = MapsInitializer.isLoadWorldGridMap();
        if (zIsLoadWorldGridMap) {
            c();
        }
        if (this.e != zIsLoadWorldGridMap) {
            this.e = zIsLoadWorldGridMap;
            TileOverlay tileOverlay = this.c;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zIsLoadWorldGridMap);
            }
        }
    }
}
