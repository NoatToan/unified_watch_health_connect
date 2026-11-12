package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.ICircle;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Circle extends BaseOverlay {
    public WeakReference<IGlOverlayLayer> a;
    private ICircle iCircleDel;
    private CircleOptions options;

    public Circle(ICircle iCircle) {
        super("");
        this.iCircleDel = iCircle;
    }

    private void a() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.a.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (Throwable unused) {
        }
    }

    public final boolean contains(LatLng latLng) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.contains(latLng);
            }
            IGlOverlayLayer iGlOverlayLayer = this.a.get();
            if (iGlOverlayLayer != null) {
                return iGlOverlayLayer.IsCircleContainPoint(this.options, latLng);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Circle)) {
            try {
                ICircle iCircle = this.iCircleDel;
                if (iCircle != null) {
                    return iCircle.equalsRemote(((Circle) obj).iCircleDel);
                }
                return super.equals(obj) || ((Circle) obj).getId() == getId();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final LatLng getCenter() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getCenter();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getCenter();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final int getFillColor() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getFillColor();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getFillColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final List<BaseHoleOptions> getHoleOptions() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getHoleOptions();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getHoleOptions();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String getId() {
        try {
            ICircle iCircle = this.iCircleDel;
            return iCircle != null ? iCircle.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final double getRadius() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getRadius();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getRadius();
            }
            return 0.0d;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    public final int getStrokeColor() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getStrokeColor();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getStrokeDottedLineType() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getDottedLineType();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeDottedLineType();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public final float getStrokeWidth() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getStrokeWidth();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeWidth();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final float getZIndex() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.getZIndex();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final int hashCode() {
        try {
            ICircle iCircle = this.iCircleDel;
            return iCircle != null ? iCircle.hashCodeRemote() : super.hashCode();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final boolean isVisible() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                return iCircle.isVisible();
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final void remove() {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.remove();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.a.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setCenter(LatLng latLng) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setCenter(latLng);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.center(latLng);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setFillColor(int i) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setFillColor(i);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.fillColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setHoleOptions(List<BaseHoleOptions> list) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setHoleOptions(list);
            } else if (list != null) {
                synchronized (list) {
                    this.options.getHoleOptions().clear();
                    this.options.addHoles(list);
                    a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setRadius(double d) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setRadius(d);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.radius(d);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStrokeColor(int i) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setStrokeColor(i);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.strokeColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStrokeDottedLineType(int i) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setDottedLineType(i);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.setStrokeDottedLineType(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setStrokeWidth(f);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.strokeWidth(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setVisible(boolean z) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setVisible(z);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.visible(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        try {
            ICircle iCircle = this.iCircleDel;
            if (iCircle != null) {
                iCircle.setZIndex(f);
                return;
            }
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.zIndex(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Circle(IGlOverlayLayer iGlOverlayLayer, CircleOptions circleOptions, String str) {
        super(str);
        this.a = new WeakReference<>(iGlOverlayLayer);
        this.options = circleOptions;
    }
}
