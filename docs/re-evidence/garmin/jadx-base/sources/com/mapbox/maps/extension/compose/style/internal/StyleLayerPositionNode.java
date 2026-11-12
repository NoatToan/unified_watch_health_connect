package com.mapbox.maps.extension.compose.style.internal;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.extension.compose.internal.MapNode;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/StyleLayerPositionNode;", "Lcom/mapbox/maps/extension/compose/style/internal/StyleAwareNode;", "layerPosition", "Lcom/mapbox/maps/LayerPosition;", "(Lcom/mapbox/maps/LayerPosition;)V", "getLayerPosition$extension_compose_release", "()Lcom/mapbox/maps/LayerPosition;", "mapStyleNode", "Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "getMapStyleNode", "()Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "setMapStyleNode", "(Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;)V", "cleanUp", "", "onAttached", "parent", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "onClear", "onRemoved", "toString", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleLayerPositionNode extends StyleAwareNode {
    private final LayerPosition layerPosition;
    public MapStyleNode mapStyleNode;

    public StyleLayerPositionNode(LayerPosition layerPosition) {
        layerPosition.getClass();
        this.layerPosition = layerPosition;
    }

    private final void cleanUp() {
        Iterator<T> it = getChildren().iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onClear();
        }
    }

    /* JADX INFO: renamed from: getLayerPosition$extension_compose_release, reason: from getter */
    public final LayerPosition getLayerPosition() {
        return this.layerPosition;
    }

    @Override // com.mapbox.maps.extension.compose.style.internal.StyleAwareNode
    public MapStyleNode getMapStyleNode() {
        MapStyleNode mapStyleNode = this.mapStyleNode;
        if (mapStyleNode != null) {
            return mapStyleNode;
        }
        s.m("mapStyleNode");
        throw null;
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        setMapStyleNode((MapStyleNode) parent);
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        cleanUp();
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        cleanUp();
    }

    public void setMapStyleNode(MapStyleNode mapStyleNode) {
        mapStyleNode.getClass();
        this.mapStyleNode = mapStyleNode;
    }

    public String toString() {
        return "StyleLayerPositionNode(layerPosition=" + this.layerPosition + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
