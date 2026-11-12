package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapNodeKt$MapboxMapComposeNode$2$2 extends w implements p<MapboxMapNode, OnMapLongClickListener, Unit> {
    public static final MapboxMapNodeKt$MapboxMapComposeNode$2$2 INSTANCE = new MapboxMapNodeKt$MapboxMapComposeNode$2$2();

    public MapboxMapNodeKt$MapboxMapComposeNode$2$2() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapboxMapNode mapboxMapNode, OnMapLongClickListener onMapLongClickListener) {
        invoke2(mapboxMapNode, onMapLongClickListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapboxMapNode mapboxMapNode, OnMapLongClickListener onMapLongClickListener) {
        mapboxMapNode.getClass();
        mapboxMapNode.setLongClickListener(onMapLongClickListener);
    }
}
