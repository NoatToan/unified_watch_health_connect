package com.huawei.hms.maps.model;

import com.huawei.hms.feature.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class BitmapDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IObjectWrapper f14212a;

    public IObjectWrapper getObject() {
        return this.f14212a;
    }

    public BitmapDescriptor(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            throw new NullPointerException("Object is null");
        }
        this.f14212a = iObjectWrapper;
    }
}
