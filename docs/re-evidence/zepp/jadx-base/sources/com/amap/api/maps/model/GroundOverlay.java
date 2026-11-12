package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.interfaces.IGroundOverlay;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class GroundOverlay extends BaseOverlay {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private float high;
    private IGroundOverlay iGroundOverlayDelegate;
    private GroundOverlayOptions options;
    private LatLng point;
    private float width;

    public GroundOverlay(IGroundOverlay iGroundOverlay) {
        super("");
        this.iGroundOverlayDelegate = iGroundOverlay;
    }

    private void a() {
        IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
            return;
        }
        iGlOverlayLayer.updateOption(this.overlayName, this.options);
    }

    public final void destroy() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.destroy();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof GroundOverlay)) {
            try {
                IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
                if (iGroundOverlay != null) {
                    return iGroundOverlay.equalsRemote(((GroundOverlay) obj).iGroundOverlayDelegate);
                }
                return super.equals(obj) || ((GroundOverlay) obj).getId() == getId();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final float getBearing() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getBearing();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getBearing();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final LatLngBounds getBounds() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getBounds();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getBounds();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final float getHeight() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getHeight();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getHeight();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final String getId() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            return iGroundOverlay != null ? iGroundOverlay.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final LatLng getPosition() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getPosition();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getLocation();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final float getTransparency() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getTransparency();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getTransparency();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final float getWidth() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getWidth();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getWidth();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final float getZIndex() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.getZIndex();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final int hashCode() {
        IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
        return iGroundOverlay != null ? iGroundOverlay.hashCode() : super.hashCode();
    }

    public final boolean isVisible() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                return iGroundOverlay.isVisible();
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                return groundOverlayOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final void remove() {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.remove();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions == null || groundOverlayOptions.getImage() == null) {
                return;
            }
            this.options.getImage().recycle();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setBearing(float f) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setBearing(f);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                groundOverlayOptions.bearing(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setDimensions(float f) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setDimensions(f);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                LatLng location = this.point;
                if (location == null) {
                    location = groundOverlayOptions.getLocation();
                }
                if (location == null) {
                    this.width = f;
                } else {
                    this.options.position(location, f);
                    a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setImage(bitmapDescriptor);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                groundOverlayOptions.image(bitmapDescriptor);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setPosition(latLng);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions == null || latLng == null) {
                return;
            }
            float width = this.width;
            if (width <= 0.0f) {
                width = groundOverlayOptions.getWidth();
            }
            float height = this.high;
            if (height <= 0.0f) {
                height = this.options.getHeight();
            }
            if (width == 0.0f) {
                this.point = latLng;
                return;
            }
            if (height == 0.0f) {
                this.options.position(latLng, width);
                a();
            } else if (height > 0.0f) {
                this.options.position(latLng, width, height);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setPositionFromBounds(latLngBounds);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions == null || latLngBounds == null) {
                return;
            }
            groundOverlayOptions.positionFromBounds(latLngBounds);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setTransparency(float f) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setTransparency(f);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                groundOverlayOptions.transparency(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setVisible(boolean z) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setVisible(z);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                groundOverlayOptions.visible(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setZIndex(f);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                groundOverlayOptions.zIndex(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public GroundOverlay(IGlOverlayLayer iGlOverlayLayer, GroundOverlayOptions groundOverlayOptions, String str) {
        super(str);
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = groundOverlayOptions;
    }

    public final void setDimensions(float f, float f2) {
        try {
            IGroundOverlay iGroundOverlay = this.iGroundOverlayDelegate;
            if (iGroundOverlay != null) {
                iGroundOverlay.setDimensions(f, f2);
                return;
            }
            GroundOverlayOptions groundOverlayOptions = this.options;
            if (groundOverlayOptions != null) {
                LatLng location = this.point;
                if (location == null) {
                    location = groundOverlayOptions.getLocation();
                }
                if (location == null) {
                    this.width = f;
                    this.high = f2;
                } else {
                    GroundOverlayOptions groundOverlayOptions2 = this.options;
                    groundOverlayOptions2.position(groundOverlayOptions2.getLocation(), f, f2);
                    a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
