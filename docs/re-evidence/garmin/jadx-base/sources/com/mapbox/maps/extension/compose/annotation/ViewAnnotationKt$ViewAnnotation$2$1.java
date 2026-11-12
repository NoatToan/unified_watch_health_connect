package com.mapbox.maps.extension.compose.annotation;

import com.mapbox.maps.ViewAnnotationOptions;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt$ViewAnnotation$2$1 extends w implements p<ViewAnnotationNode, ViewAnnotationOptions, Unit> {
    final /* synthetic */ ViewAnnotationOptions $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAnnotationKt$ViewAnnotation$2$1(ViewAnnotationOptions viewAnnotationOptions) {
        super(2);
        this.$options = viewAnnotationOptions;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewAnnotationNode viewAnnotationNode, ViewAnnotationOptions viewAnnotationOptions) {
        viewAnnotationNode.getClass();
        viewAnnotationOptions.getClass();
        viewAnnotationNode.getViewAnnotationManager().updateViewAnnotation(viewAnnotationNode.getView(), this.$options);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(ViewAnnotationNode viewAnnotationNode, ViewAnnotationOptions viewAnnotationOptions) {
        invoke2(viewAnnotationNode, viewAnnotationOptions);
        return Unit.INSTANCE;
    }
}
