package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IPolyline;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Polyline extends BaseOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private PolylineOptions options;
    private IPolyline polylineDelegate;

    public Polyline(IGlOverlayLayer iGlOverlayLayer, PolylineOptions polylineOptions) {
        super("");
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = polylineOptions;
    }

    private void a() {
        try {
            synchronized (this) {
                IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
                if (!TextUtils.isEmpty(this.overlayName) && iGlOverlayLayer != null) {
                    iGlOverlayLayer.updateOption(this.overlayName, this.options);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.equalsRemote(((Polyline) obj).polylineDelegate);
            }
            return super.equals(obj) || ((Polyline) obj).getId() == getId();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public int getColor() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.getColor();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.getColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int getEraseColor() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getEraseColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public BitmapDescriptor getEraseTexture() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getEraseTexture();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean getEraseVisible() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getEraseVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public float getFootPrintGap() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getFootPrintGap();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public BitmapDescriptor getFootPrintTexture() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getFootPrintTexture();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String getId() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            return iPolyline != null ? iPolyline.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public LatLng getNearestLatLng(LatLng latLng) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            return iPolyline.getNearestLatLng(latLng);
        }
        IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (iGlOverlayLayer != null) {
            return iGlOverlayLayer.getNearestLatLng(this.options, latLng);
        }
        return null;
    }

    public PolylineOptions getOptions() {
        IPolyline iPolyline = this.polylineDelegate;
        return iPolyline != null ? iPolyline.getOptions() : this.options;
    }

    public List<LatLng> getPoints() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.getPoints();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.getPoints();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public float getPolylineShownRangeBegin() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getPolylineShownRangeBegin();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public float getPolylineShownRangeEnd() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.getPolylineShownRangeEnd();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public float getShownRatio() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.getShownRatio();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.getShownRatio();
            }
            return -1.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1.0f;
        }
    }

    public float getWidth() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.getWidth();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.getWidth();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public float getZIndex() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.getZIndex();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            return iPolyline != null ? iPolyline.hashCodeRemote() : super.hashCode();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public boolean isDottedLine() {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            return iPolyline.isDottedLine();
        }
        PolylineOptions polylineOptions = this.options;
        if (polylineOptions != null) {
            return polylineOptions.isDottedLine();
        }
        return false;
    }

    public boolean isGeodesic() {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            return iPolyline.isGeodesic();
        }
        PolylineOptions polylineOptions = this.options;
        return polylineOptions != null && polylineOptions.isGeodesic();
    }

    public boolean isShowPolylineRangeEnable() {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate == null && (polylineOptions = this.options) != null) {
                return polylineOptions.isShowPolylineRangeEnable();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean isVisible() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                return iPolyline.isVisible();
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                return polylineOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void remove() {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.remove();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
            this.overlayName = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setAboveMaskLayer(boolean z) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setAboveMaskLayer(z);
            return;
        }
        PolylineOptions polylineOptions = this.options;
        if (polylineOptions != null) {
            polylineOptions.aboveMaskLayer(z);
            a();
        }
    }

    public void setColor(int i) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setColor(i);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.color(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Deprecated
    public void setCustemTextureIndex(List<Integer> list) {
        setCustomTextureIndex(list);
    }

    public void setCustomTexture(BitmapDescriptor bitmapDescriptor) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setCustomTexture(bitmapDescriptor);
            return;
        }
        PolylineOptions polylineOptions = this.options;
        if (polylineOptions != null) {
            polylineOptions.setCustomTexture(bitmapDescriptor);
            a();
        }
    }

    public void setCustomTextureIndex(List<Integer> list) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setCustomTextureIndex(list);
            return;
        }
        synchronized (this) {
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.setCustomTextureIndex(list);
                a();
            }
        }
    }

    public void setCustomTextureList(List<BitmapDescriptor> list) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setCustomTextureList(list);
            } else {
                this.options.setCustomTextureList(list);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDottedLine(boolean z) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setDottedLine(z);
            return;
        }
        PolylineOptions polylineOptions = this.options;
        if (polylineOptions != null) {
            polylineOptions.setDottedLine(z);
            a();
        }
    }

    public void setEraseColor(boolean z, int i) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.setEraseColor(z, i);
            a();
        } catch (Throwable unused) {
        }
    }

    public void setEraseTexture(boolean z, BitmapDescriptor bitmapDescriptor) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.setEraseTexture(z, bitmapDescriptor);
            a();
        } catch (Throwable unused) {
        }
    }

    public void setFootPrintGap(float f) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.setFootPrintGap(f);
            a();
        } catch (Throwable unused) {
        }
    }

    public void setFootPrintTexture(BitmapDescriptor bitmapDescriptor) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.setFootPrintTexture(bitmapDescriptor);
            a();
        } catch (Throwable unused) {
        }
    }

    public void setGeodesic(boolean z) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                if (iPolyline.isGeodesic() != z) {
                    List<LatLng> points = getPoints();
                    this.polylineDelegate.setGeodesic(z);
                    setPoints(points);
                    return;
                }
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.geodesic(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setOptions(PolylineOptions polylineOptions) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setOptions(polylineOptions);
        } else {
            this.options = polylineOptions;
            a();
        }
    }

    public void setPoints(List<LatLng> list) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setPoints(list);
                return;
            }
            synchronized (this) {
                PolylineOptions polylineOptions = this.options;
                if (polylineOptions != null) {
                    polylineOptions.setPoints(list);
                    a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setPolylineShowRange(float f, float f2) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.setPolylineShowRange(f, f2);
            a();
        } catch (Throwable unused) {
        }
    }

    public void setShownRange(float f, float f2) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setShowRange(f, f2);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.setShownRange(f, f2);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setShownRatio(float f) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setShownRatio(f);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.setShownRatio(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setTransparency(float f) {
        IPolyline iPolyline = this.polylineDelegate;
        if (iPolyline != null) {
            iPolyline.setTransparency(f);
            return;
        }
        PolylineOptions polylineOptions = this.options;
        if (polylineOptions != null) {
            polylineOptions.transparency(f);
            a();
        }
    }

    public void setVisible(boolean z) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setVisible(z);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.visible(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setWidth(float f) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setWidth(f);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.width(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setZIndex(float f) {
        try {
            IPolyline iPolyline = this.polylineDelegate;
            if (iPolyline != null) {
                iPolyline.setZIndex(f);
                return;
            }
            PolylineOptions polylineOptions = this.options;
            if (polylineOptions != null) {
                polylineOptions.zIndex(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void showPolylineRangeEnabled(boolean z) {
        PolylineOptions polylineOptions;
        try {
            if (this.polylineDelegate != null || (polylineOptions = this.options) == null) {
                return;
            }
            polylineOptions.showPolylineRangeEnabled(z);
            a();
        } catch (Throwable unused) {
        }
    }

    public Polyline(IGlOverlayLayer iGlOverlayLayer, PolylineOptions polylineOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = polylineOptions;
    }

    public Polyline(IPolyline iPolyline) {
        super("");
        this.polylineDelegate = iPolyline;
    }
}
