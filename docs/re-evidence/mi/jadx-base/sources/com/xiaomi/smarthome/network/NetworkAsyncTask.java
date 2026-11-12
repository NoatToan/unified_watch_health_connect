package com.xiaomi.smarthome.network;

import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.IServerHandle;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NetworkAsyncTask extends IServerHandle.Stub implements Runnable {
    @Override // com.xiaomi.smarthome.core.server.IServerHandle
    public final void cancel() throws RemoteException {
        onCancel();
    }

    public void execute() {
        ThreadPoolManager.executeTask(this);
    }

    public abstract void onCancel();
}
