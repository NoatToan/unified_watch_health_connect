package com.amap.api.maps.model;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.mapcore.util.eq;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Marker extends BasePointOverlay {
    private IPoint geoPoint;
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private boolean isClickable;
    private boolean isInfoWindowEnable;
    private boolean isRemoved;
    private boolean isUseAnimation;
    private Animation mCurAnimation;
    private Animation.AnimationListener mCurAnimationListener;
    private a mCurInnerAnimationListener;
    private IMarker markerDelegate;
    private Object object;
    private MarkerOptions options;
    private LatLng viewModeLatLng;
    private DPoint viewModeLatLngDp;

    public class a implements Animation.AnimationListener {
        private final Runnable b;
        private final Runnable c;

        public /* synthetic */ a(Marker marker, Animation.AnimationListener animationListener, byte b) {
            this(animationListener);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationEnd() {
            eq.a().a(this.c);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationStart() {
            eq.a().a(this.b);
        }

        private a(final Animation.AnimationListener animationListener) {
            this.b = new Runnable() { // from class: com.amap.api.maps.model.Marker.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationStart();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            this.c = new Runnable() { // from class: com.amap.api.maps.model.Marker.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationEnd();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
        }
    }

    public Marker(IMarker iMarker) {
        super("");
        this.isRemoved = false;
        this.viewModeLatLngDp = new DPoint();
        this.viewModeLatLng = null;
        this.isUseAnimation = false;
        this.mCurAnimation = null;
        this.mCurAnimationListener = null;
        this.mCurInnerAnimationListener = null;
        this.isClickable = true;
        this.isInfoWindowEnable = true;
        this.markerDelegate = iMarker;
    }

    private Object a(String str, Object[] objArr) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void destroy() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.destroy(true);
            } else {
                remove();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Marker)) {
            try {
                IMarker iMarker = this.markerDelegate;
                if (iMarker != null) {
                    return iMarker.equalsRemote(((Marker) obj).markerDelegate);
                }
                MarkerOptions markerOptions = this.options;
                return markerOptions != null && markerOptions.equals(((Marker) obj).options) && this.overlayName.equals(((Marker) obj).overlayName);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final float getAlpha() {
        Object objA;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null) {
            if (this.options != null) {
                return (!this.isUseAnimation || (objA = a("getAlpha", null)) == null) ? this.options.getAlpha() : ((Double) objA).floatValue();
            }
            return 1.0f;
        }
        IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
        if (iMarkerAction != null) {
            return iMarkerAction.getAlpha();
        }
        return 1.0f;
    }

    public final float getAnchorU() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.getAnchorU();
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorU();
        }
        return 0.0f;
    }

    public final float getAnchorV() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.getAnchorV();
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorV();
        }
        return 0.0f;
    }

    public final int getDisplayLevel() {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return 5;
        }
        return iMarkerAction.getDisplayLevel();
    }

    public final IPoint getGeoPoint() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.getGeoPoint();
        }
        if (this.geoPoint == null) {
            this.geoPoint = new IPoint();
        }
        LatLng position = getPosition();
        if (position != null) {
            VirtualEarthProjection.latLongToPixels(position.latitude, position.longitude, 20, this.geoPoint);
        }
        return this.geoPoint;
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        try {
            IMarker iMarker = this.markerDelegate;
            return iMarker != null ? iMarker.getIcons() : this.options.getIcons();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final String getId() {
        try {
            IMarker iMarker = this.markerDelegate;
            return iMarker != null ? iMarker.getId() : this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final Object getObject() {
        IMarker iMarker = this.markerDelegate;
        return iMarker != null ? iMarker.getObject() : this.object;
    }

    public final MarkerOptions getOptions() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                return iMarkerAction.getOptions();
            }
            return null;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions;
        }
        return null;
    }

    public final int getPeriod() {
        try {
            IMarker iMarker = this.markerDelegate;
            return iMarker != null ? iMarker.getPeriod() : this.options.getPeriod();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final LatLng getPosition() {
        Object objA;
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                return iMarker.getPosition();
            }
            if (this.options != null) {
                if (!isViewMode()) {
                    return (!this.isUseAnimation || (objA = a("getPosition", null)) == null) ? this.options.getPosition() : (LatLng) objA;
                }
                this.glOverlayLayerRef.get().getMap().getPixel2LatLng(this.options.getScreenX(), this.options.getScreenY(), this.viewModeLatLngDp);
                LatLng latLng = this.viewModeLatLng;
                if (latLng != null) {
                    double d = latLng.latitude;
                    DPoint dPoint = this.viewModeLatLngDp;
                    if (d == dPoint.y && latLng.longitude == dPoint.x) {
                        return latLng;
                    }
                }
                DPoint dPoint2 = this.viewModeLatLngDp;
                return new LatLng(dPoint2.y, dPoint2.x);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final float getRotateAngle() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.getRotateAngle();
        }
        if (this.options == null) {
            return 0.0f;
        }
        if (this.isUseAnimation) {
            Object objA = a("getRotateAngle", null);
            Log.e("mapcore", "getRotateAngle ".concat(String.valueOf(objA)));
            if (objA != null) {
                return ((Double) objA).floatValue();
            }
        }
        return this.options.getRotateAngle();
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final String getSnippet() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                return iMarker.getSnippet();
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getSnippet();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final String getTitle() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                return iMarker.getTitle();
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getTitle();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final float getZIndex() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.getZIndex();
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getZIndex();
        }
        return 0.0f;
    }

    public final int hashCode() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.hashCode();
        }
        if (this.options == null) {
            return super.hashCode();
        }
        String str = this.overlayName;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.options.hashCode();
    }

    public final void hideInfoWindow() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.hideInfoWindow();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.hideInfoWindow(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean isClickable() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                return iMarkerAction.isClickable();
            }
        } else {
            Object objA = a("isClickable", null);
            if (objA instanceof Boolean) {
                return ((Boolean) objA).booleanValue();
            }
        }
        return this.isClickable;
    }

    public final boolean isDraggable() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.isDraggable();
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isDraggable();
        }
        return false;
    }

    public final boolean isFlat() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.isFlat();
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isFlat();
        }
        return false;
    }

    public final boolean isInfoWindowAutoOverturn() {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return false;
        }
        return iMarkerAction.isInfoWindowAutoOverturn();
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isInfoWindowEnable() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                return iMarkerAction.isInfoWindowEnable();
            }
        } else {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.isInfoWindowEnable();
            }
        }
        return this.isInfoWindowEnable;
    }

    public final boolean isInfoWindowShown() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.isInfoWindowShown();
        }
        IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
            return false;
        }
        Object objA = a("isInfoWindowShown", null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }

    public final boolean isPerspective() {
        return false;
    }

    public final boolean isRemoved() {
        IMarker iMarker = this.markerDelegate;
        return iMarker != null ? iMarker.isRemoved() : this.isRemoved;
    }

    public final boolean isViewMode() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isViewMode();
        }
        return false;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isVisible() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                return iMarker.isVisible();
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void remove() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.remove();
                return;
            }
            if (isInfoWindowShown()) {
                hideInfoWindow();
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
            this.isRemoved = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setAlpha(float f) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                iMarkerAction.setAlpha(f);
                return;
            }
            return;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.alpha(f);
            a();
        }
    }

    public final void setAnchor(float f, float f2) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setAnchor(f, f2);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.anchor(f, f2);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setAnimation(Animation animation) {
        Animation.AnimationListener animationListener;
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setAnimation(animation);
                return;
            }
            if (animation != null && (animationListener = this.mCurAnimationListener) != null) {
                animation.setAnimationListener(animationListener);
            }
            this.mCurAnimation = animation;
            this.isUseAnimation = animation != null;
            a("setAnimation", new Object[]{animation});
            if (animation != null) {
                animation.resetUpdateFlags();
            }
        } catch (Throwable unused) {
        }
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setAnimationListener(animationListener);
            return;
        }
        this.mCurAnimationListener = animationListener;
        this.mCurInnerAnimationListener = new a(this, animationListener, (byte) 0);
        if (this.mCurAnimation != null) {
            a("setAnimationListener", new Object[]{this.mCurAnimationListener});
        }
    }

    public final void setAutoOverturnInfoWindow(boolean z) {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return;
        }
        iMarkerAction.setAutoOverturnInfoWindow(z);
    }

    public final void setBelowMaskLayer(boolean z) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setBelowMaskLayer(z);
            return;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.belowMaskLayer(z);
            a();
        }
    }

    public final void setClickable(boolean z) {
        this.isClickable = z;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null) {
            a("setClickable", new Object[]{Boolean.valueOf(z)});
            return;
        }
        IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
        if (iMarkerAction != null) {
            iMarkerAction.setClickable(z);
        }
    }

    public final void setDisplayLevel(int i) {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return;
        }
        iMarkerAction.setDisplayLevel(i);
    }

    public final void setDraggable(boolean z) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setDraggable(z);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.draggable(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setFixingPointEnable(boolean z) {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return;
        }
        iMarkerAction.setFixingPointEnable(z);
    }

    public final void setFlat(boolean z) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setFlat(z);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.setFlat(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setGeoPoint(IPoint iPoint) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setGeoPoint(iPoint);
            return;
        }
        this.geoPoint = iPoint;
        if (iPoint != null) {
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPoint).x, ((Point) iPoint).y, 20);
            LatLng latLng = new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false);
            dPointPixelsToLatLong.recycle();
            this.options.position(latLng);
            a();
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                IMarker iMarker = this.markerDelegate;
                if (iMarker != null) {
                    iMarker.setIcon(bitmapDescriptor);
                    return;
                }
                MarkerOptions markerOptions = this.options;
                if (markerOptions != null) {
                    markerOptions.icon(bitmapDescriptor);
                    a();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setIcons(arrayList);
            } else {
                this.options.icons(arrayList);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setInfoWindowEnable(boolean z) {
        this.isInfoWindowEnable = z;
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                iMarkerAction.setInfoWindowEnable(z);
                return;
            }
            return;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.infoWindowEnable(z);
            a();
        }
    }

    public final void setMarkerOptions(MarkerOptions markerOptions) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null) {
            this.options = markerOptions;
            a();
        } else {
            IMarkerAction iMarkerAction = iMarker.getIMarkerAction();
            if (iMarkerAction != null) {
                iMarkerAction.setMarkerOptions(markerOptions);
            }
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setObject(Object obj) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setObject(obj);
        } else {
            this.object = obj;
        }
    }

    public final void setPeriod(int i) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setPeriod(i);
            } else {
                this.options.period(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setPerspective(boolean z) {
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setPosition(LatLng latLng) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.position(latLng);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setPositionByPixels(int i, int i2) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setPositionByPixels(i, i2);
            return;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.setScreenPosition(i, i2);
            a();
        }
    }

    public final void setPositionNotUpdate(LatLng latLng) {
        setPosition(latLng);
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setRotateAngle(float f) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setRotateAngle(f);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.rotateAngle(f);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setRotateAngleNotUpdate(float f) {
        IMarkerAction iMarkerAction;
        IMarker iMarker = this.markerDelegate;
        if (iMarker == null || (iMarkerAction = iMarker.getIMarkerAction()) == null) {
            return;
        }
        iMarkerAction.setRotateAngleNotUpdate(f);
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setSnippet(String str) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setSnippet(str);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.snippet(str);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setTitle(String str) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setTitle(str);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.title(str);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setToTop() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.set2Top();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.set2Top(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setVisible(boolean z) {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.setVisible(z);
                return;
            }
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.visible(z);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            iMarker.setZIndex(f);
            return;
        }
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.zIndex(f);
            a();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void showInfoWindow() {
        try {
            IMarker iMarker = this.markerDelegate;
            if (iMarker != null) {
                iMarker.showInfoWindow();
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.showInfoWindow(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean startAnimation() {
        IMarker iMarker = this.markerDelegate;
        if (iMarker != null) {
            return iMarker.startAnimation();
        }
        Object objA = a("startAnimation", null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
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

    public Marker(IGlOverlayLayer iGlOverlayLayer, MarkerOptions markerOptions, String str) {
        super(str);
        this.isRemoved = false;
        this.viewModeLatLngDp = new DPoint();
        this.viewModeLatLng = null;
        this.isUseAnimation = false;
        this.mCurAnimation = null;
        this.mCurAnimationListener = null;
        this.mCurInnerAnimationListener = null;
        this.isClickable = true;
        this.isInfoWindowEnable = true;
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.options = markerOptions;
    }
}
