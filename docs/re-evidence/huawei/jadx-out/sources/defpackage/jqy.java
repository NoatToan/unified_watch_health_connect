package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
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
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jqy implements InterfaceHiMap {
    private PolylineOptions af;
    private List<jpg> ah;
    private Polyline ai;
    private Marker aj;
    private SupportMapFragment ap;
    private List<LatLng> ar;
    private Context d;
    private String e;
    private Polyline g;
    private Marker i;
    private String m;
    private GoogleMap n;
    private List<Integer> o;
    private SparseArray<Marker> u;
    private InterfaceMapCallback x;
    private List<LatLng> y;
    private Marker f = null;
    private boolean p = true;
    private boolean q = true;
    private boolean r = true;
    private ArrayList<Marker> ab = new ArrayList<>(16);
    private ArrayList<c> v = new ArrayList<>(16);
    private int ao = 0;
    private int h = 0;
    private int an = 0;
    private int ac = 0;
    private int k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CameraUpdate f38881c = null;
    private List<jpg> am = new ArrayList(16);
    private List<LatLng> ak = new ArrayList(16);
    private List<LatLng> j = new ArrayList(16);
    private List<Integer> al = new ArrayList(16);
    private List<PolylineOptions> ag = new ArrayList(16);
    private List<List<LatLng[]>> ad = new ArrayList(16);
    private ArrayList<MarkerOptions> aa = new ArrayList<>(16);
    private List<jpk> l = new ArrayList(16);
    private boolean t = true;
    private boolean s = true;
    private int w = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Vector<Polyline> f38880b = new Vector<>();
    private final Map<String, GroundOverlay> z = new ConcurrentHashMap();
    private final Map<Polyline, PolylineOptions> aq = new ConcurrentHashMap();
    private final Map<String, Polyline> ae = new ConcurrentHashMap();
    private int as = izw.q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f38879a = new Handler() { // from class: jqy.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a("Track_GoogleMapModel", "msg is null");
                return;
            }
            super.handleMessage(message);
            if (jqy.this.i != null) {
                if (message.what != 0) {
                    if (message.what != 1) {
                        if (message.what != 2) {
                            if (message.what != 3) {
                                LogUtil.d("Track_GoogleMapModel", "wrong msg");
                                return;
                            }
                            if (njy.e(jqy.this.y)) {
                                LogUtil.j("Track_GoogleMapModel", "handleMessage: mLineList is empty");
                                return;
                            }
                            if (jqy.this.ai == null) {
                                LogUtil.j("Track_GoogleMapModel", "handleMessage: mPolyLine is null");
                                return;
                            }
                            jqy.this.ai.setPoints(jqy.this.y);
                            int size = jqy.this.y.size() - 1;
                            if (njy.c(jqy.this.y, size)) {
                                jqy jqyVar = jqy.this;
                                jqyVar.addEndMarker(izq.c((LatLng) jqyVar.y.get(size)));
                                jqy jqyVar2 = jqy.this;
                                jqyVar2.animateCamera(izq.c((LatLng) jqyVar2.y.get(size)), 1000L, (InterfaceMapCallback) null);
                                return;
                            }
                            return;
                        }
                        jqy.this.b();
                        return;
                    }
                    jqy.this.i.setVisible(true);
                    jqy.this.d(0);
                    return;
                }
                jqy.this.i.setVisible(false);
                jqy.this.d(1);
            }
        }
    };

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
        return 2;
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
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCameraChangeListener() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onPause() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onResume() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStart() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onStop() {
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

    public jqy(Context context, SupportMapFragment supportMapFragment, GoogleMap googleMap) {
        if (context == null || googleMap == null) {
            throw new RuntimeException("context or map is null");
        }
        this.d = context;
        this.n = googleMap;
        this.ap = supportMapFragment;
        PolylineOptions polylineOptions = new PolylineOptions();
        this.af = polylineOptions;
        polylineOptions.color(this.as).width(15.0f).zIndex(10.0f).visible(true);
        this.y = new ArrayList(16);
        this.ai = this.n.addPolyline(this.af);
        this.ar = new ArrayList(16);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawAddMapTracking(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            return;
        }
        this.ar.add(izq.b(jpgVar));
        this.ai.setPoints(this.ar);
        animateCamera(jpgVar2, 1000L, (InterfaceMapCallback) null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jpg jpgVar, long j, InterfaceMapCallback interfaceMapCallback) {
        float f;
        if (jpgVar == null || this.n == null) {
            return;
        }
        GoogleMap.CancelableCallback cancelableCallbackD = d(interfaceMapCallback);
        if (this.p) {
            this.p = false;
            f = 16.5f;
        } else if (this.n.getCameraPosition() == null) {
            return;
        } else {
            f = this.n.getCameraPosition().zoom;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(izq.b(jpgVar)).zoom(f).bearing(0.0f).tilt(25.0f).build());
        if (this.s) {
            this.s = false;
            this.n.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.n.animateCamera(cameraUpdateNewCameraPosition, cancelableCallbackD);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addLinePoint(jrt jrtVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in drawLine");
            return;
        }
        if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
            return;
        }
        if (this.f38880b.size() <= 0) {
            this.f38880b.add(this.n.addPolyline(new PolylineOptions().add(izq.b(jrtVar.d())).width(jrtVar.a() * 0.9f).color(jrtVar.e())));
            return;
        }
        int size = this.f38880b.size() - 1;
        if (this.f38880b.get(size) == null || e(jrtVar, this.f38880b.get(size)) || njy.e(this.f38880b.get(size).getPoints()) || this.f38880b.get(size).getPoints().size() > 242) {
            PolylineOptions polylineOptionsColor = new PolylineOptions().add(izq.b(jrtVar.d())).width(jrtVar.a() * 0.9f).color(jrtVar.e());
            if (jrtVar.j()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Dot());
                polylineOptionsColor.pattern(arrayList);
            } else {
                polylineOptionsColor.add(izq.b(jrtVar.b()));
            }
            this.f38880b.add(this.n.addPolyline(polylineOptionsColor));
            return;
        }
        List<LatLng> points = this.f38880b.get(size).getPoints();
        points.add(izq.b(jrtVar.d()));
        points.add(izq.b(jrtVar.b()));
        this.f38880b.get(size).setPoints(points);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void removeLinePoint() {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in drawLine");
            return;
        }
        if (this.f38880b.size() <= 0) {
            LogUtil.j("Track_GoogleMapModel", "mAheadMoveLines.size() <= 0");
            return;
        }
        int size = this.f38880b.size() - 1;
        if (njy.e(this.f38880b, size)) {
            LogUtil.j("Track_GoogleMapModel", "removeLinePoint mAheadMoveLines isOutOfBounds ", Integer.valueOf(size));
            return;
        }
        List<LatLng> points = this.f38880b.get(size).getPoints();
        if (points != null) {
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                points.remove(points.size() - 1);
            }
            if (points.size() > 0) {
                this.f38880b.get(size).setPoints(points);
                return;
            } else {
                this.f38880b.get(size).remove();
                this.f38880b.remove(size);
                return;
            }
        }
        this.f38880b.get(size).remove();
        this.f38880b.remove(size);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(List<jpi> list) {
        if (njy.e(list)) {
            return;
        }
        jpg jpgVarB = izy.b(list.get(list.size() - 1));
        this.y.add(izq.b(jpgVarB));
        if (this.q) {
            if (this.ai == null) {
                LogUtil.j("Track_GoogleMapModel", "drawLine: mPolyLine is null");
                return;
            }
            if (njy.e(this.y)) {
                LogUtil.j("Track_GoogleMapModel", "drawLine: mLineList is empty");
                return;
            }
            this.ai.setPoints(this.y);
            if (list.size() > 0) {
                addEndMarker(jpgVarB);
                animateCamera(jpgVarB, 1000L, (InterfaceMapCallback) null);
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineColor(int i, boolean z) {
        Polyline polyline;
        this.as = i;
        if (!z || (polyline = this.ai) == null) {
            return;
        }
        polyline.setColor(i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "drawLine lastLatLng or currentLatLng is null");
            return;
        }
        addEndMarker(jpgVar2);
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.as).width(15.0f).zIndex(10.0f).visible(true).add(izq.b(jpgVar), izq.b(jpgVar2));
        this.n.addPolyline(polylineOptions);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawInterrupt(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "drawInterrupt lastLatLng or currentLatLng is null");
            return;
        }
        addEndMarker(jpgVar);
        Iterator<PolylineOptions> it = a(izq.b(jpgVar), izq.b(jpgVar2)).iterator();
        while (it.hasNext()) {
            this.n.addPolyline(it.next());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addStartMarker(jpg jpgVar, int i) {
        if (jpgVar == null) {
            return;
        }
        izq.c(this.n, jpgVar, i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addSportStartMarker(jpg jpgVar, int i) {
        if (jpgVar == null) {
            return;
        }
        Marker marker = this.aj;
        if (marker != null) {
            marker.remove();
        }
        this.aj = izq.c(this.n, jpgVar, i);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIconPath(String str, String str2) {
        this.m = str;
        this.e = str2;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String addOverlay(jrz jrzVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "mAMap is null in addGroundOverlay");
            return null;
        }
        if (jrzVar == null) {
            LogUtil.e("Track_GoogleMapModel", "overlayDesc is null in addGroundOverlay");
            return null;
        }
        GroundOverlay groundOverlayAddGroundOverlay = this.n.addGroundOverlay(new GroundOverlayOptions().position(izq.b(jrzVar.a()), jrzVar.b()).image(BitmapDescriptorFactory.fromBitmap(jrzVar.e())).bearing(jrzVar.d()).zIndex(jrzVar.c()).visible(jrzVar.g()));
        if (groundOverlayAddGroundOverlay == null) {
            LogUtil.e("Track_GoogleMapModel", "add GroundOverlay fail");
            return null;
        }
        String id = groundOverlayAddGroundOverlay.getId();
        this.z.put(id, groundOverlayAddGroundOverlay);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOverlayVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.a("Track_GoogleMapModel", "id is null in setOverlayVisible");
            return;
        }
        GroundOverlay groundOverlay = this.z.get(str);
        if (groundOverlay == null) {
            return;
        }
        groundOverlay.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar, boolean z) {
        if (z) {
            this.f = null;
        }
        addEndMarker(jpgVar);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addEndMarker(jpg jpgVar) {
        if (jpgVar == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "updateMarkers latLng == null");
            return;
        }
        Marker marker = this.f;
        if (marker == null) {
            Marker markerB = izq.b(this.n, jpgVar, this.e);
            this.i = markerB;
            if (this.t) {
                if (markerB != null) {
                    markerB.setVisible(false);
                }
                this.f = this.n.addMarker(new MarkerOptions().position(izq.b(jpgVar)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_ending)));
                return;
            } else {
                this.f = izq.c(this.n, jpgVar, this.m);
                d(1);
                return;
            }
        }
        marker.setPosition(izq.b(jpgVar));
        Marker marker2 = this.i;
        if (marker2 != null) {
            marker2.setPosition(izq.b(jpgVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (c()) {
            return;
        }
        Handler handler = this.f38879a;
        if (handler == null) {
            ReleaseLogUtil.a("Track_GoogleMapModel", "mAddCircleHandler is null in updateMarkerBgMsg");
            return;
        }
        handler.removeMessages(0);
        this.f38879a.removeMessages(1);
        Message messageObtainMessage = this.f38879a.obtainMessage();
        messageObtainMessage.what = i;
        this.f38879a.sendMessageDelayed(messageObtainMessage, 900L);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadMapWithPreprocessData(List<jrp> list) {
        if (list == null) {
            InterfaceMapCallback interfaceMapCallback = this.x;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
                return;
            }
            return;
        }
        this.ah = new ArrayList();
        this.ac = list.size();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int i = 0;
        if (this.ac > 0) {
            this.an = list.get(0).h();
            this.h = list.get(0).b().size();
        }
        for (jrp jrpVar : list) {
            this.al.add(Integer.valueOf(jrpVar.h()));
            c(jrpVar, builder);
            d(jrpVar);
            e(i, jrpVar);
            i++;
            this.am.addAll(this.ah);
            this.l = jrpVar.c();
            this.aa = izt.e(jrpVar.c());
        }
        e(builder);
        Context context = this.d;
        if (context != null && (context instanceof Activity)) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: jra
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38902c.d();
                }
            });
        }
        InterfaceMapCallback interfaceMapCallback2 = this.x;
        if (interfaceMapCallback2 != null) {
            interfaceMapCallback2.onFinish();
        }
        LogUtil.a("Track_GoogleMapModel", "initGoogleMap loadMapWithPreprocessData end");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeTrackColor(int i) {
        Iterator<Polyline> it = this.aq.keySet().iterator();
        while (it.hasNext()) {
            it.next().setColor(i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void resetTrackColor() {
        for (Map.Entry<Polyline, PolylineOptions> entry : this.aq.entrySet()) {
            entry.getKey().setColor(entry.getValue().getColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.n == null || njy.e(this.aa)) {
            return;
        }
        for (int i = 1; i < this.aa.size() - 1; i++) {
            MarkerOptions markerOptions = this.aa.get(i);
            if (markerOptions != null) {
                this.n.addMarker(markerOptions);
            }
        }
    }

    private void e(LatLngBounds.Builder builder) {
        Context context = this.d;
        if (context == null) {
            LogUtil.j("Track_GoogleMapModel", "setCenterPoint() Context is null");
            return;
        }
        int dimension = (int) context.getResources().getDimension(R.dimen.detail_share_content_viewpager_width);
        int dimension2 = (int) (((double) this.d.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d);
        try {
            LatLngBounds latLngBoundsBuild = builder.build();
            LatLng latLng = latLngBoundsBuild.southwest;
            LatLng latLng2 = latLngBoundsBuild.northeast;
            LatLng latLng3 = new LatLng(latLng2.latitude - ((latLng2.latitude - latLng.latitude) * 1.55d), latLng.longitude);
            LatLngBounds.Builder builder2 = new LatLngBounds.Builder();
            builder2.include(latLngBoundsBuild.northeast);
            builder2.include(latLng3);
            this.f38881c = CameraUpdateFactory.newLatLngBounds(builder2.build(), dimension, dimension2, 10);
        } catch (IllegalArgumentException e) {
            LogUtil.e("Track_GoogleMapModel", e.getMessage());
        }
    }

    private void c(jrp jrpVar, LatLngBounds.Builder builder) {
        List<jpf> listA = jrpVar.a();
        if (njy.e(listA)) {
            LogUtil.a("Track_GoogleMapModel", "lineList is empty");
            InterfaceMapCallback interfaceMapCallback = this.x;
            if (interfaceMapCallback != null) {
                interfaceMapCallback.onCancel();
                return;
            }
            return;
        }
        for (jpf jpfVar : listA) {
            PolylineOptions polylineOptionsA = a(jpfVar, jrpVar.h());
            ArrayList arrayList = new ArrayList();
            int iA = jpfVar.a();
            for (jpg jpgVar : jpfVar.d()) {
                LatLng latLngB = izq.b(jpgVar);
                arrayList.add(latLngB);
                builder.include(latLngB);
                if (iA != 2) {
                    this.ah.add(jpgVar);
                }
            }
            if (jpfVar.a() == 2) {
                this.ag.addAll(a((LatLng) arrayList.get(0), (LatLng) arrayList.get(arrayList.size() - 1)));
            } else {
                polylineOptionsA.addAll(arrayList);
            }
            this.ag.add(polylineOptionsA);
        }
    }

    private PolylineOptions a(jpf jpfVar, int i) {
        if ((nub.e(i) || i == 222) && jpfVar.a() == 1 && jpfVar.b().size() > 0) {
            return new PolylineOptions().color(jpfVar.b().get(0).intValue()).width(15.0f).zIndex(10.0f).visible(true);
        }
        return new PolylineOptions().color(izw.y).width(15.0f).zIndex(10.0f).visible(true);
    }

    private void d(jrp jrpVar) {
        List<jpg> listD = jrpVar.d();
        if (!njy.e(listD)) {
            Iterator<jpg> it = listD.iterator();
            while (it.hasNext()) {
                this.ak.add(izq.b(it.next()));
            }
        }
        List<jpg> listE = jrpVar.e();
        if (njy.e(listE)) {
            return;
        }
        Iterator<jpg> it2 = listE.iterator();
        while (it2.hasNext()) {
            this.j.add(izq.b(it2.next()));
        }
    }

    private void e(int i, jrp jrpVar) {
        List<jpg> listB = jrpVar.b();
        if (njy.e(listB)) {
            return;
        }
        for (jpg jpgVar : listB) {
            c cVar = new c();
            cVar.d = izq.b(jpgVar);
            cVar.f38901c = true;
            if (!njy.e(this.v)) {
                d(i, cVar);
            }
            this.v.add(cVar);
        }
    }

    private void d(int i, c cVar) {
        ArrayList<c> arrayList = this.v;
        c cVar2 = arrayList.get(arrayList.size() - 1);
        if (cVar2 == null || !cVar2.equals(cVar)) {
            return;
        }
        if (this.j.size() <= i || !cVar.d.equals(this.j.get(i))) {
            cVar2.f38901c = false;
        } else {
            cVar.f38901c = false;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(List<MotionData> list) {
        List<jpg> list2;
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "onMapLoaded data is null");
            return;
        }
        this.an = list.get(0).getSportType();
        this.ac = list.size();
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (MotionData motionData : list) {
            ArrayList arrayList3 = new ArrayList(16);
            Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
            if (lbsDataMap == null || lbsDataMap.isEmpty()) {
                return;
            }
            d(arrayList, arrayList2, arrayList3, lbsDataMap);
            LogUtil.a("Track_GoogleMapModel", "list SIZE:" + arrayList2.size());
            if (arrayList2.size() < 3 && this.t) {
                return;
            }
            b(arrayList3);
            b(arrayList3, motionData.getSportType());
            e(arrayList3);
            List<jpg> list3 = this.am;
            if (list3 != null && (list2 = this.ah) != null) {
                list3.addAll(list2);
            }
        }
        if (njy.e(arrayList2)) {
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        Iterator<LatLng> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList4.add(izq.c(it.next()));
        }
        moveCameraLatLngBounds(arrayList4);
        c(arrayList2, list.get(0).getPaceList());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onMapLoaded(jpg jpgVar, float f) {
        CommonUtil.d("Track_GoogleMapModel", "into google map");
        if (jpgVar == null) {
            LogUtil.a("Track_GoogleMapModel", "onMapLoaded, hiHealthLatLng is null");
            return;
        }
        this.n.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(jpgVar.d, jpgVar.f38787a)));
        this.n.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setOnMapLoadedListener(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        GoogleMap googleMap = this.n;
        if (googleMap != null) {
            googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback(this) { // from class: jqy.12
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                public void onMapLoaded() {
                    InterfaceMapLoadedCallback interfaceMapLoadedCallback2 = interfaceMapLoadedCallback;
                    if (interfaceMapLoadedCallback2 != null) {
                        interfaceMapLoadedCallback2.onMapLoaded();
                    }
                }
            });
        }
    }

    private void d(List<LatLng> list, List<LatLng> list2, List<LatLng> list3, Map<Long, double[]> map) {
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            LatLng latLng = new LatLng(entry.getValue()[0], entry.getValue()[1]);
            if (list2.size() <= 0 || !izt.c(izq.c(list2.get(list2.size() - 1)), izq.c(latLng))) {
                list2.add(latLng);
                list3.add(latLng);
                if (!izt.a(izq.c(latLng))) {
                    list.add(latLng);
                }
            }
        }
    }

    private void e(List<LatLng> list) {
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            LatLng latLng = list.get(size);
            if (!izt.a(izq.c(latLng))) {
                addEndMarker(izq.c(latLng));
                this.k = size;
                LogUtil.a("Track_GoogleMapModel", "addEndMarker");
                return;
            }
        }
    }

    private void b(List<LatLng> list, int i) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LatLng latLng = list.get(i2);
            if (!izt.a(izq.c(latLng))) {
                addSportStartMarker(izq.c(latLng), i);
                this.ao = i2;
                List<jpg> list2 = this.ah;
                if (list2 != null) {
                    list2.add(0, e(latLng));
                }
                LogUtil.a("Track_GoogleMapModel", "addStartMarker");
                return;
            }
        }
    }

    private void b(List<LatLng> list) {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.as).width(15.0f).zIndex(10.0f).visible(true);
        int size = list.size();
        ArrayList arrayList = new ArrayList(16);
        d(list, polylineOptions, size, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        this.n.addPolyline(polylineOptions).setPoints(arrayList);
        if (this.ah != null) {
            c(arrayList);
        }
    }

    private void c(List<LatLng> list) {
        boolean z = true;
        for (LatLng latLng : list) {
            if (z) {
                z = false;
            } else {
                this.ah.add(e(latLng));
            }
        }
    }

    private void d(List<LatLng> list, PolylineOptions polylineOptions, int i, List<LatLng> list2) {
        for (int i2 = 0; i2 < i; i2++) {
            LatLng latLng = list.get(i2);
            if (izt.a(izq.c(latLng))) {
                if (!list2.isEmpty()) {
                    this.n.addPolyline(polylineOptions).setPoints(list2);
                    if (this.ah != null) {
                        c(list2);
                    }
                    list2.clear();
                }
                a(list, i2);
            } else {
                list2.add(latLng);
            }
        }
    }

    private jpg e(LatLng latLng) {
        return izq.c(latLng);
    }

    private void a(List<LatLng> list, int i) {
        if (list == null) {
            return;
        }
        int size = list.size();
        LatLng latLng = i > 0 ? list.get(i - 1) : null;
        LatLng latLng2 = i < size + (-1) ? list.get(i + 1) : null;
        if (latLng == null || latLng2 == null) {
            return;
        }
        Iterator<PolylineOptions> it = a(latLng, latLng2).iterator();
        while (it.hasNext()) {
            this.n.addPolyline(it.next());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void loadingEnd() {
        Marker markerC;
        CameraUpdate cameraUpdate = this.f38881c;
        if (cameraUpdate != null) {
            this.n.moveCamera(cameraUpdate);
        }
        for (int i = 0; i < this.ac; i++) {
            List<LatLng> list = this.ak;
            if (list != null && (markerC = izq.c(this.n, izq.c(list.get(i)), this.al.get(i).intValue())) != null) {
                markerC.setZIndex(14.0f);
            }
            if (this.j != null) {
                if (i < this.ac - 1) {
                    this.f = this.n.addMarker(new MarkerOptions().position(this.j.get(i)).draggable(false).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromResource(R.drawable.hw_show_map_tracking_change)).zIndex(14.0f));
                } else {
                    Bitmap bitmapB = izt.b(this.l);
                    if (bitmapB == null) {
                        bitmapB = qqf.c(R.drawable.hw_show_map_ending);
                    }
                    this.f = this.n.addMarker(new MarkerOptions().position(this.j.get(i)).draggable(false).anchor(0.5f, 0.9f).icon(BitmapDescriptorFactory.fromBitmap(bitmapB)).zIndex(14.0f));
                }
            }
            a();
            List<List<LatLng[]>> list2 = this.ad;
            if (list2 != null && njy.c(list2, i) && !this.ad.get(i).isEmpty()) {
                for (LatLng[] latLngArr : this.ad.get(i)) {
                    a(latLngArr[0], latLngArr[1]);
                }
            }
        }
    }

    private void a() {
        List<PolylineOptions> list = this.ag;
        if (list == null) {
            return;
        }
        for (PolylineOptions polylineOptions : list) {
            try {
                this.aq.put(this.n.addPolyline(polylineOptions), polylineOptions);
            } catch (IllegalArgumentException e) {
                ReleaseLogUtil.a("Track_GoogleMapModel", LogAnonymous.b(e));
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void registerLoadingListener(InterfaceMapCallback interfaceMapCallback) {
        this.x = interfaceMapCallback;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showOrHide(boolean z) {
        if (qqs.e(this.d)) {
            LogUtil.a("Track_GoogleMapModel", "setMapType:", z ? " google_night" : " google_night_hide");
            this.n.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.d, z ? R.raw.mapstyle_night_google : R.raw.mapstyle_night_google_hide));
            this.n.setMapType(1);
        } else {
            LogUtil.a("Track_GoogleMapModel", "setMapType: google_normal");
            this.n.setMapType(z ? 1 : 0);
        }
        LogUtil.a("Track_GoogleMapModel", "showOrHide isShow = ", Boolean.valueOf(z));
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
        LogUtil.a("Track_GoogleMapModel", "showSatelLiteState isShowMap = ", Boolean.valueOf(z), ",isShowTrackMapTypeSatellite=", Boolean.valueOf(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapShowType(int i) {
        if (this.w == i) {
            return;
        }
        this.w = i;
        if (this.n != null) {
            if (qqs.e(this.d)) {
                this.n.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.d, R.raw.mapstyle_night_google));
            } else {
                this.n.setMapStyle(null);
            }
            if (i == 0) {
                this.n.setMapType(1);
            } else if (i == 1) {
                this.n.setMapType(2);
            } else if (i == 2) {
                this.n.setMapType(0);
            }
            LogUtil.d("Track_GoogleMapModel", "mapType = ", Integer.valueOf(this.n.getMapType()));
            return;
        }
        LogUtil.j("Track_GoogleMapModel", "google map is null");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraLatLngBounds(List<jpg> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "moveCameraLatLngBounds list is null");
            return;
        }
        if (this.d == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "moveCameraLatLngBounds context is null");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int size = list.size();
        Iterator<jpg> it = list.iterator();
        while (it.hasNext()) {
            builder.include(izq.b(it.next()));
        }
        final int i = 10;
        this.f38881c = CameraUpdateFactory.newLatLngBounds(builder.build(), (int) this.d.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.d.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.75d), 10);
        if (size > 1) {
            try {
                SupportMapFragment supportMapFragment = this.ap;
                if (supportMapFragment != null && supportMapFragment.getView() != null) {
                    final View view = this.ap.getView();
                    view.post(new Runnable() { // from class: jqy.13
                        @Override // java.lang.Runnable
                        public void run() {
                            int height = view.getHeight() / 2;
                            int width = view.getWidth() / 2;
                            int i2 = i;
                            if (i2 >= height || i2 >= width) {
                                LogUtil.e("Track_GoogleMapModel", "mapHeightHalf is ", Integer.valueOf(height), " mapWidthHalf is ", Integer.valueOf(width));
                            } else if (jqy.this.n != null) {
                                jqy.this.n.moveCamera(jqy.this.f38881c);
                            }
                        }
                    });
                    return;
                }
                LogUtil.e("Track_GoogleMapModel", "map is null in moveCameraLatLngBounds");
            } catch (Exception e) {
                ReleaseLogUtil.a("Track_GoogleMapModel", "moveCameraLatLngBounds:", LogAnonymous.b(e));
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void getMapScreenShot(final Handler handler, MotionData motionData) {
        if (handler == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "getMapScreenShot handler is null");
            return;
        }
        if (this.n == null) {
            handler.sendEmptyMessageDelayed(1, 200L);
            return;
        }
        this.r = true;
        final Runnable runnable = new Runnable() { // from class: jqy.14
            @Override // java.lang.Runnable
            public void run() {
                if (jqy.this.r) {
                    LogUtil.a("Track_GoogleMapModel", "maps Bitmap fail to snapshot");
                    Message messageObtain = Message.obtain(handler);
                    messageObtain.obj = null;
                    messageObtain.what = 1;
                    messageObtain.sendToTarget();
                    jqy.this.r = false;
                }
            }
        };
        handler.postDelayed(runnable, 1000L);
        try {
            this.n.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: jqy.17
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap) {
                    if (jqy.this.r) {
                        Message messageObtain = Message.obtain(handler);
                        messageObtain.obj = bitmap;
                        messageObtain.what = 1;
                        messageObtain.sendToTarget();
                        jqy.this.r = false;
                        handler.removeCallbacks(runnable);
                    }
                }
            });
        } catch (IllegalStateException e) {
            LogUtil.e("Track_GoogleMapModel", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setAllGesturesEnabled(boolean z) {
        GoogleMap googleMap = this.n;
        if (googleMap != null) {
            googleMap.getUiSettings().setAllGesturesEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setZoomControlsEnabled(boolean z) {
        GoogleMap googleMap = this.n;
        if (googleMap != null) {
            googleMap.getUiSettings().setZoomControlsEnabled(z);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void pauseSportClear() {
        this.f38879a.sendEmptyMessage(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.af = polylineOptions;
        polylineOptions.color(this.as).width(15.0f).zIndex(10.0f).visible(true);
        this.ai = this.n.addPolyline(this.af);
        List<LatLng> list = this.ar;
        if (list != null && !list.isEmpty()) {
            this.ar.clear();
        }
        if (njy.b(this.y)) {
            this.y.clear();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onCreate(Bundle bundle, boolean z, boolean z2) {
        if (this.n == null) {
            ReleaseLogUtil.e("Track_GoogleMapModel", "onCreate Google Map is null");
            return;
        }
        LogUtil.a("Track_GoogleMapModel", "onCreate():");
        this.n.getUiSettings().setZoomControlsEnabled(false);
        this.n.getUiSettings().setMyLocationButtonEnabled(false);
        this.n.getUiSettings().setCompassEnabled(false);
        this.n.getUiSettings().setTiltGesturesEnabled(false);
        if (z) {
            Object systemService = this.d.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (!(systemService instanceof WindowManager)) {
                LogUtil.e("Track_GoogleMapModel", "not WindowManager");
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            this.n.setPadding(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 4, displayMetrics.widthPixels / 2, (displayMetrics.heightPixels * 3) / 4);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void onDestroy() {
        if (this.d != null) {
            File file = new File(this.d.getFilesDir(), "google_temp.png");
            if (file.exists()) {
                if (!file.delete()) {
                    LogUtil.a("Track_GoogleMapModel", "delete google temp error");
                } else {
                    LogUtil.a("Track_GoogleMapModel", "delete google temp success");
                }
            }
            this.d = null;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setScreenOnOrForegrand(boolean z) {
        this.q = z;
        if (z) {
            forceDrawLine();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void screenShotToFile(final InterfaceSnapshotCallback interfaceSnapshotCallback) {
        SupportMapFragment supportMapFragment;
        synchronized (this) {
            try {
                if (interfaceSnapshotCallback == null) {
                    LogUtil.a("Track_GoogleMapModel", "callback is null");
                    return;
                }
                if (this.n != null && (supportMapFragment = this.ap) != null) {
                    View view = supportMapFragment.getView();
                    if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                        return;
                    }
                    try {
                        this.n.snapshot(new GoogleMap.SnapshotReadyCallback(this) { // from class: jqy.20
                            @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                            public void onSnapshotReady(Bitmap bitmap) {
                                interfaceSnapshotCallback.onSnapshotReady(bitmap);
                            }
                        });
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        LogUtil.e("Track_GoogleMapModel", LogAnonymous.b(e));
                    }
                    return;
                }
                interfaceSnapshotCallback.onSnapshotReady(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<PolylineOptions> a(LatLng latLng, LatLng latLng2) {
        Context context;
        LatLng latLng3 = latLng;
        ArrayList arrayList = new ArrayList();
        String str = "Track_GoogleMapModel";
        if (latLng2 == null || latLng3 == null || (context = this.d) == null) {
            LogUtil.j("Track_GoogleMapModel", "currentLatLng or lastLatLng or mContext is null");
            return arrayList;
        }
        int color = ContextCompat.getColor(context, R.color.pause_line);
        double d = (latLng2.latitude - latLng3.latitude) / 18.0d;
        double d2 = (latLng2.longitude - latLng3.longitude) / 18.0d;
        int i = (int) 18.0d;
        int i2 = 0;
        while (i2 < i) {
            LogUtil.a(str, "zoomNew = 18.0");
            LatLng latLng4 = i2 > 0 ? new LatLng(latLng3.latitude + (d * 0.25d), latLng3.longitude + (0.25d * d2)) : latLng3;
            PolylineOptions polylineOptions = new PolylineOptions();
            polylineOptions.color(color).width(15).zIndex(10.0f).visible(izt.d()).add(latLng4).add(new LatLng(latLng3.latitude + d, latLng3.longitude + d2));
            arrayList.add(polylineOptions);
            i2++;
            latLng3 = new LatLng(latLng3.latitude + d, latLng3.longitude + d2);
            str = str;
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setIsStop(boolean z) {
        this.t = z;
    }

    private boolean c() {
        return this.t;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveToCenter() {
        CameraUpdate cameraUpdate = this.f38881c;
        if (cameraUpdate != null) {
            this.n.moveCamera(cameraUpdate);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void forceDrawLine() {
        if (this.y.size() <= 0) {
            return;
        }
        this.f38879a.sendEmptyMessage(3);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void intervalTrackMarkers(int i) {
        if (i == -1 || i == 0) {
            e();
        } else {
            c(i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<jpg> requestSimplePoints() {
        return this.am;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom() {
        moveCameraByZoom(12.5f);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByZoom(float f) {
        this.n.moveCamera(CameraUpdateFactory.zoomTo(f));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveCameraByLatLng(jpg jpgVar) {
        this.n.moveCamera(CameraUpdateFactory.newLatLng(izq.b(jpgVar)));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public double[] getLastLocation(Context context, Location location) {
        if (location == null) {
            ReleaseLogUtil.a("Track_GoogleMapModel", "getLastLocation location is null");
            return new double[0];
        }
        return new double[]{location.getLatitude(), location.getLongitude()};
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void updateSportMarker(jpg jpgVar, BitmapDrawable bitmapDrawable) {
        if (jpgVar == null || bitmapDrawable == null) {
            ReleaseLogUtil.a("Track_GoogleMapModel", "updateSportMarker hiHealthLatLng or bitmapDrawable is null");
            return;
        }
        Marker marker = this.f;
        if (marker != null) {
            marker.remove();
        }
        this.f = this.n.addMarker(new MarkerOptions().position(izq.b(jpgVar)).draggable(false).anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(bitmapDrawable.getBitmap())));
    }

    private void c(List<LatLng> list, List<njj> list2) {
        int i;
        LatLng latLng;
        int size = list2.size();
        Integer[] numArr = new Integer[size];
        int iC = c(list2, numArr, new Integer[size], 0);
        for (int i2 = 0; i2 < iC; i2++) {
            try {
                int iIntValue = numArr[i2].intValue();
                int iIntValue2 = numArr[i2].intValue();
                int i3 = this.k;
                if (iIntValue2 > i3) {
                    latLng = list.get(i3);
                    i = this.k;
                } else {
                    int iIntValue3 = numArr[i2].intValue();
                    int i4 = this.ao;
                    if (iIntValue3 < i4) {
                        latLng = list.get(i4);
                        i = this.ao;
                    } else {
                        i = iIntValue;
                        latLng = list.get(iIntValue);
                    }
                }
                c cVar = new c();
                cVar.d = latLng;
                cVar.f38901c = true;
                if (this.v.size() > 0) {
                    ArrayList<c> arrayList = this.v;
                    c cVar2 = arrayList.get(arrayList.size() - 1);
                    if (cVar2.d.equals(latLng)) {
                        if (i == this.k) {
                            cVar.f38901c = false;
                        } else {
                            cVar2.f38901c = false;
                        }
                    }
                }
                this.v.add(cVar);
            } catch (IndexOutOfBoundsException e) {
                LogUtil.j("Track_GoogleMapModel", "setUpKmLatLngList ", e.getMessage());
            }
        }
    }

    private int c(List<njj> list, Integer[] numArr, Integer[] numArr2, int i) {
        for (njj njjVar : list) {
            if (njjVar.c() % 1000 == 0) {
                if (njjVar.c() > 0) {
                    numArr[i] = Integer.valueOf(njjVar.e() + 1);
                    numArr2[i] = Integer.valueOf(njjVar.c() / 1000);
                } else {
                    numArr[i] = Integer.valueOf(njjVar.e() + 1);
                    numArr2[i] = Integer.valueOf(i + 1);
                }
                i++;
            }
        }
        return i;
    }

    private void c(int i) {
        if (this.d == null) {
            LogUtil.j("Track_GoogleMapModel", "mContext is null in setTrackMarkers");
            return;
        }
        int i2 = i - 1;
        while (i2 < this.v.size()) {
            if (this.v.get(i2).f38901c) {
                this.ab.add(this.n.addMarker(izq.d(this.d.getResources(), this.v.get(i2).d, UnitUtil.e(i2 + 1, 1, 0))));
            }
            i2 += i;
        }
        LogUtil.d("Track_GoogleMapModel", "mMarkersList.size = ", Integer.valueOf(this.ab.size()));
    }

    private void e() {
        Iterator<Marker> it = this.ab.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.ab.clear();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38901c = true;
        private LatLng d;

        c() {
        }

        public String toString() {
            return "to show" + this.f38901c;
        }
    }

    private GoogleMap.CancelableCallback d(final InterfaceMapCallback interfaceMapCallback) {
        if (interfaceMapCallback == null) {
            LogUtil.j("Track_GoogleMapModel", "transferCallback callback is null");
            return new GoogleMap.CancelableCallback(this) { // from class: jqy.18
                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onCancel() {
                }

                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onFinish() {
                }
            };
        }
        return new GoogleMap.CancelableCallback(this) { // from class: jqy.19
            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onFinish() {
                interfaceMapCallback.onFinish();
            }

            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onCancel() {
                interfaceMapCallback.onCancel();
            }
        };
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLogoPadding(int i, int i2, int i3, int i4) {
        GoogleMap googleMap = this.n;
        if (googleMap != null) {
            googleMap.setPadding(i, i2, i3, i4 - qrs.d(BaseApplication.getContext(), 2.0f));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jrr jrrVar, long j, final InterfaceMapCallback interfaceMapCallback) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in animateCamera");
            return;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(b(jrrVar));
        if (j <= 0) {
            this.n.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            LogUtil.a("Track_GoogleMapModel", "animateCamera");
            this.n.animateCamera(cameraUpdateNewCameraPosition, (int) j, new GoogleMap.CancelableCallback(this) { // from class: jqy.3
                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onFinish() {
                    if (interfaceMapCallback != null) {
                        LogUtil.a("Track_GoogleMapModel", "animateCamera onFinish");
                        interfaceMapCallback.onFinish();
                    }
                }

                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onCancel() {
                    if (interfaceMapCallback != null) {
                        LogUtil.a("Track_GoogleMapModel", "animateCamera onCancel");
                        interfaceMapCallback.onCancel();
                    }
                }
            });
        }
    }

    private CameraPosition b(jrr jrrVar) {
        if (jrrVar == null) {
            return null;
        }
        return new CameraPosition(izq.b(jrrVar.a()), jrrVar.e(), jrrVar.d(), jrrVar.c());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void stopAnimation() {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "bounds is null in clear");
            return;
        }
        Context context = this.d;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: jqy.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("Track_GoogleMapModel", "stopAnimation");
                    jqy.this.n.stopAnimation();
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void drawLine(jrt jrtVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in drawLine");
            return;
        }
        if (jrtVar == null || jrtVar.d() == null || jrtVar.b() == null) {
            return;
        }
        Polyline polyline = this.g;
        if (polyline == null || e(jrtVar, polyline)) {
            PolylineOptions polylineOptionsColor = new PolylineOptions().add(izq.b(jrtVar.d()), izq.b(jrtVar.b())).width(jrtVar.a() * 0.5f).color(jrtVar.e());
            if (jrtVar.j()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Dot());
                polylineOptionsColor.pattern(arrayList);
                this.g = this.n.addPolyline(polylineOptionsColor);
                return;
            }
            this.g = null;
            this.n.addPolyline(polylineOptionsColor);
            return;
        }
        List<LatLng> points = this.g.getPoints();
        points.add(izq.b(jrtVar.d()));
        points.add(izq.b(jrtVar.b()));
        this.g.setPoints(points);
    }

    private boolean e(jrt jrtVar, Polyline polyline) {
        if (jrtVar.j() && njy.e(polyline.getPattern())) {
            return true;
        }
        return (jrtVar.j() || njy.e(polyline.getPattern())) ? false : true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public String drawLines(jrs jrsVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in drawLine");
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
            arrayList.add(izq.b(jrsVar.d()));
            arrayList.add(izq.b(jrsVar.b()));
        } else {
            Iterator<jpg> it = jrsVar.g().iterator();
            while (it.hasNext()) {
                arrayList.add(izq.b(it.next()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(jrsVar.h())) {
            arrayList2.add(Integer.valueOf(jrsVar.e()));
        } else {
            arrayList2.addAll(jrsVar.h());
        }
        PolylineOptions polylineOptionsVisible = new PolylineOptions().addAll(arrayList).width(jrsVar.a() * 0.9f).color(((Integer) arrayList2.get(0)).intValue()).zIndex(jrsVar.c()).visible(jrsVar.f());
        if (jrsVar.j()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new Dot());
            polylineOptionsVisible.pattern(arrayList3);
        }
        Polyline polylineAddPolyline = this.n.addPolyline(polylineOptionsVisible);
        String id = polylineAddPolyline.getId();
        this.ae.put(id, polylineAddPolyline);
        return id;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setLineVisible(String str, boolean z) {
        if (StringUtils.g(str)) {
            LogUtil.e("Track_GoogleMapModel", "id is null in setLineVisible");
            return;
        }
        Polyline polyline = this.ae.get(str);
        if (polyline == null) {
            return;
        }
        polyline.setVisible(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public GrowAnimationBuilder getGrowAnimation() {
        return new jrl();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void clear() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            LogUtil.e("Track_GoogleMapModel", "clear HuaweiMap is null");
            return;
        }
        googleMap.clear();
        this.u = new SparseArray<>();
        this.o = new ArrayList();
        this.g = null;
        this.f38880b.clear();
        this.aq.clear();
        this.z.clear();
        this.ae.clear();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void moveMarker(final int i, final jpg jpgVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in moveMarker");
        } else {
            if (this.u.get(i, null) == null) {
                return;
            }
            Context context = this.d;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: jqy.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Marker) jqy.this.u.get(i)).setPosition(izq.b(jpgVar));
                    }
                });
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public int addMarker(final jrv jrvVar, final GrowAnimationBuilder growAnimationBuilder) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in addMarker");
            return -1;
        }
        if (jrvVar == null || jrvVar.b() == null) {
            return -1;
        }
        if (this.o == null) {
            this.o = new ArrayList();
        }
        final int size = this.o.size();
        this.o.add(Integer.valueOf(size));
        Context context = this.d;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: jqy.5
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        Marker markerAddMarker = jqy.this.n.addMarker(new MarkerOptions().flat(jrvVar.h()).anchor(((Float) jrvVar.a().first).floatValue(), ((Float) jrvVar.a().second).floatValue()).zIndex(jrvVar.c()).draggable(jrvVar.i()).icon(BitmapDescriptorFactory.fromBitmap(jrvVar.b())).position(izq.b(jrvVar.e())).visible(jrvVar.f()));
                        GrowAnimationBuilder growAnimationBuilder2 = growAnimationBuilder;
                        if (growAnimationBuilder2 instanceof jrl) {
                            ((jrl) growAnimationBuilder2).e(markerAddMarker);
                            growAnimationBuilder.displayAnimation();
                        }
                        if (jqy.this.u == null) {
                            jqy.this.u = new SparseArray();
                        }
                        jqy.this.u.put(size, markerAddMarker);
                    }
                }
            });
        }
        return size;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showMarker(int i, GrowAnimationBuilder growAnimationBuilder) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in restoreMarker");
            return;
        }
        if (this.u == null || i < 0 || i >= this.o.size()) {
            return;
        }
        Marker marker = this.u.get(i);
        if (growAnimationBuilder == null) {
            marker.setVisible(true);
        }
        if (growAnimationBuilder instanceof jrl) {
            ((jrl) growAnimationBuilder).e(marker);
            growAnimationBuilder.displayAnimation();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void hideMarker(final int i, final GrowAnimationBuilder growAnimationBuilder) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in deleteMarker");
        } else {
            if (this.u.get(i, null) == null) {
                return;
            }
            Context context = this.d;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: jqy.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Marker marker = (Marker) jqy.this.u.get(i);
                        if (marker != null) {
                            marker.setVisible(false);
                        }
                        GrowAnimationBuilder growAnimationBuilder2 = growAnimationBuilder;
                        if (growAnimationBuilder2 instanceof jrl) {
                            ((jrl) growAnimationBuilder2).e(marker);
                            growAnimationBuilder.disappearAnimation();
                        }
                    }
                });
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMarkerIcon(int i, Bitmap bitmap) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in setMarkerIcon");
            return;
        }
        List<Integer> list = this.o;
        if (list == null || i < 0 || i >= list.size()) {
            LogUtil.e("Track_GoogleMapModel", "id is error in setMarkerIcon");
            return;
        }
        Marker marker = this.u.get(i);
        if (marker == null) {
            return;
        }
        marker.setIcon(BitmapDescriptorFactory.fromBitmap(bitmap));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setPreviewStatus(jrm jrmVar, int i, int i2, int i3, int i4) {
        if (jrmVar == null) {
            LogUtil.e("Track_GoogleMapModel", "bounds is null in setPreviewStatus");
            return;
        }
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in setPreviewStatus");
        } else if (this.d == null) {
            LogUtil.j("Track_GoogleMapModel", "mContext is null in setPreviewStatus");
        } else {
            this.n.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds.Builder().include(izq.b(jrmVar.d())).include(izq.b(jrmVar.b())).build(), (int) this.d.getResources().getDimension(R.dimen.detail_share_content_viewpager_width), (int) (((double) this.d.getResources().getDimension(R.dimen.detail_share_content_viewpager_height)) * 0.65d), 0));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jrr getMapStatus() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in getMapStatus");
            return new jrr();
        }
        if (googleMap.getCameraPosition() == null) {
            LogUtil.e("Track_GoogleMapModel", "mGoogleMap.getCameraPosition() is null in getMapStatus");
            return new jrr();
        }
        jrr jrrVarE = e(this.n.getCameraPosition());
        jrrVarE.e(c(this.n.getCameraPosition().zoom));
        return jrrVarE;
    }

    private jrr e(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        jrr jrrVar = new jrr();
        jrrVar.b(cameraPosition.bearing).d(izq.c(cameraPosition.target)).c(cameraPosition.tilt).a(cameraPosition.zoom);
        return jrrVar;
    }

    private float c(float f) {
        return (float) (Math.exp(((double) f) * (-0.688d)) * 49671.0d);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMaxZoomLevel() {
        return this.n.getMaxZoomLevel();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setMapLoadedCallback(final InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in setMapLoadedCallback");
        } else {
            if (interfaceMapLoadedCallback == null) {
                return;
            }
            this.n.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback(this) { // from class: jqy.9
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                public void onMapLoaded() {
                    interfaceMapLoadedCallback.onMapLoaded();
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void setCameraChangeCallback(final InterfaceMapStatusChangeCallback interfaceMapStatusChangeCallback) {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in setCameraChangeCallback");
        } else {
            if (interfaceMapStatusChangeCallback == null) {
                return;
            }
            googleMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: jqy.6
                @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
                public void onCameraMove() {
                    interfaceMapStatusChangeCallback.onMapStatusChange(jqy.this.getMapStatus());
                }
            });
            this.n.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: jqy.8
                @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
                public void onCameraIdle() {
                    interfaceMapStatusChangeCallback.onMapStatusChangeFinish(jqy.this.getMapStatus());
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableAllGestures() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in disableAllGestures");
        } else {
            googleMap.getUiSettings().setAllGesturesEnabled(false);
            this.n.getUiSettings().setZoomControlsEnabled(false);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void showPureMap() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in showPureMap");
        } else {
            googleMap.getUiSettings().setCompassEnabled(false);
            this.n.getUiSettings().setMyLocationButtonEnabled(false);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void changeMapType(MapTypeDescription mapTypeDescription, jes jesVar) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in changeMapType");
            return;
        }
        if (mapTypeDescription == null) {
            return;
        }
        if (mapTypeDescription.e() == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.n.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.d, R.raw.mapstyle_night_google_without_text));
        } else if (mapTypeDescription.e() == MapTypeDescription.MapType.MAP_TYPE_CUSTOM) {
            a(jesVar);
        } else {
            this.n.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.d, R.raw.google_without_text));
        }
    }

    private void a(jes jesVar) {
        if (jesVar == null) {
            LogUtil.j("Track_GoogleMapModel", "initCustomMapStyle customMapInformation == null");
        } else {
            this.n.setMapStyle(new MapStyleOptions(Utils.c(jesVar.f())));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapZoom() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            return 0.0f;
        }
        return googleMap.getCameraPosition().zoom;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public float getMapTilt() {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            return 0.0f;
        }
        return googleMap.getCameraPosition().tilt;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public Point getScreenLocation(jpg jpgVar) {
        GoogleMap googleMap = this.n;
        if (googleMap == null || jpgVar == null) {
            LogUtil.e("Track_GoogleMapModel", "googleMap is null or latlng is null");
            return new Point();
        }
        try {
            return googleMap.getProjection().toScreenLocation(izq.b(jpgVar));
        } catch (RuntimeRemoteException e) {
            LogUtil.e("Track_GoogleMapModel", LogAnonymous.b(e));
            return new Point();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public jpg getLatLngByScreenPoint(Point point) {
        GoogleMap googleMap = this.n;
        if (googleMap == null || point == null) {
            LogUtil.e("Track_GoogleMapModel", "googleMap is null or latlng is null");
            return new jpg(0.0d, 0.0d);
        }
        try {
            return izq.c(googleMap.getProjection().fromScreenLocation(point));
        } catch (RuntimeRemoteException e) {
            LogUtil.e("Track_GoogleMapModel", LogAnonymous.b(e));
            return new jpg(0.0d, 0.0d);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void disableMarkerClick() {
        this.n.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener(this) { // from class: jqy.10
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                return true;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void addMarkerClickListener(final InterfaceMapMarkerClickCallback interfaceMapMarkerClickCallback) {
        GoogleMap googleMap = this.n;
        if (googleMap == null) {
            return;
        }
        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: jqy.15
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                int i = 0;
                if (interfaceMapMarkerClickCallback == null || marker == null) {
                    LogUtil.j("Track_GoogleMapModel", "interfaceMapMarkerClickCallback or marker is null");
                    return false;
                }
                while (i < jqy.this.u.size()) {
                    if (marker.equals(jqy.this.u.valueAt(i))) {
                        LogUtil.a("Track_GoogleMapModel", "click Marker count:", Integer.valueOf(i));
                        interfaceMapMarkerClickCallback.onMarkerClick(i);
                        return true;
                    }
                    i++;
                }
                i = -1;
                LogUtil.a("Track_GoogleMapModel", "click Marker count:", Integer.valueOf(i));
                interfaceMapMarkerClickCallback.onMarkerClick(i);
                return true;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public List<Integer> addHiHealthMarkers(List<jpk> list) {
        ArrayList<MarkerOptions> arrayListE = izt.e(list);
        ArrayList arrayList = new ArrayList();
        if (!njy.e(arrayListE)) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            if (this.u == null) {
                this.u = new SparseArray<>();
            }
            for (MarkerOptions markerOptions : arrayListE) {
                int size = this.o.size();
                this.o.add(Integer.valueOf(size));
                this.u.put(size, this.n.addMarker(markerOptions));
                arrayList.add(Integer.valueOf(size));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void animateCamera(jru jruVar, int i) {
        CameraUpdate cameraUpdateNewLatLngBounds;
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in animateCameraBounds");
            return;
        }
        if (jruVar == null || njy.e(jruVar.e())) {
            LogUtil.e("Track_GoogleMapModel", "param is null in animateCameraByBounds");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<jpg> it = jruVar.e().iterator();
        while (it.hasNext()) {
            builder.include(izq.b(it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        int iB = jruVar.b();
        int iA = jruVar.a();
        if (iB == 0 || iA == 0) {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, jruVar.d());
        } else {
            cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, iB, iA, jruVar.d());
        }
        this.n.moveCamera(cameraUpdateNewLatLngBounds);
        float fC = jruVar.c();
        if (Float.compare(fC, 0.0f) != 0) {
            a(fC, latLngBoundsBuild.getCenter(), i);
        }
    }

    private void a(float f, LatLng latLng, int i) {
        final CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latLng).bearing(f).zoom(getMapZoom()).build());
        if (i <= 0) {
            this.n.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.n.animateCamera(cameraUpdateNewCameraPosition, i, new GoogleMap.CancelableCallback() { // from class: jqy.11
                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onFinish() {
                }

                @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
                public void onCancel() {
                    jqy.this.n.moveCamera(cameraUpdateNewCameraPosition);
                }
            });
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap
    public void scrollBy(float f, float f2) {
        if (this.n == null) {
            LogUtil.e("Track_GoogleMapModel", "map is null in scrollBy");
        } else {
            this.n.moveCamera(CameraUpdateFactory.scrollBy(f, f2));
        }
    }
}
