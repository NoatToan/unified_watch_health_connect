package com.mapbox.maps.extension.compose.internal;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapNodeKt$MapboxMapComposeNode$$inlined$ComposeNode$1 extends w implements a<MapboxMapNode> {
    final /* synthetic */ a $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapNodeKt$MapboxMapComposeNode$$inlined$ComposeNode$1(a aVar) {
        super(0);
        this.$factory = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.maps.extension.compose.internal.MapboxMapNode, java.lang.Object] */
    @Override // e23.a
    public final MapboxMapNode invoke() {
        return this.$factory.invoke();
    }
}
