package com.huawei.android.bundlecore.install.remote;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import defpackage.bav;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DefaultTask implements Runnable, ModuleInstallSupervisor.Callback {
    private static final int INTERNAL_ERROR = -100;
    protected final ISplitInstallServiceCallback mCallback;
    protected final String mTag;

    protected abstract void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException;

    public void onCancelInstall(int i, Bundle bundle) {
    }

    public void onDeferredInstall(Bundle bundle) {
    }

    public void onDeferredUninstall(Bundle bundle) {
    }

    public void onGetSession(int i, Bundle bundle) {
    }

    public void onGetSessionStates(List<Bundle> list) {
    }

    public void onStartInstall(int i, Bundle bundle) {
    }

    public DefaultTask(String str, ISplitInstallServiceCallback iSplitInstallServiceCallback) {
        this.mTag = str;
        this.mCallback = iSplitInstallServiceCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        ModuleInstallSupervisor moduleInstallSupervisorE = bav.e();
        if (moduleInstallSupervisorE != null) {
            try {
                execute(moduleInstallSupervisorE);
                return;
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "run execute RemoteException");
                return;
            }
        }
        onError(ModuleInstallSupervisor.bundleErrorCode(-100));
    }

    @Override // com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onError(Bundle bundle) {
        ISplitInstallServiceCallback iSplitInstallServiceCallback = this.mCallback;
        if (iSplitInstallServiceCallback != null) {
            try {
                iSplitInstallServiceCallback.onError(bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onError RemoteException");
            }
        }
    }
}
