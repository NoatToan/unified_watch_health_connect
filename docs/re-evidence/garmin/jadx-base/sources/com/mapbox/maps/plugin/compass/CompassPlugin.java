package com.mapbox.maps.plugin.compass;

import android.view.View;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/compass/CompassPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/MapCameraPlugin;", "Lcom/mapbox/maps/plugin/LifecyclePlugin;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsInterface;", "addCompassClickListener", "", "onClickListener", "Lcom/mapbox/maps/plugin/compass/OnCompassClickListener;", "onCompassClicked", "removeCompassClickListener", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompassPlugin extends ViewPlugin, MapCameraPlugin, LifecyclePlugin, CompassSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(CompassPlugin compassPlugin) {
            ViewPlugin.DefaultImpls.cleanup(compassPlugin);
        }

        public static void initialize(CompassPlugin compassPlugin) {
            ViewPlugin.DefaultImpls.initialize(compassPlugin);
        }

        public static void onDelegateProvider(CompassPlugin compassPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(compassPlugin, mapDelegateProvider);
        }

        public static void onPluginView(CompassPlugin compassPlugin, View view2) {
            view2.getClass();
            ViewPlugin.DefaultImpls.onPluginView(compassPlugin, view2);
        }

        public static void onStart(CompassPlugin compassPlugin) {
            LifecyclePlugin.DefaultImpls.onStart(compassPlugin);
        }

        public static void onStop(CompassPlugin compassPlugin) {
            LifecyclePlugin.DefaultImpls.onStop(compassPlugin);
        }
    }

    void addCompassClickListener(OnCompassClickListener onClickListener);

    void onCompassClicked();

    void removeCompassClickListener(OnCompassClickListener onClickListener);
}
