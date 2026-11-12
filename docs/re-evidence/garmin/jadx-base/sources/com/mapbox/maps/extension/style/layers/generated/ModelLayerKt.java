package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "layerId", "sourceId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/layers/generated/ModelLayerDsl;", "", "block", "Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelLayer", "(Ljava/lang/String;Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ModelLayerKt {
    @MapboxExperimental
    public static final ModelLayer modelLayer(String str, String str2, l<? super ModelLayerDsl, Unit> lVar) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        ModelLayer modelLayer = new ModelLayer(str, str2);
        lVar.invoke(modelLayer);
        return modelLayer;
    }
}
