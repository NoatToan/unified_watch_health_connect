package com.mapbox.maps.plugin.annotation.generated;

import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationPlugin;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"createPolylineAnnotationManager", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "Lcom/mapbox/maps/plugin/annotation/AnnotationPlugin;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "plugin-annotation_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationManagerKt {
    public static final PolylineAnnotationManager createPolylineAnnotationManager(AnnotationPlugin annotationPlugin, AnnotationConfig annotationConfig) {
        annotationPlugin.getClass();
        AnnotationManager<?, ?, ?, ?, ?, ?, ?> annotationManagerCreateAnnotationManager = annotationPlugin.createAnnotationManager(AnnotationType.PolylineAnnotation, annotationConfig);
        annotationManagerCreateAnnotationManager.getClass();
        return (PolylineAnnotationManager) annotationManagerCreateAnnotationManager;
    }

    public static /* synthetic */ PolylineAnnotationManager createPolylineAnnotationManager$default(AnnotationPlugin annotationPlugin, AnnotationConfig annotationConfig, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            annotationConfig = null;
        }
        return createPolylineAnnotationManager(annotationPlugin, annotationConfig);
    }
}
