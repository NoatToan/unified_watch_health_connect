package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.okhttp.OkHttpClientGlobal;
import com.huawei.hms.network.inner.api.ProtocolStackManager;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class z0 extends ProtocolStackManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClientGlobal f15646a;

    @Override // com.huawei.hms.network.inner.api.ProtocolStackManager
    public List<String> getHostsInConnectionPool() {
        if (this.f15646a == null) {
            this.f15646a = OkHttpClientGlobal.getInstance();
        }
        return this.f15646a.getHostsInConnectionPool();
    }
}
