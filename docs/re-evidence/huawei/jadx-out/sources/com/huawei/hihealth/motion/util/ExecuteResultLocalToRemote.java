package com.huawei.hihealth.motion.util;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.health.IResultCallback;
import com.huawei.hihealth.motion.IExecuteResult;

/* JADX INFO: loaded from: classes2.dex */
public class ExecuteResultLocalToRemote extends IResultCallback.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IExecuteResult f12327b;

    public ExecuteResultLocalToRemote(IExecuteResult iExecuteResult) {
        this.f12327b = iExecuteResult;
    }

    @Override // com.huawei.health.IResultCallback
    public void onSuccess(Bundle bundle) throws RemoteException {
        IExecuteResult iExecuteResult = this.f12327b;
        if (iExecuteResult != null) {
            iExecuteResult.onSuccess(bundle);
        }
    }

    @Override // com.huawei.health.IResultCallback
    public void onFailed(Bundle bundle) throws RemoteException {
        IExecuteResult iExecuteResult = this.f12327b;
        if (iExecuteResult != null) {
            iExecuteResult.onFailed(bundle);
        }
    }

    @Override // com.huawei.health.IResultCallback
    public void onServiceException(Bundle bundle) throws RemoteException {
        IExecuteResult iExecuteResult = this.f12327b;
        if (iExecuteResult != null) {
            iExecuteResult.onServiceException(bundle);
        }
    }
}
