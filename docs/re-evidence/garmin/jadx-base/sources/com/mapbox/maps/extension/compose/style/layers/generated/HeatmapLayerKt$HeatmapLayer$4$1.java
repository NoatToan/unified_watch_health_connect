package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.extension.compose.style.sources.SourceState;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class HeatmapLayerKt$HeatmapLayer$4$1 extends w implements p<LayerNode, SourceState, Unit> {
    final /* synthetic */ SourceState $sourceState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeatmapLayerKt$HeatmapLayer$4$1(SourceState sourceState) {
        super(2);
        this.$sourceState = sourceState;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayerNode layerNode, SourceState sourceState) {
        layerNode.getClass();
        sourceState.getClass();
        layerNode.updateSource$extension_compose_release(this.$sourceState);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(LayerNode layerNode, SourceState sourceState) {
        invoke2(layerNode, sourceState);
        return Unit.INSTANCE;
    }
}
