package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.hmf.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes22.dex */
final class azu extends RemoteTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource<InstallSessionState> f855a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f856c;
    private final baa e;

    azu(baa baaVar, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource<InstallSessionState> taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = baaVar;
        this.f856c = i;
        this.f855a = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.e.f872c.c()).getSessionState(this.e.f871b, this.f856c, new d(this.e, this.f855a));
        } catch (RemoteException e) {
            baa.e.c(e, "getSessionState(%d)", Integer.valueOf(this.f856c));
            this.f855a.setException(new RuntimeException(e));
        }
    }

    static class d extends bae<InstallSessionState> {
        d(baa baaVar, TaskCompletionSource<InstallSessionState> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onGetSession(int i, Bundle bundle) {
            super.onGetSession(i, bundle);
            this.d.setResult((T) baf.a(bundle));
        }
    }
}
