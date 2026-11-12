package com.mapbox.maps.extension.style.layers;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/CustomLayerDsl;", "", "maxZoom", "Lcom/mapbox/maps/extension/style/layers/CustomLayer;", "", "minZoom", "slot", "", "visibility", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CustomLayerDsl {
    CustomLayer maxZoom(double maxZoom);

    CustomLayer minZoom(double minZoom);

    CustomLayer slot(String slot);

    CustomLayer visibility(Expression visibility);

    CustomLayer visibility(Visibility visibility);
}
