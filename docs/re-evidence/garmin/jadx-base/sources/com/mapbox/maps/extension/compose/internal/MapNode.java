package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/MapNode;", "", "()V", MapboxMap.QFE_CHILDREN, "", "getChildren", "()Ljava/util/List;", "onAttached", "", "parent", "onClear", "onMoved", "onRemoved", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class MapNode {
    private final List<MapNode> children = new ArrayList();

    public final List<MapNode> getChildren() {
        return this.children;
    }

    public void onAttached(MapNode parent) {
        parent.getClass();
    }

    public void onClear() {
    }

    public void onMoved(MapNode parent) {
        parent.getClass();
    }

    public void onRemoved(MapNode parent) {
        parent.getClass();
    }
}
