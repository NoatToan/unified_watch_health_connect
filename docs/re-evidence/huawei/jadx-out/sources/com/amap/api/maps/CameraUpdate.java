package com.amap.api.maps;

import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AbstractCameraUpdateMessage f3392a;

    CameraUpdate(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        this.f3392a = abstractCameraUpdateMessage;
    }

    public final AbstractCameraUpdateMessage getCameraUpdateFactoryDelegate() {
        return this.f3392a;
    }
}
