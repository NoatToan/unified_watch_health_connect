package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.compose.MapNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "cameraPositionState", "Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "panorama", "Lcom/google/android/gms/maps/StreetViewPanorama;", "eventListeners", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "<init>", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V", "getCameraPositionState", "()Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "getPanorama", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "getEventListeners", "()Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "setEventListeners", "(Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;)V", "onAttached", "", "onRemoved", "onCleared", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreetViewPanoramaPropertiesNode implements MapNode {
    public static final int $stable = 8;
    private final StreetViewCameraPositionState cameraPositionState;
    private StreetViewPanoramaEventListeners eventListeners;
    private final StreetViewPanorama panorama;

    public StreetViewPanoramaPropertiesNode(StreetViewCameraPositionState streetViewCameraPositionState, StreetViewPanorama streetViewPanorama, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        streetViewCameraPositionState.getClass();
        streetViewPanorama.getClass();
        streetViewPanoramaEventListeners.getClass();
        this.cameraPositionState = streetViewCameraPositionState;
        this.panorama = streetViewPanorama;
        this.eventListeners = streetViewPanoramaEventListeners;
        streetViewCameraPositionState.setPanorama$maps_compose_release(streetViewPanorama);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        streetViewPanoramaOrientation.getClass();
        streetViewPanoramaPropertiesNode.eventListeners.getOnClick().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        streetViewPanoramaOrientation.getClass();
        streetViewPanoramaPropertiesNode.eventListeners.getOnLongClick().invoke(streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaCamera streetViewPanoramaCamera) {
        streetViewPanoramaCamera.getClass();
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawPanoramaCamera$maps_compose_release(streetViewPanoramaCamera);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode, StreetViewPanoramaLocation streetViewPanoramaLocation) {
        streetViewPanoramaLocation.getClass();
        streetViewPanoramaPropertiesNode.cameraPositionState.setRawLocation$maps_compose_release(streetViewPanoramaLocation);
    }

    public final StreetViewCameraPositionState getCameraPositionState() {
        return this.cameraPositionState;
    }

    public final StreetViewPanoramaEventListeners getEventListeners() {
        return this.eventListeners;
    }

    public final StreetViewPanorama getPanorama() {
        return this.panorama;
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        MapNode.DefaultImpls.onAttached(this);
        this.panorama.setOnStreetViewPanoramaClickListener(new b(this));
        this.panorama.setOnStreetViewPanoramaLongClickListener(new b(this));
        this.panorama.setOnStreetViewPanoramaCameraChangeListener(new b(this));
        this.panorama.setOnStreetViewPanoramaChangeListener(new b(this));
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        this.cameraPositionState.setPanorama$maps_compose_release(null);
    }

    public final void setEventListeners(StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        streetViewPanoramaEventListeners.getClass();
        this.eventListeners = streetViewPanoramaEventListeners;
    }
}
