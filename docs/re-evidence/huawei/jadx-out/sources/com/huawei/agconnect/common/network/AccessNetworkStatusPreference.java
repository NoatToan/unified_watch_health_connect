package com.huawei.agconnect.common.network;

import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.CryptoUtil;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;

/* JADX INFO: loaded from: classes22.dex */
public class AccessNetworkStatusPreference {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AccessNetworkStatusPreference f4842c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPrefUtil f4843a = SharedPrefUtil.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CryptoUtil f4844b;

    public void d(AccessNetworkStatus accessNetworkStatus) {
        if (accessNetworkStatus != null) {
            this.f4843a.put("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(accessNetworkStatus.enableAccessNetwork), DefaultCrypto.class);
        }
    }

    public void c(AccessNetworkStatus accessNetworkStatus) {
        d(accessNetworkStatus);
    }

    public void c() {
        this.f4843a.remove("AGConnectAccessNetwork", "enableAccessNetwork");
    }

    public void b(AccessNetworkStatus accessNetworkStatus) {
        a(accessNetworkStatus);
    }

    public void a(AccessNetworkStatus accessNetworkStatus) {
        if (accessNetworkStatus != null) {
            accessNetworkStatus.enableAccessNetwork = ((Boolean) this.f4843a.get("AGConnectAccessNetwork", "enableAccessNetwork", Boolean.class, Boolean.valueOf(accessNetworkStatus.enableAccessNetwork), DefaultCrypto.class)).booleanValue();
        }
    }

    public void a() {
        c();
    }

    public static AccessNetworkStatusPreference b() {
        AccessNetworkStatusPreference accessNetworkStatusPreference;
        synchronized (AccessNetworkStatusPreference.class) {
            if (f4842c == null) {
                f4842c = new AccessNetworkStatusPreference();
            }
            accessNetworkStatusPreference = f4842c;
        }
        return accessNetworkStatusPreference;
    }

    private AccessNetworkStatusPreference() {
    }
}
