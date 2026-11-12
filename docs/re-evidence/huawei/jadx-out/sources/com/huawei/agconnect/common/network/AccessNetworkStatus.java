package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* JADX INFO: loaded from: classes22.dex */
public class AccessNetworkStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AccessNetworkStatus f4841a = new AccessNetworkStatus();

    @SharedPreference(fileName = "AGConnectAccessNetwork", key = "enableAccessNetwork")
    boolean enableAccessNetwork = false;

    public boolean a() {
        AccessNetworkStatusPreference.b().a(f4841a);
        return this.enableAccessNetwork;
    }

    public void a(boolean z) {
        this.enableAccessNetwork = z;
        AccessNetworkStatusPreference.b().d(f4841a);
    }

    public static AccessNetworkStatus b() {
        return f4841a;
    }

    private AccessNetworkStatus() {
    }
}
