package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.maps.LayerPosition;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleLayerPositionKt$StyleLayerPosition$1$1 extends w implements e23.a<StyleLayerPositionNode> {
    final /* synthetic */ LayerPosition $layerPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleLayerPositionKt$StyleLayerPosition$1$1(LayerPosition layerPosition) {
        super(0);
        this.$layerPosition = layerPosition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final StyleLayerPositionNode invoke() {
        return new StyleLayerPositionNode(this.$layerPosition);
    }
}
