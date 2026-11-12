package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolylineAnnotationGroupInteractionsState$BindTo$2 extends w implements l<i0, h0> {
    final /* synthetic */ PolylineAnnotationManager $annotationManager;
    final /* synthetic */ PolylineAnnotationGroupInteractionsState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotationGroupInteractionsState$BindTo$2(PolylineAnnotationGroupInteractionsState polylineAnnotationGroupInteractionsState, PolylineAnnotationManager polylineAnnotationManager) {
        super(1);
        this.this$0 = polylineAnnotationGroupInteractionsState;
        this.$annotationManager = polylineAnnotationManager;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        if (this.this$0.getOnLongClicked() != null) {
            this.$annotationManager.addLongClickListener(this.this$0.onLongClickedListener);
        }
        final PolylineAnnotationManager polylineAnnotationManager = this.$annotationManager;
        final PolylineAnnotationGroupInteractionsState polylineAnnotationGroupInteractionsState = this.this$0;
        return new h0() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PolylineAnnotationGroupInteractionsState$BindTo$2$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                polylineAnnotationManager.removeLongClickListener(polylineAnnotationGroupInteractionsState.onLongClickedListener);
            }
        };
    }
}
