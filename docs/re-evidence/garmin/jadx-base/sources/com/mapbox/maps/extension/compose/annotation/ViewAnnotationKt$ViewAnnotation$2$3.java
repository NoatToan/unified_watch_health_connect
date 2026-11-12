package com.mapbox.maps.extension.compose.annotation;

import com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt$ViewAnnotation$2$3 extends w implements p<ViewAnnotationNode, OnViewAnnotationUpdatedListener, Unit> {
    public static final ViewAnnotationKt$ViewAnnotation$2$3 INSTANCE = new ViewAnnotationKt$ViewAnnotation$2$3();

    public ViewAnnotationKt$ViewAnnotation$2$3() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(ViewAnnotationNode viewAnnotationNode, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        invoke2(viewAnnotationNode, onViewAnnotationUpdatedListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewAnnotationNode viewAnnotationNode, OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        viewAnnotationNode.getClass();
        viewAnnotationNode.updateAndSubscribe$extension_compose_release(onViewAnnotationUpdatedListener);
    }
}
