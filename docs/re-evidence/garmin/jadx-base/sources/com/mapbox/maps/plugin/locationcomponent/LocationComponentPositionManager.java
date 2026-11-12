package com.mapbox.maps.plugin.locationcomponent;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "layerAbove", "", "layerBelow", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Ljava/lang/String;)V", "getLayerAbove$plugin_locationcomponent_release", "()Ljava/lang/String;", "setLayerAbove$plugin_locationcomponent_release", "(Ljava/lang/String;)V", "getLayerBelow$plugin_locationcomponent_release", "setLayerBelow$plugin_locationcomponent_release", "addLayerToMap", "", "layer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerWrapper;", "update", "", "updateStyle", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentPositionManager {
    private String layerAbove;
    private String layerBelow;
    private MapboxStyleManager style;

    public LocationComponentPositionManager(MapboxStyleManager mapboxStyleManager, String str, String str2) {
        mapboxStyleManager.getClass();
        this.style = mapboxStyleManager;
        this.layerAbove = str;
        this.layerBelow = str2;
    }

    public final void addLayerToMap(LocationLayerWrapper layer) {
        layer.getClass();
        if (this.layerAbove != null) {
            layer.bindTo(this.style, new LayerPosition(this.layerAbove, null, null));
            return;
        }
        String str = this.layerBelow;
        MapboxStyleManager mapboxStyleManager = this.style;
        if (str != null) {
            layer.bindTo(mapboxStyleManager, new LayerPosition(null, this.layerBelow, null));
        } else {
            layer.bindTo(mapboxStyleManager, null);
        }
    }

    /* JADX INFO: renamed from: getLayerAbove$plugin_locationcomponent_release, reason: from getter */
    public final String getLayerAbove() {
        return this.layerAbove;
    }

    /* JADX INFO: renamed from: getLayerBelow$plugin_locationcomponent_release, reason: from getter */
    public final String getLayerBelow() {
        return this.layerBelow;
    }

    public final void setLayerAbove$plugin_locationcomponent_release(String str) {
        this.layerAbove = str;
    }

    public final void setLayerBelow$plugin_locationcomponent_release(String str) {
        this.layerBelow = str;
    }

    public final boolean update(String layerAbove, String layerBelow) {
        String str;
        String str2;
        boolean z14 = (!s.g(this.layerAbove, layerAbove) && ((str2 = this.layerAbove) == null || !s.g(str2, layerAbove))) || (!s.g(this.layerBelow, layerBelow) && ((str = this.layerBelow) == null || !s.g(str, layerBelow)));
        this.layerAbove = layerAbove;
        this.layerBelow = layerBelow;
        return z14;
    }

    public final void updateStyle(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
    }
}
