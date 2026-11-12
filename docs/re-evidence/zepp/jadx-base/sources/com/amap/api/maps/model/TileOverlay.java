package com.amap.api.maps.model;

import android.os.RemoteException;
import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.ITileOverlay;
import com.autonavi.base.ae.gmap.bean.TileProviderInner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class TileOverlay extends BaseOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private ITileOverlay mTileOverlayDelegate;
    private TileOverlayOptions options;

    public TileOverlay(ITileOverlay iTileOverlay) {
        super("");
        this.mTileOverlayDelegate = iTileOverlay;
    }

    private Object a(String str) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (!TextUtils.isEmpty(this.overlayName) && iGlOverlayLayer != null) {
                return iGlOverlayLayer.getNativeProperties(this.overlayName, str, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void clearTileCache() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        if (iTileOverlay != null) {
            iTileOverlay.clearTileCache();
        } else {
            a("clearTileCache");
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof TileOverlay)) {
            try {
                ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
                if (iTileOverlay != null) {
                    return iTileOverlay.equalsRemote(((TileOverlay) obj).mTileOverlayDelegate);
                }
                TileOverlayOptions tileOverlayOptions = this.options;
                return tileOverlayOptions != null && tileOverlayOptions.equals(((TileOverlay) obj).options) && this.overlayName.equals(((TileOverlay) obj).overlayName);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final String getId() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        return iTileOverlay != null ? iTileOverlay.getId() : this.overlayName;
    }

    public final float getZIndex() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        return iTileOverlay != null ? iTileOverlay.getZIndex() : this.options.getZIndex();
    }

    public final int hashCode() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        if (iTileOverlay != null) {
            return iTileOverlay.hashCode();
        }
        if (this.options == null) {
            return super.hashCode();
        }
        String str = this.overlayName;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.options.hashCode();
    }

    public final boolean isVisible() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        return iTileOverlay != null ? iTileOverlay.isVisible() : this.options.isVisible();
    }

    public final void remove() {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        if (iTileOverlay != null) {
            iTileOverlay.remove();
            return;
        }
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public final void setVisible(boolean z) {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        if (iTileOverlay != null) {
            iTileOverlay.setVisible(z);
        } else {
            this.options.visible(z);
            a();
        }
    }

    public final void setZIndex(float f) {
        ITileOverlay iTileOverlay = this.mTileOverlayDelegate;
        if (iTileOverlay != null) {
            iTileOverlay.setZIndex(f);
        } else {
            this.options.zIndex(f);
            a();
        }
    }

    public TileOverlay(IGlOverlayLayer iGlOverlayLayer, TileOverlayOptions tileOverlayOptions, String str) {
        TileProviderInner tileProviderInner;
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = tileOverlayOptions;
        if (tileOverlayOptions == null || (tileProviderInner = tileOverlayOptions.getTileProviderInner()) == null) {
            return;
        }
        tileProviderInner.init(iGlOverlayLayer, str);
    }

    private void a() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (Throwable unused) {
        }
    }
}
