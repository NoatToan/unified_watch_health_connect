package com.huawei.hmf.orb;

import com.huawei.hmf.orb.exception.ConnectRemoteException;

/* JADX INFO: loaded from: classes33.dex */
public interface ConnectionCallbacks {
    void onConnected();

    void onConnectionFailed(ConnectRemoteException connectRemoteException);

    void onDisconnected();
}
