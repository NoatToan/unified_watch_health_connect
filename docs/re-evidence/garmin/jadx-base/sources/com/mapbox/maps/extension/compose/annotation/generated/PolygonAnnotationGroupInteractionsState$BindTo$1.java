package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationGroupInteractionsState$BindTo$1 extends w implements l<i0, h0> {
    final /* synthetic */ PolygonAnnotationManager $annotationManager;
    final /* synthetic */ PolygonAnnotationGroupInteractionsState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonAnnotationGroupInteractionsState$BindTo$1(PolygonAnnotationGroupInteractionsState polygonAnnotationGroupInteractionsState, PolygonAnnotationManager polygonAnnotationManager) {
        super(1);
        this.this$0 = polygonAnnotationGroupInteractionsState;
        this.$annotationManager = polygonAnnotationManager;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        if (this.this$0.getOnClicked() != null) {
            this.$annotationManager.addClickListener(this.this$0.onClickedListener);
        }
        final PolygonAnnotationManager polygonAnnotationManager = this.$annotationManager;
        final PolygonAnnotationGroupInteractionsState polygonAnnotationGroupInteractionsState = this.this$0;
        return new h0() { // from class: com.mapbox.maps.extension.compose.annotation.generated.PolygonAnnotationGroupInteractionsState$BindTo$1$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                polygonAnnotationManager.removeClickListener(polygonAnnotationGroupInteractionsState.onClickedListener);
            }
        };
    }
}
