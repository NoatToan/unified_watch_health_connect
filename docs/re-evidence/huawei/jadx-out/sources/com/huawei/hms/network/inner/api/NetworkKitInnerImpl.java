package com.huawei.hms.network.inner.api;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.network.embedded.l4;
import com.huawei.hms.network.embedded.m4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class NetworkKitInnerImpl {
    public static final NetworkKitInnerImpl INSTANCE = new NetworkKitInnerImpl();
    public ProtocolStackManager protocolStackManager;

    public void setProtocolStackManager(ProtocolStackManager protocolStackManager) {
        this.protocolStackManager = protocolStackManager;
    }

    public void setPolicyExecutor(PolicyNetworkService policyNetworkService) {
        getNetworkServiceManager().a(policyNetworkService);
    }

    public NetworkKitInnerImpl init(Context context, String str, Bundle bundle) {
        getNetworkServiceManager().a(context, str, bundle);
        return this;
    }

    public NetworkService getService(String str) {
        return getNetworkServiceManager().b(str);
    }

    public PolicyNetworkService getPolicyNetworkService(String str) {
        NetworkService networkServiceB = getNetworkServiceManager().b(str);
        if (networkServiceB instanceof PolicyNetworkService) {
            return (PolicyNetworkService) networkServiceB;
        }
        return null;
    }

    public l4 getNetworkBroadcastManager() {
        return l4.b();
    }

    public InterceptorNetworkService getInterceptorNetworkService(String str) {
        NetworkService networkServiceB = getNetworkServiceManager().b(str);
        if (networkServiceB instanceof InterceptorNetworkService) {
            return (InterceptorNetworkService) networkServiceB;
        }
        return null;
    }

    public List<String> getHostsInConnectionPool() {
        ProtocolStackManager protocolStackManager = this.protocolStackManager;
        return protocolStackManager != null ? protocolStackManager.getHostsInConnectionPool() : new ArrayList();
    }

    public List<NetworkService> getAll() {
        return getNetworkServiceManager().a();
    }

    private m4 getNetworkServiceManager() {
        return m4.c();
    }

    public static NetworkKitInnerImpl getInstance() {
        return INSTANCE;
    }
}
