package me2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.heatmaps.Gradient;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import com.google.maps.android.heatmaps.WeightedLatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p13.h0;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lme2/l;", "Lcom/garmin/android/library/mapsdkadapter/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends com.garmin.android.library.mapsdkadapter.a {
    public static final /* synthetic */ int Z = 0;
    public final ArrayList<b0> A;
    public final ArrayList<a0> B;
    public final ArrayList<f> C;
    public final ArrayList<c0> D;
    public com.garmin.android.library.mapsdkadapter.f E;
    public float F;
    public com.garmin.android.library.mapsdkadapter.e I;
    public boolean P;
    public boolean T;
    public final int X;
    public final Handler Y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f118185r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MapView f118186t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GoogleMap f118187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap<Integer, ClusterManager<f>> f118188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap<Integer, g> f118189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MarkerManager.Collection f118190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d0 f118191z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"me2/l$b", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements GoogleMap.InfoWindowAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.c f118193b;

        public b(com.garmin.android.library.mapsdkadapter.i.c cVar) {
            this.f118193b = cVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public final View getInfoContents(Marker marker) {
            marker.getClass();
            int i14 = l.Z;
            l lVar = l.this;
            ie2.j jVarC0 = lVar.c0(marker);
            if (jVarC0 == null) {
                jVarC0 = new a0(marker, lVar);
            }
            this.f118193b.a(jVarC0);
            return null;
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public final View getInfoWindow(Marker marker) {
            marker.getClass();
            int i14 = l.Z;
            l lVar = l.this;
            ie2.j jVarC0 = lVar.c0(marker);
            if (jVarC0 == null) {
                jVarC0 = new a0(marker, lVar);
            }
            return this.f118193b.b(jVarC0);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"me2/l$c", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements GoogleMap.OnMarkerClickListener {
        public c() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public final boolean onMarkerClick(Marker marker) {
            com.garmin.android.library.mapsdkadapter.i.m mVar;
            marker.getClass();
            int i14 = l.Z;
            l lVar = l.this;
            ie2.j jVarC0 = lVar.c0(marker);
            if (jVarC0 == null || (mVar = lVar.f50245f) == null) {
                return false;
            }
            return mVar.O2(jVarC0);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"me2/l$d", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f118195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f118196b;

        public d(e23.a<Unit> aVar, l lVar) {
            this.f118195a = aVar;
            this.f118196b = lVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            try {
                this.f118195a.invoke();
                MapView mapView = this.f118196b.f118186t;
                if (mapView == null || (viewTreeObserver = mapView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } catch (RuntimeException unused) {
            }
        }
    }

    static {
        new a(null);
    }

    public l(Context context) {
        context.getClass();
        this.f118185r = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        this.f118188w = new HashMap<>();
        this.f118189x = new HashMap<>();
        this.f118191z = new d0();
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        com.garmin.android.library.mapsdkadapter.f.f50281c.getClass();
        this.E = com.garmin.android.library.mapsdkadapter.f.f50282d;
        this.F = 16.0f;
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        this.I = com.garmin.android.library.mapsdkadapter.e.f50272d;
        this.P = true;
        this.Y = new Handler(Looper.getMainLooper());
        this.X = (int) TypedValue.applyDimension(1, 40.0f, context.getResources().getDisplayMetrics());
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void A(com.garmin.android.library.mapsdkadapter.i.k kVar) {
        this.f50256q = kVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void B(com.garmin.android.library.mapsdkadapter.i.m mVar) {
        this.f50245f = mVar;
        d0().setOnMarkerClickListener(new c());
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List C() {
        return this.C;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void D(boolean z14) {
        this.T = z14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void E(com.garmin.android.library.mapsdkadapter.i.g gVar) {
        this.f50255p = gVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.s F(ie2.t tVar) {
        TileOverlay tileOverlayAddTileOverlay;
        tVar.getClass();
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            ie2.u uVar = tVar.f93176a;
            if (!(uVar instanceof ie2.h)) {
                com.google.protobuf.a.m();
                return null;
            }
            ie2.h hVar = (ie2.h) uVar;
            HeatmapTileProvider.Builder builder = new HeatmapTileProvider.Builder();
            Collection<com.garmin.android.library.mapsdkadapter.s> collection = hVar.f93125a;
            ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
            for (com.garmin.android.library.mapsdkadapter.s sVar : collection) {
                sVar.getClass();
                arrayList.add(new WeightedLatLng(z.d(sVar.f50334a), sVar.f50335b));
            }
            HeatmapTileProvider.Builder builderWeightedData = builder.weightedData(arrayList);
            ie2.g gVar = hVar.f93126b;
            HeatmapTileProvider.Builder builderOpacity = builderWeightedData.gradient(new Gradient(gVar.f93123a, gVar.f93124b)).opacity(hVar.f93127c);
            double d14 = hVar.f93128d;
            if (d14 != Double.MAX_VALUE) {
                builderOpacity.maxIntensity(d14);
            }
            HeatmapTileProvider heatmapTileProviderBuild = builderOpacity.radius(hVar.f93129e).build();
            heatmapTileProviderBuild.getClass();
            TileOverlayOptions tileOverlayOptionsTileProvider = new TileOverlayOptions().tileProvider(heatmapTileProviderBuild);
            tileOverlayOptionsTileProvider.getClass();
            tileOverlayAddTileOverlay = googleMap.addTileOverlay(tileOverlayOptionsTileProvider);
        } else {
            tileOverlayAddTileOverlay = null;
        }
        c0 c0Var = new c0(this, tVar, tileOverlayAddTileOverlay);
        this.D.add(c0Var);
        return c0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final Dialog G(androidx.fragment.app.m mVar) {
        return GoogleApiAvailability.getInstance().getErrorDialog(mVar, GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(mVar), -1, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void H(t0 t0Var) {
        this.f50251l = t0Var;
        d0().setOnInfoWindowClickListener(new h(this));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void J(int i14, List list) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(((qe2.a) it.next()).getF118168a(), Integer.valueOf(i14)));
        }
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, ClusterManager<f>> map = this.f118188w;
        ClusterManager<f> clusterManager = map.get(numValueOf);
        if (clusterManager != null) {
            clusterManager.removeItems(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Integer f118169b = ((qe2.a) obj).getF118169b();
            if (f118169b != null && f118169b.intValue() == i14) {
                arrayList2.add(obj);
            }
        }
        y0.a(this.C).removeAll(h0.g1(arrayList2));
        ClusterManager<f> clusterManager2 = map.get(Integer.valueOf(i14));
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void K(com.garmin.android.library.mapsdkadapter.i.n nVar) {
        this.f50250k = nVar;
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setOnPolylineClickListener(new h(this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: L */
    public final boolean getA() {
        Context context;
        MapView mapView = this.f118186t;
        return ((mapView == null || (context = mapView.getContext()) == null) ? -1 : GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context)) == 0;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void M(j40.a aVar) {
        this.f50254o = aVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void N(com.garmin.android.library.mapsdkadapter.i.o oVar) {
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.snapshot(new i(oVar));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void O(com.garmin.android.library.mapsdkadapter.i.j jVar) {
        this.f50243d = jVar;
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setOnMapClickListener(new com.google.maps.android.compose.m(this, 1));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List Q() {
        return this.B;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void R(com.garmin.android.library.mapsdkadapter.i.f fVar) {
        this.f50253n = fVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void S() {
        ClusterManager<f> clusterManager = this.f118188w.get(1);
        if (clusterManager != null) {
            clusterManager.cluster();
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getF125701k0() {
        return this.T;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getY() {
        return this.F;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void V(final com.garmin.android.library.mapsdkadapter.f fVar, final float f14, final int i14) {
        fVar.getClass();
        e0(new e23.a() { // from class: me2.k
            @Override // e23.a
            public final Object invoke() {
                CameraUpdate cameraUpdateNewLatLng;
                int i15 = l.Z;
                com.garmin.android.library.mapsdkadapter.f fVar2 = fVar;
                Objects.toString(fVar2);
                float f15 = f14;
                l lVar = this;
                boolean z14 = lVar.P;
                if (f15 > 0.0f) {
                    fVar2.getClass();
                    cameraUpdateNewLatLng = CameraUpdateFactory.newLatLngZoom(z14 ? z.d(fVar2) : fVar2.f50283a, f15);
                } else {
                    fVar2.getClass();
                    cameraUpdateNewLatLng = CameraUpdateFactory.newLatLng(z14 ? z.d(fVar2) : fVar2.f50283a);
                }
                cameraUpdateNewLatLng.getClass();
                lVar.b0(cameraUpdateNewLatLng, i14);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void W(j40.c cVar) {
        this.f50248i = cVar;
        Iterator<Map.Entry<Integer, g>> it = this.f118189x.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().f118174e = this.f50248i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.maps.model.Polyline] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void X(boolean z14) {
        ?? J;
        this.P = z14;
        com.garmin.android.library.mapsdkadapter.i.b bVar = z14 ? com.garmin.android.library.mapsdkadapter.i.b.WGS84 : com.garmin.android.library.mapsdkadapter.i.b.GCJ02;
        bVar.getClass();
        for (b0 b0Var : this.A) {
            b0Var.getClass();
            if (bVar == com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
                List<com.garmin.android.library.mapsdkadapter.f> listD = b0Var.d();
                J = new ArrayList(p13.y.r(listD, 10));
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    J.add(((com.garmin.android.library.mapsdkadapter.f) it.next()).f50283a);
                }
            } else {
                J = z.j(b0Var.d());
            }
            b0Var.k().setPoints(J);
        }
        for (a0 a0Var : this.B) {
            a0Var.getClass();
            com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.GCJ02;
            Marker marker = a0Var.f118121b;
            if (bVar == bVar2) {
                marker.setPosition(a0Var.getPosition().f50283a);
            } else {
                marker.setPosition(z.d(a0Var.getPosition()));
            }
        }
        com.garmin.android.library.mapsdkadapter.i.a.c(this);
    }

    @Override // com.garmin.android.library.mapsdkadapter.j
    public final void Y(ViewGroup viewGroup, final ie2.l lVar, final com.garmin.android.library.mapsdkadapter.i.l lVar2) {
        viewGroup.getClass();
        final Context context = viewGroup.getContext();
        MapView mapView = new MapView(context, lVar != null ? z.f(lVar) : null);
        viewGroup.addView(mapView);
        this.f50240a = lVar != null ? lVar.f93137b : false;
        this.f118186t = mapView;
        mapView.getMapAsync(new OnMapReadyCallback() { // from class: me2.j
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap googleMap) {
                Integer num;
                int i14 = l.Z;
                googleMap.getClass();
                l lVar3 = this.f118177a;
                lVar3.f118187v = googleMap;
                HashMap<Integer, g> map = lVar3.f118189x;
                HashMap<Integer, ClusterManager<f>> map2 = lVar3.f118188w;
                d0 d0Var = lVar3.f118191z;
                UiSettings uiSettings = googleMap.getUiSettings();
                d0Var.f118152a = uiSettings;
                if (uiSettings != null) {
                    uiSettings.setZoomControlsEnabled(d0Var.f118153b);
                    uiSettings.setCompassEnabled(d0Var.f118154c);
                    uiSettings.setMyLocationButtonEnabled(d0Var.f118155d);
                    uiSettings.setScrollGesturesEnabled(d0Var.f118156e);
                    uiSettings.setZoomGesturesEnabled(d0Var.f118157f);
                    uiSettings.setTiltGesturesEnabled(d0Var.f118158g);
                    uiSettings.setRotateGesturesEnabled(d0Var.f118159h);
                    uiSettings.setIndoorLevelPickerEnabled(d0Var.f118160i);
                    uiSettings.setMapToolbarEnabled(d0Var.f118161j);
                    uiSettings.setScrollGesturesEnabledDuringRotateOrZoom(d0Var.f118162k);
                }
                lVar3.f0();
                MarkerManager markerManager = new MarkerManager(googleMap);
                MarkerManager.Collection collectionNewCollection = markerManager.newCollection();
                collectionNewCollection.getClass();
                lVar3.f118190y = collectionNewCollection;
                ie2.l lVar4 = lVar;
                int i15 = 1;
                int iIntValue = (lVar4 == null || (num = lVar4.f93147l) == null) ? 1 : num.intValue();
                for (int i16 = 0; i16 < iIntValue; i16++) {
                    Context context2 = context;
                    ClusterManager<f> clusterManager = new ClusterManager<>(context2, googleMap, markerManager);
                    map2.put(Integer.valueOf(i16), clusterManager);
                    Integer numValueOf = Integer.valueOf(i16);
                    context2.getClass();
                    map.put(numValueOf, new g(context2, googleMap, clusterManager, lVar3.f50242c));
                    ClusterManager<f> clusterManager2 = map2.get(Integer.valueOf(i16));
                    if (clusterManager2 != null) {
                        clusterManager2.setRenderer(map.get(Integer.valueOf(i16)));
                    }
                }
                if (!lVar3.f50240a) {
                    googleMap.setOnCameraMoveStartedListener(new h(lVar3));
                    googleMap.setOnCameraMoveListener(new u0(lVar3));
                    googleMap.setOnCameraIdleListener(new com.google.maps.android.compose.v(lVar3, i15));
                }
                lVar3.f50241b = true;
                MapView mapView2 = lVar3.f118186t;
                if (mapView2 != null) {
                    mapView2.getWidth();
                }
                MapView mapView3 = lVar3.f118186t;
                if (mapView3 != null) {
                    mapView3.getHeight();
                }
                com.garmin.android.library.mapsdkadapter.i.l lVar5 = lVar2;
                if (lVar5 != null) {
                    lVar5.h1(lVar3);
                }
            }
        });
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void Z(com.garmin.android.library.mapsdkadapter.i.h hVar) {
        this.f50246g = hVar;
        Iterator<Map.Entry<Integer, ClusterManager<f>>> it = this.f118188w.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setOnClusterClickListener(new h(this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.i.d getF125703t() {
        return this.f118185r;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void a0(j40.c cVar) {
        this.f50249j = cVar;
        d0().setOnMarkerDragListener(new m(this));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void b(boolean z14, Boolean bool) {
    }

    public final void b0(CameraUpdate cameraUpdate, int i14) {
        if (this.f50240a) {
            this.Y.postDelayed(new l0.e(6, this, cameraUpdate), 500L);
            return;
        }
        GoogleMap googleMap = this.f118187v;
        if (i14 > 0) {
            if (googleMap != null) {
                googleMap.animateCamera(cameraUpdate, i14, null);
            }
        } else if (googleMap != null) {
            googleMap.animateCamera(cameraUpdate, null);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void c(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        CameraPosition cameraPosition;
        eVar.getClass();
        if (!eVar.f50273a.d(eVar.f50274b, -1.0f)) {
            e0(new g63.p(eVar, i14, -1, this));
            return;
        }
        GoogleMap googleMap = this.f118187v;
        Float fValueOf = (googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) ? null : Float.valueOf(cameraPosition.zoom);
        V(eVar.d(), Float.max(fValueOf != null ? fValueOf.floatValue() : 0.0f, 16.0f), -1);
    }

    public final ie2.j c0(Marker marker) {
        a0 next;
        Iterator<a0> it = this.B.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(next.f118121b, marker)) {
                return next;
            }
        }
        next = null;
        return next;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void clear() {
        this.A.clear();
        this.D.clear();
        this.B.clear();
        this.C.clear();
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.clear();
        }
        for (Map.Entry<Integer, ClusterManager<f>> entry : this.f118188w.entrySet()) {
            entry.getValue().clearItems();
            entry.getValue().cluster();
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void d(boolean z14, boolean z15, float f14) {
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        if (z14) {
            ArrayList<b0> arrayList = this.A;
            if (!arrayList.isEmpty()) {
                Iterator<b0> it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    b0 next = it.next();
                    next.getClass();
                    Iterator<com.garmin.android.library.mapsdkadapter.f> it3 = next.d().iterator();
                    while (it3.hasNext()) {
                        aVar.b(it3.next());
                    }
                }
            }
        }
        if (z15) {
            ArrayList<a0> arrayList2 = this.B;
            if (!arrayList2.isEmpty()) {
                Iterator<a0> it4 = arrayList2.iterator();
                it4.getClass();
                while (it4.hasNext()) {
                    a0 next2 = it4.next();
                    next2.getClass();
                    aVar.b(next2.getPosition());
                }
            }
        }
        Iterator<c0> it5 = this.D.iterator();
        it5.getClass();
        while (it5.hasNext()) {
            c0 next3 = it5.next();
            next3.getClass();
            ie2.u uVar = next3.f118148b.f93176a;
            if (uVar instanceof ie2.h) {
                Iterator<com.garmin.android.library.mapsdkadapter.s> it6 = ((ie2.h) uVar).f93125a.iterator();
                while (it6.hasNext()) {
                    aVar.b(it6.next().f50334a);
                }
            }
        }
        com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
        if (eVarA != null) {
            j(eVarA, f14, -1, -1);
        }
    }

    public final MarkerManager.Collection d0() {
        MarkerManager.Collection collection = this.f118190y;
        if (collection != null) {
            return collection;
        }
        p005kotlin.jvm.internal.s.m("markerCollection");
        throw null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void e(Float f14) {
        GoogleMap googleMap = this.f118187v;
        if (f14 == null) {
            if (googleMap != null) {
                googleMap.resetMinMaxZoomPreference();
            }
        } else if (googleMap != null) {
            googleMap.setMaxZoomPreference(f14.floatValue());
        }
    }

    public final void e0(e23.a<Unit> aVar) {
        ViewTreeObserver viewTreeObserver;
        MapView mapView;
        ViewTreeObserver viewTreeObserver2;
        try {
            aVar.invoke();
        } catch (RuntimeException unused) {
            MapView mapView2 = this.f118186t;
            if (mapView2 == null || (viewTreeObserver = mapView2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (mapView = this.f118186t) == null || (viewTreeObserver2 = mapView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver2.addOnGlobalLayoutListener(new d(aVar, this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void f(int i14, List list) {
        HashMap<Integer, ClusterManager<f>> map;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f118188w;
            if (!zHasNext) {
                break;
            }
            f fVar = new f(new com.garmin.android.library.mapsdkadapter.p((com.garmin.android.library.mapsdkadapter.p) it.next()), Integer.valueOf(i14));
            this.C.add(fVar);
            ClusterManager<f> clusterManager = map.get(Integer.valueOf(i14));
            if (clusterManager != null) {
                clusterManager.addItem(fVar);
            }
        }
        ClusterManager<f> clusterManager2 = map.get(Integer.valueOf(i14));
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
    }

    public final void f0() {
        Projection projection;
        VisibleRegion visibleRegion;
        LatLngBounds latLngBounds;
        CameraPosition cameraPosition;
        CameraPosition cameraPosition2;
        LatLng latLng;
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null && (cameraPosition2 = googleMap.getCameraPosition()) != null && (latLng = cameraPosition2.target) != null) {
            this.E = z.b(latLng);
        }
        GoogleMap googleMap2 = this.f118187v;
        if (googleMap2 != null && (cameraPosition = googleMap2.getCameraPosition()) != null) {
            this.F = cameraPosition.zoom;
        }
        GoogleMap googleMap3 = this.f118187v;
        if (googleMap3 == null || (projection = googleMap3.getProjection()) == null || (visibleRegion = projection.getVisibleRegion()) == null || (latLngBounds = visibleRegion.latLngBounds) == null) {
            return;
        }
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        com.garmin.android.library.mapsdkadapter.e eVar = com.garmin.android.library.mapsdkadapter.e.f50272d;
        eVar.getClass();
        LatLng latLng2 = latLngBounds.southwest;
        latLng2.getClass();
        com.garmin.android.library.mapsdkadapter.f fVarB = z.b(latLng2);
        LatLng latLng3 = latLngBounds.northeast;
        com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(latLng3.latitude, latLng3.longitude, fVarB.f50284b);
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        aVar.b(fVarB);
        aVar.b(fVar);
        com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
        if (eVarA != null) {
            eVar = eVarA;
        }
        this.I = eVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void g() {
        GoogleMap googleMap;
        CameraPosition cameraPosition;
        CameraPosition cameraPosition2;
        GoogleMap googleMap2 = this.f118187v;
        Float fValueOf = null;
        LatLng latLng = (googleMap2 == null || (cameraPosition2 = googleMap2.getCameraPosition()) == null) ? null : cameraPosition2.target;
        GoogleMap googleMap3 = this.f118187v;
        if (googleMap3 != null && (cameraPosition = googleMap3.getCameraPosition()) != null) {
            fValueOf = Float.valueOf(cameraPosition.zoom);
        }
        if (latLng == null || fValueOf == null || (googleMap = this.f118187v) == null) {
            return;
        }
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(latLng).zoom(fValueOf.floatValue()).bearing(0.0f).build()));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.c getCameraState() {
        CameraPosition cameraPosition;
        GoogleMap googleMap = this.f118187v;
        if (googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) {
            return null;
        }
        LatLng latLng = cameraPosition.target;
        latLng.getClass();
        return new ie2.c(z.b(latLng), cameraPosition.bearing, cameraPosition.tilt, cameraPosition.zoom);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.k getUiSettings() {
        return this.f118191z;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: getVisibleRegion, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.e getZ() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.maps.model.PolylineOptions] */
    @Override // com.garmin.android.library.mapsdkadapter.i
    public final com.garmin.android.library.mapsdkadapter.l h(com.garmin.android.library.mapsdkadapter.q qVar) {
        ?? arrayList;
        SafeParcelable gap;
        StyleSpan styleSpan;
        qVar.getClass();
        com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q(qVar);
        b0 b0Var = new b0(qVar2, this);
        this.A.add(b0Var);
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            boolean z14 = this.P;
            ?? polylineOptions = new PolylineOptions();
            ie2.p pVar = qVar2.f50328a;
            List<com.garmin.android.library.mapsdkadapter.f> list = pVar.f93153a;
            list.getClass();
            if (z14) {
                arrayList = z.j(list);
            } else {
                arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.garmin.android.library.mapsdkadapter.f) it.next()).f50283a);
                }
            }
            PolylineOptions polylineOptionsColor = polylineOptions.addAll(arrayList).color(pVar.f93156d);
            List<ie2.r> list2 = pVar.f93154b;
            ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
            for (ie2.r rVar : list2) {
                if (rVar.f93174b != null) {
                    ie2.q qVar3 = rVar.f93174b;
                    styleSpan = new StyleSpan(StrokeStyle.gradientBuilder(qVar3.f93169a, qVar3.f93170b).build());
                } else {
                    styleSpan = new StyleSpan(rVar.f93173a, rVar.f93175c);
                }
                arrayList2.add(styleSpan);
            }
            PolylineOptions polylineOptionsWidth = polylineOptionsColor.addAllSpans(arrayList2).geodesic(pVar.f93161i).width(pVar.f93155c);
            List<? extends ie2.o> list3 = pVar.f93157e;
            ArrayList arrayList3 = new ArrayList(p13.y.r(list3, 10));
            for (ie2.o oVar : list3) {
                oVar.getClass();
                if (oVar instanceof ie2.o.a) {
                    gap = new Dash(((ie2.o.a) oVar).f93151a);
                } else {
                    if (!(oVar instanceof ie2.o.b)) {
                        u0.r();
                        return null;
                    }
                    gap = new Gap(((ie2.o.b) oVar).f93152a);
                }
                arrayList3.add(gap);
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            polylineOptionsWidth.pattern(arrayList3).visible(pVar.f93160h).zIndex(Float.valueOf(pVar.f93158f).floatValue()).startCap(z.c(pVar.f93162j)).endCap(z.c(pVar.f93163k));
            Polyline polylineAddPolyline = googleMap.addPolyline(polylineOptions.clickable(qVar.f50328a.f93159g));
            if (polylineAddPolyline != null) {
                b0Var.f118135c = polylineAddPolyline;
            }
        }
        return b0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void i(com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i interfaceC1001i) {
        this.f50247h = interfaceC1001i;
        Iterator<Map.Entry<Integer, ClusterManager<f>>> it = this.f118188w.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setOnClusterItemClickListener(new h(this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void j(com.garmin.android.library.mapsdkadapter.e eVar, float f14, int i14, int i15) {
        eVar.getClass();
        com.garmin.android.library.mapsdkadapter.f fVar = eVar.f50274b;
        com.garmin.android.library.mapsdkadapter.f fVar2 = eVar.f50273a;
        com.garmin.android.library.mapsdkadapter.f fVarD = eVar.d();
        double d14 = f14 > 0.0f ? f14 : 0.25d;
        if (fVar2.d(fVar, -1.0f)) {
            float fMin = Float.min(com.garmin.android.library.mapsdkadapter.n.b(d14), 21.0f);
            fVarD.toString();
            V(fVarD, fMin, i15);
            return;
        }
        double dA = ((double) com.garmin.android.library.mapsdkadapter.n.a(fVar.f50283a, fVar2.f50283a)) / 1000.0d;
        if (dA < d14) {
            eVar = eVar.g((float) (d14 / dA));
        } else {
            d14 = dA;
        }
        Float.min(com.garmin.android.library.mapsdkadapter.n.b(d14), 21.0f);
        fVarD.toString();
        eVar.toString();
        e0(new g63.p(eVar, i14, i15, this));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void k(com.garmin.android.library.mapsdkadapter.i.c cVar) {
        d0().setInfoWindowAdapter(new b(cVar));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void l() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            onPause();
            onDestroy();
            ViewParent parent = mapView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mapView);
            }
        }
        this.f118186t = null;
        this.f118187v = null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void m(com.garmin.android.library.mapsdkadapter.l lVar) {
        lVar.getClass();
        lVar.remove();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void n(ie2.j jVar) {
        jVar.getClass();
        jVar.remove();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void o(ie2.c cVar) {
        cVar.getClass();
        CameraPosition.Builder builderTilt = new CameraPosition.Builder().target(z.d(cVar.f93111a)).bearing((float) cVar.f93112b).zoom((float) cVar.f93114d).tilt((float) cVar.f93113c);
        builderTilt.getClass();
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(builderTilt.build()));
        }
    }

    @Override // ie2.i
    public final void onCreate(Bundle bundle) {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onCreate(bundle);
        }
    }

    @Override // ie2.i
    public final void onDestroy() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    @Override // ie2.i
    public final void onLowMemory() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // ie2.i
    public final void onPause() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // ie2.i
    public final void onResume() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // ie2.i
    public final void onStart() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onStart();
        }
    }

    @Override // ie2.i
    public final void onStop() {
        MapView mapView = this.f118186t;
        if (mapView != null) {
            mapView.onStop();
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void p(String str, boolean z14) {
        str.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void q() {
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void r(y40.i iVar) {
        this.f50244e = iVar;
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setOnMapLongClickListener(new com.google.maps.android.compose.n(this, 1));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List s() {
        return this.A;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMapType(int i14) {
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setMapType(i14);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMyLocationEnabled(boolean z14) {
        Context context;
        GoogleMap googleMap;
        MapView mapView = this.f118186t;
        if (mapView == null || (context = mapView.getContext()) == null || context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 || (googleMap = this.f118187v) == null) {
            return;
        }
        googleMap.setMyLocationEnabled(z14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setPadding(int i14, int i15, int i16, int i17) {
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setPadding(0, 0, 0, i17);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void t(n23.j jVar) {
        this.f50252m = jVar;
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setOnInfoWindowCloseListener(new h(this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.f getX() {
        return this.E;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void v(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        eVar.getClass();
        e0(new a83.a(eVar, i14, this, 11));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.j x(com.garmin.android.library.mapsdkadapter.p pVar) {
        pVar.getClass();
        com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p(pVar);
        Marker markerAddMarker = d0().addMarker(z.g(pVar2, this.P, this.f50242c));
        markerAddMarker.getClass();
        a0 a0Var = new a0(pVar2, markerAddMarker, this);
        markerAddMarker.setTag(a0Var.mo329getTag());
        this.B.add(a0Var);
        return a0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void y(boolean z14) {
        MapStyleOptions mapStyleOptions = z14 ? null : new MapStyleOptions("[{\"featureType\":\"poi\",\"stylers\":[{\"visibility\":\"off\"}]},{\"featureType\":\"poi\",\"elementType\":\"labels\",\"stylers\":[{\"visibility\":\"off\"}]}]");
        GoogleMap googleMap = this.f118187v;
        if (googleMap != null) {
            googleMap.setMapStyle(mapStyleOptions);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void z(boolean z14) {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lme2/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "BASE_ZOOM_LEVEL_VALUE", "F", "MIN_BOUNDS_ZOOM_LEVEL", "MAX_ZOOM_LEVEL", "", "DEFAULT_MIN_VIEWPORT_IN_KM", "D", "DEFAULT_BOUNDS_PADDING", "", "LITE_MODE_CAMERA_DELAY_IN_MILLIS", "J", "EXTRA_PRIMARY_CLIMB_IDS", "HIDE_POI_MAP_STYLE_JSON", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
