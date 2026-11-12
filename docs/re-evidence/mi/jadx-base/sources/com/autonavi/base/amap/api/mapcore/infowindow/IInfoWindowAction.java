package com.autonavi.base.amap.api.mapcore.infowindow;

import android.os.RemoteException;
import android.view.MotionEvent;
import com.amap.api.maps.model.BasePointOverlay;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import defpackage.u8s;

/* JADX INFO: loaded from: classes4.dex */
public interface IInfoWindowAction {
    void hideInfoWindow();

    boolean isInfoWindowShown();

    boolean onInfoWindowTap(MotionEvent motionEvent);

    void redrawInfoWindow();

    void setInfoWindowAdapterManager(u8s u8sVar);

    void showInfoWindow(BasePointOverlay basePointOverlay) throws RemoteException;

    void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException;
}
