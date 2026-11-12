package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Cancelable {
    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        CameraViewportState.observeDataSource$lambda$0();
    }
}
