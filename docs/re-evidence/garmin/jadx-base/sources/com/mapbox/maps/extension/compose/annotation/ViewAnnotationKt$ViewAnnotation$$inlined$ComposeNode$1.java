package com.mapbox.maps.extension.compose.annotation;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt$ViewAnnotation$$inlined$ComposeNode$1 extends w implements a<ViewAnnotationNode> {
    final /* synthetic */ a $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAnnotationKt$ViewAnnotation$$inlined$ComposeNode$1(a aVar) {
        super(0);
        this.$factory = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.maps.extension.compose.annotation.ViewAnnotationNode, java.lang.Object] */
    @Override // e23.a
    public final ViewAnnotationNode invoke() {
        return this.$factory.invoke();
    }
}
