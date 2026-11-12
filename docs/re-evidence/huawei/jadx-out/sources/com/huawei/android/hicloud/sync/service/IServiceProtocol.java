package com.huawei.android.hicloud.sync.service;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes23.dex */
public interface IServiceProtocol {
    void execute() throws RemoteException;

    void executeBatches(byte[] bArr) throws RemoteException;

    void handleTranDataTooLarge();
}
