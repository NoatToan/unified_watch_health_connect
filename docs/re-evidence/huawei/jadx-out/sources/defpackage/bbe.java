package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.android.bundlecore.install.remote.DefaultTask;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes22.dex */
public final class bbe extends DefaultTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f934b;

    public bbe(ISplitInstallServiceCallback iSplitInstallServiceCallback, int i) {
        super("OnCancelInstallTask", iSplitInstallServiceCallback);
        this.f934b = i;
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask
    public void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException {
        moduleInstallSupervisor.cancelInstall(this.f934b, this);
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask, com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onCancelInstall(int i, Bundle bundle) {
        super.onCancelInstall(i, bundle);
        if (this.mCallback != null) {
            try {
                this.mCallback.onCancelInstall(i, bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onCancelInstall RemoteException");
            }
        }
    }
}
