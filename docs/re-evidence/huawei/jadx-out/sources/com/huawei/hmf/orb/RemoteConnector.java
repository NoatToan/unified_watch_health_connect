package com.huawei.hmf.orb;

import com.huawei.hmf.orb.exception.ConnectRemoteException;
import com.huawei.hmf.services.ApiSet;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public interface RemoteConnector {
    void addConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void close();

    void connect(ConnectionCallbacks connectionCallbacks) throws ConnectRemoteException;

    Map<String, ApiSet> getApiSet();

    String getID();

    RemoteRepositoryFactory getRepositoryFactory();

    boolean isConnected();

    RemoteConnector newInstance();

    void removeConnectionCallbacks(ConnectionCallbacks connectionCallbacks);
}
