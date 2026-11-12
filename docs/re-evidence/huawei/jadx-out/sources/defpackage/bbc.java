package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.android.bundlecore.install.remote.DefaultTask;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class bbc extends DefaultTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Bundle> f932b;

    public bbc(ISplitInstallServiceCallback iSplitInstallServiceCallback, List<Bundle> list) {
        super("OnDeferredInstallTask", iSplitInstallServiceCallback);
        this.f932b = list;
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask
    public void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException {
        moduleInstallSupervisor.deferredInstall(this.f932b, this);
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask, com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onDeferredInstall(Bundle bundle) {
        super.onDeferredInstall(bundle);
        if (this.mCallback != null) {
            try {
                this.mCallback.onDeferredInstall(bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onDeferredInstall RemoteException");
            }
        }
    }
}
