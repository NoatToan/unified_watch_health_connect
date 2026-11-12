package com.huami.moving.maps.google;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import com.huami.chart.template.ColorTemplate;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.R;
import com.huami.moving.maps.IGPSPainter;
import com.huami.moving.maps.IMapAnimationCallback;
import com.huami.moving.maps.RouteLineSM;
import com.huami.moving.model.HeatmapData;
import com.huami.moving.ui.utils.BitmapUtils;
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
public class GoogleMapPainter implements IGPSPainter<Polyline, LatLngBounds> {
    private static final String K = "GoogleMapPainter";
    private static final float L = 1.0f;
    private static final float M = 16.0f;
    private static final int N = 40;
    private static final int O = 21;
    private List<Marker> C;
    private Polygon E;
    private Polygon F;
    private GoogleMap a;
    private LatLngBounds.Builder b;
    private LatLngBounds c;
    private Polyline d;
    private WeakReference<Context> f;
    private List<Marker> k;
    private List<GroundOverlay> l;
    private RouteLineSM p;
    private List<Marker> s;
    private Map<Integer, TileOverlay> y;
    private CameraPosition.Builder e = null;
    private MarkerOptions g = null;
    private Marker h = null;
    private GroundOverlay i = null;
    private Marker j = null;
    private Marker m = null;
    private GPSPoint n = null;
    private float o = 12.0f;
    private float q = 0.0f;
    private Marker r = null;
    private CameraPosition.Builder t = null;
    private SparseArray<Integer> u = null;
    private int v = 40;
    private int w = 1;
    private boolean x = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = false;
    private float D = 7.0f;
    private boolean G = false;
    private GPSPoint H = null;
    private boolean I = false;
    private List<Marker> J = new ArrayList();

    public class a implements GoogleMap.CancelableCallback {
        public final /* synthetic */ IMapAnimationCallback a;

        public a(IMapAnimationCallback iMapAnimationCallback) {
            this.a = iMapAnimationCallback;
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onCancel() {
            this.a.onCancel();
        }

        @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
        public void onFinish() {
            this.a.onFinish();
        }
    }

    public final class b implements RouteLineSM.LineSMObserver {
        private b() {
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawDottedLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            GoogleMapPainter.this.r();
            GoogleMapPainter.this.addDottedPolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawMarker(GPSPoint gPSPoint, int i) {
            if (i != 2) {
                return;
            }
            GoogleMapPainter.this.setPausePoint(gPSPoint);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawRouteLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            GoogleMapPainter.this.addRoutePolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawStableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
            if (routeLineInfo.mType != 0) {
                return;
            }
            GoogleMapPainter.this.r();
            GoogleMapPainter.this.addPolyline(list, routeLineInfo);
        }

        @Override // com.huami.moving.maps.RouteLineSM.LineSMObserver
        public void onDrawUnstableLine(List<GPSPoint> list, RouteLineInfo routeLineInfo, boolean z) {
            if (routeLineInfo.mType != 1) {
                return;
            }
            if (z) {
                GoogleMapPainter.this.r();
                GoogleMapPainter googleMapPainter = GoogleMapPainter.this;
                googleMapPainter.d = googleMapPainter.addPolyline(list, routeLineInfo);
            } else if (GoogleMapPainter.this.d != null) {
                GoogleMapPainter.this.d.setPoints(GoogleMapUtil.convertToLatLngFromGPSPoint(list));
            } else {
                GoogleMapPainter googleMapPainter2 = GoogleMapPainter.this;
                googleMapPainter2.d = googleMapPainter2.addPolyline(list, routeLineInfo);
            }
        }
    }

    public GoogleMapPainter(Context context, GoogleMap googleMap) {
        this.a = null;
        this.b = null;
        this.d = null;
        this.f = null;
        this.k = null;
        this.l = null;
        this.p = null;
        this.s = null;
        this.C = null;
        this.a = googleMap;
        this.l = new ArrayList();
        this.s = new ArrayList();
        this.k = new ArrayList();
        this.f = new WeakReference<>(context);
        this.b = new LatLngBounds.Builder();
        this.o *= 1.0f;
        this.p = new RouteLineSM(new b());
        this.d = null;
        q();
        p();
        this.C = new ArrayList();
    }

    private Marker d(GPSPoint gPSPoint, String str) {
        WeakReference<Context> weakReference;
        Context context;
        LatLng latLngConvertToLatLng;
        if (gPSPoint == null || (weakReference = this.f) == null || (context = weakReference.get()) == null || (latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint)) == null) {
            return null;
        }
        Marker markerAddMarker = this.a.addMarker(new MarkerOptions().position(latLngConvertToLatLng).icon(BitmapDescriptorFactory.fromBitmap(BitmapUtils.createOvalBitmapWithText(str, context.getResources().getDisplayMetrics().density))));
        markerAddMarker.setAnchor(0.5f, 0.5f);
        return markerAddMarker;
    }

    private void e(GPSPoint gPSPoint) {
        float f = this.a.getCameraPosition().zoom;
        float f2 = this.q;
        if (f < f2) {
            this.e.zoom(f2);
        } else {
            this.e.zoom(this.a.getCameraPosition().zoom);
        }
        this.a.animateCamera(CameraUpdateFactory.newCameraPosition(this.e.target(GoogleMapUtil.convertToLatLng(gPSPoint)).build()));
    }

    private List<LatLng> f(List<GPSPoint> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (GPSPoint gPSPoint : list) {
                if (gPSPoint != null) {
                    LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint);
                    this.b.include(latLngConvertToLatLng);
                    arrayList.add(latLngConvertToLatLng);
                }
            }
        }
        return arrayList;
    }

    private boolean g(GPSPoint gPSPoint) {
        if (this.I) {
            return false;
        }
        this.a.getUiSettings().setMyLocationButtonEnabled(false);
        this.a.animateCamera(CameraUpdateFactory.newCameraPosition(this.t.target(GoogleMapUtil.convertToLatLng(gPSPoint)).build()));
        this.I = true;
        return true;
    }

    private void h(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list != null) {
            int i = 2;
            if (list.size() != 2) {
                return;
            }
            int i2 = 0;
            float fDistance = list.get(1).distance(list.get(0));
            double d = list.get(1).mLatitude - list.get(0).mLatitude;
            double d2 = list.get(1).mLongitude - list.get(0).mLongitude;
            int i3 = (int) (fDistance / 200.0f);
            if (i3 >= 2) {
                i = i3 > 10 ? 10 : i3;
            }
            int i4 = 0;
            while (i4 < i) {
                GPSPoint gPSPoint = new GPSPoint();
                GPSPoint gPSPoint2 = new GPSPoint();
                double d3 = list.get(i2).mLatitude;
                double d4 = i4;
                double d5 = 0.25d + d4;
                double d6 = d;
                double d7 = i;
                gPSPoint.mLatitude = d3 + ((d5 * d) / d7);
                gPSPoint.mLongitude = list.get(0).mLongitude + ((d5 * d2) / d7);
                double d8 = d4 + 0.75d;
                gPSPoint2.mLatitude = list.get(0).mLatitude + ((d8 * d6) / d7);
                gPSPoint2.mLongitude = list.get(0).mLongitude + ((d8 * d2) / d7);
                gPSPoint.setVersion(list.get(0).getVersion());
                gPSPoint2.setVersion(list.get(0).getVersion());
                ArrayList arrayList = new ArrayList();
                LatLng latLng = new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
                LatLng latLng2 = new LatLng(gPSPoint2.mLatitude, gPSPoint2.mLongitude);
                arrayList.add(latLng);
                arrayList.add(latLng2);
                this.a.addPolyline(k(arrayList, routeLineInfo));
                i4++;
                d = d6;
                i2 = 0;
            }
        }
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
                    HMLog.i("IllegalArgumentException", "GoogleMapPainter createMarkerOptions", new Object[0]);
                    throw new IllegalArgumentException();
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.buildDrawingCache();
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromBitmap(view.getDrawingCache());
            }
            MarkerOptions markerOptions = new MarkerOptions();
            if (gPSPoint != null) {
                markerOptions.position(GoogleMapUtil.convertToLatLng(gPSPoint));
            }
            markerOptions.icon(bitmapDescriptorFromResource);
            markerOptions.flat(false);
            return markerOptions;
        } catch (Exception e) {
            HMLog.i("Run", e.getMessage(), new Object[0]);
            return null;
        }
    }

    private PolylineOptions j(int i) {
        PolylineOptions polylineOptions = new PolylineOptions();
        int i2 = this.v;
        this.v = i2 + 1;
        polylineOptions.zIndex(i2);
        polylineOptions.width(this.o);
        if (i == 0) {
            i = n();
        }
        polylineOptions.color(i);
        return polylineOptions;
    }

    private PolylineOptions k(List<LatLng> list, RouteLineInfo routeLineInfo) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(list);
        int i = this.v;
        this.v = i + 1;
        polylineOptions.zIndex(i);
        polylineOptions.width(this.o);
        int iN = routeLineInfo.mLineColor;
        if (iN == 0) {
            iN = n();
        }
        polylineOptions.color(iN);
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
        if (ContextCompat.checkSelfPermission(this.f.get(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.f.get(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.a.setMyLocationEnabled(z);
        }
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
        this.e = new CameraPosition.Builder().bearing(0.0f).tilt(0.0f);
    }

    private void q() {
        this.g = i(null, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Polyline polyline = this.d;
        if (polyline == null) {
            return;
        }
        polyline.remove();
        this.d = null;
    }

    private void s(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            return;
        }
        this.H = gPSPoint;
        Marker marker = this.h;
        if (marker != null) {
            marker.remove();
            this.h = null;
        }
        this.g.position(GoogleMapUtil.convertToLatLng(gPSPoint));
        Marker markerAddMarker = this.a.addMarker(this.g);
        this.h = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
        if (this.G) {
            return;
        }
        e(gPSPoint);
    }

    private void t(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter updatePausePointIfNeeded", new Object[0]);
            throw new IllegalArgumentException();
        }
        GPSPoint gPSPoint2 = this.n;
        if (gPSPoint2 == null || gPSPoint2.getIndex() != gPSPoint.getIndex()) {
            return;
        }
        Marker marker = this.m;
        if (marker != null) {
            marker.setPosition(GoogleMapUtil.convertToLatLng(gPSPoint));
            return;
        }
        MarkerOptions markerOptionsI = i(gPSPoint, 2, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.m = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
        this.n = gPSPoint;
    }

    private void u(LatLngBounds latLngBounds, IMapAnimationCallback iMapAnimationCallback) {
        this.a.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, (int) ViewUtils.dp2px(this.f.get(), 85.0f)), iMapAnimationCallback != null ? new a(iMapAnimationCallback) : null);
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(GPSPoint gPSPoint) {
        WeakReference<Context> weakReference;
        Context context;
        if (gPSPoint == null || (weakReference = this.f) == null || (context = weakReference.get()) == null) {
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
            HMLog.i("IllegalArgumentException", "GoogleMapPainter addLineMarkerPoint", new Object[0]);
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
            Marker markerD = d(gPSPoint, String.valueOf(gPSPoint.getIndex() + 1));
            if (markerD != null) {
                markerD.setVisible(false);
                this.J.add(markerD);
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
        if (z) {
            this.a.setMapType(0);
        } else {
            setMapViewType(this.w);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addRoutePolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.size() < 2) {
            return;
        }
        List<LatLng> listF = f(list);
        if (!this.z) {
            this.a.addPolyline(j(routeLineInfo.mLineColor).addAll(listF).width(this.D));
            return;
        }
        for (int i = 0; i < listF.size() - 1; i++) {
            int i2 = i % 10;
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                this.a.addPolyline(j(routeLineInfo.mLineColor).add(listF.get(i), listF.get(i + 1)).width(this.D));
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
        Iterator<GroundOverlay> it2 = this.l.iterator();
        if (it2.hasNext()) {
            this.s.clear();
            while (it2.hasNext()) {
                it2.next().remove();
            }
            this.l.clear();
            return;
        }
        this.l.clear();
        Iterator<Marker> it3 = this.s.iterator();
        while (it3.hasNext()) {
            it3.next().remove();
        }
        this.s.clear();
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void destroy() {
        List<GroundOverlay> list = this.l;
        if (list != null) {
            list.clear();
        }
        RouteLineSM routeLineSM = this.p;
        if (routeLineSM != null) {
            routeLineSM.destroy();
        }
        Polyline polyline = this.d;
        if (polyline != null) {
            polyline.remove();
            this.d = null;
        }
        List<Marker> list2 = this.s;
        if (list2 != null) {
            list2.clear();
        }
        List<Marker> list3 = this.k;
        if (list3 != null) {
            list3.clear();
        }
        List<Marker> list4 = this.C;
        if (list4 != null) {
            list4.clear();
        }
        GoogleMap googleMap = this.a;
        if (googleMap != null) {
            googleMap.clear();
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
                arrayList.add(GoogleMapUtil.convertToLatLng(pointList.get(i2)));
            }
            if (type == 100) {
                f(pointList);
            }
            HeatmapTileProvider heatmapTileProviderBuild = new HeatmapTileProvider.Builder().data(arrayList).build();
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.tileProvider(heatmapTileProviderBuild);
            this.y.put(Integer.valueOf(type), this.a.addTileOverlay(tileOverlayOptions));
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void drawMarkerToPoint(GPSPoint gPSPoint, Bitmap bitmap) {
        WeakReference<Context> weakReference;
        LatLng latLngConvertToLatLng;
        if (gPSPoint == null || (weakReference = this.f) == null || weakReference.get() == null || (latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint)) == null) {
            HMLog.i(K, "drawMarkerToPoint: error Point!!", new Object[0]);
        } else {
            this.a.addMarker(new MarkerOptions().position(latLngConvertToLatLng).icon(BitmapDescriptorFactory.fromBitmap(bitmap))).setAnchor(0.5f, 0.5f);
        }
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
        this.p.processCachedPointList(list, routeLineInfo);
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
            HMLog.i("IllegalArgumentException", "GoogleMapPainter markGPSPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint);
        BitmapDescriptor bitmapDescriptorDefaultMarker = BitmapDescriptorFactory.defaultMarker(0.0f);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLngConvertToLatLng);
        markerOptions.draggable(true);
        markerOptions.icon(bitmapDescriptorDefaultMarker);
        markerOptions.flat(false);
        markerOptions.anchor(0.5f, 1.0f);
        this.s.add(this.a.addMarker(markerOptions));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void moveRouteToCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter moveToCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(new GPSPoint(gPSPoint.mLatitude, gPSPoint.mLongitude));
        GoogleMap googleMap = this.a;
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLngConvertToLatLng, googleMap.getMaxZoomLevel() - 2.0f));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void moveToCenter(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter moveToCenter", new Object[0]);
            throw new IllegalArgumentException();
        }
        this.a.animateCamera(CameraUpdateFactory.newLatLngZoom(GoogleMapUtil.convertToLatLng(new GPSPoint(gPSPoint.mLatitude, gPSPoint.mLongitude)), 16.0f));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void removeAllLineMarkerPoint() {
        Iterator<Marker> it2 = this.k.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.k.clear();
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
            HMLog.i("IllegalArgumentException", "GoogleMapPainter setEndPoint", new Object[0]);
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
        this.o = f;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setLocation(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            g(gPSPoint);
        } else {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter setLocation", new Object[0]);
            throw new IllegalArgumentException();
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setMapViewType(int i) {
        if (i == 1 || i != 2) {
            this.a.setMapType(1);
        } else {
            this.a.setMapType(2);
        }
        this.w = i;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setMarked(boolean z) {
        Iterator<Marker> it2 = this.J.iterator();
        while (it2.hasNext()) {
            it2.next().setVisible(z);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setPausePoint(GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter setPausePoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        MarkerOptions markerOptionsI = i(gPSPoint, 2, null);
        if (markerOptionsI == null) {
            return;
        }
        Marker markerAddMarker = this.a.addMarker(markerOptionsI);
        this.m = markerAddMarker;
        markerAddMarker.setAnchor(0.5f, 0.5f);
        this.n = gPSPoint;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setRouteTrackerVisibility(boolean z) {
        Iterator<GroundOverlay> it2 = this.l.iterator();
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
            HMLog.i("IllegalArgumentException", "GoogleMapPainter setStartPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        Marker marker = this.r;
        if (marker != null) {
            marker.setPosition(GoogleMapUtil.convertToLatLng(gPSPoint));
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
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setTrackISectionColors(SparseArray<Integer> sparseArray) {
        this.u = sparseArray;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
        this.c = new LatLngBounds(GoogleMapUtil.convertToLatLng(gPSPoint), GoogleMapUtil.convertToLatLng(gPSPoint2));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void startFollow() {
        this.G = false;
        GPSPoint gPSPoint = this.H;
        if (gPSPoint != null) {
            e(gPSPoint);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void stopFollow() {
        this.G = true;
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
            s(list.get(size - 1));
            this.p.processCachedPointList(list, routeLineInfo);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void updateRoutePolyline(List<GPSPoint> list, int i, boolean z, RouteLineInfo routeLineInfo) {
        if (list != null && list.size() >= 1) {
            this.p.setIsRoute(true);
            this.z = z;
            if (z) {
                this.p.processCachedPointList(list, routeLineInfo);
                return;
            }
            if (!this.A) {
                this.p.clear();
                this.p.processCachedPointList(list.subList(0, i + 1), routeLineInfo);
                this.A = true;
            }
            this.p.processCachedPointList(list.subList(i, i + 1), routeLineInfo);
        }
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomBy(int i) {
        this.a.animateCamera(CameraUpdateFactory.newLatLngZoom(this.a.getCameraPosition().target, this.a.getCameraPosition().zoom + i));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void zoomToShowEntireTrack() {
        zoomToShowEntireTrack(null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public Polyline addDottedPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list != null && list.size() >= 2) {
            f(list);
        }
        return null;
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public /* bridge */ /* synthetic */ Polyline addPolyline(List list, RouteLineInfo routeLineInfo) {
        return addPolyline((List<GPSPoint>) list, routeLineInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.moving.maps.IGPSPainter
    public LatLngBounds getBoundsByTarget(int i, GPSPoint gPSPoint) {
        if (gPSPoint == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapPainter getBoundsByTarget", new Object[0]);
            throw new IllegalArgumentException();
        }
        LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint);
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
            u(builder.build(), iMapAnimationCallback);
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
                u(latLngBounds, iMapAnimationCallback);
            } else {
                if (this.b == null) {
                    f(list);
                }
                LatLngBounds.Builder builder = this.b;
                if (builder != null) {
                    u(builder.build(), iMapAnimationCallback);
                }
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
        List<LatLng> listF = f(list);
        SparseArray<Integer> sparseArray = this.u;
        if (sparseArray != null) {
            int size = sparseArray.size();
            int i = 0;
            while (i < size) {
                int iKeyAt = this.u.keyAt(i);
                int size2 = i == size + (-1) ? listF.size() : this.u.keyAt(i + 1);
                int iIntValue = this.u.get(iKeyAt).intValue();
                List<LatLng> listSubList = listF.subList(iKeyAt, size2);
                routeLineInfo.mLineColor = iIntValue;
                this.a.addPolyline(k(listSubList, routeLineInfo));
                i++;
            }
            return null;
        }
        return this.a.addPolyline(k(listF, routeLineInfo));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(List<GPSPoint> list) {
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, -179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, -179.0d)).fillColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR).strokeWidth(0.0f).zIndex(21.0f));
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, 179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, 179.0d)).fillColor(ColorTemplate.INTERACTIVE_LINE_DEFAULT_COLOR).strokeWidth(0.0f).zIndex(21.0f));
    }

    @Override // com.huami.moving.maps.IGPSPainter
    public void addDarkOverlay(int i) {
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, -179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, -179.0d)).fillColor(i).strokeWidth(0.0f).zIndex(21.0f));
        this.a.addPolygon(new PolygonOptions().add(new LatLng(89.0d, 179.0d)).add(new LatLng(89.0d, 0.0d)).add(new LatLng(-89.0d, 0.0d)).add(new LatLng(-89.0d, 179.0d)).fillColor(i).strokeWidth(0.0f).zIndex(21.0f));
    }
}
