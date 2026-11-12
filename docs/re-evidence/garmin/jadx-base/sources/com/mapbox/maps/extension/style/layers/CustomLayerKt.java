package com.mapbox.maps.extension.style.layers;

import com.mapbox.maps.CustomLayerHost;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "layerId", "Lcom/mapbox/maps/CustomLayerHost;", "host", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/layers/CustomLayerDsl;", "", "block", "Lcom/mapbox/maps/extension/style/layers/CustomLayer;", "customLayer", "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Le23/l;)Lcom/mapbox/maps/extension/style/layers/CustomLayer;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CustomLayerKt {
    public static final CustomLayer customLayer(String str, CustomLayerHost customLayerHost, l<? super CustomLayerDsl, Unit> lVar) {
        str.getClass();
        customLayerHost.getClass();
        if (lVar == null) {
            return new CustomLayer(str, customLayerHost);
        }
        CustomLayer customLayer = new CustomLayer(str, customLayerHost);
        lVar.invoke(customLayer);
        return customLayer;
    }

    public static /* synthetic */ CustomLayer customLayer$default(String str, CustomLayerHost customLayerHost, l lVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            lVar = null;
        }
        return customLayer(str, customLayerHost, lVar);
    }

    public static final CustomLayer customLayer(String str, CustomLayerHost customLayerHost) {
        str.getClass();
        customLayerHost.getClass();
        return customLayer$default(str, customLayerHost, null, 4, null);
    }
}
