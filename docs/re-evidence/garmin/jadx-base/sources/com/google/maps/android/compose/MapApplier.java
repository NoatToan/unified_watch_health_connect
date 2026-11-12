package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/maps/android/compose/MapApplier;", "Lp3/a;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/maps/android/compose/MapClickListeners;", "mapClickListeners", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/MapClickListeners;)V", "", "onClear", "()V", "", FirebaseAnalytics.Param.INDEX, "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", Constants.MessagePayloadKeys.FROM, "to", "count", "move", "(III)V", "remove", "(II)V", "attachClickListeners$maps_compose_release", "attachClickListeners", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "Lcom/google/android/gms/maps/MapView;", "getMapView$maps_compose_release", "()Lcom/google/android/gms/maps/MapView;", "Lcom/google/maps/android/compose/MapClickListeners;", "getMapClickListeners", "()Lcom/google/maps/android/compose/MapClickListeners;", "", "decorations", "Ljava/util/List;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapApplier extends p3.a<MapNode> {
    public static final int $stable = 8;
    private final List<MapNode> decorations;
    private final GoogleMap map;
    private final MapClickListeners mapClickListeners;
    private final MapView mapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(GoogleMap googleMap, MapView mapView, MapClickListeners mapClickListeners) {
        super(MapNodeRoot.INSTANCE);
        googleMap.getClass();
        mapView.getClass();
        mapClickListeners.getClass();
        this.map = googleMap;
        this.mapView = mapView;
        this.mapClickListeners = mapClickListeners;
        this.decorations = new ArrayList();
        attachClickListeners$maps_compose_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$13(MapApplier mapApplier, Polygon polygon) {
        polygon.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof PolygonNode) {
                PolygonNode polygonNode = (PolygonNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(polygonNode.getPolygon(), polygon)) {
                    e23.l<Polygon, Unit> onPolygonClick = polygonNode.getOnPolygonClick();
                    if (onPolygonClick != null ? p005kotlin.jvm.internal.s.g(onPolygonClick.invoke(polygon), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Polygon, Unit> onPolygonClick2 = ((InputHandlerNode) mapNode).getOnPolygonClick();
                if (onPolygonClick2 != null ? p005kotlin.jvm.internal.s.g(onPolygonClick2.invoke(polygon), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$17(MapApplier mapApplier, Polyline polyline) {
        polyline.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof PolylineNode) {
                PolylineNode polylineNode = (PolylineNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(polylineNode.getPolyline(), polyline)) {
                    e23.l<Polyline, Unit> onPolylineClick = polylineNode.getOnPolylineClick();
                    if (onPolylineClick != null ? p005kotlin.jvm.internal.s.g(onPolylineClick.invoke(polyline), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Polyline, Unit> onPolylineClick2 = ((InputHandlerNode) mapNode).getOnPolylineClick();
                if (onPolylineClick2 != null ? p005kotlin.jvm.internal.s.g(onPolylineClick2.invoke(polyline), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachClickListeners$lambda$21(MapApplier mapApplier, Marker marker) {
        marker.getClass();
        Iterator<T> it = mapApplier.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            MapNode mapNode = (MapNode) it.next();
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                    e23.l<Marker, Boolean> onMarkerClick = markerNode.getOnMarkerClick();
                    if (onMarkerClick != null ? p005kotlin.jvm.internal.s.g(onMarkerClick.invoke(marker), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Marker, Boolean> onMarkerClick2 = ((InputHandlerNode) mapNode).getOnMarkerClick();
                if (onMarkerClick2 != null ? p005kotlin.jvm.internal.s.g(onMarkerClick2.invoke(marker), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$25(MapApplier mapApplier, Marker marker) {
        marker.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                    e23.l<Marker, Unit> onInfoWindowClick = markerNode.getOnInfoWindowClick();
                    if (onInfoWindowClick != null ? p005kotlin.jvm.internal.s.g(onInfoWindowClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Marker, Unit> onInfoWindowClick2 = ((InputHandlerNode) mapNode).getOnInfoWindowClick();
                if (onInfoWindowClick2 != null ? p005kotlin.jvm.internal.s.g(onInfoWindowClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$29(MapApplier mapApplier, Marker marker) {
        marker.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                    e23.l<Marker, Unit> onInfoWindowClose = markerNode.getOnInfoWindowClose();
                    if (onInfoWindowClose != null ? p005kotlin.jvm.internal.s.g(onInfoWindowClose.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Marker, Unit> onInfoWindowClose2 = ((InputHandlerNode) mapNode).getOnInfoWindowClose();
                if (onInfoWindowClose2 != null ? p005kotlin.jvm.internal.s.g(onInfoWindowClose2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$33(MapApplier mapApplier, Marker marker) {
        marker.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                    e23.l<Marker, Unit> onInfoWindowLongClick = markerNode.getOnInfoWindowLongClick();
                    if (onInfoWindowLongClick != null ? p005kotlin.jvm.internal.s.g(onInfoWindowLongClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Marker, Unit> onInfoWindowLongClick2 = ((InputHandlerNode) mapNode).getOnInfoWindowLongClick();
                if (onInfoWindowLongClick2 != null ? p005kotlin.jvm.internal.s.g(onInfoWindowLongClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerNode attachClickListeners$lambda$35(MapApplier mapApplier, Marker marker) {
        Object next;
        marker.getClass();
        Iterator<T> it = mapApplier.decorations.iterator();
        while (it.hasNext()) {
            next = it.next();
            MapNode mapNode = (MapNode) next;
            if ((mapNode instanceof MarkerNode) && p005kotlin.jvm.internal.s.g(((MarkerNode) mapNode).getMarker(), marker)) {
                return (MarkerNode) next;
            }
        }
        next = null;
        return (MarkerNode) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$5(MapApplier mapApplier, Circle circle) {
        circle.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof CircleNode) {
                CircleNode circleNode = (CircleNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(circleNode.getCircle(), circle)) {
                    e23.l<Circle, Unit> onCircleClick = circleNode.getOnCircleClick();
                    if (onCircleClick != null ? p005kotlin.jvm.internal.s.g(onCircleClick.invoke(circle), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<Circle, Unit> onCircleClick2 = ((InputHandlerNode) mapNode).getOnCircleClick();
                if (onCircleClick2 != null ? p005kotlin.jvm.internal.s.g(onCircleClick2.invoke(circle), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$9(MapApplier mapApplier, GroundOverlay groundOverlay) {
        groundOverlay.getClass();
        for (MapNode mapNode : mapApplier.decorations) {
            if (mapNode instanceof GroundOverlayNode) {
                GroundOverlayNode groundOverlayNode = (GroundOverlayNode) mapNode;
                if (p005kotlin.jvm.internal.s.g(groundOverlayNode.getGroundOverlay(), groundOverlay)) {
                    e23.l<GroundOverlay, Unit> onGroundOverlayClick = groundOverlayNode.getOnGroundOverlayClick();
                    if (onGroundOverlayClick != null ? p005kotlin.jvm.internal.s.g(onGroundOverlayClick.invoke(groundOverlay), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                e23.l<GroundOverlay, Unit> onGroundOverlayClick2 = ((InputHandlerNode) mapNode).getOnGroundOverlayClick();
                if (onGroundOverlayClick2 != null ? p005kotlin.jvm.internal.s.g(onGroundOverlayClick2.invoke(groundOverlay), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void apply(e23.p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    public final void attachClickListeners$maps_compose_release() {
        this.map.setOnCircleClickListener(new k(this));
        this.map.setOnGroundOverlayClickListener(new k(this));
        this.map.setOnPolygonClickListener(new k(this));
        this.map.setOnPolylineClickListener(new k(this));
        this.map.setOnMarkerClickListener(new k(this));
        this.map.setOnInfoWindowClickListener(new k(this));
        this.map.setOnInfoWindowCloseListener(new k(this));
        this.map.setOnInfoWindowLongClickListener(new k(this));
        this.map.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9
            private static final Unit onMarkerDrag$lambda$6$lambda$5(MarkerNode markerNode, Marker marker) {
                marker.getClass();
                LatLng position = marker.getPosition();
                position.getClass();
                markerNode.getMarkerState().setDragging$maps_compose_release(true);
                markerNode.getMarkerState().setPosition(position);
                markerNode.getMarkerState().setDragState$maps_compose_release(DragState.DRAG);
                return Unit.INSTANCE;
            }

            private static final Unit onMarkerDragEnd$lambda$10$lambda$9(MarkerNode markerNode, Marker marker) {
                marker.getClass();
                LatLng position = marker.getPosition();
                position.getClass();
                markerNode.getMarkerState().setDragging$maps_compose_release(true);
                markerNode.getMarkerState().setPosition(position);
                markerNode.getMarkerState().setDragging$maps_compose_release(false);
                markerNode.getMarkerState().setDragState$maps_compose_release(DragState.END);
                return Unit.INSTANCE;
            }

            private static final Unit onMarkerDragStart$lambda$2$lambda$1(MarkerNode markerNode, Marker marker) {
                marker.getClass();
                LatLng position = marker.getPosition();
                position.getClass();
                markerNode.getMarkerState().setDragging$maps_compose_release(true);
                markerNode.getMarkerState().setPosition(position);
                markerNode.getMarkerState().setDragState$maps_compose_release(DragState.START);
                return Unit.INSTANCE;
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDrag(Marker marker) {
                marker.getClass();
                for (MapNode mapNode : this.this$0.decorations) {
                    if (mapNode instanceof MarkerNode) {
                        MarkerNode markerNode = (MarkerNode) mapNode;
                        if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                            if (p005kotlin.jvm.internal.s.g(onMarkerDrag$lambda$6$lambda$5(markerNode, marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapNode instanceof InputHandlerNode) {
                        e23.l<Marker, Unit> onMarkerDrag = ((InputHandlerNode) mapNode).getOnMarkerDrag();
                        if (onMarkerDrag != null ? p005kotlin.jvm.internal.s.g(onMarkerDrag.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragEnd(Marker marker) {
                marker.getClass();
                for (MapNode mapNode : this.this$0.decorations) {
                    if (mapNode instanceof MarkerNode) {
                        MarkerNode markerNode = (MarkerNode) mapNode;
                        if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                            if (p005kotlin.jvm.internal.s.g(onMarkerDragEnd$lambda$10$lambda$9(markerNode, marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapNode instanceof InputHandlerNode) {
                        e23.l<Marker, Unit> onMarkerDragEnd = ((InputHandlerNode) mapNode).getOnMarkerDragEnd();
                        if (onMarkerDragEnd != null ? p005kotlin.jvm.internal.s.g(onMarkerDragEnd.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragStart(Marker marker) {
                marker.getClass();
                for (MapNode mapNode : this.this$0.decorations) {
                    if (mapNode instanceof MarkerNode) {
                        MarkerNode markerNode = (MarkerNode) mapNode;
                        if (p005kotlin.jvm.internal.s.g(markerNode.getMarker(), marker)) {
                            if (p005kotlin.jvm.internal.s.g(onMarkerDragStart$lambda$2$lambda$1(markerNode, marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapNode instanceof InputHandlerNode) {
                        e23.l<Marker, Unit> onMarkerDragStart = ((InputHandlerNode) mapNode).getOnMarkerDragStart();
                        if (onMarkerDragStart != null ? p005kotlin.jvm.internal.s.g(onMarkerDragStart.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        });
        this.map.setInfoWindowAdapter(new ComposeInfoWindowAdapter(this.mapView, new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 4)));
    }

    public final GoogleMap getMap() {
        return this.map;
    }

    public final MapClickListeners getMapClickListeners() {
        return this.mapClickListeners;
    }

    /* JADX INFO: renamed from: getMapView$maps_compose_release, reason: from getter */
    public final MapView getMapView() {
        return this.mapView;
    }

    @Override // p3.c
    public void insertBottomUp(int index, MapNode instance) {
        instance.getClass();
        this.decorations.add(index, instance);
        instance.onAttached();
    }

    @Override // p3.c
    public void move(int from, int to3, int count) {
        move(this.decorations, from, to3, count);
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onBeginChanges() {
    }

    @Override // p3.a
    public void onClear() {
        this.map.clear();
        Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onCleared();
        }
        this.decorations.clear();
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onEndChanges() {
    }

    @Override // p3.c
    public void remove(int index, int count) {
        int i14 = 0;
        while (true) {
            List<MapNode> list = this.decorations;
            if (i14 >= count) {
                remove(list, index, count);
                return;
            } else {
                list.get(index + i14).onRemoved();
                i14++;
            }
        }
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Override // p3.c
    public void insertTopDown(int index, MapNode instance) {
        instance.getClass();
    }
}
