package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.Arc;
import com.amap.api.maps.model.ArcOptions;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BuildingOverlay;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.HeatMapLayer;
import com.amap.api.maps.model.HeatMapLayerOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.NavigateArrow;
import com.amap.api.maps.model.NavigateArrowOptions;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.particle.ParticleOverlay;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate;
import com.autonavi.amap.api.mapcore.overlays.IParticleLatyer;
import com.autonavi.amap.mapcore.interfaces.IHeatMapLayer;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IArcDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.ICircleDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IGroundOverlayDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.INavigateArrowDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IPolygonDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements IGlOverlayLayer {
    public IAMapDelegate a;
    private df c;
    private int d = 0;
    private List<IOverlayDelegate> e = new Vector(500);
    private List<w> f = new ArrayList();
    private int[] g = new int[1];
    private volatile boolean h = false;
    private Handler i = new Handler(Looper.getMainLooper());
    private Runnable j = new Runnable() { // from class: com.amap.api.mapcore.util.r.1
        @Override // java.lang.Runnable
        public final synchronized void run() {
            try {
                synchronized (r.this) {
                    if (r.this.e != null && r.this.e.size() > 0) {
                        Collections.sort(r.this.e, r.this.b);
                    }
                }
            } catch (Throwable th) {
                hn.c(th, "MapOverlayImageView", "changeOverlayIndex");
            }
        }
    };
    public a b = new a();

    public static class a implements Serializable, Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            IOverlayDelegate iOverlayDelegate = (IOverlayDelegate) obj;
            IOverlayDelegate iOverlayDelegate2 = (IOverlayDelegate) obj2;
            if (iOverlayDelegate == null || iOverlayDelegate2 == null) {
                return 0;
            }
            try {
                if (iOverlayDelegate.getZIndex() > iOverlayDelegate2.getZIndex()) {
                    return 1;
                }
                return iOverlayDelegate.getZIndex() < iOverlayDelegate2.getZIndex() ? -1 : 0;
            } catch (Throwable th) {
                hn.c(th, "GlOverlayLayer", "compare");
                th.printStackTrace();
                return 0;
            }
        }
    }

    public r(IAMapDelegate iAMapDelegate) {
        this.a = iAMapDelegate;
    }

    private synchronized void b() {
        this.d = 0;
    }

    private void c() {
        synchronized (this.f) {
            for (int i = 0; i < this.f.size(); i++) {
                w wVar = this.f.get(i);
                if (wVar != null) {
                    wVar.o();
                    if (wVar.p() <= 0) {
                        this.g[0] = wVar.l();
                        GLES20.glDeleteTextures(1, this.g, 0);
                        wVar.a(0);
                        IAMapDelegate iAMapDelegate = this.a;
                        if (iAMapDelegate != null) {
                            iAMapDelegate.removeTextureItem(wVar.q());
                        }
                    }
                }
            }
            this.f.clear();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsCircleContainPoint(CircleOptions circleOptions, LatLng latLng) {
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsPolygonContainsPoint(PolygonOptions polygonOptions, LatLng latLng) {
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay addOverlayObject(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        BaseOverlay buildingOverlay;
        try {
            if (baseOverlay instanceof Polyline) {
                IPolylineDelegate iPolylineDelegateA = a((PolylineOptions) baseOptions);
                if (iPolylineDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new Polyline(iPolylineDelegateA);
            } else if (baseOverlay instanceof NavigateArrow) {
                INavigateArrowDelegate iNavigateArrowDelegateA = a((NavigateArrowOptions) baseOptions);
                if (iNavigateArrowDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new NavigateArrow(iNavigateArrowDelegateA);
            } else if (baseOverlay instanceof Polygon) {
                IPolygonDelegate iPolygonDelegateA = a((PolygonOptions) baseOptions);
                if (iPolygonDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new Polygon(iPolygonDelegateA);
            } else if (baseOverlay instanceof Circle) {
                ICircleDelegate iCircleDelegateA = a((CircleOptions) baseOptions);
                if (iCircleDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new Circle(iCircleDelegateA);
            } else if (baseOverlay instanceof Arc) {
                IArcDelegate iArcDelegateA = a((ArcOptions) baseOptions);
                if (iArcDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new Arc(iArcDelegateA);
            } else if (baseOverlay instanceof GroundOverlay) {
                IGroundOverlayDelegate iGroundOverlayDelegateA = a((GroundOverlayOptions) baseOptions);
                if (iGroundOverlayDelegateA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new GroundOverlay(iGroundOverlayDelegateA);
            } else if (baseOverlay instanceof ParticleOverlay) {
                IParticleLatyer iParticleLatyerA = a((ParticleOverlayOptions) baseOptions);
                if (iParticleLatyerA == null) {
                    return baseOverlay;
                }
                buildingOverlay = new ParticleOverlay(iParticleLatyerA);
            } else if (baseOverlay instanceof HeatMapLayer) {
                buildingOverlay = new HeatMapLayer(a((HeatMapLayerOptions) baseOptions));
            } else {
                if (!(baseOverlay instanceof BuildingOverlay)) {
                    return baseOverlay;
                }
                buildingOverlay = new BuildingOverlay(a());
            }
            return buildingOverlay;
        } catch (RemoteException e) {
            e.printStackTrace();
            return baseOverlay;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void addRecycleTextureIds(w wVar) {
        synchronized (this.f) {
            if (wVar != null) {
                this.f.add(wVar);
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void changeOverlayIndex() {
        this.h = true;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean checkInBounds(String str) {
        return true;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void clear(String... strArr) {
        try {
            for (IOverlayDelegate iOverlayDelegate : this.e) {
                if (iOverlayDelegate != null && ((iOverlayDelegate instanceof cn) || (iOverlayDelegate instanceof cr))) {
                    iOverlayDelegate.destroy();
                }
            }
            if (strArr == null) {
                this.e.clear();
                b();
                return;
            }
            IOverlayDelegate iOverlayDelegate2 = null;
            for (IOverlayDelegate iOverlayDelegate3 : this.e) {
                for (String str : strArr) {
                    if (str != null && str.equals(iOverlayDelegate3.getId())) {
                        iOverlayDelegate2 = iOverlayDelegate3;
                        break;
                    }
                }
            }
            this.e.clear();
            if (iOverlayDelegate2 != null) {
                this.e.add(iOverlayDelegate2);
            }
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "clear");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearTileCache() {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized String createId(String str) {
        this.d++;
        return str + this.d;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void destroy() {
        try {
            Iterator<IOverlayDelegate> it2 = this.e.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            clear(new String[0]);
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "destory");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized boolean draw(int i, int i2, boolean z) {
        boolean z2 = true;
        if (i == 2) {
            return true;
        }
        try {
            c();
            MapConfig mapConfig = this.a.getMapConfig();
            if (mapConfig == null) {
                return false;
            }
            if (this.h) {
                this.j.run();
                this.h = false;
            }
            int size = this.e.size();
            for (IOverlayDelegate iOverlayDelegate : this.e) {
                if (iOverlayDelegate.isVisible()) {
                    if (size > 20) {
                        if (iOverlayDelegate.checkInBounds()) {
                            if (i == 0) {
                                if (iOverlayDelegate.getZIndex() <= i2) {
                                    iOverlayDelegate.draw(mapConfig);
                                }
                            } else if (iOverlayDelegate.getZIndex() > i2) {
                                iOverlayDelegate.draw(mapConfig);
                            }
                        }
                    } else if (i == 0) {
                        if (iOverlayDelegate.getZIndex() <= i2) {
                            iOverlayDelegate.draw(mapConfig);
                        }
                    } else if (iOverlayDelegate.getZIndex() > i2) {
                        iOverlayDelegate.draw(mapConfig);
                    }
                }
            }
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "draw");
            z2 = false;
        }
        return z2;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final int getCurrentParticleNum(String str) {
        return 0;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final float[] getFinalMatrix() {
        IAMapDelegate iAMapDelegate = this.a;
        return iAMapDelegate != null ? iAMapDelegate.getFinalMatrix() : new float[16];
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final df getGLShaderManager() {
        return this.c;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(MotionEvent motionEvent) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(LatLng latLng) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Polyline getHitOverlay(LatLng latLng) {
        IOverlayDelegate iOverlayDelegateA = a(latLng);
        if (iOverlayDelegateA != null) {
            return new Polyline((IPolylineDelegate) iOverlayDelegateA);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final IAMapDelegate getMap() {
        return this.a;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMultiPointItem(LatLng latLng, MultiPointItem multiPointItem) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Object getNativeProperties(String str, String str2, Object[] objArr) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final LatLng getNearestLatLng(PolylineOptions polylineOptions, LatLng latLng) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final w getTextureItem(BitmapDescriptor bitmapDescriptor) {
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate != null) {
            return iAMapDelegate.getTextureItem(bitmapDescriptor, true);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void hideInfoWindow(String str) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void onCreateAMapInstance() {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void processCircleHoleOption(CircleOptions circleOptions) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void processPolygonHoleOption(PolygonOptions polygonOptions) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(String str) throws RemoteException {
        return removeOverlay(str, false);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void set2Top(String str) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setFlingState(boolean z) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setGlShaderManager(df dfVar) {
        this.c = dfVar;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setRunLowFrame(boolean z) {
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate != null) {
            iAMapDelegate.setRunLowFrame(z);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void showInfoWindow(String str) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void updateOption(String str, BaseOptions baseOptions) {
    }

    private synchronized IBuildingDelegate a() throws RemoteException {
        cn cnVar;
        cnVar = new cn(this);
        cnVar.a(this.c);
        a(cnVar);
        return cnVar;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized boolean removeOverlay(String str, boolean z) throws RemoteException {
        IOverlayDelegate iOverlayDelegateA = a(str);
        if (iOverlayDelegateA == null) {
            return false;
        }
        if (z) {
            iOverlayDelegateA.destroy();
        }
        return this.e.remove(iOverlayDelegateA);
    }

    private synchronized IHeatMapLayer a(HeatMapLayerOptions heatMapLayerOptions) throws RemoteException {
        cr crVar;
        crVar = new cr(this);
        crVar.a(this.c);
        crVar.setOptions(heatMapLayerOptions);
        a(crVar);
        return crVar;
    }

    private synchronized IOverlayDelegate a(String str) throws RemoteException {
        for (IOverlayDelegate iOverlayDelegate : this.e) {
            if (iOverlayDelegate != null && iOverlayDelegate.getId().equals(str)) {
                return iOverlayDelegate;
            }
        }
        return null;
    }

    private synchronized IPolylineDelegate a(PolylineOptions polylineOptions) throws RemoteException {
        if (polylineOptions == null) {
            return null;
        }
        da daVar = new da(this, polylineOptions);
        df dfVar = this.c;
        if (dfVar != null) {
            daVar.a(dfVar);
        }
        a(daVar);
        return daVar;
    }

    private synchronized INavigateArrowDelegate a(NavigateArrowOptions navigateArrowOptions) throws RemoteException {
        if (navigateArrowOptions == null) {
            return null;
        }
        cw cwVar = new cw(this.a);
        cwVar.setTopColor(navigateArrowOptions.getTopColor());
        cwVar.setSideColor(navigateArrowOptions.getSideColor());
        cwVar.setPoints(navigateArrowOptions.getPoints());
        cwVar.setVisible(navigateArrowOptions.isVisible());
        cwVar.setWidth(navigateArrowOptions.getWidth());
        cwVar.setZIndex(navigateArrowOptions.getZIndex());
        cwVar.set3DModel(navigateArrowOptions.is3DModel());
        a(cwVar);
        return cwVar;
    }

    private synchronized IPolygonDelegate a(PolygonOptions polygonOptions) throws RemoteException {
        if (polygonOptions == null) {
            return null;
        }
        cz czVar = new cz(this.a);
        czVar.setFillColor(polygonOptions.getFillColor());
        czVar.setPoints(polygonOptions.getPoints());
        czVar.setHoleOptions(polygonOptions.getHoleOptions());
        czVar.setVisible(polygonOptions.isVisible());
        czVar.setStrokeWidth(polygonOptions.getStrokeWidth());
        czVar.setStrokeColor(polygonOptions.getStrokeColor());
        czVar.setZIndex(polygonOptions.getZIndex());
        czVar.a(polygonOptions.getLineJoinType());
        czVar.a(polygonOptions.isUsePolylineStroke());
        a(czVar);
        return czVar;
    }

    private synchronized ICircleDelegate a(CircleOptions circleOptions) throws RemoteException {
        if (circleOptions == null) {
            return null;
        }
        co coVar = new co(this.a);
        coVar.setFillColor(circleOptions.getFillColor());
        coVar.setCenter(circleOptions.getCenter());
        coVar.setVisible(circleOptions.isVisible());
        coVar.setHoleOptions(circleOptions.getHoleOptions());
        coVar.setStrokeWidth(circleOptions.getStrokeWidth());
        coVar.setZIndex(circleOptions.getZIndex());
        coVar.setStrokeColor(circleOptions.getStrokeColor());
        coVar.setRadius(circleOptions.getRadius());
        coVar.setDottedLineType(circleOptions.getStrokeDottedLineType());
        coVar.a(circleOptions.isUsePolylineStroke());
        a(coVar);
        return coVar;
    }

    private synchronized IArcDelegate a(ArcOptions arcOptions) throws RemoteException {
        if (arcOptions == null) {
            return null;
        }
        cm cmVar = new cm(this.a);
        cmVar.setStrokeColor(arcOptions.getStrokeColor());
        cmVar.setStart(arcOptions.getStart());
        cmVar.setPassed(arcOptions.getPassed());
        cmVar.setEnd(arcOptions.getEnd());
        cmVar.setVisible(arcOptions.isVisible());
        cmVar.setStrokeWidth(arcOptions.getStrokeWidth());
        cmVar.setZIndex(arcOptions.getZIndex());
        a(cmVar);
        return cmVar;
    }

    private synchronized IGroundOverlayDelegate a(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        if (groundOverlayOptions == null) {
            return null;
        }
        cq cqVar = new cq(this.a, this);
        cqVar.setAnchor(groundOverlayOptions.getAnchorU(), groundOverlayOptions.getAnchorV());
        cqVar.setDimensions(groundOverlayOptions.getWidth(), groundOverlayOptions.getHeight());
        cqVar.setImage(groundOverlayOptions.getImage());
        cqVar.setPosition(groundOverlayOptions.getLocation());
        cqVar.setPositionFromBounds(groundOverlayOptions.getBounds());
        cqVar.setBearing(groundOverlayOptions.getBearing());
        cqVar.setTransparency(groundOverlayOptions.getTransparency());
        cqVar.setVisible(groundOverlayOptions.isVisible());
        cqVar.setZIndex(groundOverlayOptions.getZIndex());
        a(cqVar);
        return cqVar;
    }

    private synchronized IParticleLatyer a(ParticleOverlayOptions particleOverlayOptions) throws RemoteException {
        if (particleOverlayOptions == null) {
            return null;
        }
        cy cyVar = new cy(this);
        cyVar.a(particleOverlayOptions);
        a(cyVar);
        return cyVar;
    }

    private void a(IOverlayDelegate iOverlayDelegate) throws RemoteException {
        this.e.add(iOverlayDelegate);
        changeOverlayIndex();
    }

    private synchronized IOverlayDelegate a(LatLng latLng) {
        for (IOverlayDelegate iOverlayDelegate : this.e) {
            if (iOverlayDelegate != null && iOverlayDelegate.isDrawFinish() && (iOverlayDelegate instanceof IPolylineDelegate) && ((IPolylineDelegate) iOverlayDelegate).contains(latLng)) {
                return iOverlayDelegate;
            }
        }
        return null;
    }
}
