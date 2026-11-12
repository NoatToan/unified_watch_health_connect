package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class CircleAnnotationInteractionsState$BindTo$3 extends w implements l<i0, h0> {
    final /* synthetic */ CircleAnnotationManager $annotationManager;
    final /* synthetic */ CircleAnnotationInteractionsState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleAnnotationInteractionsState$BindTo$3(CircleAnnotationInteractionsState circleAnnotationInteractionsState, CircleAnnotationManager circleAnnotationManager) {
        super(1);
        this.this$0 = circleAnnotationInteractionsState;
        this.$annotationManager = circleAnnotationManager;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        if (this.this$0.getOnDragStarted() != null || this.this$0.getOnDragged() != null || this.this$0.getOnDragFinished() != null) {
            this.$annotationManager.addDragListener(this.this$0.onDragListener);
        }
        final CircleAnnotationManager circleAnnotationManager = this.$annotationManager;
        final CircleAnnotationInteractionsState circleAnnotationInteractionsState = this.this$0;
        return new h0() { // from class: com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotationInteractionsState$BindTo$3$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                circleAnnotationManager.removeDragListener(circleAnnotationInteractionsState.onDragListener);
            }
        };
    }
}
