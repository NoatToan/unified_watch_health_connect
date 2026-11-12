package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.RemoteException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public dd d;
    private IAMapDelegate f;
    private Context g;
    public List<ITileOverlayDelegate> a = new ArrayList();
    public a b = new a();
    public List<Integer> c = new ArrayList();
    public float[] e = new float[16];

    public static class a implements Serializable, Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ITileOverlayDelegate iTileOverlayDelegate = (ITileOverlayDelegate) obj;
            ITileOverlayDelegate iTileOverlayDelegate2 = (ITileOverlayDelegate) obj2;
            if (iTileOverlayDelegate == null || iTileOverlayDelegate2 == null) {
                return 0;
            }
            try {
                return Float.compare(iTileOverlayDelegate.getZIndex(), iTileOverlayDelegate2.getZIndex());
            } catch (Throwable th) {
                hn.c(th, "TileOverlayView", "compare");
                th.printStackTrace();
                return 0;
            }
        }
    }

    public z(Context context, IAMapDelegate iAMapDelegate) {
        this.d = null;
        this.f = iAMapDelegate;
        this.g = context;
        TileOverlayOptions tileOverlayOptionsTileProvider = new TileOverlayOptions().tileProvider(new du(iAMapDelegate.getMapConfig(), true));
        tileOverlayOptionsTileProvider.memCacheSize(10485760);
        tileOverlayOptionsTileProvider.diskCacheSize(CacheDataSink.DEFAULT_BUFFER_SIZE);
        this.d = new dd(tileOverlayOptionsTileProvider, this, true);
    }

    private boolean i() {
        if (this.f == null) {
            return false;
        }
        return MapsInitializer.isLoadWorldGridMap() || this.f.getMapConfig().getMapLanguage().equals("en");
    }

    public final IAMapDelegate a() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        dd ddVar;
        Iterator<Integer> it2 = this.c.iterator();
        while (it2.hasNext()) {
            er.b(it2.next().intValue());
        }
        this.c.clear();
        if (i() && (ddVar = this.d) != null) {
            ddVar.drawTiles();
        }
        synchronized (this.a) {
            try {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                    if (iTileOverlayDelegate.isVisible()) {
                        iTileOverlayDelegate.drawTiles();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void c() {
        synchronized (this.a) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                if (iTileOverlayDelegate != null) {
                    iTileOverlayDelegate.destroy(true);
                }
            }
            this.a.clear();
        }
    }

    public final void d() {
        synchronized (this.a) {
            Collections.sort(this.a, this.b);
        }
    }

    public final void e() {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.onResume();
        }
        synchronized (this.a) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                if (iTileOverlayDelegate != null) {
                    iTileOverlayDelegate.onResume();
                }
            }
        }
    }

    public final Context f() {
        return this.g;
    }

    public final float[] g() {
        IAMapDelegate iAMapDelegate = this.f;
        return iAMapDelegate != null ? iAMapDelegate.getFinalMatrix() : this.e;
    }

    public final void h() {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.clearTileCache();
            eh.a(this.g, "Map3DCache", "time", (Object) Long.valueOf(System.currentTimeMillis()));
        }
        synchronized (this.a) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                if (iTileOverlayDelegate != null) {
                    iTileOverlayDelegate.clearTileCache();
                }
            }
        }
    }

    public final TileOverlay a(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        if (tileOverlayOptions != null && tileOverlayOptions.getTileProvider() != null) {
            try {
                dd ddVar = new dd(tileOverlayOptions, this, false);
                b(ddVar);
                ddVar.refresh(true);
                this.f.setRunLowFrame(false);
                return new TileOverlay(ddVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public final boolean a(ITileOverlayDelegate iTileOverlayDelegate) {
        boolean zRemove;
        synchronized (this.a) {
            zRemove = this.a.remove(iTileOverlayDelegate);
        }
        return zRemove;
    }

    public final void a(boolean z) {
        try {
            if (i()) {
                CameraPosition cameraPosition = this.f.getCameraPosition();
                if (cameraPosition == null) {
                    return;
                }
                if (cameraPosition.isAbroad && cameraPosition.zoom > 6.0f) {
                    if (this.f.getMapType() == 1) {
                        dd ddVar = this.d;
                        if (ddVar != null) {
                            ddVar.refresh(z);
                        }
                    } else {
                        if (this.d != null) {
                            this.d.a();
                        }
                        hn.c(th, "TileOverlayView", "refresh");
                    }
                } else if (this.d != null) {
                    if (this.f.getMapConfig().getMapLanguage().equals("en")) {
                        this.d.refresh(z);
                    } else {
                        this.d.a();
                    }
                }
            }
            synchronized (this.a) {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                    if (iTileOverlayDelegate != null && iTileOverlayDelegate.isVisible()) {
                        iTileOverlayDelegate.refresh(z);
                    }
                }
            }
        } catch (Throwable th) {
            hn.c(th, "TileOverlayView", "refresh");
        }
    }

    private void b(ITileOverlayDelegate iTileOverlayDelegate) {
        synchronized (this.a) {
            a(iTileOverlayDelegate);
            this.a.add(iTileOverlayDelegate);
        }
        d();
    }

    public final void b(boolean z) {
        dd ddVar = this.d;
        if (ddVar != null) {
            ddVar.onFling(z);
        }
        synchronized (this.a) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ITileOverlayDelegate iTileOverlayDelegate = this.a.get(i);
                if (iTileOverlayDelegate != null) {
                    iTileOverlayDelegate.onFling(z);
                }
            }
        }
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }
}
