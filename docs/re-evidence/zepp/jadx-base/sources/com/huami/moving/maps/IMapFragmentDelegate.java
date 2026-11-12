package com.huami.moving.maps;

import android.location.Location;
import androidx.annotation.DrawableRes;
import androidx.fragment.app.Fragment;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.moving.maps.gaode.GaodeMapFragmentDelegate;
import com.huami.moving.maps.google.GoogleMapFragmentDelegate;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J&\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u001a\u001a\u00020\rH&J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¨\u0006!"}, d2 = {"Lcom/huami/moving/maps/IMapFragmentDelegate;", "", "Lcom/huami/moving/maps/IMapLoadedCallback;", "callback", "", PointCategory.INIT, "Landroidx/fragment/app/Fragment;", "getMapFragment", "Lcom/huami/moving/maps/MapUiSettings;", "getMapUiSettings", "Lcom/huami/moving/maps/IMapFragmentDelegate$ZoomLevel;", "zoomLevel", "moveCamera", "Landroid/location/Location;", "location", "", "updateCurrentLocation", "", "maxZoomLevel", "minZoomLevel", "", "iconResId", "Lcom/huami/moving/maps/IInfoWindow;", "infoWindow", "Lcom/huami/moving/maps/IMarker;", "addMarker", "getDefaultLocation", "Lcom/huami/moving/maps/OnInfoWindowClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInfoWindowClickListener", "Companion", "MapType", "ZoomLevel", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface IMapFragmentDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/moving/maps/IMapFragmentDelegate$Companion;", "", "Lcom/huami/moving/maps/IMapFragmentDelegate;", "newInstance", "Lcom/huami/moving/maps/IMapFragmentDelegate$MapType;", "type", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MapType.values().length];
                iArr[MapType.GOOGLE.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        @NotNull
        public final IMapFragmentDelegate newInstance() {
            return newInstance(null);
        }

        @NotNull
        public final IMapFragmentDelegate newInstance(@Nullable MapType type) {
            IMapFragmentDelegate googleMapFragmentDelegate;
            if (type == null) {
                googleMapFragmentDelegate = null;
            } else {
                googleMapFragmentDelegate = WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1 ? new GoogleMapFragmentDelegate() : new GaodeMapFragmentDelegate();
            }
            return googleMapFragmentDelegate == null ? new GaodeMapFragmentDelegate() : googleMapFragmentDelegate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ IMarker addMarker$default(IMapFragmentDelegate iMapFragmentDelegate, int i, Location location, IInfoWindow iInfoWindow, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
            }
            if ((i2 & 4) != 0) {
                iInfoWindow = null;
            }
            return iMapFragmentDelegate.addMarker(i, location, iInfoWindow);
        }

        public static void moveCamera(@NotNull IMapFragmentDelegate iMapFragmentDelegate, @NotNull ZoomLevel zoomLevel) {
            iMapFragmentDelegate.moveCamera(null, zoomLevel);
        }

        public static /* synthetic */ void updateCurrentLocation$default(IMapFragmentDelegate iMapFragmentDelegate, Location location, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentLocation");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            iMapFragmentDelegate.updateCurrentLocation(location, z);
        }

        public static void moveCamera(@NotNull IMapFragmentDelegate iMapFragmentDelegate, @NotNull Location location) {
            iMapFragmentDelegate.moveCamera(location, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/maps/IMapFragmentDelegate$MapType;", "", "<init>", "(Ljava/lang/String;I)V", "GAO_DE", AndroidManufacturerUtils.MANUFACTURE_GOOGLE, "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum MapType {
        GAO_DE,
        GOOGLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huami/moving/maps/IMapFragmentDelegate$ZoomLevel;", "", "<init>", "(Ljava/lang/String;I)V", "MIN", "MIDDLE", "MAX", MessengerShareContentUtility.PREVIEW_DEFAULT, "moving_release"}, k = 1, mv = {1, 5, 1})
    public enum ZoomLevel {
        MIN,
        MIDDLE,
        MAX,
        DEFAULT
    }

    @NotNull
    IMarker addMarker(@DrawableRes int iconResId, @NotNull Location location, @Nullable IInfoWindow infoWindow);

    @NotNull
    Location getDefaultLocation();

    @NotNull
    Fragment getMapFragment();

    @NotNull
    MapUiSettings getMapUiSettings();

    void init(@NotNull IMapLoadedCallback callback);

    float maxZoomLevel();

    float minZoomLevel();

    void moveCamera(@NotNull Location location);

    void moveCamera(@Nullable Location location, @Nullable ZoomLevel zoomLevel);

    void moveCamera(@NotNull ZoomLevel zoomLevel);

    void setOnInfoWindowClickListener(@Nullable OnInfoWindowClickListener listener);

    void updateCurrentLocation(@NotNull Location location, boolean moveCamera);
}
