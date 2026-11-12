package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapNodeKt$MapboxMapComposeNode$2$1 extends w implements p<MapboxMapNode, OnMapClickListener, Unit> {
    public static final MapboxMapNodeKt$MapboxMapComposeNode$2$1 INSTANCE = new MapboxMapNodeKt$MapboxMapComposeNode$2$1();

    public MapboxMapNodeKt$MapboxMapComposeNode$2$1() {
        super(2);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(MapboxMapNode mapboxMapNode, OnMapClickListener onMapClickListener) {
        invoke2(mapboxMapNode, onMapClickListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapboxMapNode mapboxMapNode, OnMapClickListener onMapClickListener) {
        mapboxMapNode.getClass();
        mapboxMapNode.setClickListener(onMapClickListener);
    }
}
