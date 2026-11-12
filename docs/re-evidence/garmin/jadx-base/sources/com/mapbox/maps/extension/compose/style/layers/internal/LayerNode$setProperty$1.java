package com.mapbox.maps.extension.compose.style.layers.internal;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LayerNode$setProperty$1 extends w implements l<MapboxStyleManager, Unit> {
    final /* synthetic */ String $name;
    final /* synthetic */ Value $value;
    final /* synthetic */ LayerNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerNode$setProperty$1(LayerNode layerNode, String str, Value value) {
        super(1);
        this.this$0 = layerNode;
        this.$name = str;
        this.$value = value;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        this.this$0.parameters.put(this.$name, this.$value);
        String error = mapboxStyleManager.setStyleLayerProperty(this.this$0.layerId, this.$name, this.$value).getError();
        if (error != null) {
            String str = this.$name;
            Value value = this.$value;
            LayerNode layerNode = this.this$0;
            MapboxLogger.logW("LayerNode", "Failed to set " + str + " property as " + value + " on " + layerNode.layerType + " layer " + layerNode.layerId + ": " + error);
        }
        MapboxLogger.logD("LayerNode", "[" + this.this$0.layerType + "] setProperty: property=" + this.$name + ", value=" + this.$value + " executed");
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
        invoke2(mapboxStyleManager);
        return Unit.INSTANCE;
    }
}
