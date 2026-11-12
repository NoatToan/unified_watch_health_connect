package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class a6s implements IUiSettingsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f694b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public boolean i = false;
    public boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f695k = 0;
    public int l = 1;
    public boolean m = true;
    public boolean n = false;
    public boolean o = false;
    public final Handler p = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message == null || a6s.this.f693a == null) {
                return;
            }
            try {
                switch (message.what) {
                    case 0:
                        a6s.this.f693a.showZoomControlsEnabled(a6s.this.g);
                        break;
                    case 1:
                        a6s.this.f693a.showScaleEnabled(a6s.this.i);
                        break;
                    case 2:
                        a6s.this.f693a.showCompassEnabled(a6s.this.h);
                        break;
                    case 3:
                        a6s.this.f693a.showMyLocationButtonEnabled(a6s.this.e);
                        break;
                    case 4:
                        a6s.this.f693a.showIndoorSwitchControlsEnabled(a6s.this.m);
                        break;
                    case 5:
                        a6s.this.f693a.showLogoEnabled(a6s.this.j);
                        break;
                    case 6:
                        a6s.this.f693a.refreshLogo();
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                m2t.r(th, "UiSettingsDelegateImp", "handleMessage");
            }
        }
    }

    public a6s(IAMapDelegate iAMapDelegate) {
        this.f693a = iAMapDelegate;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final float getLogoMarginRate(int i) {
        return this.f693a.getLogoMarginRate(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getLogoPosition() throws RemoteException {
        return this.f695k;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final int getZoomPosition() throws RemoteException {
        return this.l;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isCompassEnabled() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isGestureScaleByMapCenter() throws RemoteException {
        return this.o;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isIndoorSwitchEnabled() throws RemoteException {
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isLogoEnable() {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isMyLocationButtonEnabled() throws RemoteException {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isRotateGesturesEnabled() throws RemoteException {
        return this.f694b;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScaleControlsEnabled() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isScrollGesturesEnabled() throws RemoteException {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isTiltGesturesEnabled() throws RemoteException {
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomControlsEnabled() throws RemoteException {
        return this.g;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomGesturesEnabled() throws RemoteException {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final boolean isZoomInByScreenCenter() {
        return this.n;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void requestRefreshLogo() {
        this.p.obtainMessage(6).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setAllGesturesEnabled(boolean z) throws RemoteException {
        setRotateGesturesEnabled(z);
        setTiltGesturesEnabled(z);
        setZoomGesturesEnabled(z);
        setScrollGesturesEnabled(z);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setCompassEnabled(boolean z) throws RemoteException {
        this.h = z;
        this.p.obtainMessage(2).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setGestureScaleByMapCenter(boolean z) throws RemoteException {
        this.o = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setIndoorSwitchEnabled(boolean z) throws RemoteException {
        this.m = z;
        this.p.obtainMessage(4).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoBottomMargin(int i) {
        this.f693a.setLogoBottomMargin(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoEnable(boolean z) {
        this.j = z;
        this.p.obtainMessage(5).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoLeftMargin(int i) {
        this.f693a.setLogoLeftMargin(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoMarginRate(int i, float f) {
        this.f693a.setLogoMarginRate(i, f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setLogoPosition(int i) throws RemoteException {
        this.f695k = i;
        this.f693a.setLogoPosition(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setMyLocationButtonEnabled(boolean z) throws RemoteException {
        this.e = z;
        this.p.obtainMessage(3).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setRotateGesturesEnabled(boolean z) throws RemoteException {
        this.f694b = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScaleControlsEnabled(boolean z) throws RemoteException {
        this.i = z;
        this.p.obtainMessage(1).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setScrollGesturesEnabled(boolean z) throws RemoteException {
        this.c = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setTiltGesturesEnabled(boolean z) throws RemoteException {
        this.d = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomControlsEnabled(boolean z) throws RemoteException {
        this.g = z;
        this.p.obtainMessage(0).sendToTarget();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomGesturesEnabled(boolean z) throws RemoteException {
        this.f = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomInByScreenCenter(boolean z) {
        this.n = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IUiSettings
    public final void setZoomPosition(int i) throws RemoteException {
        this.l = i;
        this.f693a.setZoomPosition(i);
    }
}
