package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceSnapshotCallback;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.hms.maps.CameraUpdate;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.Projection;
import com.huawei.hms.maps.TextureMapView;
import com.huawei.hms.maps.model.BitmapDescriptor;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.Dot;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jrg implements InterfaceHiMap {
    private InterfaceMapCallback ab;
    private TextureMapView ac;
    private Polyline af;
    private Vector<Marker> ah;
    private List<jpg> am;
    private Marker as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38911c;
    private Handler d;
    private CameraPosition g;
    private Marker i;
    private Context j;
    private Marker k;
    private Polyline m;
    private boolean q;
    private HuaweiMap r;
    private String s;
    private boolean y = true;
    private boolean w = true;
    private boolean x = true;
    private List<LatLng> ax = new ArrayList(16);
    private List<jpg> ak = new ArrayList(16);
    private List<LatLng> n = new ArrayList(16);
    private List<Integer> ap = new ArrayList(16);
    private List<LatLng> ar = new ArrayList(16);
    private ArrayList<e> u = new ArrayList<>(16);
    private ArrayList<Marker> ai = new ArrayList<>(16);
    private ArrayList<MarkerOptions> aa = new ArrayList<>(16);
    private List<jpk> o = new ArrayList(16);
    private int l = 0;
    private int ao = 0;
    private int ag = 0;
    private CameraUpdate f = null;
    private List<PolylineOptions> aj = new ArrayList();
    private int z = -1;
    private volatile boolean t = false;
    private volatile boolean p = false;
    private int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Boolean> f38909a = new Hashtable();
    private Observable aq = new Observable();
    private Vector<Polyline> e = new Vector<>();
    private Polygon an = null;
    private boolean ad = false;
    private final Map<String, GroundOverlay> ae = new ConcurrentHashMap();
    private final Map<Polyline, PolylineOptions> aw = new ConcurrentHashMap();
    private final Map<String, Polyline> al = new ConcurrentHashMap();
    private int au = izw.q;
    private List<LatLng> v = new ArrayList(16);

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void cancelAnimation() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg convertLocationByCoordinate(Location location) {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, double[] dArr) {
        return dArr;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int getMapEngineType() {
        return 3;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getZoomToSpanLevel(jpg jpgVar, jpg jpgVar2) {
        return 15.0f;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public boolean isAnimationStart() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public boolean isClockwise() {
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCameraChangeListener() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreatePurely(Bundle bundle) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerAnimationListener(InterfaceMapCallback interfaceMapCallback) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void saveAddress(MotionData motionData) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenter(int i, int i2) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPointToCenterWhole(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScaleControlsEnabled(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setShowMapEnd(boolean z) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setSportTabCenter(DisplayMetrics displayMetrics) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void startMapAnimation(boolean z) {
    }

    public jrg(Context context, HuaweiMap huaweiMap, TextureMapView textureMapView) {
        this.j = context;
        this.r = huaweiMap;
        PolylineOptions polylineOptions = new PolylineOptions();
        this.ac = textureMapView;
        polylineOptions.color(this.au).width(5.0f).zIndex(10.0f).add(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)).visible(true);
        this.af = this.r.addPolyline(polylineOptions);
        this.r.getUiSettings().setZoomGesturesEnabled(true);
        this.d = new b(this);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jpg jpgVar, long j, InterfaceMapCallback interfaceMapCallback) {
        float f;
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "animateCamera hiHealthLatLng is null, please check");
            return;
        }
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            ReleaseLogUtil.e("Track_HmsMap", "animateCamera mHuaweiMap is null, please check");
            return;
        }
        if (this.y) {
            this.y = false;
            f = 16.5f;
        } else {
            if (huaweiMap.getCameraPosition() == null) {
                ReleaseLogUtil.e("Track_HmsMap", "getCameraPosition is null, please check");
                return;
            }
            f = this.r.getCameraPosition().zoom;
        }
        this.r.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(izt.c(jpgVar)).zoom(f).bearing(0.0f).tilt(25.0f).build()));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addLinePoint(jrt jrtVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in drawLine");
            return;
        }
        if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
            return;
        }
        if (this.e.size() <= 0) {
            this.e.add(this.r.addPolyline(new PolylineOptions().add(izt.c(jrtVar.d())).width(jrtVar.a() * 0.3f).color(jrtVar.e())));
            return;
        }
        int size = this.e.size() - 1;
        List<LatLng> points = this.e.get(size).getPoints();
        if (this.e.get(size) != null) {
            Vector<Polyline> vector = this.e;
            if (!c(jrtVar, vector.get(vector.size() - 1)) && !njy.e(points) && points.size() <= 242) {
                points.add(izt.c(jrtVar.d()));
                points.add(izt.c(jrtVar.b()));
                Vector<Polyline> vector2 = this.e;
                vector2.get(vector2.size() - 1).setPoints(points);
                return;
            }
        }
        PolylineOptions polylineOptionsColor = new PolylineOptions().add(izt.c(jrtVar.d())).width(jrtVar.a() * 0.3f).color(jrtVar.e());
        if (jrtVar.j()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Dot());
            polylineOptionsColor.pattern(arrayList);
        } else {
            polylineOptionsColor.add(izt.c(jrtVar.b()));
        }
        this.e.add(this.r.addPolyline(polylineOptionsColor));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void removeLinePoint() {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in drawLine");
            return;
        }
        if (this.e.size() <= 0) {
            LogUtil.e("Track_HmsMap", "mAheadMoveLines is empty");
            return;
        }
        int size = this.e.size() - 1;
        if (njy.e(this.e, size)) {
            LogUtil.e("Track_HmsMap", "removeLinePoint mAheadMoveLines isOutOfBounds ", Integer.valueOf(size));
            return;
        }
        List<LatLng> points = this.e.get(size).getPoints();
        if (points != null) {
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                this.e.get(size).setPoints(points);
                return;
            } else {
                this.e.get(size).remove();
                this.e.remove(size);
                return;
            }
        }
        this.e.get(size).remove();
        this.e.remove(size);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(List<jpi> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_HmsMap", "drawLine listBasePoint is empty, please check");
            return;
        }
        jpg jpgVarB = izy.b(list.get(list.size() - 1));
        this.v.add(izt.c(jpgVarB));
        if (this.w) {
            if (this.v.size() >= 2) {
                this.af.setPoints(this.v);
            }
            if (list.size() > 0) {
                addEndMarker(jpgVarB);
                animateCamera(jpgVarB, 1000L, (InterfaceMapCallback) null);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineColor(int i, boolean z) {
        Polyline polyline;
        this.au = i;
        if (!z || (polyline = this.af) == null) {
            return;
        }
        polyline.setColor(i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_HmsMap", "drawLine lastLatLng or currentLatLng is null");
            return;
        }
        addEndMarker(jpgVar2);
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.au).width(5.0f).zIndex(10.0f).visible(true).add(izt.c(jpgVar), izt.c(jpgVar2));
        this.r.addPolyline(polylineOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawInterrupt(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_HmsMap", "drawInterrupt lastLatLng or currentLatLng is null");
            return;
        }
        addEndMarker(jpgVar);
        Iterator<PolylineOptions> it = c(izt.c(jpgVar), izt.c(jpgVar2)).iterator();
        while (it.hasNext()) {
            this.r.addPolyline(it.next());
        }
    }

    public List<PolylineOptions> c(LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = latLng;
        ArrayList arrayList = new ArrayList();
        String str = "Track_HmsMap";
        if (latLng2 == null || latLng3 == null) {
            LogUtil.a("Track_HmsMap", "lastLatLng or currentLatLng is null");
            return arrayList;
        }
        double d = 18.0d;
        double d2 = (latLng2.latitude - latLng3.latitude) / 18.0d;
        double d3 = (latLng2.longitude - latLng3.longitude) / 18.0d;
        int i = (int) 18.0d;
        int i2 = 0;
        while (i2 < i) {
            LogUtil.a(str, "zoomNew = ", Double.valueOf(d));
            LatLng latLng4 = i2 > 0 ? new LatLng(latLng3.latitude + (d2 * 0.25d), latLng3.longitude + (0.25d * d3)) : latLng3;
            PolylineOptions polylineOptions = new PolylineOptions();
            double d4 = d2;
            polylineOptions.color(this.j.getResources().getColor(R.color.pause_line)).width(5).zIndex(10.0f).visible(izt.d()).add(latLng4).add(new LatLng(latLng3.latitude + d2, latLng3.longitude + d3));
            arrayList.add(polylineOptions);
            i2++;
            latLng3 = new LatLng(latLng3.latitude + d4, latLng3.longitude + d3);
            str = str;
            d2 = d4;
            d = 18.0d;
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addStartMarker(jpg jpgVar, int i) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "addStartMarker hiHealthLatLng is null");
        } else {
            izt.a(this.r, jpgVar, i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIconPath(String str, String str2) {
        this.s = str;
        this.f38911c = str2;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String addOverlay(jrz jrzVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "mHuaweiMap  is null in addGroundOverlay");
            return null;
        }
        if (jrzVar == null) {
            LogUtil.e("Track_HmsMap", "overlayDesc is null in addGroundOverlay");
            return null;
        }
        LatLng latLngC = izt.c(jrzVar.a());
        GroundOverlay groundOverlayAddGroundOverlay = this.r.addGroundOverlay(new GroundOverlayOptions().position(latLngC, (float) (((double) jrzVar.b()) * (1.0d / Math.cos(Math.toRadians(latLngC.latitude))))).image(BitmapDescriptorFactory.fromBitmap(jrzVar.e())).bearing(jrzVar.d()).zIndex(jrzVar.c()).visible(jrzVar.g()));
        if (groundOverlayAddGroundOverlay == null) {
            LogUtil.e("Track_HmsMap", "add GroundOverlay fail");
            return null;
        }
        String id = groundOverlayAddGroundOverlay.getId();
        this.ae.put(id, groundOverlayAddGroundOverlay);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOverlayVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.e("Track_HmsMap", "id is null in setOverlayVisible");
            return;
        }
        GroundOverlay groundOverlay = this.ae.get(str);
        if (groundOverlay == null) {
            return;
        }
        groundOverlay.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar, boolean z) {
        if (z) {
            this.i = null;
        }
        addEndMarker(jpgVar);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "addEndMarker latLng == null");
            return;
        }
        Marker marker = this.i;
        if (marker == null) {
            Marker markerA = izt.a(this.r, jpgVar, this.f38911c);
            this.k = markerA;
            if (this.x) {
                if (markerA != null) {
                    markerA.setVisible(false);
                    this.k.hideInfoWindow();
                }
                this.i = this.r.addMarker(new MarkerOptions().position(izt.c(jpgVar)).draggable(false));
                this.i.setIcon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(this.j.getResources(), R.drawable.hw_show_map_ending)));
                this.i.setMarkerAnchor(0.5f, 0.9f);
                this.i.hideInfoWindow();
                return;
            }
            this.i = izt.c(this.r, jpgVar, this.s);
            a(1);
            return;
        }
        marker.setPosition(izt.c(jpgVar));
        this.i.setIcon(izt.c(this.s));
        this.i.hideInfoWindow();
        Marker marker2 = this.k;
        if (marker2 != null) {
            marker2.setPosition(izt.c(jpgVar));
            this.k.hideInfoWindow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.x) {
            return;
        }
        Handler handler = this.d;
        if (handler == null) {
            ReleaseLogUtil.a("Track_HmsMap", "mAddCircleHandler is null in updateMarkerBgMsg");
            return;
        }
        handler.removeMessages(0);
        this.d.removeMessages(1);
        Message messageObtainMessage = this.d.obtainMessage();
        messageObtainMessage.what = i;
        this.d.sendMessageDelayed(messageObtainMessage, 900L);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadMapWithPreprocessData(List<jrp> list) {
        if (list == null) {
            InterfaceMapCallback interfaceMapCallback = this.ab;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
                return;
            }
            return;
        }
        this.am = new ArrayList();
        this.ag = list.size();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int i = 0;
        this.ad = false;
        if (this.ag > 0) {
            this.ao = list.get(0).h();
            this.l = list.get(0).b().size();
        }
        for (jrp jrpVar : list) {
            this.ap.add(Integer.valueOf(jrpVar.h()));
            c(jrpVar, builder);
            a(jrpVar);
            b(i, jrpVar);
            i++;
            this.ak.addAll(this.am);
            this.o = jrpVar.c();
            this.aa = izt.d(jrpVar.c());
        }
        if (this.ad) {
            e(builder);
        } else {
            LogUtil.a("Track_HmsMap", "no points in the bounds");
        }
        b();
        InterfaceMapCallback interfaceMapCallback2 = this.ab;
        if (interfaceMapCallback2 != null) {
            interfaceMapCallback2.onFinish();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeTrackColor(int i) {
        for (Map.Entry<Polyline, PolylineOptions> entry : this.aw.entrySet()) {
            Polyline key = entry.getKey();
            PolylineOptions value = entry.getValue();
            if (value.getColorValues() == null) {
                int color = value.getColor();
                key.setColor(i);
                value.color(color);
            } else {
                List<Integer> colorValues = value.getColorValues();
                key.setColorValues(Collections.nCopies(2, Integer.valueOf(i)));
                value.colorValues(colorValues);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void resetTrackColor() {
        for (Map.Entry<Polyline, PolylineOptions> entry : this.aw.entrySet()) {
            Polyline key = entry.getKey();
            PolylineOptions value = entry.getValue();
            if (value.getColorValues() == null) {
                key.setColor(value.getColor());
            } else {
                key.setColorValues(value.getColorValues());
            }
        }
    }

    private void b() {
        if (this.r == null || njy.e(this.aa)) {
            return;
        }
        for (int i = 1; i < this.aa.size() - 1; i++) {
            MarkerOptions markerOptions = this.aa.get(i);
            if (markerOptions != null) {
                this.r.addMarker(markerOptions);
            }
        }
    }

    private void e(LatLngBounds.Builder builder) {
        LatLngBounds latLngBoundsBuild = builder.build();
        LatLng latLng = latLngBoundsBuild.southwest;
        LatLng latLng2 = latLngBoundsBuild.northeast;
        LatLng latLng3 = new LatLng(latLng2.latitude - ((latLng2.latitude - latLng.latitude) * 1.4d), latLng.longitude);
        LatLngBounds.Builder builder2 = new LatLngBounds.Builder();
        builder2.include(latLngBoundsBuild.northeast);
        builder2.include(latLng3);
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder2.build(), (int) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d), 10);
        this.f = cameraUpdateNewLatLngBounds;
        this.r.moveCamera(cameraUpdateNewLatLngBounds);
        this.g = this.r.getCameraPosition();
    }

    private void b(int i, jrp jrpVar) {
        List<jpg> listB = jrpVar.b();
        if (njy.e(listB)) {
            return;
        }
        for (jpg jpgVar : listB) {
            e eVar = new e();
            eVar.f38928b = izt.c(jpgVar);
            eVar.f38929c = true;
            if (!njy.e(this.u)) {
                d(i, eVar);
            }
            this.u.add(eVar);
        }
    }

    private void d(int i, e eVar) {
        ArrayList<e> arrayList = this.u;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar2.equals(eVar)) {
            if (this.n.size() <= i || !eVar.f38928b.equals(this.n.get(i))) {
                eVar2.f38929c = false;
            } else {
                eVar.f38929c = false;
            }
        }
    }

    private void a(jrp jrpVar) {
        List<jpg> listD = jrpVar.d();
        if (!njy.e(listD)) {
            Iterator<jpg> it = listD.iterator();
            while (it.hasNext()) {
                this.ar.add(izt.c(it.next()));
            }
        }
        List<jpg> listE = jrpVar.e();
        if (njy.e(listE)) {
            return;
        }
        Iterator<jpg> it2 = listE.iterator();
        while (it2.hasNext()) {
            this.n.add(izt.c(it2.next()));
        }
    }

    private void c(jrp jrpVar, LatLngBounds.Builder builder) {
        List<jpf> listA = jrpVar.a();
        if (njy.e(listA)) {
            LogUtil.a("Track_HmsMap", "lineList is empty");
            InterfaceMapCallback interfaceMapCallback = this.ab;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
                return;
            }
            return;
        }
        for (jpf jpfVar : listA) {
            ArrayList arrayList = new ArrayList();
            int iA = jpfVar.a();
            for (jpg jpgVar : jpfVar.d()) {
                LatLng latLngC = izt.c(jpgVar);
                arrayList.add(latLngC);
                builder.include(latLngC);
                this.ad = true;
                if (iA != 2) {
                    this.am.add(jpgVar);
                }
            }
            if (iA == 2) {
                this.aj.addAll(c((LatLng) arrayList.get(0), (LatLng) arrayList.get(arrayList.size() - 1)));
            } else {
                PolylineOptions polylineOptions = new PolylineOptions();
                polylineOptions.width(5.0f).zIndex(10.0f).visible(true).addAll(arrayList);
                if (iA == 0) {
                    polylineOptions.colorValues(jpfVar.b());
                } else {
                    polylineOptions.color(jpfVar.b().size() > 0 ? jpfVar.b().get(0).intValue() : izw.y);
                }
                this.aj.add(polylineOptions);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(List<MotionData> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_HmsMap", "onMapLoaded data is null");
            return;
        }
        this.ao = list.get(0).getSportType();
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (MotionData motionData : list) {
            ArrayList arrayList3 = new ArrayList(16);
            Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
            if (lbsDataMap == null || lbsDataMap.isEmpty()) {
                return;
            }
            d(arrayList, arrayList2, arrayList3, lbsDataMap);
            LogUtil.a("Track_HmsMap", "list SIZE:", Integer.valueOf(arrayList2.size()));
            if (arrayList2.size() < 3 && this.x) {
                return;
            }
            b(arrayList3);
            b(arrayList3, motionData.getSportType());
            d(arrayList3);
        }
        List<jpg> listE = e(arrayList);
        animateCamera(listE.get(listE.size() - 1), 0L, (InterfaceMapCallback) null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(jpg jpgVar, float f) {
        CommonUtil.d("Track_HmsMap", "into hms map");
        if (jpgVar == null) {
            LogUtil.a("Track_HmsMap", "onMapLoaded, hiHealthLatLng is null");
            return;
        }
        this.r.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(jpgVar.d, jpgVar.f38787a)));
        this.r.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOnMapLoadedListener(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap != null) {
            huaweiMap.setOnMapLoadedCallback(new HuaweiMap.OnMapLoadedCallback(this) { // from class: jrg.5
                @Override // com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback
                public void onMapLoaded() {
                    InterfaceMapLoadedCallback interfaceMapLoadedCallback2 = interfaceMapLoadedCallback;
                    if (interfaceMapLoadedCallback2 != null) {
                        interfaceMapLoadedCallback2.onMapLoaded();
                    }
                }
            });
        }
    }

    private List<jpg> e(List<LatLng> list) {
        ArrayList arrayList = new ArrayList(16);
        for (LatLng latLng : list) {
            arrayList.add(new jpg(latLng.latitude, latLng.longitude));
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraLatLngBounds(List<jpg> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_HmsMap", "moveCameraLatLngBounds list is null");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<jpg> it = list.iterator();
        while (it.hasNext()) {
            builder.include(izt.c(it.next()));
        }
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), (int) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d), 10);
        this.f = cameraUpdateNewLatLngBounds;
        this.r.moveCamera(cameraUpdateNewLatLngBounds);
        this.g = this.r.getCameraPosition();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void getMapScreenShot(final Handler handler, MotionData motionData) {
        LogUtil.a("Track_HmsMap", "getMapScreenShot");
        if (handler == null || this.ac == null) {
            ReleaseLogUtil.a("Track_HmsMap", "getMapScreenShot handler or mMapView is null return");
        } else {
            this.r.snapshot(new HuaweiMap.SnapshotReadyCallback(this) { // from class: jrg.1
                @Override // com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap) {
                    LogUtil.a("Track_HmsMap", "snapshot in app is :", bitmap);
                    if (bitmap != null) {
                        Message messageObtain = Message.obtain(handler);
                        messageObtain.obj = bitmap;
                        messageObtain.what = 1;
                        messageObtain.sendToTarget();
                        LogUtil.d("Track_HmsMap", "snapshot end");
                    }
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setAllGesturesEnabled(boolean z) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap != null) {
            huaweiMap.getUiSettings().setAllGesturesEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setZoomControlsEnabled(boolean z) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap != null) {
            huaweiMap.getUiSettings().setZoomControlsEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void pauseSportClear() {
        this.d.sendEmptyMessage(2);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreate(Bundle bundle, boolean z, boolean z2) {
        if (this.r == null) {
            LogUtil.j("Track_HmsMap", "onCreate Hms is null");
            return;
        }
        LogUtil.a("Track_HmsMap", "onCreate():");
        c();
        if (z) {
            Object systemService = this.j.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (!(systemService instanceof WindowManager)) {
                LogUtil.e("Track_HmsMap", "not WindowManager");
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            this.r.setPadding(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 4, displayMetrics.widthPixels / 2, (displayMetrics.heightPixels * 3) / 4);
        }
    }

    private void c() {
        this.r.getUiSettings().setZoomControlsEnabled(false);
        this.r.getUiSettings().setMyLocationButtonEnabled(false);
        this.r.getUiSettings().setCompassEnabled(false);
        this.r.getUiSettings().setTiltGesturesEnabled(false);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStart() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView != null) {
            textureMapView.onStart();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResume() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView != null) {
            textureMapView.onResume();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPause() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView != null) {
            textureMapView.onPause();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStop() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView != null) {
            textureMapView.onStop();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroy() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(0);
            this.d.removeMessages(1);
            this.d = null;
        }
        Marker marker = this.i;
        if (marker != null) {
            marker.remove();
            this.i = null;
        }
        Marker marker2 = this.k;
        if (marker2 != null) {
            marker2.remove();
            this.k = null;
        }
        Polyline polyline = this.af;
        if (polyline != null) {
            polyline.remove();
            this.af = null;
        }
        TextureMapView textureMapView = this.ac;
        if (textureMapView != null) {
            textureMapView.onDestroy();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapShowType(int i) {
        if (this.z == i) {
            return;
        }
        this.z = i;
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.d("Track_HmsMap", "tomtomap is null");
            return;
        }
        if (i == 0) {
            huaweiMap.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_map_simple_style));
        } else if (i == 2) {
            huaweiMap.setMapType(0);
        } else if (i == 3) {
            huaweiMap.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.mapstyle_night_hms));
        } else if (i == 4) {
            huaweiMap.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_without_text));
        } else if (i == 5) {
            huaweiMap.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_without_text_night));
        } else {
            huaweiMap.setMapType(1);
        }
        c();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showSatelLiteState(boolean z, boolean z2, int i) {
        if (!z) {
            setMapShowType(2);
        } else if (z2) {
            setMapShowType(1);
        } else {
            setMapShowType(i);
        }
        LogUtil.a("Track_HmsMap", "showSatelLiteState isShowMap = ", Boolean.valueOf(z), ",isShowTrackMapTypeSatellite=", Boolean.valueOf(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showOrHide(boolean z) {
        Polygon polygon = this.an;
        if (polygon != null) {
            polygon.remove();
        }
        if (this.r == null) {
            ReleaseLogUtil.a("Track_HmsMap", "mHuaweiMap is null return in showOrHide");
            return;
        }
        if (z && qqs.e(this.j)) {
            setMapShowType(3);
        } else if (z) {
            setMapShowType(0);
        } else if (qqs.e(this.j)) {
            setMapShowType(2);
            this.an = this.r.addPolygon(new PolygonOptions().addAll(a()).zIndex(9.0f).fillColor(this.j.getResources().getColor(R.color.hide_map_color)).strokeColor(0).strokeWidth(1.0f));
        } else {
            setMapShowType(2);
        }
        LogUtil.a("Track_HmsMap", "showOrHide isShow = ", Boolean.valueOf(z));
    }

    private List<LatLng> a() {
        int left = this.ac.getLeft();
        int top = this.ac.getTop();
        LatLng latLngFromScreenLocation = this.r.getProjection().fromScreenLocation(new Point((int) (this.ac.getX() + ((this.ac.getRight() - left) / 2)), (int) (this.ac.getY() + ((this.ac.getBottom() - top) / 2))));
        return Arrays.asList(new LatLng(-85.0d, latLngFromScreenLocation.longitude - 89.9d), new LatLng(-85.0d, latLngFromScreenLocation.longitude + 89.9d), new LatLng(85.0d, latLngFromScreenLocation.longitude + 89.9d), new LatLng(85.0d, latLngFromScreenLocation.longitude - 89.9d));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScreenOnOrForegrand(boolean z) {
        this.w = z;
        if (z) {
            forceDrawLine();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveToCenter() {
        CameraUpdate cameraUpdate;
        if (this.g == null || (cameraUpdate = this.f) == null) {
            return;
        }
        cameraUpdate.getCameraUpdate().setCameraPosition(this.g);
        this.r.moveCamera(this.f);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void forceDrawLine() {
        if (this.v.size() <= 0) {
            return;
        }
        this.d.sendEmptyMessage(3);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void intervalTrackMarkers(int i) {
        if (i == -1 || i == 0) {
            d();
        } else {
            c(i);
        }
    }

    private void d(List<LatLng> list) {
        if (list == null) {
            LogUtil.a("Track_HmsMap", "list is null");
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            LatLng latLng = list.get(size);
            if (!izt.a(izt.a(latLng))) {
                addEndMarker(izt.a(latLng));
                LogUtil.a("Track_HmsMap", "addEndMarker");
                return;
            }
        }
    }

    private void b(List<LatLng> list, int i) {
        if (list == null) {
            LogUtil.a("Track_HmsMap", "list is null");
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LatLng latLng = list.get(i2);
            if (!izt.a(izt.a(latLng))) {
                addSportStartMarker(izt.a(latLng), i);
                List<jpg> list2 = this.am;
                if (list2 != null) {
                    list2.add(0, d(latLng));
                }
                LogUtil.a("Track_HmsMap", "addStartMarker");
                return;
            }
        }
    }

    private void b(List<LatLng> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(16);
        a(list, size, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.au).width(5.0f).zIndex(10.0f).visible(true);
        Iterator<LatLng> it = arrayList.iterator();
        while (it.hasNext()) {
            polylineOptions.add(it.next());
        }
        this.r.addPolyline(polylineOptions);
        if (this.am != null) {
            a(arrayList);
        }
    }

    private void a(List<LatLng> list, int i, List<LatLng> list2) {
        for (int i2 = 0; i2 < i; i2++) {
            LatLng latLng = list.get(i2);
            if (izt.a(izt.a(latLng))) {
                if (!list2.isEmpty()) {
                    c(list2);
                }
                a(list, i2);
            } else {
                list2.add(latLng);
            }
        }
    }

    private void c(List<LatLng> list) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.au).width(5.0f).zIndex(10.0f).visible(true);
        Iterator<LatLng> it = list.iterator();
        while (it.hasNext()) {
            polylineOptions.add(it.next());
        }
        this.r.addPolyline(polylineOptions);
        if (this.am != null) {
            a(list);
        }
        list.clear();
    }

    private void a(List<LatLng> list, int i) {
        if (list == null) {
            ReleaseLogUtil.e("Track_HmsMap", "drawPauseLine list is null");
            return;
        }
        int size = list.size();
        LatLng latLng = i > 0 ? list.get(i - 1) : null;
        LatLng latLng2 = i < size + (-1) ? list.get(i + 1) : null;
        if (latLng == null || latLng2 == null) {
            return;
        }
        Iterator<PolylineOptions> it = c(latLng, latLng2).iterator();
        while (it.hasNext()) {
            this.r.addPolyline(it.next());
        }
        List<jpg> list2 = this.am;
        if (list2 != null) {
            list2.add(d(latLng2));
        }
    }

    private void a(List<LatLng> list) {
        boolean z = true;
        for (LatLng latLng : list) {
            if (z) {
                z = false;
            } else {
                this.am.add(d(latLng));
            }
        }
    }

    private jpg d(LatLng latLng) {
        return izt.a(latLng);
    }

    private void d(List<LatLng> list, List<LatLng> list2, List<LatLng> list3, Map<Long, double[]> map) {
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            if (entry.getValue().length <= 1) {
                LogUtil.j("Track_HmsMap", "unexpected point, length <= 1");
            } else {
                LatLng latLng = new LatLng(entry.getValue()[0], entry.getValue()[1]);
                if (list2.size() <= 0 || !izt.c(izt.a(list2.get(list2.size() - 1)), izt.a(latLng))) {
                    list2.add(latLng);
                    list3.add(latLng);
                    if (!izt.a(izt.a(latLng))) {
                        list.add(latLng);
                    }
                }
            }
        }
    }

    private void c(int i) {
        int i2 = i - 1;
        while (i2 < this.u.size()) {
            if (this.u.get(i2).f38929c) {
                e(i2);
            }
            i2 += i;
        }
        LogUtil.d("Track_HmsMap", "mMarkersList.size = ", Integer.valueOf(this.ai.size()));
    }

    private void e(int i) {
        String strE = UnitUtil.e(i + 1, 1, 0);
        this.ai.add((this.q && !TextUtils.isEmpty(strE) && pqi.d().isPluginAvaiable()) ? e(strE, this.u.get(i).f38928b) : izt.a(this.j.getResources(), this.u.get(i).f38928b, strE, this.r));
    }

    private Marker e(String str, LatLng latLng) {
        String strE = jxg.e(str);
        jrv jrvVar = new jrv();
        jrvVar.d(new jpg(latLng.latitude, latLng.longitude));
        jrvVar.c(0.5f, 0.9f);
        jrvVar.e(strE);
        jrvVar.c(this.q);
        jrvVar.e(this.f38910b);
        return pqi.d().set3dMarker(this.r, jrvVar);
    }

    private void d() {
        Iterator<Marker> it = this.ai.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.ai.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<jpg> requestSimplePoints() {
        return this.ak;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawAddMapTracking(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_HmsMap", "drawAddMapTracking lastHiHealthLatLng or currentHiHealthLatLng is null");
            return;
        }
        this.ax.add(izt.c(jpgVar));
        this.af.setPoints(this.ax);
        animateCamera(jpgVar2, 1000L, (InterfaceMapCallback) null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addSportStartMarker(jpg jpgVar, int i) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "addSportStartMarker hiHealthLatLng is null");
            return;
        }
        Marker marker = this.as;
        if (marker != null) {
            marker.remove();
        }
        this.as = izt.a(this.r, jpgVar, i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void screenShotToFile(final InterfaceSnapshotCallback interfaceSnapshotCallback) {
        synchronized (this) {
            this.r.snapshot(new HuaweiMap.SnapshotReadyCallback() { // from class: jrd
                @Override // com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    jrg.b(interfaceSnapshotCallback, bitmap);
                }
            });
        }
    }

    static /* synthetic */ void b(InterfaceSnapshotCallback interfaceSnapshotCallback, Bitmap bitmap) {
        if (interfaceSnapshotCallback != null) {
            interfaceSnapshotCallback.onSnapshotReady(bitmap);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadingEnd() {
        CameraUpdate cameraUpdate = this.f;
        if (cameraUpdate != null) {
            this.r.moveCamera(cameraUpdate);
        }
        for (int i = 0; i < this.ag; i++) {
            b(i);
        }
    }

    private void b(int i) {
        Marker markerA;
        List<LatLng> list = this.ar;
        if (list != null && (markerA = izt.a(this.r, izt.a((LatLng) c(list, i)), ((Integer) c(this.ap, i)).intValue())) != null) {
            markerA.setZIndex(14.0f);
        }
        LatLng latLng = (LatLng) c(this.n, i);
        if (latLng != null) {
            if (i < this.ag - 1) {
                this.i = this.r.addMarker(new MarkerOptions().position(latLng).draggable(false).zIndex(14.0f));
                this.i.setIcon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(this.j.getResources(), R.drawable.hw_show_map_tracking_change)));
                this.i.setMarkerAnchor(0.5f, 0.9f);
            } else {
                this.i = this.r.addMarker(new MarkerOptions().position(latLng).draggable(false).zIndex(14.0f));
                Bitmap bitmapB = izt.b(this.o);
                if (bitmapB == null) {
                    bitmapB = BitmapFactory.decodeResource(this.j.getResources(), R.drawable.hw_show_map_ending);
                }
                this.i.setIcon(BitmapDescriptorFactory.fromBitmap(bitmapB));
                this.i.setMarkerAnchor(0.5f, 0.9f);
            }
        }
        if (njy.e(this.aj)) {
            return;
        }
        for (PolylineOptions polylineOptions : this.aj) {
            this.aw.put(this.r.addPolyline(polylineOptions), polylineOptions);
        }
    }

    private <T> T c(List<T> list, int i) {
        if (list == null || list.size() <= i) {
            return null;
        }
        return list.get(i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerLoadingListener(InterfaceMapCallback interfaceMapCallback) {
        this.ab = interfaceMapCallback;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setIsStop(boolean z) {
        this.x = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom() {
        moveCameraByZoom(12.5f);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom(float f) {
        this.r.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByLatLng(jpg jpgVar) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "moveCameraByLatLng hiHealthLatLng is null, please check");
        } else {
            this.r.moveCamera(CameraUpdateFactory.newLatLng(izt.c(jpgVar)));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, Location location) {
        if (location == null) {
            ReleaseLogUtil.e("Track_HmsMap", "currentLocation is null, please check");
            return new double[0];
        }
        return new double[]{location.getLatitude(), location.getLongitude()};
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void updateSportMarker(jpg jpgVar, BitmapDrawable bitmapDrawable) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_HmsMap", "updateSportMarker hiHealthLatLng is null, please check");
            return;
        }
        if (bitmapDrawable == null) {
            ReleaseLogUtil.e("Track_HmsMap", "updateSportMarker bitmapDrawable is null, please check");
            return;
        }
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapDrawable.getBitmap());
        Marker marker = this.i;
        if (marker == null) {
            this.i = this.r.addMarker(new MarkerOptions().position(izt.c(jpgVar)).draggable(false).icon(bitmapDescriptorFromBitmap));
        } else {
            marker.setPosition(izt.c(jpgVar));
            this.i.setIcon(bitmapDescriptorFromBitmap);
        }
    }

    static class b extends BaseHandler<jrg> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<jrg> f38927a;

        b(jrg jrgVar) {
            super(jrgVar);
            this.f38927a = new WeakReference<>(jrgVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jrg jrgVar, Message message) {
            jrg jrgVar2 = this.f38927a.get();
            if (jrgVar2 == null) {
                LogUtil.e("Track_HmsMap", "hmsMap is null");
                return;
            }
            if (message == null) {
                LogUtil.a("Track_HmsMap", "msg is null");
                return;
            }
            if (jrgVar2.k != null) {
                if (message.what != 0) {
                    if (message.what != 1) {
                        if (message.what != 2) {
                            if (message.what != 3) {
                                LogUtil.d("Track_HmsMap", "wrong msg");
                                return;
                            } else {
                                if (jrgVar2.v == null || jrgVar2.v.size() < 2) {
                                    return;
                                }
                                jrgVar2.af.setPoints(jrgVar2.v);
                                jrgVar2.addEndMarker(izt.a((LatLng) jrgVar2.v.get(jrgVar2.v.size() - 1)));
                                jrgVar2.animateCamera(izt.a((LatLng) jrgVar2.v.get(jrgVar2.v.size() - 1)), 1000L, (InterfaceMapCallback) null);
                                return;
                            }
                        }
                        jrgVar2.e();
                        return;
                    }
                    jrgVar2.k.setVisible(true);
                    jrgVar2.a(0);
                    return;
                }
                jrgVar2.k.setVisible(false);
                jrgVar2.a(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        PolylineOptions polylineOptions = new PolylineOptions();
        List<LatLng> list = this.v;
        if (list != null && list.size() >= 2) {
            PolylineOptions polylineOptionsZIndex = polylineOptions.color(this.au).width(5.0f).zIndex(10.0f);
            List<LatLng> list2 = this.v;
            LatLng latLng = list2.get(list2.size() - 1);
            List<LatLng> list3 = this.v;
            polylineOptionsZIndex.add(latLng, list3.get(list3.size() - 1)).visible(true);
            this.af = this.r.addPolyline(polylineOptions);
            List<LatLng> list4 = this.ax;
            if (list4 != null && !list4.isEmpty()) {
                this.ax.clear();
            }
        }
        if (njy.b(this.v)) {
            this.v.clear();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLogoPadding(int i, int i2, int i3, int i4) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null || this.j == null) {
            return;
        }
        huaweiMap.setPadding(i, i2, i3, i4);
        this.r.getUiSettings().setLogoPadding(i, i2, i3, i4 + qrs.d(this.j, 2.0f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jrr jrrVar, long j, final InterfaceMapCallback interfaceMapCallback) {
        synchronized (this) {
            if (this.r == null) {
                LogUtil.e("Track_HmsMap", "map is null in animateCamera");
                return;
            }
            CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(a(jrrVar));
            if (j <= 0) {
                this.r.moveCamera(cameraUpdateNewCameraPosition);
            } else {
                LogUtil.a("Track_HmsMap", "animateCamera start");
                this.t = true;
                this.p = false;
                final int i = this.h + 1;
                this.h = i;
                this.f38909a.put(Integer.valueOf(i), false);
                this.r.animateCamera(cameraUpdateNewCameraPosition, (int) j, new HuaweiMap.CancelableCallback() { // from class: jrg.7
                    @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                    public void onFinish() {
                        synchronized (this) {
                            jrg.this.f38909a.put(Integer.valueOf(i), true);
                            jrg.this.a(interfaceMapCallback);
                        }
                    }

                    @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                    public void onCancel() {
                        synchronized (this) {
                            jrg.this.f38909a.put(Integer.valueOf(i), true);
                            jrg.this.d(interfaceMapCallback);
                        }
                    }
                });
                a(i, j, interfaceMapCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(InterfaceMapCallback interfaceMapCallback) {
        if (!this.p) {
            LogUtil.a("Track_HmsMap", "camera is moving error onCancel");
            return;
        }
        this.p = false;
        if (interfaceMapCallback != null) {
            LogUtil.a("Track_HmsMap", "animateCamera onCancel");
            interfaceMapCallback.onCancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InterfaceMapCallback interfaceMapCallback) {
        if (this.p) {
            LogUtil.a("Track_HmsMap", "camera should cancel error onFinish");
            this.r.stopAnimation();
            interfaceMapCallback.onCancel();
            this.p = false;
            this.t = false;
            return;
        }
        if (!this.t) {
            LogUtil.a("Track_HmsMap", "camera is not moving error onFinish");
            return;
        }
        this.t = false;
        if (interfaceMapCallback != null) {
            LogUtil.a("Track_HmsMap", "animateCamera onFinish");
            interfaceMapCallback.onFinish();
        }
    }

    private void a(final int i, long j, final InterfaceMapCallback interfaceMapCallback) {
        this.aq.deleteObservers();
        this.aq.addObserver(new Observer() { // from class: jrg.9
            @Override // java.util.Observer
            public void update(Observable observable, Object obj) {
                new Handler().postDelayed(new Runnable() { // from class: jrg.9.3
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (this) {
                            LogUtil.a("Track_HmsMap", "forceCallbackHandle cancel observer", Boolean.valueOf(jrg.this.f38909a.containsKey(Integer.valueOf(i))), " ", jrg.this.f38909a.get(Integer.valueOf(i)), " ", Integer.valueOf(i));
                            if (jrg.this.f38909a.containsKey(Integer.valueOf(i)) && ((Boolean) jrg.this.f38909a.get(Integer.valueOf(i))).booleanValue()) {
                                return;
                            }
                            LogUtil.a("Track_HmsMap", "forceCallback");
                            if (!jrg.this.p) {
                                interfaceMapCallback.onCancel();
                            }
                        }
                    }
                }, 400L);
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: jrg.8
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    LogUtil.a("Track_HmsMap", "forceCallbackHandle ", Boolean.valueOf(jrg.this.f38909a.containsKey(Integer.valueOf(i))), " ", jrg.this.f38909a.get(Integer.valueOf(i)), " ", Integer.valueOf(i));
                    if (jrg.this.f38909a.containsKey(Integer.valueOf(i)) && ((Boolean) jrg.this.f38909a.get(Integer.valueOf(i))).booleanValue()) {
                        return;
                    }
                    LogUtil.a("Track_HmsMap", "forceCallback");
                    if (!jrg.this.p) {
                        interfaceMapCallback.onFinish();
                    }
                }
            }
        }, j + 400);
    }

    private CameraPosition a(jrr jrrVar) {
        if (jrrVar == null) {
            return null;
        }
        return new CameraPosition(izt.c(jrrVar.a()), jrrVar.e(), jrrVar.d(), jrrVar.c());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void stopAnimation() {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "bounds is null in clear");
            return;
        }
        Context context = this.j;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: jrg.10
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        jrg.this.t = false;
                        jrg.this.p = true;
                        jrg.this.aq.notifyObservers();
                        LogUtil.a("Track_HmsMap", "stopAnimation");
                        jrg.this.r.stopAnimation();
                    }
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jrt jrtVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in drawLine");
            return;
        }
        if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
            return;
        }
        Polyline polyline = this.m;
        if (polyline == null || c(jrtVar, polyline)) {
            PolylineOptions polylineOptionsColor = new PolylineOptions().add(izt.c(jrtVar.d()), izt.c(jrtVar.b())).width(jrtVar.a() * 0.2f).color(jrtVar.e());
            if (jrtVar.j()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Dot());
                polylineOptionsColor.pattern(arrayList);
            }
            this.m = this.r.addPolyline(polylineOptionsColor);
            return;
        }
        List<LatLng> points = this.m.getPoints();
        if (points != null) {
            points.add(izt.c(jrtVar.d()));
            points.add(izt.c(jrtVar.b()));
            this.m.setPoints(points);
        }
    }

    private boolean c(jrt jrtVar, Polyline polyline) {
        if (jrtVar.j() && njy.e(polyline.getPattern())) {
            return true;
        }
        return (jrtVar.j() || njy.e(polyline.getPattern())) ? false : true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String drawLines(jrs jrsVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in drawLine");
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
            arrayList.add(izt.c(jrsVar.d()));
            arrayList.add(izt.c(jrsVar.b()));
        } else {
            Iterator<jpg> it = jrsVar.g().iterator();
            while (it.hasNext()) {
                arrayList.add(izt.c(it.next()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(jrsVar.h())) {
            arrayList2.add(Integer.valueOf(jrsVar.e()));
        } else {
            arrayList2.addAll(jrsVar.h());
        }
        PolylineOptions polylineOptionsVisible = new PolylineOptions().addAll(arrayList).width(jrsVar.a() * 0.3f).color(((Integer) arrayList2.get(0)).intValue()).zIndex(jrsVar.c()).visible(jrsVar.f());
        if (jrsVar.j()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new Dot());
            polylineOptionsVisible.pattern(arrayList3);
        }
        Polyline polylineAddPolyline = this.r.addPolyline(polylineOptionsVisible);
        String id = polylineAddPolyline.getId();
        this.al.put(id, polylineAddPolyline);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.e("Track_HmsMap", "id is null in setLineVisible");
            return;
        }
        Polyline polyline = this.al.get(str);
        if (polyline == null) {
            return;
        }
        polyline.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public GrowAnimationBuilder getGrowAnimation() {
        return new jrh();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void clear() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.e("Track_HmsMap", "clear HuaweiMap is null");
            return;
        }
        huaweiMap.clear();
        this.ah = new Vector<>();
        this.m = null;
        this.e.clear();
        synchronized (this) {
            this.h = 0;
        }
        this.f38909a.clear();
        this.aw.clear();
        this.ae.clear();
        this.al.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveMarker(int i, jpg jpgVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in moveMarker");
            return;
        }
        if (njy.e(this.ah, i)) {
            return;
        }
        Marker marker = this.ah.get(i);
        if (marker == null) {
            LogUtil.j("Track_HmsMap", "moveMarker: marker is null");
        } else {
            marker.setPosition(izt.c(jpgVar));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int addMarker(jrv jrvVar, GrowAnimationBuilder growAnimationBuilder) {
        Marker markerAddMarker;
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in addMarker");
            return -1;
        }
        if (jrvVar == null || jrvVar.b() == null) {
            return -1;
        }
        if (this.q && !TextUtils.isEmpty(jrvVar.d()) && pqi.d().isPluginAvaiable()) {
            jrvVar.c(this.q);
            jrvVar.e(this.f38910b);
            markerAddMarker = pqi.d().set3dMarker(this.r, jrvVar);
        } else {
            markerAddMarker = this.r.addMarker(new MarkerOptions().flat(jrvVar.h()).anchorMarker(((Float) jrvVar.a().first).floatValue(), ((Float) jrvVar.a().second).floatValue()).zIndex(jrvVar.c()).draggable(jrvVar.i()).icon(BitmapDescriptorFactory.fromBitmap(jrvVar.b())).position(izt.c(jrvVar.e())).visible(jrvVar.f()));
        }
        if (growAnimationBuilder instanceof jrh) {
            ((jrh) growAnimationBuilder).b(markerAddMarker);
            growAnimationBuilder.displayAnimation();
        }
        if (this.ah == null) {
            this.ah = new Vector<>();
        }
        this.ah.add(markerAddMarker);
        return this.ah.size() - 1;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in deleteMarker");
            return;
        }
        if (njy.e(this.ah, i)) {
            return;
        }
        Marker marker = this.ah.get(i);
        if (marker == null) {
            LogUtil.j("Track_HmsMap", "restoreMarker: marker is null");
            return;
        }
        if (growAnimationBuilder == null) {
            marker.setVisible(true);
        }
        if (growAnimationBuilder instanceof jrh) {
            ((jrh) growAnimationBuilder).b(marker);
            growAnimationBuilder.displayAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void hideMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in deleteMarker");
            return;
        }
        if (njy.e(this.ah, i)) {
            return;
        }
        Marker marker = this.ah.get(i);
        if (marker == null) {
            LogUtil.j("Track_HmsMap", "deleteMarker: marker is null");
            return;
        }
        if (growAnimationBuilder == null) {
            marker.setVisible(false);
        }
        if (growAnimationBuilder instanceof jrh) {
            ((jrh) growAnimationBuilder).b(marker);
            growAnimationBuilder.disappearAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIcon(int i, Bitmap bitmap) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in setMarkerIcon");
            return;
        }
        Vector<Marker> vector = this.ah;
        if (vector == null || i < 0 || i >= vector.size()) {
            LogUtil.e("Track_HmsMap", "id is error in setMarkerIcon");
        } else {
            this.ah.get(i).setIcon(BitmapDescriptorFactory.fromBitmap(bitmap));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPreviewStatus(jrm jrmVar, int i, int i2, int i3, int i4) {
        if (jrmVar == null) {
            LogUtil.e("Track_HmsMap", "bounds is null in setPreviewStatus");
        } else {
            if (this.r == null) {
                LogUtil.e("Track_HmsMap", "map is null in setPreviewStatus");
                return;
            }
            LatLngBounds latLngBoundsBuild = new LatLngBounds.Builder().include(izt.c(jrmVar.d())).include(izt.c(jrmVar.b())).build();
            this.r.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, (int) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.65d), 0));
            this.r.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, (int) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.j.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.65d), 0));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jrr getMapStatus() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.e("Track_HmsMap", "map is null in getMapStatus");
            return new jrr();
        }
        jrr jrrVarB = b(huaweiMap.getCameraPosition());
        if (jrrVarB == null) {
            return new jrr();
        }
        jrrVarB.e(e(this.r.getCameraPosition().zoom));
        return jrrVarB;
    }

    private jrr b(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        jrr jrrVar = new jrr();
        jrrVar.b(cameraPosition.bearing).d(izt.a(cameraPosition.target)).c(cameraPosition.tilt).a(cameraPosition.zoom);
        return jrrVar;
    }

    private float e(float f) {
        return (float) (Math.exp(((double) f) * (-0.688d)) * 49671.0d);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMaxZoomLevel() {
        return this.r.getMaxZoomLevel();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapLoadedCallback(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in setMapLoadedCallback");
        } else {
            if (interfaceMapLoadedCallback == null) {
                return;
            }
            this.r.setOnMapLoadedCallback(new HuaweiMap.OnMapLoadedCallback(this) { // from class: jrg.6
                @Override // com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback
                public void onMapLoaded() {
                    interfaceMapLoadedCallback.onMapLoaded();
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setCameraChangeCallback(final InterfaceMapStatusChangeCallback interfaceMapStatusChangeCallback) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.e("Track_HmsMap", "map is null in setCameraChangeCallback");
        } else {
            if (interfaceMapStatusChangeCallback == null) {
                return;
            }
            huaweiMap.setOnCameraMoveListener(new HuaweiMap.OnCameraMoveListener() { // from class: jrg.11
                @Override // com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener
                public void onCameraMove() {
                    interfaceMapStatusChangeCallback.onMapStatusChange(jrg.this.getMapStatus());
                    jrg jrgVar = jrg.this;
                    jrgVar.f38910b = (float) (Math.pow(0.5d, jrgVar.r.getCameraPosition().zoom - 16.0f) * 5.300000190734863d);
                    jrg jrgVar2 = jrg.this;
                    jrgVar2.f38910b = Math.min(jrgVar2.f38910b, 650.0f);
                    if (jrg.this.q && njy.b(jrg.this.ah)) {
                        Iterator it = jrg.this.ah.iterator();
                        while (it.hasNext()) {
                            pqi.d().set3dMarkerScale((Marker) it.next(), jrg.this.f38910b);
                        }
                    }
                    if (jrg.this.q && njy.b(jrg.this.ai)) {
                        Iterator it2 = jrg.this.ai.iterator();
                        while (it2.hasNext()) {
                            pqi.d().set3dMarkerScale((Marker) it2.next(), jrg.this.f38910b);
                        }
                    }
                }
            });
            this.r.setOnCameraIdleListener(new HuaweiMap.OnCameraIdleListener() { // from class: jrg.15
                @Override // com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener
                public void onCameraIdle() {
                    interfaceMapStatusChangeCallback.onMapStatusChangeFinish(jrg.this.getMapStatus());
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPausePurely() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView == null) {
            LogUtil.e("Track_HmsMap", "mapview is null in onPausePurely");
        } else {
            textureMapView.onPause();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResumePurely() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView == null) {
            LogUtil.e("Track_HmsMap", "mapview is null in onResumePurely");
        } else {
            textureMapView.onResume();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroyPurely() {
        TextureMapView textureMapView = this.ac;
        if (textureMapView == null) {
            LogUtil.e("Track_HmsMap", "mapview is null in onDestroyPurely");
        } else {
            textureMapView.onDestroy();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableAllGestures() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.e("Track_HmsMap", "map is null in disableAllGestures");
        } else {
            huaweiMap.getUiSettings().setAllGesturesEnabled(false);
            this.r.getUiSettings().setZoomControlsEnabled(false);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showPureMap() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            LogUtil.e("Track_HmsMap", "map is null in showPureMap");
        } else {
            huaweiMap.getUiSettings().setCompassEnabled(false);
            this.r.getUiSettings().setMyLocationButtonEnabled(false);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeMapType(MapTypeDescription mapTypeDescription, jes jesVar) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in changeMapType");
            return;
        }
        if (mapTypeDescription == null) {
            return;
        }
        this.q = false;
        if (mapTypeDescription.e() == MapTypeDescription.MapType.DEFAULT_MAP_THREE_D) {
            this.q = true;
            this.r.setMapType(3);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_without_text));
        } else if (mapTypeDescription.e() == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.r.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_without_text_night));
        } else if (mapTypeDescription.e() == MapTypeDescription.MapType.MAP_TYPE_CUSTOM) {
            this.r.setMapType(1);
            d(jesVar);
        } else {
            this.r.setMapType(1);
            this.r.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.j, R.raw.huawei_without_text));
        }
        c(this.q);
    }

    private void c(boolean z) {
        if (this.r != null) {
            LogUtil.a("Track_HmsMap", "set3dMapType: ", Boolean.valueOf(z));
            LogUtil.a("Track_HmsMap", "set3dMapType: set3dType result = ", Boolean.valueOf(pqi.d().set3dMapType(this.r, z)));
        }
    }

    private void d(jes jesVar) {
        if (jesVar == null) {
            LogUtil.j("Track_HmsMap", "initCustomMapStyle customMapInformation == null");
        } else {
            this.r.setMapStyle(new MapStyleOptions(Utils.c(jesVar.f())));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapZoom() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            return 0.0f;
        }
        return huaweiMap.getCameraPosition().zoom;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapTilt() {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            return 0.0f;
        }
        return huaweiMap.getCameraPosition().tilt;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public Point getScreenLocation(jpg jpgVar) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null || jpgVar == null) {
            LogUtil.e("Track_HmsMap", "huaweiMap is null or latlng is null");
            return new Point();
        }
        Projection projection = huaweiMap.getProjection();
        if (projection == null) {
            LogUtil.e("Track_HmsMap", "projection is null or latlng is null");
            return new Point();
        }
        return projection.toScreenLocation(izt.c(jpgVar));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg getLatLngByScreenPoint(Point point) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null || point == null) {
            LogUtil.e("Track_HmsMap", "huaweiMap is null or point is null");
            return new jpg(0.0d, 0.0d);
        }
        Projection projection = huaweiMap.getProjection();
        if (projection == null) {
            LogUtil.e("Track_HmsMap", "projection is null or latlng is null");
            return new jpg(0.0d, 0.0d);
        }
        return izt.a(projection.fromScreenLocation(point));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableMarkerClick() {
        this.r.setOnMarkerClickListener(new HuaweiMap.OnMarkerClickListener(this) { // from class: jrg.3
            @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                return true;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addMarkerClickListener(final InterfaceMapMarkerClickCallback interfaceMapMarkerClickCallback) {
        HuaweiMap huaweiMap = this.r;
        if (huaweiMap == null) {
            return;
        }
        huaweiMap.setOnMarkerClickListener(new HuaweiMap.OnMarkerClickListener() { // from class: jrg.2
            @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                int i = 0;
                if (interfaceMapMarkerClickCallback == null || marker == null) {
                    LogUtil.j("Track_HmsMap", "interfaceMapMarkerClickCallback or marker is null");
                    return false;
                }
                while (i < jrg.this.ah.size()) {
                    if (marker.equals(jrg.this.ah.get(i))) {
                        LogUtil.a("Track_HmsMap", "click Marker count:", Integer.valueOf(i));
                        interfaceMapMarkerClickCallback.onMarkerClick(i);
                        return true;
                    }
                    i++;
                }
                i = -1;
                LogUtil.a("Track_HmsMap", "click Marker count:", Integer.valueOf(i));
                interfaceMapMarkerClickCallback.onMarkerClick(i);
                return true;
            }
        });
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLng f38928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38929c = true;

        e() {
        }

        public String toString() {
            return "to show" + this.f38929c;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<Integer> addHiHealthMarkers(List<jpk> list) {
        ArrayList<MarkerOptions> arrayListD = izt.d(list);
        ArrayList arrayList = new ArrayList();
        if (!njy.e(arrayListD)) {
            if (this.ah == null) {
                this.ah = new Vector<>();
            }
            Iterator<MarkerOptions> it = arrayListD.iterator();
            while (it.hasNext()) {
                this.ah.add(this.r.addMarker(it.next()));
                arrayList.add(Integer.valueOf(this.ah.size() - 1));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jru jruVar, int i) {
        CameraUpdate cameraUpdateNewLatLngBounds;
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in animateCameraBounds");
            return;
        }
        if (jruVar == null || njy.e(jruVar.e())) {
            LogUtil.e("Track_HmsMap", "param is null in animateCameraByBounds");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<jpg> it = jruVar.e().iterator();
        while (it.hasNext()) {
            builder.include(izt.c(it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        int iB = jruVar.b();
        int iA = jruVar.a();
        if (iB == 0 || iA == 0) {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, jruVar.d());
        } else {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, iB, iA, jruVar.d());
        }
        this.r.moveCamera(cameraUpdateNewLatLngBounds);
        float fC = jruVar.c();
        if (Float.compare(fC, 0.0f) != 0) {
            e(fC, latLngBoundsBuild.getCenter(), i);
        }
    }

    private void e(float f, LatLng latLng, int i) {
        final CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latLng).bearing(360.0f - f).zoom(getMapZoom()).build());
        if (i <= 0) {
            this.r.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.r.animateCamera(cameraUpdateNewCameraPosition, i, new HuaweiMap.CancelableCallback() { // from class: jrg.4
                @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                public void onFinish() {
                }

                @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
                public void onCancel() {
                    jrg.this.r.moveCamera(cameraUpdateNewCameraPosition);
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void scrollBy(float f, float f2) {
        if (this.r == null) {
            LogUtil.e("Track_HmsMap", "map is null in scrollBy");
        } else {
            this.r.moveCamera(CameraUpdateFactory.scrollBy(-f, -f2));
        }
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
}
