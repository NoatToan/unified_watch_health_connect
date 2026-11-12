package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R(\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/MapboxMapNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "controller", "Lcom/mapbox/maps/MapView;", "initialClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "initialLongClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "(Lcom/mapbox/maps/MapView;Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;)V", "value", "clickListener", "getClickListener", "()Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "setClickListener", "(Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;)V", "getController", "()Lcom/mapbox/maps/MapView;", "longClickListener", "getLongClickListener", "()Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "setLongClickListener", "(Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;)V", "cleanUp", "", "onAttached", "parent", "onClear", "onRemoved", "toString", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class MapboxMapNode extends MapNode {
    private OnMapClickListener clickListener;
    private final MapView controller;
    private OnMapLongClickListener longClickListener;

    public MapboxMapNode(MapView mapView, OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener) {
        mapView.getClass();
        this.controller = mapView;
        this.clickListener = onMapClickListener;
        this.longClickListener = onMapLongClickListener;
    }

    private final void cleanUp() {
        GesturesPlugin gestures = GesturesUtils.getGestures(this.controller);
        OnMapClickListener onMapClickListener = this.clickListener;
        if (onMapClickListener != null) {
            gestures.removeOnMapClickListener(onMapClickListener);
        }
        OnMapLongClickListener onMapLongClickListener = this.longClickListener;
        if (onMapLongClickListener != null) {
            gestures.removeOnMapLongClickListener(onMapLongClickListener);
        }
    }

    public final OnMapClickListener getClickListener() {
        return this.clickListener;
    }

    public final MapView getController() {
        return this.controller;
    }

    public final OnMapLongClickListener getLongClickListener() {
        return this.longClickListener;
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        GesturesPlugin gestures = GesturesUtils.getGestures(this.controller);
        OnMapClickListener onMapClickListener = this.clickListener;
        if (onMapClickListener != null) {
            gestures.addOnMapClickListener(onMapClickListener);
        }
        OnMapLongClickListener onMapLongClickListener = this.longClickListener;
        if (onMapLongClickListener != null) {
            gestures.addOnMapLongClickListener(onMapLongClickListener);
        }
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

    public final void setClickListener(OnMapClickListener onMapClickListener) {
        GesturesPlugin gestures = GesturesUtils.getGestures(this.controller);
        OnMapClickListener onMapClickListener2 = this.clickListener;
        if (onMapClickListener2 != null) {
            gestures.removeOnMapClickListener(onMapClickListener2);
        }
        if (onMapClickListener != null) {
            gestures.addOnMapClickListener(onMapClickListener);
        }
        this.clickListener = onMapClickListener;
    }

    public final void setLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        GesturesPlugin gestures = GesturesUtils.getGestures(this.controller);
        OnMapLongClickListener onMapLongClickListener2 = this.longClickListener;
        if (onMapLongClickListener2 != null) {
            gestures.removeOnMapLongClickListener(onMapLongClickListener2);
        }
        if (onMapLongClickListener != null) {
            gestures.addOnMapLongClickListener(onMapLongClickListener);
        }
        this.longClickListener = onMapLongClickListener;
    }

    public String toString() {
        return "MapboxMapNode()";
    }
}
