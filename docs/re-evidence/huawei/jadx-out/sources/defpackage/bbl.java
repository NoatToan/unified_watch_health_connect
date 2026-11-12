package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.android.bundlecore.install.remote.DefaultTask;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class bbl extends DefaultTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Bundle> f942c;

    public bbl(ISplitInstallServiceCallback iSplitInstallServiceCallback, List<Bundle> list) {
        super("OnStartInstallTask", iSplitInstallServiceCallback);
        this.f942c = list;
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask
    public void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException {
        moduleInstallSupervisor.startInstall(this.f942c, this);
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask, com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onStartInstall(int i, Bundle bundle) {
        super.onStartInstall(i, bundle);
        if (this.mCallback != null) {
            try {
                this.mCallback.onStartInstall(i, bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onStartInstall RemoteException");
            }
        }
    }
}
