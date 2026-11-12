package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.RemoteException;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.amap.api.maps.model.AMapPara;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.Rectangle;
import com.google.maps.android.kml.KmlPolygon;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class cz implements IPolygonDelegate {
    private static float A = 4.0075016E7f;
    private static int B = 256;
    private static int C = 20;
    private static double H = 1.0E10d;
    private int D;
    private int E;
    private FloatBuffer F;
    private FloatBuffer G;
    private IAMapDelegate b;
    private boolean e;
    private String f;
    private float g;
    private int h;
    private int i;
    private List<LatLng> j;
    private List<LatLng> k;
    private List<BaseHoleOptions> n;
    private FloatBuffer o;
    private FloatBuffer p;
    private df.e z;
    private float c = 0.0f;
    private boolean d = true;
    private List<IPoint> l = new Vector();
    private List<BaseHoleOptions> m = new Vector();
    private int q = 0;
    private int r = 0;
    private boolean s = false;
    private float t = 0.0f;
    private Object u = new Object();
    private boolean v = false;
    private AMapPara.LineJoinType w = AMapPara.LineJoinType.LineJoinBevel;
    private AMapPara.LineCapType x = AMapPara.LineCapType.LineCapRound;
    public Rect a = null;
    private float y = 0.0f;

    public cz(IAMapDelegate iAMapDelegate) {
        this.b = iAMapDelegate;
        try {
            this.f = getId();
        } catch (RemoteException e) {
            hn.c(e, "PolygonDelegateImp", "create");
            e.printStackTrace();
        }
    }

    private void a() {
        IAMapDelegate iAMapDelegate = this.b;
        if (iAMapDelegate != null) {
            this.z = (df.e) iAMapDelegate.getGLShader(3);
        }
    }

    private void b() throws RemoteException {
        GLES20.glClearStencil(0);
        GLES20.glClear(1024);
        GLES20.glDisable(2960);
        MapConfig mapConfig = this.b.getMapConfig();
        List<BaseHoleOptions> list = this.m;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            BaseHoleOptions baseHoleOptions = this.m.get(i);
            boolean z = baseHoleOptions instanceof PolygonHoleOptions;
            if (z) {
                a(a(((PolygonHoleOptions) baseHoleOptions).getPoints()), (int) mapConfig.getSX(), (int) mapConfig.getSY());
            } else if (baseHoleOptions instanceof CircleHoleOptions) {
                this.b.changeGLOverlayIndex();
                a((CircleHoleOptions) baseHoleOptions);
            }
            if (this.F != null && this.D > 0) {
                df.e eVar = this.z;
                if (eVar == null || eVar.b()) {
                    a();
                }
                if (z) {
                    dz.a(this.z, this.i, this.F, this.g, this.D, mapConfig.getMvpMatrix(), this.b.getLineTextureID(), this.b.getLineTextureRatio(), mapConfig.getMapPerPixelUnitLength(), this.x.getTypeValue(), this.w.getTypeValue(), this.v);
                } else if (baseHoleOptions instanceof CircleHoleOptions) {
                    dz.a(this.z, this.i, this.F, this.g, this.D, this.b.getFinalMatrix(), mapConfig.getMapPerPixelUnitLength(), this.b.getLineTextureID(), this.b.getLineTextureRatio(), this.v);
                }
            }
        }
    }

    private void c() {
        float zoomLevel = this.b.getZoomLevel();
        if (this.l.size() <= 5000) {
            this.t = this.b.getMapProjection().getMapLenWithWin(2);
            return;
        }
        if (zoomLevel > 12.0f) {
            this.t = this.b.getMapProjection().getMapLenWithWin(10);
            return;
        }
        float f = (this.g / 2.0f) + (zoomLevel / 2.0f);
        if (f > 200.0f) {
            f = 200.0f;
        }
        this.t = this.b.getMapProjection().getMapLenWithWin((int) f);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return this.b.getMapConfig().getGeoRectangle().isOverlap(this.a);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final boolean contains(LatLng latLng) throws RemoteException {
        if (latLng == null) {
            return false;
        }
        try {
            List<BaseHoleOptions> list = this.m;
            if (list != null && list.size() > 0) {
                Iterator<BaseHoleOptions> it2 = this.m.iterator();
                while (it2.hasNext()) {
                    if (er.a(it2.next(), latLng)) {
                        return false;
                    }
                }
            }
            return er.a(latLng, getPoints());
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", SearchCriteria.CONTAINS);
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        try {
            FloatBuffer floatBuffer = this.o;
            if (floatBuffer != null) {
                floatBuffer.clear();
                this.o = null;
            }
            if (this.p != null) {
                this.p = null;
            }
            FloatBuffer floatBuffer2 = this.F;
            if (floatBuffer2 != null) {
                floatBuffer2.clear();
                this.F = null;
            }
            FloatBuffer floatBuffer3 = this.G;
            if (floatBuffer3 != null) {
                floatBuffer3.clear();
                this.G = null;
            }
            List<BaseHoleOptions> list = this.m;
            if (list != null) {
                list.clear();
            }
            List<BaseHoleOptions> list2 = this.n;
            if (list2 != null) {
                list2.clear();
            }
            this.m = null;
            this.n = null;
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "destroy");
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0186  */
    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        int i;
        boolean z;
        List<IPoint> list = this.l;
        if (list == null || list.size() == 0) {
            return;
        }
        Rectangle geoRectangle = mapConfig.getGeoRectangle();
        geoRectangle.getClipRect();
        List<IPoint> list2 = this.l;
        a(geoRectangle);
        MapConfig mapConfig2 = this.b.getMapConfig();
        List<BaseHoleOptions> list3 = this.m;
        if (list3 != null && list3.size() > 0) {
            GLES20.glClearStencil(0);
            GLES20.glStencilMask(255);
            GLES20.glClear(1024);
            GLES20.glFlush();
            GLES20.glEnable(2960);
            GLES20.glColorMask(false, false, false, false);
            GLES20.glStencilFunc(512, 1, 255);
            GLES20.glStencilOp(7681, RaceId.RACE_GET_BOOT_REASON, RaceId.RACE_GET_BOOT_REASON);
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                BaseHoleOptions baseHoleOptions = this.m.get(i2);
                boolean z2 = baseHoleOptions instanceof PolygonHoleOptions;
                if (z2) {
                    a(a(((PolygonHoleOptions) baseHoleOptions).getPoints()), (int) mapConfig2.getSX(), (int) mapConfig2.getSY());
                } else if (baseHoleOptions instanceof CircleHoleOptions) {
                    this.b.changeGLOverlayIndex();
                    a((CircleHoleOptions) baseHoleOptions);
                }
                if (this.F != null && this.D > 0) {
                    df.e eVar = this.z;
                    if (eVar == null || eVar.b()) {
                        a();
                    }
                    if (z2) {
                        dz.a(this.z, -1, -16777216, this.F, this.g, this.G, this.D, this.E, this.b.getFinalMatrix(), this.b.getLineTextureID(), this.b.getLineTextureRatio(), mapConfig2.getMapPerPixelUnitLength(), this.x.getTypeValue(), this.w.getTypeValue(), this.v, false);
                    } else if (baseHoleOptions instanceof CircleHoleOptions) {
                        dz.a(this.z, Color.argb(200, 80, 1, 1), Color.argb(200, 1, 1, 1), this.F, 5.0f, this.D, this.b.getFinalMatrix(), mapConfig2.getMapPerPixelUnitLength(), this.b.getLineTextureID(), this.b.getLineTextureRatio(), this.v, false);
                    }
                }
            }
            GLES20.glColorMask(true, true, true, true);
            GLES20.glStencilFunc(517, 1, 255);
            GLES20.glStencilMask(0);
        }
        if (list2.size() > 2) {
            int sx = (int) mapConfig.getSX();
            int sy = (int) mapConfig.getSY();
            c();
            ArrayList<IPoint> arrayList = new ArrayList();
            int size = list2.size();
            if (size >= 2) {
                IPoint iPoint = list2.get(0);
                arrayList.add(iPoint);
                int i3 = 1;
                while (true) {
                    i = size - 1;
                    if (i3 >= i) {
                        break;
                    }
                    IPoint iPoint2 = list2.get(i3);
                    int i4 = ((Point) iPoint2).x;
                    int i5 = ((Point) iPoint).x;
                    float f = i4 - i5;
                    float f2 = this.t;
                    if (f >= f2 || i4 - i5 <= (-f2)) {
                        z = true;
                    } else {
                        int i6 = ((Point) iPoint2).y;
                        int i7 = ((Point) iPoint).y;
                        if (i6 - i7 >= f2 || i6 - i7 <= (-f2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList.add(iPoint2);
                        iPoint = iPoint2;
                    }
                    i3++;
                }
                arrayList.add(list2.get(i));
                float[] fArr = new float[arrayList.size() * 3];
                int size2 = arrayList.size();
                IPoint[] iPointArr = new IPoint[size2];
                int i8 = 0;
                for (IPoint iPoint3 : arrayList) {
                    int i9 = i8 * 3;
                    fArr[i9] = ((Point) iPoint3).x - sx;
                    fArr[i9 + 1] = ((Point) iPoint3).y - sy;
                    fArr[i9 + 2] = 0.0f;
                    iPointArr[i8] = iPoint3;
                    i8++;
                }
                IPoint[] iPointArrA = a(iPointArr);
                if (iPointArrA.length == 0) {
                    if (H == 1.0E10d) {
                        H = 1.0E8d;
                    } else {
                        H = 1.0E10d;
                    }
                    iPointArrA = a(iPointArr);
                }
                float[] fArr2 = new float[iPointArrA.length * 3];
                int i10 = 0;
                for (IPoint iPoint4 : iPointArrA) {
                    int i11 = i10 * 3;
                    fArr2[i11] = ((Point) iPoint4).x - sx;
                    fArr2[i11 + 1] = ((Point) iPoint4).y - sy;
                    fArr2[i11 + 2] = 0.0f;
                    i10++;
                }
                this.q = size2;
                this.r = iPointArrA.length;
                this.o = er.a(fArr);
                this.p = er.a(fArr2);
            }
            if (this.o != null && this.p != null && this.q > 0 && this.r > 0) {
                df.e eVar2 = this.z;
                if (eVar2 == null || eVar2.b()) {
                    a();
                }
                dz.a(this.z, this.h, this.i, this.o, this.g, this.p, this.q, this.r, this.b.getFinalMatrix(), this.b.getLineTextureID(), this.b.getLineTextureRatio(), mapConfig.getMapPerPixelUnitLength(), this.x.getTypeValue(), this.w.getTypeValue(), this.v, true);
            }
        }
        b();
        this.s = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final int getFillColor() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final List<BaseHoleOptions> getHoleOptions() {
        return this.m;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate
    public final List<LatLng> getHoles() {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.f == null) {
            this.f = this.b.createId(KmlPolygon.GEOMETRY_TYPE);
        }
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final List<LatLng> getPoints() throws RemoteException {
        return this.k;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final int getStrokeColor() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final float getStrokeWidth() throws RemoteException {
        return this.g;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return this.s;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate
    public final boolean isGeodesic() {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        this.b.removeGLOverlay(getId());
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final void setFillColor(int i) throws RemoteException {
        this.h = i;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate
    public final void setGeodesic(boolean z) {
        this.e = z;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final void setHoleOptions(List<BaseHoleOptions> list) {
        try {
            this.n = list;
            List<BaseHoleOptions> list2 = this.m;
            if (list2 == null) {
                this.m = new ArrayList();
            } else {
                list2.clear();
            }
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    BaseHoleOptions baseHoleOptions = list.get(i);
                    if (baseHoleOptions instanceof PolygonHoleOptions) {
                        PolygonHoleOptions polygonHoleOptions = (PolygonHoleOptions) baseHoleOptions;
                        if (a(polygonHoleOptions) && !er.a(this.m, polygonHoleOptions)) {
                            this.m.add(polygonHoleOptions);
                        }
                    } else if (baseHoleOptions instanceof CircleHoleOptions) {
                        CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
                        if (b(circleHoleOptions) && !er.a(this.m, circleHoleOptions)) {
                            this.m.add(circleHoleOptions);
                        }
                    }
                }
            } else {
                this.m.clear();
            }
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "setHoleOptions");
            th.printStackTrace();
        }
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate
    public final void setHoles(List<LatLng> list) throws RemoteException {
        this.j = list;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final void setPoints(List<LatLng> list) throws RemoteException {
        synchronized (this.u) {
            this.k = list;
            LatLngBounds.Builder builder = LatLngBounds.builder();
            if (this.a == null) {
                this.a = new Rect();
            }
            er.a(this.a);
            this.l.clear();
            if (list != null) {
                Object obj = null;
                for (LatLng latLng : list) {
                    if (!latLng.equals(obj)) {
                        IPoint iPointObtain = IPoint.obtain();
                        this.b.latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
                        this.l.add(iPointObtain);
                        er.b(this.a, ((Point) iPointObtain).x, ((Point) iPointObtain).y);
                        builder.include(latLng);
                        obj = latLng;
                    }
                }
                int size = this.l.size();
                if (size > 1) {
                    IPoint iPoint = this.l.get(0);
                    int i = size - 1;
                    IPoint iPoint2 = this.l.get(i);
                    if (((Point) iPoint).x == ((Point) iPoint2).x && ((Point) iPoint).y == ((Point) iPoint2).y) {
                        this.l.remove(i);
                    }
                }
            }
            this.a.sort();
            FloatBuffer floatBuffer = this.o;
            if (floatBuffer != null) {
                floatBuffer.clear();
            }
            FloatBuffer floatBuffer2 = this.p;
            if (floatBuffer2 != null) {
                floatBuffer2.clear();
            }
            List<IPoint> list2 = this.l;
            if (er.a(list2, list2.size())) {
                Collections.reverse(this.l);
            }
            this.q = 0;
            this.r = 0;
            this.b.setRunLowFrame(false);
            this.b.setRunLowFrame(false);
            setHoleOptions(this.n);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final void setStrokeColor(int i) throws RemoteException {
        this.i = i;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolygon
    public final void setStrokeWidth(float f) throws RemoteException {
        this.g = f;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) throws RemoteException {
        this.d = z;
        this.b.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.c = f;
        this.b.changeGLOverlayIndex();
        this.b.setRunLowFrame(false);
    }

    private void a(CircleHoleOptions circleHoleOptions) throws RemoteException {
        if (circleHoleOptions.getCenter() != null) {
            IPoint iPointObtain = IPoint.obtain();
            FPoint fPointObtain = FPoint.obtain();
            GLMapState.lonlat2Geo(circleHoleOptions.getCenter().longitude, circleHoleOptions.getCenter().latitude, iPointObtain);
            float[] fArr = new float[1086];
            double dA = a(circleHoleOptions.getCenter().latitude) * circleHoleOptions.getRadius();
            int sx = (int) this.b.getMapConfig().getSX();
            int sy = (int) this.b.getMapConfig().getSY();
            float f = ((Point) iPointObtain).x - sx;
            ((PointF) fPointObtain).x = f;
            float f2 = ((Point) iPointObtain).y - sy;
            ((PointF) fPointObtain).y = f2;
            int i = 0;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = 0.0f;
            while (i < 361) {
                double d = (((double) i) * 3.141592653589793d) / 180.0d;
                double dSin = Math.sin(d) * dA;
                double dCos = Math.cos(d) * dA;
                int i2 = (int) (((double) ((Point) iPointObtain).x) + dSin);
                int i3 = (int) (((double) ((Point) iPointObtain).y) + dCos);
                ((PointF) fPointObtain).x = i2 - sx;
                ((PointF) fPointObtain).y = i3 - sy;
                ((PointF) fPointObtain).x = i2 - ((int) this.b.getMapConfig().getSX());
                float sy2 = i3 - ((int) this.b.getMapConfig().getSY());
                ((PointF) fPointObtain).y = sy2;
                i++;
                int i4 = i * 3;
                fArr[i4] = ((PointF) fPointObtain).x;
                fArr[i4 + 1] = sy2;
                fArr[i4 + 2] = 0.0f;
            }
            this.D = 362;
            this.F = er.a(fArr);
            iPointObtain.recycle();
            fPointObtain.recycle();
        }
    }

    private boolean b(CircleHoleOptions circleHoleOptions) {
        try {
            return !er.b(getPoints(), circleHoleOptions) && contains(circleHoleOptions.getCenter());
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "isCircleInPolygon");
            th.printStackTrace();
            return false;
        }
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
            if (H == 1.0E10d) {
                H = 1.0E8d;
            } else {
                H = 1.0E10d;
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
        this.D = size;
        this.E = iPointArrA.length;
        this.F = er.a(fArr);
        this.G = er.a(fArr2);
    }

    private boolean a(Rectangle rectangle) {
        this.y = this.b.getZoomLevel();
        c();
        if (this.y > 10.0f && rectangle != null) {
            try {
                return !rectangle.contains(this.a);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private List<IPoint> a(List<LatLng> list) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Object obj = null;
            for (LatLng latLng : list) {
                if (!latLng.equals(obj)) {
                    IPoint iPointObtain = IPoint.obtain();
                    this.b.latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
                    arrayList.add(iPointObtain);
                    er.b(this.a, ((Point) iPointObtain).x, ((Point) iPointObtain).y);
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

    private boolean a(PolygonHoleOptions polygonHoleOptions) {
        boolean zA = true;
        try {
            List<LatLng> points = polygonHoleOptions.getPoints();
            for (int i = 0; i < points.size() && (zA = er.a(points.get(i), getPoints())); i++) {
            }
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "isPolygonInPolygon");
            th.printStackTrace();
        }
        return zA;
    }

    private static IPoint[] a(IPoint[] iPointArr) {
        int length = iPointArr.length;
        double[] dArr = new double[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            double d = ((Point) iPointArr[i]).x;
            double d2 = H;
            dArr[i2] = d * d2;
            dArr[i2 + 1] = ((double) ((Point) iPointArr[i]).y) * d2;
        }
        en enVarA = new dw().a(dArr);
        int i3 = enVarA.b;
        IPoint[] iPointArr2 = new IPoint[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iPointArr2[i4] = new IPoint();
            ((Point) iPointArr2[i4]).x = (int) (dArr[enVarA.a(i4) * 2] / H);
            ((Point) iPointArr2[i4]).y = (int) (dArr[(enVarA.a(i4) * 2) + 1] / H);
        }
        return iPointArr2;
    }

    public final void a(AMapPara.LineJoinType lineJoinType) {
        this.w = lineJoinType;
    }

    public final void a(boolean z) {
        this.v = z;
    }

    private static double a(double d) {
        return 1.0d / ((double) ((float) ((Math.cos((d * 3.141592653589793d) / 180.0d) * ((double) A)) / ((double) (B << C)))));
    }
}
