package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IHeatMapLayer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class HeatMapLayer extends BaseOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private IHeatMapLayer mHeatMapLayer;
    private HeatMapLayerOptions options;

    public HeatMapLayer(IHeatMapLayer iHeatMapLayer) {
        super("");
        this.mHeatMapLayer = iHeatMapLayer;
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

    public void destroy() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                iHeatMapLayer.remove();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof HeatMapLayer)) {
            try {
                IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
                if (iHeatMapLayer != null) {
                    return iHeatMapLayer.equalsRemote(((HeatMapLayer) obj).mHeatMapLayer);
                }
                return super.equals(obj) || ((HeatMapLayer) obj).getId().equals(getId());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public HeatMapItem getHeatMapItem(LatLng latLng) {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                return iHeatMapLayer.getHeatMapItem(latLng);
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer == null) {
                return null;
            }
            Object nativeProperties = iGlOverlayLayer.getNativeProperties(this.overlayName, "getHeatMapItem", new Object[]{latLng});
            if (nativeProperties instanceof HeatMapItem) {
                return (HeatMapItem) nativeProperties;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String getId() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            return iHeatMapLayer != null ? iHeatMapLayer.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public HeatMapLayerOptions getOptions() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            return iHeatMapLayer != null ? iHeatMapLayer.getOptions() : this.options;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public float getZIndex() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                return iHeatMapLayer.getZIndex();
            }
            HeatMapLayerOptions heatMapLayerOptions = this.options;
            if (heatMapLayerOptions != null) {
                return heatMapLayerOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            return iHeatMapLayer != null ? iHeatMapLayer.hashCodeRemote() : super.hashCode();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public boolean isVisible() {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                return iHeatMapLayer.isVisible();
            }
            HeatMapLayerOptions heatMapLayerOptions = this.options;
            return heatMapLayerOptions != null && heatMapLayerOptions.isVisible();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setOptions(HeatMapLayerOptions heatMapLayerOptions) {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                iHeatMapLayer.setOptions(heatMapLayerOptions);
            } else {
                this.options = heatMapLayerOptions;
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setVisible(boolean z) {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                iHeatMapLayer.setVisible(z);
                return;
            }
            HeatMapLayerOptions heatMapLayerOptions = this.options;
            if (heatMapLayerOptions != null) {
                heatMapLayerOptions.visible(z);
                a();
            }
        } catch (Throwable unused) {
        }
    }

    public void setZIndex(float f) {
        try {
            IHeatMapLayer iHeatMapLayer = this.mHeatMapLayer;
            if (iHeatMapLayer != null) {
                iHeatMapLayer.setZIndex(f);
                return;
            }
            HeatMapLayerOptions heatMapLayerOptions = this.options;
            if (heatMapLayerOptions != null) {
                heatMapLayerOptions.zIndex(f);
                a();
            }
        } catch (Throwable unused) {
        }
    }

    public HeatMapLayer(IGlOverlayLayer iGlOverlayLayer, HeatMapLayerOptions heatMapLayerOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = heatMapLayerOptions;
        a();
    }
}
