package com.autonavi.base.ae.gmap.bean;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileOverlaySource;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import defpackage.f7t;
import defpackage.pms;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public class TileProviderInner {

    @JBindingExclude
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;

    @JBindingInclude
    private List<TileOverlaySource> mTileSource;

    @JBindingExclude
    private String overlayName;

    @JBindingExclude
    private final HashMap<String, f7t> reqTaskHandleHashMap = new HashMap<>();

    @JBindingExclude
    private final TileProvider tileProvider;

    @JBindingExclude
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
        return i + " " + i2 + " " + i3 + "-" + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishDownload(Tile tile, TileReqTaskHandle tileReqTaskHandle, String str) {
        boolean z;
        if (this.glOverlayLayerRef.get() == null) {
            return;
        }
        synchronized (this.reqTaskHandleHashMap) {
            try {
                if (this.reqTaskHandleHashMap.containsKey(str)) {
                    if (this.reqTaskHandleHashMap.containsKey(str)) {
                        this.reqTaskHandleHashMap.remove(str);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        tileReqTaskHandle.finish(tile);
                        callNativeFunction("finishTileReqTask", new Object[]{tileReqTaskHandle});
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JBindingInclude
    public void cancelTile(TileSourceReq tileSourceReq, TileReqTaskHandle tileReqTaskHandle) {
        String strCreateKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        synchronized (this.reqTaskHandleHashMap) {
            try {
                if (this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                    f7t f7tVar = this.reqTaskHandleHashMap.get(strCreateKey);
                    if (f7tVar != null) {
                        pms.a();
                        pms.d(f7tVar);
                    }
                    tileReqTaskHandle.status = 1;
                    finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, strCreateKey);
                    try {
                        TileProvider tileProvider = this.tileProvider;
                        if (tileProvider instanceof TileSourceProvider) {
                            ((TileSourceProvider) tileProvider).cancel(tileSourceReq);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JBindingInclude
    public void getTile(final TileSourceReq tileSourceReq, final TileReqTaskHandle tileReqTaskHandle) {
        final String strCreateKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        f7t f7tVar = new f7t() { // from class: com.autonavi.base.ae.gmap.bean.TileProviderInner.1
            @Override // defpackage.f7t
            public void runTask() {
                try {
                    synchronized (TileProviderInner.this.reqTaskHandleHashMap) {
                        try {
                            if (TileProviderInner.this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                                if (TileProviderInner.this.tileProvider != null) {
                                    Tile tile = TileProvider.NO_TILE;
                                    try {
                                        if (TileProviderInner.this.tileProvider instanceof TileSourceProvider) {
                                            tile = ((TileSourceProvider) TileProviderInner.this.tileProvider).getTile(tileSourceReq);
                                        } else {
                                            TileProvider tileProvider = TileProviderInner.this.tileProvider;
                                            TileSourceReq tileSourceReq2 = tileSourceReq;
                                            tile = tileProvider.getTile(tileSourceReq2.x, tileSourceReq2.y, tileSourceReq2.zoom);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    TileProviderInner.this.finishDownload(tile, tileReqTaskHandle, strCreateKey);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    TileProviderInner.this.finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, strCreateKey);
                    th2.printStackTrace();
                }
            }
        };
        synchronized (this.reqTaskHandleHashMap) {
            try {
                if (this.reqTaskHandleHashMap.containsKey(strCreateKey)) {
                    return;
                }
                this.reqTaskHandleHashMap.put(strCreateKey, f7tVar);
                pms.a().b(f7tVar);
            } catch (Throwable th) {
                throw th;
            }
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

    public void setTileSource(List<TileOverlaySource> list) {
        this.mTileSource = list;
    }
}
