package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.generated.OnPolylineAnnotationClickListener;
import com.mapbox.maps.plugin.annotation.generated.OnPolylineAnnotationDragListener;
import com.mapbox.maps.plugin.annotation.generated.OnPolylineAnnotationLongClickListener;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\tJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 RG\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'RG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'RG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'RG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'RG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R+\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "", "onClick", "onClicked", "(Le23/l;)Lcom/mapbox/maps/extension/compose/annotation/generated/PolylineAnnotationGroupInteractionsState;", "onLongClick", "onLongClicked", "", "onDragStart", "onDragStarted", "onDrag", "onDragged", "onDragFinish", "onDragFinished", "Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;", "annotationManager", "BindTo$extension_compose_release", "(Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotationManager;Lp3/m;I)V", "BindTo", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationClickListener;", "onClickedListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationLongClickListener;", "onLongClickedListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationDragListener;", "onDragListener", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolylineAnnotationDragListener;", "<set-?>", "onClicked$delegate", "Lp3/p1;", "getOnClicked", "()Le23/l;", "setOnClicked", "(Le23/l;)V", "onLongClicked$delegate", "getOnLongClicked", "setOnLongClicked", "onDragStarted$delegate", "getOnDragStarted", "setOnDragStarted", "onDragged$delegate", "getOnDragged", "setOnDragged", "onDragFinished$delegate", "getOnDragFinished", "setOnDragFinished", "isDraggable$delegate", "isDraggable", "()Z", "setDraggable", "(Z)V", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationGroupInteractionsState {
    private final OnPolylineAnnotationClickListener onClickedListener = new OnPolylineAnnotationClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupInteractionsState$onClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationClickListener
        public final boolean onAnnotationClick(PolylineAnnotation polylineAnnotation) {
            polylineAnnotation.getClass();
            l onClicked = this.this$0.getOnClicked();
            if (onClicked != null) {
                return ((Boolean) onClicked.invoke(polylineAnnotation)).booleanValue();
            }
            return false;
        }
    };
    private final OnPolylineAnnotationLongClickListener onLongClickedListener = new OnPolylineAnnotationLongClickListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupInteractionsState$onLongClickedListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationLongClickListener
        public final boolean onAnnotationLongClick(PolylineAnnotation polylineAnnotation) {
            polylineAnnotation.getClass();
            l onLongClicked = this.this$0.getOnLongClicked();
            if (onLongClicked != null) {
                return ((Boolean) onLongClicked.invoke(polylineAnnotation)).booleanValue();
            }
            return false;
        }
    };
    private final OnPolylineAnnotationDragListener onDragListener = new OnPolylineAnnotationDragListener() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupInteractionsState$onDragListener$1
        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDrag(Annotation<?> annotation) {
            l onDragged;
            annotation.getClass();
            PolylineAnnotation polylineAnnotation = annotation instanceof PolylineAnnotation ? (PolylineAnnotation) annotation : null;
            if (polylineAnnotation == null || (onDragged = this.this$0.getOnDragged()) == null) {
                return;
            }
            onDragged.invoke(polylineAnnotation);
        }

        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDragFinished(Annotation<?> annotation) {
            l onDragFinished;
            annotation.getClass();
            PolylineAnnotation polylineAnnotation = annotation instanceof PolylineAnnotation ? (PolylineAnnotation) annotation : null;
            if (polylineAnnotation == null || (onDragFinished = this.this$0.getOnDragFinished()) == null) {
                return;
            }
            onDragFinished.invoke(polylineAnnotation);
        }

        @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
        public void onAnnotationDragStarted(Annotation<?> annotation) {
            l onDragStarted;
            annotation.getClass();
            PolylineAnnotation polylineAnnotation = annotation instanceof PolylineAnnotation ? (PolylineAnnotation) annotation : null;
            if (polylineAnnotation == null || (onDragStarted = this.this$0.getOnDragStarted()) == null) {
                return;
            }
            onDragStarted.invoke(polylineAnnotation);
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

    /* JADX INFO: renamed from: isDraggable$delegate, reason: from kotlin metadata */
    private final p1 isDraggable = p0.n(Boolean.FALSE);

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PolylineAnnotation, Boolean> getOnClicked() {
        return (l) this.onClicked.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PolylineAnnotation, Unit> getOnDragFinished() {
        return (l) this.onDragFinished.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PolylineAnnotation, Unit> getOnDragStarted() {
        return (l) this.onDragStarted.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PolylineAnnotation, Unit> getOnDragged() {
        return (l) this.onDragged.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<PolylineAnnotation, Boolean> getOnLongClicked() {
        return (l) this.onLongClicked.getF182175a();
    }

    private final void setOnClicked(l<? super PolylineAnnotation, Boolean> lVar) {
        this.onClicked.setValue(lVar);
    }

    private final void setOnDragFinished(l<? super PolylineAnnotation, Unit> lVar) {
        this.onDragFinished.setValue(lVar);
    }

    private final void setOnDragStarted(l<? super PolylineAnnotation, Unit> lVar) {
        this.onDragStarted.setValue(lVar);
    }

    private final void setOnDragged(l<? super PolylineAnnotation, Unit> lVar) {
        this.onDragged.setValue(lVar);
    }

    private final void setOnLongClicked(l<? super PolylineAnnotation, Boolean> lVar) {
        this.onLongClicked.setValue(lVar);
    }

    public final void BindTo$extension_compose_release(PolylineAnnotationManager polylineAnnotationManager, m mVar, int i14) {
        polylineAnnotationManager.getClass();
        o0 o0VarE = mVar.E(2011312824);
        x1 x1Var = n.f135158a;
        l0.a(getOnClicked(), new PolylineAnnotationGroupInteractionsState$BindTo$1(this, polylineAnnotationManager), o0VarE);
        l0.a(getOnLongClicked(), new PolylineAnnotationGroupInteractionsState$BindTo$2(this, polylineAnnotationManager), o0VarE);
        l0.c(getOnDragStarted(), getOnDragged(), getOnDragFinished(), new PolylineAnnotationGroupInteractionsState$BindTo$3(this, polylineAnnotationManager), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new PolylineAnnotationGroupInteractionsState$BindTo$4(this, polylineAnnotationManager, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDraggable() {
        return ((Boolean) this.isDraggable.getF182175a()).booleanValue();
    }

    public final PolylineAnnotationGroupInteractionsState onClicked(l<? super PolylineAnnotation, Boolean> onClick) {
        onClick.getClass();
        setOnClicked(onClick);
        return this;
    }

    public final PolylineAnnotationGroupInteractionsState onDragFinished(l<? super PolylineAnnotation, Unit> onDragFinish) {
        onDragFinish.getClass();
        setOnDragFinished(onDragFinish);
        return this;
    }

    public final PolylineAnnotationGroupInteractionsState onDragStarted(l<? super PolylineAnnotation, Unit> onDragStart) {
        onDragStart.getClass();
        setOnDragStarted(onDragStart);
        return this;
    }

    public final PolylineAnnotationGroupInteractionsState onDragged(l<? super PolylineAnnotation, Unit> onDrag) {
        onDrag.getClass();
        setOnDragged(onDrag);
        return this;
    }

    public final PolylineAnnotationGroupInteractionsState onLongClicked(l<? super PolylineAnnotation, Boolean> onLongClick) {
        onLongClick.getClass();
        setOnLongClicked(onLongClick);
        return this;
    }

    public final void setDraggable(boolean z14) {
        this.isDraggable.setValue(Boolean.valueOf(z14));
    }
}
