package com.mapbox.maps.extension.compose.annotation;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt$ViewAnnotation$2$2 extends w implements p<ViewAnnotationNode, p<? super m, ? super Integer, ? extends Unit>, Unit> {
    public static final ViewAnnotationKt$ViewAnnotation$2$2 INSTANCE = new ViewAnnotationKt$ViewAnnotation$2$2();

    public ViewAnnotationKt$ViewAnnotation$2$2() {
        super(2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewAnnotationNode viewAnnotationNode, p<? super m, ? super Integer, Unit> pVar) {
        viewAnnotationNode.getClass();
        pVar.getClass();
        throw new IllegalStateException("Mutating content during composition is not allowed.");
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(ViewAnnotationNode viewAnnotationNode, p<? super m, ? super Integer, ? extends Unit> pVar) {
        invoke2(viewAnnotationNode, (p<? super m, ? super Integer, Unit>) pVar);
        return Unit.INSTANCE;
    }
}
