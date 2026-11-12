package com.mapbox.maps.plugin.attribution;

import android.view.View;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/AttributionPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/LifecyclePlugin;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsInterface;", "getMapAttributionDelegate", "Lcom/mapbox/maps/plugin/delegates/MapAttributionDelegate;", "setContentDescription", "", "contentDescription", "", "setCustomAttributionDialogManager", "dialogManager", "Lcom/mapbox/maps/plugin/attribution/AttributionDialogManager;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AttributionPlugin extends ViewPlugin, LifecyclePlugin, AttributionSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(AttributionPlugin attributionPlugin) {
            ViewPlugin.DefaultImpls.cleanup(attributionPlugin);
        }

        public static void initialize(AttributionPlugin attributionPlugin) {
            ViewPlugin.DefaultImpls.initialize(attributionPlugin);
        }

        public static void onDelegateProvider(AttributionPlugin attributionPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(attributionPlugin, mapDelegateProvider);
        }

        public static void onPluginView(AttributionPlugin attributionPlugin, View view2) {
            view2.getClass();
            ViewPlugin.DefaultImpls.onPluginView(attributionPlugin, view2);
        }

        public static void onStart(AttributionPlugin attributionPlugin) {
            LifecyclePlugin.DefaultImpls.onStart(attributionPlugin);
        }

        public static void onStop(AttributionPlugin attributionPlugin) {
            LifecyclePlugin.DefaultImpls.onStop(attributionPlugin);
        }

        public static void setContentDescription(AttributionPlugin attributionPlugin, CharSequence charSequence) {
        }
    }

    MapAttributionDelegate getMapAttributionDelegate();

    void setContentDescription(CharSequence contentDescription);

    void setCustomAttributionDialogManager(AttributionDialogManager dialogManager);
}
