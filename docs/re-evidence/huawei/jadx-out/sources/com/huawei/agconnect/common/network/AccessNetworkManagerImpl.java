package com.huawei.agconnect.common.network;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.common.api.HaConnector;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.huawei.agconnect.credential.internal.BaseContext;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AccessNetworkManagerImpl extends AccessNetworkManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4838c = "com.huawei.agconnect.AccessNetwork";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AccessNetworkManager.AccessNetworkCallback> f4839a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f4840b = BaseContext.b().a();

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void setAccessNetwork(boolean z) {
        a(z);
        HaConnector.getInstance().setAnalyticsEnabled(z);
        if (z) {
            a();
        }
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public boolean canAccessNetwork() {
        Bundle bundle = SafeAppInfo.safeGetApplicationInfo(this.f4840b.getPackageManager(), this.f4840b.getPackageName(), 128).metaData;
        return bundle == null || !"false".equalsIgnoreCase(String.valueOf(bundle.get(f4838c))) || AccessNetworkStatus.b().a();
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void addCallback(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (accessNetworkCallback != null) {
            this.f4839a.add(accessNetworkCallback);
            a(accessNetworkCallback);
        }
    }

    private void a(boolean z) {
        AccessNetworkStatus.b().a(z);
    }

    private void a(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (canAccessNetwork()) {
            accessNetworkCallback.onNetWorkReady();
        }
    }

    private void a() {
        Iterator<AccessNetworkManager.AccessNetworkCallback> it = this.f4839a.iterator();
        while (it.hasNext()) {
            it.next().onNetWorkReady();
        }
    }
}
