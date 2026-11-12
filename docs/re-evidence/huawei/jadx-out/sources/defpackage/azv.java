package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class azv extends RemoteTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f857a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource<Void> f858c;
    private final baa e;

    azv(baa baaVar, TaskCompletionSource taskCompletionSource, List<String> list, TaskCompletionSource<Void> taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = baaVar;
        this.f857a = list;
        this.f858c = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.e.f872c.c()).deferredUninstall(this.e.f871b, baa.c((Collection<String>) this.f857a), baa.a(), new e(this.e, this.f858c));
        } catch (RemoteException e2) {
            baa.e.c(e2, "deferredUninstall(%s)", this.f857a);
            this.f858c.setException(new RuntimeException(e2));
        }
    }

    static class e extends bae<Void> {
        e(baa baaVar, TaskCompletionSource<Void> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onDeferredUninstall(Bundle bundle) {
            super.onDeferredUninstall(bundle);
            this.d.setResult(null);
        }
    }
}
