package com.amap.api.mapcore.util;

import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.HeatMapItem;
import com.amap.api.maps.model.HeatMapLayerOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.WeightedLatLng;
import com.autonavi.amap.mapcore.interfaces.IHeatMapLayer;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeHeatMapLayer;
import com.autonavi.base.amap.mapcore.MapConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cr implements IHeatMapLayer, IOverlayDelegate {
    private IGlOverlayLayer b;
    private String d;
    private boolean f;
    private df g;
    private HeatMapLayerOptions h;
    private boolean i;
    public long a = -1;
    private boolean c = true;
    private float e = 0.0f;

    public cr(IGlOverlayLayer iGlOverlayLayer) {
        this.i = false;
        try {
            this.i = false;
            this.b = iGlOverlayLayer;
            this.d = getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(df dfVar) {
        this.g = dfVar;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        synchronized (this) {
            this.i = true;
            long j = this.a;
            if (j != -1) {
                AMapNativeHeatMapLayer.nativeDestroy(j);
                this.a = -1L;
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        df dfVar;
        LatLng latLng;
        try {
            if (this.i) {
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.b;
            if (iGlOverlayLayer != null && this.g == null) {
                this.g = iGlOverlayLayer.getGLShaderManager();
            }
            if (this.g == null || mapConfig == null || !this.c) {
                return;
            }
            if (this.a == -1) {
                long jNativeCreate = AMapNativeHeatMapLayer.nativeCreate();
                this.a = jNativeCreate;
                if (jNativeCreate == -1 || (dfVar = this.g) == null) {
                    return;
                }
                AMapNativeHeatMapLayer.nativeSetGLShaderManager(jNativeCreate, dfVar.a());
                return;
            }
            synchronized (this) {
                if (this.a != -1) {
                    if (this.f) {
                        HeatMapLayerOptions heatMapLayerOptions = this.h;
                        if ((heatMapLayerOptions == null || heatMapLayerOptions.getData() == null || this.h.getData().size() <= 0 || this.h.getGradient() == null || this.h.getGradient().getColors() == null || this.h.getGradient().getColors().length <= 0 || this.h.getGradient().getStartPoints() == null || this.h.getGradient().getStartPoints().length <= 0) ? false : true) {
                            double[] dArr = new double[this.h.getData().size() * 3];
                            double d = Double.NaN;
                            double d2 = Double.NaN;
                            int i = 0;
                            for (WeightedLatLng weightedLatLng : this.h.getData()) {
                                if (weightedLatLng == null || (latLng = weightedLatLng.latLng) == null) {
                                    Log.e("mapcore", "read file failed");
                                } else {
                                    int i2 = i * 3;
                                    double d3 = latLng.latitude;
                                    dArr[i2 + 0] = d3;
                                    dArr[i2 + 1] = latLng.longitude;
                                    dArr[i2 + 2] = weightedLatLng.intensity;
                                    if (Double.isNaN(d)) {
                                        d = d3;
                                    }
                                    if (Double.isNaN(d2)) {
                                        d2 = d3;
                                    }
                                    if (d3 > d2) {
                                        d2 = d3;
                                    }
                                    d = d3 < d ? d3 : d;
                                }
                                i++;
                            }
                            AMapNativeHeatMapLayer.nativeSetOptions(this.a, dArr, (int) this.h.getMaxIntensity(), this.h.getSize(), this.h.getGradient().getColors(), this.h.getGradient().getStartPoints(), this.h.getMaxZoom(), this.h.getMinZoom(), this.h.getOpacity(), this.h.getGap(), this.h.getType(), (Double.isNaN(d) || Double.isNaN(d2)) ? 0.0d : (d + d2) / 2.0d);
                            this.f = false;
                        }
                    }
                    AMapNativeHeatMapLayer.nativeRender(this.a, mapConfig.getViewMatrix(), mapConfig.getProjectionMatrix(), (int) mapConfig.getSX(), (int) mapConfig.getSY(), mapConfig.getSZ());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IHeatMapLayer
    public final HeatMapItem getHeatMapItem(LatLng latLng) {
        Object objNativeGetHeatMapItem;
        if (latLng == null) {
            return null;
        }
        long j = this.a;
        if (j == -1 || (objNativeGetHeatMapItem = AMapNativeHeatMapLayer.nativeGetHeatMapItem(j, latLng.latitude, latLng.longitude)) == null || !(objNativeGetHeatMapItem instanceof HeatMapItem)) {
            return null;
        }
        return (HeatMapItem) objNativeGetHeatMapItem;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() {
        if (this.d == null) {
            this.d = this.b.createId("HeatMapLayer");
        }
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IHeatMapLayer
    public final HeatMapLayerOptions getOptions() {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return 0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        IGlOverlayLayer iGlOverlayLayer = this.b;
        if (iGlOverlayLayer == null || iGlOverlayLayer.removeOverlay(this.d, true)) {
            return;
        }
        destroy();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IHeatMapLayer
    public final void setOptions(HeatMapLayerOptions heatMapLayerOptions) {
        this.h = heatMapLayerOptions;
        if (heatMapLayerOptions != null) {
            this.e = heatMapLayerOptions.getZIndex();
            this.c = this.h.isVisible();
        }
        this.f = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) {
        this.c = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) {
        try {
            this.e = f;
            this.b.changeOverlayIndex();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
