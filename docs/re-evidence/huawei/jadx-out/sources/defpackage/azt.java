package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class azt extends RemoteTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource<Void> f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final baa f854c;

    azt(baa baaVar, TaskCompletionSource taskCompletionSource, List<String> list, TaskCompletionSource<Void> taskCompletionSource2) {
        super(taskCompletionSource);
        this.f854c = baaVar;
        this.f853b = list;
        this.f852a = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.f854c.f872c.c()).deferredInstall(this.f854c.f871b, baa.c((Collection<String>) this.f853b), baa.a(), new b(this.f854c, this.f852a));
        } catch (RemoteException e) {
            baa.e.c(e, "deferredInstall(%s)", this.f853b);
            this.f852a.setException(new RuntimeException(e));
        }
    }

    static class b extends bae<Void> {
        b(baa baaVar, TaskCompletionSource<Void> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onDeferredInstall(Bundle bundle) {
            super.onDeferredInstall(bundle);
            this.d.setResult(null);
        }
    }
}
