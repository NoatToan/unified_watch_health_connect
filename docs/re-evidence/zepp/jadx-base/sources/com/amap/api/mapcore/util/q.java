package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.google.maps.android.kml.KmlPolygon;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements IGlOverlayLayer, AMapNativeGlOverlayLayer.NativeFunCallListener {
    public IAMapDelegate a;
    private Context d;
    private df e;
    private cu k;
    private int f = 0;
    private final Object g = new Object();
    private BitmapDescriptor l = null;
    private BitmapDescriptor m = null;
    private BitmapDescriptor n = null;
    private BitmapDescriptor o = null;
    private BitmapDescriptor p = null;
    private BitmapDescriptor q = null;
    private BitmapDescriptor r = null;
    private BitmapDescriptor s = null;
    public boolean b = false;
    public List<String> c = new ArrayList();
    private final Map<String, BaseOverlay> i = new HashMap();
    private ArrayList<Pair<BaseOverlay, BaseOptions>> j = new ArrayList<>();
    private AMapNativeGlOverlayLayer h = new AMapNativeGlOverlayLayer();

    public q(IAMapDelegate iAMapDelegate, Context context) {
        this.a = iAMapDelegate;
        this.d = context;
        this.k = new cu(iAMapDelegate);
    }

    private BitmapDescriptor a(View view) {
        if (view == null) {
            return null;
        }
        if ((view instanceof RelativeLayout) && this.d != null) {
            LinearLayout linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(1);
            linearLayout.addView(view);
            view = linearLayout;
        }
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(0);
        return BitmapDescriptorFactory.fromBitmap(er.a(view));
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsCircleContainPoint(CircleOptions circleOptions, LatLng latLng) {
        if (latLng != null && circleOptions != null) {
            try {
                synchronized (circleOptions) {
                    List<BaseHoleOptions> holeOptions = circleOptions.getHoleOptions();
                    if (holeOptions != null && holeOptions.size() > 0) {
                        Iterator<BaseHoleOptions> it2 = holeOptions.iterator();
                        while (it2.hasNext()) {
                            if (er.a(it2.next(), latLng)) {
                                return false;
                            }
                        }
                    }
                    return circleOptions.getRadius() >= ((double) AMapUtils.calculateLineDistance(circleOptions.getCenter(), latLng));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsPolygonContainsPoint(PolygonOptions polygonOptions, LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        try {
            List<BaseHoleOptions> holeOptions = polygonOptions.getHoleOptions();
            if (holeOptions != null && holeOptions.size() > 0) {
                Iterator<BaseHoleOptions> it2 = holeOptions.iterator();
                while (it2.hasNext()) {
                    if (er.a(it2.next(), latLng)) {
                        return false;
                    }
                }
            }
            return er.a(latLng, polygonOptions.getPoints());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay addOverlayObject(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        try {
            this.h.createOverlay(str, baseOptions);
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "addOverlay");
            th.printStackTrace();
            Log.d("amapApi", "GlOverlayLayer addOverlay error:" + th.getMessage());
        }
        synchronized (this.i) {
            this.i.put(str, baseOverlay);
        }
        return baseOverlay;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void addRecycleTextureIds(w wVar) {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void changeOverlayIndex() {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean checkInBounds(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties(str, "checkInBounds", new Object[]{str});
            if (nativeProperties instanceof Boolean) {
                return ((Boolean) nativeProperties).booleanValue();
            }
        }
        return true;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void clear(String... strArr) {
        try {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
            if (aMapNativeGlOverlayLayer != null && strArr != null) {
                aMapNativeGlOverlayLayer.clear(strArr);
            }
            synchronized (this.i) {
                try {
                    if (strArr != null) {
                        Iterator<Map.Entry<String, BaseOverlay>> it2 = this.i.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, BaseOverlay> next = it2.next();
                            boolean z = false;
                            for (String str : strArr) {
                                if (str != null && str.equals(next.getKey())) {
                                    z = true;
                                    break;
                                }
                            }
                            if (!z) {
                                it2.remove();
                            }
                        }
                    } else {
                        this.i.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this.j) {
                this.j.clear();
            }
        } catch (Throwable th2) {
            hn.c(th2, "GlOverlayLayer", "clear");
            th2.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearTileCache() {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "clearTileCache", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final String createId(String str) {
        String str2;
        synchronized (this.g) {
            this.f++;
            str2 = str + this.f;
        }
        return str2;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void destroy() {
        try {
            if (this.h == null) {
                return;
            }
            synchronized (this.i) {
                this.i.clear();
            }
            synchronized (this.j) {
                this.j.clear();
            }
            this.h.clear("");
            this.h.destroy();
            this.h = null;
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "destroy");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized boolean draw(int i, int i2, boolean z) {
        boolean z2 = false;
        try {
            cu cuVar = this.k;
            if (cuVar != null) {
                cuVar.a();
                cuVar.b();
            }
            MapConfig mapConfig = this.a.getMapConfig();
            if (mapConfig == null) {
                return false;
            }
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
            if (aMapNativeGlOverlayLayer != null) {
                aMapNativeGlOverlayLayer.setConfig(mapConfig, Float.valueOf(this.a.getZoomLevel()));
                this.h.render(i, i2, z);
            }
            z2 = true;
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "draw");
        }
        return z2;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getBuildInImageData(int i) {
        try {
            switch (i) {
                case 0:
                    BitmapDescriptor bitmapDescriptor = this.l;
                    if (bitmapDescriptor == null || bitmapDescriptor.getBitmap().isRecycled()) {
                        this.l = BitmapDescriptorFactory.fromBitmap(er.a(this.d, "amap_sdk_lineTexture.png"));
                    }
                    return this.l;
                case 1:
                    BitmapDescriptor bitmapDescriptor2 = this.o;
                    if (bitmapDescriptor2 == null || bitmapDescriptor2.getBitmap().isRecycled()) {
                        this.o = BitmapDescriptorFactory.fromBitmap(er.a(this.d, "amap_sdk_lineTexture.png"));
                    }
                    return this.o;
                case 2:
                    BitmapDescriptor bitmapDescriptor3 = this.n;
                    if (bitmapDescriptor3 == null || bitmapDescriptor3.getBitmap().isRecycled()) {
                        this.n = BitmapDescriptorFactory.fromBitmap(er.a(this.d, "amap_sdk_lineDashTexture_circle.png"));
                    }
                    return this.n;
                case 3:
                    BitmapDescriptor bitmapDescriptor4 = this.m;
                    if (bitmapDescriptor4 == null || bitmapDescriptor4.getBitmap().isRecycled()) {
                        this.m = BitmapDescriptorFactory.fromBitmap(er.a(this.d, "amap_sdk_lineDashTexture_square.png"));
                    }
                    return this.m;
                case 4:
                    BitmapDescriptor bitmapDescriptor5 = this.p;
                    if (bitmapDescriptor5 == null || bitmapDescriptor5.getBitmap().isRecycled()) {
                        this.p = BitmapDescriptorFactory.defaultMarker();
                    }
                    return this.p;
                case 5:
                    BitmapDescriptor bitmapDescriptor6 = this.q;
                    if (bitmapDescriptor6 == null || bitmapDescriptor6.getBitmap().isRecycled()) {
                        this.q = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_inner.png");
                    }
                    return this.q;
                case 6:
                    BitmapDescriptor bitmapDescriptor7 = this.r;
                    if (bitmapDescriptor7 == null || bitmapDescriptor7.getBitmap().isRecycled()) {
                        this.r = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_outer.png");
                    }
                    return this.r;
                case 7:
                    BitmapDescriptor bitmapDescriptor8 = this.s;
                    if (bitmapDescriptor8 == null || bitmapDescriptor8.getBitmap().isRecycled()) {
                        this.s = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_shadow.png");
                    }
                    return this.s;
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final int getCurrentParticleNum(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getCurrentParticleNum(str);
        }
        return 0;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final float[] getFinalMatrix() {
        IAMapDelegate iAMapDelegate = this.a;
        return iAMapDelegate != null ? iAMapDelegate.getFinalMatrix() : new float[16];
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final df getGLShaderManager() {
        return this.e;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized BaseOverlay getHitBaseOverlay(LatLng latLng) {
        BaseOverlay baseOverlay;
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer == null) {
            return null;
        }
        String strContain = aMapNativeGlOverlayLayer.contain(latLng);
        if (TextUtils.isEmpty(strContain)) {
            return null;
        }
        synchronized (this.i) {
            baseOverlay = this.i.get(strContain);
        }
        return baseOverlay;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized Polyline getHitOverlay(LatLng latLng) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        Polyline polyline = null;
        if (aMapNativeGlOverlayLayer != null) {
            String strContain = aMapNativeGlOverlayLayer.contain(latLng);
            if (TextUtils.isEmpty(strContain)) {
                return null;
            }
            synchronized (this.i) {
                BaseOverlay baseOverlay = this.i.get(strContain);
                polyline = baseOverlay instanceof Polyline ? (Polyline) baseOverlay : null;
            }
        }
        return polyline;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoContents(String str) {
        ap infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.i.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.b((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindow(String str) {
        ap infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.i.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.a((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindowClick(String str) {
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final long getInfoWindowUpdateOffsetTime(String str) {
        ap infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return 0L;
        }
        BaseOverlay baseOverlay = this.i.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return infoWindowDelegate.c((BasePointOverlay) baseOverlay);
        }
        return 0L;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final IAMapDelegate getMap() {
        return this.a;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        if (this.h == null) {
            return null;
        }
        this.c.clear();
        this.h.getNativeProperties("", "getMapScreenOverlays", new Object[]{this.c});
        if (this.c.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.c) {
            if (str != null && str.contains("MARKER")) {
                arrayList.add((Marker) this.i.get(str));
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties(str, "getMarkerInfoWindowOffset", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                ((PointF) fPoint).x = point.x;
                ((PointF) fPoint).y = point.y;
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMultiPointItem(LatLng latLng, MultiPointItem multiPointItem) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties("", "getMultiPointItem", new LatLng[]{latLng});
            if (nativeProperties instanceof MultiPointItem) {
                MultiPointItem multiPointItem2 = (MultiPointItem) nativeProperties;
                multiPointItem.setLatLng(multiPointItem2.getLatLng());
                multiPointItem.setCustomerId(multiPointItem2.getCustomerId());
                multiPointItem.setIPoint(multiPointItem2.getIPoint());
                multiPointItem.setSnippet(multiPointItem2.getSnippet());
                multiPointItem.setTitle(multiPointItem2.getTitle());
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Object getNativeProperties(String str, String str2, Object[] objArr) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getNativeProperties(str, str2, objArr);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final LatLng getNearestLatLng(PolylineOptions polylineOptions, LatLng latLng) {
        List<LatLng> points;
        if (latLng != null && polylineOptions != null && (points = polylineOptions.getPoints()) != null && points.size() != 0) {
            float fCalculateLineDistance = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < points.size(); i2++) {
                try {
                    if (i2 == 0) {
                        fCalculateLineDistance = AMapUtils.calculateLineDistance(latLng, points.get(i2));
                    } else {
                        float fCalculateLineDistance2 = AMapUtils.calculateLineDistance(latLng, points.get(i2));
                        if (fCalculateLineDistance > fCalculateLineDistance2) {
                            i = i2;
                            fCalculateLineDistance = fCalculateLineDistance2;
                        }
                    }
                } catch (Throwable th) {
                    hn.c(th, "PolylineDelegate", "getNearestLatLng");
                    th.printStackTrace();
                }
            }
            return points.get(i);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
        if (this.i.get(str) instanceof BasePointOverlay) {
            Object nativeProperties = this.h.getNativeProperties(str, "getMarkerScreenPos", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                ((PointF) fPoint).x = point.x;
                ((PointF) fPoint).y = point.y;
            }
        }
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getOverturnInfoWindow(String str) {
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getOverturnInfoWindowClick(String str) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final w getTextureItem(BitmapDescriptor bitmapDescriptor) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void hideInfoWindow(String str) {
        if (this.h != null) {
            this.a.hideInfoWindow();
            this.h.getNativeProperties(str, "setInfoWindowShown", new Object[]{Boolean.FALSE});
        }
        setRunLowFrame(false);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void onCreateAMapInstance() {
        if (this.h == null) {
            this.h = new AMapNativeGlOverlayLayer();
        }
        this.h.createNative();
        this.h.setShaderManager(this.e);
        this.h.setNativeFunCallListener(this);
        this.h.setAMapEngine(this.a.getGLMapEngine().getNativeInstance());
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onRedrawInfowindow() {
        IAMapDelegate iAMapDelegate = this.a;
        if (iAMapDelegate != null) {
            iAMapDelegate.redrawInfoWindow();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onSetRunLowFrame(boolean z) {
        setRunLowFrame(z);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void processCircleHoleOption(CircleOptions circleOptions) {
        boolean z;
        try {
            Field declaredField = circleOptions.getClass().getDeclaredField("isHoleOptionsUpdated");
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(circleOptions);
        } catch (Throwable th) {
            hn.c(th, "Circle", "isHoleOptionsUpdated");
            z = false;
        }
        if (!z || circleOptions.getHoleOptions() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<BaseHoleOptions> holeOptions = circleOptions.getHoleOptions();
        for (int i = 0; i < holeOptions.size(); i++) {
            BaseHoleOptions baseHoleOptions = holeOptions.get(i);
            if (baseHoleOptions instanceof PolygonHoleOptions) {
                PolygonHoleOptions polygonHoleOptions = (PolygonHoleOptions) baseHoleOptions;
                if (er.a(circleOptions.getRadius(), circleOptions.getCenter(), arrayList, polygonHoleOptions) && !er.a(arrayList, polygonHoleOptions)) {
                    arrayList.add(polygonHoleOptions);
                }
            } else if (baseHoleOptions instanceof CircleHoleOptions) {
                CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
                if (er.a(circleOptions.getRadius(), circleOptions.getCenter(), circleHoleOptions) && !er.a(arrayList, circleHoleOptions)) {
                    arrayList.add(circleHoleOptions);
                }
            }
        }
        circleOptions.getHoleOptions().clear();
        circleOptions.addHoles(arrayList);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void processPolygonHoleOption(PolygonOptions polygonOptions) {
        boolean z;
        try {
            Field declaredField = polygonOptions.getClass().getDeclaredField("isHoleOptionsUpdated");
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(polygonOptions);
        } catch (Throwable th) {
            hn.c(th, KmlPolygon.GEOMETRY_TYPE, "isHoleOptionsUpdated");
            z = false;
        }
        if (!z || polygonOptions.getHoleOptions() == null) {
            return;
        }
        List<BaseHoleOptions> arrayList = new ArrayList<>();
        List<BaseHoleOptions> holeOptions = polygonOptions.getHoleOptions();
        for (int i = 0; i < holeOptions.size(); i++) {
            BaseHoleOptions baseHoleOptions = holeOptions.get(i);
            if (baseHoleOptions instanceof PolygonHoleOptions) {
                PolygonHoleOptions polygonHoleOptions = (PolygonHoleOptions) baseHoleOptions;
                if (er.b(polygonOptions.getPoints(), polygonHoleOptions) && !er.a(arrayList, polygonHoleOptions)) {
                    arrayList.add(polygonHoleOptions);
                }
            } else if (baseHoleOptions instanceof CircleHoleOptions) {
                CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
                if (er.a(polygonOptions.getPoints(), arrayList, circleHoleOptions) && !er.a(arrayList, circleHoleOptions)) {
                    arrayList.add(circleHoleOptions);
                }
            }
        }
        polygonOptions.setHoleOptions(arrayList);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(String str) {
        boolean z;
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.removeOverlay(str);
            z = true;
        } else {
            z = false;
        }
        synchronized (this.i) {
            this.i.remove(str);
        }
        return z;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(String str, boolean z) {
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void set2Top(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties(str, "set2Top", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setFlingState(boolean z) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.h;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "setFlingState", new Object[]{Boolean.valueOf(z)});
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setGlShaderManager(df dfVar) {
        this.e = dfVar;
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
        Map<String, BaseOverlay> map;
        if (this.h == null || (map = this.i) == null) {
            return;
        }
        try {
            this.a.showInfoWindow(map.get(str));
            setRunLowFrame(false);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void updateOption(String str, BaseOptions baseOptions) {
        try {
            if (this.h == null) {
                return;
            }
            setRunLowFrame(false);
            this.h.updateOptions(str, baseOptions);
        } catch (Throwable th) {
            hn.c(th, "GlOverlayLayer", "updateOption");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(MotionEvent motionEvent) {
        if (this.a == null) {
            return null;
        }
        DPoint dPointObtain = DPoint.obtain();
        this.a.getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        return getHitBaseOverlay(latLng);
    }
}
