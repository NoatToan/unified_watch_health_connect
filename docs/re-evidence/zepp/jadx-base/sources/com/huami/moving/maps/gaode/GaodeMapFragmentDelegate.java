package com.huami.moving.maps.gaode;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.TextureSupportMapFragment;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.moving.maps.IInfoWindow;
import com.huami.moving.maps.IMapFragmentDelegate;
import com.huami.moving.maps.IMapInfoWindowClickListenerDelegate;
import com.huami.moving.maps.IMapLoadedCallback;
import com.huami.moving.maps.IMarker;
import com.huami.moving.maps.MapUiSettings;
import com.huami.moving.maps.OnInfoWindowClickListener;
import com.huami.moving.maps.gaode.GaodeMapFragmentDelegate;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001+\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016R%\u0010%\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109¨\u0006>"}, d2 = {"Lcom/huami/moving/maps/gaode/GaodeMapFragmentDelegate;", "Lcom/huami/moving/maps/IMapFragmentDelegate;", "", "l", "Lcom/huami/moving/maps/IMapLoadedCallback;", "callback", PointCategory.INIT, "Landroidx/fragment/app/Fragment;", "getMapFragment", "Lcom/huami/moving/maps/MapUiSettings;", "getMapUiSettings", "Landroid/location/Location;", "location", "Lcom/huami/moving/maps/IMapFragmentDelegate$ZoomLevel;", "zoomLevel", "moveCamera", "", "updateCurrentLocation", "", "maxZoomLevel", "minZoomLevel", "", "iconResId", "Lcom/huami/moving/maps/IInfoWindow;", "infoWindow", "Lcom/huami/moving/maps/IMarker;", "addMarker", "getDefaultLocation", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInfoWindowClickListener", "Lcom/amap/api/maps/TextureSupportMapFragment;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "g", "()Lcom/amap/api/maps/TextureSupportMapFragment;", "mapFragment", "Landroid/os/Handler;", "b", "e", "()Landroid/os/Handler;", "handler", "com/huami/moving/maps/gaode/GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2$1", "c", "f", "()Lcom/huami/moving/maps/gaode/GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2$1;", "infoWindowClickListenerDelegate", "Lcom/amap/api/maps/AMap;", GoogleApiAvailabilityLight.a, "Lcom/amap/api/maps/AMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Landroid/location/Location;", "defaultLocation", "Lcom/amap/api/maps/LocationSource$OnLocationChangedListener;", "Lcom/amap/api/maps/LocationSource$OnLocationChangedListener;", "locationChangeListener", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", "infoWindowClickListener", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GaodeMapFragmentDelegate implements IMapFragmentDelegate {
    private static final float h = 17.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapFragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy infoWindowClickListenerDelegate = LazyKt__LazyJVMKt.lazy(new Function0<GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1>() { // from class: com.huami.moving.maps.gaode.GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2

        /* JADX INFO: renamed from: com.huami.moving.maps.gaode.GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007R)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"com/huami/moving/maps/gaode/GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2$1", "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;", "Lcom/huami/moving/maps/gaode/GaodeMarkerWrapper;", "marker", "", "addMarker", "removeMarker", "Lcom/amap/api/maps/model/Marker;", "onInfoWindowClicked", "", "a", "Lkotlin/Lazy;", "()Ljava/util/Map;", "clickListenerMarkers", "moving_release"}, k = 1, mv = {1, 5, 1})
        public static final class AnonymousClass1 implements IMapInfoWindowClickListenerDelegate<GaodeMarkerWrapper> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy clickListenerMarkers = LazyKt__LazyJVMKt.lazy(a.a);
            public final /* synthetic */ GaodeMapFragmentDelegate b;

            /* JADX INFO: renamed from: com.huami.moving.maps.gaode.GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lcom/amap/api/maps/model/Marker;", "Lcom/huami/moving/maps/gaode/GaodeMarkerWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Map<Marker, GaodeMarkerWrapper>> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Map<Marker, GaodeMarkerWrapper> invoke() {
                    return new LinkedHashMap();
                }
            }

            public AnonymousClass1(GaodeMapFragmentDelegate gaodeMapFragmentDelegate) {
                this.b = gaodeMapFragmentDelegate;
            }

            private final Map<Marker, GaodeMarkerWrapper> a() {
                return (Map) this.clickListenerMarkers.getValue();
            }

            public final void onInfoWindowClicked(@NotNull Marker marker) {
                GaodeMarkerWrapper gaodeMarkerWrapper = a().get(marker);
                if (gaodeMarkerWrapper == null) {
                    return;
                }
                OnInfoWindowClickListener onInfoWindowClickListener = this.b.infoWindowClickListener;
                if (onInfoWindowClickListener != null) {
                    onInfoWindowClickListener.onInfoWindowClick(gaodeMarkerWrapper);
                }
                gaodeMarkerWrapper.onInfoWindowClicked();
            }

            @Override // com.huami.moving.maps.IMapInfoWindowClickListenerDelegate
            public void addMarker(@NotNull GaodeMarkerWrapper marker) {
                a().put(marker.getMarker(), marker);
            }

            @Override // com.huami.moving.maps.IMapInfoWindowClickListenerDelegate
            public void removeMarker(@NotNull GaodeMarkerWrapper marker) {
                Map<Marker, GaodeMarkerWrapper> mapA = a();
                Marker marker2 = marker.getMarker();
                Objects.requireNonNull(mapA, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                TypeIntrinsics.asMutableMap(mapA).remove(marker2);
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1(this.a);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AMap map;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Location defaultLocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LocationSource.OnLocationChangedListener locationChangeListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private OnInfoWindowClickListener infoWindowClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IMapFragmentDelegate.ZoomLevel.values().length];
            iArr[IMapFragmentDelegate.ZoomLevel.MIN.ordinal()] = 1;
            iArr[IMapFragmentDelegate.ZoomLevel.MAX.ordinal()] = 2;
            iArr[IMapFragmentDelegate.ZoomLevel.MIDDLE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Handler> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/amap/api/maps/TextureSupportMapFragment;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextureSupportMapFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextureSupportMapFragment invoke() {
            return TextureSupportMapFragment.newInstance();
        }
    }

    private final Handler e() {
        return (Handler) this.handler.getValue();
    }

    private final GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1 f() {
        return (GaodeMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1) this.infoWindowClickListenerDelegate.getValue();
    }

    private final TextureSupportMapFragment g() {
        return (TextureSupportMapFragment) this.mapFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final GaodeMapFragmentDelegate gaodeMapFragmentDelegate, final IMapLoadedCallback iMapLoadedCallback) {
        AMap map = gaodeMapFragmentDelegate.g().getMap();
        gaodeMapFragmentDelegate.map = map;
        Objects.requireNonNull(map);
        map.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: ae2
            @Override // com.amap.api.maps.AMap.OnMapLoadedListener
            public final void onMapLoaded() {
                GaodeMapFragmentDelegate.i(iMapLoadedCallback);
            }
        });
        AMap aMap = gaodeMapFragmentDelegate.map;
        Objects.requireNonNull(aMap);
        CameraPosition cameraPosition = aMap.getCameraPosition();
        if (cameraPosition != null) {
            Location location = new Location(Constants.LOC_PROVIDER_GAODE);
            gaodeMapFragmentDelegate.defaultLocation = location;
            Objects.requireNonNull(location);
            location.setLatitude(cameraPosition.target.latitude);
            Location location2 = gaodeMapFragmentDelegate.defaultLocation;
            Objects.requireNonNull(location2);
            location2.setLongitude(cameraPosition.target.longitude);
        }
        AMap aMap2 = gaodeMapFragmentDelegate.map;
        Objects.requireNonNull(aMap2);
        aMap2.setMyLocationStyle(new MyLocationStyle().myLocationType(1));
        AMap aMap3 = gaodeMapFragmentDelegate.map;
        Objects.requireNonNull(aMap3);
        aMap3.setLocationSource(new LocationSource() { // from class: com.huami.moving.maps.gaode.GaodeMapFragmentDelegate$init$1$3
            @Override // com.amap.api.maps.LocationSource
            public void activate(@Nullable LocationSource.OnLocationChangedListener listener) {
                this.a.locationChangeListener = listener;
            }

            @Override // com.amap.api.maps.LocationSource
            public void deactivate() {
                this.a.locationChangeListener = null;
            }
        });
        AMap aMap4 = gaodeMapFragmentDelegate.map;
        Objects.requireNonNull(aMap4);
        aMap4.setOnInfoWindowClickListener(new AMap.OnInfoWindowClickListener() { // from class: zd2
            @Override // com.amap.api.maps.AMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                GaodeMapFragmentDelegate.j(this.a, marker);
            }
        });
        gaodeMapFragmentDelegate.l();
        MapUiSettings mapUiSettings = gaodeMapFragmentDelegate.getMapUiSettings();
        if (!(mapUiSettings instanceof GaodeUiSettings)) {
            mapUiSettings = null;
        }
        if (mapUiSettings == null) {
            return;
        }
        ((GaodeUiSettings) mapUiSettings).hideGaodeLogo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(IMapLoadedCallback iMapLoadedCallback) {
        iMapLoadedCallback.afterMapLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(GaodeMapFragmentDelegate gaodeMapFragmentDelegate, Marker marker) {
        gaodeMapFragmentDelegate.f().onInfoWindowClicked(marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(IMapFragmentDelegate.ZoomLevel zoomLevel, Location location, GaodeMapFragmentDelegate gaodeMapFragmentDelegate) {
        float minZoomLevel;
        Float fValueOf;
        if (zoomLevel == null) {
            fValueOf = null;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[zoomLevel.ordinal()];
            if (i == 1) {
                AMap aMap = gaodeMapFragmentDelegate.map;
                Objects.requireNonNull(aMap);
                minZoomLevel = aMap.getMinZoomLevel();
            } else if (i == 2) {
                AMap aMap2 = gaodeMapFragmentDelegate.map;
                Objects.requireNonNull(aMap2);
                minZoomLevel = aMap2.getMaxZoomLevel();
            } else if (i != 3) {
                minZoomLevel = h;
            } else {
                AMap aMap3 = gaodeMapFragmentDelegate.map;
                Objects.requireNonNull(aMap3);
                float minZoomLevel2 = aMap3.getMinZoomLevel();
                AMap aMap4 = gaodeMapFragmentDelegate.map;
                Objects.requireNonNull(aMap4);
                float maxZoomLevel = aMap4.getMaxZoomLevel();
                AMap aMap5 = gaodeMapFragmentDelegate.map;
                Objects.requireNonNull(aMap5);
                minZoomLevel = minZoomLevel2 + ((maxZoomLevel - aMap5.getMinZoomLevel()) / 2.0f);
            }
            fValueOf = Float.valueOf(minZoomLevel);
        }
        if (location != null && fValueOf != null) {
            AMap aMap6 = gaodeMapFragmentDelegate.map;
            Objects.requireNonNull(aMap6);
            aMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), fValueOf.floatValue()));
        } else if (location != null) {
            AMap aMap7 = gaodeMapFragmentDelegate.map;
            Objects.requireNonNull(aMap7);
            aMap7.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude())));
        } else if (fValueOf != null) {
            AMap aMap8 = gaodeMapFragmentDelegate.map;
            Objects.requireNonNull(aMap8);
            aMap8.moveCamera(CameraUpdateFactory.zoomBy(fValueOf.floatValue()));
        }
    }

    private final void l() {
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage())) {
            AMap aMap = this.map;
            Objects.requireNonNull(aMap);
            aMap.setMapLanguage("zh_cn");
        } else {
            AMap aMap2 = this.map;
            Objects.requireNonNull(aMap2);
            aMap2.setMapLanguage("en");
        }
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public IMarker addMarker(int iconResId, @NotNull Location location, @Nullable IInfoWindow infoWindow) {
        AMap aMap = this.map;
        Objects.requireNonNull(aMap);
        GaodeMarkerWrapper gaodeMarkerWrapper = new GaodeMarkerWrapper(aMap, f());
        AMap aMap2 = this.map;
        Objects.requireNonNull(aMap2);
        gaodeMarkerWrapper.setMarker(aMap2.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromResource(iconResId)).position(new LatLng(location.getLatitude(), location.getLongitude()))));
        f().addMarker(gaodeMarkerWrapper);
        if (infoWindow != null) {
            gaodeMarkerWrapper.showInfoWindow(infoWindow);
        }
        return gaodeMarkerWrapper;
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public Location getDefaultLocation() {
        Location location = this.defaultLocation;
        Objects.requireNonNull(location);
        return location;
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public Fragment getMapFragment() {
        return g();
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public MapUiSettings getMapUiSettings() {
        AMap aMap = this.map;
        Objects.requireNonNull(aMap);
        return new GaodeUiSettings(aMap.getUiSettings());
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void init(@NotNull final IMapLoadedCallback callback) {
        e().post(new Runnable() { // from class: ce2
            @Override // java.lang.Runnable
            public final void run() {
                GaodeMapFragmentDelegate.h(this.a, callback);
            }
        });
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public float maxZoomLevel() {
        AMap aMap = this.map;
        Objects.requireNonNull(aMap);
        return aMap.getMaxZoomLevel();
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public float minZoomLevel() {
        AMap aMap = this.map;
        Objects.requireNonNull(aMap);
        return aMap.getMinZoomLevel();
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void moveCamera(@NotNull Location location) {
        IMapFragmentDelegate.DefaultImpls.moveCamera(this, location);
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener listener) {
        this.infoWindowClickListener = listener;
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void updateCurrentLocation(@NotNull Location location, boolean moveCamera) {
        LocationSource.OnLocationChangedListener onLocationChangedListener = this.locationChangeListener;
        if (onLocationChangedListener != null) {
            onLocationChangedListener.onLocationChanged(location);
        }
        if (moveCamera) {
            moveCamera(location);
        }
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void moveCamera(@NotNull IMapFragmentDelegate.ZoomLevel zoomLevel) {
        IMapFragmentDelegate.DefaultImpls.moveCamera(this, zoomLevel);
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void moveCamera(@Nullable final Location location, @Nullable final IMapFragmentDelegate.ZoomLevel zoomLevel) {
        e().post(new Runnable() { // from class: be2
            @Override // java.lang.Runnable
            public final void run() {
                GaodeMapFragmentDelegate.k(zoomLevel, location, this);
            }
        });
    }
}
