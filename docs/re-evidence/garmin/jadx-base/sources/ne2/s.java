package ne2;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.Gson;
import com.mapbox.android.core.permissions.PermissionsManager;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBoundsOptions;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapInitOptionsKt;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.MapSnapshotOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Size;
import com.mapbox.maps.SnapshotOverlayOptions;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.Style;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.StyleExtensionImplKt;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.LayerUtils;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.RasterLayer;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.RasterSource;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationPlugin;
import com.mapbox.maps.plugin.annotation.AnnotationSourceOptions;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.ClusterOptions;
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationClickListener;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManagerKt;
import com.mapbox.maps.plugin.attribution.AttributionPlugin;
import com.mapbox.maps.plugin.attribution.AttributionUtils;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentUtils;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lne2/s;", "Lcom/garmin/android/library/mapsdkadapter/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends com.garmin.android.library.mapsdkadapter.a {
    public static final /* synthetic */ int M0 = 0;
    public final boolean A;
    public final o13.t B;
    public final ArrayList<com.garmin.android.library.mapsdkadapter.l> C;
    public final ArrayList<w> D;
    public final ArrayList<qe2.a> E;
    public final ArrayList F;
    public final int H0;
    public final HashMap<Integer, StyleContract.StyleLayerExtension> I;
    public final Handler I0;
    public Cancelable J0;
    public Cancelable K0;
    public final d L0;
    public final ie2.e P;
    public final ArrayList T;
    public com.garmin.android.library.mapsdkadapter.f X;
    public float Y;
    public com.garmin.android.library.mapsdkadapter.e Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f125701k0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f125702r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f125703t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MapView f125704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Float f125705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PointAnnotationManager f125706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap<Integer, PointAnnotationManager> f125707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewAnnotationManager f125708z;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lne2/s$a;", "", "", "Lcom/mapbox/geojson/Point;", "points", "", "width", "height", "<init>", "(Ljava/util/List;DD)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Point> f125709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f125710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f125711c;

        public a(List<Point> list, double d14, double d15) {
            list.getClass();
            this.f125709a = list;
            this.f125710b = d14;
            this.f125711c = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f125709a.equals(aVar.f125709a) && Double.compare(this.f125710b, aVar.f125710b) == 0 && Double.compare(this.f125711c, aVar.f125711c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f125711c) + org.apache.commons.lang3.e.b(this.f125709a.hashCode() * 31, 31, this.f125710b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CameraCalculationParameters(points=");
            sb3.append(this.f125709a);
            sb3.append(", width=");
            sb3.append(this.f125710b);
            return am.j.r(sb3, ", height=", this.f125711c, ")");
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125712a;

        static {
            int[] iArr = new int[ie2.e.values().length];
            try {
                iArr[ie2.e.MAPBOX_SYMBOL_LAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f125712a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ne2/s$d", "", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public d() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ne2/s$e", "Lie2/s;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements ie2.s {
        @Override // ie2.s
        public final void remove() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ne2/s$f", "Landroid/animation/Animator$AnimatorListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f125715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f125716c;

        public f(SharedPreferences sharedPreferences, String str) {
            this.f125715b = sharedPreferences;
            this.f125716c = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            CameraState cameraState;
            CameraOptions cameraOptions$default;
            animator.getClass();
            MapboxMap mapboxMapB0 = s.this.b0();
            if (mapboxMapB0 == null || (cameraState = mapboxMapB0.getCameraState()) == null || (cameraOptions$default = ExtensionUtils.toCameraOptions$default(cameraState, null, 1, null)) == null) {
                return;
            }
            SharedPreferences sharedPreferences = this.f125715b;
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            editorEdit.putString(this.f125716c, new Gson().toJson(cameraOptions$default));
            editorEdit.commit();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lne2/h$c;", "<anonymous>", "(Lo53/b0;)Lne2/h$c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxMapAdapter$enable3DMapView$2$2$cameraOrientation$1", f = "MapboxMapAdapter.kt", l = {957}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super h.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<Point> f125718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Point> f125719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f125720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f125721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MapView f125722f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<Point> list, List<Point> list2, double d14, double d15, MapView mapView, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f125718b = list;
            this.f125719c = list2;
            this.f125720d = d14;
            this.f125721e = d15;
            this.f125722f = mapView;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f125718b, this.f125719c, this.f125720d, this.f125721e, this.f125722f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super h.c> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125717a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            h.d dVar = h.f125596a;
            ArrayList arrayListC0 = h0.C0(this.f125718b, this.f125719c);
            EdgeInsets edgeInsets = new EdgeInsets(40.0d, 40.0d, 40.0d, 40.0d);
            this.f125717a = 1;
            Object objC = dVar.c(arrayListC0, this.f125720d, this.f125721e, edgeInsets, this.f125722f, this);
            return objC == aVar ? aVar : objC;
        }
    }

    static {
        new b(null);
    }

    public s(Context context) {
        context.getClass();
        this.f125702r = context;
        this.f125703t = com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
        this.f125707y = new HashMap<>();
        this.A = true;
        this.B = o13.m.b(new n82.i(this, 4));
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        new ArrayList();
        this.E = new ArrayList<>();
        this.F = new ArrayList();
        this.I = new HashMap<>();
        this.P = ie2.e.MAPBOX_ANNOTATION;
        this.T = new ArrayList();
        new ArrayList();
        com.garmin.android.library.mapsdkadapter.f.f50281c.getClass();
        this.X = com.garmin.android.library.mapsdkadapter.f.f50282d;
        this.Y = 16.0f;
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        this.Z = com.garmin.android.library.mapsdkadapter.e.f50272d;
        this.I0 = new Handler(Looper.getMainLooper());
        this.L0 = new d();
        this.H0 = (int) TypedValue.applyDimension(1, 40.0f, context.getResources().getDisplayMetrics());
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void A(com.garmin.android.library.mapsdkadapter.i.k kVar) {
        this.f50256q = kVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void B(com.garmin.android.library.mapsdkadapter.i.m mVar) {
        this.f50245f = mVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List C() {
        return this.E;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void D(boolean z14) {
        this.f125701k0 = z14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void E(com.garmin.android.library.mapsdkadapter.i.g gVar) {
        this.f50255p = gVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.s F(ie2.t tVar) {
        tVar.getClass();
        return new e();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final Dialog G(androidx.fragment.app.m mVar) {
        return null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void H(t0 t0Var) {
        this.f50251l = t0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void J(int i14, List list) {
        if (c.f125712a[this.P.ordinal()] == 1) {
            v.d(this, i14);
            return;
        }
        Cancelable cancelable = this.J0;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.J0 = null;
        Integer numValueOf = Integer.valueOf(i14);
        HashMap<Integer, PointAnnotationManager> map = this.f125707y;
        PointAnnotationManager pointAnnotationManager = map.get(numValueOf);
        if (pointAnnotationManager != null) {
            pointAnnotationManager.deleteAll();
        }
        map.remove(Integer.valueOf(i14));
        this.E.removeAll(list);
        p13.d0.B(new aq1.d0(list, 19), this.F);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void K(com.garmin.android.library.mapsdkadapter.i.n nVar) {
        this.f50250k = nVar;
        for (com.garmin.android.library.mapsdkadapter.l lVar : this.C) {
            if (lVar.getF118133a().f50328a.f93159g) {
                d0 d0Var = lVar instanceof d0 ? (d0) lVar : null;
                if (d0Var != null) {
                    d0Var.f125583g = nVar;
                }
            }
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void M(j40.a aVar) {
        this.f50254o = aVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void N(com.garmin.android.library.mapsdkadapter.i.o oVar) {
        String styleURI;
        MapView mapView = this.f125704v;
        if (mapView != null) {
            MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
            MapSnapshotOptions mapSnapshotOptionsBuild = new MapSnapshotOptions.Builder().size(new Size(mapView.getWidth(), mapView.getHeight())).pixelRatio(mapboxMapDeprecated.getPixelRatio()).build();
            Context context = mapView.getContext();
            if (context != null) {
                mapSnapshotOptionsBuild.getClass();
                Snapshotter snapshotter = new Snapshotter(context, mapSnapshotOptionsBuild, (SnapshotOverlayOptions) null, 4, (p005kotlin.jvm.internal.j) null);
                Style styleDeprecated = mapboxMapDeprecated.getStyleDeprecated();
                if (styleDeprecated == null || (styleURI = styleDeprecated.getStyleURI()) == null) {
                    styleURI = Style.STANDARD_SATELLITE;
                }
                snapshotter.setStyleUri(styleURI);
                CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(mapboxMapDeprecated.getCameraState().getZoom())).center(mapboxMapDeprecated.getCameraState().getCenter()).build();
                cameraOptionsBuild.getClass();
                snapshotter.setCamera(cameraOptionsBuild);
                Snapshotter.start$default(snapshotter, null, new me2.i(oVar), 1, null);
            }
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void O(com.garmin.android.library.mapsdkadapter.i.j jVar) {
        this.f50243d = jVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List Q() {
        return this.D;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void R(com.garmin.android.library.mapsdkadapter.i.f fVar) {
        this.f50253n = fVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void S() {
        if (c.f125712a[this.P.ordinal()] == 1) {
            v.d(this, 1);
        } else {
            Cancelable cancelable = this.J0;
            if (cancelable != null) {
                cancelable.cancel();
            }
            this.J0 = null;
            this.f125707y.remove(1);
            p13.d0.B(new t(2), this.E);
        }
        f(0, this.F);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getB() {
        return this.f125701k0;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getF50270z() {
        return this.Y;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void V(com.garmin.android.library.mapsdkadapter.f fVar, float f14, int i14) {
        fVar.getClass();
        n nVar = new n(p.h(fVar), f14 > 0.0f ? Double.valueOf(f14) : null, i14 > 0 ? Long.valueOf(i14) : null, null, null, null, null, 120, null);
        if (this.f50240a) {
            CameraOptions cameraOptionsB = nVar.b();
            MapboxMap mapboxMapB0 = b0();
            if (mapboxMapB0 != null) {
                mapboxMapB0.setCamera(cameraOptionsB);
                return;
            }
            return;
        }
        CameraOptions cameraOptionsB2 = nVar.b();
        MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
        Long l14 = nVar.f125691c;
        if (l14 != null) {
            builder.duration(l14.longValue());
        }
        v.b(this, cameraOptionsB2, builder.build());
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void W(j40.c cVar) {
        this.f50248i = cVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void X(boolean z14) {
        com.garmin.android.library.mapsdkadapter.i.b.WGS84.getClass();
        com.garmin.android.library.mapsdkadapter.i.a.c(this);
    }

    @Override // com.garmin.android.library.mapsdkadapter.j
    public final void Y(ViewGroup viewGroup, ie2.l lVar, com.garmin.android.library.mapsdkadapter.i.l lVar2) {
        MapInitOptions mapInitOptions;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        if (lVar != null) {
            context.getClass();
            CameraOptions.Builder builder = new CameraOptions.Builder();
            com.garmin.android.library.mapsdkadapter.f fVar = lVar.f93138c;
            CameraOptions cameraOptionsBuild = builder.center(fVar != null ? p.h(fVar) : null).zoom(Double.valueOf(lVar.f93139d)).build();
            MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
            mapOptionsBuild.getClass();
            mapInitOptions = new MapInitOptions(context, mapOptionsBuild, null, cameraOptionsBuild, false, p.b(com.garmin.android.library.mapsdkadapter.i.e.f50297a, lVar.f93136a), null, 0, null, 468, null);
        } else {
            context.getClass();
            mapInitOptions = new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null);
        }
        MapView mapView = new MapView(context, mapInitOptions);
        mapView.setVisibility(4);
        viewGroup.addView(mapView);
        this.f50240a = lVar != null ? lVar.f93137b : false;
        this.f125704v = mapView;
        AttributionPlugin attribution = AttributionUtils.getAttribution(mapView);
        if (attribution != null) {
            attribution.updateSettings(new n63.w(19));
        }
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager = this.f125706x;
        if (pointAnnotationManagerCreatePointAnnotationManager == null) {
            MapView mapView2 = this.f125704v;
            AnnotationPlugin annotations = mapView2 != null ? AnnotationsUtils.getAnnotations(mapView2) : null;
            if (annotations != null) {
                pointAnnotationManagerCreatePointAnnotationManager = PointAnnotationManagerKt.createPointAnnotationManager(annotations, new AnnotationConfig(null, "MAPBOX_POINT_ANNOTATION_MANAGER_LAYER", null, new AnnotationSourceOptions(null, null, null, null, new ClusterOptions(false, 0L, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8190, null), 15, null), 5, null));
            } else {
                pointAnnotationManagerCreatePointAnnotationManager = null;
            }
        }
        this.f125706x = pointAnnotationManagerCreatePointAnnotationManager;
        ViewAnnotationManager viewAnnotationManager = this.f125708z;
        if (viewAnnotationManager == null) {
            MapView mapView3 = this.f125704v;
            viewAnnotationManager = mapView3 != null ? mapView3.getViewAnnotationManager() : null;
        }
        this.f125708z = viewAnnotationManager;
        if (lVar != null) {
            String strB = p.b(com.garmin.android.library.mapsdkadapter.i.e.f50297a, lVar.f93136a);
            MapboxMap mapboxMapB0 = b0();
            if (mapboxMapB0 != null) {
                MapboxMap.loadStyle$default(mapboxMapB0, StyleExtensionImplKt.style(strB, new n63.w(17)), (Style.OnStyleLoaded) null, 2, (Object) null);
            }
        }
        v.f(this);
        MapboxMap mapboxMapB1 = b0();
        if (mapboxMapB1 != null) {
            mapboxMapB1.subscribeMapLoaded(new ne2.c(this, 0));
        }
        MapboxMap mapboxMapB2 = b0();
        if (mapboxMapB2 != null) {
            GesturesUtils.addOnMapClickListener(mapboxMapB2, new ne2.e(this, 0));
        }
        if (!this.f50240a) {
            MapboxMap mapboxMapB3 = b0();
            if (mapboxMapB3 != null) {
                mapboxMapB3.subscribeCameraChanged(new ne2.c(this, 2));
            }
            MapboxMap mapboxMapB4 = b0();
            if (mapboxMapB4 != null) {
                mapboxMapB4.subscribeMapIdle(new ne2.c(this, 1));
            }
            MapboxMap mapboxMapB5 = b0();
            if (mapboxMapB5 != null) {
                GesturesUtils.addOnMapLongClickListener(mapboxMapB5, new OnMapLongClickListener() { // from class: ne2.b
                    @Override // com.mapbox.maps.plugin.gestures.OnMapLongClickListener
                    public final boolean onMapLongClick(Point point) {
                        point.getClass();
                        s sVar = s.this;
                        int i14 = s.M0;
                        y40.i iVar = sVar.f50244e;
                        if (iVar == null) {
                            return true;
                        }
                        iVar.h8(p.e(point));
                        return true;
                    }
                });
            }
            MapboxMap mapboxMapB6 = b0();
            if (mapboxMapB6 != null) {
                GesturesUtils.addOnMoveListener(mapboxMapB6, new ne2.g(this));
            }
            PointAnnotationManager pointAnnotationManager = this.f125706x;
            if (pointAnnotationManager != null) {
                pointAnnotationManager.addClickListener(new OnPointAnnotationClickListener() { // from class: ne2.a
                    @Override // com.mapbox.maps.plugin.annotation.OnAnnotationClickListener
                    public final boolean onAnnotationClick(Annotation annotation) {
                        w next;
                        PointAnnotation pointAnnotation = (PointAnnotation) annotation;
                        pointAnnotation.getClass();
                        s sVar = this.f125560a;
                        ArrayList<w> arrayList = sVar.D;
                        arrayList.getClass();
                        Iterator<w> it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!next.equals(pointAnnotation));
                        w wVar = next;
                        if (wVar == null) {
                            return true;
                        }
                        s sVar2 = s.this;
                        int i14 = s.M0;
                        com.garmin.android.library.mapsdkadapter.i.m mVar = sVar2.f50245f;
                        if (mVar == null) {
                            return true;
                        }
                        mVar.O2(wVar);
                        return true;
                    }
                });
            }
            PointAnnotationManager pointAnnotationManager2 = this.f125706x;
            if (pointAnnotationManager2 != null) {
                pointAnnotationManager2.addDragListener(new ne2.f(this));
            }
            Collection<PointAnnotationManager> collectionValues = this.f125707y.values();
            collectionValues.getClass();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((PointAnnotationManager) it.next()).addClusterClickListener(new ne2.d(this));
            }
        }
        mapboxMapDeprecated.subscribeMapIdle(new ne2.c(this, 3));
        this.I0.post(new at0.c(this, lVar, mapView, lVar2, 16));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void Z(com.garmin.android.library.mapsdkadapter.i.h hVar) {
        this.f50246g = hVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.i.d getF50264r() {
        return this.f125703t;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void a0(j40.c cVar) {
        this.f50249j = cVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void b(boolean z14, Boolean bool) {
        this.f125701k0 = z14;
        ArrayList<w> arrayList = this.D;
        ArrayList<com.garmin.android.library.mapsdkadapter.l> arrayList2 = this.C;
        if (z14 && this.f50240a) {
            MapView mapView = this.f125704v;
            if (mapView != null) {
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                Iterator<com.garmin.android.library.mapsdkadapter.l> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(p.j(it.next().d()));
                }
                ArrayList arrayListS = p13.y.s(arrayList3);
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator<w> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(p.h(it3.next().getPosition()));
                }
                double width = mapView.getWidth();
                double height = mapView.getHeight();
                h.d dVar = h.f125596a;
                ArrayList arrayListC0 = h0.C0(arrayListS, arrayList4);
                dVar.getClass();
                CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(Double.valueOf(h.d.b(arrayListC0, width / height))).pitch(Double.valueOf(45.0d)).zoom(Double.valueOf(mapView.getMapboxMapDeprecated().getCameraState().getZoom() - 0.1d)).build();
                MapboxMap mapboxMapB0 = b0();
                if (mapboxMapB0 != null) {
                    cameraOptionsBuild.getClass();
                    CameraAnimationsUtils.easeTo$default(mapboxMapB0, cameraOptionsBuild, null, null, 6, null);
                    return;
                }
                return;
            }
            return;
        }
        if (z14 && bool.equals(Boolean.FALSE)) {
            CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().pitch(Double.valueOf(60.0d)).build();
            MapboxMap mapboxMapB1 = b0();
            if (mapboxMapB1 != null) {
                cameraOptionsBuild2.getClass();
                CameraAnimationsUtils.easeTo$default(mapboxMapB1, cameraOptionsBuild2, null, null, 6, null);
                return;
            }
            return;
        }
        if (!z14) {
            CameraOptions cameraOptionsBuild3 = new CameraOptions.Builder().pitch(Double.valueOf(0.0d)).build();
            MapboxMap mapboxMapB2 = b0();
            if (mapboxMapB2 != null) {
                cameraOptionsBuild3.getClass();
                CameraAnimationsUtils.easeTo$default(mapboxMapB2, cameraOptionsBuild3, null, null, 6, null);
                return;
            }
            return;
        }
        MapView mapView2 = this.f125704v;
        if (mapView2 != null) {
            ArrayList arrayList5 = new ArrayList(p13.y.r(arrayList2, 10));
            Iterator<com.garmin.android.library.mapsdkadapter.l> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList5.add(p.j(it4.next().d()));
            }
            ArrayList arrayListS2 = p13.y.s(arrayList5);
            ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator<w> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList6.add(p.h(it5.next().getPosition()));
            }
            double width2 = mapView2.getWidth();
            double height2 = mapView2.getHeight();
            SharedPreferences sharedPreferences = this.f125702r.getSharedPreferences("camera_orientation_cache", 0);
            String strValueOf = String.valueOf(new a(h0.C0(arrayListS2, arrayList6), width2, height2).hashCode());
            Object objValueOf = null;
            String string = sharedPreferences.getString(strValueOf, null);
            if (string != null) {
                try {
                    CameraOptions cameraOptions = (CameraOptions) new Gson().fromJson(string, CameraOptions.class);
                    MapboxMap mapboxMapB3 = b0();
                    if (mapboxMapB3 != null) {
                        cameraOptions.getClass();
                        objValueOf = CameraAnimationsUtils.easeTo$default(mapboxMapB3, cameraOptions, null, null, 6, null);
                    }
                } catch (Exception e4) {
                    objValueOf = Integer.valueOf(Log.d("MapboxMapAdapter", "Error converting cached camera: " + e4.getMessage()));
                }
                if (objValueOf != null) {
                    return;
                }
            }
            h.c cVar = (h.c) ge1.b.W(t13.h.f161748a, new g(arrayListS2, arrayList6, width2, height2, mapView2, null));
            CameraOptions cameraOptionsBuild4 = new CameraOptions.Builder().bearing(Double.valueOf(cVar.f125604a)).pitch(Double.valueOf(cVar.f125605b)).zoom(Double.valueOf(mapView2.getMapboxMapDeprecated().getCameraState().getZoom() - 0.1d)).build();
            MapboxMap mapboxMapB4 = b0();
            if (mapboxMapB4 != null) {
                cameraOptionsBuild4.getClass();
                CameraAnimationsUtils.easeTo$default(mapboxMapB4, cameraOptionsBuild4, null, new f(sharedPreferences, strValueOf), 2, null);
            }
        }
    }

    public final MapboxMap b0() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            return mapView.getMapboxMapDeprecated();
        }
        return null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void c(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        CameraState cameraState;
        eVar.getClass();
        Float fValueOf = null;
        if (!eVar.f50273a.d(eVar.f50274b, -1.0f)) {
            v.a(this, new n(null, null, Long.valueOf(-1), null, null, Integer.valueOf(i14), p.g(eVar), 27, null), null);
            return;
        }
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null && (cameraState = mapboxMapB0.getCameraState()) != null) {
            fValueOf = Float.valueOf((float) cameraState.getZoom());
        }
        V(eVar.d(), Float.max(fValueOf != null ? fValueOf.floatValue() : 0.0f, 16.0f), -1);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void clear() {
        ViewAnnotationManager viewAnnotationManager;
        ArrayList<com.garmin.android.library.mapsdkadapter.l> arrayList = this.C;
        Iterator<E> it = i53.a.j(arrayList).iterator();
        while (it.hasNext()) {
            ((com.garmin.android.library.mapsdkadapter.l) it.next()).remove();
        }
        arrayList.clear();
        this.D.clear();
        this.E.clear();
        this.I.clear();
        PointAnnotationManager pointAnnotationManager = this.f125706x;
        if (pointAnnotationManager != null) {
            pointAnnotationManager.deleteAll();
        }
        this.f125707y.clear();
        MapView mapView = this.f125704v;
        if (mapView == null || (viewAnnotationManager = mapView.getViewAnnotationManager()) == null) {
            return;
        }
        viewAnnotationManager.removeAllViewAnnotations();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void d(boolean z14, boolean z15, float f14) {
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        if (z14) {
            ArrayList<com.garmin.android.library.mapsdkadapter.l> arrayList = this.C;
            if (!arrayList.isEmpty()) {
                Iterator<com.garmin.android.library.mapsdkadapter.l> it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    com.garmin.android.library.mapsdkadapter.l next = it.next();
                    next.getClass();
                    Iterator<com.garmin.android.library.mapsdkadapter.f> it3 = next.d().iterator();
                    while (it3.hasNext()) {
                        aVar.b(it3.next());
                    }
                }
            }
        }
        if (z15) {
            ArrayList<w> arrayList2 = this.D;
            if (!arrayList2.isEmpty()) {
                Iterator<w> it4 = arrayList2.iterator();
                it4.getClass();
                while (it4.hasNext()) {
                    w next2 = it4.next();
                    next2.getClass();
                    aVar.b(next2.getPosition());
                }
            }
        }
        com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
        if (eVarA != null) {
            j(eVarA, f14, 40, -1);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void e(Float f14) {
        this.f125705w = f14;
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            CameraBoundsOptions cameraBoundsOptionsBuild = new CameraBoundsOptions.Builder().maxZoom(f14 != null ? Double.valueOf(f14.floatValue()) : null).build();
            cameraBoundsOptionsBuild.getClass();
            mapboxMapB0.setBounds(cameraBoundsOptionsBuild);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void f(int i14, List list) {
        String styleURI;
        int iIntValue;
        int iIntValue2;
        String styleURI2;
        list.getClass();
        int i15 = c.f125712a[this.P.ordinal()];
        String str = Style.STANDARD_SATELLITE;
        if (i15 != 1) {
            MapboxMap mapboxMapB0 = b0();
            this.J0 = mapboxMapB0 != null ? mapboxMapB0.subscribeStyleLoaded(new androidx.media3.exoplayer.u(this, i14, list, 9)) : null;
            this.F.addAll(list);
            MapboxMap mapboxMapB1 = b0();
            if (mapboxMapB1 != null) {
                MapboxMap mapboxMapB2 = b0();
                if (mapboxMapB2 != null && (styleURI = mapboxMapB2.getStyleURI()) != null) {
                    str = styleURI;
                }
                MapboxMap.loadStyle$default(mapboxMapB1, StyleExtensionImplKt.style(str, new t(3)), (Style.OnStyleLoaded) null, 2, (Object) null);
                return;
            }
            return;
        }
        int size = list.size();
        com.garmin.android.library.mapsdkadapter.p pVar = (com.garmin.android.library.mapsdkadapter.p) h0.b0(list);
        if (size < 100) {
            Integer num = pVar.f50327a.f50320l;
            iIntValue = num != null ? num.intValue() : R.drawable.cluster_icon;
        } else {
            Integer num2 = pVar.f50327a.f50321m;
            iIntValue = num2 != null ? num2.intValue() : R.drawable.wide_cluster_iocn;
        }
        Context context = this.f125702r;
        Bitmap bitmapA = p.a(iIntValue, context);
        Integer num3 = ((com.garmin.android.library.mapsdkadapter.p) h0.b0(list)).f50327a.f50319k;
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = i14 == 0 ? R.drawable.map_poi_start : R.drawable.map_poi_stop;
        }
        Bitmap bitmapA2 = p.a(iIntValue2, context);
        MapboxMap mapboxMapB3 = b0();
        if (mapboxMapB3 != null) {
            MapboxMap mapboxMapB4 = b0();
            if (mapboxMapB4 != null && (styleURI2 = mapboxMapB4.getStyleURI()) != null) {
                str = styleURI2;
            }
            mapboxMapB3.loadStyle(StyleExtensionImplKt.style(str, new ml0.e(14, bitmapA2, bitmapA)), new u(this, list, i14));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void g() {
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(Double.valueOf(0.0d)).build();
            cameraOptionsBuild.getClass();
            CameraAnimationsUtils.easeTo$default(mapboxMapB0, cameraOptionsBuild, null, null, 6, null);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.c getCameraState() {
        CameraState cameraState;
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 == null || (cameraState = mapboxMapB0.getCameraState()) == null) {
            return null;
        }
        Point center = cameraState.getCenter();
        center.getClass();
        return new ie2.c(p.e(center), cameraState.getBearing(), cameraState.getPitch(), cameraState.getZoom());
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.k getUiSettings() {
        e0 e0Var = (e0) this.B.getValue();
        if (e0Var != null) {
            return e0Var;
        }
        return new e0(null, null, null, 7, null);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: getVisibleRegion, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.e getA() {
        return this.Z;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final com.garmin.android.library.mapsdkadapter.l h(com.garmin.android.library.mapsdkadapter.q qVar) {
        float[] fArrColorToRgbaArray;
        qVar.getClass();
        d0 d0Var = new d0(new com.garmin.android.library.mapsdkadapter.q(qVar), this);
        if (qVar.f50328a.f93159g) {
            d0Var.f125583g = this.f50250k;
        }
        Iterator<T> it = d0Var.f125577a.f50328a.f93165m.iterator();
        int i14 = -1;
        while (it.hasNext()) {
            int i15 = ((ie2.r) it.next()).f93173a;
            if (i15 != -1) {
                fArrColorToRgbaArray = ColorUtils.INSTANCE.colorToRgbaArray(i15);
            } else {
                i15 = i14;
                fArrColorToRgbaArray = ColorUtils.INSTANCE.colorToRgbaArray(i14);
            }
            d0Var.f125582f.add(new o13.u(Float.valueOf(fArrColorToRgbaArray[0]), Float.valueOf(fArrColorToRgbaArray[1]), Float.valueOf(fArrColorToRgbaArray[2])));
            i14 = i15;
        }
        ArrayList arrayList = d0Var.f125579c;
        arrayList.getClass();
        ArrayList arrayList2 = d0Var.f125580d;
        arrayList2.getClass();
        if (arrayList2.isEmpty()) {
            List<com.garmin.android.library.mapsdkadapter.f> listD = d0Var.d();
            ArrayList arrayList3 = new ArrayList(p13.y.r(listD, 10));
            for (com.garmin.android.library.mapsdkadapter.f fVar : listD) {
                double d14 = fVar.f50283a.latitude;
                double d15 = 6;
                double dPow = Math.pow(10.0d, d15);
                double dRint = Math.rint(d14 * dPow) / dPow;
                double d16 = fVar.f50283a.longitude;
                double dPow2 = Math.pow(10.0d, d15);
                arrayList3.add(new com.garmin.android.library.mapsdkadapter.f(dRint, Math.rint(d16 * dPow2) / dPow2, fVar.f50284b));
            }
            List listI1 = arrayList3.size() > 10000 ? h0.i1(arrayList3, 10000, 10000, true) : p13.w.c(arrayList3);
            MapboxMap mapboxMapB0 = d0Var.f125578b.b0();
            if (mapboxMapB0 != null) {
                mapboxMapB0.getStyle(new b0(listI1, d0Var, arrayList, arrayList2));
            }
        }
        this.C.add(d0Var);
        return d0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void i(com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i interfaceC1001i) {
        this.f50247h = interfaceC1001i;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void j(com.garmin.android.library.mapsdkadapter.e eVar, float f14, int i14, int i15) {
        com.garmin.android.library.mapsdkadapter.e eVarG = eVar;
        eVarG.getClass();
        com.garmin.android.library.mapsdkadapter.f fVar = eVarG.f50274b;
        com.garmin.android.library.mapsdkadapter.f fVar2 = eVarG.f50273a;
        com.garmin.android.library.mapsdkadapter.f fVarD = eVarG.d();
        double d14 = f14 > 0.0f ? f14 : 0.25d;
        if (fVar2.d(fVar, -1.0f)) {
            float fMin = Float.min(com.garmin.android.library.mapsdkadapter.n.b(d14), 21.0f);
            fVarD.toString();
            V(fVarD, fMin, i15);
            return;
        }
        double dA = ((double) com.garmin.android.library.mapsdkadapter.n.a(fVar.f50283a, fVar2.f50283a)) / 1000.0d;
        if (dA < d14) {
            eVarG = eVarG.g((float) (d14 / dA));
        } else {
            d14 = dA;
        }
        Float.min(com.garmin.android.library.mapsdkadapter.n.b(d14), 21.0f);
        fVarD.toString();
        eVarG.toString();
        v.a(this, new n(null, null, null, null, null, Integer.valueOf(i14), p.g(eVarG), 31, null), (i15 >= 60 || this.f50240a) ? Long.valueOf(i15) : null);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void k(com.garmin.android.library.mapsdkadapter.i.c cVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void l() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            onStop();
            onDestroy();
            ViewParent parent = mapView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mapView);
            }
        }
        this.f125704v = null;
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
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center(p.h(cVar.f93111a)).bearing(Double.valueOf(cVar.f93112b)).pitch(Double.valueOf(cVar.f93113c)).zoom(Double.valueOf(cVar.f93114d)).build();
            cameraOptionsBuild.getClass();
            mapboxMapB0.setCamera(cameraOptionsBuild);
        }
    }

    @Override // ie2.i
    public final void onCreate(Bundle bundle) {
    }

    @Override // ie2.i
    public final void onDestroy() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    @Override // ie2.i
    public final void onLowMemory() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // ie2.i
    public final void onPause() {
    }

    @Override // ie2.i
    public final void onResume() {
    }

    @Override // ie2.i
    public final void onStart() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.onStart();
        }
    }

    @Override // ie2.i
    public final void onStop() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.onStop();
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void p(String str, boolean z14) {
        str.getClass();
        f0 f0Var = new f0(str);
        this.T.add(f0Var);
        String str2 = f0Var.f125593c;
        RasterSource.Builder builder = new RasterSource.Builder(str2);
        builder.tiles(p13.w.c(f0Var.f125591a));
        builder.minzoom(8L);
        builder.tileSize(256L);
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            SourceUtils.addSource(mapboxMapB0, builder.build());
        }
        RasterLayer rasterLayer = new RasterLayer(f0Var.f125592b, str2);
        if (z14) {
            rasterLayer.visibility(Visibility.VISIBLE);
        } else {
            rasterLayer.visibility(Visibility.NONE);
        }
        ArrayList<com.garmin.android.library.mapsdkadapter.l> arrayList = this.C;
        if (arrayList.isEmpty()) {
            MapboxMap mapboxMapB1 = b0();
            if (mapboxMapB1 != null) {
                LayerUtils.addPersistentLayer$default(mapboxMapB1, rasterLayer, null, 2, null);
                return;
            }
            return;
        }
        Object objB0 = h0.b0(arrayList);
        objB0.getClass();
        ArrayList arrayList2 = ((d0) objB0).f125580d;
        if (arrayList2.isEmpty()) {
            MapboxMap mapboxMapB2 = b0();
            if (mapboxMapB2 != null) {
                LayerUtils.addPersistentLayer$default(mapboxMapB2, rasterLayer, null, 2, null);
                return;
            }
            return;
        }
        MapboxMap mapboxMapB3 = b0();
        if (mapboxMapB3 != null) {
            LayerUtils.addPersistentLayer(mapboxMapB3, rasterLayer, new LayerPosition(null, ((LineLayer) h0.b0(arrayList2)).getLayerId(), null));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void q() {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void r(y40.i iVar) {
        this.f50244e = iVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List s() {
        return this.C;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMapType(int i14) {
        String strB = p.b(com.garmin.android.library.mapsdkadapter.i.e.f50297a, i14);
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            MapboxMap.loadStyle$default(mapboxMapB0, StyleExtensionImplKt.style(strB, new n63.w(17)), (Style.OnStyleLoaded) null, 2, (Object) null);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMyLocationEnabled(boolean z14) {
        Context context;
        MapView mapView;
        LocationComponentPlugin locationComponent;
        MapView mapView2 = this.f125704v;
        if (mapView2 == null || (context = mapView2.getContext()) == null || !PermissionsManager.INSTANCE.areLocationPermissionsGranted(context) || (mapView = this.f125704v) == null || (locationComponent = LocationComponentUtils.getLocationComponent(mapView)) == null) {
            return;
        }
        locationComponent.setEnabled(z14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setPadding(int i14, int i15, int i16, int i17) {
        MapView mapView = this.f125704v;
        if (mapView != null) {
            mapView.setPadding(0, 0, 0, i17);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void t(n23.j jVar) {
        this.f50252m = jVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.f getF50269y() {
        return this.X;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void v(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        eVar.getClass();
        if (i14 == -1) {
            i14 = this.H0;
        }
        n nVar = new n(null, null, null, null, null, Integer.valueOf(i14), p.g(eVar), 31, null);
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            Float f14 = this.f125705w;
            nVar.a(mapboxMapB0, f14 != null ? Double.valueOf(f14.floatValue()) : null, new mh1.x(this, 25));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.j x(com.garmin.android.library.mapsdkadapter.p pVar) {
        pVar.getClass();
        com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p(pVar);
        PointAnnotationManager pointAnnotationManager = this.f125706x;
        if (pointAnnotationManager == null) {
            return new qe2.i(pVar);
        }
        PointAnnotation pointAnnotationCreate = pointAnnotationManager.create(x.a(pVar2, this.f125702r));
        ViewAnnotationManager viewAnnotationManager = this.f125708z;
        View viewAddViewAnnotation = null;
        if (viewAnnotationManager != null) {
            pointAnnotationCreate.getClass();
            ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
            ViewAnnotationOptionsKtxKt.geometry(builder, pointAnnotationCreate.getGeometry());
            ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
            builder2.anchor(ViewAnnotationAnchor.CENTER);
            Bitmap iconImageBitmap = pointAnnotationCreate.getIconImageBitmap();
            Integer numValueOf = iconImageBitmap != null ? Integer.valueOf(iconImageBitmap.getHeight()) : null;
            numValueOf.getClass();
            builder2.offsetY(numValueOf.intValue());
            builder.variableAnchors(p13.w.c(builder2.build())).getClass();
            ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
            viewAnnotationOptionsBuild.getClass();
            viewAddViewAnnotation = viewAnnotationManager.addViewAnnotation(R.layout.marker_callout, viewAnnotationOptionsBuild);
        }
        if (viewAddViewAnnotation != null) {
            pe2.a aVarA = pe2.a.a(viewAddViewAnnotation);
            TextView textView = aVarA.f137463b;
            com.garmin.android.library.mapsdkadapter.o oVar = pVar2.f50327a;
            textView.setText(oVar.f50312d);
            aVarA.f137462a.setText(oVar.f50313e);
            viewAddViewAnnotation.setVisibility(8);
        }
        w wVar = new w(pVar2, pointAnnotationCreate, viewAddViewAnnotation, this);
        this.D.add(wVar);
        return wVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void y(final boolean z14) {
        MapboxMap mapboxMapB0 = b0();
        if (mapboxMapB0 != null) {
            mapboxMapB0.getStyle(new Style.OnStyleLoaded(this) { // from class: ne2.q
                @Override // com.mapbox.maps.Style.OnStyleLoaded
                public final void onStyleLoaded(Style style) {
                    boolean z15 = z14;
                    int i14 = s.M0;
                    style.getClass();
                    try {
                        int i15 = o13.q.f128596b;
                        Value valueValueOf = Value.valueOf(z15);
                        valueValueOf.getClass();
                        style.setStyleImportConfigProperty(TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID, BaseStyleConfigurationState.CONFIG_SHOW_POINT_OF_INTEREST_LABELS, valueValueOf);
                    } catch (Throwable th3) {
                        int i16 = o13.q.f128596b;
                        new o13.q.b(th3);
                    }
                }
            });
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void z(final boolean z14) {
        MapView mapView;
        MapboxMap mapboxMapDeprecated;
        if (this.T.isEmpty() || (mapView = this.f125704v) == null || (mapboxMapDeprecated = mapView.getMapboxMapDeprecated()) == null) {
            return;
        }
        mapboxMapDeprecated.getStyle(new Style.OnStyleLoaded() { // from class: ne2.r
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                int i14 = s.M0;
                style.getClass();
                Iterator it = this.f125699a.T.iterator();
                while (it.hasNext()) {
                    Layer layer = LayerUtils.getLayer(style, ((f0) it.next()).f125592b);
                    if (layer != null) {
                        if (z14) {
                            layer.visibility(Visibility.VISIBLE);
                        } else {
                            layer.visibility(Visibility.NONE);
                        }
                    }
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Lne2/s$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "BASE_ZOOM_LEVEL_VALUE", "F", "MIN_BOUNDS_ZOOM_LEVEL", "MAX_ZOOM_LEVEL", "", "DEFAULT_MIN_VIEWPORT_IN_KM", "D", "DEFAULT_BOUNDS_PADDING", "LITE_MODE_PITCH", "NO_ALGORITHM_PITCH", "ALGORITHM_ZOOM_ADJUSTMENT", "", "URL_LAYER_MIN_ZOOM", "J", "URL_LAYER_POLYLINE_WIDTH", "TERRAIN_SOURCE", "TERRAIN_URL", "CLUSTER_POINT_COUNT_TAG", "CLUSTER_ICON_IMAGE_TAG", "UNCLUSTERED_ICON_IMAGE_TAG", "CAMERA_ORIENTATION_CACHE", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
