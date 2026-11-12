package com.huawei.hms.maps;

import com.huawei.hms.maps.model.CameraUpdateParam;

/* JADX INFO: loaded from: classes10.dex */
public final class CameraUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CameraUpdateParam f14067a;

    public CameraUpdateParam getCameraUpdateParam() {
        return this.f14067a;
    }

    @Deprecated
    public CameraUpdateParam getCameraUpdate() {
        return this.f14067a;
    }

    public CameraUpdate(CameraUpdateParam cameraUpdateParam) {
        if (cameraUpdateParam == null) {
            throw new NullPointerException("Object is null");
        }
        this.f14067a = cameraUpdateParam;
    }
}
