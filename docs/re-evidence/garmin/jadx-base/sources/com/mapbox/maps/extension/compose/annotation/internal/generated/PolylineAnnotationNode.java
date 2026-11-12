package com.mapbox.maps.extension.compose.annotation.internal.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/internal/generated/PolylineAnnotationNode;", "Lcom/mapbox/maps/extension/compose/annotation/internal/BaseAnnotationNode;", "Lcom/mapbox/maps/MapboxStyleManager;", "mapboxStyleManager", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "annotation", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;Lo53/b0;)V", "", "cleanUp", "()V", "", "", "getLayerIds", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "getAnnotationManager", "()Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "getAnnotation", "()Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationNode extends BaseAnnotationNode {
    private final PolylineAnnotation annotation;
    private final PolylineAnnotationManager annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotationNode(MapboxStyleManager mapboxStyleManager, PolylineAnnotationManager polylineAnnotationManager, PolylineAnnotation polylineAnnotation, b0 b0Var) {
        super(mapboxStyleManager, b0Var);
        mapboxStyleManager.getClass();
        polylineAnnotationManager.getClass();
        polylineAnnotation.getClass();
        b0Var.getClass();
        this.annotationManager = polylineAnnotationManager;
        this.annotation = polylineAnnotation;
    }

    @Override // com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode
    public void cleanUp() {
        this.annotationManager.delete(this.annotation);
        this.annotationManager.onDestroy();
    }

    public final PolylineAnnotation getAnnotation() {
        return this.annotation;
    }

    public final PolylineAnnotationManager getAnnotationManager() {
        return this.annotationManager;
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public List<String> getLayerIds() {
        return this.annotationManager.getAssociatedLayers();
    }

    public String toString() {
        return "PolylineAnnotationNode(#" + hashCode() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
