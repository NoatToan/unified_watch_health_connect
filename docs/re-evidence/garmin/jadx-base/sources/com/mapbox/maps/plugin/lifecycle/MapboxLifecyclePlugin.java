package com.mapbox.maps.plugin.lifecycle;

import android.view.View;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "registerLifecycleObserver", "", "mapView", "Landroid/view/View;", "observer", "Lcom/mapbox/maps/MapboxLifecycleObserver;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapboxLifecyclePlugin extends MapPlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(MapboxLifecyclePlugin mapboxLifecyclePlugin) {
            MapPlugin.DefaultImpls.cleanup(mapboxLifecyclePlugin);
        }

        public static void initialize(MapboxLifecyclePlugin mapboxLifecyclePlugin) {
            MapPlugin.DefaultImpls.initialize(mapboxLifecyclePlugin);
        }

        public static void onDelegateProvider(MapboxLifecyclePlugin mapboxLifecyclePlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(mapboxLifecyclePlugin, mapDelegateProvider);
        }
    }

    void registerLifecycleObserver(View mapView, MapboxLifecycleObserver observer);
}
