package com.huawei.hms.kit.awareness.barrier.internal.f;

import android.util.SparseArray;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;

/* JADX INFO: loaded from: classes34.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14019a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<String> f14020b;

    public static String a(int i) {
        return f14020b.get(i, "unknown");
    }

    private e() {
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f14020b = sparseArray;
        sparseArray.put(11, "SCREEN");
        sparseArray.put(0, "HEADSET");
        sparseArray.put(1, "LOCATION");
        sparseArray.put(3, "BEHAVIOR");
        sparseArray.put(4, "TIME");
        sparseArray.put(5, "AMBIENT");
        sparseArray.put(7, "BEACON");
        sparseArray.put(9, "BLUETOOTH");
        sparseArray.put(10, "ZEN");
        sparseArray.put(12, WifiDeviceUtils.NETWORKINFO_TYPE_NAME);
        sparseArray.put(14, "APPLICATION");
        sparseArray.put(50, "COMPLEX");
        sparseArray.put(-1, "unknown");
    }
}
