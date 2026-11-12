package com.google.maps.android.compose;

import c2.h2;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Lg6/c;", "density", "Lg6/o;", "layoutDirection", "Lc2/h2;", "contentPadding", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Lg6/c;Lg6/o;Lc2/h2;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "Lg6/c;", "getDensity", "()Lg6/c;", "setDensity", "(Lg6/c;)V", "Lg6/o;", "getLayoutDirection", "()Lg6/o;", "setLayoutDirection", "(Lg6/o;)V", "value", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Lcom/google/maps/android/compose/CameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/CameraPositionState;", "setCameraPositionState", "(Lcom/google/maps/android/compose/CameraPositionState;)V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapPropertiesNode implements MapNode {
    public static final int $stable = 8;
    private CameraPositionState cameraPositionState;
    private String contentDescription;
    private g6.c density;
    private g6.o layoutDirection;
    private final GoogleMap map;

    public MapPropertiesNode(GoogleMap googleMap, CameraPositionState cameraPositionState, String str, g6.c cVar, g6.o oVar, h2 h2Var) {
        googleMap.getClass();
        cameraPositionState.getClass();
        cVar.getClass();
        oVar.getClass();
        h2Var.getClass();
        this.map = googleMap;
        this.density = cVar;
        this.layoutDirection = oVar;
        MapUpdaterKt.applyContentPadding(this, googleMap, h2Var);
        cameraPositionState.setMap$maps_compose_release(googleMap);
        if (str != null) {
            googleMap.setContentDescription(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = cameraPositionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
        mapPropertiesNode.cameraPositionState.setRawPosition$maps_compose_release(mapPropertiesNode.map.getCameraPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(MapPropertiesNode mapPropertiesNode, int i14) {
        mapPropertiesNode.cameraPositionState.setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason.INSTANCE.fromInt(i14));
        mapPropertiesNode.cameraPositionState.setMoving$maps_compose_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(MapPropertiesNode mapPropertiesNode) {
        mapPropertiesNode.cameraPositionState.setRawPosition$maps_compose_release(mapPropertiesNode.map.getCameraPosition());
    }

    public final CameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final g6.c getDensity() {
        return this.density;
    }

    public final g6.o getLayoutDirection() {
        return this.layoutDirection;
    }

    public final GoogleMap getMap() {
        return this.map;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        this.map.setOnCameraIdleListener(new v(this, 0));
        this.map.setOnCameraMoveCanceledListener(new w(this));
        this.map.setOnCameraMoveStartedListener(new w(this));
        this.map.setOnCameraMoveListener(new w(this));
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    public final void setCameraPositionState(CameraPositionState cameraPositionState) {
        cameraPositionState.getClass();
        if (cameraPositionState.equals(this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.setMap$maps_compose_release(null);
        this.cameraPositionState = cameraPositionState;
        cameraPositionState.setMap$maps_compose_release(this.map);
    }

    public final void setContentDescription(String str) {
        this.contentDescription = str;
        this.map.setContentDescription(str);
    }

    public final void setDensity(g6.c cVar) {
        cVar.getClass();
        this.density = cVar;
    }

    public final void setLayoutDirection(g6.o oVar) {
        oVar.getClass();
        this.layoutDirection = oVar;
    }
}
