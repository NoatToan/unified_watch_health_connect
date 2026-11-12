package com.huami.moving.maps.gaode;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.R;
import com.huami.moving.maps.IGPSPainter;
import com.huami.moving.maps.IGPSSolution;
import com.huami.moving.maps.IMapAnimationCallback;
import com.huami.moving.maps.IMapLoadedCallback;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.maps.track.OnChangeListener;
import com.huami.moving.model.HeatmapData;
import com.huami.moving.ui.utils.AnimateBoundsUtils;
import com.huami.moving.ui.utils.AnimateUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class GaodeGPSSolution implements IGPSSolution {
    private static final String C = "GaodeGPSSolution";
    private static final int D = 1;
    private LocationSource.OnLocationChangedListener e;
    private MapView g;
    private AMap h;
    private MyLocationStyle i;
    private GaodeMapUtil j;
    private Polyline q;
    private PathSmoothTool t;
    private Marker u;
    private TraceRePlay v;
    private ExecutorService w;
    private Context x;
    private IGPSPainter a = null;
    private final GPSPoint b = null;
    private boolean c = false;
    private CameraPosition.Builder d = null;
    private OnChangeListener f = null;
    private final float k = 16.7f;
    private final long l = 1000;
    private final float m = 45.0f;
    private final float n = 0.0f;
    private final float o = 10000.0f;
    private final long p = 1000;
    private Boolean r = Boolean.FALSE;
    private Handler s = new Handler(Looper.getMainLooper());
    public float y = 0.0f;
    public float z = 0.0f;
    public int A = 0;
    public boolean B = false;

    public class a implements AnimateUtils.CancelableCallback {
        public final /* synthetic */ Boolean a;
        public final /* synthetic */ SparseArray b;
        public final /* synthetic */ List c;
        public final /* synthetic */ List d;
        public final /* synthetic */ RouteLineInfo e;
        public final /* synthetic */ GPSSportTrackLoader.TrackPlayCallback f;
        public final /* synthetic */ int g;
        public final /* synthetic */ float h;
        public final /* synthetic */ int i;

        public a(Boolean bool, SparseArray sparseArray, List list, List list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i, float f, int i2) {
            this.a = bool;
            this.b = sparseArray;
            this.c = list;
            this.d = list2;
            this.e = routeLineInfo;
            this.f = trackPlayCallback;
            this.g = i;
            this.h = f;
            this.i = i2;
        }

        @Override // com.huami.moving.ui.utils.AnimateUtils.CancelableCallback
        public void onUpdateFinish() {
            GaodeGPSSolution.this.u(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    public class b implements TraceRePlay.TraceRePlayListener {
        public final /* synthetic */ Marker a;
        public final /* synthetic */ List b;
        public final /* synthetic */ GPSSportTrackLoader.TrackPlayCallback c;
        public final /* synthetic */ RouteLineInfo d;
        public final /* synthetic */ List e;

        public b(Marker marker, List list, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, RouteLineInfo routeLineInfo, List list2) {
            this.a = marker;
            this.b = list;
            this.c = trackPlayCallback;
            this.d = routeLineInfo;
            this.e = list2;
        }

        @Override // com.huami.moving.maps.gaode.TraceRePlay.TraceRePlayListener
        public void onComplexTrackUpdateMark(LatLng latLng, int i) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            View viewInflate = View.inflate(GaodeGPSSolution.this.x, R.layout.view_mark_complex, null);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.mark_rl);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            if (i == 1001) {
                relativeLayout.setBackgroundResource(R.drawable.shape_mark_run);
                imageView.setImageResource(R.drawable.mark_run);
            } else if (i == 1009) {
                relativeLayout.setBackgroundResource(R.drawable.shape_mark_swing);
                imageView.setImageResource(R.drawable.mark_bike);
            } else if (i == 1015) {
                relativeLayout.setBackgroundResource(R.drawable.shape_mark_swing);
                imageView.setImageResource(R.drawable.mark_swim);
            }
            markerOptions.icon(BitmapDescriptorFactory.fromView(viewInflate));
            Marker markerAddMarker = GaodeGPSSolution.this.h.addMarker(markerOptions);
            markerAddMarker.setAnchor(0.5f, 1.0f);
            this.e.add(markerAddMarker);
        }

        @Override // com.huami.moving.maps.gaode.TraceRePlay.TraceRePlayListener
        public void onTraceUpdateFinish() {
            this.a.remove();
            if (this.d.mIsMarkEnd) {
                GaodeGPSSolution gaodeGPSSolution = GaodeGPSSolution.this;
                List list = this.b;
                MarkerOptions markerOptionsM = gaodeGPSSolution.m((LatLng) list.get(list.size() - 1), 3);
                if (markerOptionsM == null) {
                    return;
                } else {
                    GaodeGPSSolution.this.h.addMarker(markerOptionsM).setAnchor(0.5f, 0.5f);
                }
            }
            GaodeGPSSolution.this.o(this.b, this.c);
        }

        @Override // com.huami.moving.maps.gaode.TraceRePlay.TraceRePlayListener
        public void onTraceUpdating(LatLng latLng, int i) {
            if (this.a != null) {
                List listSubList = this.b.subList(0, i);
                if (this.b.size() == i + 1) {
                    listSubList = this.b;
                }
                HMLog.i(GaodeGPSSolution.C, "list::" + this.b.size() + "listArray.size() ::" + listSubList.size() + "        postion::" + i, new Object[0]);
                if (listSubList.size() > 0) {
                    this.a.setPosition((LatLng) listSubList.get(listSubList.size() - 1));
                }
                GaodeGPSSolution.this.h.addPolyline(GaodeGPSSolution.this.n(false, Color.parseColor("#33C0A0"), listSubList));
                if ((i - GaodeGPSSolution.this.A) + i < this.b.size() - 1) {
                    latLng = (LatLng) this.b.get((i - GaodeGPSSolution.this.A) + i);
                }
                GaodeGPSSolution gaodeGPSSolution = GaodeGPSSolution.this;
                gaodeGPSSolution.A = i;
                HMLog.i(GaodeGPSSolution.C, Float.valueOf(gaodeGPSSolution.y), new Object[0]);
                GaodeGPSSolution gaodeGPSSolution2 = GaodeGPSSolution.this;
                if (!gaodeGPSSolution2.B) {
                    gaodeGPSSolution2.h.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(latLng, GaodeGPSSolution.this.h.getCameraPosition().zoom, 45.0f, 0.0f)));
                }
                this.c.onPlayProgress(i / ((this.b.size() - 1) * 1.0f));
            }
        }

        @Override // com.huami.moving.maps.gaode.TraceRePlay.TraceRePlayListener
        public void onTrackUpdateMark(LatLng latLng, int i) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            View viewInflate = View.inflate(GaodeGPSSolution.this.x, R.layout.view_mark_distance, null);
            ((TextView) viewInflate.findViewById(R.id.text)).setText(String.valueOf(i));
            markerOptions.icon(BitmapDescriptorFactory.fromView(viewInflate));
            Marker markerAddMarker = GaodeGPSSolution.this.h.addMarker(markerOptions);
            markerAddMarker.setAnchor(0.5f, 1.0f);
            this.e.add(markerAddMarker);
        }

        @Override // com.huami.moving.maps.gaode.TraceRePlay.TraceRePlayListener
        public void remvoeAllMake() {
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                ((Marker) it2.next()).remove();
            }
        }
    }

    public class c implements AnimateBoundsUtils.CancelableCallback {
        public final /* synthetic */ GPSSportTrackLoader.TrackPlayCallback a;

        public c(GPSSportTrackLoader.TrackPlayCallback trackPlayCallback) {
            this.a = trackPlayCallback;
        }

        @Override // com.huami.moving.ui.utils.AnimateBoundsUtils.CancelableCallback
        public void onUpdateFinish() {
            GPSSportTrackLoader.TrackPlayCallback trackPlayCallback = this.a;
            if (trackPlayCallback != null) {
                trackPlayCallback.onPlayFinish();
            }
        }
    }

    public class d implements AMap.OnMapLoadedListener {
        public final /* synthetic */ IMapLoadedCallback a;

        public d(IMapLoadedCallback iMapLoadedCallback) {
            this.a = iMapLoadedCallback;
        }

        @Override // com.amap.api.maps.AMap.OnMapLoadedListener
        public void onMapLoaded() {
            GaodeGPSSolution.this.h.showMapText(false);
            GaodeGPSSolution.this.h.setMapType(2);
            IMapLoadedCallback iMapLoadedCallback = this.a;
            if (iMapLoadedCallback != null) {
                iMapLoadedCallback.afterMapLoaded();
            }
        }
    }

    public class e implements AMap.OnMapLoadedListener {
        public final /* synthetic */ IMapLoadedCallback a;

        public e(IMapLoadedCallback iMapLoadedCallback) {
            this.a = iMapLoadedCallback;
        }

        @Override // com.amap.api.maps.AMap.OnMapLoadedListener
        public void onMapLoaded() {
            IMapLoadedCallback iMapLoadedCallback = this.a;
            if (iMapLoadedCallback != null) {
                iMapLoadedCallback.afterMapLoaded();
            }
        }
    }

    public class f implements AMap.OnMapTouchListener {
        public f() {
        }

        @Override // com.amap.api.maps.AMap.OnMapTouchListener
        public void onTouch(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return;
                        }
                    }
                }
                Log.i(GaodeGPSSolution.C, "ACTION_UP    ACTION_CANCEL");
                if (GaodeGPSSolution.this.f != null) {
                    GaodeGPSSolution.this.f.onChangeEnd();
                    return;
                }
                return;
            }
            Log.i(GaodeGPSSolution.C, "ACTION_DOWN");
            if (GaodeGPSSolution.this.f != null) {
                GaodeGPSSolution.this.f.onChangeStart();
            }
        }
    }

    public class g implements AMap.OnMapLoadedListener {
        public final /* synthetic */ IMapLoadedCallback a;

        public g(IMapLoadedCallback iMapLoadedCallback) {
            this.a = iMapLoadedCallback;
        }

        @Override // com.amap.api.maps.AMap.OnMapLoadedListener
        public void onMapLoaded() {
            IMapLoadedCallback iMapLoadedCallback = this.a;
            if (iMapLoadedCallback != null) {
                iMapLoadedCallback.afterMapLoaded();
            }
        }
    }

    public class h implements AMap.OnMyLocationChangeListener {
        public h() {
        }

        @Override // com.amap.api.maps.AMap.OnMyLocationChangeListener
        public void onMyLocationChange(Location location) {
            HMLog.i(GaodeGPSSolution.C, "onMyLocationChange", new Object[0]);
            if (GaodeGPSSolution.this.c) {
                return;
            }
            GaodeGPSSolution.this.h.moveCamera(CameraUpdateFactory.newCameraPosition(GaodeGPSSolution.this.d.target(new LatLng(location.getLatitude(), location.getLongitude())).build()));
            GaodeGPSSolution.this.c = true;
        }
    }

    public class i implements LocationSource {
        public i() {
        }

        @Override // com.amap.api.maps.LocationSource
        public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
            GaodeGPSSolution.this.e = onLocationChangedListener;
        }

        @Override // com.amap.api.maps.LocationSource
        public void deactivate() {
            GaodeGPSSolution.this.e = null;
        }
    }

    public class j implements AMap.OnMapTouchListener {
        public j() {
        }

        @Override // com.amap.api.maps.AMap.OnMapTouchListener
        public void onTouch(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 2) {
                return;
            }
            GaodeGPSSolution.this.stopFollow();
        }
    }

    public class k implements AMap.OnMapScreenShotListener {
        public final /* synthetic */ IGPSSolution.IOnMapScreenShotListener a;

        public k(IGPSSolution.IOnMapScreenShotListener iOnMapScreenShotListener) {
            this.a = iOnMapScreenShotListener;
        }

        @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
        public void onMapScreenShot(Bitmap bitmap) {
            this.a.onMapScreenShot(bitmap);
        }

        @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
        public void onMapScreenShot(Bitmap bitmap, int i) {
        }
    }

    public class l implements AMap.CancelableCallback {
        public l() {
        }

        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onCancel() {
        }

        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onFinish() {
        }
    }

    public GaodeGPSSolution(Context context, View view, Bundle bundle, IMapLoadedCallback iMapLoadedCallback) {
        r(context, view, bundle, iMapLoadedCallback);
    }

    private List<LatLng> l(List<GPSPoint> list) {
        HMLog.i("TAG", "boundsBuilder start:" + list.size(), new Object[0]);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            int i2 = 0;
            for (GPSPoint gPSPoint : list) {
                if (gPSPoint != null) {
                    LatLng latLngConvertToLatLng = this.j.convertToLatLng(gPSPoint);
                    if (latLngConvertToLatLng == null) {
                        HMLog.i("TAG", "ErrorGPS:" + i2 + gPSPoint.mLatitude + gPSPoint.mLongitude, new Object[0]);
                    } else {
                        builder.include(latLngConvertToLatLng);
                        arrayList.add(i2, latLngConvertToLatLng);
                        i2++;
                    }
                }
            }
        }
        HMLog.i("TAG", "boundsBuilder end", new Object[0]);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MarkerOptions m(LatLng latLng, int i2) {
        BitmapDescriptor bitmapDescriptorFromResource;
        try {
            if (i2 == 0) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_location);
            } else if (i2 == 1) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_star);
            } else if (i2 == 2) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_pause);
            } else {
                if (i2 != 3) {
                    HMLog.i("IllegalArgumentException", "GaodeMapPainter createMarkerOptions", new Object[0]);
                    throw new IllegalArgumentException();
                }
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(R.drawable.running_detail_end);
            }
            MarkerOptions markerOptions = new MarkerOptions();
            if (latLng != null) {
                markerOptions.position(latLng);
            }
            markerOptions.icon(bitmapDescriptorFromResource);
            markerOptions.setFlat(false);
            return markerOptions;
        } catch (Exception e2) {
            HMLog.i("Run", e2.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PolylineOptions n(boolean z, int i2, List<LatLng> list) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(list);
        polylineOptions.zIndex(40.0f);
        polylineOptions.width(18.0f);
        polylineOptions.color(i2);
        polylineOptions.setDottedLine(z);
        return polylineOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(List<LatLng> list, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback) {
        this.w.execute(new AnimateBoundsUtils(200, this.h, 1000L, list, new c(trackPlayCallback)));
    }

    private void p(UiSettings uiSettings) {
        uiSettings.setLogoLeftMargin(-100);
        uiSettings.setLogoBottomMargin(-100);
    }

    private void q() {
        float maxZoomLevel = this.h.getMaxZoomLevel();
        if (maxZoomLevel >= 10.0f) {
            maxZoomLevel -= 3.0f;
        }
        this.d = new CameraPosition.Builder().zoom(maxZoomLevel).bearing(0.0f).tilt(0.0f);
    }

    private void r(Context context, View view, Bundle bundle, IMapLoadedCallback iMapLoadedCallback) {
        MapView mapView = (MapView) view.findViewById(R.id.map);
        this.g = mapView;
        mapView.onCreate(bundle);
        this.h = this.g.getMap();
        this.i = new MyLocationStyle();
        this.a = new GaodeMapPainter(context, this.h);
        UiSettings uiSettings = this.h.getUiSettings();
        p(uiSettings);
        uiSettings.setRotateGesturesEnabled(false);
        uiSettings.setScaleControlsEnabled(false);
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setMyLocationButtonEnabled(false);
        this.h.setOnMapLoadedListener(new g(iMapLoadedCallback));
        this.h.setMyLocationEnabled(false);
        this.h.setMyLocationStyle(this.i.myLocationType(1));
        this.h.setOnMyLocationChangeListener(new h());
        this.h.setLocationSource(new i());
        this.h.setOnMapTouchListener(new j());
        w();
        q();
    }

    private void s(Context context, Bundle bundle, IMapLoadedCallback iMapLoadedCallback) {
        MapView mapView = (MapView) ((Activity) context).findViewById(R.id.map);
        this.g = mapView;
        mapView.onCreate(bundle);
        this.h = this.g.getMap();
        this.i = new MyLocationStyle();
        this.a = new GaodeMapPainter(context, this.h);
        this.h.setOnMapLoadedListener(new e(iMapLoadedCallback));
        UiSettings uiSettings = this.h.getUiSettings();
        p(uiSettings);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setScaleControlsEnabled(false);
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setZoomControlsEnabled(false);
        this.h.setMyLocationEnabled(false);
        this.h.setMyLocationStyle(this.i.myLocationType(1));
        setDarkBackground(null);
        w();
        this.h.setOnMapTouchListener(new f());
    }

    private void t(Context context, Bundle bundle, IMapLoadedCallback iMapLoadedCallback, boolean z) {
        MapView mapView = (MapView) ((Activity) context).findViewById(R.id.map);
        this.g = mapView;
        mapView.onCreate(bundle);
        this.h = this.g.getMap();
        this.i = new MyLocationStyle();
        this.a = new GaodeMapPainter(context, this.h);
        this.j = new GaodeMapUtil(context.getApplicationContext());
        this.h.setOnMapLoadedListener(new d(iMapLoadedCallback));
        UiSettings uiSettings = this.h.getUiSettings();
        p(uiSettings);
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setZoomGesturesEnabled(false);
        uiSettings.setAllGesturesEnabled(false);
        w();
        this.w = Executors.newFixedThreadPool((Runtime.getRuntime().availableProcessors() * 2) + 3);
        this.x = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Boolean bool, SparseArray<LatLng> sparseArray, List<LatLng> list, List<LatLng> list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i2, float f2, int i3) {
        if (list == null) {
            o(list, trackPlayCallback);
            return;
        }
        if (routeLineInfo.mIsMarkStart) {
            MarkerOptions markerOptionsM = m(list.get(0), 1);
            if (markerOptionsM == null) {
                return;
            } else {
                this.h.addMarker(markerOptionsM).setAnchor(0.5f, 0.5f);
            }
        }
        this.u = this.h.addMarker(m(list.get(0), 0));
        HMLog.i(C, new Gson().toJson(list), new Object[0]);
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0;
        this.v = v(bool, sparseArray, list, list2, this.u, routeLineInfo.mLineColor, routeLineInfo, trackPlayCallback, i2, f2, i3);
    }

    private TraceRePlay v(Boolean bool, SparseArray<LatLng> sparseArray, List<LatLng> list, List<LatLng> list2, Marker marker, int i2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i3, float f2, int i4) {
        TraceRePlay traceRePlay = new TraceRePlay(list, list2, 100, new b(marker, list, trackPlayCallback, routeLineInfo, new ArrayList()));
        traceRePlay.g = i3;
        traceRePlay.h = f2;
        traceRePlay.i = i4;
        traceRePlay.j = sparseArray;
        traceRePlay.k = bool.booleanValue();
        this.w.execute(traceRePlay);
        return traceRePlay;
    }

    private void w() {
        if (Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
            this.h.setMapLanguage("zh_cn");
        } else {
            this.h.setMapLanguage("en");
        }
    }

    private void x(Boolean bool, SparseArray<List<GPSPoint>> sparseArray, List<GPSPoint> list, List<GPSPoint> list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i2, float f2, int i3) {
        if (trackPlayCallback != null) {
            trackPlayCallback.onPlayStart();
        }
        SparseArray sparseArray2 = new SparseArray();
        if (bool.booleanValue() && sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                List<LatLng> listL = l(sparseArray.get(iKeyAt));
                if (listL.size() > 0) {
                    HMLog.i(C, "打印日志点：：    longitude:" + listL.get(0).longitude + "   latitude::" + listL.get(0).latitude, new Object[0]);
                    sparseArray2.put(iKeyAt, listL.get(0));
                }
            }
        }
        List<LatLng> listL2 = l(list);
        List<LatLng> listL3 = l(list2);
        if (listL2.size() == 0) {
            return;
        }
        LatLngBounds.Builder builder = LatLngBounds.builder();
        Iterator<LatLng> it2 = listL2.iterator();
        while (it2.hasNext()) {
            builder.include(it2.next());
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        double dAbs = Math.abs(latLngBoundsBuild.southwest.latitude - latLngBoundsBuild.northeast.latitude);
        double dAbs2 = Math.abs(latLngBoundsBuild.southwest.longitude - latLngBoundsBuild.northeast.longitude);
        LatLng latLng = listL2.get(0);
        if (dAbs <= 0.0025d && dAbs2 <= 0.0025d) {
            this.B = true;
            LatLng latLng2 = latLngBoundsBuild.southwest;
            double d2 = latLng2.latitude;
            LatLng latLng3 = latLngBoundsBuild.northeast;
            latLng = new LatLng((d2 + latLng3.latitude) / 2.0d, (latLng2.longitude + latLng3.longitude) / 2.0d);
        }
        AMap aMap = this.h;
        this.w.execute(new AnimateUtils(50, aMap, 1000L, aMap.getCameraPosition(), new CameraPosition(latLng, this.h.getCameraPosition().zoom - 0.1f, 45.0f, 0.0f), new a(bool, sparseArray2, listL2, listL3, routeLineInfo, trackPlayCallback, i2, f2, i3)));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addLineMarkerPoint(List<GPSPoint> list, List<View> list2, List<Boolean> list3, List<Boolean> list4) {
        if (list == null || list2 == null) {
            HMLog.i("IllegalArgumentException", "GaodeGPSSolution addLineMarkerPoint", new Object[0]);
            throw new IllegalArgumentException("Start point should not be null.");
        }
        this.a.addLineMarkerPoint(list, list2, list3, list4);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addMarked(List<GPSPoint> list) {
        this.a.addMarked(list);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addMaskOverlay(boolean z) {
        this.a.addMaskOverlay(z);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void clearMap() {
        this.a.clearMap();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void clearTrackVideoPaly() {
        this.r = Boolean.FALSE;
        this.g.clearAnimation();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void destroy() {
        this.a.destroy();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void destroyMap() {
        MapView mapView = this.g;
        if (mapView != null) {
            mapView.removeAllViews();
            this.g.onDestroy();
            this.g = null;
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawGPSLine(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo) {
        this.a.updatePolyline(gPSPoint, gPSPoint2, routeLineInfo);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawGPSTrackLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        MarkerOptions markerOptionsM;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        List<LatLng> listL = l(list);
        if (routeLineInfo.mIsMarkStart) {
            MarkerOptions markerOptionsM2 = m(listL.get(0), 1);
            if (markerOptionsM2 == null) {
                return;
            } else {
                this.h.addMarker(markerOptionsM2).setAnchor(0.5f, 0.5f);
            }
        }
        this.h.addPolyline(n(false, Color.parseColor("#33C0A0"), listL));
        if (!routeLineInfo.mIsMarkEnd || (markerOptionsM = m(listL.get(size - 1), 3)) == null) {
            return;
        }
        this.h.addMarker(markerOptionsM).setAnchor(0.5f, 0.5f);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawHeatmap(List<HeatmapData> list) {
        IGPSPainter iGPSPainter = this.a;
        if (iGPSPainter != null) {
            iGPSPainter.drawHeatmap(list);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawMarkerToPoint(GPSPoint gPSPoint, Bitmap bitmap) {
        this.a.drawMarkerToPoint(gPSPoint, bitmap);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawRouteGPSLine(List<GPSPoint> list, int i2, boolean z, RouteLineInfo routeLineInfo) {
        this.a.updateRoutePolyline(list, i2, z, routeLineInfo);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void follow() {
        this.h.setMyLocationStyle(this.i.myLocationType(2));
    }

    public int getLineMakerInterval() {
        return 1;
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void locate() {
        this.h.setMyLocationStyle(this.i.myLocationType(1));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void mapScreenShot(IGPSSolution.IOnMapScreenShotListener iOnMapScreenShotListener) {
        this.h.getMapScreenShot(new k(iOnMapScreenShotListener));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void markGPSPoint(GPSPoint gPSPoint) {
        this.a.markGPSPoint(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void pauseMap() {
        MapView mapView = this.g;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void removeAllLineMarkerPoint() {
        this.a.removeAllLineMarkerPoint();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void resumeMap() {
        MapView mapView = this.g;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void saveInstanceStateMap(Bundle bundle) {
        MapView mapView = this.g;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void scrollBy(int i2, int i3) {
        this.g.scrollBy(i2, i3);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setAllGesturesEnabled(boolean z) {
        this.h.getUiSettings().setAllGesturesEnabled(z);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setCarmeraLatLngBounds(List<GPSPoint> list) {
        List<LatLng> listL = l(list);
        LatLngBounds.Builder builder = LatLngBounds.builder();
        Iterator<LatLng> it2 = listL.iterator();
        while (it2.hasNext()) {
            builder.include(it2.next());
        }
        this.h.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 100), new l());
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setCenter(GPSPoint gPSPoint) {
        this.a.moveToCenter(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setDarkBackGround() {
        this.a.addDarkOverlay(this.b);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setDarkBackground(List<GPSPoint> list) {
        this.a.addDarkOverlay(list);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setDarkBackgroundColor(int i2) {
        this.a.addDarkOverlay(i2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setDebugMode(int i2) {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setEndPoint(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            this.a.setEndPoint(gPSPoint);
        } else {
            HMLog.i("IllegalArgumentException", "GaodeGPSSolution setEndPoint", new Object[0]);
            throw new IllegalArgumentException("End point should not be null.");
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setHeatmapVisible(int i2) {
        IGPSPainter iGPSPainter = this.a;
        if (iGPSPainter != null) {
            iGPSPainter.setHeatmapVisible(i2);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setILocationChanged(GPSPoint gPSPoint) {
        Location locationCreateLocation = GPSPoint.createLocation(gPSPoint);
        LocationSource.OnLocationChangedListener onLocationChangedListener = this.e;
        if (onLocationChangedListener != null) {
            onLocationChangedListener.onLocationChanged(locationCreateLocation);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setLineWidthScale(float f2) {
        this.a.setLineWidth(f2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setLocation(GPSPoint gPSPoint) {
        this.a.setLocation(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setMapViewMode(int i2) {
        this.a.setMapViewType(i2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setMarked(boolean z) {
        this.a.setMarked(z);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setOnChangeListener(OnChangeListener onChangeListener) {
        Log.i(C, "setOnChangeListener    gode");
        this.f = onChangeListener;
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setRouteCenter(GPSPoint gPSPoint) {
        this.a.moveRouteToCenter(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setRouteTrackVisibility(boolean z) {
        this.a.setRouteTrackerVisibility(z);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setStartPoint(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            this.a.setStartPoint(gPSPoint);
        } else {
            HMLog.i("IllegalArgumentException", "GaodeGPSSolution setStartPoint", new Object[0]);
            throw new IllegalArgumentException("Start point should not be null.");
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTestLocation(GPSPoint gPSPoint) {
        this.a.setTestLocation(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
        this.a.setTrackRectangle(gPSPoint, gPSPoint2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTrackSectionColors(SparseArray<Integer> sparseArray) {
        this.a.setTrackISectionColors(sparseArray);
    }

    public void setZoomBy(int i2) {
        this.a.zoomBy(i2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void startCPSTrackPlay(Boolean bool, SparseArray<List<GPSPoint>> sparseArray, List<GPSPoint> list, List<GPSPoint> list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i2, float f2, int i3) {
        this.h.clear();
        x(bool, sparseArray, list, list2, routeLineInfo, trackPlayCallback, i2, f2, i3);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void startFollow() {
        this.a.startFollow();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void stopFollow() {
        this.a.stopFollow();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void updateEndMarkerIcon(Bitmap bitmap) {
        this.a.updateEndMarkerIcon(bitmap);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowAddedTrack() {
        zoomToShowAddedTrack(null);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowEntireTrack(List<GPSPoint> list) {
        zoomToShowEntireTrack(list, null);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawGPSLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        if (list == null || list.size() <= 0 || routeLineInfo == null) {
            return;
        }
        if (routeLineInfo.mIsRevised) {
            this.a.updatePolyline(list, routeLineInfo);
        } else {
            this.a.drawPolyline(list, routeLineInfo);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowAddedTrack(IMapAnimationCallback iMapAnimationCallback) {
        this.a.zoomToShowEntireTrack(iMapAnimationCallback);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowEntireTrack(List<GPSPoint> list, IMapAnimationCallback iMapAnimationCallback) {
        this.a.zoomToShowEntireTrack(list, iMapAnimationCallback);
    }

    public GaodeGPSSolution(Context context, Bundle bundle, IMapLoadedCallback iMapLoadedCallback) {
        s(context, bundle, iMapLoadedCallback);
    }

    public GaodeGPSSolution(Context context, Bundle bundle, IMapLoadedCallback iMapLoadedCallback, boolean z) {
        t(context, bundle, iMapLoadedCallback, z);
    }
}
