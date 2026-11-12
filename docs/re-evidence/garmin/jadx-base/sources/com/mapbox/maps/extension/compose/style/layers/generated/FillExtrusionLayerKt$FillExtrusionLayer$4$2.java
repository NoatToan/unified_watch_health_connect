package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class FillExtrusionLayerKt$FillExtrusionLayer$4$2 extends w implements p<LayerNode, String, Unit> {
    final /* synthetic */ String $layerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillExtrusionLayerKt$FillExtrusionLayer$4$2(String str) {
        super(2);
        this.$layerId = str;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayerNode layerNode, String str) {
        layerNode.getClass();
        str.getClass();
        layerNode.updateLayerId$extension_compose_release(this.$layerId);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(LayerNode layerNode, String str) {
        invoke2(layerNode, str);
        return Unit.INSTANCE;
    }
}
