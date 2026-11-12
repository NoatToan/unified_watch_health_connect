package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IArcDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeRenderer;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cm implements IArcDelegate {
    public float a;
    public float b;
    public float c;
    public float d;
    private LatLng e;
    private LatLng f;
    private LatLng g;
    private String l;
    private IAMapDelegate m;
    private float[] n;
    private float h = 10.0f;
    private int i = -16777216;
    private float j = 0.0f;
    private boolean k = true;
    private int o = 0;
    private boolean p = false;
    private double q = 0.0d;
    private double r = 0.0d;
    private double s = 0.0d;
    private double t = 0.0d;
    private double u = 0.0d;

    public cm(IAMapDelegate iAMapDelegate) {
        this.m = iAMapDelegate;
        try {
            this.l = getId();
        } catch (RemoteException e) {
            hn.c(e, "ArcDelegateImp", "create");
            e.printStackTrace();
        }
    }

    private FPoint a(double d, double d2, double d3) {
        int iCos = (int) (d2 + (Math.cos(d) * this.q));
        int i = (int) (d3 + ((-Math.sin(d)) * this.q));
        FPoint fPointObtain = FPoint.obtain();
        MapConfig mapConfig = this.m.getMapConfig();
        if (mapConfig != null) {
            ((PointF) fPointObtain).x = iCos - ((int) mapConfig.getSX());
            ((PointF) fPointObtain).y = i - ((int) mapConfig.getSY());
        }
        return fPointObtain;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0165  */
    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        boolean z;
        if (this.e == null || this.f == null || this.g == null || !this.k) {
            return false;
        }
        try {
            this.p = false;
            this.m.getMapProjection();
            IPoint iPointObtain = IPoint.obtain();
            IAMapDelegate iAMapDelegate = this.m;
            LatLng latLng = this.e;
            iAMapDelegate.latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
            IPoint iPointObtain2 = IPoint.obtain();
            IAMapDelegate iAMapDelegate2 = this.m;
            LatLng latLng2 = this.f;
            iAMapDelegate2.latlon2Geo(latLng2.latitude, latLng2.longitude, iPointObtain2);
            IPoint iPointObtain3 = IPoint.obtain();
            IAMapDelegate iAMapDelegate3 = this.m;
            LatLng latLng3 = this.g;
            iAMapDelegate3.latlon2Geo(latLng3.latitude, latLng3.longitude, iPointObtain3);
            double d = ((Point) iPointObtain).x;
            double d2 = ((Point) iPointObtain).y;
            double d3 = ((Point) iPointObtain2).x;
            double d4 = ((Point) iPointObtain2).y;
            double d5 = ((Point) iPointObtain3).x;
            double d6 = ((Point) iPointObtain3).y;
            double d7 = d3 - d;
            double d8 = d6 - d2;
            double d9 = d5 - d;
            double d10 = d4 - d2;
            double d11 = ((d7 * 2.0d) * d8) - ((d9 * 2.0d) * d10);
            double d12 = ((d10 * 2.0d) * d9) - ((2.0d * d8) * d7);
            if (d11 == 0.0d || d12 == 0.0d) {
                z = false;
            } else {
                double d13 = d4 * d4;
                double d14 = d2 * d2;
                double d15 = d3 * d3;
                double d16 = d * d;
                double d17 = d6 * d6;
                double d18 = d5 * d5;
                double d19 = ((d8 * (((d13 - d14) + d15) - d16)) + (d10 * (((d14 - d17) + d16) - d18))) / d11;
                this.t = d19;
                this.u = ((d9 * (((d15 - d16) + d13) - d14)) + (d7 * (((d16 - d18) + d14) - d17))) / d12;
                if (Double.isNaN(d19) || Double.isNaN(this.u) || Double.isInfinite(this.t) || Double.isInfinite(this.u)) {
                    z = false;
                } else {
                    double d20 = this.t;
                    double d21 = (d - d20) * (d - d20);
                    double d22 = this.u;
                    this.q = Math.sqrt(d21 + ((d2 - d22) * (d2 - d22)));
                    this.r = a(this.t, this.u, d, d2);
                    double dA = a(this.t, this.u, d3, d4);
                    double dA2 = a(this.t, this.u, d5, d6);
                    this.s = dA2;
                    double d23 = this.r;
                    if (d23 < dA2) {
                        if (dA <= d23 || dA >= dA2) {
                            this.s = dA2 - 6.283185307179586d;
                        }
                    } else if (dA <= dA2 || dA >= d23) {
                        this.s = dA2 + 6.283185307179586d;
                    }
                    iPointObtain.recycle();
                    iPointObtain2.recycle();
                    iPointObtain3.recycle();
                    z = true;
                }
            }
            if (!z) {
                a();
                return true;
            }
            DPoint dPointObtain = DPoint.obtain(this.t, this.u);
            int iAbs = (int) ((Math.abs(this.s - this.r) * 180.0d) / 3.141592653589793d);
            if (iAbs == 0) {
                a();
                return true;
            }
            double d24 = (this.s - this.r) / ((double) iAbs);
            int i = iAbs + 1;
            FPoint[] fPointArr = new FPoint[i];
            this.n = new float[i * 3];
            for (int i2 = 0; i2 <= iAbs; i2++) {
                if (i2 == iAbs) {
                    FPoint fPointObtain = FPoint.obtain();
                    IAMapDelegate iAMapDelegate4 = this.m;
                    LatLng latLng4 = this.g;
                    iAMapDelegate4.getLatLng2Map(latLng4.latitude, latLng4.longitude, fPointObtain);
                    fPointArr[i2] = fPointObtain;
                } else {
                    fPointArr[i2] = a(this.r + (((double) i2) * d24), dPointObtain.x, dPointObtain.y);
                }
                fPointArr[i2] = a(this.r + (((double) i2) * d24), dPointObtain.x, dPointObtain.y);
                float[] fArr = this.n;
                int i3 = i2 * 3;
                fArr[i3] = ((PointF) fPointArr[i2]).x;
                fArr[i3 + 1] = ((PointF) fPointArr[i2]).y;
                fArr[i3 + 2] = 0.0f;
            }
            dPointObtain.recycle();
            this.o = i;
            return true;
        } catch (Throwable th) {
            hn.c(th, "ArcDelegateImp", "calMapFPoint");
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        try {
            this.e = null;
            this.f = null;
            this.g = null;
        } catch (Throwable th) {
            hn.c(th, "ArcDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "ArcDelegateImp destroy");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        if (this.e == null || this.f == null || this.g == null || !this.k) {
            return;
        }
        calMapFPoint();
        if (this.n != null && this.o > 0) {
            float mapLenWithWin = this.m.getMapProjection().getMapLenWithWin((int) this.h);
            this.m.getMapProjection().getMapLenWithWin(1);
            float[] fArr = this.n;
            AMapNativeRenderer.nativeDrawLineByTextureID(fArr, fArr.length, mapLenWithWin, this.m.getLineTextureID(), this.m.getLineTextureRatio(), this.b, this.c, this.d, this.a, 0.0f, false, true, false, this.m.getFinalMatrix(), 3, 0);
        }
        this.p = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.l == null) {
            this.l = this.m.createId("Arc");
        }
        return this.l;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IArc
    public final int getStrokeColor() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IArc
    public final float getStrokeWidth() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return 0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        return this.k;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        this.m.removeGLOverlay(getId());
        this.m.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IArcDelegate
    public final void setEnd(LatLng latLng) {
        this.g = latLng;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IArcDelegate
    public final void setPassed(LatLng latLng) {
        this.f = latLng;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IArcDelegate
    public final void setStart(LatLng latLng) {
        this.e = latLng;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IArc
    public final void setStrokeColor(int i) throws RemoteException {
        this.i = i;
        this.a = Color.alpha(i) / 255.0f;
        this.b = Color.red(i) / 255.0f;
        this.c = Color.green(i) / 255.0f;
        this.d = Color.blue(i) / 255.0f;
        this.m.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IArc
    public final void setStrokeWidth(float f) throws RemoteException {
        this.h = f;
        this.m.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) throws RemoteException {
        this.k = z;
        this.m.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.j = f;
        this.m.changeGLOverlayIndex();
        this.m.setRunLowFrame(false);
    }

    private double a(double d, double d2, double d3, double d4) {
        double dSignum = (d2 - d4) / this.q;
        if (Math.abs(dSignum) > 1.0d) {
            dSignum = Math.signum(dSignum);
        }
        double dAsin = Math.asin(dSignum);
        if (dAsin >= 0.0d) {
            return d3 < d ? 3.141592653589793d - Math.abs(dAsin) : dAsin;
        }
        return d3 < d ? 3.141592653589793d - dAsin : dAsin + 6.283185307179586d;
    }

    private void a() {
        this.n = new float[9];
        FPoint fPointObtain = FPoint.obtain();
        IAMapDelegate iAMapDelegate = this.m;
        LatLng latLng = this.e;
        iAMapDelegate.getLatLng2Map(latLng.latitude, latLng.longitude, fPointObtain);
        FPoint fPointObtain2 = FPoint.obtain();
        IAMapDelegate iAMapDelegate2 = this.m;
        LatLng latLng2 = this.f;
        iAMapDelegate2.getLatLng2Map(latLng2.latitude, latLng2.longitude, fPointObtain2);
        FPoint fPointObtain3 = FPoint.obtain();
        IAMapDelegate iAMapDelegate3 = this.m;
        LatLng latLng3 = this.g;
        iAMapDelegate3.getLatLng2Map(latLng3.latitude, latLng3.longitude, fPointObtain3);
        FPoint[] fPointArr = {fPointObtain, fPointObtain2, fPointObtain3};
        for (int i = 0; i < 3; i++) {
            float[] fArr = this.n;
            int i2 = i * 3;
            fArr[i2] = ((PointF) fPointArr[i]).x;
            fArr[i2 + 1] = ((PointF) fPointArr[i]).y;
            fArr[i2 + 2] = 0.0f;
        }
        this.o = 3;
    }
}
