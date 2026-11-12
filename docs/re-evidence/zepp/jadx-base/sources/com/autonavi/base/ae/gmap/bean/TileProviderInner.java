package com.autonavi.base.ae.gmap.bean;

import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore.util.eq;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@JBindingInclude
public class TileProviderInner {

    @JBindingExclude
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

    @JBindingExclude
    private String overlayName;

    @JBindingExclude
    private final HashMap<String, Runnable> reqTaskHandleHashMap = new HashMap<>();

    @JBindingExclude
    private final TileProvider tileProvider;

    public TileProviderInner(TileProvider tileProvider) {
        this.tileProvider = tileProvider;
    }

    @JBindingExclude
    private Object callNativeFunction(String str, Object[] objArr) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @JBindingExclude
    private String createKey(int i, int i2, int i3, long j) {
        return i + " " + i2 + " " + i3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishDownload(Tile tile, TileReqTaskHandle tileReqTaskHandle, String str) {
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(str)) {
                tileReqTaskHandle.finish(tile);
                callNativeFunction("finishTileReqTask", new Object[]{tileReqTaskHandle});
                this.reqTaskHandleHashMap.remove(str);
            }
        }
    }

    @JBindingInclude
    public void cancelTile(int i, int i2, int i3, TileReqTaskHandle tileReqTaskHandle) {
        String strCreateKey = createKey(i, i2, i3, tileReqTaskHandle.nativeObj);
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                Runnable runnable = this.reqTaskHandleHashMap.get(strCreateKey);
                if (runnable != null) {
                    eq.a().b(runnable);
                }
                tileReqTaskHandle.status = 1;
                finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, strCreateKey);
            }
        }
    }

    @JBindingInclude
    public void getTile(final int i, final int i2, final int i3, final TileReqTaskHandle tileReqTaskHandle) {
        final String strCreateKey = createKey(i, i2, i3, tileReqTaskHandle.nativeObj);
        Runnable runnable = new Runnable() { // from class: com.autonavi.base.ae.gmap.bean.TileProviderInner.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (TileProviderInner.this.reqTaskHandleHashMap) {
                        if (TileProviderInner.this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                            if (TileProviderInner.this.tileProvider != null) {
                                Tile tile = TileProvider.NO_TILE;
                                try {
                                    tile = TileProviderInner.this.tileProvider.getTile(i, i2, i3);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                TileProviderInner.this.finishDownload(tile, tileReqTaskHandle, strCreateKey);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TileProviderInner.this.finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, strCreateKey);
                    th2.printStackTrace();
                }
            }
        };
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 5) {
                this.reqTaskHandleHashMap.put(strCreateKey, runnable);
            }
            eq.a().a(runnable);
        }
    }

    @JBindingInclude
    public int getTileHeight() {
        TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileHeight();
        }
        return 0;
    }

    @JBindingInclude
    public int getTileWidth() {
        TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileWidth();
        }
        return 0;
    }

    @JBindingExclude
    public void init(IGlOverlayLayer iGlOverlayLayer, String str) {
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.overlayName = str;
    }
}
