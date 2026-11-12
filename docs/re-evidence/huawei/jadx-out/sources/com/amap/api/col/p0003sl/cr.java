package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;

/* JADX INFO: loaded from: classes4.dex */
public final class cr implements IInfoWindowManager, IInfoWindowAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    az f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IGlOverlayLayer f2320c;
    private final String d = "PopupOverlay";

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAnimation(Animation animation, Animation.AnimationListener animationListener) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAppearAnimation(Animation animation) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackColor(int i) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackEnable(boolean z) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackScale(float f, float f2) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowDisappearAnimation(Animation animation) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowMovingAnimation(Animation animation) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void startAnimation() {
    }

    public cr(IGlOverlayLayer iGlOverlayLayer, Context context) {
        this.f2319b = context;
        this.f2320c = iGlOverlayLayer;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BasePointOverlay basePointOverlay) throws RemoteException {
        synchronized (this) {
            IGlOverlayLayer iGlOverlayLayer = this.f2320c;
            if (iGlOverlayLayer != null && basePointOverlay != null) {
                iGlOverlayLayer.getNativeProperties(basePointOverlay.getId(), "showInfoWindow", new Object[]{basePointOverlay.getId()});
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException {
        synchronized (this) {
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        IGlOverlayLayer iGlOverlayLayer = this.f2320c;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.getNativeProperties("PopupOverlay", "redrawInfoWindow", null);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        IGlOverlayLayer iGlOverlayLayer = this.f2320c;
        if (iGlOverlayLayer == null || motionEvent == null) {
            return false;
        }
        Object nativeProperties = iGlOverlayLayer.getNativeProperties("PopupOverlay", "onInfoWindowTap", new Object[]{Double.valueOf(motionEvent.getX()), Double.valueOf(motionEvent.getY())});
        if (nativeProperties instanceof Boolean) {
            return ((Boolean) nativeProperties).booleanValue();
        }
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
        synchronized (this) {
            IGlOverlayLayer iGlOverlayLayer = this.f2320c;
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.getNativeProperties("PopupOverlay", "hideInfoWindow", null);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(az azVar) {
        synchronized (this) {
            this.f2318a = azVar;
        }
    }
}
