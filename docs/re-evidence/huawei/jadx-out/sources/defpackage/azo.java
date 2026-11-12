package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.hmf.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes22.dex */
final class azo extends RemoteTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final baa f846a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f847c;
    private final TaskCompletionSource<Void> e;

    azo(baa baaVar, TaskCompletionSource<Void> taskCompletionSource, int i, TaskCompletionSource<Void> taskCompletionSource2) {
        super(taskCompletionSource);
        this.f846a = baaVar;
        this.f847c = i;
        this.e = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.f846a.f872c.c()).cancelInstall(this.f846a.f871b, this.f847c, baa.a(), new e(this.f846a, this.e));
        } catch (RemoteException e2) {
            baa.e.c(e2, "cancelInstall(%d)", Integer.valueOf(this.f847c));
            this.e.setException(new RuntimeException(e2));
        }
    }

    static class e extends bae<Void> {
        e(baa baaVar, TaskCompletionSource<Void> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onCancelInstall(int i, Bundle bundle) {
            super.onCancelInstall(i, bundle);
            this.d.setResult(null);
        }
    }
}
