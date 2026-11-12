package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.CameraUpdate;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.Projection;
import com.amap.api.maps.TextureMapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.trackanimationutil.SmoothMarkerUtil;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceSnapshotCallback;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jqu implements InterfaceHiMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f38855b = 15.0f;
    private boolean aa;
    private boolean ac;
    private boolean ad;
    private boolean ah;
    private TextureMapView al;
    private List<LatLng> am;
    private Vector<Marker> ar;
    private AMap.OnMapScreenShotListener av;
    private Polyline ax;
    private PolylineOptions ay;
    private InterfaceMapCallback bf;
    private List<LatLng> bh;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AMap f38857c;
    private String g;
    private CameraUpdate i;
    private LatLngBounds j;
    private Context m;
    private List<Integer> n;
    private Marker o;
    private long w;
    private String x;
    private int l = Color.rgb(107, FitnessSleepType.HW_FITNESS_NOON, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);
    private int bd = qre.e(R.color.colorAccent);
    private List<Marker> bc = new ArrayList();
    private Marker k = null;
    private List<jpg> az = new ArrayList(10);
    private boolean z = false;
    private int r = 0;
    private long p = 0;
    private boolean ag = true;
    private Polygon au = null;
    private boolean y = false;
    private ArrayList<Marker> as = new ArrayList<>(10);
    private ArrayList<MarkerOptions> an = new ArrayList<>(10);
    private List<jpk> u = new ArrayList(10);
    private ArrayList<a> aj = new ArrayList<>(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<List<jqw>> f38856a = new ArrayList(10);
    private int aq = 0;
    private List<List<PolylineOptions>> f = new ArrayList(10);
    private int s = 0;
    private boolean af = true;
    private boolean ai = true;
    private Handler e = new d(Looper.getMainLooper(), this);
    private Handler ao = new c(Looper.getMainLooper(), this);
    private int ba = 0;
    private List<Integer> bb = new ArrayList(10);
    private CameraUpdate h = null;
    private List<LatLng> q = new ArrayList(10);
    private List<LatLng> t = new ArrayList(10);
    private List<SmoothMarkerUtil> ap = new ArrayList();
    private boolean ae = false;
    private boolean ab = false;
    private int ak = -1;
    private Vector<Polyline> d = new Vector<>();
    private AMap.CancelableCallback v = new AMap.CancelableCallback() { // from class: jqu.4
        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onCancel() {
        }

        @Override // com.amap.api.maps.AMap.CancelableCallback
        public void onFinish() {
            jqu.this.ai = false;
        }
    };
    private final Map<String, GroundOverlay> aw = new ConcurrentHashMap();
    private final Map<Polyline, PolylineOptions> bg = new ConcurrentHashMap();
    private final Map<String, Polyline> at = new ConcurrentHashMap();

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int getMapEngineType() {
        return 1;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadingEnd() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStart() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStop() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerLoadingListener(InterfaceMapCallback interfaceMapCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void saveAddress(MotionData motionData) {
    }

    public jqu(Context context, TextureMapView textureMapView, boolean z) {
        if (textureMapView == null) {
            throw new RuntimeException("context or mapView is null");
        }
        this.m = BaseApplication.getContext();
        AMap map = textureMapView.getMap();
        this.f38857c = map;
        if (map == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "GaoDeMap mAmap is null");
            return;
        }
        if (z) {
            map.reloadMap();
        }
        this.al = textureMapView;
        LogUtil.a("Track_GaoDeMap", "GaoDeMap instance hashcode: ", Integer.valueOf(hashCode()));
        PolylineOptions polylineOptions = new PolylineOptions();
        this.ay = polylineOptions;
        polylineOptions.color(this.bd).width(15.0f).zIndex(10.0f).visible(true);
        this.ax = b(this.ay);
        this.bh = new ArrayList(10);
        this.am = new ArrayList(10);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setIsStop(boolean z) {
        this.af = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jpg jpgVar, long j, InterfaceMapCallback interfaceMapCallback) {
        if (jpgVar == null) {
            return;
        }
        if (j == 0) {
            j = 1000;
        }
        if (this.f38857c == null) {
            ReleaseLogUtil.a("Track_GaoDeMap", "animateCamera: mAMap is null!");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.p;
        if ((this.z || jElapsedRealtime - j2 <= 2000) && !g()) {
            return;
        }
        a(a(jpgVar), j, c(interfaceMapCallback));
    }

    private void a(LatLng latLng, long j, AMap.CancelableCallback cancelableCallback) {
        LogUtil.j("Track_GaoDeMap", "startMoveCamera: map is not ready ", Boolean.valueOf(this.ah));
        if (this.ah) {
            CameraPosition cameraPosition = this.f38857c.getCameraPosition();
            float f = 16.5f;
            float f2 = cameraPosition == null ? 16.5f : cameraPosition.zoom;
            if (Math.abs(f2 - 10.0f) >= 1.0E-4f && !this.ai) {
                f = f2;
            }
            CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition(latLng, f, 0.0f, 0.0f));
            this.w = SystemClock.elapsedRealtime();
            this.z = true;
            if (this.ai) {
                this.f38857c.animateCamera(cameraUpdateNewCameraPosition, j, this.v);
            } else {
                this.f38857c.animateCamera(cameraUpdateNewCameraPosition, j, cancelableCallback);
            }
        }
    }

    private boolean g() {
        return SystemClock.elapsedRealtime() - this.w > 10000;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawAddMapTracking(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "drawAddMapTracking lastHiHealthLatLng or currentHiHealthLatLng is null");
            return;
        }
        this.bh.add(a(jpgVar));
        this.ay.setPoints(this.bh);
        this.ax = b(this.ay);
        animateCamera(jpgVar2, 1000L, (InterfaceMapCallback) null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addSportStartMarker(jpg jpgVar, int i) {
        addStartMarker(jpgVar, i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void screenShotToFile(final InterfaceSnapshotCallback interfaceSnapshotCallback) {
        synchronized (this) {
            if (interfaceSnapshotCallback == null) {
                return;
            }
            this.f38857c.getMapScreenShot(new AMap.OnMapScreenShotListener(this) { // from class: jqu.8
                @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
                public void onMapScreenShot(Bitmap bitmap, int i) {
                }

                @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
                public void onMapScreenShot(Bitmap bitmap) {
                    interfaceSnapshotCallback.onSnapshotReady(bitmap);
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(List<jpi> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_GaoDeMap", "drawLine listBasePoint is null");
            return;
        }
        jpg jpgVarB = izy.b(list.get(list.size() - 1));
        this.am.add(izt.b(jpgVarB));
        if (this.ag) {
            this.ay.setPoints(this.am);
            this.ax = b(this.ay);
            addEndMarker(jpgVarB);
            animateCamera(jpgVarB, 0L, (InterfaceMapCallback) null);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineColor(int i, boolean z) {
        Polyline polyline;
        this.bd = i;
        PolylineOptions polylineOptions = this.ay;
        if (polylineOptions != null) {
            polylineOptions.color(i);
        }
        if (!z || (polyline = this.ax) == null) {
            return;
        }
        polyline.setColor(i);
    }

    public void d(int i, int i2, List<LatLng> list, List<njj> list2) {
        if (list == null) {
            return;
        }
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.width(15.0f).zIndex(10.0f).visible(true);
        List<Integer> arrayList = new ArrayList<>(10);
        if (this.ab) {
            if (c(list2)) {
                polylineOptions.color(this.l);
            } else if (list2.size() == 1) {
                polylineOptions.color(b(list2)).width(15.0f);
            } else {
                arrayList = b(list.size(), list2);
            }
        } else {
            polylineOptions.color(this.bd);
        }
        int size = list.size();
        int i3 = size / DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        ArrayList arrayList2 = new ArrayList(10);
        if (i3 > 1) {
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 % i3 == 0 || i4 == size - 1) {
                    polylineOptions.add(list.get(i4));
                    e(i, arrayList, arrayList2, i4);
                }
            }
        } else {
            while (i < i2) {
                if (i < arrayList.size()) {
                    arrayList2.add(arrayList.get(i));
                }
                i++;
            }
            polylineOptions.addAll(list);
        }
        a(polylineOptions, arrayList2, arrayList2.size());
        d(polylineOptions, arrayList2);
        this.f38857c.addPolyline(polylineOptions);
    }

    private boolean c(List<njj> list) {
        return e(list) || d(list) || this.ba == 266;
    }

    private boolean e(List<njj> list) {
        return list == null || list.size() == 0;
    }

    private void a(PolylineOptions polylineOptions, List<Integer> list, int i) {
        int iIntValue;
        if (i < polylineOptions.getPoints().size()) {
            if (i == 0) {
                iIntValue = this.bd;
            } else {
                iIntValue = list.get(i - 1).intValue();
            }
            for (int i2 = 0; i2 < polylineOptions.getPoints().size() - i; i2++) {
                list.add(Integer.valueOf(iIntValue));
            }
        }
    }

    private void e(int i, List<Integer> list, List<Integer> list2, int i2) {
        int i3 = i2 + i;
        if (i3 < list.size()) {
            list2.add(list.get(i3));
        }
    }

    private boolean d(List<njj> list) {
        boolean z = true;
        for (njj njjVar : list) {
            if (njjVar.c() <= 0 && njjVar.e() <= 0) {
                return true;
            }
            if (njjVar.e() != 0) {
                z = false;
            }
        }
        return z;
    }

    private int b(List<njj> list) {
        Iterator<njj> it = list.iterator();
        float fD = 0.0f;
        while (it.hasNext()) {
            fD = it.next().d();
        }
        return izt.c(fD, this.ba);
    }

    private List<Integer> b(int i, List<njj> list) {
        return e(i, list);
    }

    private void d(PolylineOptions polylineOptions, List<Integer> list) {
        polylineOptions.colorValues(list);
        if (this.af) {
            polylineOptions.width(15.0f);
        }
    }

    private List<Integer> e(int i, List<njj> list) {
        int iIntValue;
        float[] fArr = new float[list.size()];
        Integer[] numArr = new Integer[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            njj njjVar = list.get(i2);
            fArr[i2] = njjVar.e();
            numArr[i2] = Integer.valueOf(izt.c(njjVar.d(), this.ba));
        }
        if (this.n == null) {
            this.n = izt.a(fArr, numArr);
        }
        LogUtil.a("Track_GaoDeMap", "colorList ", Integer.valueOf(this.n.size()), " pointSize ", Integer.valueOf(i));
        int size = this.n.size();
        if (size < i) {
            if (size == 0) {
                iIntValue = this.l;
            } else {
                iIntValue = this.n.get(size - 1).intValue();
            }
            for (int i3 = 0; i3 < i - size; i3++) {
                this.n.add(Integer.valueOf(iIntValue));
            }
        }
        return this.n;
    }

    private void a(int i, LatLng latLng, a aVar) {
        if (this.aj.size() > 0) {
            ArrayList<a> arrayList = this.aj;
            a aVar2 = arrayList.get(arrayList.size() - 1);
            if (aVar2.f38871a.equals(latLng)) {
                if (this.t.size() <= i || !aVar.f38871a.equals(this.t.get(i))) {
                    aVar2.f38873c = false;
                } else {
                    aVar.f38873c = false;
                }
            }
        }
    }

    private Polyline b(PolylineOptions polylineOptions) {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "drawLine mAMap is null sth exception");
            return null;
        }
        return aMap.addPolyline(polylineOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "drawLine lastHiHealthLatLng or currentHiHealthLatLng is null");
            return;
        }
        addEndMarker(jpgVar2);
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.bd).width(15.0f).zIndex(10.0f).visible(true).add(a(jpgVar), a(jpgVar2));
        b(polylineOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawInterrupt(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "drawInterrupt lastHiHealthLatLng or currentHiHealthLatLng is null");
            return;
        }
        addEndMarker(jpgVar2);
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(BaseApplication.getContext().getResources().getColor(R.color.pause_line)).width(15.0f).zIndex(10.0f).setDottedLine(true).visible(izt.d()).add(a(jpgVar), a(jpgVar2));
        b(polylineOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void pauseSportClear() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.ay = polylineOptions;
        polylineOptions.color(this.bd).width(15.0f).zIndex(10.0f).visible(true);
        this.ax = b(this.ay);
        List<LatLng> list = this.bh;
        if (list != null && !list.isEmpty()) {
            this.bh.clear();
        }
        List<LatLng> list2 = this.am;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.am.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addStartMarker(jpg jpgVar, int i) {
        if (jpgVar == null) {
            ReleaseLogUtil.a("Track_GaoDeMap", "addStartMarker hiHealthLatLng is null!");
            return;
        }
        if (this.ae) {
            ReleaseLogUtil.a("Track_GaoDeMap", "addStartMarker aMap is destroyed");
            return;
        }
        for (Marker marker : this.bc) {
            if (marker != null) {
                marker.remove();
            }
        }
        this.bc.clear();
        LogUtil.a("Track_GaoDeMap", "addStartMarker() GaoDeMap instance hashcode: ", Integer.valueOf(hashCode()));
        this.bc.add(izt.a(this.f38857c, izt.a(a(jpgVar)), i));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIconPath(String str, String str2) {
        this.x = str;
        this.g = str2;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String addOverlay(jrz jrzVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "mAMap is null in addGroundOverlay");
            return null;
        }
        if (jrzVar == null) {
            LogUtil.e("Track_GaoDeMap", "overlayDesc is null in addGroundOverlay");
            return null;
        }
        GroundOverlay groundOverlayAddGroundOverlay = this.f38857c.addGroundOverlay(new GroundOverlayOptions().position(izt.b(jrzVar.a()), jrzVar.b()).image(BitmapDescriptorFactory.fromBitmap(jrzVar.e())).bearing(jrzVar.d()).zIndex(jrzVar.c()).visible(jrzVar.g()));
        if (groundOverlayAddGroundOverlay == null) {
            LogUtil.e("Track_GaoDeMap", "add GroundOverlay fail");
            return null;
        }
        String id = groundOverlayAddGroundOverlay.getId();
        this.aw.put(id, groundOverlayAddGroundOverlay);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOverlayVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.a("Track_GaoDeMap", "id is null in setOverlayVisible");
            return;
        }
        GroundOverlay groundOverlay = this.aw.get(str);
        if (groundOverlay == null) {
            return;
        }
        groundOverlay.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar, boolean z) {
        if (z) {
            Marker marker = this.k;
            if (marker != null) {
                marker.remove();
                this.k = null;
            }
            Marker marker2 = this.o;
            if (marker2 != null) {
                marker2.remove();
                this.o = null;
            }
        }
        addEndMarker(jpgVar);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar) {
        Marker marker = this.k;
        if (marker != null || jpgVar == null) {
            if (jpgVar != null) {
                marker.setPosition(a(jpgVar));
                this.o.setPosition(a(jpgVar));
                return;
            } else {
                LogUtil.e("Track_GaoDeMap", "addEndMarker is wrong");
                return;
            }
        }
        Marker markerD = izt.d(this.f38857c, izt.a(a(jpgVar)), this.g);
        this.o = markerD;
        if (markerD == null) {
            return;
        }
        if (!this.af) {
            LogUtil.a("Track_GaoDeMap", "addEndMarker() GaoDeMap instance hashcode: ", Integer.valueOf(hashCode()));
            this.k = izt.a(this.f38857c, izt.a(a(jpgVar)), this.x);
            b(1);
        } else {
            markerD.setVisible(false);
            this.k = this.f38857c.addMarker(new MarkerOptions().position(a(jpgVar)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_ending)));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(List<MotionData> list) {
        CommonUtil.d("Track_GaoDeMap", "into gaode map");
        if (njy.e(list)) {
            ReleaseLogUtil.a("Track_GaoDeMap", "onMapLoaded motion data is null");
            return;
        }
        int sportType = list.get(0).getSportType();
        this.ba = sportType;
        if (sportType == 266) {
            this.l = Color.rgb(49, FitnessSportType.HW_FITNESS_SPORT_ALL, 251);
        }
        c(list.get(0));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(jpg jpgVar, float f) {
        CommonUtil.d("Track_GaoDeMap", "into gaode map");
        if (jpgVar == null) {
            LogUtil.a("Track_GaoDeMap", "onMapLoaded, hiHealthLatLng is null");
            return;
        }
        this.f38857c.moveCamera(CameraUpdateFactory.changeLatLng(new LatLng(jpgVar.d, jpgVar.f38787a)));
        this.f38857c.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadMapWithPreprocessData(List<jrp> list) {
        this.aq = 0;
        this.s = list.size();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (list.size() > 0) {
            this.ba = list.get(0).h();
            this.r = list.get(0).b().size();
        }
        for (jrp jrpVar : list) {
            this.bb.add(Integer.valueOf(jrpVar.h()));
            this.f.add(a(jrpVar, builder));
            if (jrpVar.d().size() > 0) {
                this.q.add(izt.b(jrpVar.d().get(0)));
            }
            if (jrpVar.e().size() > 0) {
                this.t.add(izt.b(jrpVar.e().get(0)));
            }
            Iterator<jpg> it = jrpVar.b().iterator();
            int i = 1;
            while (it.hasNext()) {
                LatLng latLngB = izt.b(it.next());
                a aVar = new a();
                aVar.f38871a = latLngB;
                aVar.f38873c = true;
                aVar.f38872b = i;
                a(this.aq, latLngB, aVar);
                this.aj.add(aVar);
                i++;
            }
            this.aq++;
            List<jpk> listC = jrpVar.c();
            this.u = listC;
            this.an = izt.c(listC);
        }
        this.j = builder.build();
        CommonUtil.d("Track_GaoDeMap", "setAnimationPolylineOptions");
        if (this.j == null) {
            LogUtil.j("Track_GaoDeMap", "loadMapWithPreprocessData show map mBounds null");
        } else {
            if (this.f38857c == null) {
                return;
            }
            h();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeTrackColor(int i) {
        for (Map.Entry<Polyline, PolylineOptions> entry : this.bg.entrySet()) {
            Polyline key = entry.getKey();
            PolylineOptions value = entry.getValue();
            if (value.getColorValues() == null) {
                int color = value.getColor();
                value.color(i);
                key.setOptions(value);
                value.color(color);
            } else {
                new ArrayList();
                List<Integer> colorValues = value.getColorValues();
                value.colorValues(Collections.nCopies(2, Integer.valueOf(i)));
                key.setOptions(value);
                value.colorValues(colorValues);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void resetTrackColor() {
        for (Map.Entry<Polyline, PolylineOptions> entry : this.bg.entrySet()) {
            entry.getKey().setOptions(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f38857c == null || njy.e(this.an)) {
            return;
        }
        for (int i = 1; i < this.an.size() - 1; i++) {
            MarkerOptions markerOptions = this.an.get(i);
            if (markerOptions != null) {
                this.f38857c.addMarker(markerOptions);
            }
        }
    }

    private void c(MotionData motionData) {
        int i;
        LatLng latLng;
        Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
        if (lbsDataMap == null || lbsDataMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<Map.Entry<Long, double[]>> it = lbsDataMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Long, double[]> next = it.next();
            c(arrayList, builder, new LatLng(next.getValue()[0], next.getValue()[1]));
        }
        LogUtil.a("Track_GaoDeMap", "list SIZE:", Integer.valueOf(arrayList.size()));
        int size = arrayList.size();
        if (size >= 3 || !this.af) {
            b(motionData.getPaceList(), arrayList, new ArrayList(10));
            for (i = 0; i < size; i++) {
                LatLng latLng2 = arrayList.get(i);
                if (!izt.a(izt.a(latLng2))) {
                    addStartMarker(b(latLng2), this.ba);
                    LogUtil.d("Track_GaoDeMap", "addStartMarker");
                    break;
                }
            }
            int i2 = size - 1;
            while (true) {
                if (i2 < 0) {
                    latLng = null;
                    break;
                }
                latLng = arrayList.get(i2);
                if (!izt.a(izt.a(latLng))) {
                    addEndMarker(b(latLng));
                    LogUtil.d("Track_GaoDeMap", "addEndMarker");
                    break;
                }
                i2--;
            }
            if (builder.build() == null) {
                LogUtil.a("Track_GaoDeMap", "show map mBounds null");
            } else if (latLng != null) {
                this.f38857c.moveCamera(CameraUpdateFactory.changeLatLng(latLng));
                this.f38857c.moveCamera(CameraUpdateFactory.zoomTo(16.5f));
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void startMapAnimation(boolean z) {
        if (!this.ac) {
            LogUtil.a("Track_GaoDeMap", "startMapAnimation error ");
            InterfaceMapCallback interfaceMapCallback = this.bf;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
                return;
            }
            return;
        }
        AMap aMap = this.f38857c;
        if (aMap == null) {
            return;
        }
        if (!z) {
            this.aa = true;
            cancelAnimation();
            return;
        }
        aMap.setOnMapTouchListener(new b(this));
        this.aa = true;
        if (njy.b(this.q) && njy.b(this.bb)) {
            addStartMarker(b(this.q.get(0)), this.bb.get(0).intValue());
            this.bc.get(0).setZIndex(14.0f);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(300L);
        this.bc.get(0).setAnimation(scaleAnimation);
        this.bc.get(0).startAnimation();
        this.ao.postDelayed(new Runnable() { // from class: jrb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.ad = true;
        this.ap.get(0).d();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public boolean isAnimationStart() {
        return this.ad;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void cancelAnimation() {
        if (this.aa) {
            this.ad = true;
            this.aa = false;
            if (a() || this.f == null || this.bb == null) {
                ReleaseLogUtil.a("Track_GaoDeMap", "cancel animal draw list is null");
                return;
            }
            if (this.f38857c == null) {
                LogUtil.e("Track_GaoDeMap", "cancel animal mAMap is null");
                return;
            }
            b();
            for (int i = 0; i < this.s; i++) {
                this.ap.get(i).c();
                if (!e(i)) {
                    break;
                }
                Marker markerA = izt.a(this.f38857c, izt.a(this.q.get(i)), this.bb.get(i).intValue());
                if (markerA != null) {
                    markerA.setZIndex(14.0f);
                }
                if (i == this.s - 1) {
                    this.k = this.f38857c.addMarker(new MarkerOptions().position(this.t.get(i)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_ending)).zIndex(14.0f));
                } else {
                    this.k = this.f38857c.addMarker(new MarkerOptions().position(this.t.get(i)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_change)).zIndex(14.0f));
                }
                for (PolylineOptions polylineOptions : this.f.get(i)) {
                    this.bg.put(this.f38857c.addPolyline(polylineOptions), polylineOptions);
                }
            }
            InterfaceMapCallback interfaceMapCallback = this.bf;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
            }
        }
    }

    private boolean a() {
        return this.q == null || this.t == null;
    }

    private boolean e(int i) {
        return this.q.size() > i && this.t.size() > i && this.f.size() > i && this.bb.size() > i;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showOrHide(boolean z) {
        c(z);
        LogUtil.a("Track_GaoDeMap", "showOrHide isShow = ", Boolean.valueOf(z));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showSatelLiteState(boolean z, boolean z2, int i) {
        if (z2) {
            i = 1;
        }
        setMapShowType(i);
        LogUtil.a("Track_GaoDeMap", "showSatelLiteState isShowMap = ", Boolean.valueOf(z), ",isShowTrackMapTypeSatellite=", Boolean.valueOf(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapShowType(int i) {
        if (this.ak == i) {
            return;
        }
        this.ak = i;
        setMapStyle(i);
        AMap aMap = this.f38857c;
        if (aMap != null) {
            if (i == 1) {
                aMap.setMapType(2);
            } else {
                if (i != 3) {
                    return;
                }
                aMap.setMapType(3);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapStyle(int i) {
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        if (i != 0) {
            return;
        }
        try {
            InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open("maps/gaode_entrance_style.data");
            try {
                InputStream inputStreamOpen2 = BaseApplication.getContext().getAssets().open("maps/gaode_entrance_style_extra.data");
                try {
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    byte[] bArr2 = new byte[inputStreamOpen2.available()];
                    if (inputStreamOpen.read(bArr) != -1) {
                        customMapStyleOptions.setStyleData(bArr);
                    }
                    if (inputStreamOpen2.read(bArr2) != -1) {
                        customMapStyleOptions.setStyleExtraData(bArr2);
                    }
                    if (inputStreamOpen2 != null) {
                        inputStreamOpen2.close();
                    }
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    AMap aMap = this.f38857c;
                    if (aMap != null) {
                        aMap.setCustomMapStyle(customMapStyleOptions);
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e) {
            LogUtil.e("Track_GaoDeMap", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerAnimationListener(InterfaceMapCallback interfaceMapCallback) {
        this.bf = interfaceMapCallback;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<jpg> requestSimplePoints() {
        return this.az;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<MotionData> convertCoordinate(List<MotionData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MotionData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(izt.b(it.next(), getMapEngineType()));
        }
        return arrayList;
    }

    private void h() {
        Context context = this.m;
        if (context == null || context.getResources() == null) {
            ReleaseLogUtil.a("Track_GaoDeMap", "setBoundAndLine mContext is null");
            return;
        }
        LatLng latLng = this.j.southwest;
        LatLng latLng2 = this.j.northeast;
        LatLng latLng3 = new LatLng(latLng2.latitude - ((latLng2.latitude - latLng.latitude) * 1.55d), latLng.longitude);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(this.j.northeast);
        builder.include(latLng3);
        LatLngBounds latLngBoundsBuild = builder.build();
        this.j = latLngBoundsBuild;
        this.h = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, (int) this.m.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.m.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d), 20);
        this.i = CameraUpdateFactory.changeLatLng(new LatLng((this.j.northeast.latitude + this.j.southwest.latitude) / 2.0d, (this.j.northeast.longitude + this.j.southwest.longitude) / 2.0d));
        CommonUtil.d("Track_GaoDeMap", "before draw time");
        for (int i = 0; i < this.s; i++) {
            b(this.j, i);
        }
        CommonUtil.d("Track_GaoDeMap", "after draw time");
        moveToCenter();
        this.ac = true;
        if (this.ae) {
            this.f38857c = null;
        }
    }

    private void b(LatLngBounds latLngBounds, final int i) {
        if (njy.e(this.q)) {
            ReleaseLogUtil.e("Track_GaoDeMap", "setLocationMarker mDetailStartList is empty");
            return;
        }
        final SmoothMarkerUtil smoothMarkerUtil = new SmoothMarkerUtil(this.f38857c, this.q.get(i));
        smoothMarkerUtil.c(BitmapDescriptorFactory.fromResource(R.drawable.track_detail_anim_marker));
        List<List<jqw>> list = this.f38856a;
        if (list != null && list.size() > i) {
            smoothMarkerUtil.e(this.f38856a.get(i), AMapUtils.calculateLineDistance(latLngBounds.northeast, latLngBounds.southwest));
        }
        smoothMarkerUtil.e(new SmoothMarkerUtil.SmoothMarkerListner() { // from class: jqu.7
            @Override // com.huawei.healthcloud.plugintrack.ui.fragmentutils.trackanimationutil.SmoothMarkerUtil.SmoothMarkerListner
            public void onFinished() {
                jqu.this.b();
                if (jqu.this.t == null || jqu.this.t.size() <= i) {
                    LogUtil.e("Track_GaoDeMap", "Endlist is null");
                } else if (jqu.this.s != i + 1) {
                    jqu jquVar = jqu.this;
                    jquVar.k = jquVar.f38857c.addMarker(new MarkerOptions().position((LatLng) jqu.this.t.get(i)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_change)).zIndex(14.0f));
                } else {
                    Bitmap bitmapB = izt.b((List<jpk>) jqu.this.u);
                    if (bitmapB == null) {
                        bitmapB = BitmapFactory.decodeResource(jqu.this.m.getResources(), R.drawable.hw_show_map_ending);
                    }
                    jqu jquVar2 = jqu.this;
                    jquVar2.k = jquVar2.f38857c.addMarker(new MarkerOptions().position((LatLng) jqu.this.t.get(i)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromBitmap(bitmapB)).zIndex(14.0f));
                }
                jqu.this.c(i + 1);
                jqu.this.a(smoothMarkerUtil.a());
            }
        });
        this.ap.add(smoothMarkerUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Polyline> list) {
        if (list == null) {
            return;
        }
        for (Polyline polyline : list) {
            this.bg.put(polyline, polyline.getOptions());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(500L);
        this.k.setAnimation(scaleAnimation);
        this.k.startAnimation();
        if (this.s == i) {
            this.ao.sendEmptyMessageDelayed(0, 500L);
        } else {
            this.ao.sendMessageDelayed(Message.obtain(this.ao, 1, Integer.valueOf(i)), 500L);
        }
    }

    private void c(List<LatLng> list, LatLngBounds.Builder builder, LatLng latLng) {
        if (njy.b(list)) {
            list.add(latLng);
            if (izt.a(izt.a(latLng))) {
                return;
            }
            builder.include(latLng);
            return;
        }
        if (izt.a(izt.a(latLng))) {
            return;
        }
        list.add(latLng);
        builder.include(latLng);
        this.y = true;
    }

    private List<PolylineOptions> a(jrp jrpVar, LatLngBounds.Builder builder) {
        if (njy.e(jrpVar.a())) {
            ReleaseLogUtil.e("Track_GaoDeMap", "otherPolylineOptions mAnimalLines is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        List<jpf> listA = jrpVar.a();
        for (int i = 0; i < listA.size(); i++) {
            jpf jpfVar = listA.get(i);
            int iA = jpfVar.a();
            ArrayList arrayList2 = new ArrayList(jpfVar.d().size());
            for (jpg jpgVar : jpfVar.d()) {
                LatLng latLng = new LatLng(jpgVar.d, jpgVar.f38787a);
                if (iA != 2) {
                    this.az.add(jpgVar);
                    builder.include(latLng);
                }
                arrayList2.add(latLng);
            }
            arrayList.add(d(jpfVar, arrayList2));
        }
        return arrayList;
    }

    private PolylineOptions d(jpf jpfVar, List<LatLng> list) {
        PolylineOptions polylineOptions = new PolylineOptions();
        jqw jqwVar = new jqw();
        jqwVar.e(list);
        int iA = jpfVar.a();
        if (iA == 0) {
            a(jpfVar, list, polylineOptions, jqwVar);
        } else if (iA == 1) {
            e(jpfVar, list, polylineOptions, jqwVar);
        } else if (iA == 2) {
            d(jpfVar, list, polylineOptions, jqwVar);
        } else {
            LogUtil.a("Track_GaoDeMap", "makeLinePolylineOptions on errer type");
        }
        int size = this.f38856a.size();
        int i = this.aq;
        if (size > i) {
            this.f38856a.get(i).add(jqwVar);
            return polylineOptions;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jqwVar);
        this.f38856a.add(arrayList);
        return polylineOptions;
    }

    private void a(jpf jpfVar, List<LatLng> list, PolylineOptions polylineOptions, jqw jqwVar) {
        this.y = true;
        List<Integer> listB = jpfVar.b();
        jqwVar.d(listB);
        jqwVar.b(0);
        polylineOptions.width(15.0f).zIndex(10.0f).visible(true).colorValues(listB).addAll(list);
    }

    private void e(jpf jpfVar, List<LatLng> list, PolylineOptions polylineOptions, jqw jqwVar) {
        this.y = true;
        int iIntValue = jpfVar.b().size() > 0 ? jpfVar.b().get(0).intValue() : this.l;
        jqwVar.a(iIntValue);
        jqwVar.b(1);
        polylineOptions.width(15.0f).zIndex(10.0f).visible(true).color(iIntValue).addAll(list);
    }

    private void d(jpf jpfVar, List<LatLng> list, PolylineOptions polylineOptions, jqw jqwVar) {
        int iIntValue = jpfVar.b().size() > 0 ? jpfVar.b().get(0).intValue() : BaseApplication.getContext().getResources().getColor(R.color.pause_line);
        jqwVar.a(iIntValue);
        jqwVar.b(2);
        polylineOptions.color(iIntValue).width(15.0f).zIndex(10.0f).setDottedLine(true).visible(izt.d()).addAll(list);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded() {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: jqu.10
                @Override // com.amap.api.maps.AMap.OnMapLoadedListener
                public void onMapLoaded() {
                    if (jqu.this.f38857c == null) {
                        return;
                    }
                    jqu.this.ah = true;
                    Location locationE = izt.e(jqu.this.m);
                    if (locationE != null) {
                        double[] dArrB = izt.b(jqu.this.m, locationE);
                        jqu.this.f38857c.moveCamera(CameraUpdateFactory.changeLatLng(new LatLng(dArrB[0], dArrB[1])));
                        jqu.this.f38857c.moveCamera(CameraUpdateFactory.zoomTo(16.5f));
                    }
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOnMapLoadedListener(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: jqu.13
                @Override // com.amap.api.maps.AMap.OnMapLoadedListener
                public void onMapLoaded() {
                    jqu.this.ah = true;
                    InterfaceMapLoadedCallback interfaceMapLoadedCallback2 = interfaceMapLoadedCallback;
                    if (interfaceMapLoadedCallback2 != null) {
                        interfaceMapLoadedCallback2.onMapLoaded();
                    }
                }
            });
        }
    }

    private void b(List<njj> list, List<LatLng> list2, List<LatLng> list3) {
        int size = list2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            LatLng latLng = list2.get(i2);
            if (izt.a(izt.a(latLng))) {
                if (!list3.isEmpty()) {
                    d(i, i2, list3, list);
                    list3.clear();
                }
                a(list2, i2);
                i = i2 + 1;
            } else {
                list3.add(latLng);
            }
        }
        LogUtil.a("Track_GaoDeMap", "sportList SIZE:", Integer.valueOf(list3.size()));
        if (list3.isEmpty()) {
            return;
        }
        d(i, size, list3, list);
    }

    private void a(List<LatLng> list, int i) {
        LatLng latLngB = b(list, i);
        LatLng latLngD = d(list, i);
        if (latLngB == null || latLngD == null) {
            return;
        }
        b(new PolylineOptions().color(BaseApplication.getContext().getResources().getColor(R.color.pause_line)).width(15.0f).zIndex(10.0f).setDottedLine(true).visible(izt.d()).add(latLngB, latLngD));
    }

    private LatLng d(List<LatLng> list, int i) {
        if (i < list.size() - 1) {
            return list.get(i + 1);
        }
        return null;
    }

    private LatLng b(List<LatLng> list, int i) {
        if (i >= 1) {
            return list.get(i - 1);
        }
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraLatLngBounds(List<jpg> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_GaoDeMap", "moveCameraLatLngBounds list is null");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int size = list.size();
        Iterator<jpg> it = list.iterator();
        while (it.hasNext()) {
            builder.include(a(it.next()));
        }
        if (size > 1) {
            this.f38857c.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), (int) this.m.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.m.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d), 20));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void getMapScreenShot(final Handler handler, MotionData motionData) {
        if (handler == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "getMapScreenShot handler is null");
            return;
        }
        AMap.OnMapScreenShotListener onMapScreenShotListener = new AMap.OnMapScreenShotListener() { // from class: jqu.12
            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int i) {
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
                Message messageObtain = Message.obtain(handler);
                messageObtain.obj = bitmap;
                messageObtain.what = 1;
                messageObtain.sendToTarget();
                jqu.this.av = null;
            }
        };
        this.av = onMapScreenShotListener;
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.getMapScreenShot(onMapScreenShotListener);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setAllGesturesEnabled(boolean z) {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.getUiSettings().setAllGesturesEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScaleControlsEnabled(boolean z) {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.getUiSettings().setScaleControlsEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setZoomControlsEnabled(boolean z) {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            aMap.getUiSettings().setZoomControlsEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreate(Bundle bundle, boolean z, boolean z2) {
        LogUtil.d("Track_GaoDeMap", "onCreate():");
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "onCreate mAmap is null");
            return;
        }
        if (this.al == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "onCreate mMapView is null");
            return;
        }
        aMap.getUiSettings().setZoomControlsEnabled(false);
        this.f38857c.getUiSettings().setMyLocationButtonEnabled(false);
        this.f38857c.getUiSettings().setTiltGesturesEnabled(false);
        if (z) {
            setPointToCenterWhole(true);
        }
        if (this.al.getChildCount() <= 0) {
            this.al.onCreate(bundle);
        } else {
            LogUtil.j("Track_GaoDeMap", "onCreate: MapView ChildCount = ", Integer.valueOf(this.al.getChildCount()));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onSaveInstanceState(Bundle bundle) {
        TextureMapView textureMapView = this.al;
        if (textureMapView != null) {
            textureMapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenter(int i, int i2) {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "setPointToCenter mAmap is null");
        } else {
            aMap.setPointToCenter(i, i2);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenterWhole(boolean z) {
        if (this.f38857c == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "setPointToCenterWhole mAmap is null");
            return;
        }
        WindowManager windowManager = (WindowManager) this.m.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        if (z) {
            this.f38857c.setPointToCenter(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 4);
        } else {
            this.f38857c.setPointToCenter(displayMetrics.widthPixels / 2, (displayMetrics.heightPixels * 2) / 5);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getZoomToSpanLevel(jpg jpgVar, jpg jpgVar2) {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.e("Track_GaoDeMap", "getZoomToSpanLevel mAmap is null");
            return f38855b;
        }
        return aMap.getZoomToSpanLevel(izt.b(jpgVar), izt.b(jpgVar2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScreenOnOrForegrand(boolean z) {
        TextureMapView textureMapView = this.al;
        if (textureMapView == null) {
            return;
        }
        this.ag = z;
        textureMapView.setBackgroundColor(this.m.getResources().getColor(R.color.common_color_white));
        if (z) {
            this.al.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.al.setVisibility(0);
            this.al.invalidate();
            forceDrawLine();
            return;
        }
        this.al.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        this.al.setVisibility(8);
        this.al.invalidate();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResume() {
        TextureMapView textureMapView = this.al;
        if (textureMapView != null) {
            textureMapView.onResume();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPause() {
        TextureMapView textureMapView = this.al;
        if (textureMapView != null) {
            textureMapView.onPause();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroy() {
        this.ae = true;
        Marker marker = this.k;
        if (marker != null) {
            marker.setAnimationListener(null);
            this.k = null;
        }
        List<Marker> list = this.bc;
        if (list != null) {
            for (Marker marker2 : list) {
                if (marker2 != null) {
                    marker2.setAnimationListener(null);
                }
            }
            this.bc.clear();
        }
        List<SmoothMarkerUtil> list2 = this.ap;
        if (list2 != null) {
            for (SmoothMarkerUtil smoothMarkerUtil : list2) {
                if (smoothMarkerUtil != null) {
                    smoothMarkerUtil.b();
                }
            }
            this.ap.clear();
        }
        e();
        if (this.m != null) {
            this.m = null;
        }
        Handler handler = this.ao;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.e;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        this.bf = null;
        if (this.f38857c != null) {
            if (!this.ab || this.ac) {
                this.f38857c = null;
            }
        }
    }

    private void e() {
        TextureMapView textureMapView = this.al;
        if (textureMapView != null) {
            textureMapView.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.af) {
            return;
        }
        this.e.removeMessages(0);
        this.e.removeMessages(1);
        Message messageObtainMessage = this.e.obtainMessage();
        messageObtainMessage.what = i;
        this.e.sendMessageDelayed(messageObtainMessage, 900L);
    }

    public void c(boolean z) {
        if (!this.y) {
            ReleaseLogUtil.e("Track_GaoDeMap", "No PolygonCenter, no latlng point!");
            return;
        }
        Polygon polygon = this.au;
        if (polygon != null) {
            polygon.remove();
        }
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.a("Track_GaoDeMap", "showMapLayer mAMap is null return");
        } else if (this.m != null) {
            if (z) {
                this.au = aMap.addPolygon(new PolygonOptions().addAll(d()).zIndex(9.0f).fillColor(this.m.getResources().getColor(R.color.hw_show_black_0alpha)).strokeColor(0).strokeWidth(1.0f));
            } else {
                this.au = aMap.addPolygon(new PolygonOptions().addAll(d()).zIndex(9.0f).fillColor(this.m.getResources().getColor(R.color.hide_map_color)).strokeColor(0).strokeWidth(1.0f));
            }
        }
    }

    private List<LatLng> d() {
        return Arrays.asList(new LatLng(-89.9d, -179.9d), new LatLng(89.9d, -179.9d), new LatLng(89.9d, 179.9d), new LatLng(-89.9d, 179.9d));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setShowMapEnd(boolean z) {
        this.ab = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCameraChangeListener() {
        j();
    }

    private void j() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            ReleaseLogUtil.a("Track_GaoDeMap", "setOnCameraChangeListener mAMap is null!");
        } else {
            aMap.setOnCameraChangeListener(new AMap.OnCameraChangeListener(this) { // from class: jqu.15
                @Override // com.amap.api.maps.AMap.OnCameraChangeListener
                public void onCameraChange(CameraPosition cameraPosition) {
                }

                @Override // com.amap.api.maps.AMap.OnCameraChangeListener
                public void onCameraChangeFinish(CameraPosition cameraPosition) {
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void forceDrawLine() {
        if (this.am.size() <= 0) {
            return;
        }
        this.ay.setPoints(this.am);
        this.ax = b(this.ay);
        List<LatLng> list = this.am;
        addEndMarker(b(list.get(list.size() - 1)));
        List<LatLng> list2 = this.am;
        animateCamera(b(list2.get(list2.size() - 1)), 0L, (InterfaceMapCallback) null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveToCenter() {
        AMap aMap;
        CameraUpdate cameraUpdate = this.h;
        if (cameraUpdate == null || (aMap = this.f38857c) == null) {
            return;
        }
        aMap.moveCamera(cameraUpdate);
        this.f38857c.moveCamera(this.i);
    }

    private void a(int i) {
        if (this.m == null) {
            LogUtil.j("Track_GaoDeMap", "mContext is null in setTrackMarkers");
            return;
        }
        int i2 = i - 1;
        while (i2 < this.aj.size()) {
            if (this.aj.get(i2).f38873c) {
                this.as.add(this.f38857c.addMarker(izt.b(this.m.getResources(), this.aj.get(i2).f38871a, UnitUtil.e(this.aj.get(i2).f38872b, 1, 0))));
            }
            i2 += i;
        }
        LogUtil.d("Track_GaoDeMap", "mMarkersList.size = ", Integer.valueOf(this.as.size()));
    }

    private void c() {
        Iterator<Marker> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.as.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void intervalTrackMarkers(int i) {
        if (i == -1 || i == 0) {
            c();
        } else {
            a(i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom() {
        moveCameraByZoom(13.5f);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom(float f) {
        this.f38857c.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByLatLng(jpg jpgVar) {
        this.f38857c.moveCamera(CameraUpdateFactory.changeLatLng(izt.b(jpgVar)));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, double[] dArr) {
        return izt.a(this.m, dArr);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, Location location) {
        return izt.b(this.m, location);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void updateSportMarker(jpg jpgVar, BitmapDrawable bitmapDrawable) {
        Marker marker = this.k;
        if (marker != null) {
            marker.remove();
        }
        this.k = this.f38857c.addMarker(new MarkerOptions().position(izt.b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(bitmapDrawable.getBitmap())));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg convertLocationByCoordinate(Location location) {
        CoordinateConverter coordinateConverter = new CoordinateConverter(this.m);
        coordinateConverter.from(CoordinateConverter.CoordType.GPS);
        coordinateConverter.coord(new LatLng(location.getLatitude(), location.getLongitude()));
        return izt.a(coordinateConverter.convert());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setSportTabCenter(DisplayMetrics displayMetrics) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "mAmap is null");
            return;
        }
        this.f38857c.setPointToCenter((displayMetrics.widthPixels / 2) - this.m.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart), qrs.d(this.m, 120.0f));
        this.f38857c.setMyLocationStyle(new MyLocationStyle());
        this.f38857c.getUiSettings().setMyLocationButtonEnabled(false);
        this.f38857c.setMyLocationEnabled(false);
        this.f38857c.setMyLocationType(6);
    }

    static class b implements AMap.OnMapTouchListener {
        private WeakReference<jqu> d;

        b(jqu jquVar) {
            this.d = new WeakReference<>(jquVar);
        }

        @Override // com.amap.api.maps.AMap.OnMapTouchListener
        public void onTouch(MotionEvent motionEvent) {
            jqu jquVar = this.d.get();
            if (jquVar != null) {
                jquVar.cancelAnimation();
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLng f38871a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38873c = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38872b = 0;

        a() {
        }

        public String toString() {
            return "to show" + this.f38873c;
        }
    }

    private LatLng a(jpg jpgVar) {
        return izt.d(jpgVar);
    }

    public static jpg b(LatLng latLng) {
        return new jpg(latLng.latitude, latLng.longitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jrr a(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        jrr jrrVar = new jrr();
        jrrVar.b(cameraPosition.bearing).d(b(cameraPosition.target)).c(cameraPosition.tilt).a(cameraPosition.zoom);
        return jrrVar;
    }

    private CameraPosition b(jrr jrrVar) {
        if (jrrVar == null) {
            return null;
        }
        return new CameraPosition(a(jrrVar.a()), jrrVar.e(), jrrVar.d(), jrrVar.c());
    }

    private AMap.CancelableCallback c(final InterfaceMapCallback interfaceMapCallback) {
        return new AMap.CancelableCallback(this) { // from class: jqu.14
            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
                InterfaceMapCallback interfaceMapCallback2 = interfaceMapCallback;
                if (interfaceMapCallback2 != null) {
                    interfaceMapCallback2.onFinish();
                }
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
                InterfaceMapCallback interfaceMapCallback2 = interfaceMapCallback;
                if (interfaceMapCallback2 != null) {
                    interfaceMapCallback2.onCancel();
                }
            }
        };
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLogoPadding(int i, int i2, int i3, int i4) {
        AMap aMap = this.f38857c;
        if (aMap != null) {
            UiSettings uiSettings = aMap.getUiSettings();
            uiSettings.setLogoBottomMargin(i4 + qrs.d(BaseApplication.getContext(), 2.0f));
            uiSettings.setLogoLeftMargin(i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jrr getMapStatus() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in getMapStatus");
            return new jrr();
        }
        jrr jrrVarA = a(aMap.getCameraPosition());
        if (jrrVarA == null) {
            return new jrr();
        }
        jrrVarA.e(this.f38857c.getScalePerPixel());
        return jrrVarA;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jrr jrrVar, long j, final InterfaceMapCallback interfaceMapCallback) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in animateCamera");
            return;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(b(jrrVar));
        if (j <= 0) {
            this.f38857c.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.f38857c.animateCamera(cameraUpdateNewCameraPosition, j, new AMap.CancelableCallback(this) { // from class: jqu.11
                @Override // com.amap.api.maps.AMap.CancelableCallback
                public void onFinish() {
                    InterfaceMapCallback interfaceMapCallback2 = interfaceMapCallback;
                    if (interfaceMapCallback2 != null) {
                        interfaceMapCallback2.onFinish();
                    }
                }

                @Override // com.amap.api.maps.AMap.CancelableCallback
                public void onCancel() {
                    InterfaceMapCallback interfaceMapCallback2 = interfaceMapCallback;
                    if (interfaceMapCallback2 != null) {
                        interfaceMapCallback2.onCancel();
                    }
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addLinePoint(jrt jrtVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in drawLine");
            return;
        }
        if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
            return;
        }
        if (this.d.size() <= 0) {
            this.d.add(this.f38857c.addPolyline(new PolylineOptions().add(a(jrtVar.d())).width(jrtVar.a()).color(jrtVar.e()).setDottedLine(jrtVar.j()).setDottedLineType(1)));
            return;
        }
        int size = this.d.size() - 1;
        if (this.d.get(size) == null || b(this.d.get(size), jrtVar) || njy.e(this.d.get(size).getPoints()) || this.d.get(size).getPoints().size() > 242) {
            PolylineOptions dottedLineType = new PolylineOptions().add(a(jrtVar.d())).width(jrtVar.a()).color(jrtVar.e()).setDottedLine(jrtVar.j()).setDottedLineType(1);
            if (!jrtVar.j()) {
                dottedLineType.add(a(jrtVar.b()));
            }
            this.d.add(this.f38857c.addPolyline(dottedLineType));
            return;
        }
        PolylineOptions options = this.d.get(size).getOptions();
        List<LatLng> points = options.getPoints();
        if (points != null) {
            points.add(izt.b(jrtVar.d()));
            points.add(izt.b(jrtVar.b()));
            options.setPoints(points);
            Polyline polylineAddPolyline = this.f38857c.addPolyline(options);
            this.d.get(size).remove();
            this.d.remove(size);
            this.d.add(polylineAddPolyline);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void removeLinePoint() {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in drawLine");
            return;
        }
        if (this.d.size() <= 0) {
            return;
        }
        int size = this.d.size() - 1;
        List<LatLng> points = this.d.get(size).getPoints();
        if (points != null) {
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                PolylineOptions options = this.d.get(size).getOptions();
                options.setPoints(points);
                Polyline polylineAddPolyline = this.f38857c.addPolyline(options);
                this.d.get(size).remove();
                this.d.remove(size);
                this.d.add(polylineAddPolyline);
                return;
            }
            this.d.get(size).remove();
            this.d.remove(size);
            return;
        }
        this.d.get(size).remove();
        this.d.remove(size);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jrt jrtVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in drawLine");
        } else {
            if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
                return;
            }
            this.f38857c.addPolyline(new PolylineOptions().add(a(jrtVar.d()), a(jrtVar.b())).width(jrtVar.a()).color(jrtVar.e()).setDottedLine(jrtVar.j()).setDottedLineType(1));
        }
    }

    private boolean b(Polyline polyline, jrt jrtVar) {
        if (!polyline.isDottedLine() || jrtVar.j()) {
            return !polyline.isDottedLine() && jrtVar.j();
        }
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String drawLines(jrs jrsVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in drawLine");
            return null;
        }
        if (jrsVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jrsVar.g() == null) {
            if (jrsVar.d() == null || jrsVar.b() == null) {
                return null;
            }
            arrayList.add(a(jrsVar.d()));
            arrayList.add(a(jrsVar.b()));
        } else {
            Iterator<jpg> it = jrsVar.g().iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
        }
        PolylineOptions polylineOptionsVisible = new PolylineOptions().addAll(arrayList).width(jrsVar.a()).setDottedLine(jrsVar.j()).setDottedLineType(1).zIndex(jrsVar.c()).useGradient(jrsVar.i()).visible(jrsVar.f());
        if (njy.e(jrsVar.h())) {
            polylineOptionsVisible.color(jrsVar.e());
        } else {
            polylineOptionsVisible.colorValues(jrsVar.h());
        }
        Polyline polylineAddPolyline = this.f38857c.addPolyline(polylineOptionsVisible);
        String id = polylineAddPolyline.getId();
        this.at.put(id, polylineAddPolyline);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.e("Track_GaoDeMap", "id is null in setLineVisible");
            return;
        }
        Polyline polyline = this.at.get(str);
        if (polyline == null) {
            return;
        }
        polyline.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMaxZoomLevel() {
        return this.f38857c.getMaxZoomLevel();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public GrowAnimationBuilder getGrowAnimation() {
        return new jrc();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int addMarker(jrv jrvVar, GrowAnimationBuilder growAnimationBuilder) {
        if (jrvVar == null || jrvVar.b() == null) {
            return -1;
        }
        MarkerOptions markerOptionsVisible = new MarkerOptions().setFlat(jrvVar.h()).anchor(((Float) jrvVar.a().first).floatValue(), ((Float) jrvVar.a().second).floatValue()).zIndex(jrvVar.c()).draggable(jrvVar.i()).icon(BitmapDescriptorFactory.fromBitmap(jrvVar.b())).position(a(jrvVar.e())).visible(jrvVar.f());
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in addMarker");
            return -1;
        }
        Marker markerAddMarker = aMap.addMarker(markerOptionsVisible);
        if (growAnimationBuilder instanceof jrc) {
            ((jrc) growAnimationBuilder).d(markerAddMarker);
            growAnimationBuilder.displayAnimation();
        }
        markerAddMarker.setToTop();
        if (this.ar == null) {
            this.ar = new Vector<>(10);
        }
        this.ar.add(markerAddMarker);
        return this.ar.size() - 1;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in restoreMarker");
            return;
        }
        Vector<Marker> vector = this.ar;
        if (vector == null || i < 0 || i >= vector.size()) {
            return;
        }
        Marker marker = this.ar.get(i);
        if (growAnimationBuilder == null) {
            marker.setVisible(true);
        }
        if (growAnimationBuilder instanceof jrc) {
            ((jrc) growAnimationBuilder).d(marker);
            growAnimationBuilder.displayAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void hideMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in deleteMarker");
            return;
        }
        Vector<Marker> vector = this.ar;
        if (vector == null || i < 0 || i >= vector.size()) {
            return;
        }
        Marker marker = this.ar.get(i);
        if (growAnimationBuilder == null) {
            marker.setVisible(false);
        }
        if (growAnimationBuilder instanceof jrc) {
            ((jrc) growAnimationBuilder).d(marker);
            growAnimationBuilder.disappearAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIcon(int i, Bitmap bitmap) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in setMarkerIcon");
            return;
        }
        Vector<Marker> vector = this.ar;
        if (vector == null || i < 0 || i >= vector.size()) {
            LogUtil.e("Track_GaoDeMap", "id is error in setMarkerIcon");
        } else {
            this.ar.get(i).setIcon(BitmapDescriptorFactory.fromBitmap(bitmap));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveMarker(int i, jpg jpgVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in deleteMarker");
            return;
        }
        Vector<Marker> vector = this.ar;
        if (vector == null || i < 0 || i >= vector.size()) {
            return;
        }
        this.ar.get(i).setPosition(a(jpgVar));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void clear() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "bounds is null in clear");
            return;
        }
        aMap.clear();
        this.ar = new Vector<>(10);
        this.d.clear();
        this.bg.clear();
        this.aw.clear();
        this.at.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void stopAnimation() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "bounds is null in clear");
        } else {
            aMap.stopAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPreviewStatus(jrm jrmVar, int i, int i2, int i3, int i4) {
        if (jrmVar == null) {
            LogUtil.e("Track_GaoDeMap", "bounds is null in setPreviewStatus");
        } else if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in setPreviewStatus");
        } else {
            this.f38857c.moveCamera(CameraUpdateFactory.newLatLngBoundsRect(new LatLngBounds.Builder().include(a(jrmVar.d())).include(a(jrmVar.b())).build(), i, i2, i3, i4));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapLoadedCallback(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in setMapLoadedCallback");
        } else {
            if (interfaceMapLoadedCallback == null) {
                return;
            }
            this.f38857c.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: jqu.5
                @Override // com.amap.api.maps.AMap.OnMapLoadedListener
                public void onMapLoaded() {
                    jqu.this.ah = true;
                    interfaceMapLoadedCallback.onMapLoaded();
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setCameraChangeCallback(final InterfaceMapStatusChangeCallback interfaceMapStatusChangeCallback) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in setCameraChangeCallback");
        } else {
            if (interfaceMapStatusChangeCallback == null) {
                return;
            }
            this.f38857c.setOnCameraChangeListener(new AMap.OnCameraChangeListener() { // from class: jqu.1
                @Override // com.amap.api.maps.AMap.OnCameraChangeListener
                public void onCameraChange(CameraPosition cameraPosition) {
                    interfaceMapStatusChangeCallback.onMapStatusChange(jqu.this.a(cameraPosition));
                }

                @Override // com.amap.api.maps.AMap.OnCameraChangeListener
                public void onCameraChangeFinish(CameraPosition cameraPosition) {
                    interfaceMapStatusChangeCallback.onMapStatusChangeFinish(jqu.this.a(cameraPosition));
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreatePurely(Bundle bundle) {
        TextureMapView textureMapView = this.al;
        if (textureMapView == null) {
            LogUtil.e("Track_GaoDeMap", "mapview is null in onCreatePurely");
        } else if (textureMapView.getChildCount() <= 0) {
            this.al.onCreate(bundle);
        } else {
            LogUtil.j("Track_GaoDeMap", "onCreatePurely: MapView ChildCount = ", Integer.valueOf(this.al.getChildCount()));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPausePurely() {
        TextureMapView textureMapView = this.al;
        if (textureMapView == null) {
            LogUtil.e("Track_GaoDeMap", "mapview is null in onPausePurely");
        } else {
            textureMapView.onPause();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResumePurely() {
        TextureMapView textureMapView = this.al;
        if (textureMapView == null) {
            LogUtil.e("Track_GaoDeMap", "mapview is null in onResumePurely");
        } else {
            textureMapView.onResume();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroyPurely() {
        TextureMapView textureMapView = this.al;
        if (textureMapView == null) {
            LogUtil.e("Track_GaoDeMap", "mapview is null in onDestroyPurely");
        } else {
            textureMapView.onDestroy();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableAllGestures() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in disableAllGestures");
            return;
        }
        aMap.getUiSettings().setAllGesturesEnabled(false);
        this.f38857c.getUiSettings().setScaleControlsEnabled(false);
        this.f38857c.getUiSettings().setZoomControlsEnabled(false);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showPureMap() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in showPureMap");
            return;
        }
        aMap.showMapText(false);
        this.f38857c.getUiSettings().setCompassEnabled(false);
        this.f38857c.getUiSettings().setIndoorSwitchEnabled(false);
        this.f38857c.getUiSettings().setMyLocationButtonEnabled(false);
    }

    private void a(jes jesVar) {
        if (jesVar == null) {
            LogUtil.j("Track_GaoDeMap", "initCustomMapStyle customMapInformation == null");
            return;
        }
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        String strF = jesVar.f();
        String strH = jesVar.h();
        if (TextUtils.isEmpty(strF) || TextUtils.isEmpty(strH)) {
            LogUtil.j("Track_GaoDeMap", "TextUtils.isEmpty(dataName) || TextUtils.isEmpty(dataExtraName)");
            return;
        }
        customMapStyleOptions.setStyleDataPath(strF);
        customMapStyleOptions.setStyleExtraPath(strH);
        this.f38857c.setCustomMapStyle(customMapStyleOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeMapType(MapTypeDescription mapTypeDescription, jes jesVar) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in changeMapType");
            return;
        }
        if (mapTypeDescription == null) {
            LogUtil.e("Track_GaoDeMap", "type == null");
            return;
        }
        int i = AnonymousClass6.e[mapTypeDescription.e().ordinal()];
        if (i == 1) {
            this.f38857c.setMapType(2);
            return;
        }
        if (i == 2) {
            this.f38857c.setMapType(1);
            return;
        }
        if (i == 3) {
            this.f38857c.setMapType(3);
        } else if (i == 4) {
            this.f38857c.setMapType(4);
        } else {
            if (i != 5) {
                return;
            }
            a(jesVar);
        }
    }

    /* JADX INFO: renamed from: jqu$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[MapTypeDescription.MapType.values().length];
            e = iArr;
            try {
                iArr[MapTypeDescription.MapType.MAP_TYPE_SATELLITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[MapTypeDescription.MapType.MAP_TYPE_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[MapTypeDescription.MapType.MAP_TYPE_NIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[MapTypeDescription.MapType.MAP_TYPE_NAVI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[MapTypeDescription.MapType.MAP_TYPE_CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<jqu> f38874b;

        private c(Looper looper, jqu jquVar) {
            super(looper);
            this.f38874b = new WeakReference<>(jquVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            jqu jquVar = this.f38874b.get();
            if (jquVar == null) {
                LogUtil.j("Track_GaoDeMap", "MultiDrawHandler handleMessage gaoDeMap is null");
                return;
            }
            if (message == null) {
                LogUtil.j("Track_GaoDeMap", "MultiDrawHandler msg is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                jquVar.aa = false;
                if (jquVar.bf != null) {
                    jquVar.bf.onFinish();
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                if (jquVar.q.size() <= iIntValue || jquVar.bb.size() <= iIntValue) {
                    LogUtil.e("Track_GaoDeMap", "wrong branch return");
                    return;
                }
                Marker markerA = izt.a(jquVar.f38857c, izt.a((LatLng) jquVar.q.get(iIntValue)), ((Integer) jquVar.bb.get(iIntValue)).intValue());
                if (markerA == null) {
                    LogUtil.e("Track_GaoDeMap", "handleMessage marker is null");
                } else {
                    e(jquVar, iIntValue, markerA);
                }
            }
        }

        private void e(final jqu jquVar, final int i, Marker marker) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f);
            scaleAnimation.setDuration(300L);
            marker.setAnimation(scaleAnimation);
            marker.startAnimation();
            postDelayed(new Runnable() { // from class: jqx
                @Override // java.lang.Runnable
                public final void run() {
                    jqu.c.e(i, jquVar);
                }
            }, 300L);
            jquVar.bc.add(marker);
        }

        static /* synthetic */ void e(int i, jqu jquVar) {
            if (i >= jquVar.ap.size()) {
                LogUtil.j("Track_GaoDeMap", "setMarkerAnimation markerIndex is out of bounds");
                return;
            }
            jquVar.ad = true;
            jquVar.aa = true;
            ((SmoothMarkerUtil) jquVar.ap.get(i)).d();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapTilt() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            return 0.0f;
        }
        return aMap.getCameraPosition().tilt;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapZoom() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            return 0.0f;
        }
        return aMap.getCameraPosition().zoom;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public Point getScreenLocation(jpg jpgVar) {
        AMap aMap = this.f38857c;
        if (aMap == null || jpgVar == null) {
            LogUtil.e("Track_GaoDeMap", "huaweiMap is null or latlng is null");
            return new Point();
        }
        Projection projection = aMap.getProjection();
        if (projection == null) {
            LogUtil.e("Track_GaoDeMap", "projection is null or latlng is null");
            return new Point();
        }
        return projection.toScreenLocation(izt.b(jpgVar));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg getLatLngByScreenPoint(Point point) {
        AMap aMap = this.f38857c;
        if (aMap == null || point == null) {
            LogUtil.e("Track_GaoDeMap", "huaweiMap is null or point is null");
            return new jpg(0.0d, 0.0d);
        }
        Projection projection = aMap.getProjection();
        if (projection == null) {
            LogUtil.e("Track_GaoDeMap", "projection is null");
            return new jpg(0.0d, 0.0d);
        }
        return izt.a(projection.fromScreenLocation(point));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableMarkerClick() {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            LogUtil.e("Track_GaoDeMap", "mAMap is null in disableMarkerClick");
        } else {
            aMap.setOnMarkerClickListener(new AMap.OnMarkerClickListener(this) { // from class: jqu.2
                @Override // com.amap.api.maps.AMap.OnMarkerClickListener
                public boolean onMarkerClick(Marker marker) {
                    return true;
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addMarkerClickListener(final InterfaceMapMarkerClickCallback interfaceMapMarkerClickCallback) {
        AMap aMap = this.f38857c;
        if (aMap == null) {
            return;
        }
        aMap.setOnMarkerClickListener(new AMap.OnMarkerClickListener() { // from class: jqu.3
            @Override // com.amap.api.maps.AMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                int i = 0;
                if (interfaceMapMarkerClickCallback == null || marker == null) {
                    LogUtil.j("Track_GaoDeMap", "interfaceMapMarkerClickCallback or marker is null");
                    return false;
                }
                while (i < jqu.this.ar.size()) {
                    if (marker.equals(jqu.this.ar.get(i))) {
                        LogUtil.a("Track_GaoDeMap", "click Marker count:", Integer.valueOf(i));
                        interfaceMapMarkerClickCallback.onMarkerClick(i);
                        return true;
                    }
                    i++;
                }
                i = -1;
                LogUtil.a("Track_GaoDeMap", "click Marker count:", Integer.valueOf(i));
                interfaceMapMarkerClickCallback.onMarkerClick(i);
                return true;
            }
        });
    }

    static class d extends BaseHandler<jqu> {
        d(Looper looper, jqu jquVar) {
            super(looper, jquVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jqu jquVar, Message message) {
            if (message == null) {
                LogUtil.j("Track_GaoDeMap", "msg is null");
                return;
            }
            if (jquVar.o != null) {
                if (message.what == 0) {
                    if (BaseApplication.isRunningForeground() && jquVar.ag) {
                        jquVar.o.setVisible(false);
                    }
                    jquVar.b(1);
                    return;
                }
                if (message.what != 1) {
                    LogUtil.e("Track_GaoDeMap", "mAddCircleHandler msg is wrong");
                    return;
                }
                if (BaseApplication.isRunningForeground() && jquVar.ag) {
                    jquVar.o.setVisible(true);
                }
                jquVar.b(0);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<Integer> addHiHealthMarkers(List<jpk> list) {
        ArrayList<MarkerOptions> arrayListC = izt.c(list);
        ArrayList arrayList = new ArrayList();
        if (!njy.e(arrayListC)) {
            if (this.ar == null) {
                this.ar = new Vector<>();
            }
            Iterator<MarkerOptions> it = arrayListC.iterator();
            while (it.hasNext()) {
                this.ar.add(this.f38857c.addMarker(it.next()));
                arrayList.add(Integer.valueOf(this.ar.size() - 1));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jru jruVar, int i) {
        CameraUpdate cameraUpdateNewLatLngBounds;
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in animateCameraBounds");
            return;
        }
        if (jruVar == null || njy.e(jruVar.e())) {
            LogUtil.e("Track_GaoDeMap", "param is null in animateCameraByBounds");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<jpg> it = jruVar.e().iterator();
        while (it.hasNext()) {
            builder.include(izt.b(it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        LatLng latLng = new LatLng((latLngBoundsBuild.northeast.latitude + latLngBoundsBuild.southwest.latitude) / 2.0d, (latLngBoundsBuild.northeast.longitude + latLngBoundsBuild.southwest.longitude) / 2.0d);
        int iB = jruVar.b();
        int iA = jruVar.a();
        if (iB == 0 || iA == 0) {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, jruVar.d());
        } else {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, iB, iA, jruVar.d());
        }
        this.f38857c.moveCamera(cameraUpdateNewLatLngBounds);
        float f = cameraUpdateNewLatLngBounds.getCameraUpdateFactoryDelegate().zoom;
        float fC = jruVar.c();
        if (Float.compare(fC, 0.0f) != 0) {
            e(fC, latLng, f, i);
        }
    }

    private void e(float f, LatLng latLng, float f2, int i) {
        final CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latLng).bearing(f).zoom(f2).build());
        if (i <= 0) {
            this.f38857c.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.f38857c.animateCamera(cameraUpdateNewCameraPosition, i, new AMap.CancelableCallback() { // from class: jqu.9
                @Override // com.amap.api.maps.AMap.CancelableCallback
                public void onFinish() {
                }

                @Override // com.amap.api.maps.AMap.CancelableCallback
                public void onCancel() {
                    jqu.this.f38857c.moveCamera(cameraUpdateNewCameraPosition);
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void scrollBy(float f, float f2) {
        if (this.f38857c == null) {
            LogUtil.e("Track_GaoDeMap", "map is null in scrollBy");
        } else {
            this.f38857c.moveCamera(CameraUpdateFactory.scrollBy(f, f2));
        }
    }
}
