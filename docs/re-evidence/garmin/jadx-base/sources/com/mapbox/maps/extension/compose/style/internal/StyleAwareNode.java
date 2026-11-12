package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.maps.extension.compose.internal.MapNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/StyleAwareNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "()V", "mapStyleNode", "Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "getMapStyleNode", "()Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class StyleAwareNode extends MapNode {
    public abstract MapStyleNode getMapStyleNode();
}
