package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.android.bundlecore.install.remote.DefaultTask;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class bbj extends DefaultTask {
    private final List<Bundle> e;

    public bbj(ISplitInstallServiceCallback iSplitInstallServiceCallback, List<Bundle> list) {
        super("OnDeferredUninstallTask", iSplitInstallServiceCallback);
        this.e = list;
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask
    public void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException {
        moduleInstallSupervisor.deferredUninstall(this.e, this);
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask, com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onDeferredUninstall(Bundle bundle) {
        super.onDeferredUninstall(bundle);
        if (this.mCallback != null) {
            try {
                this.mCallback.onDeferredUninstall(bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onDeferredUninstall RemoteException");
            }
        }
    }
}
