package com.huami.moving.maps.gaode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.HeatmapTileProvider;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.huami.chart.template.ColorTemplate;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.R;
import com.huami.moving.maps.IGPSPainter;
import com.huami.moving.maps.IMapAnimationCallback;
import com.huami.moving.maps.RouteLineSM;
import com.huami.moving.maps.track.TrackColorGradient;
import com.huami.moving.model.HeatmapData;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"Assert"})
public class GaodeMapPainter implements IGPSPainter<Polyline, LatLngBounds> {
    private static final String K = "GaodeMapPainter";
    private static final float L = 1.0f;
    private static final float M = 16.0f;
    private static final int N = 40;
    private static final int O = 11;
    private static final int P = 21;
    private List<Marker> C;
    private Polygon E;
    private Polygon F;
    private PolylineOptions G;
    private AMap a;
    private LatLngBounds.Builder b;
    private Polyline e;
    private WeakReference<Context> g;
    private List<GroundOverlay> k;
    private RouteLineSM o;
    private List<Marker> s;
    private GaodeMapUtil w;
    private Map<Integer, TileOverlay> y;
    private LatLngBounds c = null;
    private List<Integer> d = null;
    private CameraPosition.Builder f = null;
    private Marker h = null;
    private GroundOverlay i = null;
    private Marker j = null;
    private Marker l = null;
    private GPSPoint m = null;
    private float n = 18.0f;
    private Marker p = null;
    private float q = 0.0f;
    private Marker r = null;
    private CameraPosition.Builder t = null;
    private SparseArray<Integer> u = null;
    private int v = 40;
    private boolean x = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = false;
    private float D = 7.0f;
    private List<Marker> H = new ArrayList();
    private boolean I = false;
    private GPSPoint J = null;

    public class a implements AMap.CancelableCallback {
        public final /* synthetic */ IMapAnimationCallback a;

        public a(IMapAnimationCallback iMapAnimationCallback) {
            this.a = iMapAnimationCallback;
        }

        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onCancel() {
            this.a.onCancel();
        }

        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onFinish() {
            this.a.onFinish();
        }
    }

    public final class b implements RouteLineSM.LineSMObserver {
        private b() {
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawDottedLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            GaodeMapPainter.this.q();
            GaodeMapPainter.this.addDottedPolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawMarker(GPSPoint gPSPoint, int i) {
            if (i != 2) {
                return;
            }
            GaodeMapPainter.this.setPausePoint(gPSPoint);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawRouteLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            GaodeMapPainter.this.addRoutePolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawStableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            if (routeLineInfo.mType != 0) {
                return;
            }
            GaodeMapPainter.this.q();
            GaodeMapPainter.this.addPolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawUnstableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo, boolean z) {
            if (routeLineInfo.mType != 1) {
                return;
            }
            if (z) {
                GaodeMapPainter.this.q();
                GaodeMapPainter gaodeMapPainter = GaodeMapPainter.this;
                gaodeMapPainter.e = gaodeMapPainter.addPolyline(list, routeLineInfo);
            } else if (GaodeMapPainter.this.e != null) {
                GaodeMapPainter.this.e.setPoints(GaodeMapPainter.this.w.convertToLatLngFromGPSPoint(list));
            } else {
                GaodeMapPainter gaodeMapPainter2 = GaodeMapPainter.this;
                gaodeMapPainter2.e = gaodeMapPainter2.addPolyline(list, routeLineInfo);
            }
        }
    }

    public GaodeMapPainter(Context context, AMap aMap) {
        this.a = null;
        this.b = null;
        this.e = null;
        this.g = null;
        this.k = null;
        this.o = null;
        this.s = null;
        this.C = null;
        this.w = new GaodeMapUtil(context.getApplicationContext());
        this.a = aMap;
        this.k = new ArrayList();
        this.C = new ArrayList();
        this.s = new ArrayList();
        this.g = new WeakReference<>(context);
        this.b = new LatLngBounds.Builder();
        this.n *= 1.0f;
        this.o = new RouteLineSM(new b());
        this.e = null;
        p();
    }

    private Marker e(GPSPoint gPSPoint, String str) {
        WeakReference<Context> weakReference;
        Context context;
        LatLng latLngConvertToLatLng;
        if (gPSPoint == null || (weakReference = this.g) == null || (context = weakReference.get()) == null || (latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint)) == null) {
            return null;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLngConvertToLatLng);
        View viewInflate = View.inflate(context, R.layout.view_mark_distance, null);
        ((TextView) viewInflate.findViewById(R.id.text)).setText(String.valueOf(str));
        markerOptions.icon(BitmapDescriptorFactory.fromView(viewInflate));
        Marker markerAddMarker = this.a.addMarker(markerOptions);
        markerAddMarker.setAnchor(0.5f, 1.0f);
        return markerAddMarker;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private void f(GPSPoint gPSPoint) {
        CameraPosition cameraPosition = this.a.getCameraPosition();
        if (cameraPosition != null) {
            float f = cameraPosition.zoom;
            if (f < this.q) {
                this.f.zoom(this.q);
            } else {
                this.f.zoom(f);
            }
        } else {
            this.f.zoom(this.q);
        }
        this.a.animateCamera(CameraUpdateFactory.newCameraPosition(this.f.target(this.w.convertToLatLng(gPSPoint)).build()));
    }

    private List<LatLng> g(List<GPSPoint> list, boolean z, boolean z2) {
        HMLog.i(K, "boundsBuilder start:" + list.size(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        this.d = new ArrayList();
        if (list.size() > 0) {
            int i = 0;
            for (GPSPoint gPSPoint : list) {
                if (gPSPoint != null) {
                    LatLng latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint);
                    if (latLngConvertToLatLng == null) {
                        HMLog.i(K, "ErrorGPS:" + i + gPSPoint.mLatitude + gPSPoint.mLongitude, new Object[0]);
                    } else {
                        this.b.include(latLngConvertToLatLng);
                        arrayList.add(i, latLngConvertToLatLng);
                        i++;
                        if (!z && z2) {
                            this.d.add(Integer.valueOf(TrackColorGradient.getColor(gPSPoint.getSpeed())));
                        }
                    }
                }
            }
        }
        HMLog.i(K, "boundsBuilder end", new Object[0]);
        return arrayList;
    }

    private boolean h(GPSPoint gPSPoint) {
        if (this.p != null) {
            return false;
        }
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.strokeColor(-16777216);
        myLocationStyle.radiusFillColor(Color.argb(100, 0, 0, 180));
        myLocationStyle.myLocationIcon(BitmapDescriptorFactory.fromResource(R.drawable.running_gps_map_location_marker));
        myLocationStyle.strokeWidth(0.1f);
        myLocationStyle.myLocationType(1);
        this.a.setMyLocationStyle(myLocationStyle);
        this.a.setMyLocationRotateAngle(180.0f);
        this.a.getUiSettings().setMyLocationButtonEnabled(false);
        this.a.animateCamera(CameraUpdateFactory.newCameraPosition(this.t.target(this.w.convertToLatLng(gPSPoint)).build()));
        this.a.setMyLocationEnabled(true);
        ArrayList<BitmapDescriptor> arrayList = new ArrayList<>();
        arrayList.add(BitmapDescriptorFactory.fromResource(R.drawable.running_gps_map_cur_location_point1));
        arrayList.add(BitmapDescriptorFactory.fromResource(R.drawable.running_gps_map_cur_location_point2));
        this.p = this.a.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icons(arrayList).period(50));
        return true;
    }

    private MarkerOptions i(GPSPoint gPSPoint, int i, View view) {
        BitmapDescriptor bitmapDescriptorFromResource;
        try {
            if (i == 0) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_location);
            } else if (i == 1) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_star);
            } else if (i == 2) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_pause);
            } else if (i == 3) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_end);
            } else {
                if (i != 4) {
                    HMLog.i("IllegalArgumentException", "GaodeMapPainter createMarkerOptions", new Object[0]);
                    throw new IllegalArgumentException();
                }
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromView(view);
            }
            MarkerOptions markerOptions = new MarkerOptions();
            if (gPSPoint != null) {
                markerOptions.position(this.w.convertToLatLng(gPSPoint));
            }
            markerOptions.icon(bitmapDescriptorFromResource);
            markerOptions.setFlat(false);
            return markerOptions;
        } catch (Exception e) {
            HMLog.i("Run", e.getMessage(), new Object[0]);
            return null;
        }
    }

    private PolylineOptions j(boolean z, boolean z2, int i) {
        PolylineOptions polylineOptions = new PolylineOptions();
        int i2 = this.v;
        this.v = i2 + 1;
        polylineOptions.zIndex(i2);
        polylineOptions.width(this.n);
        if (i == 0) {
            i = n();
        }
        if (z || !z2) {
            polylineOptions.color(i);
        } else {
            polylineOptions.useGradient(true);
            polylineOptions.colorValues(this.d);
        }
        polylineOptions.setDottedLine(z);
        return polylineOptions;
    }

    private PolylineOptions k(boolean z, boolean z2, int i, List<LatLng> list) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(list);
        int i2 = this.v;
        this.v = i2 + 1;
        polylineOptions.zIndex(i2);
        polylineOptions.width(this.n);
        if (i == 0) {
            i = n();
        }
        if (z || !z2) {
            polylineOptions.color(i);
        } else {
            polylineOptions.useGradient(true);
            polylineOptions.colorValues(this.d);
        }
        polylineOptions.setDottedLine(z);
        return polylineOptions;
    }

    private void l(List<GPSPoint> list, RouteLineInfo routeLineInfo, int i) {
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 0;
        while (true) {
            char c = 0;
            for (GPSPoint gPSPoint : list) {
                int attr = gPSPoint.getAttr();
                arrayList.add(gPSPoint);
                i2++;
                if (attr == 3 || attr == 2) {
                    if (c == 2 && attr == 3 && i2 > 1) {
                        setPausePoint(gPSPoint);
                        arrayList.clear();
                        arrayList.add(gPSPoint);
                    } else {
                        if (i2 < i) {
                            setPausePoint(gPSPoint);
                        }
                        addPolyline((List<GPSPoint>) arrayList, routeLineInfo);
                        arrayList.clear();
                        if (attr == 2) {
                            c = 2;
                        } else {
                            arrayList.add(gPSPoint);
                        }
                    }
                } else if (c == 2 && i2 != i) {
                    setPausePoint(gPSPoint);
                    arrayList.clear();
                    arrayList.add(gPSPoint);
                } else if (i2 == i) {
                    addPolyline((List<GPSPoint>) arrayList, routeLineInfo);
                    arrayList.clear();
                }
            }
            return;
        }
    }

    private void m(boolean z) {
        this.a.getUiSettings().setMyLocationButtonEnabled(z);
        this.a.setMyLocationEnabled(z);
    }

    private int n() {
        return Color.argb(255, 241, 116, 86);
    }

    private int o() {
        return Color.rgb(128, 128, 128);
    }

    private void p() {
        float maxZoomLevel = this.a.getMaxZoomLevel();
        this.q = maxZoomLevel;
        if (maxZoomLevel >= 10.0f) {
            this.q = maxZoomLevel - 3.0f;
        }
        this.t = new CameraPosition.Builder().zoom(this.q).bearing(0.0f).tilt(0.0f);
        this.f = new CameraPosition.Builder().bearing(0.0f).tilt(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Polyline polyline = this.e;
        if (polyline == null) {
            return;
        }
        polyline.remove();
        this.e = null;
    }

    private void r(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            return;
        }
        this.J = gPSPoint;
        if (this.h == null) {
            Marker markerAddMarker = this.a.addMarker(i(null, 0, null));
            this.h = markerAddMarker;
            markerAddMarker.setAnchor(0.5f, 0.5f);
        }
        this.h.setPosition(this.w.convertToLatLng(gPSPoint));
        if (this.I) {
            return;
        }
        f(gPSPoint);
    }

    private void s(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter updatePausePointIfNeeded", new Object[0]);
            throw new IllegalArgumentException();
        }
        GPSPoint gPSPoint2 = this.m;
        if (gPSPoint2 == null || gPSPoint2.getIndex() != gPSPoint.getIndex()) {
            return;
        }
        Marker marker = this.l;
        if (marker != null) {
            marker.setPosition(this.w.convertToLatLng(gPSPoint));
            return;
        }
        MarkerOptions markerOptionsI = i(gPSPoint, 2, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.l = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
        this.m = gPSPoint;
    }

    private void t(LatLngBounds latLngBounds, IMapAnimationCallback iMapAnimationCallback) {
        this.a.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, (int) ViewUtils.dp2px(this.g.get(), 85.0f)), iMapAnimationCallback != null ? new a(iMapAnimationCallback) : null);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(GPSPoint gPSPoint) {
        WeakReference<Context> weakReference;
        Context context;
        if (gPSPoint == null || (weakReference = this.g) == null || (context = weakReference.get()) == null) {
            return;
        }
        GroundOverlay groundOverlay = this.i;
        if (groundOverlay != null) {
            groundOverlay.remove();
            this.i = null;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.running_gps_map_dark_background);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(-90.0d, -180.0d)).include(new LatLng(-90.0d, 180.0d)).include(new LatLng(90.0d, -180.0d)).include(new LatLng(90.0d, 180.0d));
        LatLngBounds latLngBoundsBuild = builder.build();
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource);
        groundOverlayOptions.anchor(0.5f, 0.5f);
        groundOverlayOptions.zIndex(21.0f);
        groundOverlayOptions.positionFromBounds(getBoundsByTarget(1, gPSPoint));
        groundOverlayOptions.image(bitmapDescriptorFromBitmap);
        GroundOverlay groundOverlayAddGroundOverlay = this.a.addGroundOverlay(groundOverlayOptions);
        this.i = groundOverlayAddGroundOverlay;
        groundOverlayAddGroundOverlay.setPositionFromBounds(latLngBoundsBuild);
        bitmapDecodeResource.recycle();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public /* bridge */ /* synthetic */ Polyline addDottedPolyline(List list, RouteLineInfo routeLineInfo) {
        return addDottedPolyline((List<GPSPoint>) list, routeLineInfo);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addLineMarkerPoint(List<GPSPoint> list, List<View> list2, List<Boolean> list3, List<Boolean> list4) {
        MarkerOptions markerOptionsI;
        int i = 0;
        if (list == null || list2 == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter addLineMarkerPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        if (!this.B) {
            while (i < list.size()) {
                MarkerOptions markerOptionsI2 = i(list.get(i), 4, list2.get(i));
                if (markerOptionsI2 == null) {
                    return;
                }
                Marker markerAddMarker = this.a.addMarker(markerOptionsI2);
                markerAddMarker.setAnchor(0.5f, 0.8f);
                this.C.add(markerAddMarker);
                i++;
            }
            this.B = true;
            return;
        }
        while (i < list.size() && (markerOptionsI = i(list.get(i), 4, list2.get(i))) != null) {
            if (list3.get(i).booleanValue()) {
                this.C.get(i).remove();
                Marker markerAddMarker2 = this.a.addMarker(markerOptionsI);
                markerAddMarker2.setAnchor(0.5f, 0.8f);
                this.C.set(i, markerAddMarker2);
                if (list4.get(i).booleanValue()) {
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    moveRouteToCenter(list.get(i));
                }
            }
            i++;
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addMarked(List<GPSPoint> list) {
        for (GPSPoint gPSPoint : list) {
            Marker markerE = e(gPSPoint, String.valueOf(gPSPoint.getIndex() + 1));
            if (markerE != null) {
                markerE.setVisible(false);
                this.H.add(markerE);
            }
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addMaskOverlay(boolean z) {
        if (this.F == null) {
            this.F = this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, -179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, -179.0d)).fillColor(-7829368).strokeWidth(0.0f).zIndex(22.0f));
        }
        if (this.E == null) {
            this.E = this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, 179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, 179.0d)).fillColor(-7829368).strokeWidth(0.0f).zIndex(22.0f));
        }
        this.E.setVisible(z);
        this.F.setVisible(z);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addRoutePolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.size() < 2) {
            return;
        }
        List<LatLng> listG = g(list, true, false);
        if (!this.z) {
            this.a.addPolyline(k(false, false, routeLineInfo.mLineColor, listG).width(this.D));
            return;
        }
        for (int i = 0; i < listG.size() - 1; i++) {
            int i2 = i % 10;
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                this.a.addPolyline(j(false, false, routeLineInfo.mLineColor).add(listG.get(i), listG.get(i + 1)).width(this.D));
            }
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addWhiteOverLayer(int i, GPSPoint gPSPoint) {
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void clearMap() {
        this.a.clear();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void clearPolylines() {
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void clearRouteTracker() {
        Iterator<GroundOverlay> it2 = this.k.iterator();
        if (it2.hasNext()) {
            this.s.clear();
            while (it2.hasNext()) {
                it2.next().remove();
            }
            this.k.clear();
            return;
        }
        this.k.clear();
        Iterator<Marker> it3 = this.s.iterator();
        while (it3.hasNext()) {
            it3.next().remove();
        }
        this.s.clear();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void destroy() {
        List<GroundOverlay> list = this.k;
        if (list != null) {
            list.clear();
        }
        RouteLineSM routeLineSM = this.o;
        if (routeLineSM != null) {
            routeLineSM.destroy();
        }
        Polyline polyline = this.e;
        if (polyline != null) {
            polyline.remove();
            this.e = null;
        }
        List<Marker> list2 = this.s;
        if (list2 != null) {
            list2.clear();
        }
        List<Marker> list3 = this.C;
        if (list3 != null) {
            list3.clear();
        }
        AMap aMap = this.a;
        if (aMap != null) {
            aMap.clear();
        }
        this.x = true;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void drawHeatmap(List<HeatmapData> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return;
        }
        if (this.y == null) {
            this.y = new HashMap();
        }
        this.y.clear();
        for (int i = 0; i < size; i++) {
            HeatmapData heatmapData = list.get(i);
            List<GPSPoint> pointList = heatmapData.getPointList();
            int size2 = pointList != null ? pointList.size() : 0;
            int type = heatmapData.getType();
            ArrayList arrayList = new ArrayList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList.add(this.w.convertToLatLng(pointList.get(i2)));
            }
            if (type == 100) {
                g(pointList, false, false);
            }
            HeatmapTileProvider.Builder builder = new HeatmapTileProvider.Builder();
            builder.data(arrayList);
            HeatmapTileProvider heatmapTileProviderBuild = builder.build();
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.tileProvider(heatmapTileProviderBuild);
            this.y.put(Integer.valueOf(type), this.a.addTileOverlay(tileOverlayOptions));
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void drawMarkerToPoint(GPSPoint gPSPoint, Bitmap bitmap) {
        WeakReference<Context> weakReference;
        LatLng latLngConvertToLatLng;
        if (gPSPoint == null || (weakReference = this.g) == null || weakReference.get() == null || (latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint)) == null) {
            HMLog.i(K, "drawMarkerToPoint: error Point!!", new Object[0]);
            return;
        }
        Marker markerAddMarker = this.a.addMarker(new MarkerOptions().position(latLngConvertToLatLng).icon(BitmapDescriptorFactory.fromBitmap(bitmap)));
        markerAddMarker.setAnchor(0.5f, 0.5f);
        markerAddMarker.setVisible(true);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void drawPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (routeLineInfo.mIsMarkStart) {
            setStartPoint(list.get(0));
        }
        this.o.processCachedPointList(list, routeLineInfo);
        if (routeLineInfo.mIsMarkEnd) {
            setEndPoint(list.get(size - 1));
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void hideOverLayer(int i) {
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void markGPSPoint(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter markGPSPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint);
        BitmapDescriptor bitmapDescriptorDefaultMarker = BitmapDescriptorFactory.defaultMarker(0.0f);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLngConvertToLatLng);
        markerOptions.draggable(true);
        markerOptions.icon(bitmapDescriptorDefaultMarker);
        markerOptions.setFlat(false);
        markerOptions.anchor(0.5f, 1.0f);
        this.s.add(this.a.addMarker(markerOptions));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void moveRouteToCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter moveRouteToCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint);
        AMap aMap = this.a;
        aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLngConvertToLatLng, aMap.getMaxZoomLevel() - 2.0f));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void moveToCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter moveToCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        this.a.animateCamera(CameraUpdateFactory.newLatLngZoom(this.w.convertToLatLng(gPSPoint), 16.0f));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void removeAllLineMarkerPoint() {
        Iterator<Marker> it2 = this.C.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.C.clear();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void resetOverlayer() {
        this.a.clear();
        this.j = null;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setDebugMode(int i) {
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setEndPoint(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter setEndPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        MarkerOptions markerOptionsI = i(gPSPoint, 3, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.j = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setHeatmapVisible(int i) {
        Map<Integer, TileOverlay> map = this.y;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, TileOverlay> entry : this.y.entrySet()) {
            if (entry.getKey().intValue() == i) {
                entry.getValue().setVisible(true);
            } else {
                entry.getValue().setVisible(false);
            }
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setLineWidth(float f) {
        this.n = f;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setLocation(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter setLocation", new Object[0]);
            throw new IllegalArgumentException();
        }
        h(gPSPoint);
        this.p.setPosition(this.w.convertToLatLng(gPSPoint));
        CameraPosition cameraPosition = this.a.getCameraPosition();
        if (cameraPosition != null) {
            this.a.setMyLocationRotateAngle(cameraPosition.bearing);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setMapViewType(int i) {
        if (i == 1) {
            this.a.setMapType(1);
        } else if (i != 2) {
            this.a.setMapType(1);
        } else {
            this.a.setMapType(2);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setMarked(boolean z) {
        Iterator<Marker> it2 = this.H.iterator();
        while (it2.hasNext()) {
            it2.next().setVisible(z);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setPausePoint(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter setPausePoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        MarkerOptions markerOptionsI = i(gPSPoint, 2, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.l = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
        this.m = gPSPoint;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setRouteTrackerVisibility(boolean z) {
        Iterator<GroundOverlay> it2 = this.k.iterator();
        if (it2.hasNext()) {
            while (it2.hasNext()) {
                try {
                    it2.next().setVisible(z);
                } catch (Exception e) {
                    HMLog.e("Run", e.getMessage(), new Object[0]);
                }
            }
            return;
        }
        Iterator<Marker> it3 = this.s.iterator();
        while (it3.hasNext()) {
            try {
                it3.next().setVisible(z);
            } catch (Exception e2) {
                HMLog.e("Run", e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setStartPoint(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter setStartPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        Marker marker = this.r;
        if (marker != null) {
            marker.setPosition(this.w.convertToLatLng(gPSPoint));
            return;
        }
        m(false);
        MarkerOptions markerOptionsI = i(gPSPoint, 1, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.r = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setTestLocation(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            return;
        }
        if (this.G == null) {
            PolylineOptions polylineOptions = new PolylineOptions();
            this.G = polylineOptions;
            polylineOptions.width(this.n / 2.0f).color(Color.argb(255, 255, 0, 0));
            this.G.setDottedLine(true);
        }
        this.G.zIndex(this.v + 1);
        this.G.add(this.w.convertToLatLng(gPSPoint));
        this.a.addPolyline(this.G);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setTrackISectionColors(SparseArray<Integer> sparseArray) {
        this.u = sparseArray;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
        this.c = new LatLngBounds(this.w.convertToLatLng(gPSPoint), this.w.convertToLatLng(gPSPoint2));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void startFollow() {
        this.I = false;
        GPSPoint gPSPoint = this.J;
        if (gPSPoint != null) {
            f(gPSPoint);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void stopFollow() {
        this.I = true;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void updateEndMarkerIcon(Bitmap bitmap) {
        Marker marker;
        if (this.x || (marker = this.j) == null) {
            return;
        }
        marker.setIcon(BitmapDescriptorFactory.fromBitmap(bitmap));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void updatePolyline(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo) {
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void updatePolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        int size;
        if (list != null && (size = list.size()) >= 1) {
            GPSPoint gPSPoint = list.get(0);
            if (gPSPoint.getIndex() == 0) {
                setStartPoint(gPSPoint);
            }
            r(list.get(size - 1));
            this.o.processCachedPointList(list, routeLineInfo);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void updateRoutePolyline(List<GPSPoint> list, int i, boolean z, RouteLineInfo routeLineInfo) {
        if (list != null && list.size() >= 1) {
            this.o.setIsRoute(true);
            this.z = z;
            if (z) {
                this.o.processCachedPointList(list, routeLineInfo);
                return;
            }
            if (!this.A) {
                this.o.clear();
                this.o.processCachedPointList(list.subList(0, i + 1), routeLineInfo);
                this.A = true;
            }
            this.o.processCachedPointList(list.subList(i, i + 1), routeLineInfo);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomBy(int i) {
        CameraPosition cameraPosition = this.a.getCameraPosition();
        if (cameraPosition == null) {
            return;
        }
        this.a.animateCamera(CameraUpdateFactory.newLatLngZoom(cameraPosition.target, cameraPosition.zoom + i));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomToShowEntireTrack() {
        zoomToShowEntireTrack(null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public Polyline addDottedPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.size() < 2) {
            return null;
        }
        return this.a.addPolyline(k(true, false, 0, g(list, true, false)));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public /* bridge */ /* synthetic */ Polyline addPolyline(List list, RouteLineInfo routeLineInfo) {
        return addPolyline((List<GPSPoint>) list, routeLineInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public LatLngBounds getBoundsByTarget(int i, GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GaodeMapPainter getBoundsByTarget", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = this.w.convertToLatLng(gPSPoint);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(latLngConvertToLatLng.latitude - 1.0d, latLngConvertToLatLng.longitude - 1.0d));
        builder.include(new LatLng(latLngConvertToLatLng.latitude - 1.0d, latLngConvertToLatLng.longitude + 1.0d));
        builder.include(new LatLng(latLngConvertToLatLng.latitude + 1.0d, latLngConvertToLatLng.longitude - 1.0d));
        builder.include(new LatLng(latLngConvertToLatLng.latitude + 1.0d, latLngConvertToLatLng.longitude + 1.0d));
        return builder.build();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomToShowEntireTrack(IMapAnimationCallback iMapAnimationCallback) {
        LatLngBounds.Builder builder = this.b;
        if (builder == null) {
            return;
        }
        try {
            t(builder.build(), iMapAnimationCallback);
        } catch (Exception e) {
            HMLog.e("Run", e.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public Polyline addPolyline(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo) {
        if (gPSPoint == null || gPSPoint2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(gPSPoint);
        arrayList.add(gPSPoint2);
        return addPolyline((List<GPSPoint>) arrayList, routeLineInfo);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomToShowEntireTrack(List<GPSPoint> list, IMapAnimationCallback iMapAnimationCallback) {
        if (list == null) {
            return;
        }
        HMLog.i(K, "zoomToShowEntireTrack points start:" + list.size(), new Object[0]);
        try {
            LatLngBounds latLngBounds = this.c;
            if (latLngBounds != null) {
                t(latLngBounds, iMapAnimationCallback);
            } else {
                t(this.b.build(), iMapAnimationCallback);
            }
            HMLog.i(K, "zoomToShowEntireTrack points end", new Object[0]);
        } catch (Exception e) {
            HMLog.i(K, e.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public Polyline addPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.size() < 2) {
            return null;
        }
        boolean z = !routeLineInfo.mIsRevised && routeLineInfo.mIsMarkEnd && routeLineInfo.mIsMarkStart && routeLineInfo.mLineColor == 0 && TrackColorGradient.isMinMaxSpeedValid();
        List<LatLng> listG = g(list, false, z);
        SparseArray<Integer> sparseArray = this.u;
        if (sparseArray != null && routeLineInfo.mType == 0) {
            int size = sparseArray.size();
            int i = 0;
            while (i < size) {
                int iKeyAt = this.u.keyAt(i);
                this.a.addPolyline(k(false, false, this.u.get(iKeyAt).intValue(), listG.subList(iKeyAt, i == size + (-1) ? listG.size() : this.u.keyAt(i + 1))));
                i++;
            }
            return null;
        }
        return this.a.addPolyline(k(false, z, routeLineInfo.mLineColor, listG));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(List<GPSPoint> list) {
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, -179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, -179.0d)).fillColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR).strokeWidth(0.0f).zIndex(21.0f));
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, 179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, 179.0d)).fillColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR).strokeWidth(0.0f).zIndex(21.0f));
        this.a.setMapTextZIndex(11);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(int i) {
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, -179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, -179.0d)).fillColor(i).strokeWidth(0.0f).zIndex(21.0f));
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, 179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, 179.0d)).fillColor(i).strokeWidth(0.0f).zIndex(21.0f));
        this.a.setMapTextZIndex(11);
    }
}
