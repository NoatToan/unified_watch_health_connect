package com.huami.moving.maps.google;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.R;
import com.huami.moving.maps.IGPSPainter;
import com.huami.moving.maps.IGPSSolution;
import com.huami.moving.maps.IMapAnimationCallback;
import com.huami.moving.maps.IMapLoadedCallback;
import com.huami.moving.maps.google.GoogleGPSSolution;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.maps.track.OnChangeListener;
import com.huami.moving.model.HeatmapData;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GoogleGPSSolution implements IGPSSolution {
    private static final String j = "GoogleGPSSolution";
    private IGPSPainter a = null;
    private final GPSPoint b = null;
    private boolean c = false;
    private CameraPosition.Builder d = null;
    private LocationSource.OnLocationChangedListener e;
    private MapFragmentWrapper f;
    private SupportMapFragment g;
    private GoogleMap h;
    private Handler i;

    public class a implements Runnable {
        public final /* synthetic */ GPSPoint a;

        public a(GPSPoint gPSPoint) {
            this.a = gPSPoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            GoogleGPSSolution.this.a.setStartPoint(this.a);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GoogleGPSSolution.this.t()) {
                GoogleGPSSolution.this.a.addMaskOverlay(this.a);
            }
        }
    }

    public class c implements OnMapReadyCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ IMapLoadedCallback c;

        public c(Context context, boolean z, IMapLoadedCallback iMapLoadedCallback) {
            this.a = context;
            this.b = z;
            this.c = iMapLoadedCallback;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap googleMap) {
            GoogleGPSSolution.this.h = googleMap;
            GoogleGPSSolution googleGPSSolution = GoogleGPSSolution.this;
            googleGPSSolution.a = new GoogleMapPainter(this.a, googleGPSSolution.h);
            GoogleMapUtil.resetStatus();
            if (this.b) {
                GoogleGPSSolution.this.r(this.a, this.c);
            } else {
                GoogleGPSSolution.this.s(this.a, this.c);
            }
            IMapLoadedCallback iMapLoadedCallback = this.c;
            if (iMapLoadedCallback != null) {
                iMapLoadedCallback.afterMapLoaded();
            }
        }
    }

    public class d implements GoogleMap.OnMyLocationChangeListener {
        public d() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
        public void onMyLocationChange(Location location) {
            GoogleGPSSolution.this.x(location);
        }
    }

    public class e implements LocationSource {
        public e() {
        }

        @Override // com.google.android.gms.maps.LocationSource
        public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
            GoogleGPSSolution.this.e = onLocationChangedListener;
        }

        @Override // com.google.android.gms.maps.LocationSource
        public void deactivate() {
            GoogleGPSSolution.this.e = null;
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ Location a;

        public f(Location location) {
            this.a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == null) {
                return;
            }
            HMLog.i(GoogleGPSSolution.j, "onMyLocationChange", new Object[0]);
            if (GoogleGPSSolution.this.c) {
                return;
            }
            GoogleGPSSolution.this.h.moveCamera(CameraUpdateFactory.newCameraPosition(GoogleGPSSolution.this.d.target(new LatLng(this.a.getLatitude(), this.a.getLongitude())).build()));
            GoogleGPSSolution.this.c = true;
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ GPSPoint a;
        public final /* synthetic */ GPSPoint b;
        public final /* synthetic */ RouteLineInfo c;

        public g(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo) {
            this.a = gPSPoint;
            this.b = gPSPoint2;
            this.c = routeLineInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            GoogleGPSSolution.this.a.updatePolyline(this.a, this.b, this.c);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ RouteLineInfo a;
        public final /* synthetic */ List b;

        public h(RouteLineInfo routeLineInfo, List list) {
            this.a = routeLineInfo;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GoogleGPSSolution.this.t()) {
                if (this.a.mIsRevised) {
                    GoogleGPSSolution.this.a.updatePolyline(this.b, this.a);
                } else {
                    GoogleGPSSolution.this.a.drawPolyline(this.b, this.a);
                }
            }
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ GPSPoint a;

        public i(GPSPoint gPSPoint) {
            this.a = gPSPoint;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GoogleGPSSolution.this.a != null) {
                GoogleGPSSolution.this.a.setLocation(this.a);
            }
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ int a;

        public j(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GoogleGPSSolution.this.a != null) {
                GoogleGPSSolution.this.a.setMapViewType(this.a);
            }
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            GoogleGPSSolution.this.a.setRouteTrackerVisibility(this.a);
        }
    }

    public GoogleGPSSolution(final Context context, final FragmentManager fragmentManager, final IMapLoadedCallback iMapLoadedCallback, final boolean z) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.post(new Runnable() { // from class: dh2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v(context, fragmentManager, iMapLoadedCallback, z);
            }
        });
    }

    private void o(CameraUpdate cameraUpdate) {
        this.h.moveCamera(cameraUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void v(Context context, FragmentManager fragmentManager, IMapLoadedCallback iMapLoadedCallback, boolean z) {
        if (this.g == null) {
            SupportMapFragment supportMapFragmentNewInstance = SupportMapFragment.newInstance();
            this.g = supportMapFragmentNewInstance;
            w(supportMapFragmentNewInstance, context, iMapLoadedCallback, z);
        }
        fragmentManager.beginTransaction().replace(R.id.map, this.g).commitAllowingStateLoss();
    }

    private void q() {
        float maxZoomLevel = this.h.getMaxZoomLevel();
        if (maxZoomLevel >= 10.0f) {
            maxZoomLevel -= 3.0f;
        }
        this.d = new CameraPosition.Builder().zoom(maxZoomLevel).bearing(0.0f).tilt(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Context context, IMapLoadedCallback iMapLoadedCallback) {
        UiSettings uiSettings = this.h.getUiSettings();
        uiSettings.setRotateGesturesEnabled(false);
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setMyLocationButtonEnabled(false);
        uiSettings.setMapToolbarEnabled(false);
        uiSettings.setCompassEnabled(true);
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.h.setMyLocationEnabled(false);
            locate();
            this.h.setOnMyLocationChangeListener(new d());
            this.h.setLocationSource(new e());
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Context context, IMapLoadedCallback iMapLoadedCallback) {
        UiSettings uiSettings = this.h.getUiSettings();
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setMapToolbarEnabled(false);
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.h.setMyLocationEnabled(false);
            locate();
            setDarkBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        boolean z = this.a != null;
        if (!z) {
            HMLog.i(j, "GoogleMapPainter not init!", new Object[0]);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(IGPSSolution.IOnMapScreenShotListener iOnMapScreenShotListener, Bitmap bitmap) {
        if (iOnMapScreenShotListener != null) {
            iOnMapScreenShotListener.onMapScreenShot(bitmap);
        }
    }

    private void w(SupportMapFragment supportMapFragment, Context context, IMapLoadedCallback iMapLoadedCallback, boolean z) {
        supportMapFragment.getMapAsync(new c(context, z, iMapLoadedCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Location location) {
        this.i.post(new f(location));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addLineMarkerPoint(List<GPSPoint> list, List<View> list2, List<Boolean> list3, List<Boolean> list4) {
        if (list == null || list2 == null) {
            HMLog.i("IllegalArgumentException", "GoogleGPSSolution addLineMarkerPoint", new Object[0]);
            throw new IllegalArgumentException("End point should not be null.");
        }
        this.a.addLineMarkerPoint(list, list2, list3, list4);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addMarked(List<GPSPoint> list) {
        if (t()) {
            this.a.addMarked(list);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void addMaskOverlay(boolean z) {
        this.i.post(new b(z));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void clearMap() {
        this.a.clearMap();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void clearTrackVideoPaly() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void destroy() {
        IGPSPainter iGPSPainter = this.a;
        if (iGPSPainter != null) {
            iGPSPainter.destroy();
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void destroyMap() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawGPSLine(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo) {
        this.i.post(new g(gPSPoint, gPSPoint2, routeLineInfo));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawGPSTrackLine(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
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
        if (t()) {
            this.a.drawMarkerToPoint(gPSPoint, bitmap);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void drawRouteGPSLine(List<GPSPoint> list, int i2, boolean z, RouteLineInfo routeLineInfo) {
        this.a.updateRoutePolyline(list, i2, z, routeLineInfo);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void follow() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void locate() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void mapScreenShot(final IGPSSolution.IOnMapScreenShotListener iOnMapScreenShotListener) {
        GoogleMap googleMap = this.h;
        if (googleMap != null) {
            googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: ch2
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    GoogleGPSSolution.u(iOnMapScreenShotListener, bitmap);
                }
            });
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void markGPSPoint(GPSPoint gPSPoint) {
        this.a.markGPSPoint(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void pauseMap() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void removeAllLineMarkerPoint() {
        this.a.removeAllLineMarkerPoint();
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void resumeMap() {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void saveInstanceStateMap(Bundle bundle) {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void scrollBy(int i2, int i3) {
        o(CameraUpdateFactory.scrollBy(i3, i2));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setAllGesturesEnabled(boolean z) {
        this.h.getUiSettings().setAllGesturesEnabled(z);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setCarmeraLatLngBounds(List<GPSPoint> list) {
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
            HMLog.i("IllegalArgumentException", "GoogleGPSSolution setEndPoint", new Object[0]);
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
        if (this.e == null || gPSPoint == null) {
            return;
        }
        LatLng latLngConvertToLatLng = GoogleMapUtil.convertToLatLng(gPSPoint);
        Location locationCreateLocation = GPSPoint.createLocation(gPSPoint);
        locationCreateLocation.setLatitude(latLngConvertToLatLng.latitude);
        locationCreateLocation.setLongitude(latLngConvertToLatLng.longitude);
        this.e.onLocationChanged(locationCreateLocation);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setLineWidthScale(float f2) {
        this.a.setLineWidth(f2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setLocation(GPSPoint gPSPoint) {
        this.i.post(new i(gPSPoint));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setMapViewMode(int i2) {
        this.i.post(new j(i2));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setMarked(boolean z) {
        if (t()) {
            this.a.setMarked(z);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setOnChangeListener(OnChangeListener onChangeListener) {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setRouteCenter(GPSPoint gPSPoint) {
        this.a.moveRouteToCenter(gPSPoint);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setRouteTrackVisibility(boolean z) {
        this.i.post(new k(z));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setStartPoint(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            this.i.post(new a(gPSPoint));
        } else {
            HMLog.i("IllegalArgumentException", "GoogleGPSSolution setStartPoint", new Object[0]);
            throw new IllegalArgumentException("Start point should not be null.");
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTestLocation(GPSPoint gPSPoint) {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2) {
        if (t()) {
            this.a.setTrackRectangle(gPSPoint, gPSPoint2);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void setTrackSectionColors(SparseArray<Integer> sparseArray) {
        if (t()) {
            this.a.setTrackISectionColors(sparseArray);
        }
    }

    public void setZoomBy(int i2) {
        this.a.zoomBy(i2);
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void startCPSTrackPlay(Boolean bool, SparseArray<List<GPSPoint>> sparseArray, List<GPSPoint> list, List<GPSPoint> list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i2, float f2, int i3) {
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void startFollow() {
        if (t()) {
            this.a.startFollow();
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void stopFollow() {
        if (t()) {
            this.a.stopFollow();
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void updateEndMarkerIcon(Bitmap bitmap) {
        if (t()) {
            this.a.updateEndMarkerIcon(bitmap);
        }
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
        this.i.post(new h(routeLineInfo, new ArrayList(list)));
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowAddedTrack(IMapAnimationCallback iMapAnimationCallback) {
        if (t()) {
            this.a.zoomToShowEntireTrack(iMapAnimationCallback);
        }
    }

    @Override // com.huami.moving.maps.IGPSSolution
    public void zoomToShowEntireTrack(List<GPSPoint> list, IMapAnimationCallback iMapAnimationCallback) {
        if (t()) {
            this.a.zoomToShowEntireTrack(list, iMapAnimationCallback);
        }
    }
}
