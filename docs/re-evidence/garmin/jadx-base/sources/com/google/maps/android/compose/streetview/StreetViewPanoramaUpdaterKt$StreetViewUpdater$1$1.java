package com.google.maps.android.compose.streetview;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.StreetViewPanorama;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1 implements e23.a<StreetViewPanoramaPropertiesNode> {
    final /* synthetic */ StreetViewCameraPositionState $cameraPositionState;
    final /* synthetic */ StreetViewPanoramaEventListeners $clickListeners;
    final /* synthetic */ StreetViewPanorama $streetViewPanorama;

    public StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(StreetViewCameraPositionState streetViewCameraPositionState, StreetViewPanorama streetViewPanorama, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners) {
        this.$cameraPositionState = streetViewCameraPositionState;
        this.$streetViewPanorama = streetViewPanorama;
        this.$clickListeners = streetViewPanoramaEventListeners;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final StreetViewPanoramaPropertiesNode invoke() {
        return new StreetViewPanoramaPropertiesNode(this.$cameraPositionState, this.$streetViewPanorama, this.$clickListeners);
    }
}
