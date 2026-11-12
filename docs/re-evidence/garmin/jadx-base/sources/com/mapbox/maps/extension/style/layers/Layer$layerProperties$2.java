package com.mapbox.maps.extension.style.layers;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import e23.a;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class Layer$layerProperties$2 extends w implements a<HashMap<String, PropertyValue<?>>> {
    final /* synthetic */ Layer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Layer$layerProperties$2(Layer layer) {
        super(0);
        this.this$0 = layer;
    }

    @Override // e23.a
    public final HashMap<String, PropertyValue<?>> invoke() {
        HashMap<String, PropertyValue<?>> map = new HashMap<>();
        Layer layer = this.this$0;
        map.put(TtmlNode.ATTR_ID, new PropertyValue<>(TtmlNode.ATTR_ID, layer.getLayerId()));
        map.put(NotificationConstants.KEY_DATA_MIME_TYPE, new PropertyValue<>(NotificationConstants.KEY_DATA_MIME_TYPE, layer.getType$extension_style_release()));
        String internalSourceId = layer.getInternalSourceId();
        if (internalSourceId != null) {
            map.put("source", new PropertyValue<>("source", internalSourceId));
        }
        return map;
    }
}
