package com.huawei.hmf.orb;

import com.huawei.hmf.orb.exception.ConnectRemoteException;

/* JADX INFO: loaded from: classes33.dex */
public interface RemoteRepositoryFactory {
    RemoteRepository create(RemoteConnector remoteConnector) throws ConnectRemoteException;
}
