package com.autonavi.base.ae.gmap.gloverlay;

import android.util.Pair;
import com.amap.api.col.p0003sl.ev;
import com.amap.api.col.p0003sl.ew;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.RouteOverlay;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BaseRouteOverlay extends GLOverlay implements IRouteOverlayInner {
    public BaseRouteOverlay(final int i, IAMapDelegate iAMapDelegate, int i2) {
        super(i, iAMapDelegate, i2);
        IAMapDelegate iAMapDelegate2 = this.mGLMapView;
        if (iAMapDelegate2 == null || iAMapDelegate2.getGLMapEngine() == null) {
            return;
        }
        this.mGLMapView.queueEvent(new Runnable() { // from class: com.autonavi.base.ae.gmap.gloverlay.BaseRouteOverlay.1
            @Override // java.lang.Runnable
            public void run() {
                BaseRouteOverlay baseRouteOverlay = BaseRouteOverlay.this;
                baseRouteOverlay.mNativeInstance = baseRouteOverlay.mGLMapView.getGLMapEngine().createOverlay(i, GLOverlay.EAMapOverlayTpye.AMAPROUTE_OVERLAY.getId());
            }
        });
    }

    private static native void nativeAddRouteItem(long j, int i, ew[] ewVarArr, int i2, ev evVar, int[] iArr);

    private static native void nativeAddRouteName(long j);

    private static native void nativeRemoveRouteName(long j, long j2);

    private static native void nativeSetArrow3DTexture(long j, int i);

    private static native void nativeSetArrowFlow(long j, boolean z);

    private static native void nativeSetCar2DPosition(long j, int i, float f);

    private static native void nativeSetCar3DPosition(long j, int i, float f);

    private static native void nativeSetHighlightParam(long j, int[] iArr);

    private static native void nativeSetHighlightType(long j, int i);

    private static native void nativeSetLine2DWidth(long j, int i, int i2);

    private static native void nativeSetLineWidthScale(long j, float f);

    private static native void nativeSetRouteItemParam(long j, ew ewVar);

    private static native void nativeSetSelectStatus(long j, boolean z);

    private static native void nativeSetShowArrow(long j, boolean z);

    private static native void nativeSetShowNaviRouteNameCountMap(long j, int[] iArr, int[] iArr2);

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteItem(int i, ew[] ewVarArr, int i2, ev evVar, int[] iArr) {
        int iCreateOverlayTexture;
        int iCreateOverlayTexture2;
        int iCreateOverlayTexture3;
        if (this.mNativeInstance == 0) {
            return;
        }
        for (ew ewVar : ewVarArr) {
            if (ewVar == null) {
                return;
            }
            BitmapDescriptor bitmapDescriptor = ewVar.f6053a;
            if (bitmapDescriptor != null && (iCreateOverlayTexture3 = this.mGLMapView.createOverlayTexture(this.mEngineID, bitmapDescriptor.getBitmap())) >= 0) {
                ewVar.f6054b = iCreateOverlayTexture3;
            }
            BitmapDescriptor bitmapDescriptor2 = ewVar.c;
            if (bitmapDescriptor2 != null && (iCreateOverlayTexture2 = this.mGLMapView.createOverlayTexture(this.mEngineID, bitmapDescriptor2.getBitmap())) >= 0) {
                ewVar.d = iCreateOverlayTexture2;
            }
            BitmapDescriptor bitmapDescriptor3 = ewVar.e;
            if (bitmapDescriptor3 != null && (iCreateOverlayTexture = this.mGLMapView.createOverlayTexture(this.mEngineID, bitmapDescriptor3.getBitmap())) >= 0) {
                ewVar.f = iCreateOverlayTexture;
            }
        }
        nativeAddRouteItem(this.mNativeInstance, i, ewVarArr, i2, evVar, iArr);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void addRouteName() {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeAddRouteName(j);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public Pair<Float, Float> getDisplayRange() {
        return null;
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public int getOverlayProperty() {
        return 0;
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.GLOverlay
    public void releaseInstance() {
        long j = this.mNativeInstance;
        this.mNativeInstance = 0L;
        this.mGLMapView.getGLMapEngine().destroyOverlay(this.mEngineID, j);
        super.releaseInstance();
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void remove() {
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void removeRouteName() {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeRemoveRouteName(j, this.mGLMapView.getGLMapEngine().getNativeInstance());
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrow3DTexture(BitmapDescriptor bitmapDescriptor) {
        int iCreateOverlayTexture;
        if (this.mNativeInstance == 0 || bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || (iCreateOverlayTexture = this.mGLMapView.createOverlayTexture(this.mEngineID, bitmapDescriptor.getBitmap())) < 0) {
            return;
        }
        nativeSetArrow3DTexture(this.mNativeInstance, iCreateOverlayTexture);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setArrowFlow(boolean z) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetArrowFlow(j, z);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar2DPosition(int i, float f) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetCar2DPosition(j, i, f);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setCar3DPosition(int i, float f) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetCar3DPosition(j, i, f);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setDisplayRange(float f, float f2) {
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightParam(RouteOverlay.RouteOverlayHighLightParam routeOverlayHighLightParam) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetHighlightParam(j, new int[]{routeOverlayHighLightParam.fillColorHightLight, routeOverlayHighLightParam.borderColorHightLight, routeOverlayHighLightParam.fillColorNormal, routeOverlayHighLightParam.borderColorNormal, routeOverlayHighLightParam.arrowColorNormal});
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setHighlightType(int i) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetHighlightType(j, i);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLine2DWidth(int i, int i2) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetLine2DWidth(j, i, i2);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setLineWidthScale(float f) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetLineWidthScale(j, f);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setOverlayProperty(int i) {
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setRouteItemParam(ew ewVar) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetRouteItemParam(j, ewVar);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setSelectStatus(boolean z) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetSelectStatus(j, z);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowArrow(boolean z) {
        long j = this.mNativeInstance;
        if (j == 0) {
            return;
        }
        nativeSetShowArrow(j, z);
    }

    @Override // com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner
    public void setShowNaviRouteNameCountMap(Map<Integer, Integer> map) {
        if (this.mNativeInstance == 0) {
            return;
        }
        int[] iArr = new int[map.size()];
        int[] iArr2 = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            iArr[i] = entry.getKey().intValue();
            iArr2[i] = entry.getValue().intValue();
            i++;
        }
        nativeSetShowNaviRouteNameCountMap(this.mNativeInstance, iArr, iArr2);
    }
}
