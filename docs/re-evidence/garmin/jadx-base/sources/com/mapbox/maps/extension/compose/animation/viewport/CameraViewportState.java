package com.mapbox.maps.extension.compose.animation.viewport;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.state.ViewportStateDataObserver;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/compose/animation/viewport/CameraViewportState;", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "Lkotlin/Function1;", "", "doSetCamera", "<init>", "(Lcom/mapbox/maps/CameraOptions;Le23/l;)V", "Lcom/mapbox/maps/plugin/viewport/state/ViewportStateDataObserver;", "viewportStateDataObserver", "Lcom/mapbox/common/Cancelable;", "observeDataSource", "(Lcom/mapbox/maps/plugin/viewport/state/ViewportStateDataObserver;)Lcom/mapbox/common/Cancelable;", "startUpdatingCamera", "()V", "stopUpdatingCamera", "", "toString", "()Ljava/lang/String;", "Lcom/mapbox/maps/CameraOptions;", "Le23/l;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class CameraViewportState implements ViewportState {
    private final CameraOptions cameraOptions;
    private final l<CameraOptions, Unit> doSetCamera;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraViewportState(CameraOptions cameraOptions, l<? super CameraOptions, Unit> lVar) {
        cameraOptions.getClass();
        lVar.getClass();
        this.cameraOptions = cameraOptions;
        this.doSetCamera = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDataSource$lambda$0() {
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public Cancelable observeDataSource(ViewportStateDataObserver viewportStateDataObserver) {
        viewportStateDataObserver.getClass();
        viewportStateDataObserver.onNewData(this.cameraOptions);
        return new a();
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public void startUpdatingCamera() {
        this.doSetCamera.invoke(this.cameraOptions);
    }

    @Override // com.mapbox.maps.plugin.viewport.state.ViewportState
    public void stopUpdatingCamera() {
    }

    public String toString() {
        return "CameraViewportState(targetCamera=" + this.cameraOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
