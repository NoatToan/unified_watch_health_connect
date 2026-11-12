package defpackage;

import android.os.RemoteException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class rhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IAMapDelegate f32558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TileOverlay f32559b;
    public TileOverlay c;
    public boolean d = false;
    public boolean e = false;

    public rhs(IAMapDelegate iAMapDelegate) {
        this.f32558a = iAMapDelegate;
    }

    public static boolean f() {
        return MapsInitializer.isLoadWorldGridMap();
    }

    public final void a() {
        c();
        d();
    }

    public final void b() {
        if (this.f32559b == null) {
            TileOverlayOptions tileOverlayOptionsTileProvider = new TileOverlayOptions().tileProvider(new rks(this.f32558a.getMapConfig()));
            tileOverlayOptionsTileProvider.memCacheSize(10485760);
            tileOverlayOptionsTileProvider.diskCacheSize(20480);
            tileOverlayOptionsTileProvider.visible(this.d);
            try {
                this.f32559b = this.f32558a.addTileOverlay(tileOverlayOptionsTileProvider);
                this.c = this.f32558a.addTileOverlay(tileOverlayOptionsTileProvider);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void c() {
        boolean zE = e();
        if (zE) {
            b();
        }
        if (this.d != zE) {
            this.d = zE;
            TileOverlay tileOverlay = this.f32559b;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zE);
            }
        }
    }

    public final void d() {
        boolean zF = f();
        if (zF) {
            b();
        }
        if (this.e != zF) {
            this.e = zF;
            TileOverlay tileOverlay = this.c;
            if (tileOverlay != null) {
                tileOverlay.setVisible(zF);
            }
        }
    }

    public final boolean e() {
        IAMapDelegate iAMapDelegate = this.f32558a;
        if (iAMapDelegate == null) {
            return false;
        }
        return iAMapDelegate.getMapConfig().getMapLanguage().equals("en");
    }
}
