package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.ae.gmap.gloverlay.GLOverlay;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.INavigateArrowDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeRenderer;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class cw implements INavigateArrowDelegate {
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public float[] i;
    private IAMapDelegate k;
    private String q;
    private float l = 10.0f;
    private int m = -16777216;
    private int n = -16777216;
    private float o = 0.0f;
    private boolean p = true;
    private List<IPoint> r = new Vector();
    public int[] a = null;
    public int[] b = null;
    private int s = 0;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private Object x = new Object();
    public Rect g = null;
    public int j = 0;
    private String y = null;
    private final int z = Color.argb(0, 0, 0, 0);
    private boolean A = true;

    public cw(IAMapDelegate iAMapDelegate) {
        this.h = false;
        this.k = iAMapDelegate;
        try {
            this.q = getId();
        } catch (RemoteException e) {
            hn.c(e, "NavigateArrowDelegateImp", "create");
            e.printStackTrace();
        }
        this.h = false;
    }

    public static /* synthetic */ String c(cw cwVar) {
        cwVar.y = null;
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        Rectangle geoRectangle;
        return (this.g == null || (geoRectangle = this.k.getMapConfig().getGeoRectangle()) == null || !geoRectangle.isOverlap(this.g)) ? false : true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        try {
            remove();
            if (this.i != null) {
                this.i = null;
            }
        } catch (Throwable th) {
            hn.c(th, "NavigateArrowDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "NavigateArrowDelegateImp destroy");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        List<IPoint> list;
        if (this.h || (list = this.r) == null || list.size() == 0 || this.l <= 0.0f) {
            return;
        }
        if (this.u) {
            IAMapDelegate iAMapDelegate = this.k;
            if (iAMapDelegate != null && iAMapDelegate.getGLMapEngine() != null) {
                if (this.y == null) {
                    this.y = this.k.getGLMapEngine().addNativeOverlay(1, GLOverlay.EAMapOverlayTpye.AMAPOVERLAY_ARROW.ordinal(), hashCode());
                }
                if (this.y != null && this.A) {
                    this.k.getGLMapEngine().updateNativeArrowOverlay(1, this.y, this.a, this.b, this.m, this.n, this.z, this.l, 111, 222, AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID, this.p);
                    this.v = true;
                    this.w = this.p;
                    this.A = false;
                }
            }
        } else {
            if (this.y != null && this.v) {
                this.k.getGLMapEngine().updateNativeArrowOverlay(1, this.y, this.a, this.b, this.m, this.n, this.z, this.l, 111, 222, AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID, false);
                this.A = false;
            }
            a(this.k.getMapConfig());
            if (this.i != null && this.s > 0) {
                AMapNativeRenderer.nativeDrawLineByTextureID(this.i, this.j, this.k.getMapProjection().getMapLenWithWin((int) this.l), this.k.getLineTextureID(), this.k.getLineTextureRatio(), this.d, this.e, this.f, this.c, 0.0f, false, true, true, this.k.getFinalMatrix(), 2, 0);
                this.v = false;
                this.w = false;
            }
        }
        this.t = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.q == null) {
            this.q = this.k.createId("NavigateArrow");
        }
        return this.q;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final List<LatLng> getPoints() throws RemoteException {
        return a();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final int getSideColor() throws RemoteException {
        return this.n;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final int getTopColor() throws RemoteException {
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final float getWidth() throws RemoteException {
        return this.l;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.o;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final boolean is3DModel() {
        return this.u;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return this.t;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        if (this.u) {
            return this.p || this.w;
        }
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        if (this.h) {
            return;
        }
        IAMapDelegate iAMapDelegate = this.k;
        if (iAMapDelegate != null && iAMapDelegate.getGLMapEngine() != null && this.y != null) {
            this.k.queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.cw.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (cw.this.k == null || cw.this.k.getGLMapEngine() == null) {
                        return;
                    }
                    if (cw.this.y != null) {
                        cw.this.k.getGLMapEngine().removeNativeOverlay(1, cw.this.y);
                    }
                    cw.c(cw.this);
                }
            });
        }
        this.k.removeGLOverlay(getId());
        this.k.setRunLowFrame(false);
        this.h = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final void set3DModel(boolean z) {
        this.u = z;
        this.w = this.p;
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final void setPoints(List<LatLng> list) throws RemoteException {
        synchronized (this.x) {
            this.r.clear();
            if (this.g == null) {
                this.g = new Rect();
            }
            er.a(this.g);
            if (list != null) {
                Object obj = null;
                for (LatLng latLng : list) {
                    if (latLng != null && !latLng.equals(obj)) {
                        IPoint iPointObtain = IPoint.obtain();
                        this.k.latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
                        this.r.add(iPointObtain);
                        er.b(this.g, ((Point) iPointObtain).x, ((Point) iPointObtain).y);
                        obj = latLng;
                    }
                }
            }
            this.s = 0;
            this.g.sort();
            int size = this.r.size();
            this.a = new int[size];
            this.b = new int[size];
            int i = 0;
            for (IPoint iPoint : this.r) {
                this.a[i] = ((Point) iPoint).x;
                this.b[i] = ((Point) iPoint).y;
                i++;
            }
        }
        this.k.setRunLowFrame(false);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final void setSideColor(int i) throws RemoteException {
        this.n = i;
        this.k.setRunLowFrame(false);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final void setTopColor(int i) throws RemoteException {
        this.m = i;
        this.c = Color.alpha(i) / 255.0f;
        this.d = Color.red(i) / 255.0f;
        this.e = Color.green(i) / 255.0f;
        this.f = Color.blue(i) / 255.0f;
        this.k.setRunLowFrame(false);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) throws RemoteException {
        this.p = z;
        this.k.setRunLowFrame(false);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.INavigateArrow
    public final void setWidth(float f) throws RemoteException {
        this.l = f;
        this.k.setRunLowFrame(false);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.o = f;
        this.k.changeGLOverlayIndex();
        this.k.setRunLowFrame(false);
    }

    private List<LatLng> a() throws RemoteException {
        ArrayList arrayList;
        if (this.r == null) {
            return null;
        }
        synchronized (this.x) {
            arrayList = new ArrayList();
            for (IPoint iPoint : this.r) {
                if (iPoint != null) {
                    DPoint dPointObtain = DPoint.obtain();
                    this.k.geo2Latlng(((Point) iPoint).x, ((Point) iPoint).y, dPointObtain);
                    arrayList.add(new LatLng(dPointObtain.y, dPointObtain.x));
                    dPointObtain.recycle();
                }
            }
        }
        return arrayList;
    }

    private boolean a(MapConfig mapConfig) throws RemoteException {
        synchronized (this.x) {
            int sx = (int) mapConfig.getSX();
            int sy = (int) mapConfig.getSY();
            int i = 0;
            this.t = false;
            int size = this.r.size();
            float[] fArr = this.i;
            if (fArr == null || fArr.length < size * 3) {
                this.i = new float[size * 3];
            }
            this.j = size * 3;
            for (IPoint iPoint : this.r) {
                float[] fArr2 = this.i;
                int i2 = i * 3;
                fArr2[i2] = ((Point) iPoint).x - sx;
                fArr2[i2 + 1] = ((Point) iPoint).y - sy;
                fArr2[i2 + 2] = 0.0f;
                i++;
            }
            this.s = this.r.size();
        }
        return true;
    }
}
