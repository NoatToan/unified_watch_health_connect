package com.amap.api.col.p0003sl;

import android.os.RemoteException;
import androidx.media3.datasource.cache.CacheDataSink;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class cq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IAMapDelegate f2315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TileOverlay f2316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TileOverlay f2317c;
    private boolean d = false;
    private boolean e = false;

    public cq(IAMapDelegate iAMapDelegate) {
        this.f2315a = iAMapDelegate;
    }

    private void b() {
        if (this.f2316b == null) {
            TileOverlayOptions tileOverlayOptionsTileProvider = new TileOverlayOptions().tileProvider(new di(this.f2315a.getMapConfig()));
            tileOverlayOptionsTileProvider.memCacheSize(10485760);
            tileOverlayOptionsTileProvider.diskCacheSize(CacheDataSink.DEFAULT_BUFFER_SIZE);
            tileOverlayOptionsTileProvider.visible(this.d);
            try {
                this.f2316b = this.f2315a.addTileOverlay(tileOverlayOptionsTileProvider);
                this.f2317c = this.f2315a.addTileOverlay(tileOverlayOptionsTileProvider);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void a() {
        c();
        d();
    }

    private void c() {
        boolean zE = e();
        if (zE) {
            b();
        }
        if (this.d != zE) {
            this.d = zE;
            TileOverlay tileOverlay = this.f2316b;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zE);
            }
        }
    }

    private void d() {
        boolean zF = f();
        if (zF) {
            b();
        }
        if (this.e != zF) {
            this.e = zF;
            TileOverlay tileOverlay = this.f2317c;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zF);
            }
        }
    }

    private boolean e() {
        IAMapDelegate iAMapDelegate = this.f2315a;
        if (iAMapDelegate == null) {
            return false;
        }
        return iAMapDelegate.getMapConfig().getMapLanguage().equals("en");
    }

    private static boolean f() {
        return MapsInitializer.isLoadWorldGridMap();
    }
}
