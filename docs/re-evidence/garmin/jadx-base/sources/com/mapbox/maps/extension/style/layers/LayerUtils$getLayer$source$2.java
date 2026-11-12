package com.mapbox.maps.extension.style.layers;

import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LayerUtils$getLayer$source$2 extends w implements a<String> {
    final /* synthetic */ String $layerId;
    final /* synthetic */ MapboxStyleManager $this_getLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerUtils$getLayer$source$2(MapboxStyleManager mapboxStyleManager, String str) {
        super(0);
        this.$this_getLayer = mapboxStyleManager;
        this.$layerId = str;
    }

    @Override // e23.a
    public final String invoke() {
        return (String) TypeUtilsKt.unwrap(this.$this_getLayer.getStyleLayerProperty(this.$layerId, "source"), String.class);
    }
}
