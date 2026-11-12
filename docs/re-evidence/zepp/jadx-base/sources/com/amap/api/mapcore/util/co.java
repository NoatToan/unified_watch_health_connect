package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.ICircleDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class co implements ICircleDelegate {
    private static int A = 256;
    private static int B = 20;
    private static double C = 1.0E10d;
    private static Object v = new Object();
    private static float z = 4.0075016E7f;
    private String i;
    private IAMapDelegate j;
    private FloatBuffer k;
    private List<BaseHoleOptions> p;
    private List<BaseHoleOptions> q;
    private int r;
    private int s;
    private FloatBuffer t;
    private FloatBuffer u;
    private df.e y;
    private LatLng b = null;
    private double c = 0.0d;
    private float d = 10.0f;
    private int e = -16777216;
    private int f = 0;
    private float g = 0.0f;
    private boolean h = true;
    private int l = 0;
    private boolean m = false;
    private IPoint n = IPoint.obtain();
    private FPoint o = FPoint.obtain();
    private int w = -1;
    public float a = 0.0f;
    private boolean x = false;

    public co(IAMapDelegate iAMapDelegate) {
        this.j = iAMapDelegate;
        try {
            this.i = getId();
        } catch (RemoteException e) {
            hn.c(e, "CircleDelegateImp", "create");
            e.printStackTrace();
        }
    }

    private void a() {
        IAMapDelegate iAMapDelegate = this.j;
        if (iAMapDelegate != null) {
            this.y = (df.e) iAMapDelegate.getGLShader(3);
        }
    }

    private void b() {
        this.l = 0;
        FloatBuffer floatBuffer = this.k;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        this.j.setRunLowFrame(false);
        setHoleOptions(this.q);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        synchronized (v) {
            int i = 0;
            this.m = false;
            LatLng latLng = this.b;
            if (latLng != null) {
                float[] fArr = new float[1086];
                double dA = (1.0d / ((double) a(latLng.latitude))) * this.c;
                this.j.getMapProjection();
                ((PointF) this.o).x = ((Point) this.n).x - ((int) this.j.getMapConfig().getSX());
                ((PointF) this.o).y = ((Point) this.n).y - ((int) this.j.getMapConfig().getSY());
                FPoint fPoint = this.o;
                fArr[0] = ((PointF) fPoint).x;
                fArr[1] = ((PointF) fPoint).y;
                fArr[2] = 0.0f;
                while (i < 361) {
                    double d = (((double) i) * 3.141592653589793d) / 180.0d;
                    double dSin = Math.sin(d) * dA;
                    double dCos = Math.cos(d) * dA;
                    IPoint iPoint = this.n;
                    int i2 = (int) (((double) ((Point) iPoint).x) + dSin);
                    int i3 = (int) (((double) ((Point) iPoint).y) + dCos);
                    ((PointF) this.o).x = i2 - ((int) this.j.getMapConfig().getSX());
                    ((PointF) this.o).y = i3 - ((int) this.j.getMapConfig().getSY());
                    i++;
                    int i4 = i * 3;
                    FPoint fPoint2 = this.o;
                    fArr[i4] = ((PointF) fPoint2).x;
                    fArr[i4 + 1] = ((PointF) fPoint2).y;
                    fArr[i4 + 2] = 0.0f;
                }
                this.l = 362;
                this.k = er.a(fArr);
            }
        }
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final boolean contains(LatLng latLng) throws RemoteException {
        List<BaseHoleOptions> list = this.p;
        if (list != null && list.size() > 0) {
            Iterator<BaseHoleOptions> it2 = this.p.iterator();
            while (it2.hasNext()) {
                if (er.a(it2.next(), latLng)) {
                    return false;
                }
            }
        }
        return this.c >= ((double) AMapUtils.calculateLineDistance(this.b, latLng));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        try {
            this.b = null;
            FloatBuffer floatBuffer = this.k;
            if (floatBuffer != null) {
                floatBuffer.clear();
                this.k = null;
            }
            FloatBuffer floatBuffer2 = this.t;
            if (floatBuffer2 != null) {
                floatBuffer2.clear();
                this.t = null;
            }
            FloatBuffer floatBuffer3 = this.u;
            if (floatBuffer3 != null) {
                floatBuffer3.clear();
                this.u = null;
            }
            List<BaseHoleOptions> list = this.p;
            if (list != null) {
                list.clear();
            }
            List<BaseHoleOptions> list2 = this.q;
            if (list2 != null) {
                list2.clear();
            }
            this.p = null;
            this.q = null;
        } catch (Throwable th) {
            hn.c(th, "CircleDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "CircleDelegateImp destroy");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        if (this.b == null || this.c <= 0.0d || !this.h) {
            return;
        }
        calMapFPoint();
        MapConfig mapConfig2 = this.j.getMapConfig();
        List<BaseHoleOptions> list = this.p;
        if (list != null && list.size() > 0) {
            GLES20.glClearStencil(0);
            GLES20.glStencilMask(255);
            GLES20.glClear(1024);
            GLES20.glFlush();
            GLES20.glEnable(2960);
            GLES20.glColorMask(false, false, false, false);
            GLES20.glStencilFunc(512, 1, 255);
            GLES20.glStencilOp(7681, RaceId.RACE_GET_BOOT_REASON, RaceId.RACE_GET_BOOT_REASON);
            for (int i = 0; i < this.p.size(); i++) {
                BaseHoleOptions baseHoleOptions = this.p.get(i);
                boolean z2 = baseHoleOptions instanceof PolygonHoleOptions;
                if (z2) {
                    a(a(((PolygonHoleOptions) baseHoleOptions).getPoints()), (int) mapConfig2.getSX(), (int) mapConfig2.getSY());
                } else if (baseHoleOptions instanceof CircleHoleOptions) {
                    this.j.changeGLOverlayIndex();
                    b((CircleHoleOptions) baseHoleOptions);
                }
                if (this.t != null && this.r > 0) {
                    df.e eVar = this.y;
                    if (eVar == null || eVar.b()) {
                        a();
                    }
                    if (z2) {
                        dz.a(this.y, -1, this.f, this.t, getStrokeWidth(), this.u, this.r, this.s, this.j.getFinalMatrix(), this.j.getLineTextureID(), this.j.getLineTextureRatio(), mapConfig2.getMapPerPixelUnitLength(), 3, 0, this.x, false);
                    } else if (baseHoleOptions instanceof CircleHoleOptions) {
                        dz.a(this.y, -1, -1, this.t, 10.0f, this.r, this.j.getFinalMatrix(), mapConfig2.getMapPerPixelUnitLength(), this.j.getLineTextureID(), this.j.getLineTextureRatio(), this.x, false);
                    }
                }
            }
            GLES20.glColorMask(true, true, true, true);
            GLES20.glStencilFunc(517, 1, 255);
            GLES20.glStencilMask(0);
        }
        if (this.k != null && this.l > 0) {
            df.e eVar2 = this.y;
            if (eVar2 == null || eVar2.b()) {
                a();
            }
            this.a = this.j.getMapConfig().getMapPerPixelUnitLength();
            int dottedLineTextureID = this.j.getDottedLineTextureID(this.w);
            if (dottedLineTextureID == -1) {
                dottedLineTextureID = this.j.getLineTextureID();
            }
            dz.a(this.y, this.f, this.e, this.k, this.d, this.l, this.j.getFinalMatrix(), this.a, dottedLineTextureID, this.j.getLineTextureRatio(), this.x || (this.w != -1), true);
        }
        GLES20.glClearStencil(0);
        GLES20.glClear(1024);
        GLES20.glDisable(2960);
        MapConfig mapConfig3 = this.j.getMapConfig();
        List<BaseHoleOptions> list2 = this.p;
        if (list2 != null && list2.size() > 0) {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                BaseHoleOptions baseHoleOptions2 = this.p.get(i2);
                boolean z3 = baseHoleOptions2 instanceof PolygonHoleOptions;
                if (z3) {
                    a(a(((PolygonHoleOptions) baseHoleOptions2).getPoints()), (int) mapConfig3.getSX(), (int) mapConfig3.getSY());
                } else if (baseHoleOptions2 instanceof CircleHoleOptions) {
                    this.j.changeGLOverlayIndex();
                    b((CircleHoleOptions) baseHoleOptions2);
                }
                if (this.t != null && this.r > 0) {
                    df.e eVar3 = this.y;
                    if (eVar3 == null || eVar3.b()) {
                        a();
                    }
                    boolean z4 = this.x || this.w != -1;
                    if (z3) {
                        dz.a(this.y, this.e, this.t, this.d, this.r, this.j.getFinalMatrix(), this.j.getLineTextureID(), this.j.getLineTextureRatio(), mapConfig3.getMapPerPixelUnitLength(), 3, 0, z4);
                    } else if (baseHoleOptions2 instanceof CircleHoleOptions) {
                        dz.a(this.y, this.e, this.t, this.d, this.r, this.j.getFinalMatrix(), mapConfig3.getMapPerPixelUnitLength(), this.j.getLineTextureID(), this.j.getLineTextureRatio(), z4);
                    }
                }
            }
        }
        this.m = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final LatLng getCenter() throws RemoteException {
        return this.b;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final int getDottedLineType() {
        return this.w;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final int getFillColor() throws RemoteException {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final List<BaseHoleOptions> getHoleOptions() throws RemoteException {
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.i == null) {
            this.i = this.j.createId("Circle");
        }
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final double getRadius() throws RemoteException {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final int getStrokeColor() throws RemoteException {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final float getStrokeWidth() throws RemoteException {
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.g;
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
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        this.j.removeGLOverlay(getId());
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z2) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setCenter(LatLng latLng) throws RemoteException {
        synchronized (v) {
            if (latLng != null) {
                this.b = latLng;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, this.n);
                b();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setDottedLineType(int i) {
        this.w = i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setFillColor(int i) throws RemoteException {
        this.f = i;
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setHoleOptions(List<BaseHoleOptions> list) {
        try {
            this.q = list;
            List<BaseHoleOptions> list2 = this.p;
            if (list2 == null) {
                this.p = new ArrayList();
            } else {
                list2.clear();
            }
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    BaseHoleOptions baseHoleOptions = list.get(i);
                    if (baseHoleOptions instanceof PolygonHoleOptions) {
                        PolygonHoleOptions polygonHoleOptions = (PolygonHoleOptions) baseHoleOptions;
                        if (a(polygonHoleOptions) && !er.a(this.p, polygonHoleOptions)) {
                            this.p.add(polygonHoleOptions);
                        }
                    } else if (baseHoleOptions instanceof CircleHoleOptions) {
                        CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
                        if (a(circleHoleOptions) && !er.a(this.p, circleHoleOptions)) {
                            this.p.add(circleHoleOptions);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "setHoleOptions");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setRadius(double d) throws RemoteException {
        this.c = d;
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setStrokeColor(int i) throws RemoteException {
        this.e = i;
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ICircle
    public final void setStrokeWidth(float f) throws RemoteException {
        this.d = f;
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z2) throws RemoteException {
        this.h = z2;
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.g = f;
        this.j.changeGLOverlayIndex();
        this.j.setRunLowFrame(false);
    }

    private static float a(double d) {
        return (float) ((Math.cos((d * 3.141592653589793d) / 180.0d) * ((double) z)) / ((double) (A << B)));
    }

    public final void a(boolean z2) {
        this.x = z2;
    }

    private boolean a(PolygonHoleOptions polygonHoleOptions) {
        boolean zContains = true;
        try {
            List<LatLng> points = polygonHoleOptions.getPoints();
            for (int i = 0; i < points.size() && (zContains = contains(points.get(i))); i++) {
            }
        } catch (Throwable th) {
            hn.c(th, "CircleDelegateImp", "isPolygonInCircle");
            th.printStackTrace();
        }
        return zContains;
    }

    private void b(CircleHoleOptions circleHoleOptions) throws RemoteException {
        if (circleHoleOptions.getCenter() != null) {
            IPoint iPointObtain = IPoint.obtain();
            FPoint fPointObtain = FPoint.obtain();
            GLMapState.lonlat2Geo(circleHoleOptions.getCenter().longitude, circleHoleOptions.getCenter().latitude, iPointObtain);
            float[] fArr = new float[1086];
            double dA = (1.0d / ((double) a(circleHoleOptions.getCenter().latitude))) * circleHoleOptions.getRadius();
            ((PointF) fPointObtain).x = ((Point) iPointObtain).x - ((int) this.j.getMapConfig().getSX());
            float sy = ((Point) iPointObtain).y - ((int) this.j.getMapConfig().getSY());
            ((PointF) fPointObtain).y = sy;
            int i = 0;
            fArr[0] = ((PointF) fPointObtain).x;
            fArr[1] = sy;
            fArr[2] = 0.0f;
            while (i < 361) {
                double d = (((double) i) * 3.141592653589793d) / 180.0d;
                double dSin = Math.sin(d) * dA;
                double dCos = Math.cos(d) * dA;
                int i2 = (int) (((double) ((Point) iPointObtain).x) + dSin);
                int i3 = (int) (((double) ((Point) iPointObtain).y) + dCos);
                ((PointF) fPointObtain).x = i2 - ((int) this.j.getMapConfig().getSX());
                float sy2 = i3 - ((int) this.j.getMapConfig().getSY());
                ((PointF) fPointObtain).y = sy2;
                i++;
                int i4 = i * 3;
                fArr[i4] = ((PointF) fPointObtain).x;
                fArr[i4 + 1] = sy2;
                fArr[i4 + 2] = 0.0f;
            }
            this.r = 362;
            this.t = er.a(fArr);
            iPointObtain.recycle();
            fPointObtain.recycle();
        }
    }

    private boolean a(CircleHoleOptions circleHoleOptions) {
        try {
            return ((double) AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), getCenter())) <= getRadius() - circleHoleOptions.getRadius();
        } catch (Throwable th) {
            hn.c(th, "CircleDelegateImp", "isCircleInCircle");
            th.printStackTrace();
            return true;
        }
    }

    private static IPoint[] a(IPoint[] iPointArr) {
        int length = iPointArr.length;
        double[] dArr = new double[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            double d = ((Point) iPointArr[i]).x;
            double d2 = C;
            dArr[i2] = d * d2;
            dArr[i2 + 1] = ((double) ((Point) iPointArr[i]).y) * d2;
        }
        en enVarA = new dw().a(dArr);
        int i3 = enVarA.b;
        IPoint[] iPointArr2 = new IPoint[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iPointArr2[i4] = new IPoint();
            ((Point) iPointArr2[i4]).x = (int) (dArr[enVarA.a(i4) * 2] / C);
            ((Point) iPointArr2[i4]).y = (int) (dArr[(enVarA.a(i4) * 2) + 1] / C);
        }
        return iPointArr2;
    }

    private void a(List<IPoint> list, int i, int i2) throws RemoteException {
        if (list.size() < 2) {
            return;
        }
        float[] fArr = new float[list.size() * 3];
        int size = list.size();
        IPoint[] iPointArr = new IPoint[size];
        int i3 = 0;
        for (IPoint iPoint : list) {
            int i4 = i3 * 3;
            fArr[i4] = ((Point) iPoint).x - i;
            fArr[i4 + 1] = ((Point) iPoint).y - i2;
            fArr[i4 + 2] = 0.0f;
            iPointArr[i3] = iPoint;
            i3++;
        }
        IPoint[] iPointArrA = a(iPointArr);
        if (iPointArrA.length == 0) {
            if (C == 1.0E10d) {
                C = 1.0E8d;
            } else {
                C = 1.0E10d;
            }
            iPointArrA = a(iPointArr);
        }
        float[] fArr2 = new float[iPointArrA.length * 3];
        int i5 = 0;
        for (IPoint iPoint2 : iPointArrA) {
            int i6 = i5 * 3;
            fArr2[i6] = ((Point) iPoint2).x - i;
            fArr2[i6 + 1] = ((Point) iPoint2).y - i2;
            fArr2[i6 + 2] = 0.0f;
            i5++;
        }
        this.r = size;
        this.s = iPointArrA.length;
        this.t = er.a(fArr);
        this.u = er.a(fArr2);
    }

    private List<IPoint> a(List<LatLng> list) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Object obj = null;
            for (LatLng latLng : list) {
                if (!latLng.equals(obj)) {
                    IPoint iPointObtain = IPoint.obtain();
                    this.j.latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
                    arrayList.add(iPointObtain);
                    obj = latLng;
                }
            }
            int size = arrayList.size();
            if (size > 1) {
                IPoint iPoint = (IPoint) arrayList.get(0);
                int i = size - 1;
                IPoint iPoint2 = (IPoint) arrayList.get(i);
                if (((Point) iPoint).x == ((Point) iPoint2).x && ((Point) iPoint).y == ((Point) iPoint2).y) {
                    arrayList.remove(i);
                }
            }
        }
        if (er.a(arrayList, arrayList.size())) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }
}
