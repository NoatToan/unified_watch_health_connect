package com.huawei.maps.offlinedata.service.device.consts;

/* JADX INFO: loaded from: classes12.dex */
public enum a {
    MAP_SUCCESS(0),
    MAP_ERROR_NO_ENOUGH_SPACE(1),
    MAP_ERROR_NO_UPDATE(2),
    MAP_ERROR_IN_USE(3),
    MAP_ERROR_DEVICE_ERROR(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17899a;

    a(int i) {
        this.f17899a = i;
    }

    public int b() {
        return this.f17899a;
    }
}
