package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.ClusterFeature;
import com.mapbox.maps.plugin.annotation.OnClusterClickListener;
import com.mapbox.maps.plugin.annotation.OnClusterLongClickListener;
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationClickListener;
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationDragListener;
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationLongClickListener;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000e\u0010\tJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0015\u0010\tJ!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+RG\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102RG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102RG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102RG\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u00100\"\u0004\b;\u00102RG\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b=\u00100\"\u0004\b>\u00102RG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u00100\"\u0004\bA\u00102RG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010.\u001a\u0004\bC\u00100\"\u0004\bD\u00102R+\u0010F\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotation;", "", "onClick", "onClicked", "(Le23/l;)Lcom/mapbox/maps/extension/compose/annotation/generated/PointAnnotationGroupInteractionsState;", "onLongClick", "onLongClicked", "Lcom/mapbox/maps/plugin/annotation/ClusterFeature;", "onClusterClick", "onClusterClicked", "onClusterLongClick", "onClusterLongClicked", "", "onDragStart", "onDragStarted", "onDrag", "onDragged", "onDragFinish", "onDragFinished", "Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;", "annotationManager", "BindTo$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/PointAnnotationManager;Lp3/m;I)V", "BindTo", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationClickListener;", "onClickedListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationLongClickListener;", "onLongClickedListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/OnClusterClickListener;", "onClusterClickedListener", "Lcom/mapbox/maps/plugin/annotation/OnClusterClickListener;", "Lcom/mapbox/maps/plugin/annotation/OnClusterLongClickListener;", "onClusterLongClickedListener", "Lcom/mapbox/maps/plugin/annotation/OnClusterLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationDragListener;", "onDragListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationDragListener;", "<set-?>", "onClicked$delegate", "Lp3/p1;", "getOnClicked", "()Le23/l;", "setOnClicked", "(Le23/l;)V", "onLongClicked$delegate", "getOnLongClicked", "setOnLongClicked", "onDragStarted$delegate", "getOnDragStarted", "setOnDragStarted", "onDragged$delegate", "getOnDragged", "setOnDragged", "onDragFinished$delegate", "getOnDragFinished", "setOnDragFinished", "onClusterClicked$delegate", "getOnClusterClicked", "setOnClusterClicked", "onClusterLongClicked$delegate", "getOnClusterLongClicked", "setOnClusterLongClicked", "isDraggable$delegate", "isDraggable", "()Z", "setDraggable", "(Z)V", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationGroupInteractionsState {
    private final OnPointAnnotationClickListener onClickedListener = new OnPointAnnotationClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupInteractionsState$onClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationClickListener
        public final boolean onAnnotationClick(PointAnnotation pointAnnotation) {
            pointAnnotation.getClass();
            l onClicked = this.this$0.getOnClicked();
            if (onClicked != null) {
                return ((Boolean) onClicked.invoke(pointAnnotation)).booleanValue();
            }
            return false;
        }
    };
    private final OnPointAnnotationLongClickListener onLongClickedListener = new OnPointAnnotationLongClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupInteractionsState$onLongClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationLongClickListener
        public final boolean onAnnotationLongClick(PointAnnotation pointAnnotation) {
            pointAnnotation.getClass();
            l onLongClicked = this.this$0.getOnLongClicked();
            if (onLongClicked != null) {
                return ((Boolean) onLongClicked.invoke(pointAnnotation)).booleanValue();
            }
            return false;
        }
    };
    private final OnClusterClickListener onClusterClickedListener = new OnClusterClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupInteractionsState$onClusterClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnClusterClickListener
        public final boolean onClusterClick(ClusterFeature clusterFeature) {
            clusterFeature.getClass();
            l onClusterClicked = this.this$0.getOnClusterClicked();
            if (onClusterClicked != null) {
                return ((Boolean) onClusterClicked.invoke(clusterFeature)).booleanValue();
            }
            return false;
        }
    };
    private final OnClusterLongClickListener onClusterLongClickedListener = new OnClusterLongClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupInteractionsState$onClusterLongClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnClusterLongClickListener
        public final boolean onClusterLongClick(ClusterFeature clusterFeature) {
            clusterFeature.getClass();
            l onClusterLongClicked = this.this$0.getOnClusterLongClicked();
            if (onClusterLongClicked != null) {
                return ((Boolean) onClusterLongClicked.invoke(clusterFeature)).booleanValue();
            }
            return false;
        }
    };
    private final OnPointAnnotationDragListener onDragListener = new OnPointAnnotationDragListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PointAnnotationGroupInteractionsState$onDragListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDrag(Annotation<?> annotation) {
            l onDragged;
            annotation.getClass();
            PointAnnotation pointAnnotation = annotation instanceof PointAnnotation ? (PointAnnotation) annotation : null;
            if (pointAnnotation == null || (onDragged = this.this$0.getOnDragged()) == null) {
                return;
            }
            onDragged.invoke(pointAnnotation);
        }

        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDragFinished(Annotation<?> annotation) {
            l onDragFinished;
            annotation.getClass();
            PointAnnotation pointAnnotation = annotation instanceof PointAnnotation ? (PointAnnotation) annotation : null;
            if (pointAnnotation == null || (onDragFinished = this.this$0.getOnDragFinished()) == null) {
                return;
            }
            onDragFinished.invoke(pointAnnotation);
        }

        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDragStarted(Annotation<?> annotation) {
            l onDragStarted;
            annotation.getClass();
            PointAnnotation pointAnnotation = annotation instanceof PointAnnotation ? (PointAnnotation) annotation : null;
            if (pointAnnotation == null || (onDragStarted = this.this$0.getOnDragStarted()) == null) {
                return;
            }
            onDragStarted.invoke(pointAnnotation);
        }
    };

    /* JADX INFO: renamed from: onClicked$delegate, reason: from kotlin metadata */
    private final p1 onClicked = p0.n(null);

    /* JADX INFO: renamed from: onLongClicked$delegate, reason: from kotlin metadata */
    private final p1 onLongClicked = p0.n(null);

    /* JADX INFO: renamed from: onDragStarted$delegate, reason: from kotlin metadata */
    private final p1 onDragStarted = p0.n(null);

    /* JADX INFO: renamed from: onDragged$delegate, reason: from kotlin metadata */
    private final p1 onDragged = p0.n(null);

    /* JADX INFO: renamed from: onDragFinished$delegate, reason: from kotlin metadata */
    private final p1 onDragFinished = p0.n(null);

    /* JADX INFO: renamed from: onClusterClicked$delegate, reason: from kotlin metadata */
    private final p1 onClusterClicked = p0.n(null);

    /* JADX INFO: renamed from: onClusterLongClicked$delegate, reason: from kotlin metadata */
    private final p1 onClusterLongClicked = p0.n(null);

    /* JADX INFO: renamed from: isDraggable$delegate, reason: from kotlin metadata */
    private final p1 isDraggable = p0.n(Boolean.FALSE);

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PointAnnotation, Boolean> getOnClicked() {
        return (l) this.onClicked.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<ClusterFeature, Boolean> getOnClusterClicked() {
        return (l) this.onClusterClicked.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<ClusterFeature, Boolean> getOnClusterLongClicked() {
        return (l) this.onClusterLongClicked.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PointAnnotation, Unit> getOnDragFinished() {
        return (l) this.onDragFinished.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PointAnnotation, Unit> getOnDragStarted() {
        return (l) this.onDragStarted.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PointAnnotation, Unit> getOnDragged() {
        return (l) this.onDragged.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PointAnnotation, Boolean> getOnLongClicked() {
        return (l) this.onLongClicked.getF182175a();
    }

    private final void setOnClicked(l<? super PointAnnotation, Boolean> lVar) {
        this.onClicked.setValue(lVar);
    }

    private final void setOnClusterClicked(l<? super ClusterFeature, Boolean> lVar) {
        this.onClusterClicked.setValue(lVar);
    }

    private final void setOnClusterLongClicked(l<? super ClusterFeature, Boolean> lVar) {
        this.onClusterLongClicked.setValue(lVar);
    }

    private final void setOnDragFinished(l<? super PointAnnotation, Unit> lVar) {
        this.onDragFinished.setValue(lVar);
    }

    private final void setOnDragStarted(l<? super PointAnnotation, Unit> lVar) {
        this.onDragStarted.setValue(lVar);
    }

    private final void setOnDragged(l<? super PointAnnotation, Unit> lVar) {
        this.onDragged.setValue(lVar);
    }

    private final void setOnLongClicked(l<? super PointAnnotation, Boolean> lVar) {
        this.onLongClicked.setValue(lVar);
    }

    public final void BindTo$extension_compose_release(PointAnnotationManager pointAnnotationManager, m mVar, int i14) {
        pointAnnotationManager.getClass();
        o0 o0VarE = mVar.E(1065984880);
        x1 x1Var = n.f135158a;
        l0.a(getOnClicked(), new PointAnnotationGroupInteractionsState$BindTo$1(this, pointAnnotationManager), o0VarE);
        l0.a(getOnLongClicked(), new PointAnnotationGroupInteractionsState$BindTo$2(this, pointAnnotationManager), o0VarE);
        l0.c(getOnDragStarted(), getOnDragged(), getOnDragFinished(), new PointAnnotationGroupInteractionsState$BindTo$3(this, pointAnnotationManager), o0VarE);
        l0.a(getOnClusterClicked(), new PointAnnotationGroupInteractionsState$BindTo$4(this, pointAnnotationManager), o0VarE);
        l0.a(getOnClusterLongClicked(), new PointAnnotationGroupInteractionsState$BindTo$5(this, pointAnnotationManager), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PointAnnotationGroupInteractionsState$BindTo$6(this, pointAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDraggable() {
        return ((Boolean) this.isDraggable.getF182175a()).booleanValue();
    }

    public final PointAnnotationGroupInteractionsState onClicked(l<? super PointAnnotation, Boolean> onClick) {
        onClick.getClass();
        setOnClicked(onClick);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onClusterClicked(l<? super ClusterFeature, Boolean> onClusterClick) {
        onClusterClick.getClass();
        setOnClusterClicked(onClusterClick);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onClusterLongClicked(l<? super ClusterFeature, Boolean> onClusterLongClick) {
        onClusterLongClick.getClass();
        setOnClusterLongClicked(onClusterLongClick);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onDragFinished(l<? super PointAnnotation, Unit> onDragFinish) {
        onDragFinish.getClass();
        setOnDragFinished(onDragFinish);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onDragStarted(l<? super PointAnnotation, Unit> onDragStart) {
        onDragStart.getClass();
        setOnDragStarted(onDragStart);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onDragged(l<? super PointAnnotation, Unit> onDrag) {
        onDrag.getClass();
        setOnDragged(onDrag);
        return this;
    }

    public final PointAnnotationGroupInteractionsState onLongClicked(l<? super PointAnnotation, Boolean> onLongClick) {
        onLongClick.getClass();
        setOnLongClicked(onLongClick);
        return this;
    }

    public final void setDraggable(boolean z14) {
        this.isDraggable.setValue(Boolean.valueOf(z14));
    }
}
