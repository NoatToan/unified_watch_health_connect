package com.huawei.maps.offlinedata.service.device.tlvtools;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17964a;

    public static int a() {
        int i;
        synchronized (b.class) {
            i = (f17964a + 1) % 10000;
            f17964a = i;
        }
        return i;
    }
}
