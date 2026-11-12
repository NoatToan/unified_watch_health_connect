package com.huami.moving.maps.google;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.huami.moving.maps.IInfoWindow;
import com.huami.moving.maps.IMapFragmentDelegate;
import com.huami.moving.maps.IMapInfoWindowClickListenerDelegate;
import com.huami.moving.maps.IMapLoadedCallback;
import com.huami.moving.maps.IMarker;
import com.huami.moving.maps.MapUiSettings;
import com.huami.moving.maps.OnInfoWindowClickListener;
import com.huami.moving.maps.google.GoogleMapFragmentDelegate;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f*\u0001*\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016R%\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00106¨\u0006;"}, d2 = {"Lcom/huami/moving/maps/google/GoogleMapFragmentDelegate;", "Lcom/huami/moving/maps/IMapFragmentDelegate;", "Lcom/huami/moving/maps/IMapLoadedCallback;", "callback", "", PointCategory.INIT, "Landroidx/fragment/app/Fragment;", "getMapFragment", "Lcom/huami/moving/maps/MapUiSettings;", "getMapUiSettings", "Landroid/location/Location;", "location", "Lcom/huami/moving/maps/IMapFragmentDelegate$ZoomLevel;", "zoomLevel", "moveCamera", "", "updateCurrentLocation", "", "maxZoomLevel", "minZoomLevel", "", "iconResId", "Lcom/huami/moving/maps/IInfoWindow;", "infoWindow", "Lcom/huami/moving/maps/IMarker;", "addMarker", "getDefaultLocation", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInfoWindowClickListener", "Lcom/google/android/gms/maps/SupportMapFragment;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "h", "()Lcom/google/android/gms/maps/SupportMapFragment;", "mapFragment", "Landroid/os/Handler;", "b", "f", "()Landroid/os/Handler;", "handler", "com/huami/moving/maps/google/GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2$1", "c", "g", "()Lcom/huami/moving/maps/google/GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2$1;", "infoWindowClickListenerDelegate", "Lcom/google/android/gms/maps/GoogleMap;", GoogleApiAvailabilityLight.a, "Lcom/google/android/gms/maps/GoogleMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "e", "Landroid/location/Location;", "defaultLocation", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", "infoWindowClickListener", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GoogleMapFragmentDelegate implements IMapFragmentDelegate {
    private static final float g = 16.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapFragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy infoWindowClickListenerDelegate = LazyKt__LazyJVMKt.lazy(new Function0<GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1>() { // from class: com.huami.moving.maps.google.GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2

        /* JADX INFO: renamed from: com.huami.moving.maps.google.GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007R)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"com/huami/moving/maps/google/GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2$1", "Lcom/huami/moving/maps/IMapInfoWindowClickListenerDelegate;", "Lcom/huami/moving/maps/google/GoogleMarkerWrapper;", "marker", "", "addMarker", "removeMarker", "Lcom/google/android/gms/maps/model/Marker;", "onInfoWindowClicked", "", "a", "Lkotlin/Lazy;", "()Ljava/util/Map;", "clickListenerMarkers", "moving_release"}, k = 1, mv = {1, 5, 1})
        public static final class AnonymousClass1 implements IMapInfoWindowClickListenerDelegate<GoogleMarkerWrapper> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy clickListenerMarkers = LazyKt__LazyJVMKt.lazy(a.a);
            public final /* synthetic */ GoogleMapFragmentDelegate b;

            /* JADX INFO: renamed from: com.huami.moving.maps.google.GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/huami/moving/maps/google/GoogleMarkerWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Map<Marker, GoogleMarkerWrapper>> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Map<Marker, GoogleMarkerWrapper> invoke() {
                    return new LinkedHashMap();
                }
            }

            public AnonymousClass1(GoogleMapFragmentDelegate googleMapFragmentDelegate) {
                this.b = googleMapFragmentDelegate;
            }

            private final Map<Marker, GoogleMarkerWrapper> a() {
                return (Map) this.clickListenerMarkers.getValue();
            }

            public final void onInfoWindowClicked(@NotNull Marker marker) {
                GoogleMarkerWrapper googleMarkerWrapper = a().get(marker);
                if (googleMarkerWrapper == null) {
                    return;
                }
                OnInfoWindowClickListener onInfoWindowClickListener = this.b.infoWindowClickListener;
                if (onInfoWindowClickListener != null) {
                    onInfoWindowClickListener.onInfoWindowClick(googleMarkerWrapper);
                }
                googleMarkerWrapper.onInfoWindowClicked();
            }

            @Override // com.huami.moving.maps.IMapInfoWindowClickListenerDelegate
            public void addMarker(@NotNull GoogleMarkerWrapper marker) {
                a().put(marker.getMarker(), marker);
            }

            @Override // com.huami.moving.maps.IMapInfoWindowClickListenerDelegate
            public void removeMarker(@NotNull GoogleMarkerWrapper marker) {
                Map<Marker, GoogleMarkerWrapper> mapA = a();
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
    private GoogleMap map;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Location defaultLocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/google/android/gms/maps/SupportMapFragment;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SupportMapFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SupportMapFragment invoke() {
            return SupportMapFragment.newInstance();
        }
    }

    private final Handler f() {
        return (Handler) this.handler.getValue();
    }

    private final GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1 g() {
        return (GoogleMapFragmentDelegate$infoWindowClickListenerDelegate$2.AnonymousClass1) this.infoWindowClickListenerDelegate.getValue();
    }

    private final SupportMapFragment h() {
        return (SupportMapFragment) this.mapFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final GoogleMapFragmentDelegate googleMapFragmentDelegate, final IMapLoadedCallback iMapLoadedCallback) {
        googleMapFragmentDelegate.h().getMapAsync(new OnMapReadyCallback() { // from class: wh2
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap googleMap) {
                GoogleMapFragmentDelegate.j(this.a, iMapLoadedCallback, googleMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final GoogleMapFragmentDelegate googleMapFragmentDelegate, final IMapLoadedCallback iMapLoadedCallback, GoogleMap googleMap) {
        googleMapFragmentDelegate.map = googleMap;
        Objects.requireNonNull(googleMap);
        googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() { // from class: vh2
            @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
            public final void onMapLoaded() {
                GoogleMapFragmentDelegate.k(iMapLoadedCallback);
            }
        });
        GoogleMap googleMap2 = googleMapFragmentDelegate.map;
        Objects.requireNonNull(googleMap2);
        CameraPosition cameraPosition = googleMap2.getCameraPosition();
        if (cameraPosition != null) {
            Location location = new Location("google");
            googleMapFragmentDelegate.defaultLocation = location;
            Objects.requireNonNull(location);
            location.setLatitude(cameraPosition.target.latitude);
            Location location2 = googleMapFragmentDelegate.defaultLocation;
            Objects.requireNonNull(location2);
            location2.setLongitude(cameraPosition.target.longitude);
        }
        GoogleMap googleMap3 = googleMapFragmentDelegate.map;
        Objects.requireNonNull(googleMap3);
        googleMap3.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: uh2
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                GoogleMapFragmentDelegate.l(this.a, marker);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(IMapLoadedCallback iMapLoadedCallback) {
        iMapLoadedCallback.afterMapLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(GoogleMapFragmentDelegate googleMapFragmentDelegate, Marker marker) {
        googleMapFragmentDelegate.g().onInfoWindowClicked(marker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(IMapFragmentDelegate.ZoomLevel zoomLevel, Location location, GoogleMapFragmentDelegate googleMapFragmentDelegate) {
        float minZoomLevel;
        Float fValueOf;
        if (zoomLevel == null) {
            fValueOf = null;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[zoomLevel.ordinal()];
            if (i == 1) {
                GoogleMap googleMap = googleMapFragmentDelegate.map;
                Objects.requireNonNull(googleMap);
                minZoomLevel = googleMap.getMinZoomLevel();
            } else if (i == 2) {
                GoogleMap googleMap2 = googleMapFragmentDelegate.map;
                Objects.requireNonNull(googleMap2);
                minZoomLevel = googleMap2.getMaxZoomLevel();
            } else if (i != 3) {
                minZoomLevel = 16.0f;
            } else {
                GoogleMap googleMap3 = googleMapFragmentDelegate.map;
                Objects.requireNonNull(googleMap3);
                float minZoomLevel2 = googleMap3.getMinZoomLevel();
                GoogleMap googleMap4 = googleMapFragmentDelegate.map;
                Objects.requireNonNull(googleMap4);
                float maxZoomLevel = googleMap4.getMaxZoomLevel();
                GoogleMap googleMap5 = googleMapFragmentDelegate.map;
                Objects.requireNonNull(googleMap5);
                minZoomLevel = minZoomLevel2 + ((maxZoomLevel - googleMap5.getMinZoomLevel()) / 2.0f);
            }
            fValueOf = Float.valueOf(minZoomLevel);
        }
        if (location != null && fValueOf != null) {
            GoogleMap googleMap6 = googleMapFragmentDelegate.map;
            Objects.requireNonNull(googleMap6);
            googleMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), fValueOf.floatValue()));
        } else if (location != null) {
            GoogleMap googleMap7 = googleMapFragmentDelegate.map;
            Objects.requireNonNull(googleMap7);
            googleMap7.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude())));
        } else if (fValueOf != null) {
            GoogleMap googleMap8 = googleMapFragmentDelegate.map;
            Objects.requireNonNull(googleMap8);
            googleMap8.moveCamera(CameraUpdateFactory.zoomBy(fValueOf.floatValue()));
        }
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public IMarker addMarker(int iconResId, @NotNull Location location, @Nullable IInfoWindow infoWindow) {
        GoogleMap googleMap = this.map;
        Objects.requireNonNull(googleMap);
        GoogleMarkerWrapper googleMarkerWrapper = new GoogleMarkerWrapper(googleMap, g());
        GoogleMap googleMap2 = this.map;
        Objects.requireNonNull(googleMap2);
        googleMarkerWrapper.setMarker(googleMap2.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromResource(iconResId)).position(new LatLng(location.getLatitude(), location.getLongitude()))));
        g().addMarker(googleMarkerWrapper);
        if (infoWindow != null) {
            googleMarkerWrapper.showInfoWindow(infoWindow);
        }
        return googleMarkerWrapper;
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
        return h();
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    @NotNull
    public MapUiSettings getMapUiSettings() {
        GoogleMap googleMap = this.map;
        Objects.requireNonNull(googleMap);
        return new GoogleUiSettings(googleMap.getUiSettings());
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public void init(@NotNull final IMapLoadedCallback callback) {
        f().post(new Runnable() { // from class: yh2
            @Override // java.lang.Runnable
            public final void run() {
                GoogleMapFragmentDelegate.i(this.a, callback);
            }
        });
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public float maxZoomLevel() {
        GoogleMap googleMap = this.map;
        Objects.requireNonNull(googleMap);
        return googleMap.getMaxZoomLevel();
    }

    @Override // com.huami.moving.maps.IMapFragmentDelegate
    public float minZoomLevel() {
        GoogleMap googleMap = this.map;
        Objects.requireNonNull(googleMap);
        return googleMap.getMinZoomLevel();
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
        f().post(new Runnable() { // from class: xh2
            @Override // java.lang.Runnable
            public final void run() {
                GoogleMapFragmentDelegate.m(zoomLevel, location, this);
            }
        });
    }
}
