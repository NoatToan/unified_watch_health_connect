package com.mapbox.maps.plugin.locationcomponent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.ContextBinder;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000fH&¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "Lcom/mapbox/maps/plugin/MapStyleObserverPlugin;", "Lcom/mapbox/maps/plugin/LifecyclePlugin;", "Lcom/mapbox/maps/plugin/ContextBinder;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsInterface;", "addOnIndicatorAccuracyRadiusChangedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "addOnIndicatorBearingChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "addOnIndicatorPositionChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", "getLocationProvider", "Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;", "isLocatedAt", "point", "Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/plugin/locationcomponent/PuckLocatedAtPointListener;", "removeOnIndicatorAccuracyRadiusChangedListener", "removeOnIndicatorBearingChangedListener", "removeOnIndicatorPositionChangedListener", "setLocationProvider", "locationProvider", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LocationComponentPlugin extends MapPlugin, MapStyleObserverPlugin, LifecyclePlugin, ContextBinder, LocationComponentSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(LocationComponentPlugin locationComponentPlugin) {
            MapPlugin.DefaultImpls.cleanup(locationComponentPlugin);
        }

        public static void initialize(LocationComponentPlugin locationComponentPlugin) {
            MapPlugin.DefaultImpls.initialize(locationComponentPlugin);
        }

        public static void onDelegateProvider(LocationComponentPlugin locationComponentPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(locationComponentPlugin, mapDelegateProvider);
        }

        public static void onStart(LocationComponentPlugin locationComponentPlugin) {
            LifecyclePlugin.DefaultImpls.onStart(locationComponentPlugin);
        }

        public static void onStop(LocationComponentPlugin locationComponentPlugin) {
            LifecyclePlugin.DefaultImpls.onStop(locationComponentPlugin);
        }
    }

    void addOnIndicatorAccuracyRadiusChangedListener(OnIndicatorAccuracyRadiusChangedListener listener);

    void addOnIndicatorBearingChangedListener(OnIndicatorBearingChangedListener listener);

    void addOnIndicatorPositionChangedListener(OnIndicatorPositionChangedListener listener);

    LocationProvider getLocationProvider();

    void isLocatedAt(Point point, PuckLocatedAtPointListener listener);

    void removeOnIndicatorAccuracyRadiusChangedListener(OnIndicatorAccuracyRadiusChangedListener listener);

    void removeOnIndicatorBearingChangedListener(OnIndicatorBearingChangedListener listener);

    void removeOnIndicatorPositionChangedListener(OnIndicatorPositionChangedListener listener);

    void setLocationProvider(LocationProvider locationProvider);
}
