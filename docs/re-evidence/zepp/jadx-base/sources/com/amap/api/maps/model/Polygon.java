package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IPolygon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Polygon extends BaseOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private PolygonOptions options;
    private IPolygon polygonDelegate;

    public Polygon(IPolygon iPolygon) {
        super("");
        this.polygonDelegate = iPolygon;
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

    public final boolean contains(LatLng latLng) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.contains(latLng);
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                return iGlOverlayLayer.IsPolygonContainsPoint(this.options, latLng);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Polygon)) {
            try {
                IPolygon iPolygon = this.polygonDelegate;
                if (iPolygon != null) {
                    return iPolygon.equalsRemote(((Polygon) obj).polygonDelegate);
                }
                return super.equals(obj) || ((Polygon) obj).getId() == getId();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final int getFillColor() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getFillColor();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getFillColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final List<BaseHoleOptions> getHoleOptions() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getHoleOptions();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getHoleOptions();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String getId() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            return iPolygon != null ? iPolygon.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final List<LatLng> getPoints() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getPoints();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getPoints();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final int getStrokeColor() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getStrokeColor();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getStrokeColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final float getStrokeWidth() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getStrokeWidth();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getStrokeWidth();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final float getZIndex() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.getZIndex();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final int hashCode() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            return iPolygon != null ? iPolygon.hashCodeRemote() : super.hashCode();
        } catch (Throwable unused) {
            return super.hashCode();
        }
    }

    public final boolean isVisible() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                return iPolygon.isVisible();
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                return polygonOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final void remove() {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.remove();
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

    public final void setFillColor(int i) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setFillColor(i);
                return;
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                polygonOptions.fillColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setHoleOptions(List<BaseHoleOptions> list) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setHoleOptions(list);
                return;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            this.options.setHoleOptions(list);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setPoints(list);
            } else {
                this.options.setPoints(list);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStrokeColor(int i) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setStrokeColor(i);
                return;
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                polygonOptions.strokeColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setStrokeWidth(f);
            } else {
                this.options.strokeWidth(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setVisible(boolean z) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setVisible(z);
                return;
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                polygonOptions.visible(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        try {
            IPolygon iPolygon = this.polygonDelegate;
            if (iPolygon != null) {
                iPolygon.setZIndex(f);
                return;
            }
            PolygonOptions polygonOptions = this.options;
            if (polygonOptions != null) {
                polygonOptions.zIndex(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Polygon(IGlOverlayLayer iGlOverlayLayer, PolygonOptions polygonOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = polygonOptions;
    }
}
