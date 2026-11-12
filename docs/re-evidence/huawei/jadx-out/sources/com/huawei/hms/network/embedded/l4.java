package com.huawei.hms.network.embedded;

import com.huawei.hms.network.inner.api.NetworkReceiver;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4 f15033b = new l4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<NetworkReceiver> f15034a = new CopyOnWriteArrayList();

    public void b(NetworkReceiver networkReceiver) {
        if (networkReceiver != null) {
            this.f15034a.remove(networkReceiver);
        }
    }

    public void a(NetworkReceiver networkReceiver) {
        if (networkReceiver != null) {
            this.f15034a.add(networkReceiver);
        }
    }

    public List<NetworkReceiver> a() {
        return this.f15034a;
    }

    public static l4 b() {
        return f15033b;
    }
}
