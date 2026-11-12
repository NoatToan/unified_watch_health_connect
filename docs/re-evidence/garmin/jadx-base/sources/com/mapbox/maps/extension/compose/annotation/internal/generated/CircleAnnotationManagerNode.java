package com.mapbox.maps.extension.compose.annotation.internal.generated;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001cR6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u001c¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/internal/generated/CircleAnnotationManagerNode;", "Lcom/mapbox/maps/extension/compose/annotation/internal/BaseAnnotationNode;", "Lcom/mapbox/maps/MapboxStyleManager;", "mapboxStyleManager", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;", "annotationManager", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;Lo53/b0;)V", "", "cleanUp", "()V", "", "", "getLayerIds", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;", "getAnnotationManager", "()Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationManager;", "", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "currentAnnotations", "Ljava/util/List;", "getCurrentAnnotations$extension_compose_release", "setCurrentAnnotations$extension_compose_release", "(Ljava/util/List;)V", "Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotationOptions;", "value", "annotationClusterItems", "getAnnotationClusterItems", "setAnnotationClusterItems", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationManagerNode extends BaseAnnotationNode {
    private List<CircleAnnotationOptions> annotationClusterItems;
    private final CircleAnnotationManager annotationManager;
    private List<CircleAnnotation> currentAnnotations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleAnnotationManagerNode(MapboxStyleManager mapboxStyleManager, CircleAnnotationManager circleAnnotationManager, b0 b0Var) {
        super(mapboxStyleManager, b0Var);
        mapboxStyleManager.getClass();
        circleAnnotationManager.getClass();
        b0Var.getClass();
        this.annotationManager = circleAnnotationManager;
        this.currentAnnotations = new ArrayList();
        this.annotationClusterItems = j0.f134944a;
    }

    @Override // com.mapbox.maps.extension.compose.annotation.internal.BaseAnnotationNode
    public void cleanUp() {
        this.currentAnnotations.clear();
        this.annotationManager.deleteAll();
        this.annotationManager.onDestroy();
    }

    public final List<CircleAnnotationOptions> getAnnotationClusterItems() {
        return this.annotationClusterItems;
    }

    public final CircleAnnotationManager getAnnotationManager() {
        return this.annotationManager;
    }

    public final List<CircleAnnotation> getCurrentAnnotations$extension_compose_release() {
        return this.currentAnnotations;
    }

    @Override // com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode
    public List<String> getLayerIds() {
        return this.annotationManager.getAssociatedLayers();
    }

    public final void setAnnotationClusterItems(List<CircleAnnotationOptions> list) {
        list.getClass();
        if (!this.currentAnnotations.isEmpty()) {
            this.annotationManager.delete(this.currentAnnotations);
            this.currentAnnotations.clear();
        }
        this.currentAnnotations.addAll(this.annotationManager.create(list));
        this.annotationClusterItems = list;
    }

    public final void setCurrentAnnotations$extension_compose_release(List<CircleAnnotation> list) {
        list.getClass();
        this.currentAnnotations = list;
    }

    public String toString() {
        return "CircleAnnotationManagerNode(#" + hashCode() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
