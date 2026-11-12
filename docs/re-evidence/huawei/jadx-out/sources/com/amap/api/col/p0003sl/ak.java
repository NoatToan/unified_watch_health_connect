package com.amap.api.col.p0003sl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate;

/* JADX INFO: loaded from: classes4.dex */
final class ak implements IUiSettingsDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2214c = true;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private int l = 0;
    private int m = 1;
    private boolean n = true;
    private boolean o = false;
    private boolean p = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Handler f2212a = new Handler(Looper.getMainLooper()) { // from class: com.amap.api.col.3sl.ak.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message == null || ak.this.f2213b == null) {
                return;
            }
            try {
                switch (message.what) {
                    case 0:
                        ak.this.f2213b.showZoomControlsEnabled(ak.this.h);
                        break;
                    case 1:
                        ak.this.f2213b.showScaleEnabled(ak.this.j);
                        break;
                    case 2:
                        ak.this.f2213b.showCompassEnabled(ak.this.i);
                        break;
                    case 3:
                        ak.this.f2213b.showMyLocationButtonEnabled(ak.this.f);
                        break;
                    case 4:
                        ak.this.f2213b.showIndoorSwitchControlsEnabled(ak.this.n);
                        break;
                    case 5:
                        ak.this.f2213b.showLogoEnabled(ak.this.k);
                        break;
                    case 6:
                        ak.this.f2213b.refreshLogo();
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                jv.c(th, "UiSettingsDelegateImp", "handleMessage");
            }
        }
    };

    ak(IAMapDelegate iAMapDelegate) {
        this.f2213b = iAMapDelegate;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isIndoorSwitchEnabled() throws RemoteException {
        return this.n;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setIndoorSwitchEnabled(boolean z) throws RemoteException {
        this.n = z;
        this.f2212a.obtainMessage(4).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScaleControlsEnabled(boolean z) throws RemoteException {
        this.j = z;
        this.f2212a.obtainMessage(1).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomControlsEnabled(boolean z) throws RemoteException {
        this.h = z;
        this.f2212a.obtainMessage(0).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setCompassEnabled(boolean z) throws RemoteException {
        this.i = z;
        this.f2212a.obtainMessage(2).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setMyLocationButtonEnabled(boolean z) throws RemoteException {
        this.f = z;
        this.f2212a.obtainMessage(3).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScrollGesturesEnabled(boolean z) throws RemoteException {
        this.d = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomGesturesEnabled(boolean z) throws RemoteException {
        this.g = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setTiltGesturesEnabled(boolean z) throws RemoteException {
        this.e = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setRotateGesturesEnabled(boolean z) throws RemoteException {
        this.f2214c = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setAllGesturesEnabled(boolean z) throws RemoteException {
        setRotateGesturesEnabled(z);
        setTiltGesturesEnabled(z);
        setZoomGesturesEnabled(z);
        setScrollGesturesEnabled(z);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoPosition(int i) throws RemoteException {
        this.l = i;
        this.f2213b.setLogoPosition(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomPosition(int i) throws RemoteException {
        this.m = i;
        this.f2213b.setZoomPosition(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScaleControlsEnabled() throws RemoteException {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomControlsEnabled() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isCompassEnabled() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isMyLocationButtonEnabled() throws RemoteException {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScrollGesturesEnabled() throws RemoteException {
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomGesturesEnabled() throws RemoteException {
        return this.g;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isTiltGesturesEnabled() throws RemoteException {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isRotateGesturesEnabled() throws RemoteException {
        return this.f2214c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getLogoPosition() throws RemoteException {
        return this.l;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getZoomPosition() throws RemoteException {
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomInByScreenCenter(boolean z) {
        this.o = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomInByScreenCenter() {
        return this.o;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoBottomMargin(int i) {
        this.f2213b.setLogoBottomMargin(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoLeftMargin(int i) {
        this.f2213b.setLogoLeftMargin(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final float getLogoMarginRate(int i) {
        return this.f2213b.getLogoMarginRate(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoMarginRate(int i, float f) {
        this.f2213b.setLogoMarginRate(i, f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setGestureScaleByMapCenter(boolean z) throws RemoteException {
        this.p = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isGestureScaleByMapCenter() throws RemoteException {
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoEnable(boolean z) {
        this.k = z;
        this.f2212a.obtainMessage(5).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void requestRefreshLogo() {
        this.f2212a.obtainMessage(6).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isLogoEnable() {
        return this.k;
    }
}
