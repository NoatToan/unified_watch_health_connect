package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallServiceCallback;
import com.huawei.android.bundlecore.install.remote.DefaultTask;
import com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes22.dex */
public class bbh extends DefaultTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f937a;

    public bbh(ISplitInstallServiceCallback iSplitInstallServiceCallback, int i) {
        super("OnGetSessionStateTask", iSplitInstallServiceCallback);
        this.f937a = i;
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask
    public void execute(ModuleInstallSupervisor moduleInstallSupervisor) throws RemoteException {
        moduleInstallSupervisor.getSessionState(this.f937a, this);
    }

    @Override // com.huawei.android.bundlecore.install.remote.DefaultTask, com.huawei.android.bundlecore.install.remote.ModuleInstallSupervisor.Callback
    public void onGetSession(int i, Bundle bundle) {
        super.onGetSession(i, bundle);
        if (this.mCallback != null) {
            try {
                this.mCallback.onGetSession(i, bundle);
            } catch (RemoteException unused) {
                LogUtil.d(this.mTag, "onGetSession RemoteException");
            }
        }
    }
}
