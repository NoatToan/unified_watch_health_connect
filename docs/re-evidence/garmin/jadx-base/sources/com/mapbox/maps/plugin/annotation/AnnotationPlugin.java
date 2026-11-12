package com.mapbox.maps.plugin.annotation;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J6\u0010\u0004\u001a\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J,\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H&¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "Lcom/mapbox/maps/plugin/MapStyleObserverPlugin;", "createAnnotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "removeAnnotationManager", "", "annotationManager", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AnnotationPlugin extends MapPlugin, MapSizePlugin, MapStyleObserverPlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(AnnotationPlugin annotationPlugin) {
            MapPlugin.DefaultImpls.cleanup(annotationPlugin);
        }

        public static void initialize(AnnotationPlugin annotationPlugin) {
            MapPlugin.DefaultImpls.initialize(annotationPlugin);
        }

        public static void onDelegateProvider(AnnotationPlugin annotationPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(annotationPlugin, mapDelegateProvider);
        }

        public static void onSizeChanged(AnnotationPlugin annotationPlugin, int i14, int i15) {
            MapSizePlugin.DefaultImpls.onSizeChanged(annotationPlugin, i14, i15);
        }
    }

    AnnotationManager<?, ?, ?, ?, ?, ?, ?> createAnnotationManager(AnnotationType type, AnnotationConfig annotationConfig);

    void removeAnnotationManager(AnnotationManager<?, ?, ?, ?, ?, ?, ?> annotationManager);
}
