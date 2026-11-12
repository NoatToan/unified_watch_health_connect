package com.mi.health.sport;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.PolylineOptions;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import com.xiaomi.fitness.common.utils.ILocationListener;
import com.xiaomi.fitness.common.utils.Location;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.ali;
import defpackage.bxa;
import defpackage.lqi;
import defpackage.ni4;
import defpackage.qti;
import defpackage.s2b;
import defpackage.t4i;
import defpackage.vmi;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AmapRealTimePathView extends BaseMapView<AmapRealTimePathView> implements SensorEventListener {
    public float A;
    public float B;
    public float C;
    public boolean D;
    public Float E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MapView f10054b;
    public AMap c;
    public UiSettings d;
    public AMapLocationClient e;
    public AMapLocationListener f;
    public Context g;
    public boolean h;
    public volatile double i;
    public volatile double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f10055k;
    public double l;
    public double m;
    public double n;
    public Marker o;
    public List<Double> p;
    public List<Double> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LatLng f10056r;
    public boolean s;
    public long t;
    public Marker u;
    public SensorManager v;
    public float[] w;
    public float[] x;
    public Sensor y;
    public float z;

    public class a implements AMap.OnCameraChangeListener {
        public a() {
        }

        @Override // com.amap.api.maps.AMap.OnCameraChangeListener
        public void onCameraChange(CameraPosition cameraPosition) {
            AmapRealTimePathView.this.E = Float.valueOf(cameraPosition.bearing);
        }

        @Override // com.amap.api.maps.AMap.OnCameraChangeListener
        public void onCameraChangeFinish(CameraPosition cameraPosition) {
        }
    }

    public class b implements ILocationListener {
        public b() {
        }

        @Override // com.xiaomi.fitness.common.utils.ILocationListener
        public void onFail(String str) {
            Logger.i(AmapRealTimePathView.this.f10053a, "onFail");
        }

        @Override // com.xiaomi.fitness.common.utils.ILocationListener
        public void onSuccess(Location location) {
            Logger.d(AmapRealTimePathView.this.f10053a, "long:" + location.getLon() + ",la:" + location.getLat());
            s2b s2bVarB = t4i.b(location.getLat(), location.getLon());
            LatLng latLng = new LatLng(s2bVarB.a(), s2bVarB.b());
            AmapRealTimePathView.this.f10054b.getMap().animateCamera(CameraUpdateFactory.changeLatLng(latLng));
            if (AmapRealTimePathView.this.u != null) {
                Marker marker = AmapRealTimePathView.this.u;
                if (AmapRealTimePathView.this.f10056r != null) {
                    latLng = AmapRealTimePathView.this.f10056r;
                }
                marker.setPosition(latLng);
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10059a;

        static {
            int[] iArr = new int[MapMode.values().length];
            f10059a = iArr;
            try {
                iArr[MapMode.day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10059a[MapMode.night.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AmapRealTimePathView(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        this.f10053a = "AmapRealTimePathView";
        this.e = new AMapLocationClient(AppUtil.getApp());
        this.h = false;
        this.p = new LinkedList();
        this.q = new LinkedList();
        this.f10056r = null;
        this.u = null;
        this.w = new float[9];
        this.x = new float[3];
        this.y = null;
        this.z = 1.0f;
        this.A = 0.01f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = false;
        this.E = Float.valueOf(0.0f);
        this.g = AppUtil.getApp();
        AMapLocationClient.updatePrivacyShow(context, true, true);
        AMapLocationClient.updatePrivacyAgree(context, true);
        j(LayoutInflater.from(context).inflate(qti.e, this));
    }

    private AMapLocationClientOption getLocationOption() {
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        aMapLocationClientOption.setOnceLocation(true);
        return aMapLocationClientOption;
    }

    private int getScreenRotationOnPhone(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : -90;
        }
        return 180;
    }

    private void startLocation() {
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.showMyLocation(false);
        this.c.setMyLocationStyle(myLocationStyle);
        try {
            new FusionLocationRequest().requestLocation(new b());
        } catch (Exception e) {
            Logger.d(this.f10053a, "AMapLocationClient  init failed!!!");
            e.printStackTrace();
        }
    }

    public void drawPreLine(List<com.xiaomi.fit.data.common.data.sport.Location> list) {
        if (list.isEmpty()) {
            return;
        }
        this.c.addPolyline(new PolylineOptions().addAll(MapUtilsKt.createLatLngList(list)).width(e(10.0f)).zIndex(1.0f).color(Color.parseColor("#ffb39a")));
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), vmi.j);
        this.c.addPolyline(new PolylineOptions().addAll(MapUtilsKt.createLatLngList(list)).width(e(10.0f)).zIndex(1.0f).setCustomTexture(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)));
        bitmapDecodeResource.recycle();
    }

    public final int e(float f) {
        return (int) ((this.g.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public final void f(boolean z) {
        for (int i = 0; i < this.q.size(); i++) {
            h(this.q.get(i).doubleValue(), this.p.get(i).doubleValue(), z);
        }
        this.p.clear();
        this.q.clear();
    }

    public void g(List<CommonTrackData> list) {
        if (list.isEmpty()) {
            return;
        }
        List<List<LatLng>> listConvertCommonTrackToLatLngs = MapUtilsKt.convertCommonTrackToLatLngs(list);
        for (List<LatLng> list2 : listConvertCommonTrackToLatLngs) {
            if (!list2.isEmpty()) {
                this.c.addPolyline(new PolylineOptions().addAll(list2).width(e(10.0f)).zIndex(1.0f).color(Color.parseColor("#ffb39a")));
                if (listConvertCommonTrackToLatLngs.size() == 1) {
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), vmi.j);
                    this.c.addPolyline(new PolylineOptions().addAll(list2).width(e(10.0f)).zIndex(1.0f).setCustomTexture(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)));
                    bitmapDecodeResource.recycle();
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public AmapRealTimePathView getMapView() {
        return this;
    }

    public final void h(double d, double d2, boolean z) {
        this.t++;
        if (d2 == 0.0d || d == 0.0d) {
            return;
        }
        if (this.j != 0.0d && this.j != 0.0d) {
            PolylineOptions polylineOptions = new PolylineOptions();
            polylineOptions.add(new LatLng(this.j, this.i));
            polylineOptions.add(new LatLng(d2, d));
            Marker marker = this.u;
            if (marker != null) {
                marker.setPosition(this.f10056r);
            }
            polylineOptions.zIndex(1.0f);
            polylineOptions.width(e(10.0f)).geodesic(true).color(ni4.c(this.g, ali.m)).lineCapType(PolylineOptions.LineCapType.LineCapRound);
            this.c.addPolyline(polylineOptions);
            l(d, d2, z);
        }
        this.i = d;
        this.j = d2;
    }

    public final void i() {
        UiSettings uiSettings = this.c.getUiSettings();
        this.d = uiSettings;
        uiSettings.setCompassEnabled(false);
        this.d.setRotateGesturesEnabled(true);
        this.d.setTiltGesturesEnabled(false);
        this.d.setMyLocationButtonEnabled(false);
        this.c.moveCamera(CameraUpdateFactory.zoomTo(18.0f));
        this.d.setZoomControlsEnabled(false);
        this.d.setLogoBottomMargin(-50);
        this.d.setCompassEnabled(false);
    }

    public final void initSensor() {
        SensorManager sensorManager = (SensorManager) this.g.getSystemService("sensor");
        this.v = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.y = defaultSensor;
        if (defaultSensor == null) {
            Logger.e(this.f10053a, "Device does not support required sensors!");
        }
    }

    public final void j(View view) {
        MapView mapView = (MapView) view.findViewById(lqi.c);
        this.f10054b = mapView;
        this.c = mapView.getMap();
        i();
        this.u = this.c.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(getResources(), vmi.f37031b))).zIndex(3.0f));
        setCustomMapStyle();
    }

    public void k() {
        startLocation();
    }

    public final void l(double d, double d2, boolean z) {
        if (z) {
            this.n = d2;
            this.m = d;
        }
        if (MapUtilsKt.getDistance(this.m, this.n, d, d2) >= 3.0d) {
            this.m = d;
            this.n = d2;
            this.f10054b.getMap().animateCamera(CameraUpdateFactory.changeLatLng(new LatLng(d2, d)));
        }
    }

    public void m(com.xiaomi.fit.data.common.data.sport.Location location, boolean z) {
        Logger.i(this.f10053a, "onLocationChange,preLat:" + this.j + ",preLon:" + this.i + ",curLon:" + location.longitude + ",curLon:" + location.latitude + ",lastLon:" + this.l + ",lastLat:" + this.f10055k);
        double d = this.f10055k;
        double d2 = location.latitude;
        boolean z2 = d == d2 && this.l == location.longitude;
        double d3 = location.longitude;
        this.l = d3;
        this.f10055k = d2;
        if (this.D) {
            if (z2) {
                return;
            }
            this.D = false;
            return;
        }
        double[] dArrC = bxa.c(d2, d3);
        if (this.s) {
            this.p.add(Double.valueOf(dArrC[0]));
            this.q.add(Double.valueOf(dArrC[1]));
            return;
        }
        f(z);
        h(dArrC[1], dArrC[0], z);
        this.f10056r = new LatLng(dArrC[0], dArrC[1]);
        if (z) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(getResources(), vmi.f37031b)));
            this.o = this.c.addMarker(markerOptions);
        }
    }

    public void n() {
    }

    public void o() {
        Logger.i(this.f10053a, "onSportRestart,preLat:" + this.j + ",preLon:" + this.i);
        this.D = true;
        this.j = 0.0d;
        this.i = 0.0d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(Bundle bundle) {
        this.f10054b.onCreate(bundle);
        startLocation();
        initSensor();
        this.f10054b.getMap().setOnCameraChangeListener(new a());
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        this.f10054b.onDestroy();
        this.c.clear();
        this.e.stopLocation();
        this.e.setLocationListener(null);
        this.e.onDestroy();
        this.e = null;
        this.d = null;
        this.f = null;
        this.j = 0.0d;
        this.i = 0.0d;
        this.q.clear();
        this.p.clear();
        this.u = null;
        this.f10056r = null;
        this.m = 0.0d;
        this.n = 0.0d;
        SensorManager sensorManager = this.v;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this, this.y);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        this.f10054b.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        this.s = true;
        SensorManager sensorManager = this.v;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this, this.y);
        }
        this.f10054b.onPause();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        Sensor sensor;
        this.s = false;
        SensorManager sensorManager = this.v;
        if (sensorManager != null && (sensor = this.y) != null) {
            sensorManager.registerListener(this, sensor, 2);
        }
        this.f10054b.onResume();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(Bundle bundle) {
        this.f10054b.onSaveInstanceState(bundle);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 11) {
            SensorManager.getRotationMatrixFromVector(this.w, sensorEvent.values);
            SensorManager.getOrientation(this.w, this.x);
            float degrees = ((float) Math.toDegrees(this.x[0])) - this.B;
            if (Math.abs(degrees) > 180.0f) {
                degrees = degrees > 0.0f ? degrees - 360.0f : degrees + 360.0f;
            }
            float f = this.B + (this.z * degrees);
            this.B = f;
            if (Math.abs(f - this.C) > this.A) {
                float f2 = this.B;
                this.C = f2;
                p(Float.valueOf(f2));
            }
        }
    }

    public final void p(Float f) {
        if (this.u != null) {
            this.u.setRotateAngle((((this.E.floatValue() + 360.0f) - f.floatValue()) + getScreenRotationOnPhone(this.g)) % 360.0f);
        }
    }

    public final void setCustomMapStyle() {
        this.c.getUiSettings().setZoomControlsEnabled(false);
        String str = UIUtils.isNightMode(getContext()) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : null;
        if (str == null) {
            return;
        }
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(str);
        this.c.setCustomMapStyle(customMapStyleOptions);
    }

    public void setMapMode(MapMode mapMode) {
        i();
        int i = c.f10059a[mapMode.ordinal()];
    }
}
