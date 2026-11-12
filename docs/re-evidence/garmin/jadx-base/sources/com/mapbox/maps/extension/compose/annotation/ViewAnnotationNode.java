package com.mapbox.maps.extension.compose.annotation;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.extension.compose.internal.MapNode;
import com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\u0017\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u001eR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/ViewAnnotationNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "viewAnnotationManager", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "view", "Landroid/view/View;", "updatedListener", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;Landroid/view/View;Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V", "internalViewAnnotationUpdatedListener", "com/mapbox/maps/extension/compose/annotation/ViewAnnotationNode$internalViewAnnotationUpdatedListener$1", "Lcom/mapbox/maps/extension/compose/annotation/ViewAnnotationNode$internalViewAnnotationUpdatedListener$1;", "isObservingUpdate", "", "getUpdatedListener", "()Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "setUpdatedListener", "(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V", "getView", "()Landroid/view/View;", "getViewAnnotationManager", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "cleanUp", "", "onAttached", "parent", "onClear", "onRemoved", "updateAndSubscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateAndSubscribe$extension_compose_release", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationNode extends MapNode {
    private final ViewAnnotationNode$internalViewAnnotationUpdatedListener$1 internalViewAnnotationUpdatedListener;
    private boolean isObservingUpdate;
    private OnViewAnnotationUpdatedListener updatedListener;
    private final View view;
    private final ViewAnnotationManager viewAnnotationManager;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.mapbox.maps.extension.compose.annotation.ViewAnnotationNode$internalViewAnnotationUpdatedListener$1] */
    public ViewAnnotationNode(ViewAnnotationManager viewAnnotationManager, View view2, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        viewAnnotationManager.getClass();
        view2.getClass();
        this.viewAnnotationManager = viewAnnotationManager;
        this.view = view2;
        this.updatedListener = onViewAnnotationUpdatedListener;
        this.internalViewAnnotationUpdatedListener = new OnViewAnnotationUpdatedListener() { // from class: com.mapbox.maps.extension.compose.annotation.ViewAnnotationNode$internalViewAnnotationUpdatedListener$1
            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public void onViewAnnotationAnchorCoordinateUpdated(View view3, Point anchorCoordinate) {
                OnViewAnnotationUpdatedListener updatedListener;
                view3.getClass();
                anchorCoordinate.getClass();
                if (!view3.equals(this.this$0.getView()) || (updatedListener = this.this$0.getUpdatedListener()) == null) {
                    return;
                }
                updatedListener.onViewAnnotationAnchorCoordinateUpdated(view3, anchorCoordinate);
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public void onViewAnnotationAnchorUpdated(View view3, ViewAnnotationAnchorConfig anchor) {
                OnViewAnnotationUpdatedListener updatedListener;
                view3.getClass();
                anchor.getClass();
                if (!view3.equals(this.this$0.getView()) || (updatedListener = this.this$0.getUpdatedListener()) == null) {
                    return;
                }
                updatedListener.onViewAnnotationAnchorUpdated(view3, anchor);
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public void onViewAnnotationPositionUpdated(View view3, ScreenCoordinate leftTopCoordinate, double width, double height) {
                OnViewAnnotationUpdatedListener updatedListener;
                view3.getClass();
                leftTopCoordinate.getClass();
                if (!view3.equals(this.this$0.getView()) || (updatedListener = this.this$0.getUpdatedListener()) == null) {
                    return;
                }
                updatedListener.onViewAnnotationPositionUpdated(view3, leftTopCoordinate, width, height);
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public void onViewAnnotationVisibilityUpdated(View view3, boolean visible) {
                OnViewAnnotationUpdatedListener updatedListener;
                view3.getClass();
                if (!view3.equals(this.this$0.getView()) || (updatedListener = this.this$0.getUpdatedListener()) == null) {
                    return;
                }
                updatedListener.onViewAnnotationVisibilityUpdated(view3, visible);
            }
        };
    }

    private final void cleanUp() {
        ViewAnnotationManager viewAnnotationManager = this.viewAnnotationManager;
        if (this.isObservingUpdate) {
            viewAnnotationManager.removeOnViewAnnotationUpdatedListener(this.internalViewAnnotationUpdatedListener);
        }
        viewAnnotationManager.removeViewAnnotation(this.view);
        this.updatedListener = null;
    }

    public final OnViewAnnotationUpdatedListener getUpdatedListener() {
        return this.updatedListener;
    }

    public final View getView() {
        return this.view;
    }

    public final ViewAnnotationManager getViewAnnotationManager() {
        return this.viewAnnotationManager;
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        updateAndSubscribe$extension_compose_release(this.updatedListener);
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        cleanUp();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        cleanUp();
    }

    public final void setUpdatedListener(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        this.updatedListener = onViewAnnotationUpdatedListener;
    }

    public final void updateAndSubscribe$extension_compose_release(OnViewAnnotationUpdatedListener listener) {
        this.updatedListener = listener;
        if (listener != null && !this.isObservingUpdate) {
            this.viewAnnotationManager.addOnViewAnnotationUpdatedListener(this.internalViewAnnotationUpdatedListener);
            this.isObservingUpdate = true;
        }
        if (listener == null && this.isObservingUpdate) {
            this.viewAnnotationManager.removeOnViewAnnotationUpdatedListener(this.internalViewAnnotationUpdatedListener);
            this.isObservingUpdate = false;
        }
    }
}
